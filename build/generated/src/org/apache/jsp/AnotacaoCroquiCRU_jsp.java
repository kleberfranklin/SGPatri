package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AnotacaoCroquiCRU_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/include/ControleAcesso.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_var_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_var_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_fmt_formatDate_var_value_type_nobody.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
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
      out.write("            <!--Verificação de acesso  -->\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Beans -->        \r\n");
      out.write("            ");
      br.com.Modelo.SubPrefeituraDAO subPref = null;
      synchronized (_jspx_page_context) {
        subPref = (br.com.Modelo.SubPrefeituraDAO) _jspx_page_context.getAttribute("subPref", PageContext.PAGE_SCOPE);
        if (subPref == null){
          subPref = new br.com.Modelo.SubPrefeituraDAO();
          _jspx_page_context.setAttribute("subPref", subPref, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("            ");
      br.com.Modelo.ArquivoDAO Arquivo = null;
      synchronized (_jspx_page_context) {
        Arquivo = (br.com.Modelo.ArquivoDAO) _jspx_page_context.getAttribute("Arquivo", PageContext.PAGE_SCOPE);
        if (Arquivo == null){
          Arquivo = new br.com.Modelo.ArquivoDAO();
          _jspx_page_context.setAttribute("Arquivo", Arquivo, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--Include ação ajax e javaScritp -->        \r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javaScritp/maskProcesso.html", out, false);
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javaScritp/somenteNum.html", out, false);
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javaScritp/ajaxEndereco.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--Pegando os paremetros -->\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_12(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_13(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_14(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"breadcrumbs ace-save-state\" id=\"breadcrumbs\">\r\n");
      out.write("                <ul class=\"breadcrumb\">\r\n");
      out.write("                    <li><i class=\"ace-icon fa fa-list\"></i> Anotação Croqui</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>    \r\n");
      out.write("            <div class=\"page-content\" >\r\n");
      out.write("                <div id=\"\" class=\"specific-block\"></div>    \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xs-12\">\r\n");
      out.write("                        <div class=\"col-sm-offset-1 col-sm-10\">\r\n");
      out.write("                            <h2>Anotação Croqui : ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</h2>\r\n");
      out.write("                            <div class=\"space-14\"></div>\r\n");
      out.write("                            <div class=\"form-horizontal\">\r\n");
      out.write("                                <div class=\"tabbable\">\r\n");
      out.write("                                    <ul class=\"nav nav-tabs padding-0\">\r\n");
      out.write("                                        <li class=\"in active\">\r\n");
      out.write("                                            <a data-toggle=\"tab\" href=\"#cad-croqui\" aria-expanded=\"true\">\r\n");
      out.write("                                                Anotação Croqui\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"\">\r\n");
      out.write("                                            <a data-toggle=\"tab\" href=\"#doc-anexo\" aria-expanded=\"true\">\r\n");
      out.write("                                                Documentos Anexo\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                    <div class=\"tab-content profile-edit-tab-content\" >\r\n");
      out.write("\r\n");
      out.write("                                        <!--Inicio da tab-pane Cadastro Croqui-->\r\n");
      out.write("                                        <div id=\"cad-croqui\" class=\"tab-pane in active\">\r\n");
      out.write("                                            <form action=\"ControllerServlet?acao=AnotacaoCroquiUC\" method=\"POST\" >\r\n");
      out.write("                                                <input type=\"hidden\" name=\"pkAnotacaoExpediente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.pkAnotacaoExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                                <input type=\"hidden\" name=\"nmTipoExpediente\" value=\"croqui\" />\r\n");
      out.write("                                                <input type=\"hidden\" name=\"execucao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                                <input type=\"hidden\" name=\"verExpediente\" value=\"1\" />\r\n");
      out.write("                                                <h4 class=\"header smaller lbl \"><strong>Cadastro Croqui</strong></h4>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <div class=\"inline col-sm-2 col-xs-12\"\r\n");
      out.write("                                                         <span class=\"lbl\"><strong>Coqui:</strong></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    <label class=\"col-sm-3 col-xs-12\">\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    <label class=\"col-sm-1 col-xs-12\">\r\n");
      out.write("                                                        <span class = \"lbl\"><strong>Área:</strong></span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    <label class=\"col-sm-3 col-xs-12\">\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>                                                   \r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Nº Informação DGPI: </strong></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <label class=\"col-sm-6 col-xs-12\">\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Nº Processo:</strong></span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_choose_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-1\"></div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Nº Tid: </strong></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <label class=\"col-sm-6 col-xs-12\">\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Nº de Expediente:</strong></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    <label class=\"inline col-sm-6 col-xs-12\" >\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Interessado:</strong></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    <label class=\"col-sm-8 col-xs-12\">\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Assunto:</strong></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                   \r\n");
      out.write("                                                <div class=\"space-1\"></div>\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_10(_jspx_page_context))
        return;
      out.write("                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                <span class=\"lbl\"><strong>Anotação:</strong></span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <label class=\"col-sm-2 col-xs-12\" >\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_12(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </label>\r\n");
      out.write("\r\n");
      out.write("                                            <label class=\"col-sm-2 col-xs-12\" >  \r\n");
      out.write("                                                <span class=\"lbl\"><strong>Informação:</strong></span>\r\n");
      out.write("                                            </label>                \r\n");
      out.write("\r\n");
      out.write("                                            <label class=\"col-sm-3 col-xs-12\" >                                                  \r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_15(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                <span class=\"lbl\"><strong>Despacho:</strong></span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <label class=\"inline col-sm-8 col-xs-12\" >\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_18(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                <span class=\"lbl\"><strong>Publicado no DOM:</strong></span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <label class=\"inline col-sm-6 col-xs-12\" >\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_19(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                <span class=\"lbl\"><strong>Data de Tramitação:</strong></span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <label class=\"inline col-sm-6 col-xs-12\" >\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_20(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                <span class=\"lbl\"><strong>Observação:</strong></span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <label class=\"inline col-sm-9 col-xs-12\" >\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_21(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                <span class=\"lbl\"><strong>Data:</strong></span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <label class=\"inline col-sm-3 col-xs-12\" >\r\n");
      out.write("                                                ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_22 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_22.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_22.setParent(null);
      int _jspx_eval_c_choose_22 = _jspx_th_c_choose_22.doStartTag();
      if (_jspx_eval_c_choose_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_38 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_38.setPageContext(_jspx_page_context);
          _jspx_th_c_when_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_22);
          _jspx_th_c_when_38.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_38 = _jspx_th_c_when_38.doStartTag();
          if (_jspx_eval_c_when_38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                                        <input type=\"date\" id=\"form-field-1\" class=\"col-sm-10 col-xs-12\"  name=\"dtData\" \r\n");
              out.write("                                                               ");
              //  c:set
              org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_17 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
              _jspx_th_c_set_17.setPageContext(_jspx_page_context);
              _jspx_th_c_set_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_38);
              _jspx_th_c_set_17.setVar("hoje");
              _jspx_th_c_set_17.setValue( new java.util.Date());
              int _jspx_eval_c_set_17 = _jspx_th_c_set_17.doStartTag();
              if (_jspx_th_c_set_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_17);
                return;
              }
              _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_17);
              out.write("\r\n");
              out.write("                                                               ");
              if (_jspx_meth_c_set_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_38, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                                               ");
              if (_jspx_meth_fmt_parseDate_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_38, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                                               ");
              if (_jspx_meth_c_choose_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_38, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                                               required=\"required\" >\r\n");
              out.write("                                                    ");
              int evalDoAfterBody = _jspx_th_c_when_38.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_38);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_38);
          out.write("\r\n");
          out.write("                                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_40 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_40.setPageContext(_jspx_page_context);
          _jspx_th_c_when_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_22);
          _jspx_th_c_when_40.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_40 = _jspx_th_c_when_40.doStartTag();
          if (_jspx_eval_c_when_40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                                        ");
              //  c:set
              org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_19 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
              _jspx_th_c_set_19.setPageContext(_jspx_page_context);
              _jspx_th_c_set_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_40);
              _jspx_th_c_set_19.setVar("now");
              _jspx_th_c_set_19.setValue( new java.util.Date());
              int _jspx_eval_c_set_19 = _jspx_th_c_set_19.doStartTag();
              if (_jspx_th_c_set_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_19);
                return;
              }
              _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_19);
              out.write("\r\n");
              out.write("                                                        ");
              if (_jspx_meth_fmt_formatDate_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_40, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                                        <input type=\"date\" id=\"form-field-1\" class=\"col-sm-10 col-xs-12\"  name=\"dtData\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hoje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" readonly=\"readonly\">\r\n");
              out.write("                                                    ");
              int evalDoAfterBody = _jspx_th_c_when_40.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_40);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_40);
          out.write("\r\n");
          out.write("                                                    ");
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_22 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_otherwise_22.setPageContext(_jspx_page_context);
          _jspx_th_c_otherwise_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_22);
          int _jspx_eval_c_otherwise_22 = _jspx_th_c_otherwise_22.doStartTag();
          if (_jspx_eval_c_otherwise_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                                        <span class=\"lbl\">\r\n");
              out.write("                                                            ");
              //  c:set
              org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_20 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
              _jspx_th_c_set_20.setPageContext(_jspx_page_context);
              _jspx_th_c_set_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_22);
              _jspx_th_c_set_20.setVar("hoje");
              _jspx_th_c_set_20.setValue( new java.util.Date());
              int _jspx_eval_c_set_20 = _jspx_th_c_set_20.doStartTag();
              if (_jspx_th_c_set_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_20);
                return;
              }
              _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_20);
              out.write("\r\n");
              out.write("                                                            ");
              if (_jspx_meth_c_set_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_22, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                                            ");
              if (_jspx_meth_fmt_parseDate_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_22, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                                            ");
              if (_jspx_meth_fmt_formatDate_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_22, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                                            ");
              if (_jspx_meth_c_choose_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_22, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                                        </span> \r\n");
              out.write("                                                    ");
              int evalDoAfterBody = _jspx_th_c_otherwise_22.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_otherwise_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_22);
            return;
          }
          _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_22);
          out.write("\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_choose_22.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_22);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_22);
      out.write("\r\n");
      out.write("                                            </label>\r\n");
      out.write("\r\n");
      out.write("                                            <label class=\"col-sm-1 col-xs-12\" >  \r\n");
      out.write("                                                <span class=\"lbl\"><strong>Nome:</strong></span>\r\n");
      out.write("                                            </label> \r\n");
      out.write("\r\n");
      out.write("                                            <label class=\"col-sm-4 col-xs-12\">\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_25(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>    \r\n");
      out.write("                                        <!-- Botões-->\r\n");
      out.write("                                        <div class=\"form-actions center \">\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_choose_26(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("\r\n");
      out.write("                                        <!--Inicio da tab-pane Documento Anexo -->        \r\n");
      out.write("                                        <div id=\"doc-anexo\" class=\"tab-pane ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write(" \">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                                                    <form action=\"ControllerServlet?acao=ArquivoUpload\" enctype=\"multipart/form-data\" method=\"POST\" >\r\n");
      out.write("                                                        <h4 class=\"header smaller lbl \"><strong>Documentos Anexo</strong></h4>   \r\n");
      out.write("                                                        <input type=\"hidden\" name=\"pkDocumento\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.pkAnotacaoExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                                    <input type=\"hidden\" name=\"execucao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                                    <input type=\"hidden\" name=\"tipoArquivo\" value=\"Croqui\" />\r\n");
      out.write("                                                    <input type=\"hidden\" name=\"Origem\" value=\"AnotacaoExpediente\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_set_22(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    <input type=\"hidden\" name=\"pkArquivo\" value=\"");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("\" />   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                    <label class=\"inline col-md-2 col-xs-12\"><strong>Croqui:</strong></label>\r\n");
      out.write("                                                    <label class=\"col-md-1 col-xs-12\">\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>    \r\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javaScritp/carregado.html", out, false);
      out.write("\r\n");
      out.write("                        </div>    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
    _jspx_th_c_set_0.setVar("acessoPerfil");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionPerfil}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionLogin == '' || sessionLogin == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_redirect_0.setUrl("/AcessoNegado.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionPerfil != acessoPerfil}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_redirect_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_set_1.setVar("msg3");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${true}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_1.setScope("session");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_redirect_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_1 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_1.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_redirect_1.setUrl("/AcessoNegado.jsp");
    int _jspx_eval_c_redirect_1 = _jspx_th_c_redirect_1.doStartTag();
    if (_jspx_th_c_redirect_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_1);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionStatus == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_redirect_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_set_2.setVar("msg");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${true}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_2.setScope("session");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_redirect_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_2 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_2.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_redirect_2.setUrl("/AcessoNegado.jsp");
    int _jspx_eval_c_redirect_2 = _jspx_th_c_redirect_2.doStartTag();
    if (_jspx_th_c_redirect_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_2);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setVar("pg");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent(null);
    _jspx_th_c_set_4.setVar("pf");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pf}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_set_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent(null);
    _jspx_th_c_set_5.setVar("pi");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pi}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_set_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent(null);
    _jspx_th_c_set_6.setVar("execucao");
    _jspx_th_c_set_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.execucao}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_set_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_7.setPageContext(_jspx_page_context);
    _jspx_th_c_set_7.setParent(null);
    _jspx_th_c_set_7.setVar("qCroqui");
    _jspx_th_c_set_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.qCroqui}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
    if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
    return false;
  }

  private boolean _jspx_meth_c_set_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_8 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_8.setPageContext(_jspx_page_context);
    _jspx_th_c_set_8.setParent(null);
    _jspx_th_c_set_8.setVar("qArea");
    _jspx_th_c_set_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.qArea}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_8 = _jspx_th_c_set_8.doStartTag();
    if (_jspx_th_c_set_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
    return false;
  }

  private boolean _jspx_meth_c_set_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_9 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_9.setPageContext(_jspx_page_context);
    _jspx_th_c_set_9.setParent(null);
    _jspx_th_c_set_9.setVar("qNome");
    _jspx_th_c_set_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.qNome}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_9 = _jspx_th_c_set_9.doStartTag();
    if (_jspx_th_c_set_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
    return false;
  }

  private boolean _jspx_meth_c_set_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_10 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_10.setPageContext(_jspx_page_context);
    _jspx_th_c_set_10.setParent(null);
    _jspx_th_c_set_10.setVar("qEndereco");
    _jspx_th_c_set_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.qEndereco}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_10 = _jspx_th_c_set_10.doStartTag();
    if (_jspx_th_c_set_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_10);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_10);
    return false;
  }

  private boolean _jspx_meth_c_set_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_11 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_11.setPageContext(_jspx_page_context);
    _jspx_th_c_set_11.setParent(null);
    _jspx_th_c_set_11.setVar("qAssunto");
    _jspx_th_c_set_11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.qAssunto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_11 = _jspx_th_c_set_11.doStartTag();
    if (_jspx_th_c_set_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_11);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_11);
    return false;
  }

  private boolean _jspx_meth_c_set_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_12 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_12.setPageContext(_jspx_page_context);
    _jspx_th_c_set_12.setParent(null);
    _jspx_th_c_set_12.setVar("dtIni");
    _jspx_th_c_set_12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.dtIni}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_12 = _jspx_th_c_set_12.doStartTag();
    if (_jspx_th_c_set_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_12);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_12);
    return false;
  }

  private boolean _jspx_meth_c_set_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_13 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_13.setPageContext(_jspx_page_context);
    _jspx_th_c_set_13.setParent(null);
    _jspx_th_c_set_13.setVar("dtFim");
    _jspx_th_c_set_13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.dtFim}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_13 = _jspx_th_c_set_13.doStartTag();
    if (_jspx_th_c_set_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_13);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_13);
    return false;
  }

  private boolean _jspx_meth_c_set_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_14 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_14.setPageContext(_jspx_page_context);
    _jspx_th_c_set_14.setParent(null);
    _jspx_th_c_set_14.setVar("msg");
    _jspx_th_c_set_14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.msg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_14 = _jspx_th_c_set_14.doStartTag();
    if (_jspx_th_c_set_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_14);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_14);
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("    \r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nrVerExpediente == '0'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"badge badge-transparent\" title=\"Pendente Validação\"><i class=\"ace-icon fa fa-exclamation-triangle red bigger-130\"></i></span>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"badge badge-transparent\" title=\"Validado\"><i class=\"ace-icon fa fa-check-square-o green bigger-130\"></i></span>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent(null);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("    \r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nrVerArquivo == '0'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"badge badge-transparent\" title=\"Pendente Validação\"><i class=\"ace-icon fa fa-exclamation-triangle red bigger-130\"></i></span>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"badge badge-transparent\" title=\"Validado\"><i class=\"ace-icon fa fa-check-square-o green bigger-130\"></i></span>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent(null);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-6 col-xs-12\" name=\"cdCroqui\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdCroqui}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Código Croqui\" required=\"required\">\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-6 col-xs-12\" name=\"cdCroqui\" placeholder=\"Código Croqui\" required=\"required\" >\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdCroqui}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_4.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_4.setParent(null);
    int _jspx_eval_c_choose_4 = _jspx_th_c_choose_4.doStartTag();
    if (_jspx_eval_c_choose_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
    return false;
  }

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-7 col-xs-12\" name=\"cdArea\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdArea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Código da Área\" maxlength=\"4\" required=\"required\">\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
    return false;
  }

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-7 col-xs-12\" name=\"cdArea\" placeholder=\"Código da Área\" required=\"required\" maxlength=\"4\" required=\"required\" >\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_3.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
    if (_jspx_eval_c_otherwise_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdArea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
    return false;
  }

  private boolean _jspx_meth_c_choose_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_5 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_5.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_5.setParent(null);
    int _jspx_eval_c_choose_5 = _jspx_th_c_choose_5.doStartTag();
    if (_jspx_eval_c_choose_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_5);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_5);
    return false;
  }

  private boolean _jspx_meth_c_when_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_9.setPageContext(_jspx_page_context);
    _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_5);
    _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
    if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-8 col-xs-12\" name=\"nrInformacaoDgpi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nrInformacaoDgpi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Nº Informação DGPI\" required=\"required\"  >\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
    return false;
  }

  private boolean _jspx_meth_c_when_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_10.setPageContext(_jspx_page_context);
    _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_5);
    _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
    if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-8 col-xs-12\"  name=\"nrInformacaoDgpi\"  placeholder=\"Nº Informação DGPI\" required=\"required\"  >\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_4 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_4.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_5);
    int _jspx_eval_c_otherwise_4 = _jspx_th_c_otherwise_4.doStartTag();
    if (_jspx_eval_c_otherwise_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nrInformacaoDgpi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_4);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_4);
    return false;
  }

  private boolean _jspx_meth_c_choose_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_6 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_6.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_6.setParent(null);
    int _jspx_eval_c_choose_6 = _jspx_th_c_choose_6.doStartTag();
    if (_jspx_eval_c_choose_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_otherwise_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_6);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_6);
    return false;
  }

  private boolean _jspx_meth_c_when_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_11.setPageContext(_jspx_page_context);
    _jspx_th_c_when_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_6);
    _jspx_th_c_when_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
    if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <label class=\"inline col-md-3 col-xs-12\">\r\n");
        out.write("                                                                <input type=\"text\"  class=\"col-xs-12 col-md-12\" name=\"nrprocesso\" id=\"nrprocesso\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdProcesso}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"nº do processo\"  required=\"required\"    >\r\n");
        out.write("                                                            </label>\r\n");
        out.write("                                                            <label class=\"col-xs-12 col-md-1\">\r\n");
        out.write("                                                                <input name=\"tpProcesso\" id=\"sei\" value=\"SEI\" type=\"radio\" class=\"ace\" onclick=\"maskProcesso();\" ");
        if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_11, _jspx_page_context))
          return true;
        out.write(" required=\"required\">\r\n");
        out.write("                                                                    <span class=\"lbl\"><strong> SEI</strong></span>\r\n");
        out.write("                                                                </label>\r\n");
        out.write("                                                                <label class=\"col-xs-12 col-md-1\">\r\n");
        out.write("                                                                    <input name=\"tpProcesso\" id=\"pa\" value=\"PA\" type=\"radio\" class=\"ace\" onclick=\"maskProcesso();\" ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_11, _jspx_page_context))
          return true;
        out.write(" >\r\n");
        out.write("                                                                    <span class=\"lbl\"><strong> P.A.</strong></span>\r\n");
        out.write("                                                                </label>\r\n");
        out.write("                                                                <label class=\"col-xs-12 col-md-1\">\r\n");
        out.write("                                                                    <input name=\"tpProcesso\" id=\"cid\" value=\"CID\" type=\"radio\" class=\"ace\" onclick=\"maskProcesso();\" ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_11, _jspx_page_context))
          return true;
        out.write(" >\r\n");
        out.write("                                                                    <span class=\"lbl\"><strong> CID</strong></span>\r\n");
        out.write("                                                                </label>\r\n");
        out.write("                                                                <label class=\"col-xs-12 col-md-3\">\r\n");
        out.write("                                                                    <span id=\"msgProcesso\"></span>\r\n");
        out.write("                                                                </label> \r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_11);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmTipoProcesso == 'SEI'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked=\"checked\" ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_11);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmTipoProcesso == 'PA'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked=\"checked\" ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_11);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmTipoProcesso == 'CID'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked=\"checked\"");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_when_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_12 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_12.setPageContext(_jspx_page_context);
    _jspx_th_c_when_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_6);
    _jspx_th_c_when_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_12 = _jspx_th_c_when_12.doStartTag();
    if (_jspx_eval_c_when_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <label class=\"inline col-md-3 col-xs-12\">\r\n");
        out.write("                                                                <input type=\"text\"  class=\"col-xs-12 col-md-12\" name=\"nrprocesso\" id=\"nrprocesso\"  placeholder=\"nº do processo\" required=\"required\"  onKeyPress=\"return somenteNum(event);\"  >\r\n");
        out.write("                                                            </label>\r\n");
        out.write("                                                            <label class=\"col-xs-12 col-md-1\">\r\n");
        out.write("                                                                <input name=\"tpProcesso\" id=\"sei\" value=\"SEI\" type=\"radio\" class=\"ace\" onclick=\"maskProcesso();\" required=\"required\">\r\n");
        out.write("                                                                <span class=\"lbl\"><strong> SEI</strong></span>\r\n");
        out.write("                                                            </label>\r\n");
        out.write("                                                            <label class=\"col-xs-12 col-md-1\">\r\n");
        out.write("                                                                <input name=\"tpProcesso\" id=\"pa\" value=\"PA\" type=\"radio\" class=\"ace\" onclick=\"maskProcesso();\">\r\n");
        out.write("                                                                <span class=\"lbl\"><strong> P.A.</strong></span>\r\n");
        out.write("                                                            </label>\r\n");
        out.write("                                                            <label class=\"col-xs-12 col-md-1\">\r\n");
        out.write("                                                                <input name=\"tpProcesso\" id=\"cid\" value=\"CID\" type=\"radio\" class=\"ace\" onclick=\"maskProcesso();\">\r\n");
        out.write("                                                                <span class=\"lbl\"><strong> CID</strong></span>\r\n");
        out.write("                                                            </label>\r\n");
        out.write("                                                            <label class=\"col-xs-12 col-md-3\">\r\n");
        out.write("                                                                <span id=\"msgProcesso\"></span>\r\n");
        out.write("                                                            </label>    \r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_5 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_5.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_6);
    int _jspx_eval_c_otherwise_5 = _jspx_th_c_otherwise_5.doStartTag();
    if (_jspx_eval_c_otherwise_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <label class=\"inline col-md-10 col-xs-12\">\r\n");
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmTipoProcesso}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(':');
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdProcesso}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                                                            </label>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_5);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_5);
    return false;
  }

  private boolean _jspx_meth_c_choose_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_7 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_7.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_7.setParent(null);
    int _jspx_eval_c_choose_7 = _jspx_th_c_choose_7.doStartTag();
    if (_jspx_eval_c_choose_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_7);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_7);
    return false;
  }

  private boolean _jspx_meth_c_when_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_13 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_13.setPageContext(_jspx_page_context);
    _jspx_th_c_when_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_7);
    _jspx_th_c_when_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_13 = _jspx_th_c_when_13.doStartTag();
    if (_jspx_eval_c_when_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-5 col-xs-12\" name=\"cdTid\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdTid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Nº do Tid\" required=\"required\" onKeyPress=\"return somenteNum(event);\"  >\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_13);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_13);
    return false;
  }

  private boolean _jspx_meth_c_when_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_14 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_14.setPageContext(_jspx_page_context);
    _jspx_th_c_when_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_7);
    _jspx_th_c_when_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_14 = _jspx_th_c_when_14.doStartTag();
    if (_jspx_eval_c_when_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-5 col-xs-12\"  name=\"cdTid\"  placeholder=\"Nº do Tid\" required=\"required\"  onKeyPress=\"return somenteNum(event);\" >\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_14);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_14);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_6 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_6.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_7);
    int _jspx_eval_c_otherwise_6 = _jspx_th_c_otherwise_6.doStartTag();
    if (_jspx_eval_c_otherwise_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdTid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_6);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_6);
    return false;
  }

  private boolean _jspx_meth_c_choose_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_8 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_8.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_8.setParent(null);
    int _jspx_eval_c_choose_8 = _jspx_th_c_choose_8.doStartTag();
    if (_jspx_eval_c_choose_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_8);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_8);
    return false;
  }

  private boolean _jspx_meth_c_when_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_15 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_15.setPageContext(_jspx_page_context);
    _jspx_th_c_when_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_8);
    _jspx_th_c_when_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_15 = _jspx_th_c_when_15.doStartTag();
    if (_jspx_eval_c_when_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-8 col-xs-12\"  name=\"cdExpediente\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Nº Expediente\" required=\"required\" >\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_15);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_15);
    return false;
  }

  private boolean _jspx_meth_c_when_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_16 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_16.setPageContext(_jspx_page_context);
    _jspx_th_c_when_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_8);
    _jspx_th_c_when_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_16 = _jspx_th_c_when_16.doStartTag();
    if (_jspx_eval_c_when_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-8 col-xs-12\"  name=\"cdExpediente\" placeholder=\"Nº Expediente\" required=\"required\" >\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_16);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_16);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_7 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_7.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_8);
    int _jspx_eval_c_otherwise_7 = _jspx_th_c_otherwise_7.doStartTag();
    if (_jspx_eval_c_otherwise_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_7);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_7);
    return false;
  }

  private boolean _jspx_meth_c_choose_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_9 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_9.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_9.setParent(null);
    int _jspx_eval_c_choose_9 = _jspx_th_c_choose_9.doStartTag();
    if (_jspx_eval_c_choose_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_9);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_9);
    return false;
  }

  private boolean _jspx_meth_c_when_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_17 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_17.setPageContext(_jspx_page_context);
    _jspx_th_c_when_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_9);
    _jspx_th_c_when_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_17 = _jspx_th_c_when_17.doStartTag();
    if (_jspx_eval_c_when_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-10 col-xs-12\"  name=\"nmInteressado\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmInteressado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Nome do Interessado\" required=\"required\" >\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_17);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_17);
    return false;
  }

  private boolean _jspx_meth_c_when_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_18 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_18.setPageContext(_jspx_page_context);
    _jspx_th_c_when_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_9);
    _jspx_th_c_when_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_18 = _jspx_th_c_when_18.doStartTag();
    if (_jspx_eval_c_when_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-sm-10 col-xs-12\"  name=\"nmInteressado\" placeholder=\"Nome do Interessado\" required=\"required\" >\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_18);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_18);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_8 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_8.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_9);
    int _jspx_eval_c_otherwise_8 = _jspx_th_c_otherwise_8.doStartTag();
    if (_jspx_eval_c_otherwise_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmInteressado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_8);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_8);
    return false;
  }

  private boolean _jspx_meth_c_choose_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_10 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_10.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_10.setParent(null);
    int _jspx_eval_c_choose_10 = _jspx_th_c_choose_10.doStartTag();
    if (_jspx_eval_c_choose_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_otherwise_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_10);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_10);
    return false;
  }

  private boolean _jspx_meth_c_when_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_19 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_19.setPageContext(_jspx_page_context);
    _jspx_th_c_when_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_10);
    _jspx_th_c_when_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_19 = _jspx_th_c_when_19.doStartTag();
    if (_jspx_eval_c_when_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <div class=\"form-group\">\r\n");
        out.write("                                                            <div class=\"inline col-sm-2 col-xs-12\">\r\n");
        out.write("                                                                <span class=\"lbl\"><strong>Local:</strong></span>\r\n");
        out.write("                                                            </div>\r\n");
        out.write("                                                            <label class=\"col-sm-8 col-xs-12\" >\r\n");
        out.write("                                                                <input type=\"text\" id=\"form-field-1\" class=\"col-sm-12 col-xs-12\" name=\"nmEndereco\" \r\n");
        out.write("                                                                       value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmReferenciaEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  placeholder=\"Descrição do local\" required=\"required\">\r\n");
        out.write("                                                            </label>\r\n");
        out.write("                                                        </div>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_19);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_19);
    return false;
  }

  private boolean _jspx_meth_c_when_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_20 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_20.setPageContext(_jspx_page_context);
    _jspx_th_c_when_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_10);
    _jspx_th_c_when_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_20 = _jspx_th_c_when_20.doStartTag();
    if (_jspx_eval_c_when_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                        <div class=\"space-1\"></div>\r\n");
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_choose_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                <div class=\"space-1\"></div>\r\n");
        out.write("\r\n");
        out.write("                                                <div class=\"form-group\">\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\"><strong>número:</strong></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                        <input type=\"text\" class=\"col-xs-12 col-md-12\" name=\"nrNumeroEnd\" id=\"nrnumeroend\" placeholder=\"nº\" required=\"required\">\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\"><strong>Complemento:</strong></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-3 col-xs-12\" >\r\n");
        out.write("                                                        <input type=\"text\" class=\"col-xs-12 col-md-12\" name=\"nmComplementoEnd\" id=\"nmcomplementoend\" placeholder=\"complemento do endereço\" >\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                <div class=\"form-group\">\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\"><strong>Bairro:</strong></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-10 col-xs-12\" >\r\n");
        out.write("                                                        <input type=\"text\" class=\"col-xs-12 col-md-5\" name=\"nmbairro\" id=\"nmbairro\" placeholder=\"nome do bairro\" required=\"required\">\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                <div class=\"space-1\"></div>\r\n");
        out.write("\r\n");
        out.write("                                                <div class=\"form-group\">\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >  \r\n");
        out.write("                                                        <span class=\"lbl\"><strong>Referência:</strong></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-8 col-xs-12\" >\r\n");
        out.write("                                                        <input type=\"text\" class=\"col-xs-12 col-md-12\" name=\"nmReferenciaEnd\" id=\"nmreferenciaend\" placeholder=\"referencia do endereço\" >\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                </div>    \r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_when_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_20);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_20);
    return false;
  }

  private boolean _jspx_meth_c_choose_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_11 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_11.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_20);
    int _jspx_eval_c_choose_11 = _jspx_th_c_choose_11.doStartTag();
    if (_jspx_eval_c_choose_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_11);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_11);
    return false;
  }

  private boolean _jspx_meth_c_when_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_21 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_21.setPageContext(_jspx_page_context);
    _jspx_th_c_when_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_11);
    _jspx_th_c_when_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_21 = _jspx_th_c_when_21.doStartTag();
    if (_jspx_eval_c_when_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <div class=\"form-group\">\r\n");
        out.write("                                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                                        <span class=\"lbl\"><strong>CEP</strong></span>\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                    <label class=\"inline col-md-10 col-xs-12\" >\r\n");
        out.write("                                                                        <input type=\"hidden\" name=\"pkLogradouro\" id=\"pkLogradouro\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lograPadrao.pkLogradouroPadrao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" required=\"required\">\r\n");
        out.write("                                                                        <input type=\"text\" class=\"col-xs-12 col-md-2\" name=\"nrcep\" id=\"nrcep\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lograPadrao.nrCep}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  placeholder=\"nº do CEP\" required=\"required\">\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                </div>\r\n");
        out.write("                                                                <div class=\"form-group\">\r\n");
        out.write("                                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                                        <span class=\"lbl\"><strong>Endereço:</strong></span>\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                    <label class=\"inline col-md-10 col-xs-12\" >\r\n");
        out.write("                                                                        <input type=\"text\" class=\"col-xs-12 col-md-8\" name=\"nmendereco\" id=\"nmendereco\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lograPadrao.nmLogradouroCompleto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" onkeyup=\"pesquisaNomeLogradouro(this.value)\" onblur=\"validarEndereco();\" onclick=\"clickEndereco();\" placeholder=\"nome do endereço\" required=\"required\" >\r\n");
        out.write("                                                                        <div id=\"listaEndereco\" style=\"padding-top:35px\"></div>\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                </div>\r\n");
        out.write("                                                                <div class=\"space-1\"></div>\r\n");
        out.write("\r\n");
        out.write("                                                                <div class=\"form-group\">\r\n");
        out.write("                                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                                        <span class=\"lbl\"><strong>número:</strong></span>\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                                        <input type=\"text\" class=\"col-xs-12 col-md-12\" name=\"nrNumeroEnd\" id=\"nrnumeroend\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nrEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"nº\" required=\"required\">\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                                        <span class=\"lbl\"><strong>Complemento:</strong></span>\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                    <label class=\"inline col-md-3 col-xs-12\" >\r\n");
        out.write("                                                                        <input type=\"text\" class=\"col-xs-12 col-md-12\" name=\"nmComplementoEnd\" id=\"nmcomplementoend\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmComplementoEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"complemento do endereço\" >\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                </div>\r\n");
        out.write("                                                                <div class=\"form-group\">\r\n");
        out.write("                                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                                        <span class=\"lbl\"><strong>Bairro:</strong></span>\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                    <label class=\"inline col-md-10 col-xs-12\" >\r\n");
        out.write("                                                                        <input type=\"text\" class=\"col-xs-12 col-md-5\" name=\"nmbairro\" id=\"nmbairro\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lograPadrao.nmBairro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"nome do bairro\" required=\"required\">\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                </div>\r\n");
        out.write("                                                                <div class=\"space-1\"></div>\r\n");
        out.write("\r\n");
        out.write("                                                                \r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_21);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_21);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_9 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_9.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_11);
    int _jspx_eval_c_otherwise_9 = _jspx_th_c_otherwise_9.doStartTag();
    if (_jspx_eval_c_otherwise_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <div class=\"form-group\">\r\n");
        out.write("                                                                    <div class=\"inline col-sm-2 col-xs-12\">\r\n");
        out.write("                                                                        <span class=\"lbl\"><strong>Local:</strong></span>\r\n");
        out.write("                                                                    </div>\r\n");
        out.write("                                                                    <label class=\"col-sm-8 col-xs-12\" >\r\n");
        out.write("                                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmReferenciaEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                                                                    </label>\r\n");
        out.write("                                                                </div>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_9);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_9);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_10 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_10.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_10);
    int _jspx_eval_c_otherwise_10 = _jspx_th_c_otherwise_10.doStartTag();
    if (_jspx_eval_c_otherwise_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <div class=\"form-group\">\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\"><strong>CEP</strong></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-10 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lograPadrao.nrCep}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                <div class=\"form-group\">\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\"><strong>Endereço:</strong></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-10 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lograPadrao.nmLogradouroCompleto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                <div class=\"space-1\"></div>\r\n");
        out.write("\r\n");
        out.write("                                                <div class=\"form-group\">\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\"><strong>número:</strong></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nrEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                    </label>\r\n");
        out.write("\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\"><strong>Complemento:</strong></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-3 col-xs-12\">    \r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmComplementoEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                    </label>    \r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                <div class=\"form-group\">\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\"><strong>Bairro:</strong></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-10 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lograPadrao.nmBairro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                    </label>    \r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                <div class=\"space-1\"></div>\r\n");
        out.write("\r\n");
        out.write("                                                <div class=\"form-group\">\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\" >  \r\n");
        out.write("                                                        <span class=\"lbl\"><strong>Referência:</strong></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-8 col-xs-12\" >\r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmReferenciaEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                    </label>\r\n");
        out.write("\r\n");
        out.write("                                                </div> \r\n");
        out.write("\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_10);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_10);
    return false;
  }

  private boolean _jspx_meth_c_choose_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_12 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_12.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_12.setParent(null);
    int _jspx_eval_c_choose_12 = _jspx_th_c_choose_12.doStartTag();
    if (_jspx_eval_c_choose_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_12);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_12);
    return false;
  }

  private boolean _jspx_meth_c_when_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_22 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_22.setPageContext(_jspx_page_context);
    _jspx_th_c_when_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_12);
    _jspx_th_c_when_22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_22 = _jspx_th_c_when_22.doStartTag();
    if (_jspx_eval_c_when_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_choose_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_22, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_22);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_22);
    return false;
  }

  private boolean _jspx_meth_c_choose_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_13 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_13.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_22);
    int _jspx_eval_c_choose_13 = _jspx_th_c_choose_13.doStartTag();
    if (_jspx_eval_c_choose_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_13);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_13);
    return false;
  }

  private boolean _jspx_meth_c_when_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_23 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_23.setPageContext(_jspx_page_context);
    _jspx_th_c_when_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_13);
    _jspx_th_c_when_23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nrAnotacao == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_23 = _jspx_th_c_when_23.doStartTag();
    if (_jspx_eval_c_when_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <label class=\"pull-left inline\">\r\n");
        out.write("                                                                    <input id=\"id-button-borders\"  type=\"checkbox\" id=\"\" name=\"nrAnotacao\" value=\"1\" class=\"ace ace-switch ace-switch-5\"  >\r\n");
        out.write("                                                                    <span class=\"lbl middle\"></span>\r\n");
        out.write("                                                                </label>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_23);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_23);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_11 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_11.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_13);
    int _jspx_eval_c_otherwise_11 = _jspx_th_c_otherwise_11.doStartTag();
    if (_jspx_eval_c_otherwise_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <label class=\"pull-left inline\">\r\n");
        out.write("                                                                    <input id=\"id-button-borders\"  type=\"checkbox\" id=\"\" name=\"nrAnotacao\" value=\"1\" checked=\"\" class=\"ace ace-switch ace-switch-5\"  >\r\n");
        out.write("                                                                    <span class=\"lbl middle\"></span>\r\n");
        out.write("                                                                </label>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_11);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_11);
    return false;
  }

  private boolean _jspx_meth_c_when_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_24 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_24.setPageContext(_jspx_page_context);
    _jspx_th_c_when_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_12);
    _jspx_th_c_when_24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_24 = _jspx_th_c_when_24.doStartTag();
    if (_jspx_eval_c_when_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <label class=\"pull-left inline\">\r\n");
        out.write("                                                            <input id=\"id-button-borders\"  type=\"checkbox\" id=\"\" name=\"nrAnotacao\" value=\"1\" class=\"ace ace-switch ace-switch-5\"  >\r\n");
        out.write("                                                            <span class=\"lbl middle\"></span>\r\n");
        out.write("                                                        </label>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_24);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_24);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_12 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_12.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_12);
    int _jspx_eval_c_otherwise_12 = _jspx_th_c_otherwise_12.doStartTag();
    if (_jspx_eval_c_otherwise_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_choose_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_12);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_12);
    return false;
  }

  private boolean _jspx_meth_c_choose_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_14 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_14.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_12);
    int _jspx_eval_c_choose_14 = _jspx_th_c_choose_14.doStartTag();
    if (_jspx_eval_c_choose_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_14);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_14);
    return false;
  }

  private boolean _jspx_meth_c_when_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_25 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_25.setPageContext(_jspx_page_context);
    _jspx_th_c_when_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_14);
    _jspx_th_c_when_25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nrAnotacao == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_25 = _jspx_th_c_when_25.doStartTag();
    if (_jspx_eval_c_when_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"label label-success arrowed\" title=\"SIM\">\r\n");
        out.write("                                                                    <i class=\"ace-icon fa fa-check bigger-120\"></i>\r\n");
        out.write("                                                                    Sim\r\n");
        out.write("                                                                </span>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_25);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_25);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_13 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_13.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_14);
    int _jspx_eval_c_otherwise_13 = _jspx_th_c_otherwise_13.doStartTag();
    if (_jspx_eval_c_otherwise_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"label label-danger arrowed\" title=\"NÃO\">\r\n");
        out.write("                                                                    <i class=\"ace-icon fa fa-ban bigger-120\"></i>\r\n");
        out.write("                                                                    Não\r\n");
        out.write("                                                                </span>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_13);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_13);
    return false;
  }

  private boolean _jspx_meth_c_choose_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_15 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_15.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_15.setParent(null);
    int _jspx_eval_c_choose_15 = _jspx_th_c_choose_15.doStartTag();
    if (_jspx_eval_c_choose_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_15, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_15, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_15, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_15);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_15);
    return false;
  }

  private boolean _jspx_meth_c_when_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_26 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_26.setPageContext(_jspx_page_context);
    _jspx_th_c_when_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_15);
    _jspx_th_c_when_26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_26 = _jspx_th_c_when_26.doStartTag();
    if (_jspx_eval_c_when_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_choose_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_26, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_26);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_26);
    return false;
  }

  private boolean _jspx_meth_c_choose_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_16 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_16.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_26);
    int _jspx_eval_c_choose_16 = _jspx_th_c_choose_16.doStartTag();
    if (_jspx_eval_c_choose_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_16, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_16, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_16);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_16);
    return false;
  }

  private boolean _jspx_meth_c_when_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_27 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_27.setPageContext(_jspx_page_context);
    _jspx_th_c_when_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_16);
    _jspx_th_c_when_27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nrInformacao == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_27 = _jspx_th_c_when_27.doStartTag();
    if (_jspx_eval_c_when_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <label class=\"pull-left inline\">\r\n");
        out.write("                                                                    <input id=\"id-button-borders\"  type=\"checkbox\" id=\"\" name=\"nrInformacao\" value=\"1\" class=\"ace ace-switch ace-switch-5\"  >\r\n");
        out.write("                                                                    <span class=\"lbl middle\"></span>\r\n");
        out.write("                                                                </label>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_27);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_27);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_14 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_14.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_16);
    int _jspx_eval_c_otherwise_14 = _jspx_th_c_otherwise_14.doStartTag();
    if (_jspx_eval_c_otherwise_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <label class=\"pull-left inline\">\r\n");
        out.write("                                                                    <input id=\"id-button-borders\"  type=\"checkbox\" id=\"\" name=\"nrInformacao\" value=\"1\" checked=\"\" class=\"ace ace-switch ace-switch-5\"  >\r\n");
        out.write("                                                                    <span class=\"lbl middle\"></span>\r\n");
        out.write("                                                                </label>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_14);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_14);
    return false;
  }

  private boolean _jspx_meth_c_when_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_28 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_28.setPageContext(_jspx_page_context);
    _jspx_th_c_when_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_15);
    _jspx_th_c_when_28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_28 = _jspx_th_c_when_28.doStartTag();
    if (_jspx_eval_c_when_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <label class=\"pull-left inline\">\r\n");
        out.write("                                                            <input id=\"id-button-borders\"  type=\"checkbox\" id=\"\" name=\"nrInformacao\" value=\"1\" class=\"ace ace-switch ace-switch-5\"  >\r\n");
        out.write("                                                            <span class=\"lbl middle\"></span>\r\n");
        out.write("                                                        </label>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_28);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_28);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_15 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_15.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_15);
    int _jspx_eval_c_otherwise_15 = _jspx_th_c_otherwise_15.doStartTag();
    if (_jspx_eval_c_otherwise_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_choose_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_15, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_15);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_15);
    return false;
  }

  private boolean _jspx_meth_c_choose_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_17 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_17.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_15);
    int _jspx_eval_c_choose_17 = _jspx_th_c_choose_17.doStartTag();
    if (_jspx_eval_c_choose_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_17, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_17, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_17);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_17);
    return false;
  }

  private boolean _jspx_meth_c_when_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_29 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_29.setPageContext(_jspx_page_context);
    _jspx_th_c_when_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_17);
    _jspx_th_c_when_29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${'1' == anotCroqui.nrInformacao}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_29 = _jspx_th_c_when_29.doStartTag();
    if (_jspx_eval_c_when_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"label label-success arrowed\" title=\"SIM\">\r\n");
        out.write("                                                                    <i class=\"ace-icon fa fa-check bigger-120\"></i>\r\n");
        out.write("                                                                    Sim\r\n");
        out.write("                                                                </span>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_29);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_29);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_16 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_16.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_17);
    int _jspx_eval_c_otherwise_16 = _jspx_th_c_otherwise_16.doStartTag();
    if (_jspx_eval_c_otherwise_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"label label-danger arrowed\" title=\"NÃO\">\r\n");
        out.write("                                                                    <i class=\"ace-icon fa fa-ban bigger-120\"></i>\r\n");
        out.write("                                                                    Não\r\n");
        out.write("                                                                </span>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_16);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_16);
    return false;
  }

  private boolean _jspx_meth_c_choose_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_18 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_18.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_18.setParent(null);
    int _jspx_eval_c_choose_18 = _jspx_th_c_choose_18.doStartTag();
    if (_jspx_eval_c_choose_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_18);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_18);
    return false;
  }

  private boolean _jspx_meth_c_when_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_30 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_30.setPageContext(_jspx_page_context);
    _jspx_th_c_when_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_18);
    _jspx_th_c_when_30.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_30 = _jspx_th_c_when_30.doStartTag();
    if (_jspx_eval_c_when_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <input type=\"text\" id=\"form-field-1\" class=\"col-sm-10 col-xs-12\"  name=\"dsDespacho\" \r\n");
        out.write("                                                               value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dsDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Escrever o despacho\" >\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_30);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_30);
    return false;
  }

  private boolean _jspx_meth_c_when_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_31 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_31.setPageContext(_jspx_page_context);
    _jspx_th_c_when_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_18);
    _jspx_th_c_when_31.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_31 = _jspx_th_c_when_31.doStartTag();
    if (_jspx_eval_c_when_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <input type=\"text\" id=\"form-field-1\" class=\"col-sm-10 col-xs-12\"  name=\"dsDespacho\" \r\n");
        out.write("                                                               placeholder=\"Escrever o despacho\"  >\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_31);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_31);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_17 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_17.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_18);
    int _jspx_eval_c_otherwise_17 = _jspx_th_c_otherwise_17.doStartTag();
    if (_jspx_eval_c_otherwise_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dsDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_17);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_17);
    return false;
  }

  private boolean _jspx_meth_c_choose_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_19 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_19.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_19.setParent(null);
    int _jspx_eval_c_choose_19 = _jspx_th_c_choose_19.doStartTag();
    if (_jspx_eval_c_choose_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_19, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_19, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_19, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_19);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_19);
    return false;
  }

  private boolean _jspx_meth_c_when_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_32 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_32.setPageContext(_jspx_page_context);
    _jspx_th_c_when_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_19);
    _jspx_th_c_when_32.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_32 = _jspx_th_c_when_32.doStartTag();
    if (_jspx_eval_c_when_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_set_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_32, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_fmt_parseDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_32, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_32, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        <input type=\"date\" id=\"form-field-1\" class=\"col-sm-4 col-xs-12\"  name=\"dtPublicacao\" \r\n");
        out.write("                                                               value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtAtuPubli}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"\" >\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_32);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_32);
    return false;
  }

  private boolean _jspx_meth_c_set_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_15 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_15.setPageContext(_jspx_page_context);
    _jspx_th_c_set_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_32);
    _jspx_th_c_set_15.setVar("dtPubli");
    _jspx_th_c_set_15.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtPublicacao}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_15 = _jspx_th_c_set_15.doStartTag();
    if (_jspx_th_c_set_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_15);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_15);
    return false;
  }

  private boolean _jspx_meth_fmt_parseDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:parseDate
    org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag _jspx_th_fmt_parseDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag) _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag.class);
    _jspx_th_fmt_parseDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_parseDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_32);
    _jspx_th_fmt_parseDate_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtPubli}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_parseDate_0.setVar("converteDTPlub");
    _jspx_th_fmt_parseDate_0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_parseDate_0 = _jspx_th_fmt_parseDate_0.doStartTag();
    if (_jspx_th_fmt_parseDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_parseDate_0);
      return true;
    }
    _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_parseDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_var_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_32);
    _jspx_th_fmt_formatDate_0.setType("date");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${converteDTPlub}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setVar("dtAtuPubli");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_var_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_var_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_c_when_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_33 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_33.setPageContext(_jspx_page_context);
    _jspx_th_c_when_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_19);
    _jspx_th_c_when_33.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_33 = _jspx_th_c_when_33.doStartTag();
    if (_jspx_eval_c_when_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <input type=\"date\" id=\"form-field-1\" class=\"col-sm-4 col-xs-12\"  name=\"dtPublicacao\" \r\n");
        out.write("                                                               placeholder=\"\" >\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_33);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_33);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_18 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_18.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_19);
    int _jspx_eval_c_otherwise_18 = _jspx_th_c_otherwise_18.doStartTag();
    if (_jspx_eval_c_otherwise_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_set_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_fmt_parseDate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_fmt_formatDate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtAtuPubli}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_18);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_18);
    return false;
  }

  private boolean _jspx_meth_c_set_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_16 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_16.setPageContext(_jspx_page_context);
    _jspx_th_c_set_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_18);
    _jspx_th_c_set_16.setVar("dtPubli");
    _jspx_th_c_set_16.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtPublicacao}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_16 = _jspx_th_c_set_16.doStartTag();
    if (_jspx_th_c_set_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_16);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_16);
    return false;
  }

  private boolean _jspx_meth_fmt_parseDate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:parseDate
    org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag _jspx_th_fmt_parseDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag) _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag.class);
    _jspx_th_fmt_parseDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_parseDate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_18);
    _jspx_th_fmt_parseDate_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtPubli}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_parseDate_1.setVar("converteDTPlub");
    _jspx_th_fmt_parseDate_1.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_parseDate_1 = _jspx_th_fmt_parseDate_1.doStartTag();
    if (_jspx_th_fmt_parseDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_parseDate_1);
      return true;
    }
    _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_parseDate_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_var_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_18);
    _jspx_th_fmt_formatDate_1.setType("date");
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${converteDTPlub}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_1.setVar("dtAtuPubli");
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_var_value_type_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_var_value_type_nobody.reuse(_jspx_th_fmt_formatDate_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_20 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_20.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_20.setParent(null);
    int _jspx_eval_c_choose_20 = _jspx_th_c_choose_20.doStartTag();
    if (_jspx_eval_c_choose_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_20);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_20);
    return false;
  }

  private boolean _jspx_meth_c_when_34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_34 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_34.setPageContext(_jspx_page_context);
    _jspx_th_c_when_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_20);
    _jspx_th_c_when_34.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_34 = _jspx_th_c_when_34.doStartTag();
    if (_jspx_eval_c_when_34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <input type=\"date\" id=\"form-field-1\" class=\"col-sm-4 col-xs-12\"  name=\"dtAnotacao\" \r\n");
        out.write("                                                               value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Escrever o despacho\" >\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_34);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_34);
    return false;
  }

  private boolean _jspx_meth_c_when_35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_35 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_35.setPageContext(_jspx_page_context);
    _jspx_th_c_when_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_20);
    _jspx_th_c_when_35.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_35 = _jspx_th_c_when_35.doStartTag();
    if (_jspx_eval_c_when_35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <input type=\"date\" id=\"form-field-1\" class=\"col-sm-4 col-xs-12\"  name=\"dtAnotacao\" \r\n");
        out.write("                                                               placeholder=\"Escrever o despacho\" >\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_35);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_35);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_19 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_19.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_20);
    int _jspx_eval_c_otherwise_19 = _jspx_th_c_otherwise_19.doStartTag();
    if (_jspx_eval_c_otherwise_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_19);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_19);
    return false;
  }

  private boolean _jspx_meth_c_choose_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_21 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_21.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_21.setParent(null);
    int _jspx_eval_c_choose_21 = _jspx_th_c_choose_21.doStartTag();
    if (_jspx_eval_c_choose_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_21, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_21, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_21, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_21);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_21);
    return false;
  }

  private boolean _jspx_meth_c_when_36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_36 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_36.setPageContext(_jspx_page_context);
    _jspx_th_c_when_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_21);
    _jspx_th_c_when_36.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_36 = _jspx_th_c_when_36.doStartTag();
    if (_jspx_eval_c_when_36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <textarea class=\"form-control\" id=\"form-field-8\" name=\"dsObservacao\" placeholder=\"Observação\" \r\n");
        out.write("                                                                  style=\"margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dsObservacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</textarea>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_36);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_36);
    return false;
  }

  private boolean _jspx_meth_c_when_37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_37 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_37.setPageContext(_jspx_page_context);
    _jspx_th_c_when_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_21);
    _jspx_th_c_when_37.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_37 = _jspx_th_c_when_37.doStartTag();
    if (_jspx_eval_c_when_37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <textarea class=\"form-control\" id=\"form-field-8\" name=\"dsObservacao\" placeholder=\"Observação\" \r\n");
        out.write("                                                                  style=\"margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;\"></textarea>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_37.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_37);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_37);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_20 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_20.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_21);
    int _jspx_eval_c_otherwise_20 = _jspx_th_c_otherwise_20.doStartTag();
    if (_jspx_eval_c_otherwise_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dsObservacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_20);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_20);
    return false;
  }

  private boolean _jspx_meth_c_set_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_38, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_18 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_18.setPageContext(_jspx_page_context);
    _jspx_th_c_set_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_38);
    _jspx_th_c_set_18.setVar("dt");
    _jspx_th_c_set_18.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtData}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_18 = _jspx_th_c_set_18.doStartTag();
    if (_jspx_th_c_set_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_18);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_18);
    return false;
  }

  private boolean _jspx_meth_fmt_parseDate_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_38, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:parseDate
    org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag _jspx_th_fmt_parseDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag) _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag.class);
    _jspx_th_fmt_parseDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_parseDate_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_38);
    _jspx_th_fmt_parseDate_2.setVar("converteDT");
    _jspx_th_fmt_parseDate_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_parseDate_2.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_parseDate_2 = _jspx_th_fmt_parseDate_2.doStartTag();
    if (_jspx_th_fmt_parseDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_parseDate_2);
      return true;
    }
    _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_parseDate_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_38, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_23 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_23.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_38);
    int _jspx_eval_c_choose_23 = _jspx_th_c_choose_23.doStartTag();
    if (_jspx_eval_c_choose_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                   ");
        if (_jspx_meth_c_when_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_23, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                   ");
        if (_jspx_meth_c_otherwise_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_23, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                               ");
        int evalDoAfterBody = _jspx_th_c_choose_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_23);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_23);
    return false;
  }

  private boolean _jspx_meth_c_when_39(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_39 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_39.setPageContext(_jspx_page_context);
    _jspx_th_c_when_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_23);
    _jspx_th_c_when_39.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${converteDT gt hoje }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_39 = _jspx_th_c_when_39.doStartTag();
    if (_jspx_eval_c_when_39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                                   ");
        int evalDoAfterBody = _jspx_th_c_when_39.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_39);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_39);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_21 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_21.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_23);
    int _jspx_eval_c_otherwise_21 = _jspx_th_c_otherwise_21.doStartTag();
    if (_jspx_eval_c_otherwise_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                       value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtData}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" \r\n");
        out.write("                                                                   ");
        int evalDoAfterBody = _jspx_th_c_otherwise_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_21);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_21);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_40, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_40);
    _jspx_th_fmt_formatDate_2.setVar("hoje");
    _jspx_th_fmt_formatDate_2.setPattern("yyyy-MM-dd");
    _jspx_th_fmt_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${now}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_2 = _jspx_th_fmt_formatDate_2.doStartTag();
    if (_jspx_th_fmt_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
    return false;
  }

  private boolean _jspx_meth_c_set_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_21 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_21.setPageContext(_jspx_page_context);
    _jspx_th_c_set_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_22);
    _jspx_th_c_set_21.setVar("dt");
    _jspx_th_c_set_21.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtData}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_21 = _jspx_th_c_set_21.doStartTag();
    if (_jspx_th_c_set_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_21);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_21);
    return false;
  }

  private boolean _jspx_meth_fmt_parseDate_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:parseDate
    org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag _jspx_th_fmt_parseDate_3 = (org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag) _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag.class);
    _jspx_th_fmt_parseDate_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_parseDate_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_22);
    _jspx_th_fmt_parseDate_3.setVar("converteDT");
    _jspx_th_fmt_parseDate_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_parseDate_3.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_parseDate_3 = _jspx_th_fmt_parseDate_3.doStartTag();
    if (_jspx_th_fmt_parseDate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_parseDate_3);
      return true;
    }
    _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_parseDate_3);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_var_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_22);
    _jspx_th_fmt_formatDate_3.setVar("dtAtu");
    _jspx_th_fmt_formatDate_3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${converteDT}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_3.setType("date");
    int _jspx_eval_fmt_formatDate_3 = _jspx_th_fmt_formatDate_3.doStartTag();
    if (_jspx_th_fmt_formatDate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_var_value_type_nobody.reuse(_jspx_th_fmt_formatDate_3);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_var_value_type_nobody.reuse(_jspx_th_fmt_formatDate_3);
    return false;
  }

  private boolean _jspx_meth_c_choose_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_24 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_24.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_22);
    int _jspx_eval_c_choose_24 = _jspx_th_c_choose_24.doStartTag();
    if (_jspx_eval_c_choose_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_41((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_24, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_24, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_choose_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_24);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_24);
    return false;
  }

  private boolean _jspx_meth_c_when_41(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_41 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_41.setPageContext(_jspx_page_context);
    _jspx_th_c_when_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_24);
    _jspx_th_c_when_41.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${converteDT gt hoje }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_41 = _jspx_th_c_when_41.doStartTag();
    if (_jspx_eval_c_when_41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_when_41.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_41);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_41);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_23 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_23.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_24);
    int _jspx_eval_c_otherwise_23 = _jspx_th_c_otherwise_23.doStartTag();
    if (_jspx_eval_c_otherwise_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    ");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_23, _jspx_page_context))
          return true;
        out.write("   \r\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_23);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_23);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_23);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtAtu}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_25 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_25.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_25.setParent(null);
    int _jspx_eval_c_choose_25 = _jspx_th_c_choose_25.doStartTag();
    if (_jspx_eval_c_choose_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_42((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_25, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_43((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_25, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_25, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_25);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_25);
    return false;
  }

  private boolean _jspx_meth_c_when_42(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_42 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_42.setPageContext(_jspx_page_context);
    _jspx_th_c_when_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_25);
    _jspx_th_c_when_42.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_42 = _jspx_th_c_when_42.doStartTag();
    if (_jspx_eval_c_when_42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <input type=\"text\" id=\"form-field-1\" class=\"col-sm-8 col-xs-12\"  name=\"nmAutor\" \r\n");
        out.write("                                                               value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmAutor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Nome \" required=\"required\" readonly=\"readonly\" >\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_42.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_42);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_42);
    return false;
  }

  private boolean _jspx_meth_c_when_43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_43 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_43.setPageContext(_jspx_page_context);
    _jspx_th_c_when_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_25);
    _jspx_th_c_when_43.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_43 = _jspx_th_c_when_43.doStartTag();
    if (_jspx_eval_c_when_43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <input type=\"text\" id=\"form-field-1\" class=\"col-sm-8 col-xs-12\"  name=\"nmAutor\" value=\"");
        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_43, _jspx_page_context))
          return true;
        out.write("\" \r\n");
        out.write("                                                               placeholder=\"Nome \" required=\"required\" readonly=\"readonly\" >\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_43.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_43);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_43);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_43);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionNome}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_24 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_24.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_25);
    int _jspx_eval_c_otherwise_24 = _jspx_th_c_otherwise_24.doStartTag();
    if (_jspx_eval_c_otherwise_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmAutor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_24);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_24);
    return false;
  }

  private boolean _jspx_meth_c_choose_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_26 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_26.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_26.setParent(null);
    int _jspx_eval_c_choose_26 = _jspx_th_c_choose_26.doStartTag();
    if (_jspx_eval_c_choose_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_when_44((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_26, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_when_45((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_26, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_otherwise_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_26, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_choose_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_26);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_26);
    return false;
  }

  private boolean _jspx_meth_c_when_44(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_44 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_44.setPageContext(_jspx_page_context);
    _jspx_th_c_when_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_26);
    _jspx_th_c_when_44.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_44 = _jspx_th_c_when_44.doStartTag();
    if (_jspx_eval_c_when_44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <button class=\"btn btn-yellow\" type=\"reset\" onclick=\" location.href = 'AnotacaoCroqui.jsp';\">\r\n");
        out.write("                                                        <i class=\"ace-icon fa fa-undo bigger-110\"></i>\r\n");
        out.write("                                                        Voltar\r\n");
        out.write("                                                    </button>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_when_44.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_44);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_44);
    return false;
  }

  private boolean _jspx_meth_c_when_45(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_45 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_45.setPageContext(_jspx_page_context);
    _jspx_th_c_when_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_26);
    _jspx_th_c_when_45.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pq == '' || pg == null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_45 = _jspx_th_c_when_45.doStartTag();
    if (_jspx_eval_c_when_45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <button class=\"btn btn-yellow\" type=\"reset\" onclick=\" location.href = 'ControllerServlet?acao=AnotacaoCroquiLista';\">\r\n");
        out.write("                                                        <i class=\"ace-icon fa fa-undo bigger-110\"></i>\r\n");
        out.write("                                                        Voltar\r\n");
        out.write("                                                    </button>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_when_45.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_45);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_45);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_25 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_25.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_26);
    int _jspx_eval_c_otherwise_25 = _jspx_th_c_otherwise_25.doStartTag();
    if (_jspx_eval_c_otherwise_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <button class=\"btn btn-yellow\" type=\"reset\" onclick=\" location.href = 'ControllerServlet?acao=AnotacaoCroquiLista&pg=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&pi=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&pf=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&qCroqui=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qCroqui}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&qArea=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qArea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&qNome=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qNome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&qEndereco=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&qAssunto=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qAssunto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&dtIni=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtIni}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&dtFim=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtFim}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("';\">\r\n");
        out.write("                                                        <i class=\"ace-icon fa fa-undo bigger-110\"></i>\r\n");
        out.write("                                                        Voltar\r\n");
        out.write("                                                    </button>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_25);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_25);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao !='view'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <button class=\"btn btn-success\" type=\"submit\" id=\"salvar\">\r\n");
        out.write("                                                    <i class=\"ace-icon fa fa-save bigger-110\"></i>\r\n");
        out.write("                                                    Salvar\r\n");
        out.write("                                                </button>\r\n");
        out.write("\r\n");
        out.write("                                                <button class=\"btn\" type=\"reset\">\r\n");
        out.write("                                                    <i class=\"ace-icon fa fa-eraser bigger-110\"></i>\r\n");
        out.write("                                                    Limpar\r\n");
        out.write("                                                </button>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao=='insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled-li-menu");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_set_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_22 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_22.setPageContext(_jspx_page_context);
    _jspx_th_c_set_22.setParent(null);
    _jspx_th_c_set_22.setVar("arCroqui");
    _jspx_th_c_set_22.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Arquivo.pkArquivo(anotCroqui.pkAnotacaoExpediente,'AnotacaoExpediente','Croqui')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_22 = _jspx_th_c_set_22.doStartTag();
    if (_jspx_th_c_set_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_22);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_22);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arCroqui.pkArquivo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("ar");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Arquivo.listArquivo(anotCroqui.pkAnotacaoExpediente, 'AnotacaoExpediente')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("    \r\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ar.nmTipo == 'Croqui'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <a href=\"");
        if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("/Arquivo/Croqui/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ar.nmNomeArquivo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" target=\"_blank\"><img src=\"img/img-planta.png\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ar.nmNome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" width=\"60%\" height=\"60%\"/></a>\r\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(sessionSgDivisao == 'DIPI' &&sessionSgSetor == 'SIC')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <label class=\"inline col-md-3\">\r\n");
        out.write("                                                            <input type=\"text\" class=\"col-xs-12 col-md-12\" name=\"nmNome\" placeholder=\"Nome do Croqui\" required=\"required\" >\r\n");
        out.write("                                                        </label>\r\n");
        out.write("\r\n");
        out.write("                                                        <label class=\"inline col-md-3 col-xs-12\">\r\n");
        out.write("                                                            <input type=\"file\"  id=\"id-input-file-2\" name=\"UploadCroqui\" required=\"required\"><span class=\"ace-file-container\" data-title=\"Choose\"><span class=\"ace-file-name\" data-title=\"No File ...\"></span></span>\r\n");
        out.write("                                                        </label>\r\n");
        out.write("                                                        <label class=\"inline col-md-2 col-xs-12\">\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_set_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_choose_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        </label> \r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_set_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_23 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_23.setPageContext(_jspx_page_context);
    _jspx_th_c_set_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_set_23.setVar("idCroqui");
    _jspx_th_c_set_23.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Arquivo.pkArquivo(anotCroqui.pkAnotacaoExpediente,'AnotacaoExpediente', 'Croqui')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_23 = _jspx_th_c_set_23.doStartTag();
    if (_jspx_th_c_set_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_23);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_23);
    return false;
  }

  private boolean _jspx_meth_c_choose_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_27 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_27.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    int _jspx_eval_c_choose_27 = _jspx_th_c_choose_27.doStartTag();
    if (_jspx_eval_c_choose_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_46((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_choose_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_27);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_27);
    return false;
  }

  private boolean _jspx_meth_c_when_46(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_46 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_46.setPageContext(_jspx_page_context);
    _jspx_th_c_when_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_27);
    _jspx_th_c_when_46.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ idCroqui.pkArquivo != '0'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_46 = _jspx_th_c_when_46.doStartTag();
    if (_jspx_eval_c_when_46 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <button class=\"btn btn-yellow\"  type=\"submit\">\r\n");
        out.write("                                                                        <i class=\"ace-icon fa fa-save bigger-110\"></i>\r\n");
        out.write("                                                                        Substituir\r\n");
        out.write("                                                                    </button>\r\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_when_46.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_46);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_46);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_26 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_26.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_27);
    int _jspx_eval_c_otherwise_26 = _jspx_th_c_otherwise_26.doStartTag();
    if (_jspx_eval_c_otherwise_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <button class=\"btn btn-success\"  type=\"submit\">\r\n");
        out.write("                                                                        <i class=\"ace-icon fa fa-save bigger-110\"></i>\r\n");
        out.write("                                                                        Salvar\r\n");
        out.write("                                                                    </button>\r\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_26);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_26);
    return false;
  }
}
