package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/head.jsp", out, false);
      out.write("\r\n");
      out.write("    <body class=\"login-layout light-login\">\r\n");
      out.write("        <div class=\"main-container\">\r\n");
      out.write("            <div class=\"main-content\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-10 col-sm-offset-1\">\r\n");
      out.write("                        <div class=\"login-container\">\r\n");
      out.write("                            <div class=\"center\">\r\n");
      out.write("                                <h1>\r\n");
      out.write("                                    <img src=\"img/logo_c.png\" height=\"35%\" width=\"35%\" title=\"CGPatri - Gerador de Indicadores\">\r\n");
      out.write("                                </h1>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"space-6\"></div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"position-relative\">\r\n");
      out.write("                                <div id=\"login-box\" class=\"login-box visible widget-box no-border  \">\r\n");
      out.write("                                    <div class=\"widget-body \">\r\n");
      out.write("                                        <div class=\"widget-main \">\r\n");
      out.write("                                            <h4 class=\"header blue lighter bigger\">\r\n");
      out.write("                                                <span class=\"red\">SG-PATRI</span><br />\r\n");
      out.write("                                                <span class=\"grey\">Sistema de Gestão das Áreas Públicas</span>\r\n");
      out.write("                                            </h4>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"space-6\"></div>\r\n");
      out.write("\r\n");
      out.write("                                            <form action=\"ControllerServlet?acao=UsuarioLogin\" method=\"POST\">\r\n");
      out.write("                                                <fieldset>\r\n");
      out.write("                                                    <label class=\"block clearfix col-sm-8 col-sm-offset-2\">\r\n");
      out.write("                                                        <span class=\"block input-icon input-icon-right\">\r\n");
      out.write("                                                            <input type=\"text\" name=\"Login\" class=\"form-control\" placeholder=\"Login\" title=\"Informar o mesmo login de rede ex.: (d000000 ou x000000)\" required=\"required\">\r\n");
      out.write("                                                            <i class=\"ace-icon fa fa-user\"></i>\r\n");
      out.write("                                                        </span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                                    <label class=\"block clearfix col-sm-8 col-sm-offset-2\">\r\n");
      out.write("                                                        <span class=\"block input-icon input-icon-right\">\r\n");
      out.write("                                                            <input type=\"password\" name=\"senha\" class=\"form-control\" placeholder=\"Senha\" title=\"Utilizar a mesma senha de rede\" required=\"required\">\r\n");
      out.write("                                                            <i class=\"ace-icon fa fa-lock\"></i>\r\n");
      out.write("                                                        </span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"space\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"clearfix center\">\r\n");
      out.write("                                                        <button type=\"submit\" class=\"width-35 btn btn-sm btn-primary\">\r\n");
      out.write("                                                            <i class=\"ace-icon fa fa-key\"></i>\r\n");
      out.write("                                                            <span class=\"bigger-110\">Login</span>\r\n");
      out.write("                                                        </button>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"space-4\"></div>\r\n");
      out.write("                                                </fieldset>\r\n");
      out.write("                                            </form>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"social-or-login center\">\r\n");
      out.write("                                                <span class=\"bigger-110\">-</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            <div class=\"space-6\"></div>\r\n");
      out.write("                                        </div><!-- /.widget-main -->\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"toolbar clearfix\">\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                            <!-- <a href=\"#\" data-target=\"#forgot-box\" class=\"forgot-password-link\">\r\n");
      out.write("                                                    <i class=\"ace-icon fa fa-arrow-left\"></i>\r\n");
      out.write("                                                    Esqueceu a senha.\r\n");
      out.write("                                                </a> -->\r\n");
      out.write("                                            <div class=\"space-8\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                               <!-- <a href=\"#\" data-target=\"#signup-box\" class=\"user-signup-link\">\r\n");
      out.write("                                                    Solicitar acesso\r\n");
      out.write("                                                    <i class=\"ace-icon fa fa-arrow-right\"></i>\r\n");
      out.write("                                                </a>-->\r\n");
      out.write("                                            <div class=\"space-8\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div><!-- /.widget-body -->\r\n");
      out.write("                                </div><!-- /.login-box -->\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            <!-- <div id=\"forgot-box\" class=\"forgot-box widget-box no-border\">\r\n");
      out.write("                                    <div class=\"widget-body\">\r\n");
      out.write("                                        <div class=\"widget-main\">\r\n");
      out.write("                                            <h4 class=\"header red lighter bigger\">\r\n");
      out.write("                                                <i class=\"ace-icon fa fa-key\"></i>\r\n");
      out.write("                                                Esqueceu sua senha?\r\n");
      out.write("                                            </h4>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"space-6\"></div>\r\n");
      out.write("                                            <p>\r\n");
      out.write("                                               Por favor, insira seu endereço de e-mail. Um e-mail será enviado a você, para que possa escolher uma nova senha.\r\n");
      out.write("                                            </p>\r\n");
      out.write("\r\n");
      out.write("                                            <form>\r\n");
      out.write("                                                <fieldset>\r\n");
      out.write("                                                    <label class=\"block clearfix\">\r\n");
      out.write("                                                        <span class=\"block input-icon input-icon-right\">\r\n");
      out.write("                                                            <input type=\"email\" class=\"form-control\" placeholder=\"Email\">\r\n");
      out.write("                                                            <i class=\"ace-icon fa fa-envelope\"></i>\r\n");
      out.write("                                                        </span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"clearfix\">\r\n");
      out.write("                                                        <button type=\"button\" class=\"width-35 pull-right btn btn-sm btn-danger\">\r\n");
      out.write("                                                            <i class=\"ace-icon fa fa-lightbulb-o\"></i>\r\n");
      out.write("                                                            <span class=\"bigger-110\">Enviar</span>\r\n");
      out.write("                                                        </button>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </fieldset>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div><!-- /.widget-main -->\r\n");
      out.write("                            \r\n");
      out.write("                                       <!-- <div class=\"toolbar center\">\r\n");
      out.write("                                            <a href=\"#\" data-target=\"#login-box\" class=\"back-to-login-link\">\r\n");
      out.write("                                                Back to login\r\n");
      out.write("                                                <i class=\"ace-icon fa fa-arrow-right\"></i>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                            \r\n");
      out.write("                                </div> -->\r\n");
      out.write("                                <!-- /.widget-body -->\r\n");
      out.write("                        <!-- /.forgot-box -->\r\n");
      out.write("\r\n");
      out.write("                                <div id=\"signup-box\" class=\"signup-box widget-box no-border\">\r\n");
      out.write("                                    <div class=\"widget-body\">\r\n");
      out.write("                                        <div class=\"widget-main\">\r\n");
      out.write("                                           <h4 class=\"header blue lighter bigger\">\r\n");
      out.write("                                                <span class=\"red\">SISGI</span><br />\r\n");
      out.write("                                                <span class=\"grey\" id=\"id-text2\">Cadastro de solicitação de acesso</span>\r\n");
      out.write("                                            </h4>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"space-6\"></div>\r\n");
      out.write("                                            <p> Preenchar o formulário: </p>\r\n");
      out.write("\r\n");
      out.write("                                            <form action=\"#\" method=\"POST\">\r\n");
      out.write("                                                <fieldset>\r\n");
      out.write("                                                    <label class=\"block clearfix\">\r\n");
      out.write("                                                        <span class=\"block input-icon input-icon-right\">\r\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" placeholder=\"Login: d00000\">\r\n");
      out.write("                                                            <i class=\"ace-icon fa fa-info-circle\"></i>\r\n");
      out.write("                                                        </span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                                    <label class=\"block clearfix\">\r\n");
      out.write("                                                        <span class=\"block input-icon input-icon-right\">\r\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" placeholder=\"Nome completo\">\r\n");
      out.write("                                                            <i class=\"ace-icon fa fa-user\"></i>\r\n");
      out.write("                                                        </span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                                    <label class=\"block clearfix\">\r\n");
      out.write("                                                        <span class=\"block input-icon input-icon-right\">\r\n");
      out.write("                                                            <input type=\"email\" class=\"form-control\" placeholder=\"Email\">\r\n");
      out.write("                                                            <i class=\"ace-icon fa fa-envelope\"></i>\r\n");
      out.write("                                                        </span>\r\n");
      out.write("                                                    </label> \r\n");
      out.write("                                                    \r\n");
      out.write("                                                    <label class=\"block clearfix\">\r\n");
      out.write("                                                        <span class=\"block input-icon input-icon-right\">\r\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" placeholder=\"Secretária/Prefitura Reginal\">\r\n");
      out.write("                                                            <i class=\"ace-icon glyphicon glyphicon-home\"></i>\r\n");
      out.write("                                                        </span>\r\n");
      out.write("                                                    </label> \r\n");
      out.write("                                                    <label class=\"block clearfix\">\r\n");
      out.write("                                                        <span class=\"block input-icon input-icon-right\">\r\n");
      out.write("                                                            <input type=\"email\" class=\"form-control\" placeholder=\"Divisão/Setor/Local\">\r\n");
      out.write("                                                            <i class=\"ace-icon glyphicon glyphicon-home\"></i>\r\n");
      out.write("                                                        </span>\r\n");
      out.write("                                                    </label> \r\n");
      out.write("                                                    \r\n");
      out.write("\r\n");
      out.write("                                                    <label class=\"block\">\r\n");
      out.write("                                                        <input type=\"checkbox\" class=\"ace\">\r\n");
      out.write("                                                        <span class=\"lbl\">\r\n");
      out.write("                                                            Eu aceito a\r\n");
      out.write("                                                            <a href=\"#\">condições de uso.</a>\r\n");
      out.write("                                                        </span>\r\n");
      out.write("                                                    </label>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"space-24\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"clearfix\">\r\n");
      out.write("                                                        <button type=\"reset\" class=\"width-30 pull-left btn btn-sm\">\r\n");
      out.write("                                                            <i class=\"ace-icon fa fa-refresh\"></i>\r\n");
      out.write("                                                            <span class=\"bigger-110\">Limpar</span>\r\n");
      out.write("                                                        </button>\r\n");
      out.write("\r\n");
      out.write("                                                        <button type=\"submit\" class=\"width-30 col-sm-offset-3 btn btn-sm btn-success\">\r\n");
      out.write("                                                            <span class=\"bigger-110\">Solicitar</span>\r\n");
      out.write("\r\n");
      out.write("                                                            <i class=\"ace-icon fa fa-arrow-right icon-on-right\"></i>\r\n");
      out.write("                                                        </button>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </fieldset>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"toolbar\">\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                                <a href=\"#\" data-target=\"#login-box\" class=\"back-to-login-link\">\r\n");
      out.write("                                                    <i class=\"ace-icon fa fa-arrow-left\"></i>\r\n");
      out.write("                                                    voltar tela de Login.\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div><!-- /.widget-body -->\r\n");
      out.write("                                </div><!-- /.signup-box -->\r\n");
      out.write("                            </div><!-- /.position-relative -->\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!-- /.col -->\r\n");
      out.write("                </div><!-- /.row -->\r\n");
      out.write("            </div><!-- /.main-content -->\r\n");
      out.write("        </div><!-- /.main-container -->\r\n");
      out.write("\r\n");
      out.write("        <!-- basic scripts -->\r\n");
      out.write("\r\n");
      out.write("        <!--[if !IE]> -->\r\n");
      out.write("        <script src=\"assets/js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- <![endif]-->\r\n");
      out.write("\r\n");
      out.write("        <!--[if IE]>\r\n");
      out.write("<script src=\"assets/js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("                if('ontouchstart' in document.documentElement) document.write(\"<script src='assets/js/jquery.mobile.custom.min.js'>\"+\"<\"+\"/script>\");\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <!-- inline scripts related to this page -->\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            jQuery(function ($) {\r\n");
      out.write("                $(document).on('click', '.toolbar a[data-target]', function (e) {\r\n");
      out.write("                    e.preventDefault();\r\n");
      out.write("                    var target = $(this).data('target');\r\n");
      out.write("                    $('.widget-box.visible').removeClass('visible');//hide others\r\n");
      out.write("                    $(target).addClass('visible');//show target\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
    _jspx_th_c_set_0.setVar("msg");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty msg || msg != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <div class=\"alert alert-danger\">\r\n");
        out.write("                                                <span class=\"text-danger\" >\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                </span>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            ");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
