package com.example.kafkaconsumerservice.service;

import com.example.kafkaconsumerservice.enitity.MainInfo;
import com.example.kafkaconsumerservice.repository.MainInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MainInfoService {

    private final MainInfoRepository mainInfoRepository;

    public List<MainInfo> findAll() {
        return mainInfoRepository.findAll();
    }
}
