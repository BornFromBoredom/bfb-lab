package com.example.hexagonal.To_do.domain.ports.in;

import com.example.hexagonal.To_do.domain.model.AditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AditionalTaskInfo getAditionalTaskInfo(long id);
}
