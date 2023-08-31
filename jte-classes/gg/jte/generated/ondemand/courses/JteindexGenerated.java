package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,4,5,6,7,8,9,10,11,12,13,14,15,17,19,19,20,20,21,21,21,22,22,22,23,23,23,23,24,24,25,25,25,26};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
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
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        ");
				for (var course: page.getCourses()) {
					jteOutput.writeContent("\r\n            <h1>");
					jteOutput.setContext("h1", null);
					jteOutput.writeUserContent(course.getName());
					jteOutput.writeContent("</h1>\r\n            <p>");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(course.getDescription());
					jteOutput.writeContent("</p>\r\n            <a href=\"/courses/");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(course.getId());
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\">Start learning</a>\r\n        ");
				}
				jteOutput.writeContent("\r\n    ");
			}
		}, null);
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
