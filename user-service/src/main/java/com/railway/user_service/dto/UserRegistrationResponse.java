package com.railway.user_service.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class UserRegistrationResponse {
    private UUID userId;

    private String message;
}
