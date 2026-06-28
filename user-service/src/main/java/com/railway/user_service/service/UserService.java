package com.railway.user_service.service;

import com.railway.user_service.dto.UserRegistrationRequest;
import com.railway.user_service.dto.UserRegistrationResponse;

public interface UserService {

    UserRegistrationResponse registerUser(UserRegistrationRequest request);
}
