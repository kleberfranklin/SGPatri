package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AutoCessaoInserir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
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
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/head.jsp", out, false);
      out.write("\r\n");
      out.write("    <body class=\"no-skin\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/top.jsp", out, false);
      out.write("\r\n");
      out.write("    <div class=\"main-container ace-save-state\" id=\"main-container\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/nav.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Verificação de acesso  -->\r\n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("    ");
      br.com.Modelo.TipoAutoCessaoDAO TpCessao = null;
      synchronized (_jspx_page_context) {
        TpCessao = (br.com.Modelo.TipoAutoCessaoDAO) _jspx_page_context.getAttribute("TpCessao", PageContext.PAGE_SCOPE);
        if (TpCessao == null){
          TpCessao = new br.com.Modelo.TipoAutoCessaoDAO();
          _jspx_page_context.setAttribute("TpCessao", TpCessao, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    ");
      br.com.Modelo.CatFinalidadeDAO CatFin = null;
      synchronized (_jspx_page_context) {
        CatFin = (br.com.Modelo.CatFinalidadeDAO) _jspx_page_context.getAttribute("CatFin", PageContext.PAGE_SCOPE);
        if (CatFin == null){
          CatFin = new br.com.Modelo.CatFinalidadeDAO();
          _jspx_page_context.setAttribute("CatFin", CatFin, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    ");
      br.com.Modelo.CatAutoCessaoDAO CatAuto = null;
      synchronized (_jspx_page_context) {
        CatAuto = (br.com.Modelo.CatAutoCessaoDAO) _jspx_page_context.getAttribute("CatAuto", PageContext.PAGE_SCOPE);
        if (CatAuto == null){
          CatAuto = new br.com.Modelo.CatAutoCessaoDAO();
          _jspx_page_context.setAttribute("CatAuto", CatAuto, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    ");
      br.com.Modelo.CatContrapartidaDAO CatContra = null;
      synchronized (_jspx_page_context) {
        CatContra = (br.com.Modelo.CatContrapartidaDAO) _jspx_page_context.getAttribute("CatContra", PageContext.PAGE_SCOPE);
        if (CatContra == null){
          CatContra = new br.com.Modelo.CatContrapartidaDAO();
          _jspx_page_context.setAttribute("CatContra", CatContra, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    ");
      br.com.Modelo.TipoDispositivoLegalDAO TpDis = null;
      synchronized (_jspx_page_context) {
        TpDis = (br.com.Modelo.TipoDispositivoLegalDAO) _jspx_page_context.getAttribute("TpDis", PageContext.PAGE_SCOPE);
        if (TpDis == null){
          TpDis = new br.com.Modelo.TipoDispositivoLegalDAO();
          _jspx_page_context.setAttribute("TpDis", TpDis, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    ");
      br.com.Modelo.SubPrefeituraDAO subPref = null;
      synchronized (_jspx_page_context) {
        subPref = (br.com.Modelo.SubPrefeituraDAO) _jspx_page_context.getAttribute("subPref", PageContext.PAGE_SCOPE);
        if (subPref == null){
          subPref = new br.com.Modelo.SubPrefeituraDAO();
          _jspx_page_context.setAttribute("subPref", subPref, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    ");
      br.com.Modelo.DispositivoLegalDAO Disp = null;
      synchronized (_jspx_page_context) {
        Disp = (br.com.Modelo.DispositivoLegalDAO) _jspx_page_context.getAttribute("Disp", PageContext.PAGE_SCOPE);
        if (Disp == null){
          Disp = new br.com.Modelo.DispositivoLegalDAO();
          _jspx_page_context.setAttribute("Disp", Disp, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    ");
      br.com.Modelo.ArquivoDAO Arquivo = null;
      synchronized (_jspx_page_context) {
        Arquivo = (br.com.Modelo.ArquivoDAO) _jspx_page_context.getAttribute("Arquivo", PageContext.PAGE_SCOPE);
        if (Arquivo == null){
          Arquivo = new br.com.Modelo.ArquivoDAO();
          _jspx_page_context.setAttribute("Arquivo", Arquivo, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("            \r\n");
      out.write("    ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    <div class=\"breadcrumbs ace-save-state\" id=\"breadcrumbs\">\r\n");
      out.write("        <ul class=\"breadcrumb\">\r\n");
      out.write("            <li><i class=\"ace-icon fa fa-list\"></i> Auto de Cessão ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>    \r\n");
      out.write("    <div class=\"page-content\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("    <div class=\"col-xs-12\">\r\n");
      out.write("        \r\n");
      out.write(" \r\n");
      out.write("    <div class=\"col-sm-offset-1 col-sm-10\">\r\n");
      out.write("        <h2>Cadastro de Auto de Cessão ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("</h2>\r\n");
      out.write("        <div class=\"space-14\"></div>\r\n");
      out.write("        <div class=\"form-horizontal\">\r\n");
      out.write("            <div class=\"tabbable\">\r\n");
      out.write("                <ul class=\"nav nav-tabs padding-0\">\r\n");
      out.write("                    <li class=\"active\">\r\n");
      out.write("                        <a data-toggle=\"tab\" href=\"#auto-cessao\" aria-expanded=\"true\">\r\n");
      out.write("                            \r\n");
      out.write("                            Auto Cessão ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("</h2>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"tab-content profile-edit-tab-content\">\r\n");
      out.write("                    <div id=\"auto-cessao\" class=\"tab-pane  in active\">\r\n");
      out.write("                            <form \r\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            method=\"POST\" >\r\n");
      out.write("                                <div class=\"space-4\"></div>\r\n");
      out.write("                                <div class=\"space-2\"></div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Data Lavratura:</strong></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12 \">\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <input class=\"form-control date-picker\" id=\"id-date-picker-1\" name=\"dtlavratura\" type=\"text\" placeholder=\"dd/mm/aaaa\" data-date-format=\"dd/mm/yyyy\">\r\n");
      out.write("                                            <span class=\"input-group-addon\">\r\n");
      out.write("                                                <i class=\"fa fa-calendar bigger-110\"></i>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Nº Processo:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nrprocesso\" placeholder=\"nº do processo\"  >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"space-1\"></div>    \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Tipo de Cessão:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\r\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"qTpcessao\">\r\n");
      out.write("                                            <option value=\"\"></option>    \r\n");
      out.write("                                             ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </select>    \r\n");
      out.write("                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\r\n");
      out.write("                                            <span class=\"lbl\">\r\n");
      out.write("                                                <strong>Categoria\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                </strong>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\r\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"nmNvAdm\">\r\n");
      out.write("                                                <option></option>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>  \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\">\r\n");
      out.write("                                                <strong>\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_choose_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                </strong>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-9 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"nome do cessionário\" name=\"nmcessionario\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"space-2\"></div>                                \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Categoria da finalidade:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\r\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"\">\r\n");
      out.write("                                            <option></option>    \r\n");
      out.write("                                            <option>Educação</option>\r\n");
      out.write("                                            <option>Esporte</option>\r\n");
      out.write("                                            <option>Saúde</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Finalidade:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\">\r\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"\">\r\n");
      out.write("                                            <option></option>\r\n");
      out.write("                                            <option>Creche</option>\r\n");
      out.write("                                            <option>Escola</option>\r\n");
      out.write("                                            <option>Biblioteca</option>\r\n");
      out.write("                                            <option>Faculdade</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"space-1\"></div>                           \r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\">\r\n");
      out.write("                                                <strong>Detalhamento da Finalidade</strong>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-8 col-xs-12\">\r\n");
      out.write("                                        <textarea id=\"form-field-11\" class=\"autosize-transition form-control\" name=\"\" style=\"height:200px; margin-left: 0px;  width: 670px;\"></textarea>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("                                \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Planta:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"nº da planta\" name=\"nmplanta\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Croqui:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"nº croqui\" name=\"nmcroqui\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Área do croqui:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"\" name=\"nmarea\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                        <span class=\"lbl\"><strong>Setor:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"nº do setor²\" name=\"nmSetor\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                     <label class=\"inline col-md-1 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Quadra:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"nº da quadra\" name=\"nmquadra\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>CAP:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"nº do cap\" name=\"nmcap\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Metragem oficial:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"Área m²\" name=\"\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Tipo endereço:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\r\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"\" title=\"Rua / Avenida / Praça / etc\">\r\n");
      out.write("                                            <option></option>\r\n");
      out.write("                                            <option value=\"AC\">ACESSO</option>\r\n");
      out.write("                                            <option value=\"AL\">ALAMEDA</option>\r\n");
      out.write("                                            <option value=\"AVJ\">AV. PROJETADA</option>\r\n");
      out.write("                                            <option value=\"AV\">AVENIDA</option>\r\n");
      out.write("                                            <option value=\"BLR\">BALAO RETORNO</option>\r\n");
      out.write("                                            <option value=\"BC\">BECO</option>\r\n");
      out.write("                                            <option value=\"CM\">CAMINHO</option>\r\n");
      out.write("                                            <option value=\"CMP\">CAMINHO PART</option>\r\n");
      out.write("                                            <option value=\"CP\">CAMINHO PEDEST</option>\r\n");
      out.write("                                            <option value=\"CV\">COMPLEXO VIARIO</option>\r\n");
      out.write("                                            <option value=\"DV\">DESVIO</option>\r\n");
      out.write("                                            <option value=\"DIV\">DIV</option>\r\n");
      out.write("                                            <option value=\"ENT\">ENT</option>\r\n");
      out.write("                                            <option value=\"ESJ\">ES. PROJETADA</option>\r\n");
      out.write("                                            <option value=\"ESC\">ESC</option>\r\n");
      out.write("                                            <option value=\"EL\">ESPACO LIVRE</option>\r\n");
      out.write("                                            <option value=\"EPL\">ESPLANADA</option>\r\n");
      out.write("                                            <option value=\"ER\">EST. DE RODAGEM</option>\r\n");
      out.write("                                            <option value=\"EST\">ESTACIONAMENTO</option>\r\n");
      out.write("                                            <option value=\"EF\">ESTR. DE FERRO</option>\r\n");
      out.write("                                            <option value=\"ES\">ESTRADA</option>\r\n");
      out.write("                                            <option value=\"ESP\">ESTRADA PART</option>\r\n");
      out.write("                                            <option value=\"GL\">GALERIA</option>\r\n");
      out.write("                                            <option value=\"JD\">JARDIM</option>\r\n");
      out.write("                                            <option value=\"LD\">LADEIRA</option>\r\n");
      out.write("                                            <option value=\"LG\">LARGO</option>\r\n");
      out.write("                                            <option value=\"PQ\">PARQUE</option>\r\n");
      out.write("                                            <option value=\"PS\">PASSAGEM</option>\r\n");
      out.write("                                            <option value=\"PSP\">PASSAGEM PART</option>\r\n");
      out.write("                                            <option value=\"PA\">PASSARELA</option>\r\n");
      out.write("                                            <option value=\"PT\">PATIO</option>\r\n");
      out.write("                                            <option value=\"PTE\">PONTE</option>\r\n");
      out.write("                                            <option value=\"PTL\">PONTILHAO</option>\r\n");
      out.write("                                            <option value=\"PQE\">PQE</option>\r\n");
      out.write("                                            <option value=\"PQL\">PQL</option>\r\n");
      out.write("                                            <option value=\"PQM\">PQM</option>\r\n");
      out.write("                                            <option value=\"PC\">PRACA</option>\r\n");
      out.write("                                            <option value=\"PCM\">PRACA MANOBRA</option>\r\n");
      out.write("                                            <option value=\"PCJ\">PRACA PROJETADA</option>\r\n");
      out.write("                                            <option value=\"PCR\">PRACA RETORNO</option>\r\n");
      out.write("                                            <option value=\"PRO\">PRO</option>\r\n");
      out.write("                                            <option value=\"PSJ\">PS PROJETADA</option>\r\n");
      out.write("                                            <option value=\"PP\">PS. DE PEDESTRE</option>\r\n");
      out.write("                                            <option value=\"PSS\">PS. SUBTERRANEA</option>\r\n");
      out.write("                                            <option value=\"RV\">RODOVIA</option>\r\n");
      out.write("                                            <option value=\"R\">RUA</option>\r\n");
      out.write("                                            <option value=\"RP\">RUA PART</option>\r\n");
      out.write("                                            <option value=\"RPJ\">RUA PROJETADA</option>\r\n");
      out.write("                                            <option value=\"SV\">SERVIDAO</option>\r\n");
      out.write("                                            <option value=\"TV\">TRAVESSA</option>\r\n");
      out.write("                                            <option value=\"TVP\">TRAVESSA PART</option>\r\n");
      out.write("                                            <option value=\"TN\">TUNEL</option>\r\n");
      out.write("                                            <option value=\"TPJ\">TV PROJETADA</option>\r\n");
      out.write("                                            <option value=\"VER\">VEREDA</option>\r\n");
      out.write("                                            <option value=\"VIA\">VIA</option>\r\n");
      out.write("                                            <option value=\"VCP\">VIA CIRC PEDEST</option>\r\n");
      out.write("                                            <option value=\"VP\">VIA DE PEDESTRE</option>\r\n");
      out.write("                                            <option value=\"VEL\">VIA ELEVADA</option>\r\n");
      out.write("                                            <option value=\"VD\">VIADUTO</option>\r\n");
      out.write("                                            <option value=\"VE\">VIELA</option>\r\n");
      out.write("                                            <option value=\"VEP\">VIELA PART</option>\r\n");
      out.write("                                            <option value=\"VEJ\">VIELA PROJETADA</option>\r\n");
      out.write("                                            <option value=\"VES\">VIELA SANITARIA</option>\r\n");
      out.write("                                            <option value=\"VL\">VILA</option>\r\n");
      out.write("                                            <option value=\"VLP\">VLP</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Título do endereço:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\" >\r\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"\" title=\"Capitão / Doutor / Dom / etc\">\r\n");
      out.write("                                            <option></option>\r\n");
      out.write("                                            <option value=\"ABADE\">ABADE</option>\r\n");
      out.write("                                            <option value=\"ACD\">ACADEMICO</option>\r\n");
      out.write("                                            <option value=\"ADV\">ADVOGADO</option>\r\n");
      out.write("                                            <option value=\"AGTE\">AGENTE</option>\r\n");
      out.write("                                            <option value=\"AGRIC\">AGRIC</option>\r\n");
      out.write("                                            <option value=\"AGRIM\">AGRIMENSOR</option>\r\n");
      out.write("                                            <option value=\"AJUD\">AJUDANTE</option>\r\n");
      out.write("                                            <option value=\"ALF\">ALFERES</option>\r\n");
      out.write("                                            <option value=\"ALM\">ALMIRANTE</option>\r\n");
      out.write("                                            <option value=\"APOST\">APOSTOLO</option>\r\n");
      out.write("                                            <option value=\"ARC\">ARCEBISPO</option>\r\n");
      out.write("                                            <option value=\"ARCIP\">ARCIP</option>\r\n");
      out.write("                                            <option value=\"ARCJO\">ARCJO</option>\r\n");
      out.write("                                            <option value=\"ARQA\">ARQUITETA</option>\r\n");
      out.write("                                            <option value=\"ARQ\">ARQUITETO</option>\r\n");
      out.write("                                            <option value=\"ARQPR\">ARQUITETO PROFESSOR</option>\r\n");
      out.write("                                            <option value=\"ASP\">ASPIRANTE</option>\r\n");
      out.write("                                            <option value=\"AV\">AVENIDA</option>\r\n");
      out.write("                                            <option value=\"AVI\">AVIADOR</option>\r\n");
      out.write("                                            <option value=\"AVIA\">AVIADORA</option>\r\n");
      out.write("                                            <option value=\"BEL\">BACHAREL</option>\r\n");
      out.write("                                            <option value=\"BAND\">BANDEIRANTE</option>\r\n");
      out.write("                                            <option value=\"BANQ\">BANQUEIRO</option>\r\n");
      out.write("                                            <option value=\"BR\">BARAO</option>\r\n");
      out.write("                                            <option value=\"BRA\">BARONESA</option>\r\n");
      out.write("                                            <option value=\"BEPDE\">BEATO PADRE</option>\r\n");
      out.write("                                            <option value=\"BEMAV\">BEM AVENTURADO</option>\r\n");
      out.write("                                            <option value=\"BNTO\">BENEMERITO</option>\r\n");
      out.write("                                            <option value=\"BISP\">BISPO</option>\r\n");
      out.write("                                            <option value=\"BRIG\">BRIGADEIRO</option>\r\n");
      out.write("                                            <option value=\"CABO\">CABO</option>\r\n");
      out.write("                                            <option value=\"CABPM\">CABO PM</option>\r\n");
      out.write("                                            <option value=\"CAD\">CADETE</option>\r\n");
      out.write("                                            <option value=\"CAMP\">CAMPEADOR</option>\r\n");
      out.write("                                            <option value=\"CAP\">CAPITAO</option>\r\n");
      out.write("                                            <option value=\"CPALM\">CAPITAO ALMIRANTE</option>\r\n");
      out.write("                                            <option value=\"CAPFR\">CAPITAO DE FRAGATA</option>\r\n");
      out.write("                                            <option value=\"CAPMG\">CAPITAO DE MAR E GUERRA</option>\r\n");
      out.write("                                            <option value=\"CAPG\">CAPITAO GENERAL</option>\r\n");
      out.write("                                            <option value=\"CAPM\">CAPITAO MOR</option>\r\n");
      out.write("                                            <option value=\"CAPPM\">CAPITAO PM</option>\r\n");
      out.write("                                            <option value=\"CAPT\">CAPITAO TENENTE</option>\r\n");
      out.write("                                            <option value=\"CAR\">CAR</option>\r\n");
      out.write("                                            <option value=\"CARD\">CARDEAL</option>\r\n");
      out.write("                                            <option value=\"CAT\">CATEQUISTA</option>\r\n");
      out.write("                                            <option value=\"CAV\">CAVALEIRO</option>\r\n");
      out.write("                                            <option value=\"CAVLH\">CAVALHEIRO</option>\r\n");
      out.write("                                            <option value=\"CIN\">CINEASTA</option>\r\n");
      out.write("                                            <option value=\"COMTE\">COMANDANTE</option>\r\n");
      out.write("                                            <option value=\"COMED\">COMEDIANTE</option>\r\n");
      out.write("                                            <option value=\"COMEN\">COMENDADOR</option>\r\n");
      out.write("                                            <option value=\"COMIA\">COMISSARIA</option>\r\n");
      out.write("                                            <option value=\"COMIS\">COMISSARIO</option>\r\n");
      out.write("                                            <option value=\"COMP\">COMPOSITOR</option>\r\n");
      out.write("                                            <option value=\"CD\">CONDE</option>\r\n");
      out.write("                                            <option value=\"CDSSA\">CONDESSA</option>\r\n");
      out.write("                                            <option value=\"CON\">CONEGO</option>\r\n");
      out.write("                                            <option value=\"CONF\">CONFRADE</option>\r\n");
      out.write("                                            <option value=\"CONS\">CONSELHEIRO</option>\r\n");
      out.write("                                            <option value=\"CONSU\">CONSUL</option>\r\n");
      out.write("                                            <option value=\"CEL\">CORONEL</option>\r\n");
      out.write("                                            <option value=\"CELPM\">CORONEL PM</option>\r\n");
      out.write("                                            <option value=\"CRG\">CORREGEDOR</option>\r\n");
      out.write("                                            <option value=\"DEL\">DELEGADO</option>\r\n");
      out.write("                                            <option value=\"DENT\">DENTISTA</option>\r\n");
      out.write("                                            <option value=\"DEPA\">DEPUTADA</option>\r\n");
      out.write("                                            <option value=\"DEP\">DEPUTADO</option>\r\n");
      out.write("                                            <option value=\"DEPDR\">DEPUTADO DOUTOR</option>\r\n");
      out.write("                                            <option value=\"DESEM\">DESEMBARGADOR</option>\r\n");
      out.write("                                            <option value=\"DIACO\">DIACO</option>\r\n");
      out.write("                                            <option value=\"DOM\">DOM</option>\r\n");
      out.write("                                            <option value=\"DONA\">DONA</option>\r\n");
      out.write("                                            <option value=\"DR\">DOUTOR</option>\r\n");
      out.write("                                            <option value=\"DRA\">DOUTORA</option>\r\n");
      out.write("                                            <option value=\"DUQ\">DUQUE</option>\r\n");
      out.write("                                            <option value=\"DUQSA\">DUQUESA</option>\r\n");
      out.write("                                            <option value=\"EDIT\">EDITOR</option>\r\n");
      out.write("                                            <option value=\"EDUC\">EDUCADOR</option>\r\n");
      out.write("                                            <option value=\"EDUCA\">EDUCADORA</option>\r\n");
      out.write("                                            <option value=\"EMB\">EMBAIXADOR</option>\r\n");
      out.write("                                            <option value=\"EMBA\">EMBAIXADORA</option>\r\n");
      out.write("                                            <option value=\"EMP\">EMP</option>\r\n");
      out.write("                                            <option value=\"ENGA\">ENGENHEIRA</option>\r\n");
      out.write("                                            <option value=\"ENG\">ENGENHEIRO</option>\r\n");
      out.write("                                            <option value=\"ESCOT\">ESCOTEIRO</option>\r\n");
      out.write("                                            <option value=\"ESC\">ESCRAVO</option>\r\n");
      out.write("                                            <option value=\"ESCR\">ESCRITOR</option>\r\n");
      out.write("                                            <option value=\"EXP\">EXPEDICIONARIO</option>\r\n");
      out.write("                                            <option value=\"FIS\">FISICO</option>\r\n");
      out.write("                                            <option value=\"FREI\">FREI</option>\r\n");
      out.write("                                            <option value=\"GAL\">GENERAL</option>\r\n");
      out.write("                                            <option value=\"GOV\">GOVERNADOR</option>\r\n");
      out.write("                                            <option value=\"GRUM\">GRUMETE</option>\r\n");
      out.write("                                            <option value=\"GCM\">GUARDA CIVIL METROPOLITANO</option>\r\n");
      out.write("                                            <option value=\"IMAC\">IMACULADA</option>\r\n");
      out.write("                                            <option value=\"IMPD\">IMPERADOR</option>\r\n");
      out.write("                                            <option value=\"IMP\">IMPERATRIZ</option>\r\n");
      out.write("                                            <option value=\"INF\">INFANTE</option>\r\n");
      out.write("                                            <option value=\"INSP\">INSPETOR</option>\r\n");
      out.write("                                            <option value=\"IRMA\">IRMA</option>\r\n");
      out.write("                                            <option value=\"IRMAO\">IRMAO</option>\r\n");
      out.write("                                            <option value=\"IRMOS\">IRMAOS</option>\r\n");
      out.write("                                            <option value=\"IRMAS\">IRMAS</option>\r\n");
      out.write("                                            <option value=\"JORN\">JORNALISTA</option>\r\n");
      out.write("                                            <option value=\"LIB\">LIBERTADOR</option>\r\n");
      out.write("                                            <option value=\"LIDCO\">LIDCO</option>\r\n");
      out.write("                                            <option value=\"LIVR\">LIVREIRO</option>\r\n");
      out.write("                                            <option value=\"LORD\">LORDE</option>\r\n");
      out.write("                                            <option value=\"MME\">MADAME</option>\r\n");
      out.write("                                            <option value=\"MADRE\">MADRE</option>\r\n");
      out.write("                                            <option value=\"MAEST\">MAESTRO</option>\r\n");
      out.write("                                            <option value=\"MAJ\">MAJOR</option>\r\n");
      out.write("                                            <option value=\"MJAVI\">MAJOR AVIADOR</option>\r\n");
      out.write("                                            <option value=\"MJBRI\">MAJOR BRIGADEIRO</option>\r\n");
      out.write("                                            <option value=\"MAQ\">MAQUINISTA</option>\r\n");
      out.write("                                            <option value=\"MAL\">MARECHAL</option>\r\n");
      out.write("                                            <option value=\"MALAR\">MARECHAL DO AR</option>\r\n");
      out.write("                                            <option value=\"MARQ\">MARQUES</option>\r\n");
      out.write("                                            <option value=\"MARQA\">MARQUESA</option>\r\n");
      out.write("                                            <option value=\"MERE\">MERE</option>\r\n");
      out.write("                                            <option value=\"MTRAS\">MESTRAS</option>\r\n");
      out.write("                                            <option value=\"MEST\">MESTRE</option>\r\n");
      out.write("                                            <option value=\"MTRES\">MESTRES</option>\r\n");
      out.write("                                            <option value=\"MIL\">MILITANTE</option>\r\n");
      out.write("                                            <option value=\"MIN\">MINISTRO</option>\r\n");
      out.write("                                            <option value=\"MISSA\">MISSIONARIA</option>\r\n");
      out.write("                                            <option value=\"MISSO\">MISSIONARIO</option>\r\n");
      out.write("                                            <option value=\"MONGE\">MONGE</option>\r\n");
      out.write("                                            <option value=\"MONS\">MONSENHOR</option>\r\n");
      out.write("                                            <option value=\"MUNIC\">MUNIC</option>\r\n");
      out.write("                                            <option value=\"MUS\">MUSICO</option>\r\n");
      out.write("                                            <option value=\"NSRA\">NOSSA SENHORA</option>\r\n");
      out.write("                                            <option value=\"NS\">NOSSO SENHOR</option>\r\n");
      out.write("                                            <option value=\"OUVID\">OUVIDOR</option>\r\n");
      out.write("                                            <option value=\"PDE\">PADRE</option>\r\n");
      out.write("                                            <option value=\"PDES\">PADRES</option>\r\n");
      out.write("                                            <option value=\"PAI\">PAI</option>\r\n");
      out.write("                                            <option value=\"PAPA\">PAPA</option>\r\n");
      out.write("                                            <option value=\"PAST\">PASTOR</option>\r\n");
      out.write("                                            <option value=\"PATR\">PATRIARCA</option>\r\n");
      out.write("                                            <option value=\"POETA\">POETA</option>\r\n");
      out.write("                                            <option value=\"POTSA\">POETISA</option>\r\n");
      out.write("                                            <option value=\"PREF\">PREFEITO</option>\r\n");
      out.write("                                            <option value=\"PRES\">PRESIDENTE</option>\r\n");
      out.write("                                            <option value=\"PABL\">PRESIDENTE DA ACAD.BRAS.LETRAS</option>\r\n");
      out.write("                                            <option value=\"PREVR\">PREVR</option>\r\n");
      out.write("                                            <option value=\"PSARG\">PRIMEIRO SARGENTO</option>\r\n");
      out.write("                                            <option value=\"PSGPM\">PRIMEIRO SARGENTO PM</option>\r\n");
      out.write("                                            <option value=\"PTTE\">PRIMEIRO TENENTE</option>\r\n");
      out.write("                                            <option value=\"PTEPM\">PRIMEIRO TENENTE PM</option>\r\n");
      out.write("                                            <option value=\"PRSA\">PRINCESA</option>\r\n");
      out.write("                                            <option value=\"PRINC\">PRINCIPE</option>\r\n");
      out.write("                                            <option value=\"PROC\">PROCURADOR</option>\r\n");
      out.write("                                            <option value=\"PROF\">PROFESSOR</option>\r\n");
      out.write("                                            <option value=\"PRODR\">PROFESSOR DOUTOR</option>\r\n");
      out.write("                                            <option value=\"PROEN\">PROFESSOR ENGENHEIRO</option>\r\n");
      out.write("                                            <option value=\"PROFA\">PROFESSORA</option>\r\n");
      out.write("                                            <option value=\"PROTA\">PROFETA</option>\r\n");
      out.write("                                            <option value=\"PROM\">PROMOTOR</option>\r\n");
      out.write("                                            <option value=\"PROV\">PROVEDOR</option>\r\n");
      out.write("                                            <option value=\"PRVM\">PROVEDOR MOR</option>\r\n");
      out.write("                                            <option value=\"RAB\">RABINO</option>\r\n");
      out.write("                                            <option value=\"RADTA\">RADIALISTA</option>\r\n");
      out.write("                                            <option value=\"RAINH\">RAINHA</option>\r\n");
      out.write("                                            <option value=\"REG\">REGENTE</option>\r\n");
      out.write("                                            <option value=\"REI\">REI</option>\r\n");
      out.write("                                            <option value=\"REV\">REVERENDO</option>\r\n");
      out.write("                                            <option value=\"R\">RUA</option>\r\n");
      out.write("                                            <option value=\"SCT\">SACERDOTE</option>\r\n");
      out.write("                                            <option value=\"STA\">SANTA</option>\r\n");
      out.write("                                            <option value=\"STO\">SANTO</option>\r\n");
      out.write("                                            <option value=\"S\">SAO</option>\r\n");
      out.write("                                            <option value=\"SARG\">SARGENTO</option>\r\n");
      out.write("                                            <option value=\"SARGM\">SARGENTO MOR</option>\r\n");
      out.write("                                            <option value=\"SGPM\">SARGENTO PM</option>\r\n");
      out.write("                                            <option value=\"SSARG\">SEGUNDO SARGENTO</option>\r\n");
      out.write("                                            <option value=\"SSGPM\">SEGUNDO SARGENTO PM</option>\r\n");
      out.write("                                            <option value=\"STTE\">SEGUNDO TENENTE</option>\r\n");
      out.write("                                            <option value=\"SEN\">SENADOR</option>\r\n");
      out.write("                                            <option value=\"SR\">SENHOR</option>\r\n");
      out.write("                                            <option value=\"SRA\">SENHORA</option>\r\n");
      out.write("                                            <option value=\"SERT\">SERTANISTA</option>\r\n");
      out.write("                                            <option value=\"SIN\">SINHA</option>\r\n");
      out.write("                                            <option value=\"SIR\">SIR</option>\r\n");
      out.write("                                            <option value=\"SOCIO\">SOCIOLOGO</option>\r\n");
      out.write("                                            <option value=\"SOLD\">SOLDADO</option>\r\n");
      out.write("                                            <option value=\"SDPM\">SOLDADO PM</option>\r\n");
      out.write("                                            <option value=\"SOROR\">SOROR</option>\r\n");
      out.write("                                            <option value=\"SBTTE\">SUB TENENTE</option>\r\n");
      out.write("                                            <option value=\"TTE\">TENENTE</option>\r\n");
      out.write("                                            <option value=\"TTAVI\">TENENTE AVIADOR</option>\r\n");
      out.write("                                            <option value=\"TTBRI\">TENENTE BRIGADEIRO</option>\r\n");
      out.write("                                            <option value=\"TTCEL\">TENENTE CORONEL</option>\r\n");
      out.write("                                            <option value=\"TTCPM\">TENENTE CORONEL PM</option>\r\n");
      out.write("                                            <option value=\"TEO\">TEOLOGO</option>\r\n");
      out.write("                                            <option value=\"TSARG\">TERCEIRO SARGENTO</option>\r\n");
      out.write("                                            <option value=\"TSGPM\">TERCEIRO SARGENTO PM</option>\r\n");
      out.write("                                            <option value=\"TIA\">TIA</option>\r\n");
      out.write("                                            <option value=\"VER\">VEREADOR</option>\r\n");
      out.write("                                            <option value=\"VALM\">VICE ALMIRANTE</option>\r\n");
      out.write("                                            <option value=\"VREI\">VICE REI</option>\r\n");
      out.write("                                            <option value=\"VIG\">VIGARIO</option>\r\n");
      out.write("                                            <option value=\"VISC\">VISCONDE</option>\r\n");
      out.write("                                            <option value=\"VISCA\">VISCONDESSA</option>\r\n");
      out.write("                                            <option value=\"VOL\">VOLUNTARIO</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                        <span class=\"lbl\"><strong>Endereço:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-6 col-xs-12\" >\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"nome do endereço\" name=\"nmendereco\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\" >\r\n");
      out.write("                                        <span class=\"lbl\"><strong>número:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"nº\" name=\"nmendereco\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                        <span class=\"lbl\"><strong>Complemento:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\" >\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"complemento do endereço\" name=\"nmcompelnt\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                        <span class=\"lbl\"><strong>Referência:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\" >\r\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"referencia do endereço\" name=\"nmfinalidade\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                     <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Prazo:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\">\r\n");
      out.write("                                        <input type=\"number\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"\" name=\"nrprazo\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Ano</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\">\r\n");
      out.write("                                        <input type=\"number\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"\" name=\"nrprazo\" >\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Meses</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>    \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Categoria da contrapartida:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\r\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"tpDispLegal\">\r\n");
      out.write("                                            <option></option>\r\n");
      out.write("                                            <option>Serviço</option>\r\n");
      out.write("                                            <option>Pecuniária</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                        <span class=\"lbl\"><strong>Contrapartida <font size=\"-2\"> (Descrição Simplificada):</font></strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-9 col-xs-12\">\r\n");
      out.write("                                        <textarea id=\"form-field-11\" class=\"autosize-transition form-control\" name=\"contraSimplificada\" style=\"height:200px; margin-left: 0px;  width: 650px;\"></textarea>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"space-1\"></div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                            <span class=\"lbl\"><strong>Observação:</strong></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label class=\"inline col-md-10 col-xs-12\">\r\n");
      out.write("                                        <textarea id=\"form-field-11\" class=\"autosize-transition form-control\" name=\"observacao\" style=\"height:200px; margin-left: 0px;  width: 650px;\"></textarea>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <h5 class=\"header smaller lbl\"><strong>Dispositivos Legais</strong></h5>\r\n");
      out.write("                                  <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"inline col-md-2 col-xs-12\" >\r\n");
      out.write("                                                <span class=\"lbl\">\r\n");
      out.write("                                                    <strong>Tipo de Dispositivo:</strong>\r\n");
      out.write("                                                </span>\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                        <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                            <select class=\"col-md-12 col-xs-12\" name=\"tpDispLegal\">\r\n");
      out.write("                                                <option></option>\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                        <label class=\"inline col-md-1 col-xs-12\" >\r\n");
      out.write("                                               <span class=\"lbl\"><strong>Número:</strong></span>\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                        <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                            <input type=\"number\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"numero\" name=\"subprefeitura\" >\r\n");
      out.write("                                        </label>\r\n");
      out.write("\r\n");
      out.write("                                        <label class=\"inline col-md-1 col-xs-12\" >\r\n");
      out.write("                                                <span class=\"lbl\"><strong>Data:</strong></span>\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                        <label class=\"inline col-md-2 col-xs-12\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <input class=\"form-control date-picker\" id=\"id-date-picker-1\" name=\"dtDispositivo\" type=\"text\" placeholder=\"dd/mm/aaaa\" data-date-format=\"dd/mm/yyyy\">\r\n");
      out.write("                                                <span class=\"input-group-addon\">\r\n");
      out.write("                                                    <i class=\"fa fa-calendar bigger-110\"></i>\r\n");
      out.write("                                                </span>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                      <div class=\"\">\r\n");
      out.write("                                          <i class=\"fa fa-plus-circle\"></i>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                      \r\n");
      out.write("                                    </div> \r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-actions center\">\r\n");
      out.write("                                    <button class=\"btn btn-yellow\" type=\"reset\" onclick=\"location.href='AutoCessao.jsp?ter=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ter}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\">\r\n");
      out.write("                                        <i class=\"ace-icon fa fa-undo bigger-110\"></i>\r\n");
      out.write("                                        Voltar\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                    <button class=\"btn btn-success\" type=\"submit\">\r\n");
      out.write("                                        <i class=\"ace-icon fa fa-save bigger-110\"></i>\r\n");
      out.write("                                        Salvar\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("<!--Inicio da tab-pane Auto Cessão Terceiros-->              \r\n");
      out.write("                    <div id=\"auto-cessao-terceiro\" class=\"tab-pane ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>    \r\n");
      out.write("    </div>        \r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("    </div><!-- /.main-container --> \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
    _jspx_th_c_set_3.setVar("ter");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.ter}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty ter}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" Terceiro");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty ter}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" Terceiro");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty ter}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" Terceiro");
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
        out.write("                                    ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("    \r\n");
        out.write("                                ");
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
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty ter}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        action=\"\" \r\n");
        out.write("                                    ");
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
        out.write("                                        action=\"\" \r\n");
        out.write("                                    ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("CatAuto");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatAuto.listSelectCatAutoCessao()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatAuto.nmCatAutoCessao != 'Informação não cadastrada'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatAuto.pkCatAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatAuto.nmCatAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatAuto.nmCatAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>  \r\n");
        out.write("                                                ");
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
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty ter}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                         Cedente:\r\n");
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
        out.write("                                                        Cessionário:\r\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("nvadm");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${NvAdm.listNivelAdm()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nvadm.pkNiveladm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nvadm.nnAdm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_choose_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                </option>  \r\n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_choose_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nvadm.nnAdm.length() > 40 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nvadm.nnAdm.substring(0,40)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                                        ");
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

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
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
        out.write("                                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nvadm.nnAdm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                                        ");
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
        out.write("                                                    ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context))
          return true;
        out.write("    \r\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty ter}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                         Cedente:\r\n");
        out.write("                                                    ");
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
        out.write("                                                        Cessionário:\r\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("dplegal");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dpLegal.listDispLegal()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dplegal.pkDispositivoLegal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dplegal.nmDispLegal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dplegal.nmDispLegal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                    </option>  \r\n");
          out.write("                                                ");
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

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty ter}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" in active");
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
}
