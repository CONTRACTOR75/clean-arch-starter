package org.template_example.application.usecases;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.template_example.exceptions.UserNotFoundException;
import org.template_example.infrastructure.repositories.JpaUserRepository;

@Component
@RequiredArgsConstructor
public class DeleteUserUseCase {

    private final JpaUserRepository userRepository;

    public void execute(Long id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
    }
}
