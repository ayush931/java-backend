package com.example.demo.models.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor

public class ApiResponse<T> {
    private HttpStatus status;
    private String message;
    private T data;
}
