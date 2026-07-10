package com.fitness.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email is required")
    @Email(message = "invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6 , message = "Password is atleast 6 chars")
    private String password;


    private String firstName;
    private String lastName;
}
