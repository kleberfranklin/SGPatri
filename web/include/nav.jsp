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
                    <a href="#" title="Gestão de Pessoas">
                        <i class="menu-icon fa fa-caret-right"></i> Gestão de Pessoas
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
                    <a href="#" title="Autuação de Processos">
                        <i class="menu-icon fa fa-caret-right"></i>Autuação Processos
                    </a>
                    <b class="arrow"></b>
                </li>
                
                <li class="">
                    <a href="#" title="Comissão Municipal do Patrimônio Imobiliário">
                        <i class="menu-icon fa fa-caret-right"></i> CMPT
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
                    <a href="#" class="dropdown-toggle" title="Núcleo de Administração dos Imóveis">
                        <i class="menu-icon fa fa-caret-right"></i> SAI
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="Herança vacante">Herança vacante </a>
                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="Núcleo de Análise de Processos">
                        <i class="menu-icon fa fa-caret-right"></i> SAP
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="Análise de processos / Destinação do patrimônio">Análise de processos</a>
                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="Núcleo de Controle de Lavratura de Cessão">
                        <i class="menu-icon fa fa-caret-right"></i> SCL
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu">
                        <li class="">
                            <a href="AutoCessao.jsp" title="Auto de Cessão">Autos de Cessão</a>
                            <b class="arrow"></b>
                        </li>
                        <c:if test="${sessionSgDivisao == 'DDPI' && sessionSgSetor == 'SCL'}">
                        <li class="">
                            <a href="ControllerServlet?acao=AutoCessaoValidacaoLista" title="Auto de Cessão Validação">Validação Auto Cessão</a>
                            <b class="arrow"></b>
                        </li>
                        </c:if>   
                    </ul>
                </li>
            </ul>
        </li>
        
<!-- Menu DIPI -->
        <li class="">
            <a href="#" class="dropdown-toggle" title="Divisão de Informação do Patrimônio Imobiliário">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text"> DIPI </span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" class="dropdown-toggle" title="Núcleo de Cadastro de Áreas Públicas">
                        <i class="menu-icon fa fa-caret-right"></i> SCA
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu ">
                        <li class="disabled-li-menu">
                            <a href="#" title="Gerenciamento do Usuário do CAP/QGIS">Usuários CAP/QGIS</a>
                            <b class="arrow"></b>
                        </li>
                        <li class="disabled-li-menu">
                            <a href="#" title="Restauração de CAP alterado/inserido/deletado">Restaurar CAP/QGIS</a>
                            <b class="arrow"></b>
                        </li>
                    </ul>    
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="Núcleo de Guardar de Documentos Imobiliários">
                        <i class="menu-icon fa fa-caret-right"></i> SGD
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu">
                        <li class="disabled-li-menu">
                            <a href="PesquisaSGD.jsp" title="Documentos Imobiliários">Guarda Documental</a>
                            <b class="arrow"></b>
                        </li>
                    </ul>    
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="Núcleo de Anotação e Informação Cadastral">
                        <i class="menu-icon fa fa-caret-right"></i> SIC
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu ">
                        <li class="">
                            <a href="AnotacaoCroqui.jsp" title="Anotação e Informação Cadastral de Croqui">Anotação Croqui </a>
                            <b class="arrow"></b>
                        </li>
                        <li class="disabled-li-menu">
                            <a href="#" title="Anotação e Informação Cadastral Diversas">Anotação Diversas </a>
                            <b class="arrow"></b>
                        </li>
                    </ul>    
                </li>
            </ul>
        </li>
        
<!-- Menu DEAPI -->
        <li class="">
            <a href="#" class="dropdown-toggle" title="Divisão de Engenharia do Patrimônio Imobiliário">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text"> DEPI </span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" class="dropdown-toggle" title="Núcleo de Informação de Áreas Públicas">
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
                    <a href="#" class="dropdown-toggle" title="Núcleo de Elaboração de Peças Gráficas">
                        <i class="menu-icon fa fa-caret-right"></i> SP
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="Elaboração de planta (alienação/cessão), análise de processo (sobreposição e domínio)">Elaboração de planta</a>
                            <b class="arrow"></b>
                        </li>
                    </ul> 
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="Núcleo de Levantamento Topográfico">
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
            <a href="#" class="dropdown-toggle" title="Divisão de Avaliação do Patrimônio Imobiliário">
                <i class="menu-icon fa fa-folder"></i>
                <span class="menu-text">DAPI</span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <a href="#" class="dropdown-toggle" title="Núcleo de Avaliação">
                        <i class="menu-icon fa fa-caret-right"></i> SA
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <b class="arrow"></b>
                    <ul class="submenu disabled-li-menu">
                        <li class="">
                            <a href="#" title="Avaliações / Internas e CPOS (locação, indenização, alienação etc)">Avaliações</a>
                            <b class="arrow"></b>
                        </li>
                    </ul> 
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle" title="Núcleo de Vistória">
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
                <span class="menu-text"> Calendário </span>
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
