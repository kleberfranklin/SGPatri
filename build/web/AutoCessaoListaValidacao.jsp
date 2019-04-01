<%-- 
    Document   : AutoCessaoValidacaoLista
    Created on : 26/10/2018, 14:24:59
    Author     : d732229
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
        <c:set var="qAC" value="${param.qAC}" />
        <c:set var="qProcesso" value="${param.qProcesso}" />
        <c:set var="qCessionario" value="${param.qCessionario}" />
        <c:set var="qVigor" value="${param.qVigor}" />
        <c:set var="qStatus" value="${param.qStatus}" />
        <c:set var="totalRes" value="${param.totalRes}" />
        
        
    
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-list"></i> Auto de Cessão Validação</li>
        </ul>
    </div>
        
        
    <div class="page-content">
        <div class="row">
        <div class="col-xs-12 col-md-12">
            <div class="form-actions col-md-12 col-xs-12">
                <h4 class="widget-title">Filtros</h4>
                <form class="form-search" action="ControllerServlet?acao=AutoCessaoListaValidacao" method="POST">
                <input type="hidden" value="" name="ter" />
                    
                <label class="col-sm-1 col-xs-12 "> A/C nº: </label>
                <div class="col-sm-1 col-xs-12">
                    <input type="text" name="qAC" placeholder="nº do A/C" class="col-xs-10 col-sm-12" />
                </div>     
                
                <label class="col-sm-1 col-xs-12 "> Processo: </label>
                <div class="col-sm-2 col-xs-12">
                    <input type="text" name="qProcesso" placeholder="nº do processo" class="col-xs-10 col-sm-8" />
                </div>
                <label class="col-sm-1 col-xs-12"> Em Vigor </label>
                <div class="col-sm-2 col-xs-12">
                    <select class="col-sm-6 col-xs-12" name="qVigor">
                        <option value=""></option>
                        <option value="true">Sim</option>
                        <option value="false">Não</option>
                    </select>
                </div>
                <label class="col-sm-1 col-xs-12"> Status </label>
                <div class="col-sm-3 col-xs-12">
                    <select class="col-sm-9 col-xs-12" name="qStatus">
                        <option value=""></option>
                        <option value="NaoVerificado">Pendente Conferência</option>
                        <option value="EmConferencia">Em conferência</option>
                        <option value="Corrigir">Em correção</option>
                        <option value="Validado">Validado</option>
                    </select>
                </div>                
                <div class="col-sm-12 col-xs-12">
                    <span class="input-group-btn col-sm-8 col-sm-offset-10">
                        <button type="submit" class="btn btn-inverse btn-white" title="duplo clik limpa pesquisa">
                            <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                            Pesquisa
                        </button>
                    </span>
                </div>
                
            </form>
            <div class="space-10" ></div>    
            </div>
            
            
                <table id="simple-table" class="table  table-bordered table-hover">
                    <thead>
                        <tr>
                            <th class="detail-col hidden-480">Analisar/Visualizar</th>
                            <th class="hidden-480">AC</th>
                            <th>Processo</th>
                            <th class="hidden-480">Vigor </th>
                            <th class="hidden-480">Status Validação</th>
                        </tr>
                    </thead>
                      <c:forEach var="autolist" items="${listAuto}">
                    <tbody>
                        <tr>
                            <td class="center hidden-480">
                                <c:choose>
                                    <c:when test="${autolist.nmStatus == 'Validado'}">
                                        <button class="btn btn-white btn-success" onclick="location.href='ControllerServlet?acao=AutoCessaoDetalhe&pkAutoCessao=${autolist.pkAutoCessao}&pg=${pg}&pi=${pi}&pf=${pf}&qAC=${qAC}&qProcesso=${qProcesso}&qVigor=${qVigor}&qStatus=${qStatus}&pgValidacao=pgValidacao&execucao=view'">
                                            <i class="ace-icon fa fa-search-plus"></i>
                                            Visualizar
                                        </button>
                                    </c:when>
                                    <c:otherwise>
                                        <button class="btn btn-xs btn-info" onclick="location.href='ControllerServlet?acao=AutoCessaoDetalhe&pkAutoCessao=${autolist.pkAutoCessao}&pg=${pg}&pi=${pi}&pf=${pf}&qAC=${qAC}&qProcesso=${qProcesso}&qVigor=${qVigor}&qStatus=${qStatus}&pgValidacao=pgValidacao&execucao=edit'">
                                            <i class="ace-icon fa fa-pencil bigger-120"></i>
                                            Analisar
                                        </button>
                                    </c:otherwise>    
                                </c:choose>
                            </td>
                            <td class="hidden-480">${autolist.nmCodAc}</td>
                            <td title="${autolist.nmProcesso}">${autolist.nmProcesso}</td>
                            <td class="hidden-480">
                                <c:choose>
                                    <c:when test="${'true' == autolist.nrVigor}">
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
                            </td>
                            <td> 
                                <c:choose>
                                    <c:when test="${autolist.nmStatus == 'EmConferencia'}">
                                        <span class="label label-white label-white" title="Em conferência">
                                            Em conferência
                                        </span>
                                    </c:when>
                                    <c:when test="${autolist.nmStatus == 'Corrigir'}">
                                        <span class="label label-danger label-white" title="Em correção">
                                            Em correção
                                        </span>
                                    </c:when>
                                    <c:when test="${autolist.nmStatus == 'Validado'}">
                                        <span class="label label-success label-white" title="Validado">
                                            Validado 
                                        </span>
                                    </c:when>
                                    <c:otherwise>
                                        <span class="label label-warning label-white" title="Pendente Conferência">
                                            Pendente Conferência
                                        </span>
                                    </c:otherwise>
                                </c:choose>    
                            </td>
                        </tr>
                    </tbody>
                    </c:forEach>

                </table>
      
        <hr> <!--linha de separação -->
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
                                    <a href="ControllerServlet?acao=AutoCessaoListaValidacao&pg=${i}&pi=${pi}&pf=${pf}&qAC=${qAC}&qProcesso=${qProcesso}&qVigor=${qVigor}&qStatus=${qStatus}">
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
                                            <a href="ControllerServlet?acao=AutoCessaoListaValidacao&pg=${i}&pi=${pi}&pf=${pf}&qAC=${qAC}&qProcesso=${qProcesso}&qVigor=${qVigor}&qStatus=${qStatus}">${i}</a>
                                        </li>
                                    </c:otherwise>
                                </c:choose>
                            </c:if>
                            <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                <li>
                                    <a href="ControllerServlet?acao=AutoCessaoListaValidacao&pg=${i}&pi=${pi}&pf=${pf}&qProcesso=${qProcesso}&qVigor=${qVigor}&qStatus=${qStatus}">
                                        <i class="ace-icon fa fa-angle-double-right"></i></a>
                                </li>
                            </c:if>    
                        </c:forEach>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-12 " >
                    <button class="btn btn-yellow right" type="reset" onclick=" location.href='AutoCessao.jsp';">
                        <i class="ace-icon fa fa-undo bigger-110"></i>
                        Voltar
                    </button>    
                </div>
            
        
     
    <jsp:include page = "include/footer.jsp" />
   <!-- /.main-container --> 
    </body>
</html>
