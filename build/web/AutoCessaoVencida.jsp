
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
        
        <c:set var="ter" value="${param.ter}" />
        <c:set var="pg" value="${param.pg}" />
        <c:set var="pf" value="${param.pf}" />
        <c:set var="pi" value="${param.pi}" />
        <c:set var="qtdPg" value="${param.qtdPg}" />
        <c:set var="totalRes" value="${param.totalRes}" />
        
               
    
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
             <li><i class="ace-icon fa fa-list"></i> Auto de Cessão</li>
        </ul>
    </div>
        
        
    <div class="page-content">
        <div class="row">
        <div class="col-xs-12">
            
            
            <h3 class="header smaller lighter">Lista de Auto de Cessão vencida.</h3>
                <table id="simple-table" class="table  table-bordered table-hover">
                    <thead>
                        <tr>
                            <th class="detail-col hidden-480">Detalhes</th>
                            <th class="hidden-480">AC</th>
                            <th>Processo</th>
                            <th>Tipo de Cessão</th>
                            <th class="hidden-480">Cessionário  </th>
                            <th class="hidden-480">Local </th>
                            <th class="hidden-480">Croqui </th>
                            <th >Data Vencimento</th>
                            <th class="hidden-480">Vigor </th>
                            <th  class="hidden-480">Encerrado </th>
                        </tr>
                    </thead>
                      <c:forEach var="autolist" items="${listAuto}">
                    <tbody>
                        <tr>
                            <td class="center hidden-480">
                            <div class="action-buttons ">
                                <a href="ControllerServlet?acao=AutoCessaoDetalhe&pkCessao=${autolist.pkCessao}&pg=${pg}&pi=${pi}&pf=${pf}&vencida=1"><i class="ace-icon fa fa-search-plus"></i></a>
                            </div>
                            </td>
                            <td class="hidden-480">${autolist.nmAc}</td>
                            <td title="${autolist.nmProcesso}">
                                <c:choose >
                                    <c:when test="${autolist.nmProcesso.length() > 17 }">
                                        ${autolist.nmProcesso.substring(0,16)}...
                                    </c:when>
                                    <c:otherwise>
                                        ${autolist.nmProcesso}
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td title="${autolist.nmCessao}">
                                <c:choose >
                                    <c:when test="${autolist.nmCessao.length() > 20 }">
                                        ${autolist.nmCessao.substring(0,20)}...
                                    </c:when>
                                    <c:otherwise>
                                        ${autolist.nmCessao}
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td class="hidden-480" title="${autolist.nmCessionario}">
                                <c:choose >
                                    <c:when test="${autolist.nmCessionario.length() > 20 }">
                                        ${autolist.nmCessionario.substring(0,20)}...
                                    </c:when>
                                    <c:otherwise>
                                        ${autolist.nmCessionario}
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td class="hidden-480" title="${autolist.nmEndereco}">
                                <c:choose >
                                    <c:when test="${autolist.nmEndereco.length() > 25 }">
                                        ${autolist.nmEndereco.substring(0,25)}...
                                    </c:when>
                                    <c:otherwise>
                                        ${autolist.nmEndereco}
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td class="hidden-480" title="${autolist.nmCroqui}">
                                <c:choose >
                                    <c:when test="${autolist.nmCroqui.length() > 10 }">
                                        ${autolist.nmCroqui.substring(0,10)}...
                                    </c:when>
                                    <c:otherwise>
                                         ${autolist.nmCroqui}
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td title="${autolist.dtVencimento}">
                                <c:set var = "dtVec" value = "${autolist.dtVencimento}" />
                                        <c:set var = "hoje" value = '<%= new java.util.Date()%>' />
                                        <fmt:parseDate value = "${dtVec}" var = "convertedtVec" pattern="yyyy-MM-dd" />
                                        <fmt:formatDate type= "date" value="${convertedtVec}" var="dtVencimento"/>
                                        <c:out value="${dtVencimento}"/>
                            </td>
                            <td class="hidden-480">
                                <c:choose>
                                    <c:when test="${'1' == autolist.nrVigor}">
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
                            
                            <td class="hidden-480">
                                <c:choose>
                                    <c:when test="${'1' == auto.nrEncerrado}">
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
                        </tr>
                    </tbody>
                    </c:forEach>
                </table>
        <c:if test="${empty listAuto }">
            <h3>Não há Auto de Cessão vencidas nesta data.</h3>
        </c:if>
              
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
                                    <a href="ControllerServlet?acao=AutoCessaoVencida&pg=${i}&pi=${pi}&pf=${pf}&prazo=${prazo}&ter=${ter}">
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
                                            <a href="ControllerServlet?acao=AutoCessaoVencida&pg=${i}&pi=${pi}&pf=${pf}&prazo=${prazo}&ter=${ter}">${i}</a>
                                        </li>
                                    </c:otherwise>
                                </c:choose>
                            </c:if>
                            <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                <li>
                                    <a href="ControllerServlet?acao=AutoCessaoVencida&pg=${i}&pi=${pi}&pf=${pf}&prazo=${prazo}&ter=${ter}">
                                        <i class="ace-icon fa fa-angle-double-right"></i></a>
                                </li>
                            </c:if>    
                        </c:forEach>
                        </ul>
                    </div>
                </div>
        
        
                <div class="col-sm-12 ">
                    <button class="btn btn-yellow right" type="reset" onclick=" location.href='AutoCessao.jsp?&ter=${ter}';">
                        <i class="ace-icon fa fa-undo bigger-110"></i>
                        Voltar
                    </button>    
                </div>
     
    <jsp:include page = "include/footer.jsp" />
   <!-- /.main-container --> 
    </body>
</html>
