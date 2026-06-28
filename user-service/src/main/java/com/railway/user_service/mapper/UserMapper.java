package com.railway.user_service.mapper;

import com.railway.user_service.dto.UserRegistrationRequest;
import com.railway.user_service.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRegistrationRequest request);
}
