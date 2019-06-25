<%-- 
    Document   : AnotacaoCroquiCRU
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

            <!--Include ação ajax e javaScritp -->        
            <jsp:include page = "include/maskProcessoSelect.jsp" />
            <jsp:include page = "javaScritp/somenteNum.html" />
            <jsp:include page = "include/adicionarCampoArea.jsp" />
            <jsp:include page = "javaScritp/alertEffect.html" />


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

                            <c:if test="${msg=='true'}">
                                <div class="alert alert-${typeAlert}">
                                    <button type="button" class="close" data-dismiss="alert">
                                        <i class="ace-icon fa fa-times"></i>
                                    </button>
                                    <strong>
                                        <i class="ace-icon fa fa-times"></i>
                                        ${msgAlert}
                                    </strong>
                                    ${txtAlert}
                                    <br>
                                </div>
                            </c:if> 

                            <h2>Anotação Croqui</h2>
                            <div class="space-14"></div>
                            <div class="form-horizontal">
                                <div class="tabbable">
                                    <ul class="nav nav-tabs padding-0">
                                        <li class="${tabCroquiActive}">
                                            <a data-toggle="tab" href="#cad-croqui" aria-expanded="true">
                                                Anotação Croqui 
                                                <c:choose>
                                                    <c:when test="${anotCroqui.pkAnotacaoExpediente == ''}">
                                                        <span class="badge badge-transparent" title="Pendente Validação"><i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i></span>
                                                        </c:when>
                                                        <c:otherwise>
                                                        <span class="badge badge-transparent" title="Validado"><i class="ace-icon fa fa-check-square-o green bigger-130"></i></span>
                                                        </c:otherwise>    
                                                    </c:choose>
                                            </a>
                                        </li>
                                        <li class="${tabAnexoActive}">
                                            <a data-toggle="tab" href="#doc-anexo" aria-expanded="true">
                                                Documentos Anexo
                                                <c:choose>
                                                    <c:when test="${empty listAnexo}">
                                                        <span class="badge badge-transparent" title="Pendente Validação"><i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i></span>
                                                        </c:when>
                                                        <c:otherwise>
                                                        <span class="badge badge-transparent" title="Validado"><i class="ace-icon fa fa-check-square-o green bigger-130"></i></span>
                                                        </c:otherwise>    
                                                    </c:choose>
                                            </a>
                                        </li>
                                    </ul>
                                    <div class="tab-content profile-edit-tab-content" >

                                        <!--Inicio da tab-pane Cadastro Croqui-->
                                        <div id="cad-croqui" class="tab-pane ${tabCroquiActive}"  >
                                            <form action="ControllerServlet?acao=AnotacaoCroquiUC" method="POST" >
                                                <input type="hidden" name="pkAnotacaoExpediente" value="${anotCroqui.pkAnotacaoExpediente}" />
                                                <input type="hidden" name="execucao" value="${execucao}" />

                                                <div class="space-14"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Tipo de Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                <select name="sgTpExpediente" id="sgTpExpediente" placeholder="" class="col-md-10 col-xs-12" 
                                                                        onchange="limpaCampoNrProcesso(this)" required="required">
                                                                    <option>${anotCroqui.tpExpediente.sgTipoExpediente}</option>
                                                                    <option></option>
                                                                    <c:forEach var="lis" items="${listaTpExp}">
                                                                        <c:if test="${lis.sgTipoExpediente != ''}">
                                                                            <option>${lis.sgTipoExpediente}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>


                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" class="col-xs-8 col-xs-12" name="sgTpExpediente" id="sgTpExpediente"  
                                                                       value="${sgTpExpediente}"  required="required" readonly="readoly">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.tpExpediente.sgTipoExpediente}
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>

                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-6 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                <input type="text" class="col-md-5 col-xs-12" name="cdExpediente" id="nrprocesso" 
                                                                       value="${anotCroqui.cdExpediente}" required="required" onblur="maskProcessoSelect(this);" >
                                                                &nbsp;<span id="msgProcesso"></span>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" class="col-md-5 col-xs-12" name="cdExpediente" id="nrprocesso"  
                                                                       value="${cdExpediente}"  placeholder="Nº do Expediente"  required="required" readonly="readonly">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.cdExpediente}</span>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                <div class="tab-content" >
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12">
                                                            <span class="lbl"><strong>Croqui:</strong></span>
                                                        </label>
                                                        <label class="col-md-3 col-xs-12">
                                                            <c:choose>
                                                                <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                    <input type="text" class="col-md-6 col-xs-12" name="cdCroqui"  onKeyPress="return somenteNum(event);" 
                                                                           value="${anotCroqui.cdCroqui}" placeholder="Código Croqui" maxlength="6" required="required" autofocus>
                                                                </c:when>
                                                                <c:when test="${execucao == 'insert'}">
                                                                    <input type="text" class="col-md-6 col-xs-12" name="cdCroqui"  onKeyPress="return somenteNum(event);" 
                                                                           placeholder="Código Croqui" maxlength="6" required="required" autofocus>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="lbl">${anotCroqui.cdCroqui}</span>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </label>

                                                        <label class="col-md-2 col-xs-12">
                                                            <span class = "lbl"><strong>Área:</strong></span>
                                                        </label>
                                                        <label class="col-md-5 col-xs-12">
                                                            <c:choose>
                                                                <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                    <input type="text" class="col-md-4 col-xs-12" name="cdArea"  onKeyPress="return somenteNum(event);" 
                                                                           value="${anotCroqui.cdArea}" maxlength="4" placeholder="Código Área" required="required" >
                                                                </c:when>
                                                                <c:when test="${execucao == 'insert'}">
                                                                    <input type="text" class="col-md-4 col-xs-12" name="cdArea"  onKeyPress="return somenteNum(event);" 
                                                                           maxlength="4" placeholder="Código Área inserir" required="required">
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="lbl">${anotCroqui.cdArea}</span> 
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </label>
                                                    </div>

                                                    <div class="space-1"></div>

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Tipo endereço:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-3 col-xs-12">
                                                            <c:choose>
                                                                <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                    <select class="col-md-12 col-xs-12" name="tipoEndereco" title="Rua / Avenida / Praça / etc" required="required">
                                                                        <option>${anotCroqui.endereco.tipo}</option>
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
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="lbl">${anotCroqui.endereco.tipo} </span> 
                                                                </c:otherwise>
                                                            </c:choose>

                                                        </label>
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Título do endereço:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-3 col-xs-12" >
                                                            <c:choose>
                                                                <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                    <select class="col-md-12 col-xs-12" name="tituloEndereco" title="Capitão / Doutor / Dom / etc">
                                                                        <option>${anotCroqui.endereco.titulo}</option>
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
                                                                    <span class="lbl">${anotCroqui.endereco.titulo}</span> 
                                                                </c:otherwise>
                                                            </c:choose>


                                                        </label>
                                                    </div>

                                                    <div class="space-1"></div>

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Endereço:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-6 col-xs-12" >
                                                            <c:choose>
                                                                <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmendereco" 
                                                                           value="${anotCroqui.endereco.endereco}"  placeholder="nome do endereço" required="required">
                                                                </c:when>
                                                                <c:when test="${execucao == 'insert'}">
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmendereco" placeholder="nome do endereço" required="required">
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="lbl">${anotCroqui.endereco.endereco}</span> 
                                                                </c:otherwise>
                                                            </c:choose>

                                                        </label>
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>número:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-1 col-xs-12" >
                                                            <c:choose>
                                                                <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrnumeroend" 
                                                                           value="${anotCroqui.endereco.numero}" placeholder="nº">
                                                                </c:when>
                                                                <c:when test="${execucao == 'insert'}">
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrnumeroend" placeholder="nº">
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="lbl">${anotCroqui.endereco.numero}</span> 
                                                                </c:otherwise>
                                                            </c:choose>

                                                        </label>
                                                    </div>

                                                    <div class="space-1"></div>

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Complemento:</strong></span>
                                                        </label>
                                                        <label class="inline col-sm-3 col-xs-12" >
                                                            <c:choose>
                                                                <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcomplementoend" 
                                                                           value="${anotCroqui.endereco.complemento}" placeholder="complemento do endereço" >
                                                                </c:when>
                                                                <c:when test="${execucao == 'insert'}">
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcomplementoend" placeholder="complemento do endereço" >
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="lbl">${anotCroqui.endereco.complemento}</span> 
                                                                </c:otherwise>
                                                            </c:choose>

                                                        </label>

                                                    </div>

                                                    <div class="space-1"></div>

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >  
                                                            <span class="lbl"><strong>Referência:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-8 col-xs-12" >
                                                            <c:choose>
                                                                <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmreferenciaend" 
                                                                           value="${anotCroqui.endereco.referencia}" placeholder="referencia do endereço" >
                                                                </c:when>
                                                                <c:when test="${execucao == 'insert'}">
                                                                    <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmreferenciaend" placeholder="referencia do endereço" >
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="lbl">${anotCroqui.endereco.referencia}</span> 
                                                                </c:otherwise>
                                                            </c:choose>

                                                        </label>
                                                    </div>
                                                </div>
                                                <!--Abaixo div onde add o novo campo área -->
                                                <br /><div class="input_fields_wrap col-md-12 col-xs-12"></div>

                                                <c:if test="${execucao == 'insert' || execucao == 'duplicate'}">
                                                    <a href="#" class="add_field_button" title="Adicionar ">
                                                        <span class="label label-xlg label-success">
                                                            <i class=" glyphicon glyphicon-plus"></i>
                                                            Croqui e Área
                                                        </span>
                                                    </a>
                                                </c:if>

                                                <div class="space-10"></div>
                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Interessado:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="nmInteressado" 
                                                                       value="${anotCroqui.nmInteressado}" placeholder="Nome do Interessado" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="nmInteressado" 
                                                                       placeholder="Nome do Interessado" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.nmInteressado}</span>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Assunto:</strong></span>
                                                    </label>
                                                    <label class="col-md-5 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                <select name="assunto" id="assunto" placeholder="" class="col-md-12 col-xs-12" required="required">
                                                                    <option value="${anotCroqui.tpAssunto.pkTipoAssunto}">${anotCroqui.tpAssunto.nmTipoAssunto}</option>
                                                                    <option></option>
                                                                    <c:forEach var="lis" items="${listTpAssunto}">
                                                                        <c:if test="${lis.nmTipoAssunto != ''}">
                                                                            <option value="${lis.pkTipoAssunto}" title="${lis.nmTipoAssunto}">${lis.nmTipoAssunto}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>

                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select name="assunto" id="assunto" placeholder="" class="col-md-12 col-xs-12" required="required">
                                                                    <option></option>
                                                                    <c:forEach var="lis" items="${listTpAssunto}">
                                                                        <c:if test="${lis.nmTipoAssunto != ''}">
                                                                            <option value="${lis.pkTipoAssunto}" title="${lis.nmTipoAssunto}">${lis.nmTipoAssunto}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.tpAssunto.nmTipoAssunto}</span>
                                                            </c:otherwise>
                                                        </c:choose>         
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Despacho:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-3 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                <select name="despacho" id="assunto" placeholder="" class="col-md-12 col-xs-12">
                                                                    <option value="${anotCroqui.tpDespacho.pkTipoDespacho}">${anotCroqui.tpDespacho.nmTipoDespacho}</option>
                                                                    <option></option>
                                                                    <c:forEach var="lis" items="${listTpDespacho}">
                                                                        <c:if test="${lis.nmTipoDespacho != ''}">
                                                                            <option value="${lis.pkTipoDespacho}" title="${lis.nmTipoDespacho}">${lis.nmTipoDespacho}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select name="despacho" id="assunto" placeholder="" class="col-md-10 col-xs-12">
                                                                    <option></option>
                                                                    <c:forEach var="lis" items="${listTpDespacho}">
                                                                        <c:if test="${lis.nmTipoDespacho != ''}">
                                                                            <option value="${lis.pkTipoDespacho}" title="${lis.nmTipoDespacho}">${lis.nmTipoDespacho}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.tpDespacho.nmTipoDespacho}</span>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Publicado no DOM:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-4 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtPublicacao" 
                                                                       value="${anotCroqui.dtPublicacao}" title="Selecione a data">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtPublicacao" 
                                                                       title="Selecione a data">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl"><fmt:formatDate pattern="dd/MM/yyyy" value="${anotCroqui.dtPublicacao}" /></span>


                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data de Tramitação:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-4 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtTramitacao" 
                                                                       value="${anotCroqui.dtTramitacao}" title="Selecione a data">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtTramitacao" 
                                                                       title="Selecione a data">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl"><fmt:formatDate pattern="dd/MM/yyyy" value="${anotCroqui.dtTramitacao}" /></span>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Observação:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-9 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit' || execucao == 'duplicate'}">
                                                                <textarea class="form-control col-xs-12" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;">${anotCroqui.dsObservacao}</textarea>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <textarea class="form-control col-xs-12" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;"></textarea>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.dsObservacao}</span>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div> 
                                                <c:if test="${execucao!='insert'}">
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12">
                                                            <span class="lbl"><strong>Usuário:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-4 col-xs-12" >
                                                            <span class="lbl">${u.nmNome}</span>
                                                        </label>

                                                        <label class="inline col-md-2 col-xs-12">
                                                            <span class="lbl"><strong>Atualização:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-4 col-xs-12" >
                                                            <c:set var = "dt" value = "${anotCroqui.dthrAtualizacao}" />
                                                            <fmt:parseDate var="converteData" value = "${dt}" pattern = "yyyy-MM-dd HH:mm:ss" />
                                                            <span class="lbl"><fmt:formatDate value="${converteData}" pattern="dd/MM/yyyy - HH:mm:ss" /></span>
                                                        </label>
                                                    </div>
                                                </c:if>    
                                                <!-- Botões-->
                                                <div class="form-actions center ">
                                                    <c:choose>
                                                        <c:when test="${bntBack=='newSearch' && execucao == 'view'}">
                                                            <button class="btn btn-yellow" type="reset" onclick=" location.href = 'ControllerServlet?acao=AnotacaoCroquiLista';">
                                                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                Voltar
                                                            </button>
                                                        </c:when>
                                                        <c:when test="${bntBack=='newSearch' && execucao == 'duplicate'}">
                                                            <button class="btn btn-yellow" type="reset" onclick=" location.href = 'ControllerServlet?acao=AnotacaoCroquiPesquisa&primeiro=true';">
                                                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                Voltar
                                                            </button>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <button class="btn btn-yellow" type="reset" onclick="history.back();">
                                                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                Voltar
                                                            </button>
                                                        </c:otherwise>        
                                                    </c:choose>

                                                    <c:if test="${execucao != 'view'}" >
                                                        <button class="btn btn-success" type="submit" id="btnExecutarAcao">
                                                            <i class="ace-icon fa fa-save bigger-110"></i>
                                                            Salvar
                                                        </button>

                                                        <button class="btn" type="reset">
                                                            <i class="ace-icon fa fa-eraser bigger-110"></i>
                                                            Limpar
                                                        </button>
                                                    </c:if>
                                                </div>
                                            </form>
                                        </div>

                                        <!--Inicio da tab-pane Documento Anexo -->        
                                        <div id="doc-anexo" class="${disabled} tab-pane ${tabAnexoActive} ">
                                            <form action="ControllerServlet?acao=AnotacaoCroquiUploadArquivo" enctype="multipart/form-data" method="POST" >
                                                <h4 class="header smaller lbl "><strong>Documentos Anexo</strong></h4>
                                                <input type="hidden" name="pkAnotCroqui" value="${anotCroqui.pkAnotacaoExpediente}" />
                                                <c:if test="${execucao!='view' && (sessionSgDivisao == 'DIPI' && sessionSgSetor == 'SIC' || sessionPerfil == 'Administrador')}">

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12">
                                                            <strong>Tipo de documento:</strong>
                                                        </label>
                                                        <label class="inline col-md-3 col-xs-12">
                                                            <select name="fktipoArquivo"  placeholder="" class="col-xs-12 col-md-8" 
                                                                    required="required">
                                                                <option></option>
                                                                <c:forEach var="anexo" items="${listTpAnexo}">
                                                                    <c:if test="${anexo.nmTipoAnexo != ''}">
                                                                        <option value="${anexo.pkTipoAnexo}">${anexo.nmTipoAnexo}</option>
                                                                    </c:if>
                                                                </c:forEach>
                                                            </select>
                                                        </label>
                                                        <label class="inline col-md-4 col-xs-12">
                                                            <input type="file"  id="id-input-file-2" name="UploadCroqui" required="required"><span class="ace-file-container" data-title="Choose"><span class="ace-file-name" data-title="No File ..."></span></span>
                                                        </label>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12">
                                                            <strong>Descrição:</strong>
                                                        </label >                                                        
                                                        <label class="inline col-md-7 col-xs-12">
                                                            <input type="text" name="nomeDoArquivo" placeholder="Nome do arquivo" class="col-xs-12 col-md-12" required="required" >
                                                        </label>
                                                        <label class="inline col-md-2 col-xs-12">
                                                            <button class="btn btn-success"  type="submit">
                                                                <i class="ace-icon fa fa-save bigger-110"></i>
                                                                Anexar
                                                            </button
                                                        </label> 
                                                    </div>

                                                    <c:if test="${not empty lisAnotCroquiCriado}">
                                                        <table class="table">
                                                            <thead>
                                                                <tr>
                                                                    <th>Croqui </th>
                                                                    <th>Área</th>
                                                                    <th>Vincular</th>
                                                                </tr>
                                                            </thead>
                                                            <c:forEach var="a" items="${lisAnotCroquiCriado}">
                                                                <tbody>
                                                                    <tr>
                                                                        <td title="${a.cdCroqui}">
                                                                            ${a.cdCroqui}
                                                                        </td>
                                                                        <td title="${a.cdArea}">
                                                                            ${a.cdArea}
                                                                        </td>
                                                                        <td>
                                                                            <div class="hidden-sm hidden-xs btn-group">
                                                                                <label class="col-sm-2 col-xs-12" >
                                                                                    <input id="id-button-borders" type="checkbox" id="relatorio" name="listPkAnotCroqui" 
                                                                                           value="${a.pkAnotacaoExpediente}" class="ace ace-switch ace-switch-5"/>
                                                                                    <span class="lbl middle"></span>
                                                                                </label>                                                                                                                               
                                                                            </div>
                                                                        </td>
                                                                    </tr>
                                                                </tbody>
                                                            </c:forEach>
                                                        </table>
                                                    </c:if>
                                                </form>  

                                                <div class="hr hr-18 dotted hr-double"></div>
                                            </c:if>
                                            <c:forEach var="anexo" items="${listAnexo}"> 
                                                <div class="form-group">
                                                    <form action="" method="POST">
                                                        <div class="inline col-md-12 col-xs-12">
                                                            <div class="inline col-md-1 col-xs-12">
                                                                <a href="/SGPatri/Croqui/${anexo.nmAnexo}" target="_blank"><img class="img-thumbnail" src="img/AC.png" title="${anexo.nmAnexo}" width="80%" height="80%"/></a>
                                                            </div>
                                                            <div class="inline col-md-3 col-xs-12">
                                                                <label class="inline col-md-12 col-xs-12">
                                                                    <strong>Tipo:</strong> ${anexo.tpAnexo.nmTipoAnexo}
                                                                </label>
                                                            </div>
                                                            <div class="inline col-md-7 col-xs-12">
                                                                <label class="inline col-md-12 col-xs-12">
                                                                    <strong>Descrição:</strong> ${anexo.dsAnexo}
                                                                </label>
                                                            </div>
                                                            <c:if test="${execucao!='view' && (sessionSgDivisao == 'DIPI' && sessionSgSetor == 'SIC' || sessionPerfil == 'Administrador')}">
                                                                <div class="inline col-md-1 col-md-12 disabled-li-menu">
                                                                    <button class="btn btn-danger btn-xs">
                                                                        <i class="ace-icon fa fa-trash-o bigger-130 icon-only"></i>
                                                                    </button>
                                                                </div>
                                                            </c:if> 
                                                        </div>
                                                    </form>
                                                </div>
                                                <div class="hr hr-16 hr-dotted"></div>
                                            </c:forEach>

























                                        </div>    
                                    </div>

                                </div>    
                                <jsp:include page = "include/footer.jsp" />
                                <jsp:include page = "javaScritp/carregado.html" />
                            </div>    
                        </div>
                    </div>
                </div>
            </div>
    </body>
</html>


