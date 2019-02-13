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
            <jsp:include page = "javaScritp/ajaxEndereco.html" />

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
                                                                       value="${anotCroqui.cdCroqui}" placeholder="Código Croqui" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                       placeholder="Código Croqui" required="required" >
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
                                                                       value="${anotCroqui.cdArea}" placeholder="Código Área" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdArea" 
                                                                       placeholder="Código Área" required="required" >
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
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12" name="nrInformacaoDgpi" 
                                                                       value="${anotCroqui.nrInformacaoDgpi}" placeholder="Nº Informação DGPI" required="required"  >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12"  name="nrInformacaoDgpi" 
                                                                       placeholder="Nº Informação DGPI" required="required"  >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.nrInformacaoDgpi}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                <div class="form-group">
                                                    <div class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Processo:</strong></span>
                                                    </div>

                                                    <label class="col-sm-6 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-5 col-xs-12" name="cdProcesso" 
                                                                       value="${anotCroqui.cdProcesso}" placeholder="Nº Processo" required="required"  >
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
                                                        <span class="lbl"><strong>Nº TID:</strong></span>
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
                                                                <span class="lbl"><strong>CEP</strong></span>
                                                            </label>
                                                            <label class="inline col-md-10 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-2" name="nrcep" id="nrcep"  placeholder="nº do CEP">
                                                            </label>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <span class="lbl"><strong>Endereço:</strong></span>
                                                            </label>
                                                            <label class="inline col-md-10 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-8" name="nmendereco" id="endereco" onkeyup="pesquisaNomeLogradouro(this.value)" placeholder="nome do endereço" required="required">
                                                                <div id="listaEndereco" style="padding-top:35px"></div>
                                                            </label>
                                                        </div>
                                                        <div class="space-1"></div>

                                                        <div class="form-group">
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <span class="lbl"><strong>número:</strong></span>
                                                            </label>
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrnumeroend" id="nrnumeroend" placeholder="nº">
                                                            </label>
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <span class="lbl"><strong>Complemento:</strong></span>
                                                            </label>
                                                            <label class="inline col-md-3 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcomplementoend" id="nmcomplementoend" placeholder="complemento do endereço" >
                                                            </label>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <span class="lbl"><strong>Bairro:</strong></span>
                                                            </label>
                                                            <label class="inline col-md-10 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-5" name="nmbairro" id="nmbairro" placeholder="nome do bairro">
                                                            </label>
                                                        </div>
                                                        <div class="space-1"></div>

                                                        <div class="form-group">
                                                            <label class="inline col-md-2 col-xs-12" >  
                                                                <span class="lbl"><strong>Referência:</strong></span>
                                                            </label>
                                                            <label class="inline col-md-8 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmreferenciaend" id="nmreferenciaend" placeholder="referencia do endereço" >
                                                            </label>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="inline col-md-2 col-xs-12" >  
                                                                <span class="lbl"><strong>Resultado Endereço</strong></span>
                                                            </label>
                                                            <label class="inline col-md-8 col-xs-12" >
                                                                <select class="col-md-12 col-xs-12" name="" id="resultEndereco" required="" >
                                                                </select>
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
                                                        <input type="date" id="form-field-1" class="col-sm-10 col-xs-12"  name="dtData" 
                                                               value="${anotCroqui.dtData}" required="required" >
                                                    </c:when>
                                                    <c:when test="${execucao == 'insert'}">
                                                        <input type="date" id="form-field-1" class="col-sm-10 col-xs-12"  name="dtData" 
                                                               value ="$" required="required" >
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


