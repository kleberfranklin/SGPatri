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
        <li class="">
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
                    <a href="MinisterioPublico.jsp" title="Ministerio Publico">
                        <i class="menu-icon fa fa-caret-right"></i> Ministerio Publico
                    </a>
                    <b class="arrow"></b>
                </li>
                <li class="">
                    <a href="#" title="Gest�o de Pessoas">
                        <i class="menu-icon fa fa-caret-right"></i> Gest�o de Pessoas
                    </a>
                    <b class="arrow"></b>
                </li>
                <li class="">
                    <a href="#" title="Protocolo">
                        <i class="menu-icon fa fa-caret-right"></i> Protocolo 
                    </a>
                    <b class="arrow"></b>
                </li>
                <li class="">
                    <a href="#" title="Autua��o de Processos">
                        <i class="menu-icon fa fa-caret-right"></i>Autua��o Processos
                    </a>
                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="#" title="Comiss�o Municipal do Patrim�nio Imobili�rio">
                        <i class="menu-icon fa fa-caret-right"></i> CMPT
                    </a>
                    <b class="arrow"></b>
                </li>
            </ul>
        </li>

        <!-- Menu DDPI -->
        <li class="">
            <a href="#" class="dropdown-toggle" title="Divis�o de Destina��o do Patrim�nio Imobili�rio">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text"> DDPI </span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de Administra��o dos Im�veis">
                        <i class="menu-icon fa fa-caret-right"></i> SAI
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="Heran�a vacante">Heran�a vacante </a>
                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de An�lise de Processos">
                        <i class="menu-icon fa fa-caret-right"></i> SAP
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="An�lise de processos / Destina��o do patrim�nio">An�lise de processos</a>
                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de Controle de Lavratura de Cess�o">
                        <i class="menu-icon fa fa-caret-right"></i> SCL
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu">
                        <li class="">
                            <a href="AutoCessao.jsp" title="Auto de Cess�o">Autos de Cess�o</a>
                            <b class="arrow"></b>
                        </li>
                        <c:if test="${sessionSgDivisao == 'DDPI' && sessionSgSetor == 'SCL'}">
                            <li class="">
                                <a href="ControllerServlet?acao=AutoCessaoValidacaoLista" title="Auto de Cess�o Valida��o">Valida��o Auto Cess�o</a>
                                <b class="arrow"></b>
                            </li>
                        </c:if>   
                    </ul>
                </li>
            </ul>
        </li>

        <!-- Menu DIPI -->
        <li class="">
            <a href="#" class="dropdown-toggle" title="Divis�o de Informa��o do Patrim�nio Imobili�rio">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text"> DIPI </span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de Cadastro de �reas P�blicas">
                        <i class="menu-icon fa fa-caret-right"></i> SCA
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    
                    <!--  PAGINAS DO CAP JA ESTAO QUASE PRONTA APENAS ATIVAR O MENU PARA V�-LAS -->
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="Cap.jsp" title="Cadastro de �rea Publica">CAP</a>
                            <b class="arrow"></b>
                        </li>

                    </ul>    
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de Guardar de Documentos Imobili�rios">
                        <i class="menu-icon fa fa-caret-right"></i> SGD
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="AnotacaoDocumental.jsp" title="Documentos Imobili�rios">Guarda Documental</a>
                            <b class="arrow"></b>
                        </li>
                    </ul>    
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de Anota��o e Informa��o Cadastral">
                        <i class="menu-icon fa fa-caret-right"></i> SIC
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu ">
                        <li class="">
                            <a href="AnotacaoCroqui.jsp" title="Anota��o e Informa��o Cadastral de Croqui">Anota��o Croqui </a>
                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="AnotacaoDiversa.jsp" title="Anota��o e Informa��o Cadastral Diversas">Anota��o Diversas </a>
                            <b class="arrow"></b>
                        </li>
                    </ul>    
                </li>
            </ul>
        </li>

        <!-- Menu DEAPI -->
        <li class="">
            <a href="#" class="dropdown-toggle" title="Divis�o de Engenharia do Patrim�nio Imobili�rio">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text"> DEPI </span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de Informa��o de �reas P�blicas">
                        <i class="menu-icon fa fa-caret-right"></i> SI
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="-">-</a>
                            <b class="arrow"></b>
                        </li>
                    </ul> 
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de Elabora��o de Pe�as Gr�ficas">
                        <i class="menu-icon fa fa-caret-right"></i> SP
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="Elabora��o de planta (aliena��o/cess�o), an�lise de processo (sobreposi��o e dom�nio)">Elabora��o de planta</a>
                            <b class="arrow"></b>
                        </li>
                    </ul> 
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de Levantamento Topogr�fico">
                        <i class="menu-icon fa fa-caret-right"></i> ST
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="Topografia">Topografia</a>
                            <b class="arrow"></b>
                        </li>
                    </ul> 
                </li>
            </ul>
        </li>

        <!-- Menu DAPI -->
        <li class="">
            <a href="#" class="dropdown-toggle" title="Divis�o de Avalia��o do Patrim�nio Imobili�rio">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text">DAPI</span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de Avalia��o">
                        <i class="menu-icon fa fa-caret-right"></i> SA
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="Avalia��es / Internas e CPOS (loca��o, indeniza��o, aliena��o etc)">Avalia��es</a>
                            <b class="arrow"></b>
                        </li>
                    </ul> 
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="N�cleo de Vist�ria">
                        <i class="menu-icon fa fa-caret-right"></i> SV
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="">-</a>
                            <b class="arrow"></b>
                        </li>
                    </ul> 
                </li>
            </ul>
        </li>

        <!-- Menu INDICADORES -->
        <li class="">
            <a class="disabled-li-menu" href="#" title="">
                <i class="menu-icon fa fa-bar-chart-o"></i>
                <span class="menu-text">Indicadores</span>
            </a>
            <b class="arrow"></b>
        </li>

        <!-- Menu DECRETOS -->
        <li class="">
            <a class="disabled-li-menu" href="#" title="">
                <i class="menu-icon fa fa-balance-scale"></i>
                <span class="menu-text">Decretos</span>
            </a>
            <b class="arrow"></b>
        </li>

        <!-- Menu PROJETOS -->
        <li class="">
            <a class="disabled-li-menu" href="#" title="">
                <i class="menu-icon fa fa-laptop"></i>
                <span class="menu-text">Projetos</span>
            </a>
            <b class="arrow"></b>
        </li>

        <!--Menu Tarefas-->
        <li class="">
            <a class="disabled-li-menu" href="#" title="">
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
        <li class="">
            <a class="disabled-li-menu" href="#" title="">
                <i class="menu-icon fa fa-calendar"></i>
                <span class="menu-text"> Calend�rio </span>
            </a>
            <b class="arrow"></b>
        </li>

        <!-- Wikipedia CGPatri-->
        <li class="">
            <a class="disabled-li-menu" href="#" title="">
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
