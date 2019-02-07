<%-- 
    Document   : AutoCessao
    Created on : 17/08/2018, 12:52:37
    Author     : d732229
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


            <!--Parametro para diferencia entre os Auto Cessão e Auto Cessão Terceiros -->    
            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Auto Cessão</li>
                </ul><!-- /.breadcrumb -->
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-sm-12" >

                        <div class="page-header">
                            <h1>
                                Auto de Cessão
                            </h1>
                        </div>

                        <div class="form-group" style=" padding-top:30px">
                            <div class="btn-group-lg col-xs-2">
                                <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'ControllerServlet?acao=AutoCessaoListaPagFiltro&ter=${ter}';">
                                    <!--<button class="btn btn-primary btn-white btn-block" onclick="#"> -->
                                    <i class="glyphicon glyphicon-search"></i>
                                    Pesquisa
                                </button>
                            </div>

                            <br/><br/>

                            <c:if test="${sessionSgDivisao == 'DDPI' && sessionSgSetor == 'SCL'}">
                                <div class="btn-group-lg col-xs-2">
                                    <!--<button class="btn btn-primary btn-white btn-block" onclick="#">-->
                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'AutoCessaoCRU.jsp?execucao=insert&novo=1';">
                                        <i class="ace-icon fa fa-plus"></i>
                                        Novo
                                    </button>
                                </div>
                            </div>
                        </c:if>
                        <!--<div class="infobox">
                            <div class="btn-group-lg">
                                <button class="btn btn-primary btn-white btn-block" onclick=" location.href='ControllerServlet?acao=AutoCessaoPrazo&ter=${ter}';">
                                <button class="btn btn-primary btn-white btn-block" onclick="#">
                                    <i class="glyphicon glyphicon-search"></i>
                                    Prazo
                                </button>
                            </div>
                        </div>
            
                        <div class="infobox">
                            <div class="btn-group-lg">
                                <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=AutoCessaoVencida&ter=${ter}';">
                                <button class="btn btn-primary btn-white btn-block" onclick="#">
                                    <i class="glyphicon glyphicon-search"></i>
                                    Vencidos
                                </button>
                            </div>
                        </div>
                        
                        <div class="infobox">
                            <div class="btn-group-lg">
                                <button class="btn btn-primary btn-white btn-block" onclick=" location.href='ControllerServlet?acao=AutoCessaoGraQtd&ter=${ter}';">
                                    <i class="ace-icon fa fa-bar-chart"></i>
                                    Gráficos
                                </button>
                            </div>
                        </div>-->

                    </div>

                    <div class="col-sm-12 infobox-small" style=" padding-top:30px">
                    </div>
                </div>
            </div>
            <jsp:include page = "include/footer.jsp" />
        </div><!-- /.main-container --> 
    </body>
</html>