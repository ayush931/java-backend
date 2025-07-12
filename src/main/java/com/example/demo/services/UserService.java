package com.example.demo.services;

import com.example.demo.models.UserModel;
import com.example.demo.models.dto.requests.UserCreateRequest;
import com.example.demo.models.dto.response.ApiResponse;

// we use interface layer for making contract with service and controller layer, it hides that how the work is happening
public interface UserService {
    ApiResponse<String> registerUser(UserCreateRequest userCreateRequest);
}
