package org.example.hexlet.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.example.hexlet.model.User;

public class UserRepository {
    private static List<User> entities = new ArrayList<>();

    public static void save(User course) {
        course.setId((long) entities.size() + 1);
        entities.add(course);
    }

    public static List<User> search(String term) {
        List<User> courses = entities.stream()
                .filter(entity -> entity.getName().startsWith(term))
                .toList();
        return courses;
    }

    public static Optional<User> find(Long id) {
        User course = entities.stream()
                .filter(entity -> entity.getId() == id)
                .findAny()
                .orElse(null);
        return Optional.of(course);
    }

    public static List<User> getEntities() {
        return entities;
    }
}