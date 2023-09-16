package org.example.hexlet.controller;

import io.javalin.http.Context;
import org.example.hexlet.NamedRoutes;
import org.example.hexlet.dto.users.BuildUserPage;
import org.example.hexlet.model.User;
import org.example.hexlet.repository.UserRepository;

import java.util.Collections;

public class SessionController {
    public static void build(Context ctx) {
        var page = new BuildUserPage();
        ctx.render("sessions/new.jte", Collections.singletonMap("page", page));
    }

    public static void create(Context ctx) {
        var name = ctx.formParam("name").trim();
        var email = ctx.formParam("email").trim().toLowerCase();
        var password = ctx.formParam("password");

        var user = new User(name, email, password);
        UserRepository.save(user);

        ctx.sessionAttribute("currentUser", name);
        ctx.redirect(NamedRoutes.mainPath());
    }

    public static void destroy(Context ctx) {
        ctx.sessionAttribute("currentUser", null);
        ctx.redirect(NamedRoutes.mainPath());
    }
}
