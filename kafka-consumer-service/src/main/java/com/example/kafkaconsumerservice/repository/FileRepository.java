package com.example.kafkaconsumerservice.repository;

import com.example.kafkaconsumerservice.enitity.File;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

public interface FileRepository extends JpaRepository<File, Long> {

    @Query("select f from file f ")
    List<File> findAll();

    @Query("select f from file f " +
            "where f.id = :id")
    Optional<File> findById(Long id);
}
