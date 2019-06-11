
<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <jsp:include page = "include/head.jsp" />
    <body class="no-skin">
        <div id="navbar" class="navbar navbar-default    ace-save-state">
            <div class="navbar-container ace-save-state" id="navbar-container">
                <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
                    <span class="sr-only">Toggle sidebar</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <div class="navbar-header pull-left">
                    <a href="Index.jsp" class="navbar-brand">
                        <small><img src="img/logo.png" height="6%" width="6%" title="CGPatri - Gerador de Indicadores"> SG-PATRI - Sistema de Gestão das Áreas Públicas</small>
                    </a>
                </div>
            <!--    <div class="navbar-buttons navbar-header pull-right" role="navigation">
                    <ul class="nav ace-nav">
                        <li class="light-blue dropdown-modal">
                            <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                                <img class="nav-user-photo" src="img/foto/user.jpg" alt="" title="foto " />
                                <span class="user-info">
                                    <small>Bem vindo,</small>
                                </span>
                                <i class="ace-icon fa fa-caret-down"></i>
                            </a>
                            <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                               
                                    <li>
                                        <a href="Config.jsp">
                                            <i class="ace-icon fa fa-cog"></i>
                                            Configuração
                                        </a>
                                    </li>
                               
                                <li>
                                    <a href="#">
                                        <i class="ace-icon fa fa-user"></i>
                                        Prefil
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="ControllerServlet?acao=UsuarioLogoff">
                                        <i class="ace-icon fa fa-power-off"></i>
                                        Logof
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>-->
            </div><!-- /.navbar-container -->
        </div>
    <div class="main-container ace-save-state" id="main-container">
    
    <!--<div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-random"></i> Erro</li>
        </ul>
    </div>-->
    
    <div class="page-content">
    <div class="row">
    <div class="col-xs-12">
        <c:set var="exception" value="${requestScope['javax.servlet.error.exception']}"/>
        <div class="well">
            <h1 class="grey lighter smaller">
                <span class="blue bigger-125">
                    <i class="ace-icon fa fa-random"></i>
                    Erro 
                </span>
                inesperado no sistema!
            </h1>

            <hr>
            <h3 class="lighter smaller">
                Iremos trabalhar 
                <i class="ace-icon fa fa-wrench icon-animated-wrench bigger-125"></i>
                para corrigir !
            </h3>

            <div class="space"></div>

            <div>
                <h4 class="lighter smaller">Por gentileza, nos ajude encaminhando o erro abaixo para o e-mail:</h4>
                <ul class="list-unstyled spaced inline bigger-110 margin-15">
                    <li>
                        <i class="ace-icon fa fa-envelope blue"></i>
                        <a href="mailto:klferreira@prefeitura.sp.gov.br?subject=Erro no SISGI">Administrador do sistema.</a>
                    </li>
                </ul>
            </div>
            <div class="col-sm-12 ">
                <button class="btn btn-yellow right" type="reset" onclick=" location.href='javascript:history.back()';" title="Tela ínicial">
                    <span class=" fa fa-undo bigger-110"></span>
                </button>    
            </div>
            <hr>
            <div class="text-capitalize">
                <jsp:scriptlet>
                    exception.printStackTrace(new java.io.PrintWriter(out));
                </jsp:scriptlet>
            </div>
        </div>
         
         
    <jsp:include page = "include/footer.jsp" />
   </div><!-- /.main-container --> 
   </body>
</html>
