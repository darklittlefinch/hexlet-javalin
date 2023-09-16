package gg.jte.generated.ondemand;
import org.example.hexlet.dto.GreetingPage;
public final class JtegreetingGenerated {
	public static final String JTE_NAME = "greeting.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,27,29,29,34,34,36,36,37,37,38,38,38,40,40,43,43,43};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, GreetingPage page) {
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n\r\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, null, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <div class=\"col-lg-8 mx-auto p-4 py-md-5\">\r\n            <main>\r\n                <h1 class=\"text-body-emphasis\">Привет Хекслет!</h1>\r\n                <p>Javalin + jte</p>\r\n                ");
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
				jteOutput.writeContent("\r\n            </main>\r\n        </div>\r\n    ");
			}
		}, null, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		GreetingPage page = (GreetingPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
