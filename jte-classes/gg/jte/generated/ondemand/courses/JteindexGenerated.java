package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,9,9,9,10,10,10,11,11,11,12,12,16};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\r\n<html lang=\"en\">\r\n<head>\r\n    <title>Хекслет</title>\r\n</head>\r\n<body>\r\n<main>\r\n    ");
		for (var course: page.getCourses()) {
			jteOutput.writeContent("\r\n        <h1>");
			jteOutput.setContext("h1", null);
			jteOutput.writeUserContent(course.getName());
			jteOutput.writeContent("</h1>\r\n        <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(course.getDescription());
			jteOutput.writeContent("</p>\r\n    ");
		}
		jteOutput.writeContent("\r\n</main>\r\n</body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
