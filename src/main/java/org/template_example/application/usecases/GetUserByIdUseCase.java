package org.template_example.application.usecases;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.template_example.domain.models.User;
import org.template_example.exceptions.UserNotFoundException;
import org.template_example.infrastructure.repositories.JpaUserRepository;
import org.template_example.presentation.dtos.UserResponse;
import org.template_example.utils.Mapper;

@Service
@RequiredArgsConstructor
public class GetUserByIdUseCase {

    private final JpaUserRepository userRepository;

    public UserResponse execute(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
        return Mapper.toResponse(user);
    }
}

