package com.example.hexagonal.To_do.domain.ports.in;

public interface DeleteTaskUseCase {
    boolean delete(long id);
}
