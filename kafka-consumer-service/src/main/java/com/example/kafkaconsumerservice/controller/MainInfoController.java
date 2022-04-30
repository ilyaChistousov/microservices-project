package com.example.kafkaconsumerservice.controller;

import com.example.kafkaconsumerservice.dto.MainInfoDto;
import com.example.kafkaconsumerservice.mapper.mapstruct.MainInfoMapper;
import com.example.kafkaconsumerservice.service.MainInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/main-info")
@RequiredArgsConstructor
public class MainInfoController {

    private final MainInfoMapper mainInfoMapper;
    private final MainInfoService mainInfoService;

    @GetMapping
    public List<MainInfoDto> getAllMainInfo() {
        return mainInfoService.findAll().stream()
                .map(mainInfoMapper::convertFromEntityToDto)
                .collect(Collectors.toList());
    }
}
