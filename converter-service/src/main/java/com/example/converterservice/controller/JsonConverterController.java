package com.example.converterservice.controller;

import com.example.converterservice.service.SenderService;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facade")
@RequiredArgsConstructor
public class JsonConverterController {

    private final SenderService senderService;

    @PostMapping("/form")
    public void jsonParsing(@RequestBody String json) {
        JSONObject jsonObject = new JSONObject(json);
        String xml = XML.toString(jsonObject);
        senderService.sendXML(xml);
    }

}
