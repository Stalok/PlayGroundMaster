package org.derrick.playgroundmaster.service.impl;

import org.derrick.playgroundmaster.entity.Quiz;
import org.derrick.playgroundmaster.repository.QuizRepository;
import org.derrick.playgroundmaster.service.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {
    private final QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz getQuizById(Integer id) {
        return quizRepository.findById(id).orElse(null);
    }

}
