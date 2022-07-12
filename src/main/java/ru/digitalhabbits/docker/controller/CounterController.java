package ru.digitalhabbits.docker.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.digitalhabbits.docker.model.Response;
import ru.digitalhabbits.docker.service.CounterService;

@RestController
@RequiredArgsConstructor
public class CounterController {

    private final CounterService service;

    @GetMapping("/")
    public ResponseEntity<Response> getCurrentValue() {
        return ResponseEntity.ok(service.getCurrentValue());
    }

    @PutMapping("/")
    public ResponseEntity<Response> incrementCounter() {
        return ResponseEntity.ok(service.incrementCounter());
    }

    @DeleteMapping("/")
    public ResponseEntity<Response> decrementCounter() {
        return ResponseEntity.ok(service.decrementCounter());
    }
}
