package org.template_example.utils;

import org.template_example.domain.models.User;
import org.template_example.presentation.dtos.UserRequest;
import org.template_example.presentation.dtos.UserResponse;

public class Mapper {
    public static UserResponse toResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }

    public static User toEntity(UserRequest request) {
        return User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .build();
    }
}

