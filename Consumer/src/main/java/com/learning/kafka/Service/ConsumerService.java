package com.learning.kafka.Service;

import com.learning.kafka.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private String message;

    @KafkaListener(topics = "Orders", groupId = "OrdersConsumer-group")
    public void consumeMessage(Course course){

        message = course + "received course details from the kafka server";
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }

}
