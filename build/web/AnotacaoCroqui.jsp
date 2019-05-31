<%-- 
    Document   : AnotacaoCroqui
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
                    <li><i class="ace-icon fa fa-list"></i> Anotação de Croqui</li>
                </ul><!-- /.breadcrumb -->
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-sm-12" >

                        <div class="page-header">
                            <h1>
                                Anotação de Croqui
                            </h1>
                        </div>
                        <div class="form-group" style=" padding-top:30px">
                            <c:if test="${(sessionSgDivisao == 'DIPI' && sessionSgSetor == 'SIC')  || sessionPerfil == 'Administrador'}"> 
                                <!--
                                                                <div class="btn-group-lg infobox ">
                                                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'ControllerServlet?acao=AnotacaoCroquiLista';">
                                                                        <i class="glyphicon glyphicon-search"></i>
                                                                        Pesquisa
                                                                    </button>
                                                                </div>
                                                                <br/>
                                                                <div class="btn-group-lg infobox ">
                                                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'AnotacaoCroquiCRU.jsp?pkAnotacaoExpediente=1867&execucao=insert';">
                                                                        <i class="ace-icon fa fa-plus"></i>
                                                                        Novo
                                                                    </button>
                                                                </div>    
                                -->
                                <div class="btn-group-lg infobox">
                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'ControllerServlet?acao=AnotacaoCroquiC';"> 
                                        <i class="ace-icon fa fa-plus"></i>
                                        Anotacao de Expediente
                                    </button>
                                </div> 
                                <br/>

                                <div class="btn-group-lg infobox">
                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'AnotacaoCroquiLista.jsp';"> 
                                        <i class="ace-icon fa fa-plus"></i>
                                        Pesquisa Expediente
                                    </button>
                                </div> 
                                <br/>
                                <div class="btn-group-lg infobox">
                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'AnotacaoCroquiRelatorioLista.jsp';"> 
                                        <i class="ace-icon fa fa-plus"></i>
                                        Pesquisa Relatório
                                    </button>
                                </div> 
                            </c:if>
                        </div>

                        <jsp:include page = "include/footer.jsp" />

                    </div>
                </div>
            </div>
        </div><!-- /.main-container --> 
    </body>
</html>