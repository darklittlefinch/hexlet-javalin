@import org.example.hexlet.NamedRoutes
@import org.example.hexlet.dto.BasePage
@import gg.jte.Content
@param Content header = null
@param Content content
@param Content footer = null
@param BasePage page = null

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Hexlet Courses</title>
    </head>
    <body>
        <p>
            <a href="${NamedRoutes.mainPath()}">-- Main --</a>
            <a href="${NamedRoutes.coursesPath()}">-- Courses --</a>
            <a href="${NamedRoutes.usersPath()}">-- Users --</a>
            <a href="${NamedRoutes.newUserPath()}">-- New user --</a>
            <a href="${NamedRoutes.newCoursePath()}">-- New course --</a>
        </p>

        @if(page != null && page.getFlash() != null)
            <p>${page.getFlash()}</p>
        @endif

        ${header}
        ${content}
        ${footer}
    </body>
</html>
