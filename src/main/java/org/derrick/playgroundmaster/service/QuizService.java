package org.derrick.playgroundmaster.service;

import org.derrick.playgroundmaster.entity.Quiz;

import java.util.List;

public interface QuizService {

    List<Quiz> getAllQuizzes();

    Quiz getQuizById(Integer id);

}
