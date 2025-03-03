package com.example.skillswap.models;

import lombok.Getter;

@Getter
public enum RequestStatus {
    PENDING ("Запрос ожидает подтверждения"),
    ACCEPTED ("Запрос принят"),
    DECLINED ("Запрос отклонен");
    private final String description;

    RequestStatus(String description) {
        this.description = description;
    }
}
