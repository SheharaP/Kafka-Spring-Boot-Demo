package com.mspan.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "kafkademo",
            groupId = "demo"
    )
    void listener(String data){
        System.out.println("Listener received " + data + ". yay!");
    }
}
