package com.example.kafkaconsumerservice.repository;

import com.example.kafkaconsumerservice.enitity.MainInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MainInfoRepository extends JpaRepository<MainInfo, Long> {

    @Query("select m " +
            "from main_info m " +
            "join fetch m.originalDocInfo " +
            "join fetch m.participantInfo")
    List<MainInfo> findAll();
}
