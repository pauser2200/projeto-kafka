package com.paulo.strprducer.resouces;

import com.paulo.strprducer.services.StringProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping(value = "/producer")
@RestController
public class StringProducerResource {

    private final StringProducerService stringProducerService;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message) {
        stringProducerService.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
