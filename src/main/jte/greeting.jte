@import org.example.hexlet.dto.GreetingPage
@param GreetingPage page

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Hello Hexlet!</title>
    </head>
    <body>
        <div class="col-lg-8 mx-auto p-4 py-md-5">
            <main>
                <h1 class="text-body-emphasis">Привет Хекслет!</h1>
                <p>Javalin + jte</p>
                @if(!page.isVisited())
                    <p>This message is shown only once. If you want to see it again, please clean your cookies</p>
                @endif
                @if(page.getCurrentUser() != null)
                    Welcome back, ${page.getCurrentUser()}.
                    To log out, delete cookie JSESSIONID from your browser.
                @endif
            </main>
        </div>
    </body>
</html>
