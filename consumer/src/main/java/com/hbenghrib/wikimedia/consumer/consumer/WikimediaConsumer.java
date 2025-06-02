package com.hbenghrib.wikimedia.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia_stream", groupId = "wikimedia_group")
    public void consume(String message) {
        // Process the incoming message from the Wikimedia stream
        log.info(String.format("Message received -> %s", message));
    }

}
