package com.example.demo.controllers;

import com.example.demo.models.dto.requests.UserCreateRequest;
import com.example.demo.models.dto.response.ApiResponse;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "*")
public class UserControllers {
    // reference of service -> service handles all business logic of the api.
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ApiResponse<String> registerUser(@RequestBody UserCreateRequest request){
        return userService.registerUser(request);
    };
}
