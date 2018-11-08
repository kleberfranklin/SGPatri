<%-- 
    Document   : Config
    Created on : 18/06/2018, 17:20:54
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

    
    
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-cog"></i> Painel Administrativo</li>
        </ul><!-- /.breadcrumb -->
    </div>    
    <div class="page-content">
    <div class="row">


    <div class="col-xs-10" >
        <h3 class="header smaller lighter blue"><strong>Controle de Usuários</strong></h3>
        <div class="col-sm-12 infobox-chart" style=" padding-top:30px">
            <div class="infobox">
                <div class="btn-group-lg ">
                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href='ControllerServlet?acao=UsuarioListaPaginada';">
                        <i class="ace-icon fa fa-user"></i>
                        Usuário
                    </button>
                </div>
            </div>
        <c:if test="${sessionPerfil == 'Administrador'}">        
            <div class="infobox">
                <div class="btn-group-lg">
                    <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=DivisaoLista';">
                        <i class="ace-icon fa fa-folder"></i>
                        Divisão
                    </button>
                </div>
            </div>
            <div class="infobox">
                <div class="btn-group-lg">
                    <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=SetorLista';">
                        <i class="ace-icon fa fa-folder"></i>
                        Núcleo
                    </button>
                </div>
            </div>
            
            <div class="infobox">
                <div class="btn-group-lg">
                    <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=CargoLista';">
                        <i class="ace-icon fa fa-folder"></i>
                        Cargo
                    </button>
                </div>
            </div>
            
            <div class="infobox">
                <div class="btn-group-lg">
                    <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=PerfilLista';">
                        <i class="ace-icon fa fa-folder"></i>
                        Perfil no Sistema
                    </button>
                </div>
            </div>
        </c:if>
        </div>
    </div> 


<c:if test="${ ('DDPI' == sessionSgDivisao && 'Supervisor' == sessionPerfil)  || sessionPerfil == 'Administrador'}">    
      <div class="col-xs-10" > 
          <h3 class="header smaller lighter blue"><strong>DDPI</strong></h3>
        <div class="col-sm-12 infobox-chart" style=" padding-top:30px">
            <div class="infobox" title="Realizar alterações no campo Tipo de Auto de Cessão dos formulários de cadastro de Auto de Cessão">
                <div class="btn-group-lg ">
                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href='ControllerServlet?acao=TipoAutoCessaoLista';">
                        Tipo de Auto de Cessão
                    </button>
                </div>
            </div>
             <div class="infobox" title="Relizar alterações com campo Cat. da Entidade dos formulário de cadsatro de Auto de Cessão">
                <div class="btn-group-lg ">
                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href='ControllerServlet?acao=';">
                        Categoria da Entidade
                    </button>
                </div>
            </div>
            <div class="infobox" title="Relizar alterações com campo Cat. Auto de Cessão dos formulário de cadsatro de Auto de Cessão">
                <div class="btn-group-lg ">
                    <button class="btn btn-primary btn-white btn-block" onclick=" location.href='ControllerServlet?acao=CatAutoCessaoLista';">
                        Categoria Auto de Cessão
                    </button>
                </div>
            </div>
            <div class="infobox">
                <div class="btn-group-lg">
                    <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=CatFinalidadeLista';">
                        Categoria Finalidade
                    </button>
                </div>
            </div>
            <div class="infobox">
                <div class="btn-group-lg">
                    <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=CatSubFinalidadeLista';">
                       SubCategoria Finalidade
                    </button>
                </div>
            </div>
            
            <div class="infobox">
                <div class="btn-group-lg">
                    <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=CatContrapartidaLista';">
                        Categoria contrapartida
                    </button>
                </div>
            </div>
            
            <div class="infobox">
                <div class="btn-group-lg">
                    <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=TipoDispLegalLista';">
                        Tipo de Dispositivo Legal
                    </button>
                </div>
            </div>
            
            <div class="infobox">
                <div class="btn-group-lg">
                    <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=';">
                        Cessionário
                    </button>
                </div>
            </div>
            
            <div class="infobox">
                <div class="btn-group-lg">
                    <button class="btn btn-primary btn-white btn-block" onclick="location.href='ControllerServlet?acao=';">
                        Cedente
                    </button>
                </div>
            </div>
        </div>
</c:if>         
    <jsp:include page = "include/footer.jsp" />
    </div><!-- /.main-container --> 
    </body>
</html>
