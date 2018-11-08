<%-- 
    Document   : acesso
    Created on : 15/08/2018, 19:49:18
    Author     : d732229
--%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:choose>
    <c:when test="${sessionLogin == '' || sessionLogin == null}">
        <c:redirect url="/AcessoNegado.jsp" />
    </c:when>
    <c:when test="${sessionPerfil != acessoPerfil}" >
        <c:set var="msg3" value="${true}" scope="session" />
        <c:redirect url="/AcessoNegado.jsp" />
    </c:when>
</c:choose>