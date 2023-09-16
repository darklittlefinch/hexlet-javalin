@import org.example.hexlet.NamedRoutes

@template.layout.page(
    header = @`
        <h1>New course</h1>
    `,

    content = @`
        <form action="${NamedRoutes.coursesPath()}" method="post">
            <div>
                <label>
                    Name
                    <input type="text" required name="name" />
                </label>
            </div>
            <div>
                <label>
                    Description
                    <input type="description" required name="description" />
                </label>
            </div>
            <input type="submit" value="Done" />
        </form>
    `
)
