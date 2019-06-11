<%-- 
    Document   : AutoCessaoValidacao
    Created on : 08/11/2018, 18:58:46
    Author     : d732229
--%>


<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<<<<<<< HEAD
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.0/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
    <script src="https://unpkg.com/leaflet@1.5.0/dist/leaflet.js" integrity="sha512-3Wcxp7F9bV2pl+MBgrL6Pz7AJASLpemmQPIiPA0lDs3ImF0z4JuuMIBPeirLbgIuhfH2gJyGWZjvm6M+Zr7L6Q==" crossorigin=""></script>

=======
>>>>>>> 6bdfb37c59a8fbfac7d8177a454625dd10e4db48
    <jsp:include page = "include/head.jsp" />
    
    <body class="no-skin">
        <jsp:include page = "include/top.jsp"/>
        <div class="main-container ace-save-state" id="main-container">
            <jsp:include page = "include/nav.jsp" />
            <jsp:include page = "include/adicionarCampo.jsp" />
            <jsp:include page = "javaScritp/ajaxSelectSubFinalidade.html"/>
            <jsp:include page = "javaScritp/AutoCessaoValidacao.html" />
            <jsp:include page = "javaScritp/maskProcesso.html" />
            <jsp:include page = "javaScritp/somenteNum.html" />
            <jsp:include page = "javaScritp/alertEffect.html" />
<<<<<<< HEAD

=======
            
