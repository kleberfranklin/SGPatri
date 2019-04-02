package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdicionarHistorico_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("    var max_fields = 10; //maximum input boxes allowed\r\n");
      out.write("            var wrapper = $(\".input_fields_wrap\"); //Fields wrapper\r\n");
      out.write("            var add_button = $(\".add_field_button\"); //Add button ID\r\n");
      out.write("\r\n");
      out.write("            var x = 0; //initlal text box count\r\n");
      out.write("            $(add_button).click(function(e){ //on add input button click\r\n");
      out.write("    e.preventDefault();\r\n");
      out.write("            if (x < max_fields){ //max input box allowed\r\n");
      out.write("    x++; //text box increment\r\n");
      out.write("            $(wrapper).append('<br/><div class=\"input_fields_wrap\"><div class=\"tab-content profile-edit-tab-content\"><div id=\"cad-croqui\" class=\"tab-pane in active\"><input type=\"hidden\" name=\"pkAnotacaoExpediente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.pkAnotacaoExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><input type=\"hidden\" name=\"execucao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${execucao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /><div class=\"space-14\"></div><div class=\"form-group\"><label class=\"inline col-sm-2 col-xs-12\"><span class=\"lbl\"><strong>Nº Informação DGPI: </strong></span></label><label class=\"col-sm-4 col-xs-12\"><input type=\"text\" id=\"form-field-1\" class=\"col-sm-8 col-xs-12\" name=\"nrInformacaoDgpi\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nrInformacaoDgpi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Nº Informação DGPI\"></label></div><div class=\"form-group\"><label class=\"inline col-md-2 col-xs-12\"><span class=\"lbl\"><strong>Nº Expediente:</strong></span></label><label class=\"inline col-md-4 col-xs-12\"><input type=\"text\" class=\"col-xs-8 col-xs-12\" name=\"nrprocesso\" id=\"nrprocesso\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.cdExpediente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Nº do Expediente\" onKeyPress=\"return somenteNum(event);\"></label><label class=\"inline col-md-2 col-xs-12\"><span class=\"lbl\"><strong>Tipo de Expediente:</strong></span></label><label class=\"inline col-md-2 col-xs-12\"><select class=\"col-md-12 col-xs-12\" name=\"pkCatAutoCessao\"><option></option><option>TID</option><option>CID</option><option>PA</option></select></label></div><div class=\"form-group\"><label class=\"inline col-sm-2 col-xs-12\"><span class=\"lbl\"><strong>Local:</strong></span></label><label class=\"col-sm-8 col-xs-12\"><input type=\"text\" id=\"form-field-1\" class=\"col-sm-12 col-xs-12\" name=\"nmEndereco\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmReferenciaEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Descrição do local\"></label></div><div class=\"space-1\"></div><div class=\"form-group\"><label class=\"inline col-sm-2 col-xs-12\"><span class=\"lbl\"><strong>Anotação:</strong></span></label><label class=\"col-sm-2 col-xs-12\"><input id=\"id-button-borders\" type=\"checkbox\" id=\"\" name=\"nrvigor\" value=\"true\" class=\"ace ace-switch ace-switch-5\"><span class=\"lbl middle\"></span></label><label class=\"col-sm-2 col-xs-12\"><span class=\"lbl\"><strong>Informação:</strong></span></label><label class=\"col-sm-3 col-xs-12\"><input id=\"id-button-borders\" type=\"checkbox\" id=\"\" name=\"nrvigor\" value=\"true\" class=\"ace ace-switch ace-switch-5\"><span class=\"lbl middle\"></span></label></div><div class=\"space-1\"></div><div class=\"form-group\"><label class=\"inline col-sm-2 col-xs-12\"><span class=\"lbl\"><strong>Despacho:</strong></span></label><label class=\"inline col-sm-8 col-xs-12\"><input type=\"text\" id=\"form-field-1\" class=\"col-sm-10 col-xs-12\" name=\"cdExpediente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dsDespacho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Escrever o despacho\"></label></div><div class=\"space-1\"></div><div class=\"form-group\"><label class=\"inline col-sm-2 col-xs-12\"><span class=\"lbl\"><strong>Publicado no DOM:</strong></span></label><label class=\"inline col-sm-3 col-xs-12\"><input type=\"date\" id=\"form-field-1\" class=\"col-sm-8 col-xs-12\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtAtuPubli}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></label></div><div class=\"space-1\"></div><div class=\"form-group\"><label class=\"inline col-sm-2 col-xs-12\"><span class=\"lbl\"><strong>Data de Tramitação:</strong></span></label><label class=\"inline col-sm-3 col-xs-12\"><input type=\"date\" id=\"form-field-1\" class=\"col-sm-8 col-xs-12\" name=\"cdExpediente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Escrever o despacho\"></label></div><div class=\"space-1\"></div><div class=\"form-group\"><label class=\"inline col-sm-2 col-xs-12\"><span class=\"lbl\"><strong>Observação:</strong></span></label><label class=\"inline col-sm-9 col-xs-12\"><textarea class=\"form-control col-xs-12\" id=\"form-field-8\" name=\"dsObservacao\" placeholder=\"Observação\" style=\"margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dsObservacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea><label></div><div class=\"form-group\"><label class=\"inline col-sm-2 col-xs-12\"><span class=\"lbl\"><strong>Data:</strong></span></label><label class=\"inline col-sm-3 col-xs-12\"><input type=\"date\" id=\"form-field-1\" class=\"col-sm-8 col-xs-12\"  name=\"dtData\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.dtData}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></label><label class=\"col-sm-1 col-xs-12\"><span class=\"lbl\"><strong>Nome:</strong></span></label><label class=\"inline col-sm-4 col-xs-12\"><input type=\"text\" id=\"form-field-1\" class=\"col-sm-6 col-xs-12\"  name=\"nmInteressado\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anotCroqui.nmAutor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Nome\"></label></div></div></div></div>'); //add input box\r\n");
      out.write("    }\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(wrapper).on(\"click\",\".remove_field\", function(e){ //user click on remove text\r\n");
      out.write("            e.preventDefault(); $(this).parent('div').remove();\r\n");
      out.write("            });\r\n");
      out.write("            });\r\n");
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
