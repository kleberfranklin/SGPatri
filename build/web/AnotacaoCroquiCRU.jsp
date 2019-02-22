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
        <jsp:useBean id="Arquivo" class= "br.com.Modelo.ArquivoDAO" />

<!--Include ação ajax e javaScritp -->        
        <jsp:include page = "javaScritp/maskProcesso.html" />
        <jsp:include page = "javaScritp/somenteNum.html" />
        <jsp:include page = "javaScritp/ajaxEndereco.html" />


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
        <c:set var="msg" value="${param.msg}" />
        
           

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
                        <h2>Anotação Croqui : <c:out value="${msg}"/></h2>
                        <div class="space-14"></div>
                        <div class="form-horizontal">
                            <div class="tabbable">
                                <ul class="nav nav-tabs padding-0">
                                    <li class="in active">
                                        <a data-toggle="tab" href="#cad-croqui" aria-expanded="true">
                                            Anotação Croqui
                                            <c:choose>
                                                <c:when test="${anotCroqui.nrVerExpediente == '0'}">
                                                    <span class="badge badge-transparent" title="Pendente Validação"><i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i></span>
                                                    </c:when>
                                                    <c:otherwise>
                                                    <span class="badge badge-transparent" title="Validado"><i class="ace-icon fa fa-check-square-o green bigger-130"></i></span>
                                                </c:otherwise>    
                                            </c:choose>
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#doc-anexo" aria-expanded="true">
                                            Documentos Anexo
                                            <c:choose>
                                                <c:when test="${anotCroqui.nrVerArquivo == '0'}">
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
                                    <div id="cad-croqui" class="tab-pane in active">
                                        <form action="ControllerServlet?acao=AnotacaoCroquiUC" method="POST" >
                                            <input type="hidden" name="pkAnotacaoExpediente" value="${anotCroqui.pkAnotacaoExpediente}" />
                                            <input type="hidden" name="nmTipoExpediente" value="croqui" />
                                            <input type="hidden" name="execucao" value="${execucao}" />
                                            <input type="hidden" name="verExpediente" value="1" />
                                            <h4 class="header smaller lbl "><strong>Cadastro Croqui</strong></h4>

                                            <div class="form-group">
                                                <div class="inline col-sm-2 col-xs-12"
                                                     <span class="lbl"><strong>Coqui:</strong></span>
                                                </div>

                                                <label class="col-sm-3 col-xs-12">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" class="col-sm-6 col-xs-12" name="cdCroqui" value="${anotCroqui.cdCroqui}" placeholder="Código Croqui" required="required">
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" class="col-sm-6 col-xs-12" name="cdCroqui" placeholder="Código Croqui" required="required" >
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
                                                            <input type="text" class="col-sm-7 col-xs-12" name="cdArea" value="${anotCroqui.cdArea}" placeholder="Código da Área" maxlength="4" required="required">
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" class="col-sm-7 col-xs-12" name="cdArea" placeholder="Código da Área" required="required" maxlength="4" required="required" >
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
                                                            <input type="text" class="col-sm-8 col-xs-12" name="nrInformacaoDgpi" value="${anotCroqui.nrInformacaoDgpi}" placeholder="Nº Informação DGPI" required="required"  >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" class="col-sm-8 col-xs-12"  name="nrInformacaoDgpi"  placeholder="Nº Informação DGPI" required="required"  >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${anotCroqui.nrInformacaoDgpi}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>
                                            <div class="form-group">
                                                <label class="inline col-md-2 col-xs-12">
                                                    <span class="lbl"><strong>Nº Processo:</strong></span>
                                                </label>

                                                <c:choose>
                                                    <c:when test="${execucao == 'edit'}">
                                                        <label class="inline col-md-3 col-xs-12">
                                                            <input type="text"  class="col-xs-12 col-md-12" name="nrprocesso" id="nrprocesso" value="${anotCroqui.cdProcesso}" placeholder="nº do processo"  required="required"    >
                                                        </label>
                                                        <label class="col-xs-12 col-md-1">
                                                            <input name="tpProcesso" id="sei" value="SEI" type="radio" class="ace" onclick="maskProcesso();" <c:if test="${anotCroqui.nmTipoProcesso == 'SEI'}">checked="checked" </c:if> required="required">
                                                            <span class="lbl"><strong> SEI</strong></span>
                                                        </label>
                                                        <label class="col-xs-12 col-md-1">
                                                            <input name="tpProcesso" id="pa" value="PA" type="radio" class="ace" onclick="maskProcesso();" <c:if test="${anotCroqui.nmTipoProcesso == 'PA'}">checked="checked" </c:if> >
                                                            <span class="lbl"><strong> P.A.</strong></span>
                                                        </label>
                                                        <label class="col-xs-12 col-md-1">
                                                            <input name="tpProcesso" id="cid" value="CID" type="radio" class="ace" onclick="maskProcesso();" <c:if test="${anotCroqui.nmTipoProcesso == 'CID'}">checked="checked"</c:if> >
                                                            <span class="lbl"><strong> CID</strong></span>
                                                        </label>
                                                        <label class="col-xs-12 col-md-3">
                                                            <span id="msgProcesso"></span>
                                                        </label> 
                                                    </c:when>
                                                    <c:when test="${execucao == 'insert'}">
                                                        <label class="inline col-md-3 col-xs-12">
                                                            <input type="text"  class="col-xs-12 col-md-12" name="nrprocesso" id="nrprocesso"  placeholder="nº do processo" required="required"  onKeyPress="return somenteNum(event);"  >
                                                        </label>
                                                        <label class="col-xs-12 col-md-1">
                                                            <input name="tpProcesso" id="sei" value="SEI" type="radio" class="ace" onclick="maskProcesso();" required="required">
                                                            <span class="lbl"><strong> SEI</strong></span>
                                                        </label>
                                                        <label class="col-xs-12 col-md-1">
                                                            <input name="tpProcesso" id="pa" value="PA" type="radio" class="ace" onclick="maskProcesso();">
                                                            <span class="lbl"><strong> P.A.</strong></span>
                                                        </label>
                                                        <label class="col-xs-12 col-md-1">
                                                            <input name="tpProcesso" id="cid" value="CID" type="radio" class="ace" onclick="maskProcesso();">
                                                            <span class="lbl"><strong> CID</strong></span>
                                                        </label>
                                                        <label class="col-xs-12 col-md-3">
                                                            <span id="msgProcesso"></span>
                                                        </label>    
                                                    </c:when>
                                                    <c:otherwise>
                                                        <label class="inline col-md-10 col-xs-12">
                                                            <span class="lbl">${anotCroqui.nmTipoProcesso}: ${anotCroqui.cdProcesso}</span>
                                                        </label>
                                                    </c:otherwise>
                                                </c:choose>


                                            </div>

                                            <div class="space-1"></div>
                                            <div class="form-group">
                                                <div class="inline col-sm-2 col-xs-12">
                                                    <span class="lbl"><strong>Nº Tid: </strong></span>
                                                </div>
                                                <label class="col-sm-6 col-xs-12">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" class="col-sm-5 col-xs-12" name="cdTid" value="${anotCroqui.cdTid}" placeholder="Nº do Tid" required="required" onKeyPress="return somenteNum(event);"  >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" class="col-sm-5 col-xs-12"  name="cdTid"  placeholder="Nº do Tid" required="required"  onKeyPress="return somenteNum(event);" >
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
                                                            <input type="text" class="col-sm-8 col-xs-12"  name="cdExpediente" value="${anotCroqui.cdExpediente}" placeholder="Nº Expediente" required="required" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" class="col-sm-8 col-xs-12"  name="cdExpediente" placeholder="Nº Expediente" required="required" >
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
                                                            <input type="text" class="col-sm-10 col-xs-12"  name="nmInteressado" value="${anotCroqui.nmInteressado}" placeholder="Nome do Interessado" required="required" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" class="col-sm-10 col-xs-12"  name="nmInteressado" placeholder="Nome do Interessado" required="required" >
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
                                                            <textarea class="form-control" id="form-field-8" name="dsAssunto" placeholder="Descrição do assunto" style="margin: 0px 102.656px 0px 0px; width: 500px; height: 70px;">${anotCroqui.dsAssunto}</textarea>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <textarea class="form-control" id="form-field-8" name="dsAssunto" placeholder="Descrição do assunto" style="margin: 0px 102.656px 0px 0px; width: 500px; height: 70px;"></textarea>
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
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>CEP</strong></span>
                                                        </label>
                                                        <label class="inline col-md-10 col-xs-12" >
                                                            <input type="hidden" name="pkLogradouro" id="pkLogradouro" value="${lograPadrao.pkLogradouroPadrao}" required="required">
                                                            <input type="text" class="col-xs-12 col-md-2" name="nrcep" id="nrcep" value="${lograPadrao.nrCep}"  placeholder="nº do CEP" required="required">
                                                        </label>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Endereço:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-10 col-xs-12" >
                                                            <input type="text" class="col-xs-12 col-md-8" name="nmendereco" id="nmendereco" value="${lograPadrao.nmLogradouroCompleto}" onkeyup="pesquisaNomeLogradouro(this.value)" onblur="validarEndereco();" onclick="clickEndereco();" placeholder="nome do endereço" required="required" >
                                                            <div id="listaEndereco" style="padding-top:35px"></div>
                                                        </label>
                                                    </div>
                                                    <div class="space-1"></div>

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>número:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <input type="text" class="col-xs-12 col-md-12" name="nrNumeroEnd" id="nrnumeroend" value="${anotCroqui.nrEndereco}" placeholder="nº" required="required">
                                                        </label>
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Complemento:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-3 col-xs-12" >
                                                            <input type="text" class="col-xs-12 col-md-12" name="nmComplementoEnd" id="nmcomplementoend" value="${anotCroqui.nmComplementoEndereco}" placeholder="complemento do endereço" >
                                                        </label>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Bairro:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-10 col-xs-12" >
                                                            <input type="text" class="col-xs-12 col-md-5" name="nmbairro" id="nmbairro" value="${lograPadrao.nmBairro}" placeholder="nome do bairro" required="required">
                                                        </label>
                                                    </div>
                                                    <div class="space-1"></div>

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >  
                                                            <span class="lbl"><strong>Referência:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-8 col-xs-12" >
                                                            <input type="text" class="col-xs-12 col-md-12" name="nmReferenciaEnd" id="nmreferenciaend" value="${anotCroqui.nmReferenciaEndereco}" placeholder="referencia do endereço" >
                                                        </label>
                                                    </div>    
                                                </c:when>
                                                <c:when test="${execucao == 'insert'}">
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>CEP</strong></span>
                                                        </label>
                                                        <label class="inline col-md-10 col-xs-12" >
                                                            <input type="hidden" name="pkLogradouro" id="pkLogradouro"  required="required">
                                                            <input type="text" class="col-xs-12 col-md-2" name="nrcep" id="nrcep"   placeholder="nº do CEP" required="required">
                                                        </label>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Endereço:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-10 col-xs-12" >
                                                            <input type="text" class="col-xs-12 col-md-8" name="nmendereco" id="nmendereco" onkeyup="pesquisaNomeLogradouro(this.value)" placeholder="nome do endereço" required="required" >
                                                            <div id="listaEndereco" style="padding-top:35px"></div>
                                                        </label>
                                                    </div>
                                                    <div class="space-1"></div>

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>número:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <input type="text" class="col-xs-12 col-md-12" name="nrNumeroEnd" id="nrnumeroend" placeholder="nº" required="required">
                                                        </label>
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Complemento:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-3 col-xs-12" >
                                                            <input type="text" class="col-xs-12 col-md-12" name="nmComplementoEnd" id="nmcomplementoend" placeholder="complemento do endereço" >
                                                        </label>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Bairro:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-10 col-xs-12" >
                                                            <input type="text" class="col-xs-12 col-md-5" name="nmbairro" id="nmbairro" placeholder="nome do bairro" required="required">
                                                        </label>
                                                    </div>
                                                    <div class="space-1"></div>

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >  
                                                            <span class="lbl"><strong>Referência:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-8 col-xs-12" >
                                                            <input type="text" class="col-xs-12 col-md-12" name="nmReferenciaEnd" id="nmreferenciaend" placeholder="referencia do endereço" >
                                                        </label>
                                                    </div>    
                                                </c:when>
                                                <c:otherwise>
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>CEP</strong></span>
                                                        </label>
                                                        <label class="inline col-md-10 col-xs-12" >
                                                            <span class="lbl">${lograPadrao.nrCep}</span> 
                                                        </label>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Endereço:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-10 col-xs-12" >
                                                            <span class="lbl">${lograPadrao.nmLogradouroCompleto}</span> 
                                                        </label>
                                                    </div>
                                                    <div class="space-1"></div>

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>número:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl">${anotCroqui.nrEndereco}</span> 
                                                        </label>

                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Complemento:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-3 col-xs-12">    
                                                            <span class="lbl">${anotCroqui.nmComplementoEndereco}</span> 
                                                        </label>    
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Bairro:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-10 col-xs-12" >
                                                            <span class="lbl">${lograPadrao.nmBairro}</span> 
                                                        </label>    
                                                    </div>
                                                    <div class="space-1"></div>

                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >  
                                                            <span class="lbl"><strong>Referência:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-8 col-xs-12" >
                                                            <span class="lbl">${anotCroqui.nmReferenciaEndereco}</span> 
                                                        </label>

                                                    </div> 

                                                </c:otherwise>
                                            </c:choose>                


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
                                                                        <input id="id-button-borders"  type="checkbox" id="" name="nrAnotacao" value="1" class="ace ace-switch ace-switch-5"  >
                                                                        <span class="lbl middle"></span>
                                                                    </label>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <label class="pull-left inline">
                                                                        <input id="id-button-borders"  type="checkbox" id="" name="nrAnotacao" value="1" checked="" class="ace ace-switch ace-switch-5"  >
                                                                        <span class="lbl middle"></span>
                                                                    </label>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders"  type="checkbox" id="" name="nrAnotacao" value="1" class="ace ace-switch ace-switch-5"  >
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
                                                                        <input id="id-button-borders"  type="checkbox" id="" name="nrInformacao" value="1" class="ace ace-switch ace-switch-5"  >
                                                                        <span class="lbl middle"></span>
                                                                    </label>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <label class="pull-left inline">
                                                                        <input id="id-button-borders"  type="checkbox" id="" name="nrInformacao" value="1" checked="" class="ace ace-switch ace-switch-5"  >
                                                                        <span class="lbl middle"></span>
                                                                    </label>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders"  type="checkbox" id="" name="nrInformacao" value="1" class="ace ace-switch ace-switch-5"  >
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
                                                            <input type="text" id="form-field-1" class="col-sm-10 col-xs-12"  name="dsDespacho" 
                                                                   value="${anotCroqui.dsDespacho}" placeholder="Escrever o despacho" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-sm-10 col-xs-12"  name="dsDespacho" 
                                                                   placeholder="Escrever o despacho"  >
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
                                                            <input type="date" id="form-field-1" class="col-sm-4 col-xs-12"  name="dtPublicacao" 
                                                                   value="${dtAtuPubli}" placeholder="" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="date" id="form-field-1" class="col-sm-4 col-xs-12"  name="dtPublicacao" 
                                                                   placeholder="" >
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
                                                            <input type="date" id="form-field-1" class="col-sm-4 col-xs-12"  name="dtAnotacao" 
                                                                   value="${anotCroqui.dtAnotacao}" placeholder="Escrever o despacho" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="date" id="form-field-1" class="col-sm-4 col-xs-12"  name="dtAnotacao" 
                                                                   placeholder="Escrever o despacho" >
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
                                                            <input type="date" id="form-field-1" class="col-sm-10 col-xs-12"  name="dtData" 
                                                                   <c:set var="hoje" value="<%= new java.util.Date()%>" />
                                                                   <c:set var="dt" value = "${anotCroqui.dtData}" />
                                                                   <fmt:parseDate var="converteDT" value="${dt}" pattern="yyyy-MM-dd" />
                                                                   <c:choose>
                                                                       <c:when test="${converteDT gt hoje }">

                                                                       </c:when>
                                                                       <c:otherwise>
                                                                           value="${anotCroqui.dtData}" 
                                                                       </c:otherwise>
                                                                   </c:choose>
                                                                   required="required" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <c:set var = "now" value = "<%= new java.util.Date()%>" />
                                                            <fmt:formatDate var="hoje" pattern = "yyyy-MM-dd" value = "${now}" />
                                                            <input type="date" id="form-field-1" class="col-sm-10 col-xs-12"  name="dtData" value="${hoje}" readonly="readonly">
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">
                                                                <c:set var="hoje" value="<%= new java.util.Date()%>" />
                                                                <c:set var="dt" value = "${anotCroqui.dtData}" />
                                                                <fmt:parseDate var="converteDT" value="${dt}" pattern="yyyy-MM-dd" />
                                                                <fmt:formatDate var="dtAtu" value="${converteDT}" type= "date" />
                                                                <c:choose>
                                                                    <c:when test="${converteDT gt hoje }">
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <c:out value="${dtAtu}"/>   
                                                                    </c:otherwise>
                                                                </c:choose>
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
                                                            <input type="text" id="form-field-1" class="col-sm-8 col-xs-12"  name="nmAutor" 
                                                                   value="${anotCroqui.nmAutor}" placeholder="Nome " required="required" readonly="readonly" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-sm-8 col-xs-12"  name="nmAutor" value="<c:out value="${sessionNome}" />" 
                                                                   placeholder="Nome " required="required" readonly="readonly" >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${anotCroqui.nmAutor}</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>
                                            </div>    
                                <!-- Botões-->
                                            <div class="form-actions center ">
                                                <c:choose>
                                                    <c:when test="${execucao == 'insert' }">
                                                        <button class="btn btn-yellow" type="reset" onclick=" location.href = 'AnotacaoCroqui.jsp';">
                                                            <i class="ace-icon fa fa-undo bigger-110"></i>
                                                            Voltar
                                                        </button>
                                                    </c:when>
                                                    <c:when test="${pq == '' || pg == null }">
                                                        <button class="btn btn-yellow" type="reset" onclick=" location.href = 'ControllerServlet?acao=AnotacaoCroquiLista';">
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
                                        </form>
                                    </div>
                                
                                <!--Inicio da tab-pane Documento Anexo -->        
                                    <div id="doc-anexo" class="tab-pane <c:if test="${execucao=='insert'}" >disabled-li-menu</c:if> ">
                                        <div class="form-group">
                                         
                                            <form action="ControllerServlet?acao=ArquivoUpload" enctype="multipart/form-data" method="POST" >
                                                <h4 class="header smaller lbl "><strong>Documentos Anexo</strong></h4>   
                                                <input type="hidden" name="pkDocumento" value="${anotCroqui.pkAnotacaoExpediente}" />
                                                <input type="hidden" name="execucao" value="${execucao}" />
                                                <input type="hidden" name="tipoArquivo" value="Croqui" />
                                                <input type="hidden" name="Origem" value="AnotacaoExpediente" />
                                                
                                                
                                                <c:set var="arCroqui"  value="${Arquivo.pkArquivo(anotCroqui.pkAnotacaoExpediente,'AnotacaoExpediente','Croqui')}"  />
                                                    <input type="hidden" name="pkArquivo" value="<c:out value="${arCroqui.pkArquivo}" />" />   
                                                

                                                <label class="inline col-md-2 col-xs-12"><strong>Croqui:</strong></label>
                                                <label class="col-md-1 col-xs-12">
                                                    <c:forEach var="ar" items="${Arquivo.listArquivo(anotCroqui.pkAnotacaoExpediente, 'AnotacaoExpediente')}">
                                                        <c:if test="${ar.nmTipo == 'Croqui'}">
                                                            <a href="<c:out value="${pageContext.servletContext.contextPath}" />/Arquivo/Croqui/${ar.nmNomeArquivo}" target="_blank"><img src="img/img-planta.png" title="${ar.nmNome}" width="60%" height="60%"/></a>
                                                        </c:if>    
                                                    </c:forEach>
                                                </label>
                                                <c:if test="${(sessionSgDivisao == 'DIPI' &&sessionSgSetor == 'SIC')}">
                                                    <label class="inline col-md-3">
                                                        <input type="text" class="col-xs-12 col-md-12" name="nmNome" placeholder="Nome do Croqui" required="required" >
                                                    </label>

                                                    <label class="inline col-md-3 col-xs-12">
                                                        <input type="file"  id="id-input-file-2" name="UploadCroqui" required="required"><span class="ace-file-container" data-title="Choose"><span class="ace-file-name" data-title="No File ..."></span></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:set var="idCroqui"  value="${Arquivo.pkArquivo(anotCroqui.pkAnotacaoExpediente,'AnotacaoExpediente', 'Croqui')}"  />  
                                                        <c:choose>
                                                            <c:when test="${ idCroqui.pkArquivo != '0'}" >
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
                                </div>
                            </div>
                        </div>    
                    </div>    

                    <jsp:include page = "include/footer.jsp" />
                    <jsp:include page = "javaScritp/carregado.html" />

                </div>


                </body>
                </html>


