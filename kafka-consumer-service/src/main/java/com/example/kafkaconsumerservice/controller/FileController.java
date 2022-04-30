package com.example.kafkaconsumerservice.controller;

import com.example.kafkaconsumerservice.dto.FileDto;
import com.example.kafkaconsumerservice.enitity.File;
import com.example.kafkaconsumerservice.mapper.mapstruct.FileMapper;
import com.example.kafkaconsumerservice.service.FileService;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/file/")
@RequiredArgsConstructor
public class FileController {
    private final FileService fileService;
    private final FileMapper fileMapper;

    @GetMapping()
    public List<FileDto> getAllFiles() {
        return fileService.findAll().stream()
                .map(fileMapper::convertFromEntityToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FileDto> getFileById(@PathVariable Long id) {
        Optional<File> maybeFile = fileService.findById(id);
        return maybeFile.map(file -> new ResponseEntity<>(
                fileMapper.convertFromEntityToDto(file),
                HttpStatus.OK
        )).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
