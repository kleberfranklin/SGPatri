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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.release();
    _jspx_tagPool_c_otherwise.release();
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
      out.write("            \r\n");
      out.write("        <!--Include ação ajax e javaScritp -->        \r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/maskProcessoSelect.jsp", out, false);
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javaScritp/somenteNum.html", out, false);
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adicionarCampoArea.jsp", out, false);
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javaScritp/alertEffect.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            \r\n");
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
      out.write("                            \r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                            \r\n");
      out.write("                            <h2>Anotação Croqui</h2>\r\n");
      out.write("                            <div class=\"space-14\"></div>\r\n");
      out.write("                            <div class=\"form-horizontal\">\r\n");
      out.write("                                <div class=\"tabbable\">\r\n");
      out.write("                                    <ul class=\"nav nav-tabs padding-0\">\r\n");
      out.write("                                        <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tabCroquiActive}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            <a data-toggle=\"tab\" href=\"#cad-croqui\" aria-expanded=\"true\">\r\n");
      out.write("                                                Anotação Croqui \r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tabAnexoActive}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
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
      out.write("                                \r\n");
      out.write("                                <!--Inicio da tab-pane Cadastro Croqui-->\r\n");
      out.write("                                        <div id=\"cad-croqui\" class=\"tab-pane ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tabCroquiActive}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  >\r\n");
      out.write("                                            <form action=\"ControllerServlet?acao=AnotacaoCroquiUC\" method=\"POST\" >\r\n");
      out.write("                                                <input type=\"hidden\" name=\"pkAnotacaoExpediente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.pkAnotacaoExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                                <input type=\"hidden\" name=\"execucao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-14\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Tipo de Expediente:</strong></span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Nº Expediente:</strong></span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    <label class=\"inline col-md-6 col-xs-12\">\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"tab-content\" >\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                                               <span class=\"lbl\"><strong>Croqui:</strong></span>\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                        <label class=\"col-md-3 col-xs-12\">\r\n");
      out.write("                                                            ");
      if (_jspx_meth_c_choose_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        </label>\r\n");
      out.write("\r\n");
      out.write("                                                        <label class=\"col-md-2 col-xs-12\">\r\n");
      out.write("                                                            <span class = \"lbl\"><strong>Área:</strong></span>\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                        <label class=\"col-md-5 col-xs-12\">\r\n");
      out.write("                                                            ");
      if (_jspx_meth_c_choose_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                                            <span class=\"lbl\"><strong>Tipo endereço:</strong></span>\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                        <label class=\"inline col-md-3 col-xs-12\">\r\n");
      out.write("                                                            ");
      if (_jspx_meth_c_choose_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                        <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                                            <span class=\"lbl\"><strong>Título do endereço:</strong></span>\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                        <label class=\"inline col-md-3 col-xs-12\" >\r\n");
      out.write("                                                            ");
      if (_jspx_meth_c_choose_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                                            <span class=\"lbl\"><strong>Endereço:</strong></span>\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                        <label class=\"inline col-md-6 col-xs-12\" >\r\n");
      out.write("                                                            ");
      if (_jspx_meth_c_choose_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                        <label class=\"inline col-md-1 col-xs-12\" >\r\n");
      out.write("                                                            <span class=\"lbl\"><strong>número:</strong></span>\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                        <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                                            ");
      if (_jspx_meth_c_choose_10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                                            <span class=\"lbl\"><strong>Complemento:</strong></span>\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                        <label class=\"inline col-md-3 col-xs-12\" >\r\n");
      out.write("                                                            ");
      if (_jspx_meth_c_choose_11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                        </label>\r\n");
      out.write("\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                     <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label class=\"inline col-md-2 col-xs-12\" >  \r\n");
      out.write("                                                            <span class=\"lbl\"><strong>Referência:</strong></span>\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                        <label class=\"inline col-md-8 col-xs-12\" >\r\n");
      out.write("                                                            ");
      if (_jspx_meth_c_choose_12(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                        </label>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            <!--Abaixo div onde add o novo campo área -->\r\n");
      out.write("                                                <br /><div class=\"input_fields_wrap col-md-12 col-xs-12\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-10\"></div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Interessado:</strong></span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    <label class=\"col-sm-8 col-xs-12\">\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_13(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Assunto:</strong></span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    <label class=\"col-md-5 col-xs-12\">\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_14(_jspx_page_context))
        return;
      out.write("         \r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Despacho:</strong></span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    <label class=\"inline col-md-3 col-xs-12\" >\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_15(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Publicado no DOM:</strong></span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    <label class=\"inline col-sm-4 col-xs-12\" >\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_16(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Data de Tramitação:</strong></span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    <label class=\"inline col-sm-4 col-xs-12\" >\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_17(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"inline col-sm-2 col-xs-12\">\r\n");
      out.write("                                                        <span class=\"lbl\"><strong>Observação:</strong></span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                    <label class=\"inline col-sm-9 col-xs-12\" >\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_choose_18(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"space-1\"></div> \r\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                                                <!-- Botões-->\r\n");
      out.write("                                                <div class=\"form-actions center \">\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_choose_19(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                <!--Inicio da tab-pane Documento Anexo -->        \r\n");
      out.write("                                        <div id=\"doc-anexo\" class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${disabled}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" tab-pane ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tabAnexoActive}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \">\r\n");
      out.write("                                            <form action=\"ControllerServlet?acao=AnotacaoCroquiUploadArquivo\" enctype=\"multipart/form-data\" method=\"POST\" >\r\n");
      out.write("                                                <h4 class=\"header smaller lbl \"><strong>Documentos Anexo</strong></h4>\r\n");
      out.write("                                                <input type=\"hidden\" name=\"pkAnotCroqui\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.pkAnotacaoExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                        </div>    \r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg=='true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <div class=\"alert alert-");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${typeAlert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"alert\">\r\n");
        out.write("                                        <i class=\"ace-icon fa fa-times\"></i>\r\n");
        out.write("                                    </button>\r\n");
        out.write("                                    <strong>\r\n");
        out.write("                                        <i class=\"ace-icon fa fa-times\"></i>\r\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msgAlert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                    </strong>\r\n");
        out.write("                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtAlert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                    <br>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            ");
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
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("    \r\n");
        out.write("                                                ");
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
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.pkAnotacaoExpediente == ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"badge badge-transparent\" title=\"Pendente Validação\"><i class=\"ace-icon fa fa-exclamation-triangle red bigger-130\"></i></span>\r\n");
        out.write("                                                    ");
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
        out.write("                                                    ");
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
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("    \r\n");
        out.write("                                                ");
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
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anexoGravado != 'true' || empty listAnexo}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"badge badge-transparent\" title=\"Pendente Validação\"><i class=\"ace-icon fa fa-exclamation-triangle red bigger-130\"></i></span>\r\n");
        out.write("                                                    ");
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
        out.write("                                                    ");
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
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <select name=\"sgTpExpediente\" id=\"sgTpExpediente\" placeholder=\"\" class=\"col-md-10 col-xs-12\" \r\n");
        out.write("                                                                        onchange=\"limpaCampoNrProcesso(this)\" required=\"required\">\r\n");
        out.write("                                                                    <option>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.tpExpediente.sgTipoExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                    <option></option>\r\n");
        out.write("                                                                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                </select>\r\n");
        out.write("\r\n");
        out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_c_forEach_0.setVar("lis");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaTpExp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                        ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                                    ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.sgTipoExpediente != ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                            <option>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.sgTipoExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                        ");
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
        out.write("                                                                <input type=\"text\" class=\"col-xs-8 col-xs-12\" name=\"sgTpExpediente\" id=\"sgTpExpediente\"  \r\n");
        out.write("                                                                       value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sgTpExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  required=\"required\" readonly=\"readoly\">\r\n");
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
        out.write("                                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.tpExpediente.sgTipoExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
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
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" class=\"col-md-5 col-xs-12\" name=\"cdExpediente\" id=\"nrprocesso\" \r\n");
        out.write("                                                                    value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" required=\"required\" onblur=\"maskProcessoSelect(this);\" >\r\n");
        out.write("                                                                &nbsp;<span id=\"msgProcesso\"></span>\r\n");
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
        out.write("                                                                <input type=\"text\" class=\"col-md-5 col-xs-12\" name=\"cdExpediente\" id=\"nrprocesso\"  \r\n");
        out.write("                                                                     value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cdExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  placeholder=\"Nº do Expediente\"  required=\"required\" readonly=\"readonly\">\r\n");
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
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
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
        out.write("                                                                ");
        if (_jspx_meth_c_when_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
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
    _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
    if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <input type=\"text\" class=\"col-md-6 col-xs-12\" name=\"cdCroqui\"  onKeyPress=\"return somenteNum(event);\" \r\n");
        out.write("                                                                           value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdCroqui}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Código Croqui\" maxlength=\"6\" required=\"required\" autofocus>\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <input type=\"text\" class=\"col-md-6 col-xs-12\" name=\"cdCroqui\"  onKeyPress=\"return somenteNum(event);\" \r\n");
        out.write("                                                                           placeholder=\"Código Croqui\" maxlength=\"6\" required=\"required\" autofocus>\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdCroqui}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                                                                ");
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
        out.write("                                                                ");
        if (_jspx_meth_c_when_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
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
    _jspx_th_c_when_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
    if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <input type=\"text\" class=\"col-md-4 col-xs-12\" name=\"cdArea\"  onKeyPress=\"return somenteNum(event);\" \r\n");
        out.write("                                                                           value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdArea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" maxlength=\"4\" placeholder=\"Código Área\" required=\"required\" >\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <input type=\"text\" class=\"col-md-4 col-xs-12\" name=\"cdArea\"  onKeyPress=\"return somenteNum(event);\" \r\n");
        out.write("                                                                        maxlength=\"4\" placeholder=\"Código Área inserir\" required=\"required\">\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdArea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                                ");
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
        out.write("                                                                ");
        if (_jspx_meth_c_when_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
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
    _jspx_th_c_when_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_13 = _jspx_th_c_when_13.doStartTag();
    if (_jspx_eval_c_when_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <select class=\"col-md-12 col-xs-12\" name=\"tipoEndereco\" title=\"Rua / Avenida / Praça / etc\" required=\"required\">\r\n");
        out.write("                                                                        <option>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.tipo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                        <option></option>\r\n");
        out.write("                                                                        <option>ACESSO</option>\r\n");
        out.write("                                                                        <option>ALAMEDA</option>\r\n");
        out.write("                                                                        <option>AV. PROJETADA</option>\r\n");
        out.write("                                                                        <option>AVENIDA</option>\r\n");
        out.write("                                                                        <option>BALAO RETORNO</option>\r\n");
        out.write("                                                                        <option>BECO</option>\r\n");
        out.write("                                                                        <option>CAMINHO</option>\r\n");
        out.write("                                                                        <option>CAMINHO PART</option>\r\n");
        out.write("                                                                        <option>CAMINHO PEDEST</option>\r\n");
        out.write("                                                                        <option>COMPLEXO VIARIO</option>\r\n");
        out.write("                                                                        <option>DESVIO</option>\r\n");
        out.write("                                                                        <option>DIV</option>\r\n");
        out.write("                                                                        <option>ENT</option>\r\n");
        out.write("                                                                        <option>ES. PROJETADA</option>\r\n");
        out.write("                                                                        <option>ESC</option>\r\n");
        out.write("                                                                        <option>ESPACO LIVRE</option>\r\n");
        out.write("                                                                        <option>ESPLANADA</option>\r\n");
        out.write("                                                                        <option>EST. DE RODAGEM</option>\r\n");
        out.write("                                                                        <option>ESTACIONAMENTO</option>\r\n");
        out.write("                                                                        <option>ESTR. DE FERRO</option>\r\n");
        out.write("                                                                        <option>ESTRADA</option>\r\n");
        out.write("                                                                        <option>ESTRADA PART</option>\r\n");
        out.write("                                                                        <option>GALERIA</option>\r\n");
        out.write("                                                                        <option>JARDIM</option>\r\n");
        out.write("                                                                        <option>LADEIRA</option>\r\n");
        out.write("                                                                        <option>LARGO</option>\r\n");
        out.write("                                                                        <option>PARQUE</option>\r\n");
        out.write("                                                                        <option>PASSAGEM</option>\r\n");
        out.write("                                                                        <option>PASSAGEM PART</option>\r\n");
        out.write("                                                                        <option>PASSARELA</option>\r\n");
        out.write("                                                                        <option>PATIO</option>\r\n");
        out.write("                                                                        <option>PONTE</option>\r\n");
        out.write("                                                                        <option>PONTILHAO</option>\r\n");
        out.write("                                                                        <option>PQE</option>\r\n");
        out.write("                                                                        <option>PQL</option>\r\n");
        out.write("                                                                        <option>PQM</option>\r\n");
        out.write("                                                                        <option>PRACA</option>\r\n");
        out.write("                                                                        <option>PRACA MANOBRA</option>\r\n");
        out.write("                                                                        <option>PRACA PROJETADA</option>\r\n");
        out.write("                                                                        <option>PRACA RETORNO</option>\r\n");
        out.write("                                                                        <option>PRO</option>\r\n");
        out.write("                                                                        <option>PS PROJETADA</option>\r\n");
        out.write("                                                                        <option>PS. DE PEDESTRE</option>\r\n");
        out.write("                                                                        <option>PS. SUBTERRANEA</option>\r\n");
        out.write("                                                                        <option>RODOVIA</option>\r\n");
        out.write("                                                                        <option>RUA</option>\r\n");
        out.write("                                                                        <option>RUA PART</option>\r\n");
        out.write("                                                                        <option>RUA PROJETADA</option>\r\n");
        out.write("                                                                        <option>SERVIDAO</option>\r\n");
        out.write("                                                                        <option>TRAVESSA</option>\r\n");
        out.write("                                                                        <option>TRAVESSA PART</option>\r\n");
        out.write("                                                                        <option>TUNEL</option>\r\n");
        out.write("                                                                        <option>TV PROJETADA</option>\r\n");
        out.write("                                                                        <option>VEREDA</option>\r\n");
        out.write("                                                                        <option>VIA</option>\r\n");
        out.write("                                                                        <option>VIA CIRC PEDEST</option>\r\n");
        out.write("                                                                        <option>VIA DE PEDESTRE</option>\r\n");
        out.write("                                                                        <option>VIA ELEVADA</option>\r\n");
        out.write("                                                                        <option>VIADUTO</option>\r\n");
        out.write("                                                                        <option>VIELA</option>\r\n");
        out.write("                                                                        <option>VIELA PART</option>\r\n");
        out.write("                                                                        <option>VIELA PROJETADA</option>\r\n");
        out.write("                                                                        <option>VIELA SANITARIA</option>\r\n");
        out.write("                                                                        <option>VILA</option>\r\n");
        out.write("                                                                        <option>VLP</option>\r\n");
        out.write("                                                                    </select>\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <select class=\"col-md-12 col-xs-12\" name=\"tipoEndereco\" title=\"Rua / Avenida / Praça / etc\" required=\"required\">\r\n");
        out.write("                                                                        <option></option>\r\n");
        out.write("                                                                        <option>ACESSO</option>\r\n");
        out.write("                                                                        <option>ALAMEDA</option>\r\n");
        out.write("                                                                        <option>AV. PROJETADA</option>\r\n");
        out.write("                                                                        <option>AVENIDA</option>\r\n");
        out.write("                                                                        <option>BALAO RETORNO</option>\r\n");
        out.write("                                                                        <option>BECO</option>\r\n");
        out.write("                                                                        <option>CAMINHO</option>\r\n");
        out.write("                                                                        <option>CAMINHO PART</option>\r\n");
        out.write("                                                                        <option>CAMINHO PEDEST</option>\r\n");
        out.write("                                                                        <option>COMPLEXO VIARIO</option>\r\n");
        out.write("                                                                        <option>DESVIO</option>\r\n");
        out.write("                                                                        <option>DIV</option>\r\n");
        out.write("                                                                        <option>ENT</option>\r\n");
        out.write("                                                                        <option>ES. PROJETADA</option>\r\n");
        out.write("                                                                        <option>ESC</option>\r\n");
        out.write("                                                                        <option>ESPACO LIVRE</option>\r\n");
        out.write("                                                                        <option>ESPLANADA</option>\r\n");
        out.write("                                                                        <option>EST. DE RODAGEM</option>\r\n");
        out.write("                                                                        <option>ESTACIONAMENTO</option>\r\n");
        out.write("                                                                        <option>ESTR. DE FERRO</option>\r\n");
        out.write("                                                                        <option>ESTRADA</option>\r\n");
        out.write("                                                                        <option>ESTRADA PART</option>\r\n");
        out.write("                                                                        <option>GALERIA</option>\r\n");
        out.write("                                                                        <option>JARDIM</option>\r\n");
        out.write("                                                                        <option>LADEIRA</option>\r\n");
        out.write("                                                                        <option>LARGO</option>\r\n");
        out.write("                                                                        <option>PARQUE</option>\r\n");
        out.write("                                                                        <option>PASSAGEM</option>\r\n");
        out.write("                                                                        <option>PASSAGEM PART</option>\r\n");
        out.write("                                                                        <option>PASSARELA</option>\r\n");
        out.write("                                                                        <option>PATIO</option>\r\n");
        out.write("                                                                        <option>PONTE</option>\r\n");
        out.write("                                                                        <option>PONTILHAO</option>\r\n");
        out.write("                                                                        <option>PQE</option>\r\n");
        out.write("                                                                        <option>PQL</option>\r\n");
        out.write("                                                                        <option>PQM</option>\r\n");
        out.write("                                                                        <option>PRACA</option>\r\n");
        out.write("                                                                        <option>PRACA MANOBRA</option>\r\n");
        out.write("                                                                        <option>PRACA PROJETADA</option>\r\n");
        out.write("                                                                        <option>PRACA RETORNO</option>\r\n");
        out.write("                                                                        <option>PRO</option>\r\n");
        out.write("                                                                        <option>PS PROJETADA</option>\r\n");
        out.write("                                                                        <option>PS. DE PEDESTRE</option>\r\n");
        out.write("                                                                        <option>PS. SUBTERRANEA</option>\r\n");
        out.write("                                                                        <option>RODOVIA</option>\r\n");
        out.write("                                                                        <option>RUA</option>\r\n");
        out.write("                                                                        <option>RUA PART</option>\r\n");
        out.write("                                                                        <option>RUA PROJETADA</option>\r\n");
        out.write("                                                                        <option>SERVIDAO</option>\r\n");
        out.write("                                                                        <option>TRAVESSA</option>\r\n");
        out.write("                                                                        <option>TRAVESSA PART</option>\r\n");
        out.write("                                                                        <option>TUNEL</option>\r\n");
        out.write("                                                                        <option>TV PROJETADA</option>\r\n");
        out.write("                                                                        <option>VEREDA</option>\r\n");
        out.write("                                                                        <option>VIA</option>\r\n");
        out.write("                                                                        <option>VIA CIRC PEDEST</option>\r\n");
        out.write("                                                                        <option>VIA DE PEDESTRE</option>\r\n");
        out.write("                                                                        <option>VIA ELEVADA</option>\r\n");
        out.write("                                                                        <option>VIADUTO</option>\r\n");
        out.write("                                                                        <option>VIELA</option>\r\n");
        out.write("                                                                        <option>VIELA PART</option>\r\n");
        out.write("                                                                        <option>VIELA PROJETADA</option>\r\n");
        out.write("                                                                        <option>VIELA SANITARIA</option>\r\n");
        out.write("                                                                        <option>VILA</option>\r\n");
        out.write("                                                                        <option>VLP</option>\r\n");
        out.write("                                                                    </select>\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.tipo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </span> \r\n");
        out.write("                                                                ");
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
        out.write("                                                                ");
        if (_jspx_meth_c_when_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
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
    _jspx_th_c_when_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_15 = _jspx_th_c_when_15.doStartTag();
    if (_jspx_eval_c_when_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <select class=\"col-md-12 col-xs-12\" name=\"tituloEndereco\" title=\"Capitão / Doutor / Dom / etc\">\r\n");
        out.write("                                                                        <option>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.titulo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                        <option></option>\r\n");
        out.write("                                                                        <option>ABADE</option>\r\n");
        out.write("                                                                        <option>ACADEMICO</option>\r\n");
        out.write("                                                                        <option>ADVOGADO</option>\r\n");
        out.write("                                                                        <option>AGENTE</option>\r\n");
        out.write("                                                                        <option>AGRIC</option>\r\n");
        out.write("                                                                        <option>AGRIMENSOR</option>\r\n");
        out.write("                                                                        <option>AJUDANTE</option>\r\n");
        out.write("                                                                        <option>ALFERES</option>\r\n");
        out.write("                                                                        <option>ALMIRANTE</option>\r\n");
        out.write("                                                                        <option>APOSTOLO</option>\r\n");
        out.write("                                                                        <option>ARCEBISPO</option>\r\n");
        out.write("                                                                        <option>ARCIP</option>\r\n");
        out.write("                                                                        <option>ARCJO</option>\r\n");
        out.write("                                                                        <option>ARQUITETA</option>\r\n");
        out.write("                                                                        <option>ARQUITETO</option>\r\n");
        out.write("                                                                        <option>ARQUITETO PROFESSOR</option>\r\n");
        out.write("                                                                        <option>ASPIRANTE</option>\r\n");
        out.write("                                                                        <option>AVENIDA</option>\r\n");
        out.write("                                                                        <option>AVIADOR</option>\r\n");
        out.write("                                                                        <option>AVIADORA</option>\r\n");
        out.write("                                                                        <option>BACHAREL</option>\r\n");
        out.write("                                                                        <option>BANDEIRANTE</option>\r\n");
        out.write("                                                                        <option>BANQUEIRO</option>\r\n");
        out.write("                                                                        <option>BARAO</option>\r\n");
        out.write("                                                                        <option>BARONESA</option>\r\n");
        out.write("                                                                        <option>BEATO PADRE</option>\r\n");
        out.write("                                                                        <option>BEM AVENTURADO</option>\r\n");
        out.write("                                                                        <option>BENEMERITO</option>\r\n");
        out.write("                                                                        <option>BISPO</option>\r\n");
        out.write("                                                                        <option>BRIGADEIRO</option>\r\n");
        out.write("                                                                        <option>CABO</option>\r\n");
        out.write("                                                                        <option>CABO PM</option>\r\n");
        out.write("                                                                        <option>CADETE</option>\r\n");
        out.write("                                                                        <option>CAMPEADOR</option>\r\n");
        out.write("                                                                        <option>CAPITAO</option>\r\n");
        out.write("                                                                        <option>CAPITAO ALMIRANTE</option>\r\n");
        out.write("                                                                        <option>CAPITAO DE FRAGATA</option>\r\n");
        out.write("                                                                        <option>CAPITAO DE MAR E GUERRA</option>\r\n");
        out.write("                                                                        <option>CAPITAO GENERAL</option>\r\n");
        out.write("                                                                        <option>CAPITAO MOR</option>\r\n");
        out.write("                                                                        <option>CAPITAO PM</option>\r\n");
        out.write("                                                                        <option>CAPITAO TENENTE</option>\r\n");
        out.write("                                                                        <option>CAR</option>\r\n");
        out.write("                                                                        <option>CARDEAL</option>\r\n");
        out.write("                                                                        <option>CATEQUISTA</option>\r\n");
        out.write("                                                                        <option>CAVALEIRO</option>\r\n");
        out.write("                                                                        <option>CAVALHEIRO</option>\r\n");
        out.write("                                                                        <option>CINEASTA</option>\r\n");
        out.write("                                                                        <option>COMANDANTE</option>\r\n");
        out.write("                                                                        <option>COMEDIANTE</option>\r\n");
        out.write("                                                                        <option>COMENDADOR</option>\r\n");
        out.write("                                                                        <option>COMISSARIA</option>\r\n");
        out.write("                                                                        <option>COMISSARIO</option>\r\n");
        out.write("                                                                        <option>COMPOSITOR</option>\r\n");
        out.write("                                                                        <option>CONDE</option>\r\n");
        out.write("                                                                        <option>CONDESSA</option>\r\n");
        out.write("                                                                        <option>CONEGO</option>\r\n");
        out.write("                                                                        <option>CONFRADE</option>\r\n");
        out.write("                                                                        <option>CONSELHEIRO</option>\r\n");
        out.write("                                                                        <option>CONSUL</option>\r\n");
        out.write("                                                                        <option>CORONEL</option>\r\n");
        out.write("                                                                        <option>CORONEL PM</option>\r\n");
        out.write("                                                                        <option>CORREGEDOR</option>>\r\n");
        out.write("                                                                        <option>DEPUTADA</option>\r\n");
        out.write("                                                                        <option>DELEGADO</option>\r\n");
        out.write("                                                                        <option>DENTISTA</option\r\n");
        out.write("                                                                        <option>DEPUTADO</option>\r\n");
        out.write("                                                                        <option>DEPUTADO DOUTOR</option>\r\n");
        out.write("                                                                        <option>DESEMBARGADOR</option>\r\n");
        out.write("                                                                        <option>DIACO</option>\r\n");
        out.write("                                                                        <option>DOM</option>\r\n");
        out.write("                                                                        <option>DONA</option>\r\n");
        out.write("                                                                        <option>DOUTOR</option>\r\n");
        out.write("                                                                        <option>DOUTORA</option>\r\n");
        out.write("                                                                        <option>DUQUE</option>\r\n");
        out.write("                                                                        <option>DUQUESA</option>\r\n");
        out.write("                                                                        <option>EDITOR</option>\r\n");
        out.write("                                                                        <option>EDUCADOR</option>\r\n");
        out.write("                                                                        <option>EDUCADORA</option>\r\n");
        out.write("                                                                        <option>EMBAIXADOR</option>\r\n");
        out.write("                                                                        <option>EMBAIXADORA</option>\r\n");
        out.write("                                                                        <option>EMP</option>\r\n");
        out.write("                                                                        <option>ENGENHEIRA</option>\r\n");
        out.write("                                                                        <option>ENGENHEIRO</option>\r\n");
        out.write("                                                                        <option>ESCOTEIRO</option>\r\n");
        out.write("                                                                        <option>ESCRAVO</option>\r\n");
        out.write("                                                                        <option>ESCRITOR</option>\r\n");
        out.write("                                                                        <option>EXPEDICIONARIO</option>\r\n");
        out.write("                                                                        <option>FISICO</option>\r\n");
        out.write("                                                                        <option>FREI</option>\r\n");
        out.write("                                                                        <option>GENERAL</option>\r\n");
        out.write("                                                                        <option>GOVERNADOR</option>\r\n");
        out.write("                                                                        <option>GRUMETE</option>\r\n");
        out.write("                                                                        <option>GUARDA CIVIL METROPOLITANO</option>\r\n");
        out.write("                                                                        <option>IMACULADA</option>\r\n");
        out.write("                                                                        <option>IMPERADOR</option>\r\n");
        out.write("                                                                        <option>IMPERATRIZ</option>\r\n");
        out.write("                                                                        <option>INFANTE</option>\r\n");
        out.write("                                                                        <option>INSPETOR</option>\r\n");
        out.write("                                                                        <option>IRMA</option>\r\n");
        out.write("                                                                        <option>IRMAO</option>\r\n");
        out.write("                                                                        <option>IRMAOS</option>\r\n");
        out.write("                                                                        <option>IRMAS</option>\r\n");
        out.write("                                                                        <option>JORNALISTA</option>\r\n");
        out.write("                                                                        <option>LIBERTADOR</option>\r\n");
        out.write("                                                                        <option>LIDCO</option>\r\n");
        out.write("                                                                        <option>LIVREIRO</option>\r\n");
        out.write("                                                                        <option>LORDE</option>\r\n");
        out.write("                                                                        <option>MADAME</option>\r\n");
        out.write("                                                                        <option>MADRE</option>\r\n");
        out.write("                                                                        <option>MAESTRO</option>\r\n");
        out.write("                                                                        <option>MAJOR</option>\r\n");
        out.write("                                                                        <option>MAJOR AVIADOR</option>\r\n");
        out.write("                                                                        <option>MAJOR BRIGADEIRO</option>\r\n");
        out.write("                                                                        <option>MAQUINISTA</option>\r\n");
        out.write("                                                                        <option>MARECHAL</option>\r\n");
        out.write("                                                                        <option>MARECHAL DO AR</option>\r\n");
        out.write("                                                                        <option>MARQUES</option>\r\n");
        out.write("                                                                        <option>MARQUESA</option>\r\n");
        out.write("                                                                        <option>MERE</option>\r\n");
        out.write("                                                                        <option>MESTRAS</option>\r\n");
        out.write("                                                                        <option>MESTRE</option>\r\n");
        out.write("                                                                        <option>MESTRES</option>\r\n");
        out.write("                                                                        <option>MILITANTE</option>\r\n");
        out.write("                                                                        <option>MINISTRO</option>\r\n");
        out.write("                                                                        <option>MISSIONARIA</option>\r\n");
        out.write("                                                                        <option>MISSIONARIO</option>\r\n");
        out.write("                                                                        <option>MONGE</option>\r\n");
        out.write("                                                                        <option>MONSENHOR</option>\r\n");
        out.write("                                                                        <option>MUNIC</option>\r\n");
        out.write("                                                                        <option>MUSICO</option>\r\n");
        out.write("                                                                        <option>NOSSA SENHORA</option>\r\n");
        out.write("                                                                        <option>NOSSO SENHOR</option>\r\n");
        out.write("                                                                        <option>OUVIDOR</option>\r\n");
        out.write("                                                                        <option>PADRE</option>\r\n");
        out.write("                                                                        <option>PADRES</option>\r\n");
        out.write("                                                                        <option>PAI</option>\r\n");
        out.write("                                                                        <option>PAPA</option>\r\n");
        out.write("                                                                        <option>PASTOR</option>\r\n");
        out.write("                                                                        <option>PATRIARCA</option>\r\n");
        out.write("                                                                        <option>POETA</option>\r\n");
        out.write("                                                                        <option>POETISA</option>\r\n");
        out.write("                                                                        <option>PREFEITO</option>\r\n");
        out.write("                                                                        <option>PRESIDENTE</option>\r\n");
        out.write("                                                                        <option>PRESIDENTE DA ACAD.BRAS.LETRAS</option>\r\n");
        out.write("                                                                        <option>PREVR</option>\r\n");
        out.write("                                                                        <option>PRIMEIRO SARGENTO</option>\r\n");
        out.write("                                                                        <option>PRIMEIRO SARGENTO PM</option>\r\n");
        out.write("                                                                        <option>PRIMEIRO TENENTE</option>\r\n");
        out.write("                                                                        <option>PRIMEIRO TENENTE PM</option>\r\n");
        out.write("                                                                        <option>PRINCESA</option>\r\n");
        out.write("                                                                        <option>PRINCIPE</option>\r\n");
        out.write("                                                                        <option>PROCURADOR</option>\r\n");
        out.write("                                                                        <option>PROFESSOR</option>\r\n");
        out.write("                                                                        <option>PROFESSOR DOUTOR</option>\r\n");
        out.write("                                                                        <option>PROFESSOR ENGENHEIRO</option>\r\n");
        out.write("                                                                        <option>PROFESSORA</option>\r\n");
        out.write("                                                                        <option>PROFETA</option>\r\n");
        out.write("                                                                        <option>PROMOTOR</option>\r\n");
        out.write("                                                                        <option>PROVEDOR</option>\r\n");
        out.write("                                                                        <option>PROVEDOR MOR</option>\r\n");
        out.write("                                                                        <option>RABINO</option>\r\n");
        out.write("                                                                        <option>RADIALISTA</option>\r\n");
        out.write("                                                                        <option>RAINHA</option>\r\n");
        out.write("                                                                        <option>REGENTE</option>\r\n");
        out.write("                                                                        <option>REI</option>\r\n");
        out.write("                                                                        <option>REVERENDO</option>\r\n");
        out.write("                                                                        <option>RUA</option>\r\n");
        out.write("                                                                        <option>SACERDOTE</option>\r\n");
        out.write("                                                                        <option>SANTA</option>\r\n");
        out.write("                                                                        <option>SANTO</option>\r\n");
        out.write("                                                                        <option>SAO</option>\r\n");
        out.write("                                                                        <option>SARGENTO</option>\r\n");
        out.write("                                                                        <option>SARGENTO MOR</option>\r\n");
        out.write("                                                                        <option>SARGENTO PM</option>\r\n");
        out.write("                                                                        <option>SEGUNDO SARGENTO</option>\r\n");
        out.write("                                                                        <option>SEGUNDO SARGENTO PM</option>\r\n");
        out.write("                                                                        <option>SEGUNDO TENENTE</option>\r\n");
        out.write("                                                                        <option>SENADOR</option>\r\n");
        out.write("                                                                        <option>SENHOR</option>\r\n");
        out.write("                                                                        <option>SENHORA</option>\r\n");
        out.write("                                                                        <option>SERTANISTA</option>\r\n");
        out.write("                                                                        <option>SINHA</option>\r\n");
        out.write("                                                                        <option>SIR</option>\r\n");
        out.write("                                                                        <option>SOCIOLOGO</option>\r\n");
        out.write("                                                                        <option>SOLDADO</option>\r\n");
        out.write("                                                                        <option>SOLDADO PM</option>\r\n");
        out.write("                                                                        <option>SOROR</option>\r\n");
        out.write("                                                                        <option>SUB TENENTE</option>\r\n");
        out.write("                                                                        <option>TENENTE</option>\r\n");
        out.write("                                                                        <option>TENENTE AVIADOR</option>\r\n");
        out.write("                                                                        <option>TENENTE BRIGADEIRO</option>\r\n");
        out.write("                                                                        <option>TENENTE CORONEL</option>\r\n");
        out.write("                                                                        <option>TENENTE CORONEL PM</option>\r\n");
        out.write("                                                                        <option>TEOLOGO</option>\r\n");
        out.write("                                                                        <option>TERCEIRO SARGENTO</option>\r\n");
        out.write("                                                                        <option>TERCEIRO SARGENTO PM</option>\r\n");
        out.write("                                                                        <option>TIA</option>\r\n");
        out.write("                                                                        <option>VEREADOR</option>\r\n");
        out.write("                                                                        <option>VICE ALMIRANTE</option>\r\n");
        out.write("                                                                        <option>VICE REI</option>\r\n");
        out.write("                                                                        <option>VIGARIO</option>\r\n");
        out.write("                                                                        <option>VISCONDE</option>\r\n");
        out.write("                                                                        <option>VISCONDESSA</option>\r\n");
        out.write("                                                                        <option>VOLUNTARIO</option>\r\n");
        out.write("                                                                    </select>\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <select class=\"col-md-12 col-xs-12\" name=\"tituloEndereco\" title=\"Capitão / Doutor / Dom / etc\">\r\n");
        out.write("                                                                        <option></option>\r\n");
        out.write("                                                                        <option>ABADE</option>\r\n");
        out.write("                                                                        <option>ACADEMICO</option>\r\n");
        out.write("                                                                        <option>ADVOGADO</option>\r\n");
        out.write("                                                                        <option>AGENTE</option>\r\n");
        out.write("                                                                        <option>AGRIC</option>\r\n");
        out.write("                                                                        <option>AGRIMENSOR</option>\r\n");
        out.write("                                                                        <option>AJUDANTE</option>\r\n");
        out.write("                                                                        <option>ALFERES</option>\r\n");
        out.write("                                                                        <option>ALMIRANTE</option>\r\n");
        out.write("                                                                        <option>APOSTOLO</option>\r\n");
        out.write("                                                                        <option>ARCEBISPO</option>\r\n");
        out.write("                                                                        <option>ARCIP</option>\r\n");
        out.write("                                                                        <option>ARCJO</option>\r\n");
        out.write("                                                                        <option>ARQUITETA</option>\r\n");
        out.write("                                                                        <option>ARQUITETO</option>\r\n");
        out.write("                                                                        <option>ARQUITETO PROFESSOR</option>\r\n");
        out.write("                                                                        <option>ASPIRANTE</option>\r\n");
        out.write("                                                                        <option>AVENIDA</option>\r\n");
        out.write("                                                                        <option>AVIADOR</option>\r\n");
        out.write("                                                                        <option>AVIADORA</option>\r\n");
        out.write("                                                                        <option>BACHAREL</option>\r\n");
        out.write("                                                                        <option>BANDEIRANTE</option>\r\n");
        out.write("                                                                        <option>BANQUEIRO</option>\r\n");
        out.write("                                                                        <option>BARAO</option>\r\n");
        out.write("                                                                        <option>BARONESA</option>\r\n");
        out.write("                                                                        <option>BEATO PADRE</option>\r\n");
        out.write("                                                                        <option>BEM AVENTURADO</option>\r\n");
        out.write("                                                                        <option>BENEMERITO</option>\r\n");
        out.write("                                                                        <option>BISPO</option>\r\n");
        out.write("                                                                        <option>BRIGADEIRO</option>\r\n");
        out.write("                                                                        <option>CABO</option>\r\n");
        out.write("                                                                        <option>CABO PM</option>\r\n");
        out.write("                                                                        <option>CADETE</option>\r\n");
        out.write("                                                                        <option>CAMPEADOR</option>\r\n");
        out.write("                                                                        <option>CAPITAO</option>\r\n");
        out.write("                                                                        <option>CAPITAO ALMIRANTE</option>\r\n");
        out.write("                                                                        <option>CAPITAO DE FRAGATA</option>\r\n");
        out.write("                                                                        <option>CAPITAO DE MAR E GUERRA</option>\r\n");
        out.write("                                                                        <option>CAPITAO GENERAL</option>\r\n");
        out.write("                                                                        <option>CAPITAO MOR</option>\r\n");
        out.write("                                                                        <option>CAPITAO PM</option>\r\n");
        out.write("                                                                        <option>CAPITAO TENENTE</option>\r\n");
        out.write("                                                                        <option>CAR</option>\r\n");
        out.write("                                                                        <option>CARDEAL</option>\r\n");
        out.write("                                                                        <option>CATEQUISTA</option>\r\n");
        out.write("                                                                        <option>CAVALEIRO</option>\r\n");
        out.write("                                                                        <option>CAVALHEIRO</option>\r\n");
        out.write("                                                                        <option>CINEASTA</option>\r\n");
        out.write("                                                                        <option>COMANDANTE</option>\r\n");
        out.write("                                                                        <option>COMEDIANTE</option>\r\n");
        out.write("                                                                        <option>COMENDADOR</option>\r\n");
        out.write("                                                                        <option>COMISSARIA</option>\r\n");
        out.write("                                                                        <option>COMISSARIO</option>\r\n");
        out.write("                                                                        <option>COMPOSITOR</option>\r\n");
        out.write("                                                                        <option>CONDE</option>\r\n");
        out.write("                                                                        <option>CONDESSA</option>\r\n");
        out.write("                                                                        <option>CONEGO</option>\r\n");
        out.write("                                                                        <option>CONFRADE</option>\r\n");
        out.write("                                                                        <option>CONSELHEIRO</option>\r\n");
        out.write("                                                                        <option>CONSUL</option>\r\n");
        out.write("                                                                        <option>CORONEL</option>\r\n");
        out.write("                                                                        <option>CORONEL PM</option>\r\n");
        out.write("                                                                        <option>CORREGEDOR</option>>\r\n");
        out.write("                                                                        <option>DEPUTADA</option>\r\n");
        out.write("                                                                        <option>DELEGADO</option>\r\n");
        out.write("                                                                        <option>DENTISTA</option\r\n");
        out.write("                                                                        <option>DEPUTADO</option>\r\n");
        out.write("                                                                        <option>DEPUTADO DOUTOR</option>\r\n");
        out.write("                                                                        <option>DESEMBARGADOR</option>\r\n");
        out.write("                                                                        <option>DIACO</option>\r\n");
        out.write("                                                                        <option>DOM</option>\r\n");
        out.write("                                                                        <option>DONA</option>\r\n");
        out.write("                                                                        <option>DOUTOR</option>\r\n");
        out.write("                                                                        <option>DOUTORA</option>\r\n");
        out.write("                                                                        <option>DUQUE</option>\r\n");
        out.write("                                                                        <option>DUQUESA</option>\r\n");
        out.write("                                                                        <option>EDITOR</option>\r\n");
        out.write("                                                                        <option>EDUCADOR</option>\r\n");
        out.write("                                                                        <option>EDUCADORA</option>\r\n");
        out.write("                                                                        <option>EMBAIXADOR</option>\r\n");
        out.write("                                                                        <option>EMBAIXADORA</option>\r\n");
        out.write("                                                                        <option>EMP</option>\r\n");
        out.write("                                                                        <option>ENGENHEIRA</option>\r\n");
        out.write("                                                                        <option>ENGENHEIRO</option>\r\n");
        out.write("                                                                        <option>ESCOTEIRO</option>\r\n");
        out.write("                                                                        <option>ESCRAVO</option>\r\n");
        out.write("                                                                        <option>ESCRITOR</option>\r\n");
        out.write("                                                                        <option>EXPEDICIONARIO</option>\r\n");
        out.write("                                                                        <option>FISICO</option>\r\n");
        out.write("                                                                        <option>FREI</option>\r\n");
        out.write("                                                                        <option>GENERAL</option>\r\n");
        out.write("                                                                        <option>GOVERNADOR</option>\r\n");
        out.write("                                                                        <option>GRUMETE</option>\r\n");
        out.write("                                                                        <option>GUARDA CIVIL METROPOLITANO</option>\r\n");
        out.write("                                                                        <option>IMACULADA</option>\r\n");
        out.write("                                                                        <option>IMPERADOR</option>\r\n");
        out.write("                                                                        <option>IMPERATRIZ</option>\r\n");
        out.write("                                                                        <option>INFANTE</option>\r\n");
        out.write("                                                                        <option>INSPETOR</option>\r\n");
        out.write("                                                                        <option>IRMA</option>\r\n");
        out.write("                                                                        <option>IRMAO</option>\r\n");
        out.write("                                                                        <option>IRMAOS</option>\r\n");
        out.write("                                                                        <option>IRMAS</option>\r\n");
        out.write("                                                                        <option>JORNALISTA</option>\r\n");
        out.write("                                                                        <option>LIBERTADOR</option>\r\n");
        out.write("                                                                        <option>LIDCO</option>\r\n");
        out.write("                                                                        <option>LIVREIRO</option>\r\n");
        out.write("                                                                        <option>LORDE</option>\r\n");
        out.write("                                                                        <option>MADAME</option>\r\n");
        out.write("                                                                        <option>MADRE</option>\r\n");
        out.write("                                                                        <option>MAESTRO</option>\r\n");
        out.write("                                                                        <option>MAJOR</option>\r\n");
        out.write("                                                                        <option>MAJOR AVIADOR</option>\r\n");
        out.write("                                                                        <option>MAJOR BRIGADEIRO</option>\r\n");
        out.write("                                                                        <option>MAQUINISTA</option>\r\n");
        out.write("                                                                        <option>MARECHAL</option>\r\n");
        out.write("                                                                        <option>MARECHAL DO AR</option>\r\n");
        out.write("                                                                        <option>MARQUES</option>\r\n");
        out.write("                                                                        <option>MARQUESA</option>\r\n");
        out.write("                                                                        <option>MERE</option>\r\n");
        out.write("                                                                        <option>MESTRAS</option>\r\n");
        out.write("                                                                        <option>MESTRE</option>\r\n");
        out.write("                                                                        <option>MESTRES</option>\r\n");
        out.write("                                                                        <option>MILITANTE</option>\r\n");
        out.write("                                                                        <option>MINISTRO</option>\r\n");
        out.write("                                                                        <option>MISSIONARIA</option>\r\n");
        out.write("                                                                        <option>MISSIONARIO</option>\r\n");
        out.write("                                                                        <option>MONGE</option>\r\n");
        out.write("                                                                        <option>MONSENHOR</option>\r\n");
        out.write("                                                                        <option>MUNIC</option>\r\n");
        out.write("                                                                        <option>MUSICO</option>\r\n");
        out.write("                                                                        <option>NOSSA SENHORA</option>\r\n");
        out.write("                                                                        <option>NOSSO SENHOR</option>\r\n");
        out.write("                                                                        <option>OUVIDOR</option>\r\n");
        out.write("                                                                        <option>PADRE</option>\r\n");
        out.write("                                                                        <option>PADRES</option>\r\n");
        out.write("                                                                        <option>PAI</option>\r\n");
        out.write("                                                                        <option>PAPA</option>\r\n");
        out.write("                                                                        <option>PASTOR</option>\r\n");
        out.write("                                                                        <option>PATRIARCA</option>\r\n");
        out.write("                                                                        <option>POETA</option>\r\n");
        out.write("                                                                        <option>POETISA</option>\r\n");
        out.write("                                                                        <option>PREFEITO</option>\r\n");
        out.write("                                                                        <option>PRESIDENTE</option>\r\n");
        out.write("                                                                        <option>PRESIDENTE DA ACAD.BRAS.LETRAS</option>\r\n");
        out.write("                                                                        <option>PREVR</option>\r\n");
        out.write("                                                                        <option>PRIMEIRO SARGENTO</option>\r\n");
        out.write("                                                                        <option>PRIMEIRO SARGENTO PM</option>\r\n");
        out.write("                                                                        <option>PRIMEIRO TENENTE</option>\r\n");
        out.write("                                                                        <option>PRIMEIRO TENENTE PM</option>\r\n");
        out.write("                                                                        <option>PRINCESA</option>\r\n");
        out.write("                                                                        <option>PRINCIPE</option>\r\n");
        out.write("                                                                        <option>PROCURADOR</option>\r\n");
        out.write("                                                                        <option>PROFESSOR</option>\r\n");
        out.write("                                                                        <option>PROFESSOR DOUTOR</option>\r\n");
        out.write("                                                                        <option>PROFESSOR ENGENHEIRO</option>\r\n");
        out.write("                                                                        <option>PROFESSORA</option>\r\n");
        out.write("                                                                        <option>PROFETA</option>\r\n");
        out.write("                                                                        <option>PROMOTOR</option>\r\n");
        out.write("                                                                        <option>PROVEDOR</option>\r\n");
        out.write("                                                                        <option>PROVEDOR MOR</option>\r\n");
        out.write("                                                                        <option>RABINO</option>\r\n");
        out.write("                                                                        <option>RADIALISTA</option>\r\n");
        out.write("                                                                        <option>RAINHA</option>\r\n");
        out.write("                                                                        <option>REGENTE</option>\r\n");
        out.write("                                                                        <option>REI</option>\r\n");
        out.write("                                                                        <option>REVERENDO</option>\r\n");
        out.write("                                                                        <option>RUA</option>\r\n");
        out.write("                                                                        <option>SACERDOTE</option>\r\n");
        out.write("                                                                        <option>SANTA</option>\r\n");
        out.write("                                                                        <option>SANTO</option>\r\n");
        out.write("                                                                        <option>SAO</option>\r\n");
        out.write("                                                                        <option>SARGENTO</option>\r\n");
        out.write("                                                                        <option>SARGENTO MOR</option>\r\n");
        out.write("                                                                        <option>SARGENTO PM</option>\r\n");
        out.write("                                                                        <option>SEGUNDO SARGENTO</option>\r\n");
        out.write("                                                                        <option>SEGUNDO SARGENTO PM</option>\r\n");
        out.write("                                                                        <option>SEGUNDO TENENTE</option>\r\n");
        out.write("                                                                        <option>SENADOR</option>\r\n");
        out.write("                                                                        <option>SENHOR</option>\r\n");
        out.write("                                                                        <option>SENHORA</option>\r\n");
        out.write("                                                                        <option>SERTANISTA</option>\r\n");
        out.write("                                                                        <option>SINHA</option>\r\n");
        out.write("                                                                        <option>SIR</option>\r\n");
        out.write("                                                                        <option>SOCIOLOGO</option>\r\n");
        out.write("                                                                        <option>SOLDADO</option>\r\n");
        out.write("                                                                        <option>SOLDADO PM</option>\r\n");
        out.write("                                                                        <option>SOROR</option>\r\n");
        out.write("                                                                        <option>SUB TENENTE</option>\r\n");
        out.write("                                                                        <option>TENENTE</option>\r\n");
        out.write("                                                                        <option>TENENTE AVIADOR</option>\r\n");
        out.write("                                                                        <option>TENENTE BRIGADEIRO</option>\r\n");
        out.write("                                                                        <option>TENENTE CORONEL</option>\r\n");
        out.write("                                                                        <option>TENENTE CORONEL PM</option>\r\n");
        out.write("                                                                        <option>TEOLOGO</option>\r\n");
        out.write("                                                                        <option>TERCEIRO SARGENTO</option>\r\n");
        out.write("                                                                        <option>TERCEIRO SARGENTO PM</option>\r\n");
        out.write("                                                                        <option>TIA</option>\r\n");
        out.write("                                                                        <option>VEREADOR</option>\r\n");
        out.write("                                                                        <option>VICE ALMIRANTE</option>\r\n");
        out.write("                                                                        <option>VICE REI</option>\r\n");
        out.write("                                                                        <option>VIGARIO</option>\r\n");
        out.write("                                                                        <option>VISCONDE</option>\r\n");
        out.write("                                                                        <option>VISCONDESSA</option>\r\n");
        out.write("                                                                        <option>VOLUNTARIO</option>\r\n");
        out.write("                                                                    </select>\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.titulo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                                ");
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
        out.write("                                                                ");
        if (_jspx_meth_c_when_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
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
    _jspx_th_c_when_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_17 = _jspx_th_c_when_17.doStartTag();
    if (_jspx_eval_c_when_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmendereco\" \r\n");
        out.write("                                                                           value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.endereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  placeholder=\"nome do endereço\" required=\"required\">\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmendereco\" placeholder=\"nome do endereço\" required=\"required\">\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.endereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                                ");
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
        out.write("                                                                ");
        if (_jspx_meth_c_when_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
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
    _jspx_th_c_when_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_19 = _jspx_th_c_when_19.doStartTag();
    if (_jspx_eval_c_when_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nrnumeroend\" \r\n");
        out.write("                                                                           value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.numero}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"nº\">\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nrnumeroend\" placeholder=\"nº\">\r\n");
        out.write("                                                                ");
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

  private boolean _jspx_meth_c_otherwise_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_9 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_9.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_10);
    int _jspx_eval_c_otherwise_9 = _jspx_th_c_otherwise_9.doStartTag();
    if (_jspx_eval_c_otherwise_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.numero}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                                ");
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

  private boolean _jspx_meth_c_choose_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_11 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_11.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_11.setParent(null);
    int _jspx_eval_c_choose_11 = _jspx_th_c_choose_11.doStartTag();
    if (_jspx_eval_c_choose_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
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
    _jspx_th_c_when_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_21 = _jspx_th_c_when_21.doStartTag();
    if (_jspx_eval_c_when_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmcomplementoend\" \r\n");
        out.write("                                                                           value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.complemento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"complemento do endereço\" >\r\n");
        out.write("                                                                ");
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

  private boolean _jspx_meth_c_when_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_22 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_22.setPageContext(_jspx_page_context);
    _jspx_th_c_when_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_11);
    _jspx_th_c_when_22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_22 = _jspx_th_c_when_22.doStartTag();
    if (_jspx_eval_c_when_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmcomplementoend\" placeholder=\"complemento do endereço\" >\r\n");
        out.write("                                                                ");
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

  private boolean _jspx_meth_c_otherwise_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_10 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_10.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_11);
    int _jspx_eval_c_otherwise_10 = _jspx_th_c_otherwise_10.doStartTag();
    if (_jspx_eval_c_otherwise_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.complemento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                                ");
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
        out.write("                                                                ");
        if (_jspx_meth_c_when_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_when_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_23 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_23.setPageContext(_jspx_page_context);
    _jspx_th_c_when_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_12);
    _jspx_th_c_when_23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_23 = _jspx_th_c_when_23.doStartTag();
    if (_jspx_eval_c_when_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmreferenciaend\" \r\n");
        out.write("                                                                           value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.referencia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"referencia do endereço\" >\r\n");
        out.write("                                                                ");
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
        out.write("                                                                    <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmreferenciaend\" placeholder=\"referencia do endereço\" >\r\n");
        out.write("                                                                ");
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

  private boolean _jspx_meth_c_otherwise_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_11 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_11.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_12);
    int _jspx_eval_c_otherwise_11 = _jspx_th_c_otherwise_11.doStartTag();
    if (_jspx_eval_c_otherwise_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.endereco.referencia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> \r\n");
        out.write("                                                                ");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <a href=\"#\" class=\"add_field_button\" title=\"Adicionar \">\r\n");
        out.write("                                                        <span class=\"label label-xlg label-success\">\r\n");
        out.write("                                                            <i class=\" glyphicon glyphicon-plus\"></i>\r\n");
        out.write("                                                            Croqui e Área\r\n");
        out.write("                                                        </span>\r\n");
        out.write("                                                    </a>\r\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_choose_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_13 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_13.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_13.setParent(null);
    int _jspx_eval_c_choose_13 = _jspx_th_c_choose_13.doStartTag();
    if (_jspx_eval_c_choose_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_13, _jspx_page_context))
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

  private boolean _jspx_meth_c_when_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_25 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_25.setPageContext(_jspx_page_context);
    _jspx_th_c_when_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_13);
    _jspx_th_c_when_25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_25 = _jspx_th_c_when_25.doStartTag();
    if (_jspx_eval_c_when_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" id=\"form-field-1\" class=\"col-sm-11 col-xs-12\"  name=\"nmInteressado\" \r\n");
        out.write("                                                                       value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmInteressado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Nome do Interessado\" required=\"required\">\r\n");
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

  private boolean _jspx_meth_c_when_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_26 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_26.setPageContext(_jspx_page_context);
    _jspx_th_c_when_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_13);
    _jspx_th_c_when_26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_26 = _jspx_th_c_when_26.doStartTag();
    if (_jspx_eval_c_when_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"text\" id=\"form-field-1\" class=\"col-sm-11 col-xs-12\"  name=\"nmInteressado\" \r\n");
        out.write("                                                                       placeholder=\"Nome do Interessado\" required=\"required\">\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_otherwise_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_12 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_12.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_13);
    int _jspx_eval_c_otherwise_12 = _jspx_th_c_otherwise_12.doStartTag();
    if (_jspx_eval_c_otherwise_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmInteressado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_choose_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_14 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_14.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_14.setParent(null);
    int _jspx_eval_c_choose_14 = _jspx_th_c_choose_14.doStartTag();
    if (_jspx_eval_c_choose_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_14, _jspx_page_context))
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

  private boolean _jspx_meth_c_when_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_27 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_27.setPageContext(_jspx_page_context);
    _jspx_th_c_when_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_14);
    _jspx_th_c_when_27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_27 = _jspx_th_c_when_27.doStartTag();
    if (_jspx_eval_c_when_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <select name=\"assunto\" id=\"assunto\" placeholder=\"\" class=\"col-md-12 col-xs-12\" required=\"required\">\r\n");
        out.write("                                                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.tpAssunto.pkTipoAssunto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.tpAssunto.nmTipoAssunto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                    <option></option>\r\n");
        out.write("                                                                    ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                </select>\r\n");
        out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_27);
    _jspx_th_c_forEach_1.setVar("lis");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTpAssunto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                        ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoAssunto != ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                            <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.pkTipoAssunto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoAssunto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoAssunto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                        ");
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

  private boolean _jspx_meth_c_when_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_28 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_28.setPageContext(_jspx_page_context);
    _jspx_th_c_when_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_14);
    _jspx_th_c_when_28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_28 = _jspx_th_c_when_28.doStartTag();
    if (_jspx_eval_c_when_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <select name=\"assunto\" id=\"assunto\" placeholder=\"\" class=\"col-md-12 col-xs-12\" required=\"required\">\r\n");
        out.write("                                                                    <option></option>\r\n");
        out.write("                                                                    ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_28, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                </select>\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_28);
    _jspx_th_c_forEach_2.setVar("lis");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTpAssunto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                        ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoAssunto != ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                            <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.pkTipoAssunto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoAssunto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoAssunto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                        ");
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
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.tpAssunto.nmTipoAssunto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
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
        out.write("                                                            ");
        if (_jspx_meth_c_when_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_15, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_15, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_15, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
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

  private boolean _jspx_meth_c_when_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_29 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_29.setPageContext(_jspx_page_context);
    _jspx_th_c_when_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_15);
    _jspx_th_c_when_29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_29 = _jspx_th_c_when_29.doStartTag();
    if (_jspx_eval_c_when_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <select name=\"despacho\" id=\"assunto\" placeholder=\"\" class=\"col-md-12 col-xs-12\">\r\n");
        out.write("                                                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.tpDespacho.pkTipoDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.tpDespacho.nmTipoDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                    <option></option>\r\n");
        out.write("                                                                    ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_29, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                </select>\r\n");
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

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_29);
    _jspx_th_c_forEach_3.setVar("lis");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTpDespacho}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                        ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoDespacho != ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                            <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.pkTipoDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                        ");
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

  private boolean _jspx_meth_c_when_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_30 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_30.setPageContext(_jspx_page_context);
    _jspx_th_c_when_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_15);
    _jspx_th_c_when_30.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_30 = _jspx_th_c_when_30.doStartTag();
    if (_jspx_eval_c_when_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <select name=\"despacho\" id=\"assunto\" placeholder=\"\" class=\"col-md-10 col-xs-12\">\r\n");
        out.write("                                                                    <option></option>\r\n");
        out.write("                                                                    ");
        if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_30, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                </select>\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_30);
    _jspx_th_c_forEach_4.setVar("lis");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTpDespacho}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                        ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoDespacho != ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                            <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.pkTipoDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.nmTipoDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                        ");
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

  private boolean _jspx_meth_c_otherwise_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_14 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_14.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_15);
    int _jspx_eval_c_otherwise_14 = _jspx_th_c_otherwise_14.doStartTag();
    if (_jspx_eval_c_otherwise_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.tpDespacho.nmTipoDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
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

  private boolean _jspx_meth_c_choose_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_16 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_16.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_16.setParent(null);
    int _jspx_eval_c_choose_16 = _jspx_th_c_choose_16.doStartTag();
    if (_jspx_eval_c_choose_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_16, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_16, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_16, _jspx_page_context))
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

  private boolean _jspx_meth_c_when_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_31 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_31.setPageContext(_jspx_page_context);
    _jspx_th_c_when_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_16);
    _jspx_th_c_when_31.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_31 = _jspx_th_c_when_31.doStartTag();
    if (_jspx_eval_c_when_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"date\" id=\"form-field-1\" class=\"col-sm-8 col-xs-12\"  name=\"dtPublicacao\" \r\n");
        out.write("                                                                       value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtPublicacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"Selecione a data\">\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_when_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_32 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_32.setPageContext(_jspx_page_context);
    _jspx_th_c_when_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_16);
    _jspx_th_c_when_32.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_32 = _jspx_th_c_when_32.doStartTag();
    if (_jspx_eval_c_when_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"date\" id=\"form-field-1\" class=\"col-sm-8 col-xs-12\"  name=\"dtPublicacao\" \r\n");
        out.write("                                                                       title=\"Selecione a data\">\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_otherwise_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_15 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_15.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_16);
    int _jspx_eval_c_otherwise_15 = _jspx_th_c_otherwise_15.doStartTag();
    if (_jspx_eval_c_otherwise_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <span class=\"lbl\">");
        if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_15, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_15);
    _jspx_th_fmt_formatDate_0.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtPublicacao}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_17 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_17.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_17.setParent(null);
    int _jspx_eval_c_choose_17 = _jspx_th_c_choose_17.doStartTag();
    if (_jspx_eval_c_choose_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_17, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_17, _jspx_page_context))
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

  private boolean _jspx_meth_c_when_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_33 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_33.setPageContext(_jspx_page_context);
    _jspx_th_c_when_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_17);
    _jspx_th_c_when_33.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_33 = _jspx_th_c_when_33.doStartTag();
    if (_jspx_eval_c_when_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"date\" id=\"form-field-1\" class=\"col-sm-8 col-xs-12\"  name=\"dtTramitacao\" \r\n");
        out.write("                                                                       value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtTramitacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"Selecione a data\">\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_when_34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_34 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_34.setPageContext(_jspx_page_context);
    _jspx_th_c_when_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_17);
    _jspx_th_c_when_34.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_34 = _jspx_th_c_when_34.doStartTag();
    if (_jspx_eval_c_when_34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <input type=\"date\" id=\"form-field-1\" class=\"col-sm-8 col-xs-12\"  name=\"dtTramitacao\" \r\n");
        out.write("                                                                       title=\"Selecione a data\">\r\n");
        out.write("                                                            ");
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
        out.write("                                                                <span class=\"lbl\">");
        if (_jspx_meth_fmt_formatDate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_16, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
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

  private boolean _jspx_meth_fmt_formatDate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_16);
    _jspx_th_fmt_formatDate_1.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtTramitacao}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
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
        out.write("                                                            ");
        if (_jspx_meth_c_when_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_otherwise_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
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

  private boolean _jspx_meth_c_when_35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_35 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_35.setPageContext(_jspx_page_context);
    _jspx_th_c_when_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_18);
    _jspx_th_c_when_35.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'edit' || execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_35 = _jspx_th_c_when_35.doStartTag();
    if (_jspx_eval_c_when_35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <textarea class=\"form-control col-xs-12\" id=\"form-field-8\" name=\"dsObservacao\" placeholder=\"Observação\" \r\n");
        out.write("                                                                          style=\"margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dsObservacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</textarea>\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_when_36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_36 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_36.setPageContext(_jspx_page_context);
    _jspx_th_c_when_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_18);
    _jspx_th_c_when_36.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao == 'insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_36 = _jspx_th_c_when_36.doStartTag();
    if (_jspx_eval_c_when_36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <textarea class=\"form-control col-xs-12\" id=\"form-field-8\" name=\"dsObservacao\" placeholder=\"Observação\" \r\n");
        out.write("                                                                          style=\"margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;\"></textarea>\r\n");
        out.write("                                                            ");
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
        out.write("                                                                <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dsObservacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao!='insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <div class=\"form-group\">\r\n");
        out.write("                                                        <label class=\"inline col-md-2 col-xs-12\">\r\n");
        out.write("                                                            <span class=\"lbl\"><strong>Usuário:</strong></span>\r\n");
        out.write("                                                        </label>\r\n");
        out.write("                                                        <label class=\"inline col-md-4 col-xs-12\" >\r\n");
        out.write("                                                            <span class=\"lbl\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.nmNome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                                                        </label>\r\n");
        out.write("\r\n");
        out.write("                                                        <label class=\"inline col-md-2 col-xs-12\">\r\n");
        out.write("                                                            <span class=\"lbl\"><strong>Atualização:</strong></span>\r\n");
        out.write("                                                        </label>\r\n");
        out.write("                                                        <label class=\"inline col-md-4 col-xs-12\" >\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_fmt_parseDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                            <span class=\"lbl\">");
        if (_jspx_meth_fmt_formatDate_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("                                                        </label>\r\n");
        out.write("                                                    </div>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_set_3.setVar("dt");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dthrAtualizacao}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_fmt_parseDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:parseDate
    org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag _jspx_th_fmt_parseDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag) _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag.class);
    _jspx_th_fmt_parseDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_parseDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_fmt_parseDate_0.setVar("converteData");
    _jspx_th_fmt_parseDate_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_parseDate_0.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_parseDate_0 = _jspx_th_fmt_parseDate_0.doStartTag();
    if (_jspx_th_fmt_parseDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_parseDate_0);
      return true;
    }
    _jspx_tagPool_fmt_parseDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_parseDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_fmt_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${converteData}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_2.setPattern("dd/MM/yyyy - HH:mm:ss");
    int _jspx_eval_fmt_formatDate_2 = _jspx_th_fmt_formatDate_2.doStartTag();
    if (_jspx_th_fmt_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
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
        out.write("                                                        ");
        if (_jspx_meth_c_when_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_19, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_19, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_otherwise_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_19, _jspx_page_context))
          return true;
        out.write("        \r\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_when_37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_37 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_37.setPageContext(_jspx_page_context);
    _jspx_th_c_when_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_19);
    _jspx_th_c_when_37.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bntBack=='newSearch' && execucao == 'view'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_37 = _jspx_th_c_when_37.doStartTag();
    if (_jspx_eval_c_when_37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <button class=\"btn btn-yellow\" type=\"reset\" onclick=\" location.href = 'ControllerServlet?acao=AnotacaoCroquiLista';\">\r\n");
        out.write("                                                                <i class=\"ace-icon fa fa-undo bigger-110\"></i>\r\n");
        out.write("                                                                Voltar\r\n");
        out.write("                                                            </button>\r\n");
        out.write("                                                        ");
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

  private boolean _jspx_meth_c_when_38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_38 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_38.setPageContext(_jspx_page_context);
    _jspx_th_c_when_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_19);
    _jspx_th_c_when_38.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bntBack=='newSearch' && execucao == 'duplicate'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_38 = _jspx_th_c_when_38.doStartTag();
    if (_jspx_eval_c_when_38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <button class=\"btn btn-yellow\" type=\"reset\" onclick=\" location.href = 'ControllerServlet?acao=AnotacaoCroquiPesquisa&primeiro=true';\">\r\n");
        out.write("                                                                <i class=\"ace-icon fa fa-undo bigger-110\"></i>\r\n");
        out.write("                                                                Voltar\r\n");
        out.write("                                                            </button>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_38.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_38);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_38);
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
        out.write("                                                            <button class=\"btn btn-yellow\" type=\"reset\" onclick=\"history.back();\">\r\n");
        out.write("                                                                <i class=\"ace-icon fa fa-undo bigger-110\"></i>\r\n");
        out.write("                                                                Voltar\r\n");
        out.write("                                                            </button>\r\n");
        out.write("                                                        ");
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

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao != 'view'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <button class=\"btn btn-success\" type=\"submit\" id=\"btnExecutarAcao\">\r\n");
        out.write("                                                            <i class=\"ace-icon fa fa-save bigger-110\"></i>\r\n");
        out.write("                                                            Salvar\r\n");
        out.write("                                                        </button>\r\n");
        out.write("\r\n");
        out.write("                                                        <button class=\"btn\" type=\"reset\">\r\n");
        out.write("                                                            <i class=\"ace-icon fa fa-eraser bigger-110\"></i>\r\n");
        out.write("                                                            Limpar\r\n");
        out.write("                                                        </button>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao!='view' && (sessionSgDivisao == 'DIPI' && sessionSgSetor == 'SIC' || sessionPerfil == 'Administrador')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    \r\n");
        out.write("                                                <div class=\"form-group\">\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
        out.write("                                                        <strong>Tipo de documento:</strong>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-3 col-xs-12\">\r\n");
        out.write("                                                        <select name=\"fktipoArquivo\"  placeholder=\"\" class=\"col-xs-12 col-md-8\" \r\n");
        out.write("                                                             required=\"required\">\r\n");
        out.write("                                                            <option></option>\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        </select>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-4 col-xs-12\">\r\n");
        out.write("                                                        <input type=\"file\"  id=\"id-input-file-2\" name=\"UploadCroqui\" required=\"required\"><span class=\"ace-file-container\" data-title=\"Choose\"><span class=\"ace-file-name\" data-title=\"No File ...\"></span></span>\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                               <div class=\"form-group\">\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
        out.write("                                                        <strong>Descrição:</strong>\r\n");
        out.write("                                                    </label >                                                        \r\n");
        out.write("                                                    <label class=\"inline col-md-7 col-xs-12\">\r\n");
        out.write("                                                        <input type=\"text\" name=\"nomeDoArquivo\" placeholder=\"Nome do arquivo\" class=\"col-xs-12 col-md-12\" required=\"required\" >\r\n");
        out.write("                                                    </label>\r\n");
        out.write("                                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
        out.write("                                                        <button class=\"btn btn-success\"  type=\"submit\">\r\n");
        out.write("                                                            <i class=\"ace-icon fa fa-save bigger-110\"></i>\r\n");
        out.write("                                                                Anexar\r\n");
        out.write("                                                        </button\r\n");
        out.write("                                                    </label> \r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                \r\n");
        out.write("                                                ");
        if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </form>  \r\n");
        out.write("                                            \r\n");
        out.write("                                            <div class=\"hr hr-18 dotted hr-double\"></div>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_5.setVar("anexo");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTpAnexo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                ");
          if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anexo.nmTipoAnexo != ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anexo.pkTipoAnexo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anexo.nmTipoAnexo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty lisAnotCroquiCriado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <table class=\"table\">\r\n");
        out.write("                                                        <thead>\r\n");
        out.write("                                                            <tr>\r\n");
        out.write("                                                                <th>Croqui </th>\r\n");
        out.write("                                                                <th>Área</th>\r\n");
        out.write("                                                                <th>Vincular</th>\r\n");
        out.write("                                                            </tr>\r\n");
        out.write("                                                        </thead>\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_forEach_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    </table>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_c_forEach_6.setVar("a");
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lisAnotCroquiCriado}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                            <tbody>\r\n");
          out.write("                                                                <tr>\r\n");
          out.write("                                                                    <td title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.cdCroqui}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.cdCroqui}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                                    </td>\r\n");
          out.write("                                                                    <td title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.cdArea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.cdArea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                                    </td>\r\n");
          out.write("                                                                    <td>\r\n");
          out.write("                                                                        <div class=\"hidden-sm hidden-xs btn-group\">\r\n");
          out.write("                                                                            <label class=\"col-sm-2 col-xs-12\" >\r\n");
          out.write("                                                                                <input id=\"id-button-borders\" type=\"checkbox\" id=\"relatorio\" name=\"listPkAnotCroqui\" \r\n");
          out.write("                                                                                       value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.pkAnotacaoExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"ace ace-switch ace-switch-5\"/>\r\n");
          out.write("                                                                                <span class=\"lbl middle\"></span>\r\n");
          out.write("                                                                            </label>                                                                                                                               \r\n");
          out.write("                                                                        </div>\r\n");
          out.write("                                                                    </td>\r\n");
          out.write("                                                                </tr>\r\n");
          out.write("                                                            </tbody>\r\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent(null);
    _jspx_th_c_forEach_7.setVar("anexo");
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAnexo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("                                            <div class=\"form-group\">\r\n");
          out.write("                                                <form action=\"\" method=\"POST\">\r\n");
          out.write("                                                    <div class=\"inline col-md-12 col-xs-12\">\r\n");
          out.write("                                                        <div class=\"inline col-md-1 col-xs-12\">\r\n");
          out.write("                                                            <a href=\"/SGPatri/Croqui/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anexo.nmAnexo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" target=\"_blank\"><img class=\"img-thumbnail\" src=\"img/AC.png\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anexo.nmAnexo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"80%\" height=\"80%\"/></a>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                        <div class=\"inline col-md-3 col-xs-12\">\r\n");
          out.write("                                                            <label class=\"inline col-md-12 col-xs-12\">\r\n");
          out.write("                                                                <strong>Tipo:</strong> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anexo.tpAnexo.nmTipoAnexo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                            </label>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                            <div class=\"inline col-md-7 col-xs-12\">\r\n");
          out.write("                                                            <label class=\"inline col-md-12 col-xs-12\">\r\n");
          out.write("                                                                <strong>Descrição:</strong> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anexo.dsAnexo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                            </label>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                        ");
          if (_jspx_meth_c_if_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write(" \r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </form>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <div class=\"hr hr-16 hr-dotted\"></div>\r\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao!='view' && (sessionSgDivisao == 'DIPI' && sessionSgSetor == 'SIC' || sessionPerfil == 'Administrador')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <div class=\"inline col-md-1 col-md-12 disabled-li-menu\">\r\n");
        out.write("                                                                <button class=\"btn btn-danger btn-xs\">\r\n");
        out.write("                                                                    <i class=\"ace-icon fa fa-trash-o bigger-130 icon-only\"></i>\r\n");
        out.write("                                                                </button>\r\n");
        out.write("                                                            </div>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }
}
