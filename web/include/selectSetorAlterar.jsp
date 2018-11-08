<%-- 
    Document   : selectSetorAlterar
    Created on : 21/09/2018, 18:01:38
    Author     : d732229
--%>

<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="bean" class= "br.com.Modelo.SetorDAO" />

<c:set var="pk" value="${param.pkDivisao}" />
<fmt:parseNumber var = "pkDivisao" type = "number" value = "${pk}" />
<c:set var="lista" value="${bean.selecSetor(pkDivisao)}" />

<c:if test="${not empty lista}">
    <select class="form-control col-xs-12 col-sm-12" name="setor" required="required">
        <option></option>
        <c:forEach var="st" items="${bean.selecSetor(pkDivisao)}"  >
            <option value="${st.pkSetor}" title="${st.nmSetor}">${st.sgSetor} - ${st.nmSetor}</option>
        </c:forEach>
    </select>
</c:if> 

       
        
            