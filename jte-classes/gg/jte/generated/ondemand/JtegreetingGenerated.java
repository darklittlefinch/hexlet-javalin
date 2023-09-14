package gg.jte.generated.ondemand;
import org.example.hexlet.dto.GreetingPage;
public final class JtegreetingGenerated {
	public static final String JTE_NAME = "greeting.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,15,15,15,17,17,18,18,19,19,19,21,21,26};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, GreetingPage page) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n    <head>\r\n        <meta charset=\"utf-8\" />\r\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n        <title>Hello Hexlet!</title>\r\n    </head>\r\n    <body>\r\n        <div class=\"col-lg-8 mx-auto p-4 py-md-5\">\r\n            <main>\r\n                <h1 class=\"text-body-emphasis\">Привет Хекслет!</h1>\r\n                <p>Javalin + jte</p>\r\n                ");
		if (!page.isVisited()) {
			jteOutput.writeContent("\r\n                    <p>This message is shown only once. If you want to see it again, please clean your cookies</p>\r\n                ");
		}
		jteOutput.writeContent("\r\n                ");
		if (page.getCurrentUser() != null) {
			jteOutput.writeContent("\r\n                    Welcome back, ");
			jteOutput.setContext("main", null);
			jteOutput.writeUserContent(page.getCurrentUser());
			jteOutput.writeContent(".\r\n                    To log out, delete cookie JSESSIONID from your browser.\r\n                ");
		}
		jteOutput.writeContent("\r\n            </main>\r\n        </div>\r\n    </body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		GreetingPage page = (GreetingPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