>>>>>>> 6bdfb37c59a8fbfac7d8177a454625dd10e4db48

            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />

            <c:set var="qAC" value="${param.qAC}" />
            <c:set var="qProcesso" value="${param.qProcesso}" />
            <c:set var="qVigor" value="${param.qVigor}" />
            <c:set var="qStatus" value="${param.qStatus}" />
            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="execucao" value="${param.execucao}" />
            
            <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css"
              integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ=="
              crossorigin=""/>
            
            <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js"
              integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og=="
              crossorigin=""></script>
              
            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Auto de Cessão </li>
                </ul>
            </div>    
            <div class="page-content" >
                <div id="" class="specific-block"></div>    
                <div class="row">
                    <div class="col-xs-12">

                        <div class="col-sm-offset-1 col-sm-10">
                            <c:if test="${msg=='true'}">
                                <div class="alert alert-${tipoAler}" id="alertEffect">
                                    <button type="button" class="close" data-dismiss="alert">
                                        <i class="ace-icon fa fa-times"></i>
                                    </button>
                                    <strong>
                                        <i class="ace-icon fa fa-times"></i>
                                        ${alert}
                                    </strong>
                                    ${txtAlert}
                                    <br>
                                </div>
                            </c:if>    

                            <h2>Auto de Cessão</h2>
                            <div class="space-14"></div>
                            <div class="form-horizontal">
                                <div class="tabbable">
                                    <ul class="nav nav-tabs padding-0">
                                        <li class="active">
                                            <a data-toggle="tab" href="#auto-cessao" aria-expanded="true">
                                                Auto de Cessão 
                                                <c:choose>
                                                    <c:when test="${auto.nrVerAc=='0'}">
                                                        <span class="badge badge-transparent" title="Pendente"><i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i></span>
                                                        </c:when>
                                                        <c:otherwise>
                                                        <span class="badge badge-transparent" title="ok"><i class="ace-icon fa fa-check-square-o green bigger-130"></i></span>
                                                        </c:otherwise>    
                                                    </c:choose>
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#disp-legal" aria-expanded="true">
                                                Dispositivos Legais
                                                <c:choose>
                                                    <c:when test="${auto.nrVerDispLegal == '0'}">
                                                        <span class="badge badge-transparent" title="Pendente"><i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i></span>
                                                        </c:when>
                                                        <c:otherwise>
                                                        <span class="badge badge-transparent" title="ok"><i class="ace-icon fa fa-check-square-o green bigger-130"></i></span>
                                                        </c:otherwise>    
                                                    </c:choose>
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#anexar-doc" aria-expanded="true">
                                                Anexar documentos
                                                <c:choose>
                                                    <c:when test="${auto.nrVerArqAc == '0' || auto.nrVerArqPlanta == '0'}">
                                                        <span class="badge badge-transparent" title="Pendente"><i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i></span>
                                                        </c:when>
                                                        <c:otherwise>
                                                        <span class="badge badge-transparent" title="ok"><i class="ace-icon fa fa-check-square-o green bigger-130"></i></span>
                                                        </c:otherwise>    
                                                    </c:choose>
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#poligono" aria-expanded="true">
                                                Polígono 
                                                <span class="badge badge-transparent" title="ok"><i class="ace-icon fa fa-check-square-o green bigger-130"></i></span>
                                            </a>
                                        </li>
                                        <c:if test="${auto.pkAutoCessao <= 4675 && execucao!='insert'}" >
                                            <li class="">
                                                <a data-toggle="tab" href="#validacao" aria-expanded="true">
                                                    Validação 
                                                    <c:choose>
                                                        <c:when test="${auto.nrVerValidacao == '0' || execucao=='insert'}">
                                                            <span class="badge badge-transparent" title="Pendente"><i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i></span>
                                                            </c:when>
                                                            <c:otherwise>
                                                            <span class="badge badge-transparent" title="ok"><i class="ace-icon fa fa-check-square-o green bigger-130"></i></span>
                                                            </c:otherwise>    
                                                        </c:choose>
                                                </a>
                                            </li>
                                        </c:if>
                                    </ul>
                                    <div class="tab-content profile-edit-tab-content">
                                        <div id="auto-cessao" class="tab-pane in active">
                                            <form action="ControllerServlet?acao=AutoCessoUC" method="POST" >
                                                <div class="space-4"></div>
                                                <div class="space-2"></div>
                                                <input type="hidden" name="pkAutoCessao" value="${auto.pkAutoCessao}" />
                                                <input type="hidden" name="nrVerAc" value="1" />
                                                <input type="hidden" name="nmStatus" value="${auto.nmStatus}"  />
                                                <input type="hidden" name="execucao" value="${execucao}" />
                                                <div class="form-group">
                                                    <div class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº AC:</strong></span>
                                                    </div>
                                                    <label class="inline col-md-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="codAC" value="${auto.nmCodAc}" placeholder="nº do AC" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="codAC" placeholder="nº do AC" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nmCodAc}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                    <label class="inline col-md-3 col-xs-12">
                                                        <span class="lbl">
                                                            <strong>Categoria</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="pkCatAutoCessao" required="required">
                                                                    <option value="${selCatAuto.pkCatAutoCessao}">${selCatAuto.nmCatAutoCessao}</option>
                                                                    <option></option>
                                                                    <c:forEach var="CatAuto" items="${CatAuto}">
                                                                        <c:if test="${CatAuto.nmCatAutoCessao != 'Informação não cadastrada'}" >
                                                                            <option value="${CatAuto.pkCatAutoCessao}" title="${CatAuto.nmCatAutoCessao}">${CatAuto.nmCatAutoCessao}</option>  
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select class="col-md-12 col-xs-12" name="pkCatAutoCessao" required="required">
                                                                    <option></option>
                                                                    <c:forEach var="CatAuto" items="${CatAuto}">
                                                                        <c:if test="${CatAuto.nmCatAutoCessao != 'Informação não cadastrada'}" >
                                                                            <option value="${CatAuto.pkCatAutoCessao}" title="${CatAuto.nmCatAutoCessao}">${CatAuto.nmCatAutoCessao}</option>  
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${selCatAuto.nmCatAutoCessao}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                <div class="form-group">
                                                    <div class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Data Lavratura:</strong></span>
                                                    </div>
                                                    <label class="inline col-md-3 col-xs-12 ">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <div class="input-group">
                                                                    <input class="form-control" name="dtlavratura" value="${auto.dtLavratura}" type="date" placeholder="dd/mm/aaaa" required="required">
                                                                </div>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <div class="input-group">
                                                                    <input class="form-control" name="dtlavratura" type="date" placeholder="dd/mm/aaaa" required="required">
                                                                </div>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <c:set var = "dt" value = "${auto.dtLavratura}" />
                                                                <fmt:parseDate value = "${dt}" var = "converteDT" pattern="yyyy-MM-dd" />
                                                                <fmt:formatDate value="${converteDT}" var="dtAtu"/>
                                                                <span class="lbl">${dtAtu}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                    <label class="inline col-md-3 col-xs-12" >
                                                        <span class="lbl"><strong>Nível Administração:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="pkNivelAdm" required="required">
                                                                    <option value="${selNvAdm.pkAdm}">${selNvAdm.nmAdm}</option>
                                                                    <option value=""></option>    
                                                                    <c:forEach var="nv" items="${NivelAdm}">
                                                                        <c:if test="${nv.nmAdm != 'Informação não cadastrada'}" >
                                                                            <option value="${nv.pkAdm}" title="${nv.nmAdm}">${nv.nmAdm}</option>  
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select> 
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select class="col-md-12 col-xs-12" name="pkNivelAdm" required="required">
                                                                    <option value=""></option>    
                                                                    <c:forEach var="nv" items="${NivelAdm}">
                                                                        <c:if test="${nv.nmAdm != 'Informação não cadastrada'}" >
                                                                            <option value="${nv.pkAdm}" title="${nv.nmAdm}">${nv.nmAdm}</option>  
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select> 
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${selNvAdm.nmAdm}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>

                                                </div>

                                                <div class="space-1"></div>    

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Tipo de Cessão:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-6 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="pkTpcessao" required="required">
                                                                    <option value="${selTpCessao.pkTipoAutoCessao}">${selTpCessao.nmTipoAutoCessao}</option>
                                                                    <option value=""></option>    
                                                                    <c:forEach var="cat" items="${TpCessao}">
                                                                        <option value="${cat.pkTipoAutoCessao}" title="${cat.nmTipoAutoCessao}">${cat.nmTipoAutoCessao}</option>  
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select class="col-md-12 col-xs-12" name="pkTpcessao" required="required">
                                                                    <option value=""></option>    
                                                                    <c:forEach var="cat" items="${TpCessao}">
                                                                        <option value="${cat.pkTipoAutoCessao}" title="${cat.nmTipoAutoCessao}">${cat.nmTipoAutoCessao}</option>  
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${selTpCessao.nmTipoAutoCessao}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                </div>  
                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Processo:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text"  class="col-xs-12 col-md-12" name="nrprocesso" id="nrprocesso" value="${auto.nmProcesso}" placeholder="nº do processo"  required="required"  onKeyPress="return somenteNum(event);"  >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text"  class="col-xs-12 col-md-12" name="nrprocesso" id="nrprocesso"  placeholder="nº do processo" required="required"  onKeyPress="return somenteNum(event);"  >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nmTipoProcesso} ${auto.nmProcesso}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                    <c:if test="${execucao == 'insert' || execucao == 'edit' }">
                                                        <label class="inline col-md-4 col-xs-12">
                                                            <div class="radio col-md-3">
                                                                <label>
                                                                    <input name="tpProcesso" <c:if test="${auto.nmTipoProcesso == 'SEI' && execucao == 'edit'}">checked="checked"</c:if>  id="sei" value="SEI" type="radio"  class="ace" onclick="maskProcesso();" required="required">
                                                                        <span class="lbl"><strong> SEI</strong></span>
                                                                    </label>
                                                                </div>
                                                                <div class="radio col-md-3">
                                                                    <label>
                                                                        <input name="tpProcesso" <c:if test="${auto.nmTipoProcesso == 'PA' && execucao == 'edit'}">checked="checked"</c:if>  id="pa" value="PA" type="radio" class="ace" onclick="maskProcesso();">
                                                                        <span class="lbl"><strong> P.A.</strong></span>
                                                                    </label>
                                                                </div>
                                                                <div class="radio col-md-3">
                                                                    <label>
                                                                        <input name="tpProcesso" <c:if test="${auto.nmTipoProcesso == 'TID' && execucao == 'edit'}">checked="checked"</c:if>  id="tid" value="TID" type="radio" class="ace" onclick="maskProcesso();">
                                                                        <span class="lbl"><strong> TID</strong></span>
                                                                    </label>
                                                                </div>
                                                                <div class="radio col-md-3">
                                                                    <label>
                                                                        <input name="tpProcesso" <c:if test="${auto.nmTipoProcesso == 'CID' && execucao == 'edit'}">checked="checked"</c:if>  id="cid" value="CID" type="radio" class="ace" onclick="maskProcesso();">
                                                                        <span class="lbl"><strong> CID</strong></span>
                                                                    </label>
                                                                </div>
                                                            </label>
                                                            <!--<lable id="msgProcesso"></lable>-->
                                                            &nbsp;<span id="msgProcesso"></span>
                                                    </c:if>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">

                                                </div>    

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl">
                                                            <strong>Cessionário/Cedente:</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-9 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcessionario" value="${auto.nmCessionario}" placeholder="nome do cessionário" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcessionario" placeholder="nome do cessionário" required="required" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nmCessionario}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                </div>

                                                <div class="space-2"></div>
                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Categoria Entidade:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-6 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="pkCatEntidade" required="required">
                                                                    <option value="${selCatEnt.pkCatEntidade}">${selCatEnt.nmCatEntidade}</option>
                                                                    <option value=""></option>    
                                                                    <c:forEach var="ent" items="${CatEnt}">
                                                                        <c:if test="${ent.nmCatEntidade != 'Informação não cadastrada'}" >
                                                                            <option value="${ent.pkCatEntidade}" title="${ent.nmCatEntidade}">${ent.nmCatEntidade}</option>  
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select class="col-md-12 col-xs-12" name="pkCatEntidade" required="required">
                                                                    <option value=""></option>    
                                                                    <c:forEach var="ent" items="${CatEnt}">
                                                                        <c:if test="${ent.nmCatEntidade != 'Informação não cadastrada'}" >
                                                                            <option value="${ent.pkCatEntidade}" title="${ent.nmCatEntidade}">${ent.nmCatEntidade}</option>  
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${selCatEnt.nmCatEntidade}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                </div>

                                                <div class="space-2"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Categoria da finalidade:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="pkCatFinalidade" id="pkCatFinalidade" onChange="pkCatFin(this)" required="required">
                                                                    <option value="${selCatFin.pkCatFinalidade}">${selCatFin.nmCatFinalidade}</option>
                                                                    <option></option>    
                                                                    <c:forEach var="catFin" items="${CatFin}">
                                                                        <c:if test="${catFin.nmCatFinalidade != 'Informação não cadastrada'}" >
                                                                            <option value="${catFin.pkCatFinalidade}" title="${catFin.nmCatFinalidade}">${catFin.nmCatFinalidade}</option>  
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select class="col-md-12 col-xs-12" name="pkCatFinalidade" id="pkCatFinalidade" onChange="pkCatFin(this)" required="required">
                                                                    <option></option>    
                                                                    <c:forEach var="catFin" items="${CatFin}">
                                                                        <c:if test="${catFin.nmCatFinalidade != 'Informação não cadastrada'}" >
                                                                            <option value="${catFin.pkCatFinalidade}" title="${catFin.nmCatFinalidade}">${catFin.nmCatFinalidade}</option>  
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${selCatFin.nmCatFinalidade}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Finalidade:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="pkSubCatFinalidade" id="selectSubFinalidade" required="required" >
                                                                    <option value="${selCatSubFin.pkCatSubFinalidade}" title="${selCatSubFin.nmCatSubFinalidade}">${selCatSubFin.sgCatSubFinalidade}</option>
                                                                </select>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select class="col-md-12 col-xs-12" name="pkSubCatFinalidade" id="selectSubFinalidade" required="required" >
                                                                </select>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${selCatSubFin.nmCatSubFinalidade}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                </div>

                                                <div class="space-1"></div>                           

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl">
                                                            <strong>Detalhamento da Finalidade</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-8 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <textarea class="form-control" id="form-field-8" name="dsFinalidade" placeholder="Descreve a finalidade ex: Instalação do 75º Distrito Policial-PM" style="margin: 0px 102.656px 0px 0px; width: 600px; height: 50px;" required="required">${auto.dsFinalidade}</textarea>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <textarea class="form-control" id="form-field-8" name="dsFinalidade" placeholder="Descreve a finalidade ex: Instalação do 75º Distrito Policial-PM" style="margin: 0px 102.656px 0px 0px; width: 600px; height: 50px;" required="required"></textarea>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.dsFinalidade}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Planta:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmplanta" value="${auto.nmPlanta}" placeholder="nº da planta" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmplanta" placeholder="nº da planta" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nmPlanta}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>

                                                    <label class="inline col-md-1 col-xs-12" >
                                                        <span class="lbl"><strong>Croqui:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcroqui" value="${auto.nmCroqui}" placeholder="nº croqui" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcroqui" placeholder="nº croqui" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nmCroqui}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>

                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Área do croqui:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrarea" value="${auto.nrArea}" placeholder="" required="required" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrarea" placeholder="" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nrArea}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Setor:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrsetor" value="${auto.nrSetor}" placeholder="nº do setor²" required="required"  >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrsetor" placeholder="nº do setor" required="required"  >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nrSetor}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>

                                                    <label class="inline col-md-1 col-xs-12" >
                                                        <span class="lbl"><strong>Quadra:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nrquadra" value="${auto.nrQuadra}" placeholder="nº da quadra" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nrquadra" placeholder="nº da quadra" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nrQuadra}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                    <label class="inline col-md-1 col-xs-12" >
                                                        <span class="lbl"><strong>Lote:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nrlote" value="${auto.nrLote}" placeholder="nº do lote" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nrlote" placeholder="nº do lote" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nrLote}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>CAP:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nmcap" value="${auto.nrCap}" placeholder="nº do cap" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nmcap" placeholder="nº do cap" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nrCap}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Metragem oficial:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nmMetragemOficial" value="${auto.nmMetragem}" placeholder="Área m²" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nmMetragemOficial" placeholder="Área m²" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nmMetragem}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Subprefituras: </strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="pkSubPref" id="" required="required">
                                                                    <option value="${selSubPref.pkSubPrefeitura}" title="${selSubPref.nmSubPrefeitura}">${selSubPref.nmSubPrefeitura}</option>
                                                                    <option></option>    
                                                                    <c:forEach var="subPref" items="${subPref}">
                                                                        <option value="${subPref.pkSubPrefeitura}" title="${subPref.nmSubPrefeitura}">${subPref.nmSubPrefeitura}</option>  
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select class="col-md-12 col-xs-12" name="pkSubPref" id="" required="required">
                                                                    <option></option>    
                                                                    <c:forEach var="subPref" items="${subPref}">
                                                                        <option value="${subPref.pkSubPrefeitura}" title="${subPref.nmSubPrefeitura}">${subPref.nmSubPrefeitura}</option>  
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${selSubPref.nmSubPrefeitura}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>

                                                    <!--<label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>CEP:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" placeholder="00000-000" name="" >
                                                    </label>-->
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Tipo endereço:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="tipoEndereco" title="Rua / Avenida / Praça / etc" required="required">
                                                                    <option value="${auto.nmTipoEndereco}">${auto.nmTipoEndereco}</option>
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
                                                                <span class="lbl">${auto.nmTipoEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Título do endereço:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="tituloEndereco" title="Capitão / Doutor / Dom / etc">
                                                                    <option>${auto.nmTituloEndereco}</option>
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
                                                                <span class="lbl">${auto.nmTituloEndereco}</span> 
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
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmendereco" value="${auto.nmEndereco}"  placeholder="nome do endereço" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmendereco" placeholder="nome do endereço" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nmEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                    <label class="inline col-md-1 col-xs-12" >
                                                        <span class="lbl"><strong>número:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrnumeroend" value="${auto.nrEndereco}" placeholder="nº">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrnumeroend" placeholder="nº">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nrEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Complemento:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-3 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcomplementoend" value="${auto.nmComplementoEndereco}" placeholder="complemento do endereço" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcomplementoend" placeholder="complemento do endereço" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nmComplementoEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>

                                                </div>
                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >  
                                                        <span class="lbl"><strong>Referência:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-8 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmreferenciaend" value="${auto.nmReferencialEndereco}" placeholder="referencia do endereço" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmreferenciaend" placeholder="referencia do endereço" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nmReferencialEndereco}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Prazo:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <div class="checkbox">
                                                                    <c:choose>
                                                                        <c:when test="${auto.nrPrazo == 'Indeterminado'}">
                                                                            <label>
                                                                                <input class="ace ace-switch ace-switch-6" type="checkbox" name="nmprazo"  checked value="Indeterminado">
                                                                                <span class="lbl"> <label>Indeterminado</label></span>
                                                                            </label>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <label>
                                                                                <input class="ace ace-switch ace-switch-6" type="checkbox" name="nmprazo"  value="Indeterminado">
                                                                                <span class="lbl"> <label>Indeterminado</label></span>
                                                                            </label>
                                                                        </c:otherwise>
                                                                    </c:choose>
                                                                </div>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <div class="checkbox">
                                                                    <c:choose>
                                                                        <c:when test="${auto.nrPrazo == 'Indeterminado'}">
                                                                            <label>
                                                                                <input class="ace ace-switch ace-switch-6" type="checkbox" name="nmprazo"  checked value="Indeterminado">
                                                                                <span class="lbl"> <label>Indeterminado</label></span>
                                                                            </label>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <label>
                                                                                <input class="ace ace-switch ace-switch-6" type="checkbox" name="nmprazo"  value="Indeterminado">
                                                                                <span class="lbl"> <label>Indeterminado</label></span>
                                                                            </label>
                                                                        </c:otherwise>
                                                                    </c:choose>
                                                                </div>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.nrPrazo} </span>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>




                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="inline col-md-2 col-xs-12">
                                                                <input type="number" min="0" id="form-field-1" class="col-xs-12 col-md-12" name="nrprazoAno" value="${auto.nrPrazoAno}" placeholder="" onKeyPress="return somenteNum(event);">
                                                            </label>    
                                                            <label class="inline col-md-1 col-xs-12" >
                                                                <span class="lbl"><strong>Ano(s)</strong></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-md-2 col-xs-12">
                                                                <input type="number" min="0" id="form-field-1" class="col-xs-12 col-md-12" name="nrprazoAno" placeholder="" onKeyPress="return somenteNum(event);" >
                                                            </label>
                                                            <label class="inline col-md-1 col-xs-12" >
                                                                <span class="lbl"><strong>Ano(s)</strong></span>
                                                            </label>
                                                        </c:when>
                                                    </c:choose>


                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="inline col-md-1 col-xs-12">
                                                                <input type="number" min="0" max="12" id="form-field-1" class="col-xs-12 col-md-12" name="nrprazoMes" value="${auto.nrPrazoMes}" placeholder="" onKeyPress="return somenteNum(event);">
                                                            </label>
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <span class="lbl"><strong>Mese(s)</strong></span>
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-md-1 col-xs-12">
                                                                <input type="number" min="0" max="12" id="form-field-1" class="col-xs-12 col-md-12" name="nrprazoMes" placeholder="" onKeyPress="return somenteNum(event);" >
                                                            </label>
                                                            <label class="inline col-md-1 col-xs-12" >
                                                                <span class="lbl"><strong>Mese(s)</strong></span>
                                                            </label>
                                                        </c:when>
                                                    </c:choose>
                                                </div>
                                                <c:if test="${execucao !='edit' && execucao !='insert'}">
                                                    <div class="form-group">
                                                        </label>
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Vencimento:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-3 col-xs-12">
                                                            <span>${auto.dtVencimento}</span>
                                                        </label>
                                                    </div>
                                                </c:if>    
                                                <div class="space-2"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Em vigor:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <c:choose>
                                                                <c:when test="${auto.nrVigor != 'true'}">
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
                                                                <input id="id-button-borders"  type="checkbox" id="" name="nrvigor" value="true" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <c:choose>
                                                                <c:when test="${'true' == auto.nrVigor}">
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



                                                </div>
                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Categoria da contrapartida:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select class="col-md-12 col-xs-12" name="pkCatContrapartida">
                                                                    <option value="${selCatContra.pkCatContrapartida}" title="${selCatContra.nmCatContrapartida}">${selCatContra.nmCatContrapartida}</option>
                                                                    <option></option>
                                                                    <c:forEach var="catContra" items="${CatContra}">
                                                                        <option value="${catContra.pkCatContrapartida}" title="${catContra.nmCatContrapartida}">${catContra.nmCatContrapartida}</option>  
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select class="col-md-12 col-xs-12" name="pkCatContrapartida" required="required">
                                                                    <option></option>
                                                                    <c:forEach var="catContra" items="${CatContra}">
                                                                        <option value="${catContra.pkCatContrapartida}" title="${catContra.nmCatContrapartida}">${catContra.nmCatContrapartida}</option>  
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${selCatContra.nmCatContrapartida}</span> 
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>
                                                </div>
                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Contrapartida <font size="-2"> (Descrição Simplificada):</font></strong></span>
                                                    </label>
                                                    <label class="inline col-md-9 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <textarea class="form-control" id="form-field-8" name="dsContrapartida" placeholder="" style="margin: 0px 102.656px 0px 0px; width: 600px; height: 90px;">${auto.dsContrapartida}</textarea>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <textarea class="form-control" id="form-field-8" name="dsContrapartida" placeholder="" style="margin: 0px 102.656px 0px 0px; width: 600px; height: 90px;"></textarea>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.dsContrapartida}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>
                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Observação:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-10 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <textarea class="form-control" id="form-field-8" name="dsObservacao" placeholder="" style="margin: 0px 102.656px 0px 0px; width: 600px; height: 90px;">${auto.dsObservacao}</textarea>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <textarea class="form-control" id="form-field-8" name="dsObservacao" placeholder="" style="margin: 0px 102.656px 0px 0px; width: 600px; height: 90px;"></textarea>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${auto.dsObservacao}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-2"></div>

                                                <div class="form-actions center">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <button class="btn btn-yellow other-block preview" type="reset" onclick=" location.href = 'AutoCessao.jsp';">
                                                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                Voltar
                                                            </button>
                                                        </c:when>
                                                        <c:when test="${null == pg || pg == ''}">
                                                            <button class="btn btn-yellow other-block preview" type="reset" onclick=" location.href = 'ControllerServlet?acao=AutoCessaoLista';">
                                                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                Voltar
                                                            </button>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <button class="btn btn-yellow other-block preview" type="reset" onclick=" location.href = 'ControllerServlet?acao=AutoCessaoLista&pkAutoCessao=${auto.pkAutoCessao}&pg=${pg}&pi=${pi}&pf=${pf}&qAC=${qAC}&qProcesso=${qProcesso}&qCessionario=${qCessionario}&qEndereco=${qEndereco}&qCroqui=${qCroqui}&qVigor=${qVigor}&execucao=${execucao}';">
                                                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                Voltar
                                                            </button>
                                                        </c:otherwise>
                                                    </c:choose>
                                                    <c:if test="${execucao=='insert' || execucao=='edit' && (sessionSgDivisao == 'DDPI' && sessionSgSetor == 'SCL')}">
                                                        <button class="btn btn-success" type="submit">
                                                            <i class="ace-icon fa fa-save bigger-110"></i>
                                                            Salvar
                                                        </button>
                                                    </c:if>  
                                                </div>

                                            </form>
                                        </div>

                                        <!--Inicio da tab-pane Dispositvo Legal-->              
                                        <div id="disp-legal" class="tab-pane 
                                             <c:choose>
                                                 <c:when test="${auto.pkAutoCessao == null || auto.pkAutoCessao == '' }"> 
                                                     disabled-li-menu
                                                 </c:when>
                                                 <c:otherwise>                                
                                                 </c:otherwise>    
                                             </c:choose>   
                                             ">        
                                            <h5 class="header smaller lbl "><strong>Dispositivos Legais</strong></h5>
                                            <!--Lista dos Dispositivo no banco-->        
                                            <c:forEach var="di" items="${Disp}">
                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl">
                                                            <strong>Tipo de Dispositivo:</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-3 col-xs-12">
                                                        <span class="lbl">${di.tipoDispositivo.nmTipoDispLegal}</span>
                                                    </label>
                                                    <label class="inline col-md-1 col-xs-12" >
                                                        <span class="lbl"><strong>Número:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl">${di.nrDisp}</span>
                                                    </label>
                                                    <label class="inline col-md-1 col-xs-12" >
                                                        <span class="lbl"><strong>Data:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl">
                                                            <c:set var = "dtDisp" value = "${di.dtDisp}" />
                                                            <fmt:parseDate value = "${dtDisp}" var = "converteDTDisp" pattern="yyyy-MM-dd" />
                                                            <fmt:formatDate value="${converteDTDisp}" var="dtAtuDisp"/>
                                                            <c:out value="${dtAtuDisp}"/>
                                                        </span>
                                                    </label>
                                                    <c:if test="${execucao=='insert' || execucao=='edit' && (sessionSgDivisao == 'DDPI' && sessionSgSetor == 'SCL')}">
                                                        <a href="ControllerServlet?acao=DispositivoLegalDelete&pkDispLegal=${di.pkDisplegal}&pkAutoCessao=${auto.pkAutoCessao}&execucao=${execucao}"  class="red remove_field" title="Excluir Dispositivo"><i class="ace-icon glyphicon glyphicon-trash bigger-130"></i></a>
                                                        </c:if>
                                                </div>
                                            </c:forEach>
                                            <hr>
                                            <c:if test="${(sessionSgDivisao == 'DDPI' && sessionSgSetor == 'SCL') && (execucao=='insert' || execucao=='edit')}">
                                                <form action="ControllerServlet?acao=AutoCessaoDispLegalUC" method="POST" >
                                                    <input type="hidden" name="pkAutoCessao" value="${auto.pkAutoCessao}" />
                                                    <input type="hidden" name="nrVerDisplegal" value="1" />
                                                    <input type="hidden" name="execucao" value="${execucao}" />
                                                    <div class="input_fields_wrap">
                                                        <div class="form-group">
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <span class="lbl">
                                                                    <strong>Tipo de Dispositivo:</strong>
                                                                </span>
                                                            </label>
                                                            <label class="inline col-md-3 col-xs-12">
                                                                <select class="col-md-12 col-xs-12" name="tpDispositivo" required="required">
                                                                    <option></option>
                                                                    <c:forEach var="tpdis" items="${TpDis}">
                                                                        <c:if test="${tpdis.nmTipoDispLegal != 'Informacao nao cadastrada' }">
                                                                            <option value="${tpdis.pkTipoDispLegal}" title="${tpdis.nmTipoDispLegal}">${tpdis.nmTipoDispLegal}</option>  
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </label>
                                                            <label class="inline col-md-1 col-xs-12" >
                                                                <span class="lbl"><strong>Número:</strong></span>
                                                            </label>
                                                            <label class="inline col-md-2 col-xs-12">
                                                                <input type="text" class="col-xs-12 col-md-12" placeholder="numero" name="numDispositivo" >
                                                            </label>

                                                            <label class="inline col-md-1 col-xs-12" >
                                                                <span class="lbl"><strong>Data:</strong></span>
                                                            </label>
                                                            <label class="inline col-md-2 col-xs-12">
                                                                <div class="input-group">
                                                                    <input class="col-xs-10 col-md-10" type="date" name="dtDispositivo"  placeholder="dd/mm/aaaa" data-date-format="dd/mm/yyyy">
                                                                </div>
                                                            </label>
                                                            <a href="#" class="add_field_button" title="Adicionar campo" title="Adicionar campos"><span class="label label-success arrowed"><i class=" glyphicon glyphicon-plus-sign"></i></span></a>    
                                                        </div>
                                                    </div>

                                                    <div class="space-2"></div>
                                                    <div class="form-actions center">
                                                        <button class="btn btn-success" type="submit">
                                                            <i class="ace-icon fa fa-save bigger-110"></i>
                                                            Salvar
                                                        </button>
                                                    </div>
                                                </form>
                                            </c:if>
                                        </div>


                                        <!--Inicico da tab-pane Anexer Documento -->
                                        <div id="anexar-doc" class="tab-pane 
                                             <c:choose>
                                                 <c:when test="${auto.pkAutoCessao == null || auto.pkAutoCessao == '' }"> 
                                                     disabled-li-menu
                                                 </c:when>
                                                 <c:otherwise>                                
                                                 </c:otherwise>    
                                             </c:choose> 
                                             ">
                                            <h5 class="header smaller lbl"><strong>Anexar documentos</strong></h5>
                                            <c:if test="${(sessionSgDivisao == 'DDPI' &&sessionSgSetor == 'SCL') && (execucao=='insert' || execucao=='edit')}">
                                                <form action="ControllerServlet?acao=AutoCessaoUploadArquivo" enctype="multipart/form-data" method="POST" >
                                                    <div class="form-group">
                                                        <input type="hidden" name="pkAutoCessao" value="${auto.pkAutoCessao}" />
                                                        <input type="hidden" name="nrVerArqPlanta" value="1" />
                                                        <input type="hidden" name="execucao" value="${execucao}" />
                                                        <label class="inline col-md-2 col-xs-12"><strong>Tipo de Arquivo:</strong></label>
                                                        <label class="inline col-md-2 col-xs-12">
                                                            <select class=" col-xs-12 col-sm-12" name="tipoArquivo" required="required">
                                                                <option></option>
                                                                <option value="Planta">Planta</option>
                                                                <option value="AC">AC</option>
                                                            </select>
                                                        </label>
                                                        <label class="inline col-md-2 col-xs-12">
                                                            <input type="text" class="col-xs-12 col-md-12" name="nmNomeclatura" placeholder="Nome do arquivo" required="required" >
                                                        </label>

                                                        <label class="inline col-md-4 col-xs-12">
                                                            <input type="file" id="id-input-file-2" name="ArquivoUpload" required="required"><span class="ace-file-container" data-title="Choose"><span class="ace-file-name" data-title="No File ..."></span></span>
                                                        </label>

                                                        <label class="inline col-md-1 col-xs-12">
                                                            <button class="btn btn-success"  type="submit">
                                                                <i class="ace-icon fa fa-save bigger-110"></i>
                                                                Salvar
                                                            </button>
                                                        </label>
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="checkbox inline col-md-offset-2">
                                                            <label>
                                                                <input name="retiRatificacao" value="1" class="ace ace-checkbox-2"  type="checkbox">
                                                                <span class="lbl"> Reti-ratificação</span>
                                                            </label>
                                                        </div>
                                                    </div>
                                                </form>
                                            </c:if>
                                            <div class="hr hr-18 dotted hr-double"></div>
                                            <div class="form-group">
                                                <label class="col-md-12 col-xs-12">
                                                    <c:forEach var="ar" items="${Arquivo}">
                                                        <form action="ControllerServlet?acao=AutoCessaoDeleteArquivo" method="POST">
                                                            <input type="hidden" name="pkArquivo" value="${ar.pkArquivo}" />
                                                            <input type="hidden" name="pkAutoCessao" value="${ar.fkAutocessao}" />
                                                            <input type="hidden" name="diretorio" value="${ar.nmDiretorio}" />
                                                            <input type="hidden" name="nmTipo" value="${ar.nmTipo}" />
                                                            <input type="hidden" name="execucao" value="${execucao}" />
                                                            <label class="inline col-md-2 col-xs-12"><strong>${ar.nmTipo} <c:if test="${ar.nrRetiRatificacao == 1}">Reti-rati</c:if>:</strong></label>
                                                                <div class="inline col-md-2 col-xs-12">
                                                                    <div class="inline col-md-8 col-xs-12">
                                                                        <a href="/SGPatri/${ar.nmTipo}/${ar.nmArquivo}" target="_blank"><img class="img-thumbnail" src="img/${ar.nmTipo}.png" title="${ar.nmNomeclatura}" width="100%" height="100%"/></a>
                                                                    </div>
                                                                <c:if test="${execucao=='insert' || execucao=='edit' && (sessionSgDivisao == 'DDPI' && sessionSgSetor == 'SCL')}">
                                                                    <div class="inline col-md-1 col-md-12">
                                                                        <button class="btn btn-danger btn-xs">
                                                                            <i class="ace-icon fa fa-trash-o bigger-130 icon-only"></i>
                                                                        </button>
                                                                    </div>
                                                                </c:if>
                                                                </div>
                                                        </form>
                                                    </c:forEach>
                                                </label>            
                                            </div>
                                        </div>

