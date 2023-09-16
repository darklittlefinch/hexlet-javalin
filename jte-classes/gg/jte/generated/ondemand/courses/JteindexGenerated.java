package gg.jte.generated.ondemand.courses;
import org.example.hexlet.NamedRoutes;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,5,6,7,8,9,10,11,12,13,14,15,16,18,26,26,27,27,27,27,27,27,27,27,27,28,28,28,28,28,28,28,28,28,31,31,31,31,32,32,33,33,33,34,34,34,35,35,36,36,36,36,38,38,38,39};
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
				jteOutput.writeContent("\r\n        <form");
				var __jte_html_attribute_0 = NamedRoutes.coursesPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"get\">\r\n            <input type=\"search\" name=\"term\"");
				var __jte_html_attribute_1 = page.getTerm();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n            <input type=\"submit\" value=\"Search courses...\">\r\n        </form>\r\n    ");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        ");
				for (var course: page.getCourses()) {
					jteOutput.writeContent("\r\n            <h1>");
					jteOutput.setContext("h1", null);
					jteOutput.writeUserContent(course.getName());
					jteOutput.writeContent("</h1>\r\n            <p>");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(course.getDescription());
					jteOutput.writeContent("</p>\r\n        ");
				}
				jteOutput.writeContent("\r\n    ");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <a href=\"https://github.com/darklittlefinch/hexlet-javalin\">Project on GitHub</a>\r\n    ");
			}
		}, page);
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
