<%-- 
    Document   : AgendamentoSalaCRU
    Created on : 12/06/2019, 16:03:59
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
                    <li><i class="ace-icon fa fa-list"></i> Agendamento da Sala de Reunião </li>
                </ul>
            </div>    
            <div class="page-content" >
                <div class="row">
                    <div class="col-xs-12">
                        <div class="col-sm-offset-1 col-sm-10">
                            <h2>Agendamento da Sala de Reunião </h2>
                            <div class="space-14"></div>
                            <div class="form-horizontal">
                                <div class="tabbable">
                                    <ul class="nav nav-tabs padding-0">
                                        <li class="active">
                                            <a data-toggle="tab" href="#cad-agendaSala" aria-expanded="true">
                                                Agendamento da Sala de Reunião 
                                            </a>
                                        </li>

                                    </ul>
                                    <form action="ControllerServlet?acao=AgendamentoSalaUC" method="POST" >
                                        <div class="tab-content profile-edit-tab-content" >
                                            <!--Inicio da tab-pane -->
                                            <div id="cad-agendaSala" class="tab-pane in active"  >
                                                <input type="hidden" name="pkAgendamentoSala" value="${agendaSala.pkAgendamentoSala}" >
                                                <input type="hidden" name="execucao" value="${execucao}" >
                                                <h4 class="header smaller lbl "><strong>Agendamento da Sala de Reunião</strong></h4>
                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-5 col-xs-12">
                                                                <input type="date" id="form-field-1" class="col-sm-5 col-xs-12" name="dtData" 
                                                                       value="${agendaSala.dtData}" placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-5 col-xs-12">
                                                                <input type="date" id="form-field-1" class="col-sm-5 col-xs-12" name="dtData" 
                                                                       placeholder="">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${agendaSala.dtData}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Horário:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-3 col-xs-12">
                                                                <input type="time" id="form-field-1" class="col-sm-8 col-xs-12" name="horarioIni" 
                                                                       value="${agendaSala.horarioIni}" placeholder="Ex: 14:00" required="required">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-2 col-xs-12">
                                                                <input type="time" id="form-field-1" class="col-sm-8 col-xs-12" name="horarioIni" 
                                                                       placeholder="Ex: 14:00" required="required">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${agendaSala.horarioIni}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <label class="inline col-sm-1 col-xs-12">
                                                        <span class="lbl"><strong>às</strong></span>
                                                    </label>

                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="inline col-sm-2 col-xs-12" >
                                                                <input type="time" id="form-field-1" class="col-sm-8 col-xs-12" name="horarioFim" 
                                                                       value="${agendaSala.horarioFim}" placeholder="Ex: 15:30" required="required">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="inline col-sm-2 col-xs-12" >
                                                                <input type="time" id="form-field-1" class="col-sm-8 col-xs-12" name="horarioFim" 
                                                                       placeholder="Ex: 15:30" required="required">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>    
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${agendaSala.horarioFim}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nome:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nmNome" 
                                                                       value="${agendaSala.nmNome}" placeholder="Nome" required="required">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nmNome" 
                                                                       placeholder="Nome" required="required">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${agendaSala.nmNome}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>
                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Setor:</strong></span>
                                                    </label>
                                                    <c:choose>
                                                        <c:when test="${execucao == 'edit'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nmSetor" 
                                                                       value="${agendaSala.nmSetor}" placeholder="Ex: Gabinete" required="required">
                                                            </label>
                                                        </c:when>
                                                        <c:when test="${execucao == 'insert'}">
                                                            <label class="col-sm-4 col-xs-12">
                                                                <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nmSetor" 
                                                                       placeholder="Ex: Gabinete" required="required">
                                                            </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="inline col-sm-3 col-xs-12" >
                                                                ${agendaSala.nmSetor}
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
                                                                          style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;">${agendaSala.dsObservacao}</textarea>
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
                                                                ${agendaSala.dsObservacao}
                                                            </span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>
                                            </div>

                                            <!-- Botões-->
                                            <c:choose> 
                                                <c:when test="${execucao == 'insert'}">
                                                    <div class="form-actions center ">
                                                        <button class="btn btn-yellow" type="reset" onclick=" location.href = 'AgendamentoSala.jsp';">
                                                            <i class="ace-icon fa fa-undo bigger-110"></i>
                                                            Voltar
                                                        </button>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <div class="form-actions center ">
                                                            <button class="btn btn-yellow" type="reset" onclick=" location.href = 'ControllerServlet?acao=AgendamentoSalaLista';">
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

