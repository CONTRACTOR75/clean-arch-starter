package org.template_example.application.usecases;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.template_example.domain.models.User;
import org.template_example.exceptions.UserNotFoundException;
import org.template_example.infrastructure.repositories.JpaUserRepository;
import org.template_example.presentation.dtos.UserRequest;
import org.template_example.presentation.dtos.UserResponse;
import org.template_example.utils.Mapper;

@Component
@RequiredArgsConstructor
public class UpdateUserUseCase {

    private final JpaUserRepository userRepository;

    public UserResponse execute(Long id, UserRequest request) {
        User existing = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        existing.setUsername(request.getUsername());
        existing.setEmail(request.getEmail());

        User updated = userRepository.save(existing);
        return Mapper.toResponse(updated);
    }
}
