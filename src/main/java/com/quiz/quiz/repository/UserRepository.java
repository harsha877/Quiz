package com.quiz.quiz.repository;

import com.quiz.quiz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUsername (String username);
}
