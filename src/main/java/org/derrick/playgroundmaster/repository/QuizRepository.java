package org.derrick.playgroundmaster.repository;

import org.derrick.playgroundmaster.entity.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuizRepository extends MongoRepository<Quiz, Integer> {
    // You can define custom query methods here if needed
}