package org.template_example.application.usecases;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.template_example.domain.models.User;
import org.template_example.infrastructure.repositories.JpaUserRepository;
import org.template_example.presentation.dtos.UserRequest;
import org.template_example.presentation.dtos.UserResponse;
import org.template_example.utils.Mapper;

@Component
@RequiredArgsConstructor
public class CreateUserUseCase {

    private final JpaUserRepository userRepository;

    public UserResponse execute(UserRequest request) {
        User user = Mapper.toEntity(request);
        User saved = userRepository.save(user);
        return Mapper.toResponse(saved);
    }
}
