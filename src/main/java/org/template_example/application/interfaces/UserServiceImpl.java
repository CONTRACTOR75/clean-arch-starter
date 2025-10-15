package org.template_example.application.interfaces;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.template_example.application.interfaces.UserService;
import org.template_example.application.usecases.CreateUserUseCase;
import org.template_example.application.usecases.DeleteUserUseCase;
import org.template_example.application.usecases.GetUserByIdUseCase;
import org.template_example.application.usecases.UpdateUserUseCase;
import org.template_example.presentation.dtos.UserRequest;
import org.template_example.presentation.dtos.UserResponse;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final GetUserByIdUseCase getUserByIdUseCase;
    private final CreateUserUseCase createUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;

    @Override
    public UserResponse getUserById(Long id) {
        return getUserByIdUseCase.execute(id);
    }

    @Override
    public UserResponse createUser(UserRequest request) {
        return createUserUseCase.execute(request);
    }

    @Override
    public UserResponse updateUser(Long id, UserRequest request) {
        return updateUserUseCase.execute(id, request);
    }

    @Override
    public void deleteUser(Long id) {
        deleteUserUseCase.execute(id);
    }
}
