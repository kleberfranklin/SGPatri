<%-- 
    Document   : nav
    Created on : 18/06/2018, 13:04:21
    Author     : d732229
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="sidebar" class="sidebar responsive ace-save-state">
    <ul class="nav nav-list">
        <li class="">
            <a href="Index.jsp">
                    <i class="menu-icon fa fa-tachometer"></i>
                    <span class="menu-text"> Dashboard </span>
            </a>
            <b class="arrow"></b>
        </li>
        
        <!-- Menu Gabinete-->
        <li class="disabled-li-menu">
            <a href="#" class="dropdown-toggle" title="Gabinete da Coordenadoria">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text">
                        GABINETE
                </span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i> Expediente 
                    </a>
                    <b class="arrow"></b>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i> Projetos
                    </a>
                    <b class="arrow"></b>
                </li>
                
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i> Pessoal
                    </a>
                    <b class="arrow"></b>
                </li>
                <li class="">
                    <a href="#">
                        <i class="menu-icon fa fa-caret-right"></i> Informática
                    </a>
                    <b class="arrow"></b>
                </li>
            </ul>
        </li>
        
        
        <!-- Menu DDPI -->
        <li class="">
            <a href="#" class="dropdown-toggle" title="Divisão de Destinação do Patrimônio Imobiliário">
                <i class="menu-icon fa fa-folder"></i>
                    <span class="menu-text"> DDPI </span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" class="dropdown-toggle" title="Núcleo de Análise Geral">
                        <i class="menu-icon fa fa-caret-right"></i> SAG
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu">
                        <li class="">
                            <a href="AutoCessao.jsp" title="Auto de Cessão"> Autos de Cessão</a>
                            <b class="arrow"></b>
                        </li>
                    <!--<li class="">
                        <a href="AutoCessao.jsp?ter=terceiro" title="Auto de Cessão de Terceiros"> Autos de Cessão de Terceiros</a>
                        <b class="arrow"></b>
                    </li> -->
                        <c:if test="${sessionSgDivisao == 'DDPI' && sessionPerfil == 'Supervisor'}">
                        <li class="">
                            <a href="ControllerServlet?acao=AutoCessaoValidacaoLista" title="Auto de Cessão Validação"> Validação Auto Cessão</a>
                            <b class="arrow"></b>
                        </li>
                        </c:if>   
                    </ul>
                </li>
                <li class="disabled-li-menu">
                    <a href="#">
                        <i class="menu-icon fa fa-caret-right " title="Núcleo de Análise de Processos"></i> -
                    </a>
                    <b class="arrow"></b>
                </li>
            </ul>
            
        </li>
        
        <!-- Menu DIPI -->
        <li class="disabled-li-menu">
            <a href="#" class="dropdown-toggle" title="Divisão de Informação do Patrimônio Imobiliário">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text"> DIPI </span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#">
                        <i class="menu-icon fa fa-caret-right"></i> -
                    </a>
                    <b class="arrow"></b>
                </li>
            </ul>
        </li>
        
        <!-- Menu DEAPI -->
        <li class="disabled-li-menu">
            <a href="#" class="dropdown-toggle" title="Divisão de Engenharia e Avaliação do Patrimônio Imobiliário">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text"> DEAPI </span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" title="">
                        <i class="menu-icon fa fa-caret-right"></i> -
                    </a>
                    <b class="arrow"></b>
                </li>
            </ul>
        </li>
        
         <!-- Menu Avaliação -->
        <li class="disabled-li-menu">
            <a href="#" class="dropdown-toggle" title="Avaliação de Imobiliário">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text">Avaliação</span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" title="">
                        <i class="menu-icon fa fa-caret-right"></i> -
                    </a>
                    <b class="arrow"></b>
                </li>
            </ul>
        </li>
        <!-- Tarefas-->
        <li class="disabled-li-menu">
            <a href="#" class="dropdown-toggle" title="">
                <i class="menu-icon fa fa-tags"></i>
                <span class="menu-text"> Tarefas 
                    <span class="badge badge-transparent tooltip-error" title="2 Eventos importantes">
                            <i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i>
                    </span>
                </span>
                
            </a>
            <b class="arrow"></b>
        </li>

        <!-- Menu Calendario-->
        <li class="disabled-li-menu">
            <a href="#">
                <i class="menu-icon fa fa-calendar"></i>
                <span class="menu-text"> Calendário </span>
            </a>
           <b class="arrow"></b>
        </li>
        <!-- Wikipedia CGPatri-->
        <li class="disabled-li-menu">
            <a href="#">
                <i class="menu-icon fa fa-book"></i>
                <span class="menu-text"> Wikipedia CGPatri </span>
            </a>
           <b class="arrow"></b>
        </li>
  
    </ul><!-- /.nav-list -->
</div>

<!--Inicio DIV do body -->
<div class="main-content">
<div class="main-content-inner">
