<%-- 
    Document   : CapRestauracao
    Created on : 31/01/2019, 12:44:49
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
                    <li><i class="ace-icon fa fa-list"></i> Restauração de CAP</li>
                </ul><!-- /.breadcrumb -->
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-sm-12" >

                        <div class="page-header">
                            <h1>
                                Restauração de CAP
                            </h1>
                        </div>

                        <div class="form-group" style=" padding-top:30px">
                            <div class="btn-group-lg col-xs-2">
                                <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'CapRestauracaoLista.jsp';">
                                    <i class="glyphicon glyphicon-search"></i>
                                    Pesquisa
                                </button>
                            </div>
                            <c:if test="${sessionSgDivisao == 'DIPI' && sessionSgSetor == 'SCA'}"> 

                                <div class="btn-group-lg col-xs-2">
                                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href = 'AnotacaoRestauracaoCRU.jsp?execucao=insert&novo=1';">
                                        <i class="ace-icon fa fa-plus"></i>
                                        Novo
                                    </button>
                                </div>
                            </c:if>


                        </div>
                        <jsp:include page = "include/footer.jsp" />
                    </div><!-- /.main-container --> 
                </div>
            </div>
    </body>
</html>