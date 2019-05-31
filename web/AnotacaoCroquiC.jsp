<%-- 
    Document   : AnotacaoCroquiC
    Created on : 11/03/2019, 12:37:31
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
            <jsp:include page = "javaScritp/maskProcesso.html" />

            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />

            <!-- Beans -->        

            <!--Pegando os paremetros -->
            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="execucao" value="${param.execucao}" />

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
                            <h2>Anotação Expediente</h2>
                            <div class="space-14"></div>
                            <div class="form-horizontal">
                                <div class="tabbable">

                                    <ul class="nav nav-tabs padding-0">
                                        <li class="active">
                                            <a data-toggle="tab" href="#cad-croqui" aria-expanded="true">
                                                Anotação Expediente
                                            </a>
                                        </li> 
                                    </ul>

                                    <form action="ControllerServlet?acao=AnotacaoCroquiC" method="POST">

                                        <div class="tab-content profile-edit-tab-content" >
                                            <!--Inicio da tab-pane Cadastro Croqui-->
                                            <div id="cad-croqui" class="tab-pane in active">
                                                <input type="hidden" name="pkAnotacaoExpediente" value="${anotCroqui.pkAnotacaoExpediente}" />
                                                <input type="hidden" name="execucao" value="${execucao}" />
                                                <h4 class="header smaller lbl "><strong>Cadastro de Historico do Documento</strong></h4>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Nº Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <input type="text" class="col-xs-8 col-xs-12" name="nrprocesso" id="nrprocesso" value="${anotCroqui.cdExpediente}" 
                                                               placeholder="Nº do Expediente" required="required">
                                                    </label>

                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Tipo de Expediente:</strong></span>
                                                    </label>
                                                    <label class="input-group col-sm-4 col-xs-12">
                                                        <select name="" placeholder="" class="col-sm-5 col-xs-12" >
                                                            <option></option>
                                                            <c:forEach var="lis" items="${listaTpExp}">
                                                                <c:if test="${lis.sgTipoExpediente != ''}">
                                                                    <option>${lis.sgTipoExpediente}</option>
                                                                </c:if>
                                                            </c:forEach>
                                                        </select>
                                                    </label>
                                                </div>

                                                <span class="input-group-btn">
                                                    <button type="submit" class="btn btn-inverse btn-white">
                                                        <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                                                        Pesquisa
                                                    </button>
                                                </span>
                                            </div>
                                        </div>
                                    </form>

                                    <br/>

                                    <!-- testar se o obj da pesquisa esta empty-->
                                    <form action="ControllerServlet?acao=AnotacaoCroquiUC" method="POST" >

                                        <div class="tab-content profile-edit-tab-content" >
                                            <div id="cad-croqui" class="tab-pane in active"  >
                                                <input type="hidden" name="pkAnotacaoExpediente" value="${anotCroqui.pkAnotacaoExpediente}" />
                                                <input type="hidden" name="execucao" value="${execucao}" />

                                                <div class="space-14"></div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Nº Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" class="col-xs-8 col-xs-12" name="nrprocesso" id="nrprocesso" value="${anotCroqui.cdExpediente}" 
                                                                       placeholder="Nº do Expediente"    onKeyPress="return somenteNum(event);" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" class="col-xs-8 col-xs-12" name="nrprocesso" id="nrprocesso"  
                                                                       placeholder="Nº do Expediente"    onKeyPress="return somenteNum(event);" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.cdExpediente}
                                                            </c:otherwise>

                                                        </c:choose>
                                                    </label>

                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Tipo de Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <select name="" placeholder="" class="col-sm-5 col-xs-12" >
                                                                    <option></option>
                                                                    <c:forEach var="lis" items="${listaTpExp}">
                                                                        <c:if test="${lis.sgTipoExpediente != ''}">
                                                                            <option>${lis.sgTipoExpediente}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <select name="" placeholder="" class="col-sm-5 col-xs-12" >
                                                                    <option></option>
                                                                    <c:forEach var="lis" items="${listaTpExp}">
                                                                        <c:if test="${lis.sgTipoExpediente != ''}">
                                                                            <option>${lis.sgTipoExpediente}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.TpExpediente}
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12"
                                                           <span class="lbl"><strong>Croqui:</strong></span>
                                                    </label>
                                                    <label class="col-sm-4 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                       value="${anotCroqui.cdCroqui}" placeholder="Código Croqui" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                       placeholder="Código Croqui" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.cdCroqui}
                                                            </c:otherwise>
                                                        </c:choose>

                                                    </label>

                                                    <label class="col-sm-1 col-xs-12">
                                                        <span class = "lbl"><strong>Área:</strong></span>
                                                    </label>
                                                    <label class="col-sm-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-7 col-xs-12" name="cdArea" 
                                                                       value="${anotCroqui.cdArea}" placeholder="Código Área" 
                                                                </c:when>
                                                                <c:when test="${execucao == 'insert'}">
                                                                    <input type="text" id="form-field-1" class="col-sm-7 col-xs-12" name="cdArea" 
                                                                    placeholder="Código Área" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.cdArea}</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>                                                   
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Interessado:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="nmInteressado" 
                                                                       value="${anotCroqui.nmInteressado}" placeholder="Nome do Interessado" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="nmInteressado" 
                                                                       placeholder="Nome do Interessado" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.nmInteressado}
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Assunto:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="dsAssunto" 
                                                                       value="${anotCroqui.dsAssunto}" placeholder="Descrição do assunto" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="dsAssunto" 
                                                                       placeholder="Descrição do assunto" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.dsAssunto}
                                                            </c:otherwise>
                                                        </c:choose>         
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Local:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12" name="nmEndereco" 
                                                                       value="${anotCroqui.nmReferenciaEndereco}"  placeholder="Descrição do local" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12" name="nmEndereco" 
                                                                       placeholder="Descrição do local" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.nmReferenciaEndereco}
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Despacho:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-8 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-10 col-xs-12"  name="cdExpediente" 
                                                                       value="${anotCroqui.dsDespacho}" placeholder="Escrever o despacho" required="required"> 
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-10 col-xs-12"  name="cdExpediente" 
                                                                       placeholder="Escrever o despacho" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.dsDespacho}
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
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="" 
                                                                       value="${dtAtuPubli}" title="Selecione a data" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="" 
                                                                       title="Selecione a data" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${dtAtuPubli}
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
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtTramitacao" 
                                                                       value="${anotCroqui.dtAnotacao}" title="Selecione a data" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtTramitacao" 
                                                                       title="Selecione a data" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.dtAnotacao}
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
                                                            <c:when test="${execucao == 'edit'}">
                                                                <textarea class="form-control col-xs-12" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;">${anotCroqui.dsObservacao}</textarea>
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <textarea class="form-control col-xs-12" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;"></textarea>
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.dsObservacao}
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-4 col-xs-12" >
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtData" 
                                                                       value="${anotCroqui.dtData}" required="required" title="Selecione a data">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtData" 
                                                                       required="required" title="Selecione a data">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.dtData}
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>

                                                    <label class="col-sm-1 col-xs-12" >  
                                                        <span class="lbl"><strong>Nome:</strong></span>
                                                    </label> 
                                                    <label class="inline col-sm-5 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12"  name="nmAutor" 
                                                                       value="${anotCroqui.nmAutor}" placeholder="Nome" required="required">
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12"  name="nmAutor" 
                                                                       placeholder="Nome" required="required">
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${anotCroqui.nmAutor}
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <!-- Botões-->
                                                <div class="form-actions center ">
                                                    <button class="btn btn-yellow" type="reset" onclick=" location.href = 'AnotacaoCroqui.jsp';">
                                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                                        Voltar
                                                    </button>

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
                        <jsp:include page = "include/footer.jsp" />
                        <jsp:include page = "javaScritp/carregado.html" />
                    </div>    
                </div> 
            </div>
        </div>
    </body>
</html>

