package gg.jte.generated.ondemand.sessions;
import org.example.hexlet.NamedRoutes;
import org.example.hexlet.dto.users.BuildUserPage;
public final class JtenewGenerated {
	public static final String JTE_NAME = "sessions/new.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,8,8,8,8,8,8,8,8,8,8,14,14,14,14,14,14,14,14,14,25};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, BuildUserPage page) {
		jteOutput.writeContent("\r\n<form action=\"/sessions\" method=\"post\">\r\n    <div>\r\n        <label>\r\n            Your name\r\n            <input type=\"text\" name=\"name\" placeholder=\"Name\" required");
		var __jte_html_attribute_0 = page.getName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" />\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Email\r\n            <input type=\"email\" required name=\"email\" placeholder=\"E-mail\"");
		var __jte_html_attribute_1 = page.getEmail();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" />\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Password\r\n            <input type=\"password\" placeholder=\"password\" required name=\"password\" />\r\n        </label>\r\n    </div>\r\n    <input type=\"submit\" value=\"Done\" />\r\n</form>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		BuildUserPage page = (BuildUserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
