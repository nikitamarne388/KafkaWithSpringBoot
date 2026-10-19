package com.learning.kafka.Controller;

import com.learning.kafka.Service.PublisherService;
import com.learning.kafka.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaPublisherController {

    @Autowired
    PublisherService publisherService;

    @PostMapping("/add-course")
    public ResponseEntity<String> addCourse(@RequestBody Course course) {
        String response = publisherService.sendMessage(course);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
