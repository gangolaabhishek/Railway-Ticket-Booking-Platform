package com.railway.user_service.dto;

import com.railway.common.enums.Gender;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserRegistrationRequest {
    @NotBlank
    @Size(min = 2,max = 5)
    private String firstName;

    @NotBlank
    @Size(min = 2,max = 50)
    private String lastName;

    @Email
    private String email;

    @Pattern(regexp = "\\d{10}")
    private String phone;

    @NotBlank
    private String password;

    @NotNull
    private Gender gender;

    @Past
    private LocalDate dateOfBirth;
}
