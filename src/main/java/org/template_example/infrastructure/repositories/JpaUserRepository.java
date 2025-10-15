package org.template_example.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.template_example.domain.models.User;

@Repository
public interface JpaUserRepository extends JpaRepository<User, Long> {
    // méthodes custom si besoin
}

