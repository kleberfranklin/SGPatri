package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class maskProcessoSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<script>\n");
      out.write("    function maskProcessoSelect() {\n");
      out.write("        var valorComob = document.getElementById(\"sgTpExpediente\").value;\n");
      out.write("        \n");
      out.write("        var strValor = document.getElementById(\"nrprocesso\").value; \n");
      out.write("        var strTemp;\n");
      out.write("\n");
      out.write("        strTemp = strValor.replace(/\\D+/g, '');\n");
      out.write("        strValor = strTemp.trim();\n");
      out.write("\n");
      out.write("    if(valorComob === \"PA\") {\n");
      out.write("        if (strValor.length > 12 || 12 > strValor.length){\n");
      out.write("            document.getElementById(\"btnExecutarAcao\").disabled = true;\n");
      out.write("            document.getElementById(\"msgProcesso\").style.visibility='visible';\n");
      out.write("            document.getElementById(\"msgProcesso\").innerHTML = \"<span class='badge badge-danger'>PA tem que ter 12 numeros!!</span>\";\n");
      out.write("            document.getElementById(\"nrprocesso\").value = strValor;\n");
      out.write("            document.getElementById(\"nrprocesso\").focus();\n");
      out.write("        }else{ \n");
      out.write("            document.getElementById(\"msgProcesso\").style.visibility='hidden';\n");
      out.write("            document.getElementById(\"btnExecutarAcao\").disabled = false;\n");
      out.write("            if (strValor.length > 11) {\n");
      out.write("                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3) + '.' + strValor.substr(8, 3) + '-' + strValor.substr(11, 1);\n");
      out.write("            } else if (strValor.length > 8) {\n");
      out.write("                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3) + '.' + strValor.substr(8, 3);\n");
      out.write("            } else if (strValor.length > 5) {\n");
      out.write("                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3);\n");
      out.write("            } else if (strValor.length > 4) {\n");
      out.write("                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1);\n");
      out.write("            }\n");
      out.write("            document.getElementById(\"nrprocesso\").value = strValor;\n");
      out.write("        }    \n");
      out.write("    }else if(valorComob === \"CID\") {\n");
      out.write("        if (strValor.length > 12 || 12 > strValor.length){\n");
      out.write("            document.getElementById(\"btnExecutarAcao\").disabled = true;\n");
      out.write("            document.getElementById(\"msgProcesso\").style.visibility='visible';\n");
      out.write("            document.getElementById(\"msgProcesso\").innerHTML = \"<span class='badge badge-danger'>CID tem que ter 12 numeros!</span>\";\n");
      out.write("            document.getElementById(\"nrprocesso\").focus();\n");
      out.write("        }else{ \n");
      out.write("            document.getElementById(\"msgProcesso\").style.visibility='hidden';\n");
      out.write("            document.getElementById(\"btnExecutarAcao\").disabled = false;\n");
      out.write("            if (strValor.length > 11) {\n");
      out.write("                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3) + '.' + strValor.substr(8, 3) + '-' + strValor.substr(11, 1);\n");
      out.write("            } else if (strValor.length > 8) {\n");
      out.write("                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3) + '.' + strValor.substr(8, 3);\n");
      out.write("            } else if (strValor.length > 5) {\n");
      out.write("                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3);\n");
      out.write("            } else if (strValor.length > 4) {\n");
      out.write("                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        }    \n");
      out.write("        document.getElementById(\"nrprocesso\").value = strValor;\n");
      out.write("    }else if(valorComob === \"SEI\") {\n");
      out.write("        if (strValor.length > 16 || 16 > strValor.length){\n");
      out.write("            document.getElementById(\"btnExecutarAcao\").disabled = true;\n");
      out.write("            document.getElementById(\"msgProcesso\").style.visibility='visible';\n");
      out.write("            document.getElementById(\"msgProcesso\").innerHTML = \"&nbsp;<span class='badge badge-danger'>SEI tem que ter 16 numeros!</span>\";\n");
      out.write("            document.getElementById(\"nrprocesso\").focus();\n");
      out.write("        }else{ \n");
      out.write("            document.getElementById(\"msgProcesso\").style.visibility='hidden';\n");
      out.write("            document.getElementById(\"btnExecutarAcao\").disabled = false;\n");
      out.write("            if (strValor.length > 15) {\n");
      out.write("               strValor = strValor.substr(0, 4) + '.' + strValor.substr(4, 4) + '/' + strValor.substr(8, 7) + '-' + strValor.substr(15, 1);\n");
      out.write("            }\n");
      out.write("            else if (strValor.length > 8) {\n");
      out.write("               strValor = strValor.substr(0, 4) + '.' + strValor.substr(4, 4) + '/' + strValor.substr(8, 7);\n");
      out.write("            }\n");
      out.write("            else if (strValor.length > 4) {\n");
      out.write("               strValor = strValor.substr(0, 4) + '.' + strValor.substr(4, 4);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        document.getElementById(\"nrprocesso\").value = strValor;\n");
      out.write("    }else if(valorComob === \"TID\") {\n");
      out.write("        if (strValor.length < 8){\n");
      out.write("            document.getElementById(\"btnExecutarAcao\").disabled = true;\n");
      out.write("            document.getElementById(\"msgProcesso\").style.visibility='visible';\n");
      out.write("            document.getElementById(\"msgProcesso\").innerHTML = \"&nbsp;<span class='badge badge-danger'>TID no minimo 8 numeros!</span>\";\n");
      out.write("            document.getElementById(\"nrprocesso\").focus();\n");
      out.write("        }else{ \n");
      out.write("            document.getElementById(\"msgProcesso\").style.visibility='hidden';\n");
      out.write("            document.getElementById(\"btnExecutarAcao\").disabled = false;\n");
      out.write("        }\n");
      out.write("        document.getElementById(\"nrprocesso\").value = strValor;\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write("function limpaCampoNrProcesso(){\n");
      out.write("    document.getElementById(\"nrprocesso\").value =\"\";\n");
      out.write("    document.getElementById(\"nrprocesso\").focus();\n");
      out.write("    document.getElementById(\"msgProcesso\").style.visibility='hidden';\n");
      out.write("    document.getElementById(\"btnExecutarAcao\").disabled = false;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>");
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
