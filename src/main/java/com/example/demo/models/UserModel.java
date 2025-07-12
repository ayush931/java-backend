package com.example.demo.models;

import com.example.demo.models.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private long phone; // it is a primitive datatype
    // private Long phone; -> it is a wrapper class
    private String profileUrl;
    private Role role = Role.USER;
    private LocalDateTime createdAt = LocalDateTime.now();  // it will automatically initialize when user created.
    private LocalDateTime updatedAt;
}
