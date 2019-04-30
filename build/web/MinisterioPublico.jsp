<%-- 
    Document   : MinisterioPublico
    Created on : 12/03/2019, 16:51:15
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
                    <li><i class="ace-icon fa fa-list"></i> Ministerio Publico</li>
                </ul><!-- /.breadcrumb -->
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-sm-12" >

                        <div class="page-header">
                            <h1>
                                Ministerio Publico
                            </h1>
                        </div>
                        <div class="form-group" style=" padding-top:30px">
                            <c:if test="${sessionSgDivisao == 'DIPI' && sessionSgSetor == 'SIC' || sessionPerfil == 'Administrador'}"> </c:if>

                                <div class="btn-group-lg infobox ">
                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'MinisterioPublicoLista.jsp';">
                                        <i class="glyphicon glyphicon-search"></i>
                                        Pesquisa
                                    </button>
                                </div>

                                <br/>

                                <div class="btn-group-lg infobox ">
                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'MinisterioPublicoCRU.jsp';">
                                        <i class="ace-icon fa fa-plus"></i>
                                        Novo
                                    </button>
                                </div>    

                            </div> 
                        </div>
                    </div>
                </div>
            </div>
        <jsp:include page = "include/footer.jsp" />
    </div><!-- /.main-container --> 
</body>
</html>