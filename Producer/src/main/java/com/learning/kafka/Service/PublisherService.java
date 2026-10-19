package com.learning.kafka.Service;

import com.learning.kafka.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    @Autowired
    private KafkaTemplate<String, Course> kafkaTemplate;

    public String sendMessage(Course course){
        kafkaTemplate.send("Orders","course", course);
        return "Course message sent to kafka server";
    }
}
