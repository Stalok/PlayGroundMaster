package org.derrick.playgroundmaster.service;

import org.derrick.playgroundmaster.entity.User;
import org.derrick.playgroundmaster.mapper.MirrorMapper;
import org.derrick.playgroundmaster.mapper.PracticeMapper;
import org.derrick.playgroundmaster.service.impl.AnswerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AnswerServiceTest {
    @InjectMocks
    private AnswerServiceImpl answerService;

    @Mock
    private PracticeMapper practiceMapper;
    @Mock
    private MirrorMapper mirrorMapper;
    @BeforeEach
    void setUp() {
    }

    @Test
    void checkAnswer() {
        Boolean b = answerService.checkAnswer("SELECT * FROM practice_db.user");
        assert b;
        assertEquals(true, b);
    }

    @Test
    void checkAnswer2() {
        List<User> users = practiceMapper.selectAllUsers();
        System.out.println(users);
    }
}