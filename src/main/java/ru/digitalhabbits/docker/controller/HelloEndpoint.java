package ru.digitalhabbits.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloEndpoint {

    @GetMapping
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello, World!");
    }
}
