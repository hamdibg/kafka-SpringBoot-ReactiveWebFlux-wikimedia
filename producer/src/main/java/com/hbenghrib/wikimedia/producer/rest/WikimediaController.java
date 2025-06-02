package com.hbenghrib.wikimedia.producer.rest;

import com.hbenghrib.wikimedia.producer.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {

    private final WikimediaStreamConsumer
            wikimediaStreamConsumer;
    

    @GetMapping
    public void startPublishing() {
        wikimediaStreamConsumer.consumeStreamAndPublish();
    }
}
