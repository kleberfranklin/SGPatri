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
        

    <jsp:useBean id="TpCessao" class= "br.com.Modelo.TipoAutoCessaoDAO" />
    
        <c:set var="pg" value="${param.pg}" />
        <c:set var="pf" value="${param.pf}" />
        <c:set var="pi" value="${param.pi}" />
        <c:set var="qtdPg" value="${param.qtdPg}" />
        <c:set var="qAC" value="${param.qAC}" />
        <c:set var="qProcesso" value="${param.qProcesso}" />
        <c:set var="qCessionario" value="${param.qCessionario}" />
        <c:set var="qVigor" value="${param.qVigor}" />
        
    
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
                <form class="form-search" action="ControllerServlet?acao=AutoCessaoValidacaoLista" method="POST">
                <input type="hidden" value="" name="ter" />
                    
                <label class="col-sm-1 col-xs-12 "> A/C nº: </label>
                <div class="col-sm-2 col-xs-12">
                    <input type="text" name="qAC" placeholder="nº do A/C" class="col-xs-10 col-sm-12" />
                </div>     
                
                <label class="col-sm-1 col-xs-12 "> Processo: </label>
                <div class="col-sm-3 col-xs-12">
                    <input type="text" name="qProcesso" placeholder="nº do processo" class="col-xs-10 col-sm-10" />
                </div>
                <label class="col-sm-1 col-xs-12"> Em Vigor </label>
                <div class="col-sm-2 col-xs-12">
                    <select class="col-sm-6 col-xs-12" name="qVigor">
                        <option value=""> </option>
                        <option value="True">Sim</option>
                        <option value="False">Não</option>
                    </select>
                </div>
                                
                <div class="col-sm-12 col-xs-12">
                    <span class="input-group-btn col-sm-6 col-sm-offset-8">
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
                            <th class="detail-col hidden-480">Analisar</th>
                            <th class="hidden-480">AC</th>
                            <th>Processo</th>
                            <th class="hidden-480">Vigor </th>
                            <th class="hidden-480">Validação</th>
                        </tr>
                    </thead>
                      <c:forEach var="autolist" items="${listAuto}">
                    <tbody>
                        <tr>
                            <td class="center hidden-480">
                                <button class="btn btn-xs btn-info" onclick="location.href='ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage=${autolist.pkAutoStage}&pg=${pg}&pi=${pi}&pf=${pf}&qProcesso=${qProcesso}&qVigor=${qVigor}'">
                                    <i class="ace-icon fa fa-pencil bigger-120"></i>
                                    <a href="ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage=${autolist.pkAutoStage}&pg=${pg}&pi=${pi}&pf=${pf}&qProcesso=${qProcesso}&qVigor=${qVigor}" class="btn-info">Analisar</a>
                                </button>
                            </td>
                            <td class="hidden-480">${autolist.nmCodAc}</td>
                            <td title="${autolist.nmProcesso}">${autolist.nmProcesso}</td>
                            <td class="hidden-480">
                                <c:choose>
                                    <c:when test="${'True' == autolist.nrVigor}">
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
                                    <c:when test="${autolist.nmStatus == 'Nao Verificado'}">
                                        <span class="label label-warning label-white" title="Pendente Conferência">
                                            Pendente Conferência
                                        </span>
                                    </c:when>
                                    <c:when test="${autolist.nmStatus == 'EmConferencia'}">
                                        <span class="label label-white label-white" title="Em conferência">
                                            Em conferência
                                        </span>
                                    </c:when>
                                    <c:when test="${autolist.nmStatus == 'EmCorrecao'}">
                                        <span class="label label-danger label-white" title="Em correção">
                                            Em correção
                                        </span>
                                    </c:when>
                                    <c:otherwise>
                                        <span class="label label-success label-white" title="Analisar">
                                            Validado 
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
                    <label class="lead">Total <strong><c:out value="${totalRes}"></c:out></strong></label>
               </div>
            </div>
                <div class="col-xs-6">
                    <div class="dataTables_paginate paging_simple_numbers" id="dynamic-table_paginate">
                        <ul class="pagination">
                        <c:forEach var="i" begin="${pi}" end="${pf}">
                            <c:if test="${pi != 0 && pi == i}">
                                <li>
                                    <a href="ControllerServlet?acao=AutoCessaoValidacaoLista&pg=${i}&pi=${pi}&pf=${pf}&qProcesso=${qProcesso}&qVigor=${qVigor}">
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
                                            <a href="ControllerServlet?acao=AutoCessaoValidacaoLista&pg=${i}&pi=${pi}&pf=${pf}&qProcesso=${qProcesso}&qVigor=${qVigor}">${i}</a>
                                        </li>
                                    </c:otherwise>
                                </c:choose>
                            </c:if>
                            <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                <li>
                                    <a href="ControllerServlet?acao=AutoCessaoValidacaoLista&pg=${i}&pi=${pi}&pf=${pf}&qProcesso=${qProcesso}&qVigor=${qVigor}">
                                        <i class="ace-icon fa fa-angle-double-right"></i></a>
                                </li>
                            </c:if>    
                        </c:forEach>
                        </ul>
                    </div>
                </div>
        
            
        
     
    <jsp:include page = "include/footer.jsp" />
   <!-- /.main-container --> 
    </body>
</html>
