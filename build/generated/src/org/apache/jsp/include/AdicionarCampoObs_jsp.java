package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdicionarCampoObs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html charset=UTF-8;");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        var max_fields = 1; //maximum input boxes allowed\r\n");
      out.write("        var wrapper = $(\".input_fields_wrap\"); //Fields wrapper\r\n");
      out.write("        var add_button = $(\".add_field_button\"); //Add button ID\r\n");
      out.write("\r\n");
      out.write("        var x = 0; //initlal text box count\r\n");
      out.write("        $(add_button).click(function (e) { //on add input button click\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            if (x < max_fields) { //max input box allowed\r\n");
      out.write("                x++; //text box increment\r\n");
      out.write("                $(wrapper).append('<div class=\"input_fields_wrap\"><div class=\"form-group\"><label class=\"inline col-xs-1 col-xs-12\"><span class=\"lbl\"><strong>Obs:</strong></span></label><label class =\"col-xs-8 col-xs-12\"><input type=\"text\" id=\"form-field-1\" class=\"col-sm-12 col-xs-12\" name=\"dsObservação\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dsObservação}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Observação\" required=\"required\"></label><a href=\"#\" class=\"red remove_field\" title=\"remover campos\"><span class=\"label label-danger arrowed-right\"><i class=\" glyphicon glyphicon-minus-sign\"></i></span></a></div></div>'); // add input box    \r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(wrapper).on(\"click\", \".remove_field\", function (e) { //user click on remove text\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            $(this).parent('div').remove();\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
