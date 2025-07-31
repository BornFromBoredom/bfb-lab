package com.example.hexagonal.To_do.domain.ports.in;

import com.example.hexagonal.To_do.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(long id, Task updateTask);
}
