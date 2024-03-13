package org.derrick.playgroundmaster.entity;

import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

class QuizTest {

    private final MongoTemplate mongoTemplate = mock(MongoTemplate.class);


    @Test
    void testMongoTemplate() {
        assertNotNull(mongoTemplate);
        Quiz quiz1 = new Quiz(1, "Multiple Choice", "Java Basics", "Test your knowledge of Java fundamentals",
                Arrays.asList("Class", "Interface", "Enum", "Object"), "Object", "Think about the fundamental building block of Java programs");

        Quiz quiz2 = new Quiz(2, "True/False", "Spring Framework", "Check your understanding of Spring concepts",
                Arrays.asList("True", "False"), "True", "Remember the core principles of the Spring Framework");

        Quiz quiz3 = new Quiz(3, "Fill in the Blank", "Database Concepts", "Fill in the blanks related to databases",
                Arrays.asList("SQL", "NoSQL", "Graph", "Document"), "SQL", "Consider the most widely used database language");

        List<Quiz> quizList = Arrays.asList(quiz1, quiz2, quiz3);
        mongoTemplate.insertAll(quizList);

        List<Quiz> all = mongoTemplate.findAll(Quiz.class);

        System.out.println(all);

    }

}