<%-- 
    Document   : CadastroCroqui
    Created on : 20/12/2018, 12:26:59
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

<!-- Beans -->        
        <jsp:useBean id="subPref" class= "br.com.Modelo.SubPrefeituraDAO" />
        
<!--Pegando os paremetros -->
        <c:set var="pg" value="${param.pg}" />
        <c:set var="pf" value="${param.pf}" />
        <c:set var="pi" value="${param.pi}" />
        <c:set var="execucao" value="${param.execucao}" />
        
        <c:set var="qCroqui" value="${param.qCroqui}" />
        <c:set var="qArea" value="${param.qArea}" />
        <c:set var="qNome" value="${param.qNome}" />
        <c:set var="qEndereco" value="${param.qEndereco}" />
        <c:set var="qAssunto" value="${param.qAssunto}" />
        <c:set var="dtIni" value="${param.dtIni}" />
        <c:set var="dtFim" value="${param.dtFim}" />


            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Anotação Croqui</li>
                </ul>
            </div>    
            <div class="page-content" >
                <div id="" class="specific-block"></div>    
                <div class="row">
                    <div class="col-xs-12">
                        <div class="col-sm-offset-1 col-sm-10">
                            <h2>Anotação Croqui</h2>
                            <div class="space-14"></div>
                            <div class="form-horizontal">
                                <div class="tabbable">
                                    <ul class="nav nav-tabs padding-0">
                                        <li class="active">
                                            <a data-toggle="tab" href="#cad-croqui" aria-expanded="true">
                                                Anotação Croqui
                                            </a>
                                        </li>
                                    </ul>
                                    <div class="tab-content profile-edit-tab-content" >
                                        <!--Inicio da tab-pane Cadastro Croqui-->
                                        <div id="cad-croqui" class="tab-pane in active"  >
                                            <form action="ControllerServlet?acao=AnotacaoCroquiUC" method="POST" >
                                                <input type="hidden" name="pkAnotacaoExpediente" value="${anotCroqui.pkAnotacaoExpediente}" />
                                                <input type="hidden" name="execucao" value="${execucao}" />
                                                <h4 class="header smaller lbl "><strong>Cadastro Croqui</strong></h4>

                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12"
                                                         <span class="lbl"><strong>Coqui:</strong></span>
                                                    </div>

                                                    <label class="col-sm-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                       value="${anotCroqui.cdCroqui}" placeholder="Croqui" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                       placeholder="Croqui" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.cdCroqui}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                    <label class="col-sm-1 col-xs-12">
                                                        <span class = "lbl"><strong>Área:</strong></span>
                                                    </label>
                                                    <label class="col-sm-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdArea" 
                                                                       value="${anotCroqui.cdArea}" placeholder="Código da Área" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdArea" 
                                                                       placeholder="Código da Área" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.cdArea}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>                                                   
                                                </div>

                                                <div class="space-1"></div>
                                                
                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Informação DGPI: </strong></span>
                                                    </div>

                                                    <label class="col-sm-6 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12" name="cdProcesso" 
                                                                       value="${anotCroqui.nmInformacaoDgpi}" placeholder="nº do processo" required="required"  >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12"  name="cdProcesso" 
                                                                       placeholder="Nº Processo" required="required"  >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.nmInformacaoDgpi}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Processo:</strong></span>
                                                    </div>

                                                    <label class="col-sm-6 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12" name="cdProcesso" 
                                                                       value="${anotCroqui.cdProcesso}" placeholder="nº do processo" required="required"  >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12"  name="cdProcesso" 
                                                                       placeholder="Nº Processo" required="required"  >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.cdProcesso}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                
                                                <div class="space-1"></div>
                                                
                                                <div class="form-group">
                                                    <label class="col-sm-2 col-xs-12" >
                                                        <span class="lbl"><strong>TID:</strong></span>
                                                    </label>

                                                    <label class="col-sm-6 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12"  name="cdTid" 
                                                                       value="${anotCroqui.cdTid}" placeholder="Nº TID" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12"  name="cdTid" 
                                                                       placeholder="Nº TID" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.cdTid}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                
                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº de Expediente:</strong></span>
                                                    </div>

                                                    <label class="inline col-sm-6 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12"  name="cdExpediente" 
                                                                       value="${anotCroqui.cdExpediente}" placeholder="Nº Expediente" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12"  name="cdExpediente" 
                                                                       placeholder="Nº Expediente" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.cdExpediente}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                
                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Interessado:</strong></span>
                                                    </div>

                                                    <label class="col-sm-8 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12"  name="nmInteressado" 
                                                                       value="${anotCroqui.nmInteressado}" placeholder="Nome do Interessado" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12"  name="nmInteressado" 
                                                                       placeholder="Nome do Interessado" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.nmInteressado}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                
                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Assunto:</strong></span>
                                                    </div>

                                                    <label class="col-sm-8 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-10 col-xs-12"  name="dsAssunto" 
                                                                       value="${anotCroqui.dsAssunto}" placeholder="Descrição do assunto" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-10 col-xs-12"  name="dsAssunto" 
                                                                       placeholder="Descrição do assunto" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.dsAssunto}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <div class="form-group">
                                                                    <div class="inline col-sm-2 col-xs-12">
                                                                        <span class="lbl"><strong>Local:</strong></span>
                                                                    </div>
                                                                    <label class="col-sm-8 col-xs-12" >
                                                                        <input type="text" id="form-field-1" class="col-sm-12 col-xs-12" name="nmEndereco" 
                                                                               value="${anotCroqui.dsLocal}"  placeholder="Descrição do local" required="required">
                                                                    </label>
                                                                </div>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                            <div class="form-group">
                                                                <label class="inline col-md-2 col-xs-12" >
                                                                    <span class="lbl"><strong>Subprefituras: </strong></span>
                                                                </label>
                                                                <label class="inline col-md-4 col-xs-12" >
                                                                    <select class="col-md-12 col-xs-12" name="pkSubPref" id="" required="required">
                                                                         <option></option>    
                                                                         <c:forEach var="subPref" items="${subPref.listSelectSubPref()}">
                                                                             <option value="${subPref.pkSubPrefeitura}" title="${subPref.nmSubPrefeitura}">${subPref.nmSubPrefeitura}</option>  
                                                                         </c:forEach>
                                                                     </select>
                                                                </label>
                                                            </div>
                                
                                                            <div class="space-1"></div>

                                                            <div class="form-group">
                                                                <label class="inline col-md-2 col-xs-12" >
                                                                        <span class="lbl"><strong>Tipo endereço:</strong></span>
                                                                </label>
                                                                <label class="inline col-md-3 col-xs-12">
                                                                    <select class="col-md-12 col-xs-12" name="tipoEndereco" title="Rua / Avenida / Praça / etc" required="required">
                                                                        <option></option>
                                                                        <option>ACESSO</option>
                                                                        <option>ALAMEDA</option>
                                                                        <option>AV. PROJETADA</option>
                                                                        <option>AVENIDA</option>
                                                                        <option>BALAO RETORNO</option>
                                                                        <option>BECO</option>
                                                                        <option>CAMINHO</option>
                                                                        <option>CAMINHO PART</option>
                                                                        <option>CAMINHO PEDEST</option>
                                                                        <option>COMPLEXO VIARIO</option>
                                                                        <option>DESVIO</option>
                                                                        <option>DIV</option>
                                                                        <option>ENT</option>
                                                                        <option>ES. PROJETADA</option>
                                                                        <option>ESC</option>
                                                                        <option>ESPACO LIVRE</option>
                                                                        <option>ESPLANADA</option>
                                                                        <option>EST. DE RODAGEM</option>
                                                                        <option>ESTACIONAMENTO</option>
                                                                        <option>ESTR. DE FERRO</option>
                                                                        <option>ESTRADA</option>
                                                                        <option>ESTRADA PART</option>
                                                                        <option>GALERIA</option>
                                                                        <option>JARDIM</option>
                                                                        <option>LADEIRA</option>
                                                                        <option>LARGO</option>
                                                                        <option>PARQUE</option>
                                                                        <option>PASSAGEM</option>
                                                                        <option>PASSAGEM PART</option>
                                                                        <option>PASSARELA</option>
                                                                        <option>PATIO</option>
                                                                        <option>PONTE</option>
                                                                        <option>PONTILHAO</option>
                                                                        <option>PQE</option>
                                                                        <option>PQL</option>
                                                                        <option>PQM</option>
                                                                        <option>PRACA</option>
                                                                        <option>PRACA MANOBRA</option>
                                                                        <option>PRACA PROJETADA</option>
                                                                        <option>PRACA RETORNO</option>
                                                                        <option>PRO</option>
                                                                        <option>PS PROJETADA</option>
                                                                        <option>PS. DE PEDESTRE</option>
                                                                        <option>PS. SUBTERRANEA</option>
                                                                        <option>RODOVIA</option>
                                                                        <option>RUA</option>
                                                                        <option>RUA PART</option>
                                                                        <option>RUA PROJETADA</option>
                                                                        <option>SERVIDAO</option>
                                                                        <option>TRAVESSA</option>
                                                                        <option>TRAVESSA PART</option>
                                                                        <option>TUNEL</option>
                                                                        <option>TV PROJETADA</option>
                                                                        <option>VEREDA</option>
                                                                        <option>VIA</option>
                                                                        <option>VIA CIRC PEDEST</option>
                                                                        <option>VIA DE PEDESTRE</option>
                                                                        <option>VIA ELEVADA</option>
                                                                        <option>VIADUTO</option>
                                                                        <option>VIELA</option>
                                                                        <option>VIELA PART</option>
                                                                        <option>VIELA PROJETADA</option>
                                                                        <option>VIELA SANITARIA</option>
                                                                        <option>VILA</option>
                                                                        <option>VLP</option>
                                                                    </select>
                                                                </label>
                                                                <label class="inline col-md-2 col-xs-12" >
                                                                        <span class="lbl"><strong>Título do endereço:</strong></span>
                                                                </label>
                                                                <label class="inline col-md-4 col-xs-12" >
                                                                    <select class="col-md-12 col-xs-12" name="tituloEndereco" title="Capitão / Doutor / Dom / etc">
                                                                        <option></option>
                                                                        <option>ABADE</option>
                                                                        <option>ACADEMICO</option>
                                                                        <option>ADVOGADO</option>
                                                                        <option>AGENTE</option>
                                                                        <option>AGRIC</option>
                                                                        <option>AGRIMENSOR</option>
                                                                        <option>AJUDANTE</option>
                                                                        <option>ALFERES</option>
                                                                        <option>ALMIRANTE</option>
                                                                        <option>APOSTOLO</option>
                                                                        <option>ARCEBISPO</option>
                                                                        <option>ARCIP</option>
                                                                        <option>ARCJO</option>
                                                                        <option>ARQUITETA</option>
                                                                        <option>ARQUITETO</option>
                                                                        <option>ARQUITETO PROFESSOR</option>
                                                                        <option>ASPIRANTE</option>
                                                                        <option>AVENIDA</option>
                                                                        <option>AVIADOR</option>
                                                                        <option>AVIADORA</option>
                                                                        <option>BACHAREL</option>
                                                                        <option>BANDEIRANTE</option>
                                                                        <option>BANQUEIRO</option>
                                                                        <option>BARAO</option>
                                                                        <option>BARONESA</option>
                                                                        <option>BEATO PADRE</option>
                                                                        <option>BEM AVENTURADO</option>
                                                                        <option>BENEMERITO</option>
                                                                        <option>BISPO</option>
                                                                        <option>BRIGADEIRO</option>
                                                                        <option>CABO</option>
                                                                        <option>CABO PM</option>
                                                                        <option>CADETE</option>
                                                                        <option>CAMPEADOR</option>
                                                                        <option>CAPITAO</option>
                                                                        <option>CAPITAO ALMIRANTE</option>
                                                                        <option>CAPITAO DE FRAGATA</option>
                                                                        <option>CAPITAO DE MAR E GUERRA</option>
                                                                        <option>CAPITAO GENERAL</option>
                                                                        <option>CAPITAO MOR</option>
                                                                        <option>CAPITAO PM</option>
                                                                        <option>CAPITAO TENENTE</option>
                                                                        <option>CAR</option>
                                                                        <option>CARDEAL</option>
                                                                        <option>CATEQUISTA</option>
                                                                        <option>CAVALEIRO</option>
                                                                        <option>CAVALHEIRO</option>
                                                                        <option>CINEASTA</option>
                                                                        <option>COMANDANTE</option>
                                                                        <option>COMEDIANTE</option>
                                                                        <option>COMENDADOR</option>
                                                                        <option>COMISSARIA</option>
                                                                        <option>COMISSARIO</option>
                                                                        <option>COMPOSITOR</option>
                                                                        <option>CONDE</option>
                                                                        <option>CONDESSA</option>
                                                                        <option>CONEGO</option>
                                                                        <option>CONFRADE</option>
                                                                        <option>CONSELHEIRO</option>
                                                                        <option>CONSUL</option>
                                                                        <option>CORONEL</option>
                                                                        <option>CORONEL PM</option>
                                                                        <option>CORREGEDOR</option>>
                                                                        <option>DEPUTADA</option>
                                                                        <option>DELEGADO</option>
                                                                        <option>DENTISTA</option
                                                                        <option>DEPUTADO</option>
                                                                        <option>DEPUTADO DOUTOR</option>
                                                                        <option>DESEMBARGADOR</option>
                                                                        <option>DIACO</option>
                                                                        <option>DOM</option>
                                                                        <option>DONA</option>
                                                                        <option>DOUTOR</option>
                                                                        <option>DOUTORA</option>
                                                                        <option>DUQUE</option>
                                                                        <option>DUQUESA</option>
                                                                        <option>EDITOR</option>
                                                                        <option>EDUCADOR</option>
                                                                        <option>EDUCADORA</option>
                                                                        <option>EMBAIXADOR</option>
                                                                        <option>EMBAIXADORA</option>
                                                                        <option>EMP</option>
                                                                        <option>ENGENHEIRA</option>
                                                                        <option>ENGENHEIRO</option>
                                                                        <option>ESCOTEIRO</option>
                                                                        <option>ESCRAVO</option>
                                                                        <option>ESCRITOR</option>
                                                                        <option>EXPEDICIONARIO</option>
                                                                        <option>FISICO</option>
                                                                        <option>FREI</option>
                                                                        <option>GENERAL</option>
                                                                        <option>GOVERNADOR</option>
                                                                        <option>GRUMETE</option>
                                                                        <option>GUARDA CIVIL METROPOLITANO</option>
                                                                        <option>IMACULADA</option>
                                                                        <option>IMPERADOR</option>
                                                                        <option>IMPERATRIZ</option>
                                                                        <option>INFANTE</option>
                                                                        <option>INSPETOR</option>
                                                                        <option>IRMA</option>
                                                                        <option>IRMAO</option>
                                                                        <option>IRMAOS</option>
                                                                        <option>IRMAS</option>
                                                                        <option>JORNALISTA</option>
                                                                        <option>LIBERTADOR</option>
                                                                        <option>LIDCO</option>
                                                                        <option>LIVREIRO</option>
                                                                        <option>LORDE</option>
                                                                        <option>MADAME</option>
                                                                        <option>MADRE</option>
                                                                        <option>MAESTRO</option>
                                                                        <option>MAJOR</option>
                                                                        <option>MAJOR AVIADOR</option>
                                                                        <option>MAJOR BRIGADEIRO</option>
                                                                        <option>MAQUINISTA</option>
                                                                        <option>MARECHAL</option>
                                                                        <option>MARECHAL DO AR</option>
                                                                        <option>MARQUES</option>
                                                                        <option>MARQUESA</option>
                                                                        <option>MERE</option>
                                                                        <option>MESTRAS</option>
                                                                        <option>MESTRE</option>
                                                                        <option>MESTRES</option>
                                                                        <option>MILITANTE</option>
                                                                        <option>MINISTRO</option>
                                                                        <option>MISSIONARIA</option>
                                                                        <option>MISSIONARIO</option>
                                                                        <option>MONGE</option>
                                                                        <option>MONSENHOR</option>
                                                                        <option>MUNIC</option>
                                                                        <option>MUSICO</option>
                                                                        <option>NOSSA SENHORA</option>
                                                                        <option>NOSSO SENHOR</option>
                                                                        <option>OUVIDOR</option>
                                                                        <option>PADRE</option>
                                                                        <option>PADRES</option>
                                                                        <option>PAI</option>
                                                                        <option>PAPA</option>
                                                                        <option>PASTOR</option>
                                                                        <option>PATRIARCA</option>
                                                                        <option>POETA</option>
                                                                        <option>POETISA</option>
                                                                        <option>PREFEITO</option>
                                                                        <option>PRESIDENTE</option>
                                                                        <option>PRESIDENTE DA ACAD.BRAS.LETRAS</option>
                                                                        <option>PREVR</option>
                                                                        <option>PRIMEIRO SARGENTO</option>
                                                                        <option>PRIMEIRO SARGENTO PM</option>
                                                                        <option>PRIMEIRO TENENTE</option>
                                                                        <option>PRIMEIRO TENENTE PM</option>
                                                                        <option>PRINCESA</option>
                                                                        <option>PRINCIPE</option>
                                                                        <option>PROCURADOR</option>
                                                                        <option>PROFESSOR</option>
                                                                        <option>PROFESSOR DOUTOR</option>
                                                                        <option>PROFESSOR ENGENHEIRO</option>
                                                                        <option>PROFESSORA</option>
                                                                        <option>PROFETA</option>
                                                                        <option>PROMOTOR</option>
                                                                        <option>PROVEDOR</option>
                                                                        <option>PROVEDOR MOR</option>
                                                                        <option>RABINO</option>
                                                                        <option>RADIALISTA</option>
                                                                        <option>RAINHA</option>
                                                                        <option>REGENTE</option>
                                                                        <option>REI</option>
                                                                        <option>REVERENDO</option>
                                                                        <option>RUA</option>
                                                                        <option>SACERDOTE</option>
                                                                        <option>SANTA</option>
                                                                        <option>SANTO</option>
                                                                        <option>SAO</option>
                                                                        <option>SARGENTO</option>
                                                                        <option>SARGENTO MOR</option>
                                                                        <option>SARGENTO PM</option>
                                                                        <option>SEGUNDO SARGENTO</option>
                                                                        <option>SEGUNDO SARGENTO PM</option>
                                                                        <option>SEGUNDO TENENTE</option>
                                                                        <option>SENADOR</option>
                                                                        <option>SENHOR</option>
                                                                        <option>SENHORA</option>
                                                                        <option>SERTANISTA</option>
                                                                        <option>SINHA</option>
                                                                        <option>SIR</option>
                                                                        <option>SOCIOLOGO</option>
                                                                        <option>SOLDADO</option>
                                                                        <option>SOLDADO PM</option>
                                                                        <option>SOROR</option>
                                                                        <option>SUB TENENTE</option>
                                                                        <option>TENENTE</option>
                                                                        <option>TENENTE AVIADOR</option>
                                                                        <option>TENENTE BRIGADEIRO</option>
                                                                        <option>TENENTE CORONEL</option>
                                                                        <option>TENENTE CORONEL PM</option>
                                                                        <option>TEOLOGO</option>
                                                                        <option>TERCEIRO SARGENTO</option>
                                                                        <option>TERCEIRO SARGENTO PM</option>
                                                                        <option>TIA</option>
                                                                        <option>VEREADOR</option>
                                                                        <option>VICE ALMIRANTE</option>
                                                                        <option>VICE REI</option>
                                                                        <option>VIGARIO</option>
                                                                        <option>VISCONDE</option>
                                                                        <option>VISCONDESSA</option>
                                                                        <option>VOLUNTARIO</option>
                                                                    </select>
                                                                </label>
                                                            </div>

                                                            <div class="space-1"></div>

                                                            <div class="form-group">
                                                                <label class="inline col-md-2 col-xs-12" >
                                                                    <span class="lbl"><strong>Endereço:</strong></span>
                                                                </label>
                                                                <label class="inline col-md-6 col-xs-12" >
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmendereco" placeholder="nome do endereço" required="required">
                                                                </label>
                                                                <label class="inline col-md-1 col-xs-12" >
                                                                    <span class="lbl"><strong>número:</strong></span>
                                                                </label>
                                                                <label class="inline col-md-2 col-xs-12" >
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrnumeroend" placeholder="nº">
                                                                </label>
                                                            </div>

                                                            <div class="space-1"></div>

                                                            <div class="form-group">
                                                                <label class="inline col-md-2 col-xs-12" >
                                                                    <span class="lbl"><strong>Complemento:</strong></span>
                                                                </label>
                                                                <label class="inline col-md-3 col-xs-12" >
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcomplementoend" placeholder="complemento do endereço" >
                                                                </label>
                                                            </div>
                                
                                                            <div class="space-1"></div>
                                
                                                            <div class="form-group">
                                                                <label class="inline col-md-2 col-xs-12" >  
                                                                    <span class="lbl"><strong>Referência:</strong></span>
                                                                </label>
                                                                <label class="inline col-md-8 col-xs-12" >
                                                                   <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmreferenciaend" placeholder="referencia do endereço" >
                                                                </label>
                                                            </div>
                                 
                                                            </c:when>
                                                            <c:otherwise>
                                                                <div class="form-group">
                                                                    <div class="inline col-sm-2 col-xs-12">
                                                                        <span class="lbl"><strong>Local:</strong></span>
                                                                    </div>
                                                                    <label class="col-sm-8 col-xs-12" >
                                                                        <span class="lbl">${anotCroqui.dsLocal}</span>
                                                                    </label>
                                                                </div>
                                                            </c:otherwise>
                                                        </c:choose>
                                        </div>
                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Anotação:</strong></span>
                                                    </div>

                                                    <label class="col-sm-2 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <c:choose>
                                                                    <c:when test="${anotCroqui.nrAnotacao == '1'}">
                                                                        <label class="pull-left inline">
                                                                            <input id="id-button-borders"  type="checkbox" id="" name="nrvigor" value="true" class="ace ace-switch ace-switch-5"  >
                                                                            <span class="lbl middle"></span>
                                                                        </label>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <label class="pull-left inline">
                                                                            <input id="id-button-borders"  type="checkbox" id="" name="nrvigor" value="true" checked="" class="ace ace-switch ace-switch-5"  >
                                                                            <span class="lbl middle"></span>
                                                                        </label>
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <label class="pull-left inline">
                                                                    <input id="id-button-borders"  type="checkbox" id="" name="nrAnotacao" value="true" class="ace ace-switch ace-switch-5"  >
                                                                    <span class="lbl middle"></span>
                                                                </label>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <c:choose>
                                                                    <c:when test="${anotCroqui.nrAnotacao == 1}">
                                                                        <span class="label label-success arrowed" title="SIM">
                                                                            <i class="ace-icon fa fa-check bigger-120"></i>
                                                                            Sim
                                                                        </span>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <span class="label label-danger arrowed" title="NÃO">
                                                                            <i class="ace-icon fa fa-ban bigger-120"></i>
                                                                            Não
                                                                        </span>
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>

                                                    <label class="col-sm-2 col-xs-12" >  
                                                        <span class="lbl"><strong>Informação:</strong></span>
                                                    </label>                

                                                    <label class="col-sm-3 col-xs-12" >                                                  
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <c:choose>
                                                                    <c:when test="${anotCroqui.nrInformacao == '1'}">
                                                                        <label class="pull-left inline">
                                                                            <input id="id-button-borders"  type="checkbox" id="" name="nrvigor" value="true" class="ace ace-switch ace-switch-5"  >
                                                                            <span class="lbl middle"></span>
                                                                        </label>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <label class="pull-left inline">
                                                                            <input id="id-button-borders"  type="checkbox" id="" name="nrvigor" value="true" checked="" class="ace ace-switch ace-switch-5"  >
                                                                            <span class="lbl middle"></span>
                                                                        </label>
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <label class="pull-left inline">
                                                                    <input id="id-button-borders"  type="checkbox" id="" name="nrAnotacao" value="true" class="ace ace-switch ace-switch-5"  >
                                                                    <span class="lbl middle"></span>
                                                                </label>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <c:choose>
                                                                    <c:when test="${'1' == anotCroqui.nrInformacao}">
                                                                        <span class="label label-success arrowed" title="SIM">
                                                                            <i class="ace-icon fa fa-check bigger-120"></i>
                                                                            Sim
                                                                        </span>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <span class="label label-danger arrowed" title="NÃO">
                                                                            <i class="ace-icon fa fa-ban bigger-120"></i>
                                                                            Não
                                                                        </span>
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                
                                                 <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Despacho:</strong></span>
                                                    </div>
                                                    <label class="inline col-sm-8 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-10 col-xs-12"  name="cdExpediente" 
                                                                       value="${anotCroqui.dsDespacho}" placeholder="Escrever o despacho" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-10 col-xs-12"  name="cdExpediente" 
                                                                       placeholder="Escrever o despacho" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.dsDespacho}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                
                                                <div class="space-1"></div>
                                                
                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Publicado no DOM:</strong></span>
                                                    </div>
                                                    <label class="inline col-sm-6 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <c:set var = "dtPubli" value = "${anotCroqui.dtPublicacao}" />
                                                                <fmt:parseDate value = "${dtPubli}" var = "converteDTPlub" pattern="yyyy-MM-dd" />
                                                                <fmt:formatDate type= "date" value="${converteDTPlub}" var="dtAtuPubli"/>
                                                                <input type="date" id="form-field-1" class="col-sm-4 col-xs-12"  name="cdExpediente" 
                                                                       value="${dtAtuPubli}" placeholder="" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="date" id="form-field-1" class="col-sm-4 col-xs-12"  name="cdExpediente" 
                                                                       placeholder="" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <c:set var = "dtPubli" value = "${anotCroqui.dtPublicacao}" />
                                                                <fmt:parseDate value = "${dtPubli}" var = "converteDTPlub" pattern="yyyy-MM-dd" />
                                                                <fmt:formatDate type= "date" value="${converteDTPlub}" var="dtAtuPubli"/>
                                                                <span class="lbl">${dtAtuPubli}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                
                                                <div class="space-1"></div>
                                                
                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data de Tramitação:</strong></span>
                                                    </div>
                                                    <label class="inline col-sm-6 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="date" id="form-field-1" class="col-sm-4 col-xs-12"  name="cdExpediente" 
                                                                       value="${anotCroqui.dtAnotacao}" placeholder="Escrever o despacho" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="date" id="form-field-1" class="col-sm-4 col-xs-12"  name="cdExpediente" 
                                                                       placeholder="Escrever o despacho" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.dtAnotacao}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                
                                                <div class="space-1"></div>
                                                
                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                         <span class="lbl"><strong>Observação:</strong></span>
                                                    </div>
                                                    <label class="inline col-sm-9 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <textarea class="form-control" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;">${anotCroqui.dsObservacao}</textarea>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <textarea class="form-control" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;"></textarea>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.dsObservacao}</span>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                
                                                
                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data:</strong></span>
                                                    </div>
                                                    <label class="inline col-sm-3 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="date" id="form-field-1" class="col-sm-10 col-xs-12"  name="cdExpediente" 
                                                                       value="${anotCroqui.dtData}" placeholder="Escrever o despacho" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="date" id="form-field-1" class="col-sm-10 col-xs-12"  name="cdExpediente" 
                                                                       placeholder="Escrever o despacho" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">
                                                                    <c:set var = "dt" value = "${anotCroqui.dtData}" />
                                                                    <fmt:parseDate value = "${dt}" var = "converteDT" pattern="yyyy-MM-dd" />
                                                                    <fmt:formatDate type= "date" value="${converteDT}" var="dtAtu"/>
                                                                    <c:out value="${dtAtu}"/>
                                                                </span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                    
                                                    <label class="col-sm-1 col-xs-12" >  
                                                        <span class="lbl"><strong>Nome:</strong></span>
                                                    </label> 
                                                    
                                                    <label class="col-sm-4 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12"  name="nmInteressado" 
                                                                       value="${anotCroqui.nmNome}" placeholder="Nome " required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12"  name="nmInteressado" 
                                                                       placeholder="Nome " required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.nmNome}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>    
                                                
                                                
                                                

                                                <!-- Botões-->
                                                <div class="form-actions center ">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <button class="btn btn-yellow" type="reset" onclick=" location.href = 'AnotacaoCroqui.jsp';">
                                                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                Voltar
                                                            </button>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <button class="btn btn-yellow" type="reset" onclick=" location.href = 'ControllerServlet?acao=AnotacaoCroquiLista&pg=${pg}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&qNome=${qNome}&qEndereco=${qEndereco}&qAssunto=${qAssunto}&dtIni=${dtIni}&dtFim=${dtFim}';">
                                                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                Voltar
                                                            </button>
                                                        </c:otherwise>
                                                    </c:choose>    
                                                        
                                                    <c:if test="${execucao !='view'}" >
                                                        <button class="btn btn-success" type="submit" id="salvar">
                                                            <i class="ace-icon fa fa-save bigger-110"></i>
                                                            Salvar
                                                        </button>

                                                        <button class="btn" type="reset">
                                                            <i class="ace-icon fa fa-eraser bigger-110"></i>
                                                            Limpar
                                                        </button>
                                                    </c:if>
                                                </div>
                                        </div>

                                       
                                    </div>
                                </div>
                            </div>    
                        </div>    

        <jsp:include page = "include/footer.jsp" />
        <jsp:include page = "javaScritp/carregado.html" />

        </div>


</body>
</html>


