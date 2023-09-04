package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,18,18,18,18,19,19,19,20,20,20,23};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content header, Content content, Content footer) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n    <head>\r\n        <meta charset=\"utf-8\" />\r\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n        <title>Hexlet Courses</title>\r\n    </head>\r\n    <body>\r\n        <p>\r\n            <a href=\"/\">Main</a>\r\n            <a href=\"/courses\">Courses</a>\r\n            <a href=\"/users\">Users</a>\r\n        </p>\r\n        ");
		jteOutput.setContext("body", null);
		jteOutput.writeUserContent(header);
		jteOutput.writeContent("\r\n        ");
		jteOutput.setContext("body", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n        ");
		jteOutput.setContext("body", null);
		jteOutput.writeUserContent(footer);
		jteOutput.writeContent("\r\n    </body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content header = (Content)params.getOrDefault("header", null);
		Content content = (Content)params.get("content");
		Content footer = (Content)params.getOrDefault("footer", null);
		render(jteOutput, jteHtmlInterceptor, header, content, footer);
	}
}
