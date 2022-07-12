package ru.digitalhabbits.docker.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.digitalhabbits.docker.model.Response;
import ru.digitalhabbits.docker.repository.CounterRepository;

@Service
@RequiredArgsConstructor
public class CounterService {

    private final CounterRepository repository;

    public Response getCurrentValue() {
        var entity = repository.findAll().get(0);
        return Response.builder().value(entity.getValue()).build();
    }

    public Response incrementCounter() {
        var entity = repository.findAll().get(0);
        entity.setValue(entity.getValue() + 1);
        repository.saveAndFlush(entity);
        return Response.builder().value(entity.getValue()).build();
    }

    public Response decrementCounter() {
        var entity = repository.findAll().get(0);
        var value = entity.getValue();
        if (value > 0) {
            entity.setValue(value - 1);
        }
        repository.saveAndFlush(entity);
        return Response.builder().value(entity.getValue()).build();
    }
}
