package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class grafico_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      google.charts.load('current', {'packages':['corechart']});\r\n");
      out.write("      google.charts.setOnLoadCallback(drawVisualization);\r\n");
      out.write("\r\n");
      out.write("      function drawVisualization() {\r\n");
      out.write("        // Some raw data (not necessarily accurate)\r\n");
      out.write("        var data = google.visualization.arrayToDataTable([\r\n");
      out.write("                  ['Month', 'Mar/18', 'Abr/2018', 'Mai/2018', 'Jun/2018'],\r\n");
      out.write("                  ['Total', 21, 21, 31, 32],\r\n");
      out.write("                  ['Herança', 6, 0, 0, 0],\r\n");
      out.write("                  ['Nesgas', 1, 0, 0, 0],\r\n");
      out.write("                  ['Locação', 4, 11, 4, 3],\r\n");
      out.write("                  ['Outros', 10, 10, 27, 29]\r\n");
      out.write("              ]);\r\n");
      out.write("\r\n");
      out.write("              var options = {\r\n");
      out.write("                  title: 'Avaliação (DEAPI - Guilherme)',\r\n");
      out.write("                  chartArea: {width:'60%'},\r\n");
      out.write("                  vAxis: {title: '', minValue: 0,textStyle:{fontSize:10}},\r\n");
      out.write("                  hAxis: {title: ''},\r\n");
      out.write("                  seriesType: 'bars',\r\n");
      out.write("                  series: {5: {type: 'line'},},\r\n");
      out.write("                  legend: { position: \"\"},\r\n");
      out.write("                  height:300,\r\n");
      out.write("                  \r\n");
      out.write("              };\r\n");
      out.write("\r\n");
      out.write("              var chart = new google.visualization.ComboChart(document.getElementById('avaliaca'));\r\n");
      out.write("              chart.draw(data, options);\r\n");
      out.write("          }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("     google.charts.load('current', {'packages':['corechart']});\r\n");
      out.write("      google.charts.setOnLoadCallback(drawChart);\r\n");
      out.write("\r\n");
      out.write("      function drawChart() {\r\n");
      out.write("        var data = google.visualization.arrayToDataTable([\r\n");
      out.write("          ['Quantidade de processo por Divisão', 'Quantidade'],\r\n");
      out.write("          ['DDPI',  20],\r\n");
      out.write("          ['DIPI',  41],\r\n");
      out.write("          ['DEAPI',  44],\r\n");
      out.write("          ['AVALICAO', 10],\r\n");
      out.write("          ['GABINETE', 15]\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("          title: 'Auto Cessão',\r\n");
      out.write("          chartArea:{left:'5%',top:'13%',width:'95%',height:'80%'},\r\n");
      out.write("          pieSliceText: 'value',\r\n");
      out.write("          //legend: { position: \"left\"},\r\n");
      out.write("          height:300,\r\n");
      out.write("          \r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var chart = new google.visualization.PieChart(document.getElementById('divisao'));\r\n");
      out.write("        chart.draw(data, options);\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\tgoogle.load('visualization', '1', {packages: ['corechart', 'bar']});\r\n");
      out.write("\tgoogle.setOnLoadCallback(drawAnnotations);\r\n");
      out.write("      \r\n");
      out.write("      function drawAnnotations() {\r\n");
      out.write("      \r\n");
      out.write("      var data = google.visualization.arrayToDataTable([\r\n");
      out.write("        ['Auto de Cessao', '', {type: 'string', role: 'annotation'}],\r\n");
      out.write("            ['Transferência de Administração', 1243,'1243'],\r\n");
      out.write("            ['Permissão de Uso', 475,'475'],\r\n");
      out.write("            ['Áreas Recebidas em Cessão', 63,'63'],\r\n");
      out.write("            ['Concessão Administração de Uso', 62,'62'],\r\n");
      out.write("            ['Permissão de Uso a Título Percário e Oneroso', 33,'33']\r\n");
      out.write("        ]);\r\n");
      out.write("\tvar options = {\r\n");
      out.write("        title: 'Auto de Cessão',\r\n");
      out.write("        chartArea:{left:'25%',top:'10%',width:'80%',height:'80%'},\r\n");
      out.write("        annotations: {alwaysOutside: true,\r\n");
      out.write("          textStyle: {fontSize: 10 , auraColor: 'none', color:'#555'},\r\n");
      out.write("          boxStyle: { stroke: '#ccc', strokeWidth: 1, \r\n");
      out.write("\t\t  gradient: { color1: '#f3e5f5', color2: '#f3e5f5', x1: '0%', y1: '0%', x2: '100%', y2: '100%' } } },\r\n");
      out.write("        hAxis: {title: '', minValue: 0,textStyle:{fontSize:12} },\r\n");
      out.write("        vAxis: { title: '' },\r\n");
      out.write("\t\tfontSize: 10\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t};\r\n");
      out.write("      var chart = new google.visualization.BarChart(document.getElementById('autoCessao'));\r\n");
      out.write("      chart.draw(data, options);\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
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
    _jspx_th_c_set_0.setVar("ter");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.ter}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
