package com.railway.user_service.controller;

import com.railway.common.response.ApiResponse;
import com.railway.user_service.dto.UserRegistrationRequest;
import com.railway.user_service.dto.UserRegistrationResponse;
import com.railway.user_service.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public ResponseEntity<ApiResponse<UserRegistrationResponse>> register(
            @Valid
            @RequestBody UserRegistrationRequest request) {

        return ResponseEntity.ok(

                ApiResponse.<UserRegistrationResponse>builder()

                        .success(true)

                        .message("User registered successfully")

                        .data(userService.registerUser(request))

                        .build()

        );
    }
}
