package org.derrick.playgroundmaster.controller;

import lombok.AllArgsConstructor;
import org.derrick.playgroundmaster.entity.Quiz;
import org.derrick.playgroundmaster.service.QuizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/quiz")
public class QuizController {
    private final QuizService quizService;

    @GetMapping
    public List<Quiz> getQuiz() {
        return quizService.getAllQuizzes();
    }
}
