package com.example.kafkaconsumerservice.dto;

import lombok.Data;

@Data
public class FileDto {
    private DocumentDto document;
    private String sendingDateTime;
    private String version;
    private String fileId;
}
