package com.example.kafkaconsumerservice.service;

import com.example.kafkaconsumerservice.enitity.File;
import com.example.kafkaconsumerservice.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FileService {
    private final FileRepository fileRepository;

    public List<File> findAll() {
        return fileRepository.findAll();
    }

    public Optional<File> findById(Long id) {
        return fileRepository.findById(id);
    }
}
