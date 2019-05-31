<%-- 
    Document   : CadastroAreaPublica
    Created on : 19/02/2019, 11:42:32
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
            <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />


            <!--Parametro para diferenciar entre os Auto Cessão e Auto Cessão Terceiros -->    
            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> CAP</li>
                </ul><!-- /.breadcrumb -->
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" >
                        <div class="page-header">
                            <h1>
                                CAP
                            </h1>
                        </div>

                        <c:if test="${sessionSgDivisao == 'DIPI' && sessionSgSetor == 'SCA' || sessionPerfil == 'Administrador'}">        </c:if>                     

                            <div class="form-group" style=" padding-top:30px">
                                <div class="btn-group-lg infobox disabled-li-menu">
                                    <button class="btn btn-primary btn-white btn-block" title="Gerenciamento de Publicação de CAP" onclick=" location.href = 'CapPublicacao.jsp';">
                                        <i class="ace-icon glyphicon glyphicon-cloud-upload"></i>
                                        Publicação de CAP
                                    </button>
                                </div>

                                <div class="btn-group-lg infobox disabled-li-menu">
                                    <button class="btn btn-primary btn-white btn-block" title="Gerenciamento do Usuário do CAP/QGIS" onclick=" location.href = 'ControllerServlet?acao=CapUsuarioListaPaginada';">
                                        <i class="ace-icon fa fa-user"></i>
                                        Usuario CAP
                                    </button>
                                </div>     

                                <div class="btn-group-lg infobox disabled-li-menu">
                                    <button class="btn btn-primary btn-white btn-block" title="Restauração de CAP alterado/inserido/deletado" onclick=" location.href = 'CapRestauracaoLista.jsp';">
                                        <i class="ace-icon glyphicon glyphicon-level-up"></i>
                                        Restauração de CAP
                                    </button>
                                </div>     

                                <div class="btn-group-lg infobox">
                                    <button class="btn btn-primary btn-white btn-block" title="Lista de CAP" onclick=" location.href = 'ControllerServlet?acao=CadastroAreaPublicaLista&pg=0&pi=0&pf=0&nmOrigem=&cdCap=&stCap=';">
                                        <i class="ace-icon glyphicon glyphicon-level-up"></i>
                                        Pesquisa de CAP
                                    </button>
                                </div>     
                                <div class="btn-group-lg infobox">
                                    <button class="btn btn-primary btn-white btn-block" title="Lista de CAP" onclick=" location.href = 'CadastroAreaPublicaCRU.jsp?execucao=insert';">
                                        <i class="ace-icon glyphicon glyphicon-level-up"></i>
                                        Cadastro de CAP
                                    </button>
                                </div>     
                            </div>
                        </div>
                    </div>
                </div>
            <jsp:include page = "include/footer.jsp" />
            <jsp:include page = "include/leaflet.jsp" />
        </div><!-- /.main-container --> 
    </body>
</html>