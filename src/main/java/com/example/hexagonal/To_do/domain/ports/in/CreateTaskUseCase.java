package com.example.hexagonal.To_do.domain.ports.in;

import com.example.hexagonal.To_do.domain.model.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
