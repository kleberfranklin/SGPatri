<%-- 
    Document   : selectSubFinalidade
    Created on : 24/10/2018, 12:40:39
    Author     : d732229
--%>

<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


    <select class="form-control col-xs-12 col-sm-12" name="pkSubCatFinalidade" required="required">
        <c:forEach var="catSub" items="${listSubFinalidade}"  >
            <option value="${catSub.pkCatSubFinalidade}" title="${catSub.nmCatSubFinalidade}">${catSub.sgCatSubFinalidade}</option>
        </c:forEach>
    </select>

