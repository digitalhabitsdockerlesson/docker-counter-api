package ru.digitalhabbits.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalhabbits.docker.repository.entity.CounterEntity;

public interface CounterRepository extends JpaRepository<CounterEntity, Long> {
}
