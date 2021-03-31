package ru.project.quiz.repository.itquiz;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.quiz.domain.entity.ituser.ITUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<ITUser, Long> {
    Optional<ITUser> findUserByUsername(String username);

    boolean existsByEmail(String email);
}