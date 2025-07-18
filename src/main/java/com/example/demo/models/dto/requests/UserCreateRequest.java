package com.example.demo.models.dto.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;

@Getter
@Setter
@AllArgsConstructor
public class UserCreateRequest {
    @NotNull(message = "Name is required")
    private String name;

    @Indexed(unique = true)
    @NotNull(message = "Email is required")
    private String email;

    @NotNull(message = "Password is required")
    @Size(min = 5, max = 15, message = "Password should exists between 5 to 15 characters")
    private String password;

    @NotNull(message = "Phone is required")
    @Size(max = 10, message = "Number should not exists more than 10 characters")
    private long phone;
}
