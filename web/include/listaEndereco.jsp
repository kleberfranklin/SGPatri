<%-- 
    Document   : selectSubFinalidade
    Created on : 24/10/2018, 12:40:39
    Author     : d732229
--%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<jsp:useBean id="bean" class= "br.com.Modelo.LogradouroPadraoDAO" />
<c:set var="endereco" value="${param.endereco}" />
<c:set var="checkList" value="${bean.pesquisaNomeLogradouro(endereco)}" />

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
<table class="col-md-8 table-endereco" >
    <c:choose>
        <c:when test="${not empty checkList}">
            <c:forEach var="logPadrao" items="${bean.pesquisaNomeLogradouro(endereco)}"  >
                <tr class="tr-endereco">
                    <td onclick="pesquisaCepLogradouro('${logPadrao.nrCep}')" title="${logPadrao.nmBairro}"> ${logPadrao.nmLogradouroCompleto}</td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr class="tr-endereco">
                <td> Endereço não localizado...</td>
            </tr>
        </c:otherwise>    
    </c:choose>
</table>

</html>