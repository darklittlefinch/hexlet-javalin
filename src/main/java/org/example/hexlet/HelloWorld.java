package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;

import org.apache.commons.text.StringEscapeUtils;

import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.courses.Data;
import org.example.hexlet.model.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HelloWorld {
    private static final List<Map<String, Object>> DATA = Data.getData();

    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

//        app.get("/", ctx -> ctx.result("Hello World"));

        app.get("/users", ctx -> ctx.result("GET /users"));
        app.post("/users", ctx -> ctx.result("POST /users"));

        app.get("/hello", ctx -> {
            var name = ctx.queryParamAsClass("name", String.class).getOrDefault("World");
            ctx.result("Hello, " + name + "!");
        });

        app.get("/users/{userId}", ctx -> {
//            var id = ctx.pathParam("userId");
//            var escapedId = StringEscapeUtils.escapeHtml4(id);
//            ctx.contentType("text/html");
//            ctx.result(escapedId);
            String untrustedHTML = ctx.pathParam("userId");

        });

        app.get("/users/{userId}/post/{postId}", ctx -> {
            ctx.result("User ID: " + ctx.pathParam("userId"));
            ctx.result("Post ID: " + ctx.pathParam("postId"));
        });

        app.get("/", ctx -> ctx.render("greeting.jte"));

        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParam("id");

            var courseMap = Data.getCourse(Long.parseLong(id));
            if (courseMap == null) {
                throw new NotFoundResponse("Course not found");
            }

            var course = new Course(courseMap);
            var page = new CoursePage(course);

            ctx.render("courses/show.jte", Collections.singletonMap("page", page));
        });

        app.get("/courses", ctx -> {
            var term = ctx.queryParam("term");
            List<Course> courses;

            if (term != null) {
                courses = Data.getCoursesList(DATA).stream()
                        .filter(course -> course.getName().contains(term) || course.getDescription().contains(term))
                        .toList();
            } else {
                courses = Data.getCoursesList(DATA);
            }

            var coursesPage = new CoursesPage(courses, term);
            ctx.render("courses/index.jte", Collections.singletonMap("page", coursesPage));
        });

        app.start(7070);
    }
}
