package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adicionarCampo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      br.com.Modelo.TipoDispositivoLegalDAO TpDis = null;
      synchronized (_jspx_page_context) {
        TpDis = (br.com.Modelo.TipoDispositivoLegalDAO) _jspx_page_context.getAttribute("TpDis", PageContext.PAGE_SCOPE);
        if (TpDis == null){
          TpDis = new br.com.Modelo.TipoDispositivoLegalDAO();
          _jspx_page_context.setAttribute("TpDis", TpDis, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\tvar max_fields      = 10; //maximum input boxes allowed\r\n");
      out.write("\tvar wrapper   \t\t= $(\".input_fields_wrap\"); //Fields wrapper\r\n");
      out.write("\tvar add_button      = $(\".add_field_button\"); //Add button ID\r\n");
      out.write("\t\r\n");
      out.write("\tvar x = 0; //initlal text box count\r\n");
      out.write("\t$(add_button).click(function(e){ //on add input button click\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\tif(x < max_fields){ //max input box allowed\r\n");
      out.write("\t\t\tx++; //text box increment\r\n");
      out.write("                    $(wrapper).append('<div class=\"space-1\"></div><div class=\"form-group input_fields_wrap\"><label class=\"inline col-md-2 col-xs-12\" ><span class=\"lbl\"><strong>Tipo de Dispositivo:</strong></span></label><label class=\"inline col-md-3 col-xs-12\"><select class=\"col-md-12 col-xs-12\" name=\"tpDispositivo\" required=\"required\"><option></option>");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("</select></label><label class=\"inline col-md-1 col-xs-12\" ><span class=\"lbl\"><strong>N&#250;mero:</strong></span></label><label class=\"inline col-md-2 col-xs-12\"><input type=\"number\" id=\"form-field-1\" class=\"col-xs-12 col-md-12\" placeholder=\"numero\" name=\"numDispositivo\" ></label><label class=\"inline col-md-1 col-xs-12\" ><span class=\"lbl\"><strong>Data:</strong></span></label><label class=\"inline col-md-2 col-xs-12\"><div class=\"input-group\"><input class=\"form-control date-picker\" id=\"id-date-picker-1\" name=\"dtDispositivo\" type=\"text\" placeholder=\"dd/mm/aaaa\" data-date-format=\"dd/mm/yyyy\"><span class=\"input-group-addon\"><i class=\"fa fa-calendar bigger-110\"></i></span></div></label><a href=\"#\" class=\"red remove_field\" title=\"remover campos\"><span class=\"label label-danger arrowed-right\"><i class=\" glyphicon glyphicon-minus-sign\"></i></a></div>'); //add input box\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(wrapper).on(\"click\",\".remove_field\", function(e){ //user click on remove text\r\n");
      out.write("\t\te.preventDefault(); $(this).parent('div').remove();\r\n");
      out.write("\t})\r\n");
      out.write("});\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("tpdis");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${TpDis.listSelectTipoDisp()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tpdis.pkTipoDispLegal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tpdis.nmTipoDispLegal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tpdis.nmTipoDispLegal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>");
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
}
