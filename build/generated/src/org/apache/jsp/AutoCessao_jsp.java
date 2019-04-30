package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AutoCessao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/head.jsp", out, false);
      out.write("\r\n");
      out.write("    <body class=\"no-skin\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/top.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"main-container ace-save-state\" id=\"main-container\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/nav.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"page-header\">\r\n");
      out.write("                <h1>\r\n");
      out.write("                    Auto de Cessão\r\n");
      out.write("                </h1>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-sm-12\" style=\" padding-top:30px\">\r\n");
      out.write("                <div class=\"infobox\">\r\n");
      out.write("                    <div class=\"btn-group-lg \">\r\n");
      out.write("                        <button class=\"btn btn-primary btn-white btn-block\" onclick=\" location.href = 'ControllerServlet?acao=AutoCessaoLista';\">\r\n");
      out.write("                            <!--<button class=\"btn btn-primary btn-white btn-block\" onclick=\"#\"> -->\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-search\"></i>\r\n");
      out.write("                            Pesquisa\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <div class=\"infobox\">\r\n");
      out.write("                    <div class=\"btn-group-lg\">\r\n");
      out.write("                        <button class=\"btn btn-primary btn-white btn-block\" onclick=\"location.href = 'ControllerServlet?acao=AutoCessaoGrafico';\">\r\n");
      out.write("                            <i class=\"fa fa-bar-chart\"></i>\r\n");
      out.write("                            Processo de Validação\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--<div class=\"infobox\">\r\n");
      out.write("                    <div class=\"btn-group-lg\">\r\n");
      out.write("                        <button class=\"btn btn-primary btn-white btn-block\" onclick=\"location.href='ControllerServlet?acao=AutoCessaoVencida&ter=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ter}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\">\r\n");
      out.write("                        <button class=\"btn btn-primary btn-white btn-block\" onclick=\"#\">\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-search\"></i>\r\n");
      out.write("                            Vencidos\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("        \r\n");
      out.write("                    <div class=\"infobox\">\r\n");
      out.write("                        <div class=\"btn-group-lg\">\r\n");
      out.write("                            <button class=\"btn btn-primary btn-white btn-block\" onclick=\" location.href='ControllerServlet?acao=AutoCessaoGraQtd&ter=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ter}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\">\r\n");
      out.write("                                <i class=\"ace-icon fa fa-bar-chart\"></i>\r\n");
      out.write("                                Gráficos\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>-->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-sm-12 infobox-small\" style=\" padding-top:30px\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</div><!-- /.main-container --> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionSgDivisao == 'DDPI' && sessionSgSetor == 'SCL' || sessionPerfil == 'Administrador'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <div class=\"infobox\">\r\n");
        out.write("                        <div class=\"btn-group-lg\">\r\n");
        out.write("                            <!--<button class=\"btn btn-primary btn-white btn-block\" onclick=\"#\">-->\r\n");
        out.write("                            <button class=\"btn btn-primary btn-white btn-block\" onclick=\" location.href = 'ControllerServlet?acao=AutoCessaoDetalhe&execucao=insert';\">\r\n");
        out.write("                                <i class=\"ace-icon fa fa-plus\"></i>\r\n");
        out.write("                                Novo\r\n");
        out.write("                            </button>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <div class=\"infobox\">\r\n");
        out.write("                        <div class=\"btn-group-lg\">\r\n");
        out.write("                            <!--<button class=\"btn btn-primary btn-white btn-block\" onclick=\"#\">-->\r\n");
        out.write("                            <button class=\"btn btn-primary btn-white btn-block\" onclick=\" location.href = 'ControllerServlet?acao=AutoCessaoListaValidacao';\">\r\n");
        out.write("                                <i class=\"fa fa-check-square-o\"></i> \r\n");
        out.write("                                Validação Auto Cessão\r\n");
        out.write("                            </button>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
