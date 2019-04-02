<%-- 
    Document   : AnotacaoDiversa
    Created on : 01/02/2019, 16:50:20
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
            <jsp:include page = "include/adicionarCampo.jsp" />
            <jsp:include page = "javaScritp/ajaxSelectSubFinalidade.html"/>
            <jsp:include page = "javaScritp/AutoCessaoValidacao.html" />



            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />

            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="execucao" value="${param.execucao}" />
            

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Anotação Diversas</li>
                </ul>
            </div>    
            <div class="page-content" >
                <div id="" class="specific-block"></div>    
                <div class="row">
                    <div class="col-xs-12">


                        <div class="col-sm-offset-1 col-sm-10">
                            <h2>Anotação Diversas</h2>
                            <div class="space-14"></div>
                            <div class="form-horizontal">
                                <div class="tabbable">
                                    <ul class="nav nav-tabs padding-0">
                                        <li class="active">
                                            <a data-toggle="tab" href="#cad-croqui" aria-expanded="true">Anotação Diversas</a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#anot-diversas" aria-expanded="true">
                                                Anotações Diversas
                                            </a>
                                        </li>
                                    </ul>
                                    <div class="tab-content profile-edit-tab-content" >


                                        <!--Inicio da tab-pane Cadastro Croqui-->
                                        <div id="cad-croqui" class="tab-pane in active"  >
                                                <form action="ControllerServlet?acao=" method="POST" >

                                                <input type="hidden" name="pkAutoStage" value="${auto.pkAutoStage}" />
                                                <input type="hidden" name="cdCroqui" value="1" />
                                                <input type="hidden" name="nmStatus" value="EmConferencia"  />
                                                <input type="hidden" name="execucao" value="${execucao}" />
                                                <input type="hidden" name="pgValidacao" value="${pgValidacao}" />


                                                <h4 class="header smaller lbl "><strong>Cadastro Croqui</strong></h4>

                                                <div class="form-group">
                                                    <div class="inline col-xs-2 col-xs-12"
                                                         <span class="lbl"><strong>Nº Croqui:</strong></span>
                                                    </div>

                                                    <label class="col-xs-5 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-4 col-xs-12" name="cdCroqui" 
                                                                       value="${cadSic.cdCroqui}" placeholder="Croqui" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-4 col-xs-12" name="cdCroqui" 
                                                                       placeholder="Croqui" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.cdCroqui}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                    <label class="col-xs-1 col-xs-12">
                                                        <span class = "lbl"><strong>Área:</strong></span>
                                                    </label>
                                                    <label class="col-xs-4 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-5 col-xs-12" name="cdArea" 
                                                                       value="${cadSic.cdArea}" placeholder="Código da Area" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-5 col-xs-12" name="cdArea" 
                                                                       placeholder="Código da Area" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.cdArea}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>                                                   
                                                </div>

                                                <div class="space-1"></div>
                                                <div class="form-group">
                                                    <div class="inline col-xs-2 col-xs-12 ">
                                                        <span class="lbl"><strong>Nº da Informação do DGPI:</strong></span>
                                                    </div>

                                                    <label class="col-xs-7 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-5 col-xs-12" name="nrInformacaoDgpi" 
                                                                       value="${cadSic.nrInformacaoDgpi}" placeholder="Nº da Informação do DGPI" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-5 col-xs-12" name="nrInformacaoDgpi" 
                                                                       placeholder="Nº da Informação do DGPI" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.nrInformacaoDgpi}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>  

                                                <div class="space-1"></div>
                                                <div class="form-group">
                                                    <div class="inline col-xs-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Processo:</strong></span>
                                                    </div>

                                                    <label class="col-xs-5 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-7 col-xs-12" name="cdProcesso" 
                                                                       value="${cadSic.cdProcesso}" placeholder="nº do processo" required="required"  >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-7 col-xs-12"  name="cdProcesso" 
                                                                       placeholder="Nº Processo" required="required"  >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.cdProcesso}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>

                                                    <label class="col-xs-1 col-xs-12" >
                                                        <span class="lbl"><strong>Nº TID:</strong></span>
                                                    </label>

                                                    <label class="col-xs-3 col-xs-12" >

                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-8 col-xs-12"  name="cdTid" 
                                                                       value="${cadSic.cdTid}" placeholder="Nº TID" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-8 col-xs-12"  name="cdTid" 
                                                                       placeholder="Nº TID" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.cdTid}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                <div class="form-group">
                                                    <div class="inline col-xs-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº de Expediente:</strong></span>
                                                    </div>

                                                    <label class="inline col-xs-7 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-5 col-xs-12"  name="cdExpediente" 
                                                                       value="${cadSic.cdExpediente}" placeholder="Nº Expediente" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-5 col-xs-12"  name="cdExpediente" 
                                                                       placeholder="Nº Expediente" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.cdExpediente}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                <div class="form-group">
                                                    <div class="inline col-xs-2 col-xs-12">
                                                        <span class="lbl"><strong>Interessado:</strong></span>
                                                    </div>

                                                    <label class="col-xs-7 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-6 col-xs-12"  name="nmInteressado" 
                                                                       value="${cadSic.nmInteressado}" placeholder="Nome do Interessado" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-6 col-xs-12"  name="nmInteressado" 
                                                                       placeholder="Nome do Interessado" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.nmInteressado}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                <div class="form-group">
                                                    <div class="inline col-xs-2 col-xs-12">
                                                        <span class="lbl"><strong>Assunto:</strong></span>
                                                    </div>

                                                    <label class="col-xs-7 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-6 col-xs-12"  name="dsAssunto" 
                                                                       value="${cadSic.dsAssunto}" placeholder="Descrição do assunto" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-6 col-xs-12"  name="dsAssunto" 
                                                                       placeholder="Descrição do assunto" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.dsAssunto}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                <div class="form-group">
                                                    <div class="inline col-xs-2 col-xs-12">
                                                        <span class="lbl"><strong>Tipo do Endereço:</strong></span>
                                                    </div>

                                                    <label class=" inline col-xs-5 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-7 col-xs-12" name="tipoEndereco" title="Rua / Avenida / Praça / etc" required="required">
                                                                    <option value="${cadSic.nmTipoEndereco}">${cadSic.nmTipoEndereco}</option>
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
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select class="col-md-7 col-xs-12" name="tipoEndereco" title="Rua / Avenida / Praça / etc" required="required">
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
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.nmTipoEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>

                                                    <label class="col-xs-2 col-xs-12">
                                                        <span class="lbl"><strong>Título do Endereço:</strong></span>
                                                    </label>

                                                    <label class="col-xs-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="tituloEndereco" title="Capitão / Doutor / Dom / etc">
                                                                    <option>${cadSic.nmTituloEndereco}</option>
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
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
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
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.nmTituloEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                <div class="form-group">
                                                    <div class="inline col-xs-2 col-xs-12">
                                                        <span class="lbl"><strong>Endereço:</strong></span>
                                                    </div>

                                                    <label class="col-xs-5 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-11 col-xs-12" name="nmEndereco" 
                                                                       value="${cadSic.nmEndereco}"  placeholder="Nome do Endereço" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-11 col-xs-12" name="nmEndereco" 
                                                                       placeholder="Nome do Endereço" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.nmEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>

                                                    <label class="col-xs-2 col-xs-12" >
                                                        <span class="lbl"><strong>Nº Endereço:</strong></span>
                                                    </label>

                                                    <label class="col-xs-3 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-8 col-xs-12" name="nrEndereco" 
                                                                       value="${cadSic.nrEndereco}" placeholder="nº">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-8 col-xs-12" name="nrEndereco" 
                                                                       placeholder="Nº Endereço">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.nrEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                <div class="form-group">
                                                    <div class="inline col-xs-2 col-xs-12">
                                                        <span class="lbl"><strong>Complemento do Endereço:</strong></span>
                                                    </div>

                                                    <label class="col-xs-5 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-11 col-xs-12" name="nmComplementoEndereco" 
                                                                       value="${cadSic.nmComplementoEndereco}" placeholder="Complemento do Endereço" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-11 col-xs-12" name="nmComplementoEndereco" 
                                                                       placeholder="Complemento do Endereço">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.nmComplementoEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>

                                                    <label class="col-xs-2 col-xs-12" >  
                                                        <span class="lbl"><strong>Referência do Endereco:</strong></span>
                                                    </label>                

                                                    <label class="col-xs-3 col-xs-12" >                                                  
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-xs-12" name="dsReferenciaEndereco" 
                                                                       value="${cadSic.dsReferenciaEndereco}" placeholder="Referencia do Endereço" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-xs-12" name="dsReferenciaEndereco" 
                                                                       placeholder="Referencia do Endereço" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${cadSic.dsReferenciaEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>
                                                <div class="form-group">
                                                    <div class="inline col-xs-2 col-xs-12"
                                                         <span class="lbl"><strong>Observação:</strong></span>
                                                    </div>
                                                    <label class="inline col-xs-2 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <textarea class="form-control" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 600px; height: 90px;">${sgd.dsObservacao}</textarea>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <textarea class="form-control" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 600px; height: 90px;"></textarea>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${sgd.dsObservacao}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <!-- Botões-->
                                                <div class="form-actions center ">
                                                    <button class="btn btn-yellow" type="reset" onclick=" location.href = 'Index.jsp';">
                                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                                        Voltar
                                                    </button>

                                                    <button class="btn btn-success" type="submit" id="salvar">
                                                        <i class="ace-icon fa fa-save bigger-110"></i>
                                                        Salvar
                                                    </button>

                                                    <button class="btn" type="reset">
                                                        <i class="ace-icon fa fa-eraser bigger-110"></i>
                                                        Limpar
                                                    </button>
                                                </div>
                                        </div>

                                        <!--Inicio da tab-pane Anotaçoes diversas  -->            
                                        <div id="anot-diversas" class="tab-pane">        
                                            <h4 class="header smaller lbl "><strong>Anotações Diversas</strong></h4>

                                            <div class="form-group">
                                                <div class="inline col-xs-1">
                                                    <span class="lbl"><strong>Setor:</strong></span>
                                                </div>
                                                <label class="col-xs-3 col-xs-12">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-5 col-xs-12" name="cdSetor" 
                                                                   value="${cadSic.cdSetor}" placeholder="Setor" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-5 col-xs-12" name="cdSetor" 
                                                                   placeholder="Setor" >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.cdSetor}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>

                                                <label class="col-xs-1 col-xs-12">
                                                    <span class="lbl"><strong>Quadra:</strong></span>   
                                                </label>
                                                <label class="col-xs-3 col-xs-12">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-6 col-xs-12" name="cdQuadra" 
                                                                   value="${cadSic.cdQuadra}" placeholder="Quadra" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-6 col-xs-12" name="cdQuadra" 
                                                                   placeholder="Quadra" >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.cdQuadra}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>

                                                <label class="col-xs-1 col-xs-12">
                                                    <span class="lbl"><strong>Lote:</strong></span>
                                                </label>                

                                                <label class="col-xs-3 col-xs-12">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-6 col-xs-12" name="cdLote" 
                                                                   value="${cadSic.cdLote}" placeholder="Lote" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-6 col-xs-12" name="cdLote" 
                                                                   placeholder="Lote" >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.cdLote}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>

                                            <div class="space-1"></div>
                                            <div class="form-group">
                                                <div class="inline col-xs-2 col-xs-12">
                                                    <span class="lbl"><strong>Expediente:</strong></span>
                                                </div>

                                                <label class="col-xs-7 col-xs-12">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-7 col-xs-12" name="cdExpediente" 
                                                                   value="${cadSic.cdExpediente}" placeholder="Expediente" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-7 col-xs-12" name="cdExpediente" 
                                                                   placeholder="Expediente" >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.cdLote}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>

                                            <div class="space-1"></div>
                                            <div class="form-group">
                                                <div class="inline col-xs-2 col-xs-12">
                                                    <span class="lbl"><strong>Interessado:</strong></span>
                                                </div>

                                                <label class="col-xs-7 col-xs-12">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-7 col-xs-12" name="nmInteressado" 
                                                                   value="${cadSic.nmInteressado}" placeholder="Interessado" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-7 col-xs-12" name="nmInteressado" 
                                                                   placeholder="Interessado" >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.nmInteressado}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>

                                            <div class="space-1"></div>
                                            <div class="form-group">
                                                <div class="inline col-xs-2 col-xs-12">
                                                    <span class="lbl"><strong>Assunto:</strong></span>
                                                </div>

                                                <label class="col-xs-7 col-xs-12">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-7 col-xs-12" name="dsAssunto" 
                                                                   value="${cadSic.dsAssunto}" placeholder="Assunto" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-7 col-xs-12" name="dsAssunto" 
                                                                   placeholder="Assunto" >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.dsAssunto}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>

                                            <div class="space-1"></div>
                                            <div class="form-group">
                                                <div class="inline col-xs-2 col-xs-12">
                                                    <span class="lbl"><strong>Tipo do Endereço:</strong></span>
                                                </div>

                                                <label class=" inline col-xs-5 col-xs-12" >
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <select class="col-md-7 col-xs-12" name="tipoEndereco" title="Rua / Avenida / Praça / etc" required="required">
                                                                <option value="${cadSic.nmTipoEndereco}">${cadSic.nmTipoEndereco}</option>
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
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <select class="col-md-7 col-xs-12" name="tipoEndereco" title="Rua / Avenida / Praça / etc" required="required">
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
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.nmTipoEndereco}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>

                                                <label class="col-xs-2 col-xs-12">
                                                    <span class="lbl"><strong>Título do Endereço:</strong></span>
                                                </label>

                                                <label class="col-xs-3 col-xs-12">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <select class="col-md-12 col-xs-12" name="tituloEndereco" title="Capitão / Doutor / Dom / etc">
                                                                <option>${cadSic.nmTituloEndereco}</option>
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
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
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
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.nmTituloEndereco}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>

                                            <div class="space-1"></div>
                                            <div class="form-group">
                                                <div class="inline col-xs-2 col-xs-12">
                                                    <span class="lbl"><strong>Endereço:</strong></span>
                                                </div>

                                                <label class="col-xs-5 col-xs-12" >
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-11 col-xs-12" name="nmEndereco" 
                                                                   value="${cadSic.nmEndereco}"  placeholder="Nome do Endereço" required="required">
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-11 col-xs-12" name="nmEndereco" 
                                                                   placeholder="Nome do Endereço" required="required">
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.nmEndereco}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>

                                                <label class="col-xs-2 col-xs-12" >
                                                    <span class="lbl"><strong>Nº Endereço:</strong></span>
                                                </label>

                                                <label class="col-xs-3 col-xs-12" >
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-8 col-xs-12" name="nrEndereco" 
                                                                   value="${cadSic.nrEndereco}" placeholder="nº">
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-8 col-xs-12" name="nrEndereco" 
                                                                   placeholder="Nº Endereço">
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.nrEndereco}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>

                                            <div class="space-1"></div>
                                            <div class="form-group">
                                                <div class="inline col-xs-2 col-xs-12">
                                                    <span class="lbl"><strong>Complemento do Endereço:</strong></span>
                                                </div>

                                                <label class="col-xs-5 col-xs-12" >
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-11 col-xs-12" name="nmComplementoEndereco" 
                                                                   value="${cadSic.nmComplementoEndereco}" placeholder="Complemento do Endereço" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-11 col-xs-12" name="nmComplementoEndereco" 
                                                                   placeholder="Complemento do Endereço">
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.nmComplementoEndereco}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>

                                                <label class="col-xs-2 col-xs-12" >  
                                                    <span class="lbl"><strong>Referência do Endereco:</strong></span>
                                                </label>                

                                                <label class="col-xs-3 col-xs-12" >                                                  
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-12 col-xs-12" name="dsReferenciaEndereco" 
                                                                   value="${cadSic.dsReferenciaEndereco}" placeholder="Referencia do Endereço" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-12 col-xs-12" name="dsReferenciaEndereco" 
                                                                   placeholder="Referencia do Endereço" >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.dsReferenciaEndereco}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>

                                            <div class="space-1"></div>
                                            <div class="form-group">
                                                <div class="inline col-xs-2 col-xs-12">
                                                    <span class="lbl"><strong>Despacho:</strong></span>
                                                </div>

                                                <label class="col-xs-7 col-xs-12" >
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-xs-7 col-xs-12" name="dsDespacho" 
                                                                   value="${cadSic.dsDespacho}" placeholder="Despacho" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-xs-7 col-xs-12" name="dsDespacho" 
                                                                   placeholder="Despacho" >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.dsDespacho}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>

                                            <div class="space-1"></div>
                                            <div class="form-group">
                                                <div class="inline col-xs-2 col-xs-12">
                                                    <span class="lbl"><strong>Data da Anotação:</strong></span>
                                                </div>

                                                <label class="inline col-xs-3 col-xs-12" >
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <div class="input-group">
                                                                <input class="form-control date-picker" id="id-date-picker-1" name="dtAnotacao" 
                                                                       value="${cadSic.dtAnotacao}" type="text" placeholder="dd/mm/aaaa" data-date-format="dd/mm/yyyy" 
                                                                       required="required">
                                                                <span class="input-group-addon">
                                                                    <i class="fa fa-calendar bigger-110"></i>
                                                                </span>
                                                            </div>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <div class="input-group">
                                                                <input class="form-control date-picker" id="id-date-picker-1" name="dtAnotacao" type="text" 
                                                                       placeholder="dd/mm/aaaa" data-date-format="dd/mm/yyyy" required="required">
                                                                <span class="input-group-addon">
                                                                    <i class="fa fa-calendar bigger-110"></i>
                                                                </span>
                                                            </div>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.dtAnotacao}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>

                                                <label class="col-xs-2 col-xs-12" >
                                                    <span class="lbl"><strong>Data da Publicação:</strong></span>
                                                </label>

                                                <label class="col-xs-3 col-xs-12" >
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <div class="input-group">
                                                                <input class="form-control date-picker" id="id-date-picker-1" name="dtPublicacao" 
                                                                       value="${cadSic.dtPublicacao}" type="text" placeholder="dd/mm/aaaa" data-date-format="dd/mm/yyyy" 
                                                                       required="required">
                                                                <span class="input-group-addon">
                                                                    <i class="fa fa-calendar bigger-110"></i>
                                                                </span>
                                                            </div>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <div class="input-group">
                                                                <input class="form-control date-picker" id="id-date-picker-1" name="dtPublicacao" type="text" 
                                                                       placeholder="dd/mm/aaaa" data-date-format="dd/mm/yyyy" required="required">
                                                                <span class="input-group-addon">
                                                                    <i class="fa fa-calendar bigger-110"></i>
                                                                </span>
                                                            </div>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.dtPublicacao}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>                                                
                                            </div>

                                            <div class="space-1"></div>
                                            <div class="form-group">
                                                <div class="inline col-xs-2 col-xs-12">
                                                    <span class="lbl"><strong>Informações Gerais:</strong></span>
                                                </div>

                                                <label class="col-xs-10 col-xs-12" >
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <textarea class="form-control" id="form-field-8" name="dsInfoGeral" placeholder="Informações Gerais" 
                                                                      style="margin: 0px 102.656px 0px 0px; width: 600px; height: 90px;">${cadSic.dsInfoGeral}</textarea>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <textarea class="form-control" id="form-field-8" name="dsInfoGeral" placeholder="Informações Gerais" 
                                                                      style="margin: 0px 102.656px 0px 0px; width: 600px; height: 90px;"></textarea>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${cadSic.dsInfoGeral}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>

                                            <!-- BOTOES -->
                                            <div class="form-actions center">
                                                <button class="btn btn-yellow" type="reset" onclick=" location.href = 'Index.jsp';">
                                                    <i class="ace-icon fa fa-undo bigger-110"></i>
                                                    Voltar
                                                </button>

                                                <button class="btn btn-success" type="submit" id="salvar">
                                                    <i class="ace-icon fa fa-save bigger-110"></i>
                                                    Salvar
                                                </button>

                                                <button class="btn" type="reset">
                                                    <i class="ace-icon fa fa-eraser bigger-110"></i>
                                                    Limpar
                                                </button>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>    
                        </div>    

                        <jsp:include page = "include/footer.jsp" />
                        <jsp:include page = "javaScritp/carregado.html" />

                    </div>

                    <div id="dialog-planta"style="display:none;"></div>
                    <div id="dialog-auto-cessao"style="display:none;"></div>

                    </body>
                    </html>


