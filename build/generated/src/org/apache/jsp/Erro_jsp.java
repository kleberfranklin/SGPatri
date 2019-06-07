package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Erro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/head.jsp", out, false);
      out.write("\r\n");
      out.write("    <body class=\"no-skin\">\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar navbar-default    ace-save-state\">\r\n");
      out.write("            <div class=\"navbar-container ace-save-state\" id=\"navbar-container\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle menu-toggler pull-left\" id=\"menu-toggler\" data-target=\"#sidebar\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle sidebar</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"navbar-header pull-left\">\r\n");
      out.write("                    <a href=\"Index.jsp\" class=\"navbar-brand\">\r\n");
      out.write("                        <small><img src=\"img/logo.png\" height=\"6%\" width=\"6%\" title=\"CGPatri - Gerador de Indicadores\"> SG-PATRI - Sistema de Gestão das Áreas Públicas</small>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            <!--    <div class=\"navbar-buttons navbar-header pull-right\" role=\"navigation\">\r\n");
      out.write("                    <ul class=\"nav ace-nav\">\r\n");
      out.write("                        <li class=\"light-blue dropdown-modal\">\r\n");
      out.write("                            <a data-toggle=\"dropdown\" href=\"#\" class=\"dropdown-toggle\">\r\n");
      out.write("                                <img class=\"nav-user-photo\" src=\"img/foto/user.jpg\" alt=\"\" title=\"foto \" />\r\n");
      out.write("                                <span class=\"user-info\">\r\n");
      out.write("                                    <small>Bem vindo,</small>\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <i class=\"ace-icon fa fa-caret-down\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close\">\r\n");
      out.write("                               \r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"Config.jsp\">\r\n");
      out.write("                                            <i class=\"ace-icon fa fa-cog\"></i>\r\n");
      out.write("                                            Configuração\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                               \r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <i class=\"ace-icon fa fa-user\"></i>\r\n");
      out.write("                                        Prefil\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"ControllerServlet?acao=UsuarioLogoff\">\r\n");
      out.write("                                        <i class=\"ace-icon fa fa-power-off\"></i>\r\n");
      out.write("                                        Logof\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>-->\r\n");
      out.write("            </div><!-- /.navbar-container -->\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"main-container ace-save-state\" id=\"main-container\">\r\n");
      out.write("    \r\n");
      out.write("    <!--<div class=\"breadcrumbs ace-save-state\" id=\"breadcrumbs\">\r\n");
      out.write("        <ul class=\"breadcrumb\">\r\n");
      out.write("            <li><i class=\"ace-icon fa fa-random\"></i> Erro</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>-->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"page-content\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("    <div class=\"col-xs-12\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <div class=\"well\">\r\n");
      out.write("            <h1 class=\"grey lighter smaller\">\r\n");
      out.write("                <span class=\"blue bigger-125\">\r\n");
      out.write("                    <i class=\"ace-icon fa fa-random\"></i>\r\n");
      out.write("                    Erro \r\n");
      out.write("                </span>\r\n");
      out.write("                inesperado no sistema!\r\n");
      out.write("            </h1>\r\n");
      out.write("\r\n");
      out.write("            <hr>\r\n");
      out.write("            <h3 class=\"lighter smaller\">\r\n");
      out.write("                Iremos trabalhar \r\n");
      out.write("                <i class=\"ace-icon fa fa-wrench icon-animated-wrench bigger-125\"></i>\r\n");
      out.write("                para corrigir !\r\n");
      out.write("            </h3>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"space\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <h4 class=\"lighter smaller\">Por gentileza, nos ajude encaminhando o erro abaixo para o e-mail:</h4>\r\n");
      out.write("                <ul class=\"list-unstyled spaced inline bigger-110 margin-15\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <i class=\"ace-icon fa fa-envelope blue\"></i>\r\n");
      out.write("                        <a href=\"mailto:klferreira@prefeitura.sp.gov.br?subject=Erro no SISGI\">Administrador do sistema.</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-12 \">\r\n");
      out.write("                <button class=\"btn btn-yellow right\" type=\"reset\" onclick=\" location.href='javascript:history.back()';\" title=\"Tela ínicial\">\r\n");
      out.write("                    <span class=\" fa fa-undo bigger-110\"></span>\r\n");
      out.write("                </button>    \r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"text-capitalize\">\r\n");
      out.write("                ");

                    exception.printStackTrace(new java.io.PrintWriter(out));
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("   </div><!-- /.main-container --> \r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("exception");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['javax.servlet.error.exception']}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