<<<<<<< HEAD

=======
                                        <!--Inicico da tab-pane Poígio -->
                                        <div id="poligono" class="tab-pane " >
                                            <h5 class="header smaller lbl"><strong>POLÍGONO</strong></h5>
                                            <label >
                                                
                                            </labe>
                                        </div>
>>>>>>> 6bdfb37c59a8fbfac7d8177a454625dd10e4db48

                                        <!-- Inicio do formulario Validação -->                             
                                        <div id="validacao" class="tab-pane 
                                             <c:choose>
                                                 <c:when test="${auto.pkAutoCessao == null || auto.pkAutoCessao == '' }"> 
                                                     disabled-li-menu
                                                 </c:when>
                                                 <c:otherwise>                                
                                                 </c:otherwise>    
                                             </c:choose>    
                                             ">
                                            <h5 class="header smaller lbl"><strong>VALIAÇÃO</strong></h5>
                                            <c:if test="${sessionSgDivisao == 'DDPI' && sessionSgSetor == 'SCL' || sessionPerfil == 'Administrador'}">
                                                <c:if test="${auto.nmStatus != 'Validado' }">
                                                    <form action="ControllerServlet?acao=ValidacaoUC" method="POST">
                                                        <input type="hidden" name="pkAutoCessao" value="${auto.pkAutoCessao}" />
                                                        <div class="form-group">
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <span class="lbl">
                                                                    <strong>Situação:</strong>
                                                                </span>
                                                            </label>
                                                            <label class="inline col-md-10 col-xs-12">
                                                                <select class="col-md-3 col-xs-12" name="nmstatus" required="required" onChange="AutoCessaoValidacao(this)">
                                                                    <option></option>
                                                                    <option value="Corrigir">Corrigir</option>
                                                                    <option value="Validado">Validado</option>
                                                                </select>
                                                            </label>
                                                        </div> 
                                                        <div class="form-group">
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <span class="lbl"><strong>Tipo de Problema:</strong></span>
                                                            </label>
                                                            <label class="inline col-md-4 col-xs-12">
                                                                <select class="col-md-10 col-xs-12" name="nmProblema" id="Problema" >
                                                                    <option></option>
                                                                    <option>Documento do Auto Cessão</option>
                                                                    <option>Planta</option>
                                                                    <option>Georreferenciamento</option>
                                                                    <option>Dificuldade na localização</option>
                                                                </select>
                                                            </label>

                                                            <label class="inline col-md-3 col-xs-12" >
                                                                <span class="lbl"><strong>Divisão responsável:</strong></span>
                                                            </label>

                                                            <label class="inline col-md-3 col-xs-12">
                                                                <select class="" name="fkDivisao" id="Divisao">
                                                                    <option></option>
                                                                    <c:forEach var='d' items="${Divisao}">
                                                                        <c:if test="${d.sgDivisao != 'VISITANTE'}">
                                                                            <option value="${d.pkDivisao}">${d.sgDivisao}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </label>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <span class="lbl"><strong>Tarefa p/ solução:</strong></span>
                                                            </label>
                                                            <label class="inline col-md-4 col-xs-12">
                                                                <select class="col-md-10 col-xs-12" name="nmTarefa" id="Tarefa">
                                                                    <option></option>
                                                                    <option>Refazer polígono</option>
                                                                    <option>Refazer planta</option>
                                                                    <option>Chamar processo</option>
                                                                    <option>Vistória no local</option>
                                                                </select>
                                                            </label>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="inline col-md-2 col-xs-12" >
                                                                <span class="lbl"><strong>Notas:</strong></span>
                                                            </label>
                                                            <label class="inline col-md-10 col-xs-12">
                                                                <textarea id="form-field-11" class="autosize-transition form-control" name="dsObsservacao" style="margin: 0px 102.656px 0px 0px; width: 600px; height: 50px;"></textarea>
                                                            </label> 
                                                        </div>
                                                        <div class="space-2"></div>
                                                        <div class="form-actions center">
                                                            <c:choose>
                                                                <c:when test="${execucao == 'insert'}">
                                                                    <button class="btn btn-yellow other-block preview" type="reset" onclick=" location.href = 'AutoCessao.jsp';">
                                                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                        Voltar
                                                                    </button>
                                                                </c:when>
                                                                <c:when test="${null == pg || pg == ''}">
                                                                    <button class="btn btn-yellow other-block preview" type="reset" onclick=" location.href = 'ControllerServlet?acao=AutoCessaoLista';">
                                                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                        Voltar
                                                                    </button>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <button class="btn btn-yellow other-block preview" type="reset" onclick=" location.href = 'ControllerServlet?acao=AutoCessaoLista&pkAutoCessao=${auto.pkAutoCessao}&pg=${pg}&pi=${pi}&pf=${pf}&qAC=${qAC}&qProcesso=${qProcesso}&qCessionario=${qCessionario}&qEndereco=${qEndereco}&qCroqui=${qCroqui}&qVigor=${qVigor}&execucao=${execucao}';">
                                                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                        Voltar
                                                                    </button>
                                                                </c:otherwise>
                                                            </c:choose>
                                                            <button class="btn btn-success" type="submit">
                                                                <i class="ace-icon fa fa-save bigger-110"></i>
                                                                Concluir 
                                                            </button>
                                                        </div>
                                                    </form>
                                                </c:if>
                                            </c:if>
                                            <c:forEach var="va" items="${Validacao}">
                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Situação:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-10 col-xs-12">
                                                        <span class="lbl">${va.nmStatus}</span>
                                                    </label>
                                                </div> 
                                                <c:if test="${va.nmStatus !='Validado'}">
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Tipo de Problema:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-4 col-xs-12">
                                                            <span class="lbl">${va.nmProblema}</span>
                                                        </label>

                                                        <label class="inline col-md-3 col-xs-12" >
                                                            <span class="lbl"><strong>Divisão responsável:</strong></span>
                                                        </label>

                                                        <label class="inline col-md-3 col-xs-12">
                                                            <span class="lbl"></span>
                                                        </label>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="inline col-md-2 col-xs-12" >
                                                            <span class="lbl"><strong>Tarefa p/ solução:</strong></span>
                                                        </label>
                                                        <label class="inline col-md-4 col-xs-12">
                                                            <span class="lbl">${va.nmTarefa}</span>
                                                        </label>
                                                    </div>
                                                </c:if>
                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Notas:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-10 col-xs-12">
                                                        <span class="lbl">${va.dsObsservacao}</span>
                                                    </label> 
                                                </div>
                                                <div class="form-group">
                                                    <c:set var = "dt" value = "${va.dthrAtualizacao}" />
                                                    <fmt:parseDate var="converteData" value = "${dt}" pattern = "yyyy-MM-dd HH:mm:ss" />
                                                    <fmt:formatDate value="${converteData}" var="dtHrAtualizacao" pattern="dd/MM/yyyy - HH:mm:ss" />
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Realizado por:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <span class="lbl">${selUsuario.nmNome}</span>
                                                    </label> 
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <span class="lbl"><strong>em: </strong></span>
                                                        <span class="lbl"> <c:out value = "${dtHrAtualizacao}" /></span>
                                                    </label> 
                                                </div>
                                                <hr style="background-color: black">
                                            </c:forEach>
                                        </div>


                                        <!--Inicico da tab-pane Poígio -->
                                        <div id="poligono" class="tab-pane">
                                            <h5 class="header smaller lbl"><strong>Poligono</strong></h5>
                                            <div id="mapid" style="width: 800px; height: 600px; position: relative; "></div>

                                        </div>


                                    </div>
                                </div>
                            </div>    
                        </div>        

<<<<<<< HEAD
                        <jsp:include page="include/leaflet.jsp" />
=======
                        
>>>>>>> 6bdfb37c59a8fbfac7d8177a454625dd10e4db48
                        <jsp:include page = "include/footer.jsp" />
                        <jsp:include page = "javaScritp/carregado.html" />

                    </div><!-- /.main-container -->
                    <div id="dialog-planta"style="display:none;">

                    </div>

                    <div id="dialog-auto-cessao"style="display:none;">

                    </div>


                    </body>
                    </html>


