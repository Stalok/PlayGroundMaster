package org.derrick.playgroundmaster.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("quiz")
public record Quiz(@Id Integer id, @Field String type, @Field String title, @Field String description, @Field List<String> choices, @Field String answer, @Field String hint) {
}
