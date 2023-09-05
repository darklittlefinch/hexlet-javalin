@import org.example.hexlet.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
header = @`
    <h1>Users</h1>
`,

content = @`
    @for(var user: page.getUsers())
        <h1>${user.getName()}</h1>
        <p>${user.getEmail()}</p>
    @endfor
`,

footer = @`
    <a href="https://github.com/darklittlefinch/hexlet-javalin">Project on GitHub</a>
`
)
