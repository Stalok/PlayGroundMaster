package org.derrick.playgroundmaster.entity;

public record User(int id, String name, int age) {
    public User {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
