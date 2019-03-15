<%-- 
    Document   : top
    Created on : 18/06/2018, 13:28:05
    Author     : d732229
--%>

<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div id="navbar" class="navbar navbar-default    ace-save-state">
    <div class="navbar-container ace-save-state" id="navbar-container">
        <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
            <span class="sr-only">Toggle sidebar</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
        </button>
        <div class="navbar-header pull-left">
            <a href="ControllerServlet?acao=Dashborad" class="navbar-brand">
                <small><img src="img/logo.png" height="6%" width="6%" title="SGPATRI - Sistema de Gestão das Áreas Públicas"> Sistema Gestão das Áreas Públicas</small>
            </a>
        </div>
        <div class="navbar-buttons navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">
                <li class="light-blue dropdown-modal">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                        <img class="nav-user-photo" src="img/foto/user.jpg" alt="<c:out value="${sessionNome}"/>" title="foto " />
                            <span class="user-info">
                                <small>Bem vindo,</small> <c:out value="${sessionNome}"/>
                            </span>
                            <i class="ace-icon fa fa-caret-down"></i>
                    </a>
                    <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <c:if test="${sessionPainel == '1'}">
                        <li>
                            <a href="PainelAdm.jsp" title="Gerenciamento dos usuários de formulário e funções">
                                <i class="ace-icon fa fa-cog"></i>
                                Painel Administrativo
                            </a>
                        </li>
                        </c:if> 
                        <li>
                            <a href="#" title="<c:out value="${sessionDesPerfil}"/>">
                                <i class="ace-icon fa fa-user"></i>
                                <c:out value="${sessionPerfil}"/>
                            </a>
                        </li>
                        <li>
                            <a href="#" title="<c:out value="${sessionNmDivisao}"/> / <c:out value="${sessionNmSetor}"/>">
                                <i class="ace-icon fa fa-folder"></i>
                                <c:out value="${sessionSgDivisao}"/> / <c:out value="${sessionSgSetor}"/>
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
        </div>
    </div><!-- /.navbar-container -->
</div>

