package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<head>\r\n");
      out.write("   \r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"Content-Language\" content=\"pt-br\">\r\n");
      out.write("    \r\n");
      out.write("    <title>SGPatri - Sistema de Gestão das Áreas Públicas</title>\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("    <meta name=\"description\" content=\"Common form elements and layouts\" />\r\n");
      out.write("    <meta name=\"description\" content=\"Dynamic tables and grids using jqGrid plugin\">\r\n");
      out.write("    <meta name=\"description\" content=\"Restyling jQuery UI Widgets and Elements\" />\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!--favicon do navegador -->\r\n");
      out.write("    <link rel=\"icon\" href=\"img/logo_c.png\" type=\"image/ico\" />\r\n");
      out.write("       \r\n");
      out.write("    \r\n");
      out.write("    <!--my style -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\" />\r\n");
      out.write("    \r\n");
      out.write("    <!-- bootstrap & fontawesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/font-awesome/4.5.0/css/font-awesome.min.css\" />\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- page specific plugin styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/jquery-ui.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/chosen.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap-datepicker3.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap-timepicker.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/daterangepicker.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap-colorpicker.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/ui.jqgrid.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- text fonts -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fonts.googleapis.com.css\" />\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- ace styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/ace.min.css\" class=\"ace-main-stylesheet\" id=\"main-ace-style\" />\r\n");
      out.write("\r\n");
      out.write("    <!--[if lte IE 9]>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/ace-part2.min.css\" class=\"ace-main-stylesheet\" />\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/ace-skins.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/ace-rtl.min.css\" />\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    <!--[if lte IE 9]>\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"assets/css/ace-ie.min.css\" />\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- inline styles related to this page -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ace settings handler -->\r\n");
      out.write("    <script src=\"assets/js/ace-extra.min.js\"></script>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->\r\n");
      out.write("\r\n");
      out.write("    <!--[if lte IE 8]>\r\n");
      out.write("        <script src=\"assets/js/html5shiv.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" charset=\"UTF-8\" href=\"https://translate.googleapis.com/translate_static/css/translateelement.css\">\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
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
