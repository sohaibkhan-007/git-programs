package com.scm.forms;

import org.springframework.format.annotation.NumberFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserForm {

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3)
    private String name;

    @Email(message = "Invalid Email Address")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "password is required")
    @Size(min = 6, message = "Minimum 6 characters is required")
    private String password;

    @NotBlank(message = "about is required")
    @Size(max = 50)
    private String about;

    @NumberFormat
    @Size(min = 10, max = 10, message = "invalid Phone number")
    private String phoneNumber;
}
