@import gg.jte.Content
@param Content header = null
@param Content content
@param Content footer = null

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Hexlet Courses</title>
    </head>
    <body>
        <p>
            <a href="/">Main</a>
            <a href="/courses">Courses</a>
            <a href="/users">Users</a>
            <a href="/users/new">New user</a>
        </p>
        ${header}
        ${content}
        ${footer}
    </body>
</html>
