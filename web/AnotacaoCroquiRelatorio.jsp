<%-- 
    Document   : AnotacaoCroquiRelatorioTeste
    Created on : 15/03/2019, 13:23:30
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
            <jsp:include page = "include/AdicionarCampoObs.jsp" />


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
                                                Informações do Croqui
                                            </a>
                                        </li>
                                    </ul>
                                    <form>
                                        <div class="tab-content profile-edit-tab-content" >

                                            <br/><br/>

                                            <div class="form-group center">
                                                <label class="inline col-sm-2 col-xs-12"
                                                       <span class="lbl"><strong>Croqui:</strong></span>
                                                </label>
                                                <label class="inline col-sm-4 col-xs-12">
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                   value="${anotCroqui.cdCroqui}" placeholder="Código Croqui" >
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                   placeholder="Código Croqui" >
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="lbl">${anotCroqui.cdCroqui}  100265</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>

                                                <label class="inline col-sm-1 col-xs-12">
                                                    <span class = "lbl"><strong>Área:</strong></span>
                                                </label>
                                                <label class="inline col-sm-3 col-xs-12">
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
                                                            <span class="lbl">${anotCroqui.cdArea}  8M</span> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </label>                                                   
                                            </div>


                                            <!-- Historico de informacao do Croqui selecionado na pesquisa-->
                                            <c:forEach var="histCroqui" items="${hCroqui.listHistCroqui(lcroqui.cdCroqui)}">
                                            </c:forEach>
                                            <div class="tab-content " >

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl" >
                                                            <strong>Interessado:</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-10 col-xs-12">
                                                        <span class="lbl">${hCroqui.nmInteressado} C.M.S.P. - Vereador Toninho Vespoli</span>
                                                    </label>
                                                </div>
                                                <div class="form-group ">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl ">
                                                            <strong>Assunto:</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-10 col-xs-12">
                                                        <span class="lbl">${hCroqui.dsAssunto} Solicita incoorporação de praça à escola</span>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl">
                                                            <strong>Nº Expediente:</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-5 col-xs-12">
                                                        <span class="lbl">${hCroqui.cdExpediente}Ofício 49 GV nº 311/2017</span>
                                                    </label>

                                                    <label class="inline col-xs-3 col-xs-12">
                                                        <span class="lbl">
                                                            <strong>Tipo Expediente:</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-1 col-xs-12">
                                                        <span class="lbl">${hCroqui.sgExpediente}Ofício</span>
                                                    </label>
                                                </div>

                                                <div class="input_fields_wrap">
                                                    <div class ="form-group col-xs-1 col-xs-12">
                                                        <a href="#" class="add_field_button" title="Adicionar dispositivos" title="Adicionar campos"><span class="label label-success arrowed"><i class=" glyphicon glyphicon-plus-sign"></i></span></a>
                                                    </div>
                                                </div>

                                                <br/><br/>

                                                <label>
                                                    <a href="AnotacaoCroquiDetalhesVTeste.jsp"><span class="glyphicon glyphicon-plus-sign"></span>Detalhes</a>
                                                </label>

                                            </div>

                                            <br/>

                                            <div class="tab-content" >
                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl" >
                                                            <strong>Interessado:</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-10 col-xs-12">
                                                        <span class="lbl">${hCroqui.nmInteressado} SubPrefeitura Sé</span>
                                                    </label>
                                                </div>
                                                <div class="form-group ">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl ">
                                                            <strong>Assunto:</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-10 col-xs-12">
                                                        <span class="lbl">${hCroqui.dsAssunto} Permissão de uso</span>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl">
                                                            <strong>Nº Expediente:</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-5 col-xs-12">
                                                        <span class="lbl">${hCroqui.cdExpediente}000.000.000-2</span>
                                                    </label>
                                                    <label class="inline col-xs-3 col-xs-12">
                                                        <span class="lbl">
                                                            <strong>Tipo Expediente:</strong>
                                                        </span>
                                                    </label>
                                                    <label class="inline col-md-1 col-xs-12">
                                                        <span class="lbl">${hCroqui.sgExpediente}TID</span>
                                                    </label>
                                                </div>

                                                <div class="input_fields_wrap">
                                                    <div class ="form-group col-xs-1 col-xs-12">
                                                        <a href="#" class="add_field_button" title="Adicionar dispositivos"><span class="label label-success arrowed"><i class=" glyphicon glyphicon-plus-sign"></i></span></a>
                                                    </div>
                                                </div>

                                                <br/><br/>

                                                <label>
                                                    <a href="AnotacaoCroquiDetalhesVTeste.jsp"><span class="glyphicon glyphicon-plus-sign"></span>Detalhes</a>
                                                </label>
                                            </div>

                                            <div class="form-actions center ">
                                                <button class="btn btn-yellow" type="reset" onclick=" location.href = 'AnotacaoCroquiLista.jsp';">
                                                    <i class="ace-icon fa fa-undo bigger-110"></i>
                                                    Voltar
                                                </button>

                                                <button class="btn btn-success" type="reset" onclick=" location.href = '';">
                                                    <i class="ace-icon fa fa-plus bigger-110"></i>
                                                    Gerar Relatório
                                                </button>
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

