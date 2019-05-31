<%-- 
    Document   : CadastroAreaPublicaCRU
    Created on : 22/05/2019, 13:39:22
    Author     : x369482
--%>
<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>

    <jsp:include page = "include/head.jsp" />
    <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico">
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin="">
    <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>

    <link rel='stylesheet' href='https://api.tiles.mapbox.com/mapbox-gl-js/v0.53.0/mapbox-gl.css'/>
    <script src='https://api.tiles.mapbox.com/mapbox-gl-js/v0.53.0/mapbox-gl.js'></script>

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
                    <li><i class="ace-icon fa fa-list"></i> Cadastro de Área Pública </li>
                </ul>
            </div>    
            <div class="page-content" >
                <div class="row">
                    <div class="col-xs-12">
                        <div class="col-sm-offset-1 col-sm-10">
                            <h2>Cadastro de Área Pública </h2>
                            <div class="space-14"></div>
                            <div class="form-horizontal">
                                <div class="tabbable">
                                    <ul class="nav nav-tabs padding-0">
                                        <li class="active">
                                            <a data-toggle="tab" href="#cad-ministPublico" aria-expanded="true">
                                                Cadastro de Área Pública 
                                            </a>
                                        </li>
                                    </ul>
                                    <div class="tab-content profile-edit-tab-content" >
                                        <!--Inicio da tab-pane -->
                                        <div id="cad-ministPublico" class="tab-pane in active">
                                            <form action="ControllerServlet?acao=CadastroAreaPublicaUC" method="POST" >

                                                <input type="hidden" name="pkCap" value="${cap.pkCap}" >
                                                <input type="hidden" name="execucao" value="${execucao}" >
                                                <h4 class="header smaller lbl "><strong>Cadastro de Área Pública</strong></h4>

                                                <div class="form-group">
                                                    <label class="inline col-xs-12 col-sm-2 col-md-2 col-lg-2">
                                                        <span class="lbl"><strong>Codigo do CAP:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-xs-12 col-sm-3 col-md-3 col-lg-3">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="cdCap" 
                                                                       value="${cap.cdCap}" placeholder="Codigo do CAP">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-xs-12 col-sm-3 col-md-3 col-lg-3">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12" name="cdCap" 
                                                                       placeholder="Codigo do CAP">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-xs-12 col-sm-3 col-md-3 col-lg-3" >
                                                                ${cap.cdCap}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Status do CAP:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-xs-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="stCap" 
                                                                       value="${cap.stCap}" placeholder="Status do CAP">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-xs-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="stCap" 
                                                                       placeholder="Status do CAP">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.stCap}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <label class="inline col-xs-12 col-sm-2 col-md-2 col-lg-2">
                                                        <span class="lbl"><strong>Observação do Status:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-12 col-xs-12" name="stObservacao" 
                                                                       value="${cap.stObservacao}" placeholder="Observação do Status">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-12 col-xs-12" name="stObservacao" 
                                                                       placeholder="Observação do Status">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>                                                   
                                                            <label class="inline col-sm-3 col-xs-12" >
                                                                ${cap.stObservacao}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-xs-2 col-xs-12">
                                                        <span class="lbl"><strong>Nome do Técnico:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nmTecnico" 
                                                                       value="${cap.nmTecnico}" placeholder="Nome do Técnico" >
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nmTecnico" 
                                                                       placeholder="Nome do Técnico">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.nmTecnico}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data criação:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="date" id="form-field-1" class=" col-sm-8 col-xs-12"  name="dtCriacao" 
                                                                       value="${cap.dtCriacao}" placeholder="">         
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtCriacao" 
                                                                       placeholder="">         
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.dtCriacao}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-xs-2 col-xs-12">
                                                        <span class="lbl"><strong>Documentos Digitalizados:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" class="col-sm-8 col-xs-12"  name="docDigitalizado" 
                                                                       value="${cap.docDigitalizado}" placeholder="Documentos Digitalizados">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" class="col-sm-8 col-xs-12"  name="docDigitalizado" 
                                                                       placeholder="Documentos Digitalizados">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-3 col-xs-12" >
                                                                ${cap.docDigitalizado}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Origem do CAP:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12"  name="nmOrigem" 
                                                                       value="${cap.nmOrigem}" placeholder="Origem do CAP">         
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12"  name="nmOrigem" 
                                                                       placeholder="Origem do CAP">         
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.nmOrigem}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Tamanho da Area Oficial:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nrAreaCap" 
                                                                       value="${cap.nrAreaCap}" placeholder="Area do CAP">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nrAreaCap" 
                                                                       placeholder="Area do CAP">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.nrAreaCap}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Área do Poligono:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-xs-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nrAreaPoligono" 
                                                                       value="${cap.nrAreaPoligono}" placeholder="Área do Poligono">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-xs-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nrAreaPoligono" 
                                                                       placeholder="Área do Poligono">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.nrAreaPoligono}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Edificação:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="edificacao" 
                                                                       value="${cap.edificacao}" placeholder="Edificação">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="edificacao" 
                                                                       placeholder="Edificação">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.edificacao}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Proprietario Antigo: </strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nmPropietarioAntigo" 
                                                                       value="${cap.nmPropietarioAntigo}" placeholder="Proprietario Antigo">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nmPropietarioAntigo" 
                                                                       placeholder="Proprietario Antigo">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.nmPropietarioAntigo}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Tipo de Registro:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="tpRegistro" 
                                                                       value="${cap.tpRegistro}" placeholder="Tipo de Registro">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="tpRegistro" 
                                                                       placeholder="Tipo de Registro">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.tpRegistro}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Numero do Registro:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nrRegistro" 
                                                                       value="${cap.nrRegistro}" placeholder="Numero do Registro">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="tpRegistro" 
                                                                       placeholder="Numero do Registro">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.nrRegistro}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº cri:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nrCri" 
                                                                       value="${cap.nrCri}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nrCri" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.nrCri}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Planta:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdPlanta" 
                                                                       value="${cap.cdPlanta}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdPlanta" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.cdPlanta}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº P.A.:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdProcesso" 
                                                                       value="${cap.cdProcesso}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdProcesso" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.cdProcesso}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº P.A. Origem:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdProcessoOrigem" 
                                                                       value="${cap.cdProcessoOrigem}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdProcessoOrigem" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.cdProcessoOrigem}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Dispositivo Legal:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="dsDispLegal" 
                                                                       value="${cap.dsDispLegal}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="dsDispLegal" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.dsDispLegal}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Croqui:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                       value="${cap.cdCroqui}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.cdCroqui}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Área:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdArea" 
                                                                       value="${cap.cdArea}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdArea" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.cdArea}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>
                                                <c:if test="${execucao != 'insert'}">
                                                    <div class=" form-group">
                                                        <label class="inline col-sm-2 col-xs-12">
                                                            <span class="lbl"><strong>Poligono:</strong></span>
                                                        </label>
                                                        <label class="hidden" name="geojson" value="${cap.geojson}"></label>
                                                        <div id="map" style="width: 600px; height: 300px; position: relative; "></div>
                                                    </div>

                                                </c:if>
                                                <div class="form-group ">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nome Parc..:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nmParc" 
                                                                       value="${cap.nmParc}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nmParc" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-3 col-xs-12" >
                                                                ${cap.nmParc}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>
                                                <div class="form-group ">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Destino or..:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="dsDestinoOr" 
                                                                       value="${cap.dsDestinoOr}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="dsDestinoOr" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-3 col-xs-12" >
                                                                ${cap.dsDestinoOr}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Processo Judicial:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdProcessoJudicial" 
                                                                       value="${cap.cdProcessoJudicial}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdProcessoJudicial" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.cdProcessoJudicial}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>


                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Tipo DP:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="tpDp" 
                                                                       value="${cap.tpDp}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="tpDp" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.tpDp}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nome me..:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nmMe" 
                                                                       value="${cap.nmMe}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nmMe" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.nmMe}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>CIP:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="dsCip" 
                                                                       value="${cap.dsCip}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="dsCip" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.dsCip}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data Imissao:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="date" id="form-field-1" class="col-sm-6 col-xs-12" name="dtImissao" 
                                                                       value="${cap.dtImissao}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="date" id="form-field-1" class="col-sm-6 col-xs-12" name="dtImissao" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.dtImissao}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Tipo Escritura:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="tpEscritura" 
                                                                       value="${cap.tpEscritura}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="tpEscritura" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.tpEscritura}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data Escritura:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="date" id="form-field-1" class="col-sm-6 col-xs-12" name="dtEscritura" 
                                                                       value="${cap.dtEscritura}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="date" id="form-field-1" class="col-sm-6 col-xs-12" name="dtEscritura" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                ${cap.dtEscritura}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Logradouro</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-7 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nmLogradouro" 
                                                                       value="${cap.nmLogradouro}" placeholder="">
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-4 col-xs-12" >
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="nmLogradouro" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="inline col-sm-8 col-xs-12" >
                                                                ${cap.nmLogradouro}
                                                            </label>
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
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;">${cap.dsObservacao}</textarea>
                                                            </label> 
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-9 col-xs-12" >
                                                                <textarea class="form-control col-xs-12" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;"></textarea>
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise> 
                                                            <label class="inline col-sm-9 col-xs-12" >
                                                                ${cap.dsObservacao}
                                                            </label>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <!-- Botões-->
                                                <c:choose> 
                                                    <c:when test="${execucao == 'insert'}">
                                                        <div class="form-actions center ">
                                                            <button class="btn btn-yellow" type="reset" onclick=" location.href = 'CadastroAreaPublicaLista.jsp';">
                                                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                Voltar
                                                            </button>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <div class="form-actions center ">
                                                                <button class="btn btn-yellow" type="reset" onclick=" location.href = 'ControllerServlet?acao=CadastroAreaPublicaLista&pg=0&pi=0&pf=0&nmOrigem=&cdCap=&stCap=';">
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
                                            </form>
                                        </div>                                        
                                    </div>

                                </div>
                            </div>
                        </div>    
                    </div>    
                </div>
            </div>

            <jsp:include page = "include/footer.jsp" />
            <jsp:include page = "javaScritp/carregado.html" />
            <jsp:include page = "include/LFteste.jsp" />


        </div>
    </div><!--main container end-->
</body>
</html>

