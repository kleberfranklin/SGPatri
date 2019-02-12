<%-- 
    Document   : selectSubFinalidade
    Created on : 24/10/2018, 12:40:39
    Author     : d732229
--%>

<%@page import="java.net.URLDecoder"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="bean" class= "br.com.Modelo.LogradouroPadraoDAO" />
<c:set var="endereco" value="${param.endereco}" />


<style>
    .table-endereco{
        position:absolute;
        z-index:50;
        background-color:#FFF;
        border-radius: 0px 0px 5px 0px ;
        padding: 5px;
        box-shadow: 2px 5px #888888;
    }
    .tr-endereco{
        color:#888888;
    }
    .tr-endereco:hover{
        color: #23527c;
        background: rgba(51,122,183,0.3);
       /* 
        opacity: 0.1;
        filter: alpha(opacity=10); */
    }    
</style>
<table class="col-md-8 table-endereco" name="" id="" >
    
    <c:forEach var="logPadrao" items="${bean.pesquisaNomeLogradouro(endereco)}"  >
        <tr class="tr-endereco">
            <td onclick="pesquisaCepLogradouro('${logPadrao.nrCep}')"> ${logPadrao.nmLogradouroCompleto}</td>
        </tr>
    </c:forEach>
</table>

</html>