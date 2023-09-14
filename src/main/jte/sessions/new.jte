@import org.example.hexlet.NamedRoutes
@import org.example.hexlet.dto.users.BuildUserPage
@param BuildUserPage page

<form action="/sessions" method="post">
    <div>
        <label>
            Your name
            <input type="text" name="name" placeholder="Name" required value="${page.getName()}" />
        </label>
    </div>
    <div>
        <label>
            Email
            <input type="email" required name="email" placeholder="E-mail" value="${page.getEmail()}" />
        </label>
    </div>
    <div>
        <label>
            Password
            <input type="password" placeholder="password" required name="password" />
        </label>
    </div>
    <input type="submit" value="Done" />
</form>
