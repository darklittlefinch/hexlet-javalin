@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page

<%--<html lang="en">--%>
<%--<head>--%>
<%--    <title>Хекслет</title>--%>
<%--</head>--%>
<%--    <body>--%>
<%--        <main>--%>
<%--            <h1>${page.getCourse().getName()}</h1>--%>
<%--            <p>${page.getCourse().getDescription()}</p>--%>
<%--        </main>--%>
<%--    </body>--%>
<%--</html>--%>

@template.layout.page(
    content = @`
        <h1>${page.getCourse().getName()}</h1>
        <p>${page.getCourse().getDescription()}</p>
    `,
    footer = @`
        <a href="https://github.com/darklittlefinch/hexlet-javalin">Project on GitHub</a>
    `
)
