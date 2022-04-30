package com.example.converterservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("receiver")
@Component
public interface FeignSenderXMLClient {

    @PostMapping("send/xml")
    String sendXml(String xml);
}
