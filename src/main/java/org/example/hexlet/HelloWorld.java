package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;

import io.javalin.validation.ValidationException;
import org.example.hexlet.controller.SessionController;
import org.example.hexlet.dto.GreetingPage;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.courses.Data;
import org.example.hexlet.dto.users.BuildUserPage;
import org.example.hexlet.dto.users.UsersPage;
import org.example.hexlet.model.Course;
import org.example.hexlet.model.User;
import org.example.hexlet.repository.UserRepository;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class HelloWorld {
    private static final List<Map<String, Object>> DATA = Data.getData();

    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        app.get(NamedRoutes.helloPath(), ctx -> {
            var name = ctx.queryParamAsClass("name", String.class).getOrDefault("World");
            ctx.result("Hello, " + name + "!");
        });

        app.get(NamedRoutes.newUserPath(), ctx -> {
            var page = new BuildUserPage();
            ctx.render("users/new.jte", Collections.singletonMap("page", page));
        });

        app.post(NamedRoutes.usersPath(), ctx -> {
            var name = ctx.formParam("name").trim();
            var email = ctx.formParam("email").toLowerCase().trim();
//            var password = ctx.formParam("password");
//            var passwordConfirmation = ctx.formParam("passwordConfirmation");

            try {
                var passwordConfirmation = ctx.formParam("passwordConfirmation");
                var password = ctx.formParamAsClass("password", String.class)
                        .check(value -> value.equals(passwordConfirmation), "Passwords are not the same")
                        .check(value -> value.length() > 6, "Password must contain more than 6 symbols")
                        .get();

                var user = new User(name, email, password);
                UserRepository.save(user);
                ctx.redirect(NamedRoutes.usersPath());
            } catch (ValidationException e) {
                var page = new BuildUserPage(name, email, e.getErrors());
                ctx.render("users/new.jte", Collections.singletonMap("page", page));
            }
        });

        app.get(NamedRoutes.userPath("{userId}"), ctx -> {
//            var id = ctx.pathParam("userId");
//            var escapedId = StringEscapeUtils.escapeHtml4(id);
//            ctx.contentType("text/html");
//            ctx.result(escapedId);
            String untrustedHTML = ctx.pathParam("userId");
        });

        app.get(NamedRoutes.postPath("{userId}", "{postId}"), ctx -> {
            ctx.result("User ID: " + ctx.pathParam("userId"));
            ctx.result("Post ID: " + ctx.pathParam("postId"));
        });

        app.get(NamedRoutes.usersPath(), ctx -> {
            List<User> users = UserRepository.getEntities();
            UsersPage page = new UsersPage(users);
            ctx.render("users/index.jte", Collections.singletonMap("page", page));
        });

        app.get(NamedRoutes.mainPath(), ctx -> {
            var visited = Boolean.valueOf(ctx.cookie("visited"));
            var page = new GreetingPage(visited, ctx.sessionAttribute("currentUser"));
            ctx.render("greeting.jte", Collections.singletonMap("page", page));
            ctx.cookie("visited", String.valueOf(true));
        });

        app.get(NamedRoutes.coursePath("{id}"), ctx -> {
            var id = ctx.pathParam("id");

            var courseMap = Data.getCourse(Long.parseLong(id));
            if (courseMap == null) {
                throw new NotFoundResponse("Course not found");
            }

            var course = new Course(courseMap);
            var page = new CoursePage(course);

            ctx.render("courses/show.jte", Collections.singletonMap("page", page));
        });

        app.get(NamedRoutes.coursesPath(), ctx -> {
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

        app.get(NamedRoutes.sessionsBuildPath(), SessionController::build);
        app.post(NamedRoutes.sessionsPath(), SessionController::create);
        app.delete(NamedRoutes.sessionsPath(), SessionController::destroy);

        app.start(7070);
    }
}
