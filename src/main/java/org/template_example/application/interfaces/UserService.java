package org.template_example.application.interfaces;

import org.template_example.presentation.dtos.UserRequest;
import org.template_example.presentation.dtos.UserResponse;

public interface UserService {
    UserResponse getUserById(Long id);
    UserResponse createUser(UserRequest request);
    UserResponse updateUser(Long id, UserRequest request);
    void deleteUser(Long id);
}

