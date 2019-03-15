package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AutoCessaoValidacao_002d2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/head.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <body class=\"no-skin\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/top.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"main-container ace-save-state\" id=\"main-container\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/nav.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adicionarCampo.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javaScritp/ajaxSelectSubFinalidade.html", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("<!--Verificação de acesso  -->\n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      br.com.Modelo.TipoAutoCessaoDAO TpCessao = null;
      synchronized (_jspx_page_context) {
        TpCessao = (br.com.Modelo.TipoAutoCessaoDAO) _jspx_page_context.getAttribute("TpCessao", PageContext.PAGE_SCOPE);
        if (TpCessao == null){
          TpCessao = new br.com.Modelo.TipoAutoCessaoDAO();
          _jspx_page_context.setAttribute("TpCessao", TpCessao, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      br.com.Modelo.CatFinalidadeDAO CatFin = null;
      synchronized (_jspx_page_context) {
        CatFin = (br.com.Modelo.CatFinalidadeDAO) _jspx_page_context.getAttribute("CatFin", PageContext.PAGE_SCOPE);
        if (CatFin == null){
          CatFin = new br.com.Modelo.CatFinalidadeDAO();
          _jspx_page_context.setAttribute("CatFin", CatFin, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      br.com.Modelo.CatAutoCessaoDAO CatAuto = null;
      synchronized (_jspx_page_context) {
        CatAuto = (br.com.Modelo.CatAutoCessaoDAO) _jspx_page_context.getAttribute("CatAuto", PageContext.PAGE_SCOPE);
        if (CatAuto == null){
          CatAuto = new br.com.Modelo.CatAutoCessaoDAO();
          _jspx_page_context.setAttribute("CatAuto", CatAuto, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      br.com.Modelo.CatContrapartidaDAO CatContra = null;
      synchronized (_jspx_page_context) {
        CatContra = (br.com.Modelo.CatContrapartidaDAO) _jspx_page_context.getAttribute("CatContra", PageContext.PAGE_SCOPE);
        if (CatContra == null){
          CatContra = new br.com.Modelo.CatContrapartidaDAO();
          _jspx_page_context.setAttribute("CatContra", CatContra, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      br.com.Modelo.TipoDispositivoLegalDAO TpDis = null;
      synchronized (_jspx_page_context) {
        TpDis = (br.com.Modelo.TipoDispositivoLegalDAO) _jspx_page_context.getAttribute("TpDis", PageContext.PAGE_SCOPE);
        if (TpDis == null){
          TpDis = new br.com.Modelo.TipoDispositivoLegalDAO();
          _jspx_page_context.setAttribute("TpDis", TpDis, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      br.com.Modelo.SubPrefeituraDAO subPref = null;
      synchronized (_jspx_page_context) {
        subPref = (br.com.Modelo.SubPrefeituraDAO) _jspx_page_context.getAttribute("subPref", PageContext.PAGE_SCOPE);
        if (subPref == null){
          subPref = new br.com.Modelo.SubPrefeituraDAO();
          _jspx_page_context.setAttribute("subPref", subPref, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      br.com.Modelo.DispositivoLegalDAO Disp = null;
      synchronized (_jspx_page_context) {
        Disp = (br.com.Modelo.DispositivoLegalDAO) _jspx_page_context.getAttribute("Disp", PageContext.PAGE_SCOPE);
        if (Disp == null){
          Disp = new br.com.Modelo.DispositivoLegalDAO();
          _jspx_page_context.setAttribute("Disp", Disp, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      br.com.Modelo.ArquivoDAO Arquivo = null;
      synchronized (_jspx_page_context) {
        Arquivo = (br.com.Modelo.ArquivoDAO) _jspx_page_context.getAttribute("Arquivo", PageContext.PAGE_SCOPE);
        if (Arquivo == null){
          Arquivo = new br.com.Modelo.ArquivoDAO();
          _jspx_page_context.setAttribute("Arquivo", Arquivo, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      br.com.Modelo.NivelAdministracaoDAO NvAdm = null;
      synchronized (_jspx_page_context) {
        NvAdm = (br.com.Modelo.NivelAdministracaoDAO) _jspx_page_context.getAttribute("NvAdm", PageContext.PAGE_SCOPE);
        if (NvAdm == null){
          NvAdm = new br.com.Modelo.NivelAdministracaoDAO();
          _jspx_page_context.setAttribute("NvAdm", NvAdm, PageContext.PAGE_SCOPE);
        }
      }
      out.write("    \n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      if (_jspx_meth_c_set_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("    <div class=\"breadcrumbs ace-save-state\" id=\"breadcrumbs\">\n");
      out.write("        <ul class=\"breadcrumb\">\n");
      out.write("            <li><i class=\"ace-icon fa fa-list\"></i> Validação do Auto de Cessão </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>    \n");
      out.write("    <div class=\"page-content\" >\n");
      out.write("    <div id=\"\" class=\"specific-block\"></div>    \n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        \n");
      out.write(" \n");
      out.write("    <div class=\"col-sm-offset-1 col-sm-10\">\n");
      out.write("        <h2>Validação do Auto de Cessão</h2>\n");
      out.write("        <div class=\"space-14\"></div>\n");
      out.write("        <div class=\"form-horizontal\">\n");
      out.write("            <div class=\"tabbable\">\n");
      out.write("                <ul class=\"nav nav-tabs padding-0\">\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a data-toggle=\"tab\" href=\"#auto-cessao\" aria-expanded=\"true\">\n");
      out.write("                            Validação do Auto Cessão \n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"Dispositivos Legais\">\n");
      out.write("                        <a data-toggle=\"tab\" href=\"#disp-legal\" aria-expanded=\"true\">\n");
      out.write("                           Dispositivos Legais\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"Dispositivos Legais\">\n");
      out.write("                        <a data-toggle=\"tab\" href=\"#anexar-doc\" aria-expanded=\"true\">\n");
      out.write("                           Anexar documentos\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"Valiação\">\n");
      out.write("                        <a data-toggle=\"tab\" href=\"#validacao\" aria-expanded=\"true\">\n");
      out.write("                            Validação\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"tab-content profile-edit-tab-content\">\n");
      out.write("                    <div id=\"auto-cessao\" class=\"tab-pane  in active\">\n");
      out.write("                            <form action=\"\" method=\"POST\" >\n");
      out.write("                                <div class=\"space-4\"></div>\n");
      out.write("                                <div class=\"space-2\"></div>\n");
      out.write("                                <input type=\"hidden\" name=\"pkAutoStage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.pkAutoStage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                            <span class=\"lbl\"><strong>Nº AC:</strong></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nrprocesso\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nmCodAc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"nº do AC\"  >\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                            <span class=\"lbl\">\n");
      out.write("                                                <strong>Categoria</strong>\n");
      out.write("                                            </span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\">\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"pkCatAutoCessao\" required=\"required\">\n");
      out.write("                                            <option>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selCatAuto.nmCatAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                            <option></option>\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                            <span class=\"lbl\"><strong>Data Lavratura:</strong></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12 \">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <input class=\"form-control date-picker\" id=\"id-date-picker-1\" name=\"dtlavratura\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.dtLavratura}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" placeholder=\"dd/mm/aaaa\" data-date-format=\"dd/mm/yyyy\">\n");
      out.write("                                            <span class=\"input-group-addon\">\n");
      out.write("                                                <i class=\"fa fa-calendar bigger-110\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                            <span class=\"lbl\"><strong>Nº Processo:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nrprocesso\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nmProcesso}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"nº do processo\"  >\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"space-1\"></div>    \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Tipo de Cessão:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\">\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"pkTpcessao\">\n");
      out.write("                                            <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selTpCessao.pkTipoAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selTpCessao.nmTipoAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </option>\n");
      out.write("                                            <option value=\"\"></option>    \n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </select>    \n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Nível Adminstração:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"pkNiveladm\">\n");
      out.write("                                            <option value=\"\"></option>    \n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </select>    \n");
      out.write("                                    </label>\n");
      out.write("                                </div>  \n");
      out.write("\n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("                                    \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    \n");
      out.write("                                </div>    \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\">\n");
      out.write("                                            <strong>Cessionário/Cedente:</strong>\n");
      out.write("                                        </span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-9 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmcessionario\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nmCessionario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"nome do cessionário\"  >\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"space-2\"></div>                                \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Categoria da finalidade:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"pkCatFinalidade\" id=\"pkCatFinalidade\" onChange=\"pkCatFin(this)\">\n");
      out.write("                                            <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selCatFin.pkCatFinalidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selCatFin.nmCatFinalidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                            <option></option>    \n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Finalidade:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\">\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"pkSubCatFinalidade\" id=\"selectSubFinalidade\" required=\"required\" ></select>\n");
      out.write("                                    </label>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"space-1\"></div>                           \n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\">\n");
      out.write("                                                <strong>Detalhamento da Finalidade</strong>\n");
      out.write("                                            </span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-8 col-xs-12\">\n");
      out.write("                                        <textarea class=\"form-control\" id=\"form-field-8\" name=\"dsFinalidade\" placeholder=\"Descreve a finalidade ex: Instalação do 75º Distrito Policial-PM\" style=\"margin: 0px 102.656px 0px 0px; width: 600px; height: 50px;\"></textarea>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Planta:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmplanta\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nmPlanta}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"nº da planta\" >\n");
      out.write("                                    </label>\n");
      out.write("\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Croqui:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmcroqui\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nmCroqui}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"nº croqui\" >\n");
      out.write("                                    </label>\n");
      out.write("\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Área do croqui:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmarea\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nrArea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"\" >\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>Setor:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nrSetor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nrSetor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"nº do setor²\"  >\n");
      out.write("                                    </label>\n");
      out.write("\n");
      out.write("                                     <label class=\"inline col-md-1 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Quadra:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\"  name=\"nrquadra\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nrQuadra}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"nº da quadra\">\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Lote:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\"  name=\"nrLote\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nrLote}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"nº do lote\">\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>CAP:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\"  name=\"nmcap\" placeholder=\"nº do cap\">\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Metragem oficial:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">developer \n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\"  name=\"\" placeholder=\"Área m²\">\n");
      out.write("                                    </label>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>Subprefituras: </strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\" >\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"subPrefeitura\" id=\"\">\n");
      out.write("                                            <option></option>    \n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </label>\n");
      out.write("                                    \n");
      out.write("                                    <!--<label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>CEP:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"00000-000\" name=\"\" >\n");
      out.write("                                    </label>-->\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Tipo endereço:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"tipoEndereco\" title=\"Rua / Avenida / Praça / etc\">\n");
      out.write("                                            <option></option>\n");
      out.write("                                            <option value=\"AC\">ACESSO</option>\n");
      out.write("                                            <option value=\"AL\">ALAMEDA</option>\n");
      out.write("                                            <option value=\"AVJ\">AV. PROJETADA</option>\n");
      out.write("                                            <option value=\"AV\">AVENIDA</option>\n");
      out.write("                                            <option value=\"BLR\">BALAO RETORNO</option>\n");
      out.write("                                            <option value=\"BC\">BECO</option>\n");
      out.write("                                            <option value=\"CM\">CAMINHO</option>\n");
      out.write("                                            <option value=\"CMP\">CAMINHO PART</option>\n");
      out.write("                                            <option value=\"CP\">CAMINHO PEDEST</option>\n");
      out.write("                                            <option value=\"CV\">COMPLEXO VIARIO</option>\n");
      out.write("                                            <option value=\"DV\">DESVIO</option>\n");
      out.write("                                            <option value=\"DIV\">DIV</option>\n");
      out.write("                                            <option value=\"ENT\">ENT</option>\n");
      out.write("                                            <option value=\"ESJ\">ES. PROJETADA</option>\n");
      out.write("                                            <option value=\"ESC\">ESC</option>\n");
      out.write("                                            <option value=\"EL\">ESPACO LIVRE</option>\n");
      out.write("                                            <option value=\"EPL\">ESPLANADA</option>\n");
      out.write("                                            <option value=\"ER\">EST. DE RODAGEM</option>\n");
      out.write("                                            <option value=\"EST\">ESTACIONAMENTO</option>\n");
      out.write("                                            <option value=\"EF\">ESTR. DE FERRO</option>\n");
      out.write("                                            <option value=\"ES\">ESTRADA</option>\n");
      out.write("                                            <option value=\"ESP\">ESTRADA PART</option>\n");
      out.write("                                            <option value=\"GL\">GALERIA</option>\n");
      out.write("                                            <option value=\"JD\">JARDIM</option>\n");
      out.write("                                            <option value=\"LD\">LADEIRA</option>\n");
      out.write("                                            <option value=\"LG\">LARGO</option>\n");
      out.write("                                            <option value=\"PQ\">PARQUE</option>\n");
      out.write("                                            <option value=\"PS\">PASSAGEM</option>\n");
      out.write("                                            <option value=\"PSP\">PASSAGEM PART</option>\n");
      out.write("                                            <option value=\"PA\">PASSARELA</option>\n");
      out.write("                                            <option value=\"PT\">PATIO</option>\n");
      out.write("                                            <option value=\"PTE\">PONTE</option>\n");
      out.write("                                            <option value=\"PTL\">PONTILHAO</option>\n");
      out.write("                                            <option value=\"PQE\">PQE</option>\n");
      out.write("                                            <option value=\"PQL\">PQL</option>\n");
      out.write("                                            <option value=\"PQM\">PQM</option>\n");
      out.write("                                            <option value=\"PC\">PRACA</option>\n");
      out.write("                                            <option value=\"PCM\">PRACA MANOBRA</option>\n");
      out.write("                                            <option value=\"PCJ\">PRACA PROJETADA</option>\n");
      out.write("                                            <option value=\"PCR\">PRACA RETORNO</option>\n");
      out.write("                                            <option value=\"PRO\">PRO</option>\n");
      out.write("                                            <option value=\"PSJ\">PS PROJETADA</option>\n");
      out.write("                                            <option value=\"PP\">PS. DE PEDESTRE</option>\n");
      out.write("                                            <option value=\"PSS\">PS. SUBTERRANEA</option>\n");
      out.write("                                            <option value=\"RV\">RODOVIA</option>\n");
      out.write("                                            <option value=\"R\">RUA</option>\n");
      out.write("                                            <option value=\"RP\">RUA PART</option>\n");
      out.write("                                            <option value=\"RPJ\">RUA PROJETADA</option>\n");
      out.write("                                            <option value=\"SV\">SERVIDAO</option>\n");
      out.write("                                            <option value=\"TV\">TRAVESSA</option>\n");
      out.write("                                            <option value=\"TVP\">TRAVESSA PART</option>\n");
      out.write("                                            <option value=\"TN\">TUNEL</option>\n");
      out.write("                                            <option value=\"TPJ\">TV PROJETADA</option>\n");
      out.write("                                            <option value=\"VER\">VEREDA</option>\n");
      out.write("                                            <option value=\"VIA\">VIA</option>\n");
      out.write("                                            <option value=\"VCP\">VIA CIRC PEDEST</option>\n");
      out.write("                                            <option value=\"VP\">VIA DE PEDESTRE</option>\n");
      out.write("                                            <option value=\"VEL\">VIA ELEVADA</option>\n");
      out.write("                                            <option value=\"VD\">VIADUTO</option>\n");
      out.write("                                            <option value=\"VE\">VIELA</option>\n");
      out.write("                                            <option value=\"VEP\">VIELA PART</option>\n");
      out.write("                                            <option value=\"VEJ\">VIELA PROJETADA</option>\n");
      out.write("                                            <option value=\"VES\">VIELA SANITARIA</option>\n");
      out.write("                                            <option value=\"VL\">VILA</option>\n");
      out.write("                                            <option value=\"VLP\">VLP</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Título do endereço:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\" >\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"tituloEndereco\" title=\"Capitão / Doutor / Dom / etc\">\n");
      out.write("                                            <option></option>\n");
      out.write("                                            <option value=\"ABADE\">ABADE</option>\n");
      out.write("                                            <option value=\"ACD\">ACADEMICO</option>\n");
      out.write("                                            <option value=\"ADV\">ADVOGADO</option>\n");
      out.write("                                            <option value=\"AGTE\">AGENTE</option>\n");
      out.write("                                            <option value=\"AGRIC\">AGRIC</option>\n");
      out.write("                                            <option value=\"AGRIM\">AGRIMENSOR</option>\n");
      out.write("                                            <option value=\"AJUD\">AJUDANTE</option>\n");
      out.write("                                            <option value=\"ALF\">ALFERES</option>\n");
      out.write("                                            <option value=\"ALM\">ALMIRANTE</option>\n");
      out.write("                                            <option value=\"APOST\">APOSTOLO</option>\n");
      out.write("                                            <option value=\"ARC\">ARCEBISPO</option>\n");
      out.write("                                            <option value=\"ARCIP\">ARCIP</option>\n");
      out.write("                                            <option value=\"ARCJO\">ARCJO</option>\n");
      out.write("                                            <option value=\"ARQA\">ARQUITETA</option>\n");
      out.write("                                            <option value=\"ARQ\">ARQUITETO</option>\n");
      out.write("                                            <option value=\"ARQPR\">ARQUITETO PROFESSOR</option>\n");
      out.write("                                            <option value=\"ASP\">ASPIRANTE</option>\n");
      out.write("                                            <option value=\"AV\">AVENIDA</option>\n");
      out.write("                                            <option value=\"AVI\">AVIADOR</option>\n");
      out.write("                                            <option value=\"AVIA\">AVIADORA</option>\n");
      out.write("                                            <option value=\"BEL\">BACHAREL</option>\n");
      out.write("                                            <option value=\"BAND\">BANDEIRANTE</option>\n");
      out.write("                                            <option value=\"BANQ\">BANQUEIRO</option>\n");
      out.write("                                            <option value=\"BR\">BARAO</option>\n");
      out.write("                                            <option value=\"BRA\">BARONESA</option>\n");
      out.write("                                            <option value=\"BEPDE\">BEATO PADRE</option>\n");
      out.write("                                            <option value=\"BEMAV\">BEM AVENTURADO</option>\n");
      out.write("                                            <option value=\"BNTO\">BENEMERITO</option>\n");
      out.write("                                            <option value=\"BISP\">BISPO</option>\n");
      out.write("                                            <option value=\"BRIG\">BRIGADEIRO</option>\n");
      out.write("                                            <option value=\"CABO\">CABO</option>\n");
      out.write("                                            <option value=\"CABPM\">CABO PM</option>\n");
      out.write("                                            <option value=\"CAD\">CADETE</option>\n");
      out.write("                                            <option value=\"CAMP\">CAMPEADOR</option>\n");
      out.write("                                            <option value=\"CAP\">CAPITAO</option>\n");
      out.write("                                            <option value=\"CPALM\">CAPITAO ALMIRANTE</option>\n");
      out.write("                                            <option value=\"CAPFR\">CAPITAO DE FRAGATA</option>\n");
      out.write("                                            <option value=\"CAPMG\">CAPITAO DE MAR E GUERRA</option>\n");
      out.write("                                            <option value=\"CAPG\">CAPITAO GENERAL</option>\n");
      out.write("                                            <option value=\"CAPM\">CAPITAO MOR</option>\n");
      out.write("                                            <option value=\"CAPPM\">CAPITAO PM</option>\n");
      out.write("                                            <option value=\"CAPT\">CAPITAO TENENTE</option>\n");
      out.write("                                            <option value=\"CAR\">CAR</option>\n");
      out.write("                                            <option value=\"CARD\">CARDEAL</option>\n");
      out.write("                                            <option value=\"CAT\">CATEQUISTA</option>\n");
      out.write("                                            <option value=\"CAV\">CAVALEIRO</option>\n");
      out.write("                                            <option value=\"CAVLH\">CAVALHEIRO</option>\n");
      out.write("                                            <option value=\"CIN\">CINEASTA</option>\n");
      out.write("                                            <option value=\"COMTE\">COMANDANTE</option>\n");
      out.write("                                            <option value=\"COMED\">COMEDIANTE</option>\n");
      out.write("                                            <option value=\"COMEN\">COMENDADOR</option>\n");
      out.write("                                            <option value=\"COMIA\">COMISSARIA</option>\n");
      out.write("                                            <option value=\"COMIS\">COMISSARIO</option>\n");
      out.write("                                            <option value=\"COMP\">COMPOSITOR</option>\n");
      out.write("                                            <option value=\"CD\">CONDE</option>\n");
      out.write("                                            <option value=\"CDSSA\">CONDESSA</option>\n");
      out.write("                                            <option value=\"CON\">CONEGO</option>\n");
      out.write("                                            <option value=\"CONF\">CONFRADE</option>\n");
      out.write("                                            <option value=\"CONS\">CONSELHEIRO</option>\n");
      out.write("                                            <option value=\"CONSU\">CONSUL</option>\n");
      out.write("                                            <option value=\"CEL\">CORONEL</option>\n");
      out.write("                                            <option value=\"CELPM\">CORONEL PM</option>\n");
      out.write("                                            <option value=\"CRG\">CORREGEDOR</option>\n");
      out.write("                                            <option value=\"DEL\">DELEGADO</option>\n");
      out.write("                                            <option value=\"DENT\">DENTISTA</option>\n");
      out.write("                                            <option value=\"DEPA\">DEPUTADA</option>\n");
      out.write("                                            <option value=\"DEP\">DEPUTADO</option>\n");
      out.write("                                            <option value=\"DEPDR\">DEPUTADO DOUTOR</option>\n");
      out.write("                                            <option value=\"DESEM\">DESEMBARGADOR</option>\n");
      out.write("                                            <option value=\"DIACO\">DIACO</option>\n");
      out.write("                                            <option value=\"DOM\">DOM</option>\n");
      out.write("                                            <option value=\"DONA\">DONA</option>\n");
      out.write("                                            <option value=\"DR\">DOUTOR</option>\n");
      out.write("                                            <option value=\"DRA\">DOUTORA</option>\n");
      out.write("                                            <option value=\"DUQ\">DUQUE</option>\n");
      out.write("                                            <option value=\"DUQSA\">DUQUESA</option>\n");
      out.write("                                            <option value=\"EDIT\">EDITOR</option>\n");
      out.write("                                            <option value=\"EDUC\">EDUCADOR</option>\n");
      out.write("                                            <option value=\"EDUCA\">EDUCADORA</option>\n");
      out.write("                                            <option value=\"EMB\">EMBAIXADOR</option>\n");
      out.write("                                            <option value=\"EMBA\">EMBAIXADORA</option>\n");
      out.write("                                            <option value=\"EMP\">EMP</option>\n");
      out.write("                                            <option value=\"ENGA\">ENGENHEIRA</option>\n");
      out.write("                                            <option value=\"ENG\">ENGENHEIRO</option>\n");
      out.write("                                            <option value=\"ESCOT\">ESCOTEIRO</option>\n");
      out.write("                                            <option value=\"ESC\">ESCRAVO</option>\n");
      out.write("                                            <option value=\"ESCR\">ESCRITOR</option>\n");
      out.write("                                            <option value=\"EXP\">EXPEDICIONARIO</option>\n");
      out.write("                                            <option value=\"FIS\">FISICO</option>\n");
      out.write("                                            <option value=\"FREI\">FREI</option>\n");
      out.write("                                            <option value=\"GAL\">GENERAL</option>\n");
      out.write("                                            <option value=\"GOV\">GOVERNADOR</option>\n");
      out.write("                                            <option value=\"GRUM\">GRUMETE</option>\n");
      out.write("                                            <option value=\"GCM\">GUARDA CIVIL METROPOLITANO</option>\n");
      out.write("                                            <option value=\"IMAC\">IMACULADA</option>\n");
      out.write("                                            <option value=\"IMPD\">IMPERADOR</option>\n");
      out.write("                                            <option value=\"IMP\">IMPERATRIZ</option>\n");
      out.write("                                            <option value=\"INF\">INFANTE</option>\n");
      out.write("                                            <option value=\"INSP\">INSPETOR</option>\n");
      out.write("                                            <option value=\"IRMA\">IRMA</option>\n");
      out.write("                                            <option value=\"IRMAO\">IRMAO</option>\n");
      out.write("                                            <option value=\"IRMOS\">IRMAOS</option>\n");
      out.write("                                            <option value=\"IRMAS\">IRMAS</option>\n");
      out.write("                                            <option value=\"JORN\">JORNALISTA</option>\n");
      out.write("                                            <option value=\"LIB\">LIBERTADOR</option>\n");
      out.write("                                            <option value=\"LIDCO\">LIDCO</option>\n");
      out.write("                                            <option value=\"LIVR\">LIVREIRO</option>\n");
      out.write("                                            <option value=\"LORD\">LORDE</option>\n");
      out.write("                                            <option value=\"MME\">MADAME</option>\n");
      out.write("                                            <option value=\"MADRE\">MADRE</option>\n");
      out.write("                                            <option value=\"MAEST\">MAESTRO</option>\n");
      out.write("                                            <option value=\"MAJ\">MAJOR</option>\n");
      out.write("                                            <option value=\"MJAVI\">MAJOR AVIADOR</option>\n");
      out.write("                                            <option value=\"MJBRI\">MAJOR BRIGADEIRO</option>\n");
      out.write("                                            <option value=\"MAQ\">MAQUINISTA</option>\n");
      out.write("                                            <option value=\"MAL\">MARECHAL</option>\n");
      out.write("                                            <option value=\"MALAR\">MARECHAL DO AR</option>\n");
      out.write("                                            <option value=\"MARQ\">MARQUES</option>\n");
      out.write("                                            <option value=\"MARQA\">MARQUESA</option>\n");
      out.write("                                            <option value=\"MERE\">MERE</option>\n");
      out.write("                                            <option value=\"MTRAS\">MESTRAS</option>\n");
      out.write("                                            <option value=\"MEST\">MESTRE</option>\n");
      out.write("                                            <option value=\"MTRES\">MESTRES</option>\n");
      out.write("                                            <option value=\"MIL\">MILITANTE</option>\n");
      out.write("                                            <option value=\"MIN\">MINISTRO</option>\n");
      out.write("                                            <option value=\"MISSA\">MISSIONARIA</option>\n");
      out.write("                                            <option value=\"MISSO\">MISSIONARIO</option>\n");
      out.write("                                            <option value=\"MONGE\">MONGE</option>\n");
      out.write("                                            <option value=\"MONS\">MONSENHOR</option>\n");
      out.write("                                            <option value=\"MUNIC\">MUNIC</option>\n");
      out.write("                                            <option value=\"MUS\">MUSICO</option>\n");
      out.write("                                            <option value=\"NSRA\">NOSSA SENHORA</option>\n");
      out.write("                                            <option value=\"NS\">NOSSO SENHOR</option>\n");
      out.write("                                            <option value=\"OUVID\">OUVIDOR</option>\n");
      out.write("                                            <option value=\"PDE\">PADRE</option>\n");
      out.write("                                            <option value=\"PDES\">PADRES</option>\n");
      out.write("                                            <option value=\"PAI\">PAI</option>\n");
      out.write("                                            <option value=\"PAPA\">PAPA</option>\n");
      out.write("                                            <option value=\"PAST\">PASTOR</option>\n");
      out.write("                                            <option value=\"PATR\">PATRIARCA</option>\n");
      out.write("                                            <option value=\"POETA\">POETA</option>\n");
      out.write("                                            <option value=\"POTSA\">POETISA</option>\n");
      out.write("                                            <option value=\"PREF\">PREFEITO</option>\n");
      out.write("                                            <option value=\"PRES\">PRESIDENTE</option>\n");
      out.write("                                            <option value=\"PABL\">PRESIDENTE DA ACAD.BRAS.LETRAS</option>\n");
      out.write("                                            <option value=\"PREVR\">PREVR</option>\n");
      out.write("                                            <option value=\"PSARG\">PRIMEIRO SARGENTO</option>\n");
      out.write("                                            <option value=\"PSGPM\">PRIMEIRO SARGENTO PM</option>\n");
      out.write("                                            <option value=\"PTTE\">PRIMEIRO TENENTE</option>\n");
      out.write("                                            <option value=\"PTEPM\">PRIMEIRO TENENTE PM</option>\n");
      out.write("                                            <option value=\"PRSA\">PRINCESA</option>\n");
      out.write("                                            <option value=\"PRINC\">PRINCIPE</option>\n");
      out.write("                                            <option value=\"PROC\">PROCURADOR</option>\n");
      out.write("                                            <option value=\"PROF\">PROFESSOR</option>\n");
      out.write("                                            <option value=\"PRODR\">PROFESSOR DOUTOR</option>\n");
      out.write("                                            <option value=\"PROEN\">PROFESSOR ENGENHEIRO</option>\n");
      out.write("                                            <option value=\"PROFA\">PROFESSORA</option>\n");
      out.write("                                            <option value=\"PROTA\">PROFETA</option>\n");
      out.write("                                            <option value=\"PROM\">PROMOTOR</option>\n");
      out.write("                                            <option value=\"PROV\">PROVEDOR</option>\n");
      out.write("                                            <option value=\"PRVM\">PROVEDOR MOR</option>\n");
      out.write("                                            <option value=\"RAB\">RABINO</option>\n");
      out.write("                                            <option value=\"RADTA\">RADIALISTA</option>\n");
      out.write("                                            <option value=\"RAINH\">RAINHA</option>\n");
      out.write("                                            <option value=\"REG\">REGENTE</option>\n");
      out.write("                                            <option value=\"REI\">REI</option>\n");
      out.write("                                            <option value=\"REV\">REVERENDO</option>\n");
      out.write("                                            <option value=\"R\">RUA</option>\n");
      out.write("                                            <option value=\"SCT\">SACERDOTE</option>\n");
      out.write("                                            <option value=\"STA\">SANTA</option>\n");
      out.write("                                            <option value=\"STO\">SANTO</option>\n");
      out.write("                                            <option value=\"S\">SAO</option>\n");
      out.write("                                            <option value=\"SARG\">SARGENTO</option>\n");
      out.write("                                            <option value=\"SARGM\">SARGENTO MOR</option>\n");
      out.write("                                            <option value=\"SGPM\">SARGENTO PM</option>\n");
      out.write("                                            <option value=\"SSARG\">SEGUNDO SARGENTO</option>\n");
      out.write("                                            <option value=\"SSGPM\">SEGUNDO SARGENTO PM</option>\n");
      out.write("                                            <option value=\"STTE\">SEGUNDO TENENTE</option>\n");
      out.write("                                            <option value=\"SEN\">SENADOR</option>\n");
      out.write("                                            <option value=\"SR\">SENHOR</option>\n");
      out.write("                                            <option value=\"SRA\">SENHORA</option>\n");
      out.write("                                            <option value=\"SERT\">SERTANISTA</option>\n");
      out.write("                                            <option value=\"SIN\">SINHA</option>\n");
      out.write("                                            <option value=\"SIR\">SIR</option>\n");
      out.write("                                            <option value=\"SOCIO\">SOCIOLOGO</option>\n");
      out.write("                                            <option value=\"SOLD\">SOLDADO</option>\n");
      out.write("                                            <option value=\"SDPM\">SOLDADO PM</option>\n");
      out.write("                                            <option value=\"SOROR\">SOROR</option>\n");
      out.write("                                            <option value=\"SBTTE\">SUB TENENTE</option>\n");
      out.write("                                            <option value=\"TTE\">TENENTE</option>\n");
      out.write("                                            <option value=\"TTAVI\">TENENTE AVIADOR</option>\n");
      out.write("                                            <option value=\"TTBRI\">TENENTE BRIGADEIRO</option>\n");
      out.write("                                            <option value=\"TTCEL\">TENENTE CORONEL</option>\n");
      out.write("                                            <option value=\"TTCPM\">TENENTE CORONEL PM</option>\n");
      out.write("                                            <option value=\"TEO\">TEOLOGO</option>\n");
      out.write("                                            <option value=\"TSARG\">TERCEIRO SARGENTO</option>\n");
      out.write("                                            <option value=\"TSGPM\">TERCEIRO SARGENTO PM</option>\n");
      out.write("                                            <option value=\"TIA\">TIA</option>\n");
      out.write("                                            <option value=\"VER\">VEREADOR</option>\n");
      out.write("                                            <option value=\"VALM\">VICE ALMIRANTE</option>\n");
      out.write("                                            <option value=\"VREI\">VICE REI</option>\n");
      out.write("                                            <option value=\"VIG\">VIGARIO</option>\n");
      out.write("                                            <option value=\"VISC\">VISCONDE</option>\n");
      out.write("                                            <option value=\"VISCA\">VISCONDESSA</option>\n");
      out.write("                                            <option value=\"VOL\">VOLUNTARIO</option>\n");
      out.write("                                        </select>\n");
      out.write("\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>Endereço:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-6 col-xs-12\" >\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmendereco\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nmEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  placeholder=\"nome do endereço\">\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>número:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmendereco\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nrEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"nº\" >\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>Complemento:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\" >\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmcomplemento\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nmComplementoEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"complemento do endereço\" >\n");
      out.write("                                    </label>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >  \n");
      out.write("                                        <span class=\"lbl\"><strong>Referência:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-8 col-xs-12\" >\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmfinalidade\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nmReferencialEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"referencia do endereço\" >\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                              \n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                     <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Prazo:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                        <input type=\"number\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"\" name=\"nrprazoAno\" >\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Ano</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                        <input type=\"number\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"\" name=\"nrprazoMes\" >\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-1 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Meses</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    \n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\n");
      out.write("                                        <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.nrPrazo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                                    </label>\n");
      out.write("                                    \n");
      out.write("                                </div>    \n");
      out.write("\n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Categoria da contrapartida:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\">\n");
      out.write("                                        <select class=\"col-md-12 col-xs-12\" name=\"\">\n");
      out.write("                                            <option></option>\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>Contrapartida <font size=\"-2\"> (Descrição Simplificada):</font></strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-9 col-xs-12\">\n");
      out.write("                                        <textarea class=\"form-control\" id=\"form-field-8\" name=\"dsContrapartida\" placeholder=\"\" style=\"margin: 0px 102.656px 0px 0px; width: 600px; height: 50px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.dsContrapartida}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"space-1\"></div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Observação:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-10 col-xs-12\">\n");
      out.write("                                        <textarea class=\"form-control\" id=\"form-field-8\" name=\"dsObservacao\" placeholder=\"\" style=\"margin: 0px 102.656px 0px 0px; width: 600px; height: 50px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.dsObservacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"space-2\"></div>\n");
      out.write("                                \n");
      out.write("                                <h5 class=\"header smaller lbl\"><strong>Dispositivo Legais</strong></h5>\n");
      out.write("                                \n");
      out.write("                                <div class=\"input_fields_wrap\" >\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\">\n");
      out.write("                                                <strong>Tipo de Dispositivo:</strong>\n");
      out.write("                                            </span>\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"inline col-md-3 col-xs-12\">\n");
      out.write("                                            <select class=\"col-md-12 col-xs-12\" name=\"tpDispLegal\">\n");
      out.write("                                                <option></option>\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"inline col-md-1 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Número:</strong></span>\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                            <input type=\"number\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"numero\" name=\"subprefeitura\" >\n");
      out.write("                                        </label>\n");
      out.write("\n");
      out.write("                                        <label class=\"inline col-md-1 col-xs-12\" >\n");
      out.write("                                            <span class=\"lbl\"><strong>Data:</strong></span>\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <input class=\"form-control date-picker\" id=\"id-date-picker-1\" name=\"dtDispositivo\" type=\"text\" placeholder=\"dd/mm/aaaa\" data-date-format=\"dd/mm/yyyy\">\n");
      out.write("                                                <span class=\"input-group-addon\">\n");
      out.write("                                                    <i class=\"fa fa-calendar bigger-110\"></i>\n");
      out.write("                                                </span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </label>\n");
      out.write("                                        <a href=\"#\" class=\"add_field_button\" title=\"Adicionar dispositivos\"><span class=\"label label-success arrowed\"><i class=\" fa fa-plus\"></i></span></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"space-2\"></div>\n");
      out.write("                               \n");
      out.write("                                <h5 class=\"header smaller lbl\"><strong>Anexar Documentos</strong></h5>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-3 col-xs-12\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_set_13(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("                                        ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </label>        \n");
      out.write("                                    <label class=\"col-md-8 col-xs-12\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </label>\n");
      out.write("                                </div>        \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-3 col-xs-12\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_set_14(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                        ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"col-md-8 col-xs-12\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </label>        \n");
      out.write("                                </div>\n");
      out.write("                         \n");
      out.write("                                <div class=\"space-2\" ></div>\n");
      out.write("                                \n");
      out.write("                                <h5 class=\"header smaller lbl\"><strong>VALIAÇÃO</strong></h5>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\">\n");
      out.write("                                            <strong>Situação:</strong>\n");
      out.write("                                        </span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-10 col-xs-12\">\n");
      out.write("                                        <select class=\"col-md-3 col-xs-12\" name=\"tpDispLegal\">\n");
      out.write("                                            <option></option>\n");
      out.write("                                            <option>Pendente</option>\n");
      out.write("                                            <option>Validado</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </label>\n");
      out.write("                                </div> \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>Tipo de Problema:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\">\n");
      out.write("                                        <select class=\"col-md-10 col-xs-12\" name=\"tpDispLegal\">\n");
      out.write("                                            <option></option>\n");
      out.write("                                            <option>Documento do Auto Cessão</option>\n");
      out.write("                                            <option>Planta</option>\n");
      out.write("                                            <option>Georreferenciamento</option>\n");
      out.write("                                            <option>Dificuldade na localização</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </label>\n");
      out.write("\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>Divisão responsável:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-3 col-xs-12\">\n");
      out.write("                                        <select class=\"\" name=\"tpDispLegal\">\n");
      out.write("                                            <option></option>\n");
      out.write("                                            <option>DDPI</option>\n");
      out.write("                                            <option>DEAPI</option>\n");
      out.write("                                            <option>DIPI</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>Tarefa p/ solução:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-4 col-xs-12\">\n");
      out.write("                                        <select class=\"col-md-10 col-xs-12\" name=\"tpDispLegal\">\n");
      out.write("                                            <option></option>\n");
      out.write("                                            <option>Refazer polígono</option>\n");
      out.write("                                            <option>Refazer planta</option>\n");
      out.write("                                            <option>Chamar processo</option>\n");
      out.write("                                            <option>Vistória no local</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"inline col-md-2 col-xs-12\" >\n");
      out.write("                                        <span class=\"lbl\"><strong>Notas:</strong></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"inline col-md-10 col-xs-12\">\n");
      out.write("                                        <textarea id=\"form-field-11\" class=\"autosize-transition form-control\" name=\"Nota\" style=\"height:200px; margin-left: 0px;  width: 650px;\"></textarea>\n");
      out.write("                                    </label> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"space-2\"></div>\n");
      out.write("                                <div class=\"form-actions center\">\n");
      out.write("                                    <button class=\"btn btn-yellow other-block preview\" type=\"reset\" onclick=\"location.href='ControllerServlet?acao=AutoCessaoValidacaoLista&pg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&pi=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&pf=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&qProcesso=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qProcesso}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&qAC=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qAC}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&qVigor=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qVigor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\">\n");
      out.write("                                        <i class=\"ace-icon fa fa-undo bigger-110\"></i>\n");
      out.write("                                        Voltar\n");
      out.write("                                    </button>\n");
      out.write("                                    <button class=\"btn btn-success\" type=\"submit\">\n");
      out.write("                                        <i class=\"ace-icon fa fa-save bigger-110\"></i>\n");
      out.write("                                        Salvar\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("<!--Inicio da tab-pane Dispositvo Legal-->              \n");
      out.write("                    <div id=\"disp-legal\" class=\"tab-pane\">\n");
      out.write("                         \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("<!--Inicico da tab-pane Anexer Documento -->\n");
      out.write("                    <div id=\"anexar-doc\" class=\"tab-pane\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                             \n");
      out.write("<!-- Inicio do formulario Validação -->                             \n");
      out.write("                    <div id=\"validacao\" class=\"tab-pane\">\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("    </div>        \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javaScritp/carregado.html", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    </div><!-- /.main-container -->\n");
      out.write("    <div id=\"dialog-planta\"style=\"display:none;\">\n");
      out.write("        <form action=\"ControllerServlet?acao=ArquivoUpload\" enctype=\"multipart/form-data\" method=\"POST\" >\n");
      out.write("            <input type=\"hidden\" name=\"pkAutoStage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.pkAutoStage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <input type=\"hidden\" name=\"tipoArquivo\" value=\"planta\" />\n");
      out.write("            <input type=\"hidden\" name=\"Origem\" value=\"AutoCessao\" />\n");
      out.write("            ");
      if (_jspx_meth_c_set_15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"pkArquivo\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\" />   \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               <label class=\"inline col-md-3 col-xs-12\"><strong>Nome da Planta:</strong></label>\n");
      out.write("               <label class=\"inline col-md-3\">\n");
      out.write("                   <input type=\"text\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" name=\"nmPlantaAnexa\" placeholder=\"Nome da Planta\" required=\"required\" >\n");
      out.write("               </label>\n");
      out.write("               <label class=\"inline col-md-4 col-xs-12\">\n");
      out.write("                   <input type=\"file\" id=\"id-input-file-2\" name=\"UploadPlanta\" required=\"required\"><span class=\"ace-file-container\" data-title=\"Choose\"><span class=\"ace-file-name\" data-title=\"No File ...\"></span></span>\n");
      out.write("               </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"inline col-md-offset-4 col-md-2 col-xs-12\">\n");
      out.write("                    <button class=\"btn btn-success\" type=\"submit\">\n");
      out.write("                        <i class=\"ace-icon fa fa-save bigger-110\"></i>\n");
      out.write("                        Salvar\n");
      out.write("                    </button>\n");
      out.write("                </label>    \n");
      out.write("           </div>\n");
      out.write("       </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"dialog-auto-cessao\"style=\"display:none;\">\n");
      out.write("        <form action=\"ControllerServlet?acao=ArquivoUpload\" method=\"POST\"  enctype=\"multipart/form-data\">\n");
      out.write("            <input type=\"hidden\" name=\"pkAutoStage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auto.pkAutoStage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <input type=\"hidden\" name=\"tipoArquivo\" value=\"AC\" />\n");
      out.write("            <input type=\"hidden\" name=\"Origem\" value=\"AutoCessao\" />\n");
      out.write("            ");
      if (_jspx_meth_c_set_16(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"pkArquivo\" value=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\" /> \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               <label class=\"inline col-md-8 col-xs-12\">\n");
      out.write("                   <input type=\"file\" id=\"id-input-file-2\" name=\"UploadAC\" required=\"required\" ><span class=\"ace-file-container\" data-title=\"Choose\"><span class=\"ace-file-name\" data-title=\"No File ...\"></span></span>\n");
      out.write("               </label>\n");
      out.write("                <label class=\"inline col-md-2 col-xs-12\">\n");
      out.write("                    <button class=\"btn btn-success\"  type=\"submit\">\n");
      out.write("                        <i class=\"ace-icon fa fa-save bigger-110\"></i>\n");
      out.write("                        Salvar\n");
      out.write("                    </button>\n");
      out.write("                </label>   \n");
      out.write("            </div>\n");
      out.write("       </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
    _jspx_th_c_set_3.setVar("selTpCessao");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${TpCessao.detalheTpCessao(auto.fkTipoCessaoStage)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_4.setVar("selCatAuto");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatAuto.detalheCatAuto(auto.fkCatAutoStage)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_5.setVar("selCatFin");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatFin.detalheCatFinalidade(auto.fkCatFinalidadeStage)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_6.setVar("ter");
    _jspx_th_c_set_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.ter}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_7.setVar("qProcesso");
    _jspx_th_c_set_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.qProcesso}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_8.setVar("qAC");
    _jspx_th_c_set_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.qAC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_9.setVar("qVigor");
    _jspx_th_c_set_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.qVigor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_10.setVar("pg");
    _jspx_th_c_set_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_11.setVar("pf");
    _jspx_th_c_set_11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pf}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_12.setVar("pi");
    _jspx_th_c_set_12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pi}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_12 = _jspx_th_c_set_12.doStartTag();
    if (_jspx_th_c_set_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_12);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_12);
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
          out.write("\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatAuto.nmCatAutoCessao != 'Informação não cadastrada'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatAuto.pkCatAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatAuto.nmCatAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatAuto.nmCatAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>  \n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("cat");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${TpCessao.listSelectTpCessao()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.pkTipoAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.nmTipoAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.nmTipoAutoCessao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>  \n");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("nv");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${NvAdm.listNivelAdm()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <option value=\"nv.pkAdm\" title=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nv.nmAdm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>  \n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("catFin");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatFin.listSelectCatFinalidade()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catFin.nmCatFinalidade != 'Informação não cadastrada'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catFin.pkCatFinalidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catFin.nmCatFinalidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catFin.nmCatFinalidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>  \n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("subPref");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subPref.listSelectSubPref()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subPref.pkSubPrefeitura}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subPref.nmSubPrefeitura}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subPref.nmSubPrefeitura}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>  \n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setVar("catContra");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatContra.listSelectCatContra()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catContra.pkCatContrapartida}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catContra.nmCatContrapartida}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catContra.nmCatContrapartida}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>  \n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setVar("tpdis");
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${TpDis.listSelectTipoDisp()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tpdis.pkTipoDispLegal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tpdis.nmTipoDispLegal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tpdis.nmTipoDispLegal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>  \n");
          out.write("                                                ");
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

  private boolean _jspx_meth_c_set_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_13 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_13.setPageContext(_jspx_page_context);
    _jspx_th_c_set_13.setParent(null);
    _jspx_th_c_set_13.setVar("idPlanta");
    _jspx_th_c_set_13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'planta')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_13 = _jspx_th_c_set_13.doStartTag();
    if (_jspx_th_c_set_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_13);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_13);
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
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
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
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ idPlanta.pkArquivo != '0'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a href=\"#\" id=\"id-btn-dialog1\" class=\"btn btn-yellow\"><i class=\"fa fa-upload\"></i> Substituir Planta</a>\n");
        out.write("                                            ");
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
        out.write("\n");
        out.write("                                                <a href=\"#\" id=\"id-btn-dialog1\" class=\"btn btn-default\"><i class=\"fa fa-upload\"></i> Anexar Planta</a>\n");
        out.write("                                            ");
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

  private boolean _jspx_meth_c_forEach_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent(null);
    _jspx_th_c_forEach_7.setVar("ar");
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Arquivo.listArquivo(auto.pkAutoStage, 'AutoCessao')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("    \n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ar.nmTipo == 'planta'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a href=\"/CGPatri/Arquivo/Planta/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ar.nmNome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" target=\"_blank\"><img src=\"img/img-planta.png\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ar.nmNome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" width=\"7%\" height=\"7%\"/></a>\n");
        out.write("                                            ");
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

  private boolean _jspx_meth_c_set_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_14 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_14.setPageContext(_jspx_page_context);
    _jspx_th_c_set_14.setParent(null);
    _jspx_th_c_set_14.setVar("idAC");
    _jspx_th_c_set_14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'AC')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_14 = _jspx_th_c_set_14.doStartTag();
    if (_jspx_th_c_set_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_14);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_14);
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
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
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
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idAC.pkArquivo != '0'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a href=\"#\" id=\"id-btn-dialog2\" class=\"btn btn-yellow\"><i class=\"fa fa-upload\"></i> Substituir Auto de Cessao</a>\n");
        out.write("                                            ");
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
        out.write("\n");
        out.write("                                                <a href=\"#\" id=\"id-btn-dialog2\" class=\"btn btn-default\"><i class=\"fa fa-upload\"></i> Anexar Auto de Cessao</a>\n");
        out.write("                                            ");
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

  private boolean _jspx_meth_c_forEach_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_8.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_8.setParent(null);
    _jspx_th_c_forEach_8.setVar("ar");
    _jspx_th_c_forEach_8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Arquivo.listArquivo(auto.pkAutoStage, 'AutoCessao')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_8 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_8 = _jspx_th_c_forEach_8.doStartTag();
      if (_jspx_eval_c_forEach_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_8, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
            return true;
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_8.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_8);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_8);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ar.nmTipo == 'AC'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a href=\"/CGPatri/Arquivo/AC/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ar.nmNome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" target=\"_blank\"><img src=\"img/img-arquivo.png\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ar.nmNome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" width=\"7%\" height=\"7%\"/></a>\n");
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

  private boolean _jspx_meth_c_set_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_15 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_15.setPageContext(_jspx_page_context);
    _jspx_th_c_set_15.setParent(null);
    _jspx_th_c_set_15.setVar("arPlanta");
    _jspx_th_c_set_15.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'planta')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_15 = _jspx_th_c_set_15.doStartTag();
    if (_jspx_th_c_set_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_15);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_15);
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
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arPlanta.pkArquivo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_set_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_16 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_16.setPageContext(_jspx_page_context);
    _jspx_th_c_set_16.setParent(null);
    _jspx_th_c_set_16.setVar("arAC");
    _jspx_th_c_set_16.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'AC')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_16 = _jspx_th_c_set_16.doStartTag();
    if (_jspx_th_c_set_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_16);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_16);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arAC.pkArquivo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
