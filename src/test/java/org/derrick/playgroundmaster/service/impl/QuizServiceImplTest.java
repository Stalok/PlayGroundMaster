package org.derrick.playgroundmaster.service.impl;

import org.derrick.playgroundmaster.entity.Quiz;
import org.derrick.playgroundmaster.repository.QuizRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuizServiceImplTest {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuizServiceImpl quizServiceImpl;


    @Test
    void getAllQuizzes() {
        for (Quiz quiz : quizServiceImpl.getAllQuizzes()) {
            System.out.println(quiz);

        }

    }

    @Test
    void getQuizById() {
    }

    @Test
    void deleteQuiz() {
    }
}