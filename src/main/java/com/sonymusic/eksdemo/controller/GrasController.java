package com.sonymusic.eksdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class GrasController {

    @GetMapping
    String welcome() {
        System.out.println("Received welcome request");
        return "Welcome to GRAS!";
    }

    @GetMapping("/features")
    List<String> features() {
        System.out.println("Received features request");
        return List.of("orm", "interceptors", "evaluators", "channels");
    }
}
