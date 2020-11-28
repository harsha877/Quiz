package com.quiz.quiz.repository;

import com.quiz.quiz.entity.Question;
import com.quiz.quiz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsRepository extends JpaRepository<Question,Long> {
}
