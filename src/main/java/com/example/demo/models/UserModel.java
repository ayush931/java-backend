package com.example.demo.models;

import com.example.demo.models.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor

public class UserModel {
    private String name;
    private String email;
    private String password;
    private long phone; // it is a primitive datatype
    // private Long phone; -> it is a wrapper class
    private String profileUrl;
    private Role role;
    private LocalDateTime createdAt = LocalDateTime.now();  // it will automatically initialize when user created.
    private LocalDateTime updatedAt;
}
