<%-- 
    Document   : MinisterioPublicoCRU
    Created on : 14/03/2019, 15:42:57
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
            <jsp:include page = "javaScritp/maskProcesso.html" />
            <jsp:include page = "javaScritp/somenteNum.html" />

            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />

            <!--Pegando os paremetros -->
            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="execucao" value="${param.execucao}" />

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Ministerio Publico </li>
                </ul>
            </div>    
            <div class="page-content" >
                <div class="row">
                    <div class="col-xs-12">
                        <div class="col-sm-offset-1 col-sm-10">
                            <h2>Ministerio Publico </h2>
                            <div class="space-14"></div>
                            <div class="form-horizontal">
                                <div class="tabbable">
                                    <ul class="nav nav-tabs padding-0">
                                        <li class="active">
                                            <a data-toggle="tab" href="#cad-ministPublico" aria-expanded="true">
                                                Ministerio Publico 
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#anexar-doc" aria-expanded="true">
                                                Anexar documento

                                            </a>
                                        </li>
                                    </ul>
                                    <form action="ControllerServlet?acao=MinisterioPublicoUC" method="POST" >
                                        <div class="tab-content profile-edit-tab-content" >
                                            <!--Inicio da tab-pane -->
                                            <div id="cad-ministPublico" class="tab-pane in active"  >
                                                <input type="hidden" name="pkMinisterioPublico" value="${ministPublico.pkMinisterioPublico}" >
                                                <input type="hidden" name="execucao" value="${execucao}" >
                                                <input type="hidden" name="nmInteressado" value="Ministério Público">
                                                <h4 class="header smaller lbl "><strong>Ministerio Publico</strong></h4>
                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Origem:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-8 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="nmOrigem" 
                                                                       value="${ministPublico.nmOrigem}" placeholder="Nome da Origem">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-8 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12" name="nmOrigem" 
                                                                       placeholder="Nome da Origem">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${ministPublico.nmOrigem}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Ofício de PJHURB:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-3 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="cdOficioEntrada" 
                                                                       value="${ministPublico.cdOficioEntrada}" placeholder="Oficio de Entrada">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-3 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="cdOficioEntrada" 
                                                                       placeholder="Oficio de Entrada">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${ministPublico.cdOficioEntrada}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data da Entrada:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="date" id="form-field-1" class="col-sm-6 col-xs-12" name="dtEntrada" 
                                                                       value="${ministPublico.dtEntrada}" placeholder="YYYY/MM/DD">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="date" id="form-field-1" class="col-sm-6 col-xs-12" name="dtEntrada" 
                                                                       placeholder="YYYY/MM/DD">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>                                                   
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${ministPublico.dtEntrada}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Autos/I.C.  Nº:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nrProcedimento" 
                                                                       value="${ministPublico.nrProcedimento}" placeholder="Nº Procedimento/Auto/I.C." >
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nrProcedimento" 
                                                                       placeholder="Nº Procedimento/Auto/I.C.">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${ministPublico.nrProcedimento}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Assunto:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-8 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="dsAssunto" 
                                                                       value="${ministPublico.dsAssunto}" placeholder="Descrição do assunto"  >         
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-8 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="dsAssunto" 
                                                                       placeholder="Descrição do assunto"  >         
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${ministPublico.dsAssunto}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Expediente MP:</strong></span>
                                                    </label>
                                                    <label class="col-sm-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="nrprocessoini" class="col-sm-10 col-xs-12"  name="cdProcessoIni" 
                                                                       value="${ministPublico.cdProcessoIni}" placeholder="Nº do Processo" onKeyPress="return somenteNum(event);">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" class="col-sm-10 col-xs-12"  name="cdProcessoIni" 
                                                                       placeholder="Nº do Processo" id="nrprocessoini" onKeyPress="return somenteNum(event);">

                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${ministPublico.cdProcessoIni}</span>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>

                                                    <!-- Mascara do tipo do processo -->
                                                    <c:if test="${execucao == 'insert' || execucao == 'edit' }">
                                                        <label class="inline col-sm-3 col-xs-12">
                                                            <div class=" radio col-sm-3 col-xs-12">
                                                                <label>
                                                                    <input name="tpProcessoIni" id="seiI" value="SEI" type="radio"  class="ace" onclick="maskProcessoIni();" required="required">
                                                                    <span class="lbl"><strong> SEI</strong></span>
                                                                </label>
                                                            </div>
                                                            <div class=" radio col-sm-3 col-xs-12">
                                                                <label>
                                                                    <input name="tpProcessoIni" id="paI" value="PA" type="radio" class="ace" onclick="maskProcessoIni();">
                                                                    <span class="lbl"><strong> P.A.</strong></span>
                                                                </label>
                                                            </div>
                                                            <div class=" radio col-sm-3 col-xs-12">
                                                                <label>
                                                                    <input name="tpProcessoIni" id="tidI" value="TID" type="radio" class="ace" onclick="maskProcessoIni();">
                                                                    <span class="lbl"><strong> TID</strong></span>
                                                                </label>
                                                            </div>
                                                            <div class=" radio col-sm-3 col-xs-12">
                                                                <label>
                                                                    <input name="tpProcessoIni" id="cidI" value="CID" type="radio" class="ace" onclick="maskProcessoIni();">
                                                                    <span class="lbl"><strong> CID</strong></span>
                                                                </label>
                                                            </div>
                                                        </label>
                                                        &nbsp;<span id="msgProcessoI"></span>
                                                    </c:if>
                                                </div>
                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Processo:</strong></span>
                                                    </label>
                                                    <label class="col-sm-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="nrprocesso" class="col-sm-10 col-xs-12"  name="cdProcesso" 
                                                                       value="${ministPublico.cdProcesso}" placeholder="Nº do Processo" onKeyPress="return somenteNum(event);">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" class="col-sm-10 col-xs-12"  name="cdProcesso" 
                                                                       placeholder="Nº do Processo" id="nrprocesso" onKeyPress="return somenteNum(event);">

                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${ministPublico.cdProcesso}</span>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                    <!-- Mascara do tipo do processo  d642714-->
                                                    <c:if test="${execucao == 'insert' || execucao == 'edit' }">
                                                        <label class="inline col-sm-3 col-xs-12">
                                                            <div class="radio col-sm-3 col-xs-12">
                                                                <label>
                                                                    <input name="tpProcesso" id="sei" value="SEI" type="radio"  class="ace" onclick="maskProcesso();" required="required">
                                                                    <span class="lbl"><strong> SEI</strong></span>
                                                                </label>
                                                            </div>
                                                            <div class="radio col-sm-3 col-xs-12">
                                                                <label>
                                                                    <input name="tpProcesso" id="pa" value="PA" type="radio" class="ace" onclick="maskProcesso();">
                                                                    <span class="lbl"><strong> P.A.</strong></span>
                                                                </label>
                                                            </div>
                                                            <div class="radio col-sm-3 col-xs-12">
                                                                <label>
                                                                    <input name="tpProcesso" id="tid" value="TID" type="radio" class="ace" onclick="maskProcesso();">
                                                                    <span class="lbl"><strong> TID</strong></span>
                                                                </label>
                                                            </div>
                                                            <div class="radio col-sm-3 col-xs-12">
                                                                <label>
                                                                    <input name="tpProcesso" id="cid" value="CID" type="radio" class="ace" onclick="maskProcesso();">
                                                                    <span class="lbl"><strong> CID</strong></span>
                                                                </label>
                                                            </div>
                                                        </label>
                                                        &nbsp;<span id="msgProcesso"></span>
                                                    </c:if>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Interessado:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-4 col-xs-12"  name="nmSolicitado" 
                                                                       value="${ministPublico.nmSolicitado}" placeholder="Nome do Interessado">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-4 col-xs-12"  name="nmSolicitado" 
                                                                       placeholder="Nome do Interessado">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${ministPublico.nmSolicitado}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Endereço:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-8 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="dsEndereco" 
                                                                       value="${ministPublico.dsEndereco}" placeholder="Descrição do Endereço">         
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-8 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="dsEndereco" 
                                                                       placeholder="Descrição do Endereço">         
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${ministPublico.dsEndereco}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Informação DGPI:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nrInfoDgpi" 
                                                                       value="${ministPublico.nrInfoDgpi}" placeholder="Nº Informação DGPI">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nrInfoDgpi" 
                                                                       placeholder="Nº Informação DGPI">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${ministPublico.nrInfoDgpi}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>

                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Ofício de Resposta:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-3 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="cdOficioResposta" 
                                                                       value="${ministPublico.cdOficioResposta}" placeholder="Oficio de Resposta">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-3 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="cdOficioResposta" 
                                                                       placeholder="Oficio de Resposta">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${ministPublico.cdOficioResposta}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data da Resposta:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="date" id="form-field-1" class="col-sm-6 col-xs-12" name="dtResposta" 
                                                                       value="${ministPublico.dtResposta}" placeholder="YYYY/MM/DD">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="date" id="form-field-1" class="col-sm-6 col-xs-12" name="dtResposta" 
                                                                       placeholder="YYYY/MM/DD">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>                                                   
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${ministPublico.dtResposta}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>                                                                                   

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Observação:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="inline col-sm-9 col-xs-12" >
                                                                <textarea class="form-control col-xs-12" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;">${ministPublico.dsObservacao}</textarea>
                                                            </label> 
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-9 col-xs-12" >
                                                                <textarea class="form-control col-xs-12" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;"></textarea>
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise> 
                                                            <span class="inline col-sm-9 col-xs-12" >
                                                                ${ministPublico.dsObservacao}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>
                                            </div>
                                            <!--Inicico da tab-pane Anexer Documento -->
                                            <div id="anexar-doc" class="tab-pane <c:if test="${auto.pkAutoStage ==null}">disabled-li-menu</c:if>">
                                                    <h5 class="header smaller lbl"><strong>Anexar documento</strong></h5>
                                                    <div class="form-group">
                                                        <form action="ControllerServlet?acao=ArquivoUpload" enctype="multipart/form-data" method="POST" >
                                                            <input type="hidden" name="pkAutoStage" value="${auto.pkAutoStage}" />
                                                        <input type="hidden" name="tipoArquivo" value="planta" />
                                                        <input type="hidden" name="Origem" value="AutoCessao" />
                                                        <input type="hidden" name="nrVerArqPlanta" value="1" />
                                                        <input type="hidden" name="execucao" value="${execucao}" />
                                                        <input type="hidden" name="pgValidacao" value="${pgValidacao}" />
                                                        <c:set var="arPlanta"  value="${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'planta')}"  />
                                                        <input type="hidden" name="pkArquivo" value="<c:out value="${arPlanta.pkArquivo}" />" />   
                                                        <c:if test="${auto.nrVerArqAc=='1' && execucao=='insert' }">
                                                            <input type="hidden" name="finalizar" value="1" />
                                                        </c:if>


                                                        <label class="inline col-md-2 col-xs-12"><strong>Arquivo1:</strong></label>
                                                        <label class="col-md-1 col-xs-12">
                                                            <c:forEach var="ar" items="${Arquivo.listArquivo(auto.pkAutoStage, 'AutoCessao')}">
                                                                <c:if test="${ar.nmTipo == 'planta'}">
                                                                    <a href="<c:out value="${pageContext.servletContext.contextPath}" />/Arquivo/Planta/${ar.nmNomeArquivo}" target="_blank"><img src="img/img-planta.png" title="${ar.nmNome}" width="60%" height="60%"/></a>
                                                                    </c:if>    
                                                                </c:forEach>
                                                        </label>
                                                        <c:if test="${(sessionSgDivisao == 'DDPI' &&sessionSgSetor == 'SCL') && (execucao=='insert' || execucao=='edit')}">
                                                            <label class="inline col-md-3">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmNome" placeholder="Nome da Planta" required="required" >
                                                            </label>

                                                            <label class="inline col-md-3 col-xs-12">
                                                                <input type="file" id="id-input-file-2" name="UploadPlanta" required="required"><span class="ace-file-container" data-title="Choose"><span class="ace-file-name" data-title="No File ..."></span></span>
                                                            </label>
                                                            <label class="inline col-md-2 col-xs-12">
                                                                <c:set var="idPlanta"  value="${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'planta')}"  />  
                                                                <c:choose>
                                                                    <c:when test="${ idPlanta.pkArquivo != '0'}" >
                                                                        <button class="btn btn-yellow"  type="submit">
                                                                            <i class="ace-icon fa fa-save bigger-110"></i>
                                                                            Substituir
                                                                        </button>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <button class="btn btn-success"  type="submit">
                                                                            <i class="ace-icon fa fa-save bigger-110"></i>
                                                                            Salvar
                                                                        </button>
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </label> 
                                                        </c:if>    
                                                    </form>
                                                </div>

                                                <div class="space-2"></div>

                                                <div class="form-group">    
                                                    <form action="ControllerServlet?acao=ArquivoUpload" method="POST"  enctype="multipart/form-data">
                                                        <input type="hidden" name="pkAutoStage" value="${auto.pkAutoStage}" />
                                                        <input type="hidden" name="tipoArquivo" value="AC" />
                                                        <input type="hidden" name="Origem" value="AutoCessao" />
                                                        <input type="hidden" name="nrVerArqAc" value="1" />
                                                        <input type="hidden" name="execucao" value="${execucao}" />
                                                        <input type="hidden" name="pgValidacao" value="${pgValidacao}" />
                                                        <c:set var="arAC"  value="${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'AC')}"  />
                                                        <input type="hidden" name="pkArquivo" value="<c:out value="${arAC.pkArquivo}" />" />
                                                        <c:if test="${auto.nrVerArqPlanta=='1' && execucao=='insert'}">
                                                            <input type="hidden" name="finalizar" value="1" />
                                                        </c:if>
                                                        <label class="inline col-md-2 col-xs-12"><strong>Arquivo2:</strong></label>
                                                        <label class="col-md-1 col-xs-12">
                                                            <c:forEach var="ar" items="${Arquivo.listArquivo(auto.pkAutoStage, 'AutoCessao')}">
                                                                <c:if test="${ar.nmTipo == 'AC'}">
                                                                    <a href="<c:out value="${pageContext.servletContext.contextPath}" />/Arquivo/AC/${ar.nmNomeArquivo}" target="_blank"><img src="img/img-arquivo.png" title="${ar.nmNome}" width="50%" height="50%"/></a>

                                                                </c:if>
                                                            </c:forEach>
                                                        </label>
                                                        <c:if test="${(sessionSgDivisao == 'DDPI' && sessionSgSetor == 'SCL') && (execucao=='insert' || execucao=='edit')}">
                                                            <label class="inline col-md-3">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmNome" placeholder="Nome do Auto de Cessão" required="required" >
                                                            </label>
                                                            <label class="inline col-md-3 col-xs-12">
                                                                <input type="file" id="id-input-file-2" name="UploadAC" required="required" ><span class="ace-file-container" data-title="Choose"><span class="ace-file-name" data-title="No File ..."></span></span>
                                                            </label>

                                                            <label class="inline col-md-2 col-xs-12">
                                                                <c:set var="idAC"  value="${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'AC')}"  /> 
                                                                <c:choose>
                                                                    <c:when test="${idAC.pkArquivo != '0'}">
                                                                        <button class="btn btn-yellow"  type="submit">
                                                                            <i class="ace-icon fa fa-save bigger-110"></i>
                                                                            Substituir
                                                                        </button>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <button class="btn btn-success"  type="submit">
                                                                            <i class="ace-icon fa fa-save bigger-110"></i>
                                                                            Salvar
                                                                        </button>
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </label>
                                                        </c:if>    
                                                    </form>

                                                </div>

                                            </div>
                                            <!-- Botões-->
                                            <c:choose> 
                                                <c:when test="${execucao == 'insert'}">
                                                    <div class="form-actions center ">
                                                        <button class="btn btn-yellow" type="reset" onclick=" location.href = 'MinisterioPublico.jsp';">
                                                            <i class="ace-icon fa fa-undo bigger-110"></i>
                                                            Voltar
                                                        </button>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <div class="form-actions center ">
                                                            <button class="btn btn-yellow" type="reset" onclick=" location.href = 'ControllerServlet?acao=MinisterioPublicoLista';">
                                                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                Voltar
                                                            </button>
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <c:if test="${execucao != 'view'}" >
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
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>    
                </div>    

                <jsp:include page = "include/footer.jsp" />
                <jsp:include page = "javaScritp/carregado.html" />

            </div>
        </div><!--main container end-->
    </body>
</html>

