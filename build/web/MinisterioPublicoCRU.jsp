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

            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />


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
                    <li><i class="ace-icon fa fa-list"></i> Ministerio Publico </li>
                </ul>
            </div>    
            <div class="page-content" >
                <div id="" class="specific-block"></div>    
                <div class="row">
                    <div class="col-xs-12">
                        <div class="col-sm-offset-1 col-sm-10">
                            <h2>Ministerio Publico </h2>
                            <div class="space-14"></div>
                            <div class="form-horizontal">
                                <div class="tabbable">
                                    <ul class="nav nav-tabs padding-0">
                                        <li class="active">
                                            <a data-toggle="tab" href="#cad-croqui" aria-expanded="true">
                                                Ministerio Publico 
                                            </a>
                                        </li>
                                    </ul>
                                    <form action="ControllerServlet?acao=AnotacaoCroquiUC" method="POST" >

                                        <div class="tab-content profile-edit-tab-content" >
                                            <!--Inicio da tab-pane Cadastro Croqui-->
                                            <div id="cad-croqui" class="tab-pane in active"  >
                                                <input type="hidden" name="execucao" value="${execucao}" />
                                                <h4 class="header smaller lbl "><strong>Ministerio Publico</strong></h4>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Origem:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-8 col-xs-12"  name="nmOrigem" 
                                                               placeholder="Nome da Origem"  >
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data Entrada:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-4 col-xs-12" >
                                                        <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtEntrada" 
                                                               placeholder="YYYY/MM/DD">
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Oficio Entrada:</strong></span>
                                                    </label>
                                                    <label class="col-sm-7 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-4 col-xs-12"  name="cdOficio" 
                                                               placeholder="Oficio">
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Processo:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-5 col-xs-12"  name="cdProcesso" 
                                                               placeholder="Processo">
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Interessado:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="nmInteressado" 
                                                               placeholder="Nome do Interessado"  >
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Assunto:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="dsAssunto" 
                                                               placeholder="Descrição do assunto"  >         
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Endereço:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="nmEndereco" 
                                                               placeholder="Descrição do Endereço:"  >         
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Informação DGPI:</strong></span>
                                                    </label>
                                                    <label class="col-sm-4 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nrInformacaoDgpi" 
                                                               placeholder="Nº Informação DGPI">
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <input type="text" class="col-xs-8 col-xs-12" name="nrprocesso" id="nrprocesso" 
                                                               placeholder="Nº do Expediente">
                                                    </label>

                                                    <label class="inline col-md-3 col-xs-12">
                                                        <span class="lbl"><strong>Tipo de Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <select class="col-md-12 col-xs-12" name="pkCatAutoCessao" >
                                                            <option></option>
                                                            <option>TID</option>
                                                            <option>CID</option>
                                                            <option>PA</option>
                                                        </select>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data de Resposta:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-4 col-xs-12" >
                                                        <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="cdExpediente" 
                                                               placeholder="Escrever o despacho"  >
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Observação:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-9 col-xs-12" >
                                                        <textarea class="form-control col-xs-12" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                  style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;"></textarea>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-4 col-xs-12" >
                                                        <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtData" 
                                                               placeholder="YYYY/MM/DD" >
                                                    </label>

                                                    <label class="col-sm-1 col-xs-12" >  
                                                        <span class="lbl"><strong>Nome:</strong></span>
                                                    </label> 
                                                    <label class="inline col-sm-5 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-6 col-xs-12"  name="nmInteressado" 
                                                               placeholder="Nome">
                                                    </label>
                                                </div>
                                            </div>

                                            <!-- Botões-->
                                            <div class="form-actions center ">
                                                <button class="btn btn-yellow" type="reset" onclick=" location.href = 'MinisterioPublico.jsp';">
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
                                    </form>

                                </div>
                            </div>
                        </div>
                    </div>    
                </div>    

                <jsp:include page = "include/footer.jsp" />
                <jsp:include page = "javaScritp/carregado.html" />

            </div>
        </div>
    </body>
</html>

