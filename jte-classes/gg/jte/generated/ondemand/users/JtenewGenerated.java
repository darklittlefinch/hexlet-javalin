package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.users.BuildUserPage;
public final class JtenewGenerated {
	public static final String JTE_NAME = "users/new.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,3,5,5,6,6,7,7,7,8,8,9,9,11,11,17,17,17,17,17,17,17,17,17,23,23,23,23,23,23,23,23,23,40};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, BuildUserPage page) {
		jteOutput.writeContent("\r\n");
		if (page.getErrors() != null) {
			jteOutput.writeContent("\r\n    <ul>\r\n        ");
			for (var validator: page.getErrors().values()) {
				jteOutput.writeContent("\r\n            ");
				for (var error: validator) {
					jteOutput.writeContent("\r\n                <li>");
					jteOutput.setContext("li", null);
					jteOutput.writeUserContent(error.getMessage());
					jteOutput.writeContent("</li>\r\n            ");
				}
				jteOutput.writeContent("\r\n        ");
			}
			jteOutput.writeContent("\r\n    </ul>\r\n");
		}
		jteOutput.writeContent("\r\n\r\n<form action=\"/users\" method=\"post\">\r\n    <div>\r\n        <label>\r\n            Your name\r\n            <input type=\"text\" name=\"name\"");
		var __jte_html_attribute_0 = page.getName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" />\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Email\r\n            <input type=\"email\" required name=\"email\"");
		var __jte_html_attribute_1 = page.getEmail();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" />\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Password\r\n            <input type=\"password\" required name=\"password\" />\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Confirm Password\r\n            <input type=\"password\" required name=\"passwordConfirmation\" />\r\n        </label>\r\n    </div>\r\n    <input type=\"submit\" value=\"Done\" />\r\n</form>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		BuildUserPage page = (BuildUserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
