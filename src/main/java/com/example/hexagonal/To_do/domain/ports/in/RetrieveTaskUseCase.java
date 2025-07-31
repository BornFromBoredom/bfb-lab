package com.example.hexagonal.To_do.domain.ports.in;

import com.example.hexagonal.To_do.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTask(Long id);
    List<Task> getAllTasks();
}
