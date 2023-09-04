@import org.example.hexlet.dto.courses.CoursesPage
@param CoursesPage page

<%--<html lang="en">--%>
<%--    <head>--%>
<%--        <title>Хекслет</title>--%>
<%--    </head>--%>
<%--    <body>--%>
<%--        <main>--%>
<%--            @for(var course: page.getCourses())--%>
<%--                <h1>${course.getName()}</h1>--%>
<%--                <p>${course.getDescription()}</p>--%>
<%--            @endfor--%>
<%--        </main>--%>
<%--    </body>--%>
<%--</html>--%>

@template.layout.page(
    header = @`
        <form action="/courses" method="get">
            <input type="search" name="term" value="${page.getTerm()}">
            <input type="submit" value="Search courses...">
        </form>
    `,

    content = @`
        @for(var course: page.getCourses())
            <h1>${course.getName()}</h1>
            <p>${course.getDescription()}</p>
        @endfor
    `,

    footer = @`
        <a href="https://github.com/darklittlefinch/hexlet-javalin">Project on GitHub</a>
    `
)
