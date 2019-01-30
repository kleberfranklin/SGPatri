<%-- 
    Document   : AnotacaoExpediente
    Created on : 23/01/2019, 17:08:15
    Author     : x369482
--%>

<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

    <jsp:include page = "include/head.jsp" />
    <body class="no-skin">
        <jsp:include page = "include/top.jsp"/>
        <div class="main-container ace-save-state" id="main-container">
            <jsp:include page = "include/nav.jsp" />

            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />


            <!--Parametro para diferenciar entre os Auto Cessão e Auto Cessão Terceiros -->    
            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i>Anotação De Expediente</li>
                </ul><!-- /.breadcrumb -->
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-sm-12" >

                        <div class="page-header">
                            <h1>
                                Anotação De Expediente
                            </h1>
                        </div>

                        <div class="col-sm-12 infobox-small" style=" padding-top:30px">
                            <div class="infobox">
                                <div class="btn-group-lg ">
                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'ControllerServlet?acao=AnotacaoExpedienteLista';">
                                        <i class="glyphicon glyphicon-search"></i>
                                        Pesquisa
                                    </button>
                                </div>
                            </div>
                            <c:if test="${sessionSgDivisao == 'DIPI' && sessionSgSetor == 'SIC'}"> 
                            </c:if>

                            <div class="infobox">
                                <div class="btn-group-lg">
                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'AnotacaoExpedienteCRU.jsp?execucao=insert&novo=1';">
                                        <i class="ace-icon fa fa-plus"></i>
                                        Novo
                                    </button>
                                </div>
                            </div>


                        </div>
                        <jsp:include page = "include/footer.jsp" />
                    </div><!-- /.main-container --> 
                    </body>
                    </html>