<%-- 
    Document   : AgendamentoSalaLista
    Created on : 12/06/2019, 13:02:11
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

            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="qtdPg" value="${param.qtdPg}" />
            <c:set var="totalRes" value="${param.totalRes}" />

            <c:set var="dtData" value="${param.dtData}"/>
            <c:set var="dtDataTxt" value="${param.dtDataTxt}"/>
            <c:set var="horarioIni" value="${param.horarioIni}"/>
            <c:set var="horarioFim" value="${param.horarioFim}"/>
            <c:set var="nmNome" value="${param.nmNome}"/>


            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Agendamentos da Sala de Reunião</li>
                </ul><!-- /.breadcrumb -->
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-sm-12" >

                        <div class="page-header">
                            <h1>
                                Agendamentos da Sala de Reunião
                            </h1>
                        </div>
                        <div class="form-group" style=" padding-top:30px">
                            <table id="simple-table" class="table  table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th class="center detail-col">Detalhes</th>
                                        <th class="center">Dia/Mes/Ano</th>
                                        <th class="center">Horário</th>
                                        <th class="center">Nome</th>
                                            <c:if test="${sessionSgDivisao == 'GAB' || sessionPerfil == 'Administrador'}">
                                            <th class="center detail-col"></th>
                                            </c:if>
                                    </tr>
                                </thead>
                                <c:forEach var="listAgenda" items="${listAgendamento}">
                                    <tbody>
                                        <tr>
                                            <td>
                                                <div class=" center action-buttons">
                                                    <a href="ControllerServlet?acao=AgendamentoSalaDetalhe&pkAgendamentoSala=${listAgenda.pkAgendamentoSala}&execucao=view"><i class="ace-icon fa fa-search-plus"></i></a>
                                                </div>
                                            </td>
                                            <td class="center" title="${listAgenda.dtDataTxt}">
                                                ${listAgenda.dtDataTxt}
                                            </td>
                                            <td class="center" title="${listAgenda.horarioIni}">
                                                ${listAgenda.horarioIni} até ${listAgenda.horarioFim}
                                            </td>
                                            <td class="center" title="${listAgenda.nmNome}">
                                                ${listAgenda.nmNome}
                                            </td>

                                            <td>
                                                <c:if test="${sessionSgDivisao == 'GAB' || sessionPerfil == 'Administrador'}">
                                                    <div class="hidden-sm hidden-xs btn-group">
                                                        <button class="btn btn-xs btn-success" onclick="location.href = 'ControllerServlet?acao=AgendamentoSalaDetalhe&pkAgendamentoSala=${listAgenda.pkAgendamentoSala}&execucao=edit'">
                                                            <i class="ace-icon fa fa-plus bigger-120"></i>
                                                            editar
                                                        </button>                                                                                                                                
                                                    </div>
                                                </c:if> 
                                            </td>
                                        </tr>
                                    </tbody>
                                </c:forEach>
                            </table>
                            <!--Paginação -->
                            <div class="col-xs-6">
                                <div class="dataTables_info" id="dynamic-table_info" role="status" aria-live="polite">
                                    <label class="lead">Total <strong><c:out value="${totalRes}" /></strong></label>
                                </div>
                            </div>
                            <div class="col-xs-6">
                                <div class="dataTables_paginate paging_simple_numbers" id="dynamic-table_paginate">
                                    <ul class="pagination">

                                        <c:forEach var="i" begin="${pi}" end="${pf}">
                                            <c:if test="${pi != 0 && pi == i}">
                                                <li>
                                                    <a href="ControllerServlet?acao=AgendamentoSalaLista&pg=${i}&pi=${pi}&pf=${pf}&dtDataTxt=${dtDataTxt}&horarioIni=${horarioIni}&horarioFim=${horarioFim}&nmNome=${nmNome}">
                                                        <i class="ace-icon fa fa-angle-double-left"></i></a>
                                                </li>
                                            </c:if>    
                                            <c:if test="${i != 0 && i != pf && i <= qtdPg || i == qtdPg}">
                                                <c:choose>
                                                    <c:when test="${i==pg}">
                                                        <li class="active">
                                                            <a href="#"> ${i}</a>
                                                        </li>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <li>
                                                            <a href="ControllerServlet?acao=AgendamentoSalaLista&pg=${i}&pi=${pi}&pf=${pf}&dtDataTxt=${dtDataTxt}&horarioIni=${horarioIni}&horarioFim=${horarioFim}&nmNome=${nmNome}">${i}</a>
                                                        </li>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:if>
                                            <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                                <li>
                                                    <a href="ControllerServlet?acao=AgendamentoSalaLista&pg=${i}&pi=${pi}&pf=${pf}&dtDataTxt=${dtDataTxt}&horarioIni=${horarioIni}&horarioFim=${horarioFim}&nmNome=${nmNome}">
                                                        <i class="ace-icon fa fa-angle-double-right"></i></a>
                                                </li>
                                            </c:if>    
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div>
                            <br/>
                            <div class="form-actions center ">
                                <button class="btn btn-yellow" type="reset" onclick=" location.href = 'AgendamentoSala.jsp';">
                                    <i class="ace-icon fa fa-undo bigger-110"></i>
                                    Voltar
                                </button>

                                <button class="btn btn-info" type="reset" onclick=" location.href = 'AgendamentoSalaCRU.jsp?execucao=insert';">
                                    <i class="ace-icon fa fa-plus bigger-110"></i>
                                    Novo Horário
                                </button>
                            </div>
                            <jsp:include page = "include/footer.jsp" />

                        </div>
                    </div>
                </div>
            </div>
        </div><!-- /.main-container --> 
    </body>
</html>