package com.learning.kafka.Controller;

import com.learning.kafka.Service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaConsumerController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/getCourse")
    public ResponseEntity<String> getCourse() {
        System.out.println("Inside the consumer Controller");
        String response = consumerService.getMessage();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
