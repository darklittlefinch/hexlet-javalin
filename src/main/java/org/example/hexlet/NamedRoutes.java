package org.example.hexlet;

public class NamedRoutes {
    public static String mainPath() {
        return "/";
    }

    public static String helloPath() {
        return "/hello";
    }

    public static String usersPath() {
         return "/users";
     }

    public static String coursesPath() {
        return "/courses";
    }

    public static String newUserPath() {
        return usersPath() + "/new";
    }

    public static String userPath(Long id) {
        return userPath(String.valueOf(id));
    }

    public static String userPath(String id) {
        return usersPath() + "/" + id;
    }

    public static String postPath(Long userId, Long postId) {
        return postPath(String.valueOf(userId), String.valueOf(postId));
    }

    public static String postPath(String userId, String postId) {
        return usersPath() + "/" + userId + "/post/" + postId;
    }

    public static String coursePath(Long id) {
        return coursePath(String.valueOf(id));
    }

    public static String coursePath(String id) {
        return coursesPath() + "/" + id;
    }

    public static String sessionsPath() {
        return "/sessions";
    }

    public static String sessionsBuildPath() {
        return sessionsPath() + "/build";
    }
}
