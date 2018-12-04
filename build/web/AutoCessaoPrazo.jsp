
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
        <c:set var="prazo" value="${param.prazo}" />
        <c:set var="ter" value="${param.ter}" />
    
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
             <li><i class="ace-icon fa fa-list"></i> Auto de Cessão</li>
        </ul>
    </div>
        
        
    <div class="page-content">
        <div class="row">
        <div class="col-xs-12 col-md-12">
            
        
            <div class="form-actions col-md-12" >
                <h4 class="widget-title">Prazo de vencimento em:</h4>
                <form class="form-search" action="ControllerServlet?acao=AutoCessaoPrazo&ter=${ter}" method="POST">
                    
                    <div class="space-10"></div>
                    <div class="col-md-2 col-md-offset-1 col-xs-12">
                        <label>
                            <input name="prazo" type="radio" class="ace" value="3">
                            <span class="lbl"> 3 Meses</span>
                        </label>
                    </div>
                    <div class="col-md-2 col-xs-12">
                        <label>
                            <input name="prazo" type="radio" class="ace" value="6" >
                            <span class="lbl"> 6 Meses</span>
                        </label>
                    </div>
                    <div class="col-md-2 col-xs-12">
                        <label>
                            <input name="prazo" type="radio" class="ace" value="9" >
                            <span class="lbl"> 9 Meses</span>
                        </label>
                    </div>
                    <div class="col-md-2 col-xs-12">
                        <label>
                            <input name="prazo" type="radio" class="ace" value="1" >
                            <span class="lbl"> 1 ano</span>
                        </label>
                    </div>
                    
                    <div class="col-md-2 col-xs-12">
                        <span class="input-group-btn">
                            <button type="submit" class="btn btn-inverse btn-white" title="duplo clik limpa pesquisa">
                                <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                                Pesquisa
                            </button>
                        </span>
                    </div>    
                
                    
                    </form>
                </div>
            <div class="space-10" ></div>    
            </div>
            
            
                <table id="simple-table" class="table  table-bordered table-hover">
                    <thead>
                        <tr>
                            <th class="detail-col">Detalhes</th>
                            <th class="hidden-480">AC</th>
                            <th>Processo</th>
                            <th>Tipo de Cessão</th>
                            <th class="hidden-480">Cessionário  </th>
                            <th class="hidden-480">Local </th>
                            <th class="hidden-480">Vigor </th>
                            <th class="hidden-480">Croqui </th>
                        </tr>
                    </thead>
                      <c:forEach var="autolist" items="${listAuto}">
                    <tbody>
                        <tr>
                            <td class="center">
                            <div class="action-buttons ">
                                <a href="ControllerServlet?acao=AutoCessaoDetalhe&pkCessao=${autolist.pkCessao}&pg=${pg}&pi=${pi}&pf=${pf}&prazo=${prazo}"><i class="ace-icon fa fa-search-plus"></i></a>
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
                        </tr>
                    </tbody>
                    </c:forEach>
                </table>
        <c:if test="${empty listAuto && prazo != null }">
            
            <h2 class="header smaller lighter blue ">Não encotrado</h2>
            <h3>Não tem Auto de Cessão para vencer daqui a 
                <c:choose>
                    <c:when test="${prazo == '1'}">
                        <strong>${prazo} ano.</strong>
                    </c:when>
                    <c:otherwise>
                        <strong>${prazo} meses.</strong>
                                
                    </c:otherwise>    
                </c:choose>
            </h3>
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
                                    <a href="ControllerServlet?acao=AutoCessaoPrazo&pg=${i}&pi=${pi}&pf=${pf}&prazo=${prazo}$ter=${ter}">
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
                                            <a href="ControllerServlet?acao=AutoCessaoPrazo&pg=${i}&pi=${pi}&pf=${pf}&prazo=${prazo}$ter=${ter}">${i}</a>
                                        </li>
                                    </c:otherwise>
                                </c:choose>
                            </c:if>
                            <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                <li>
                                    <a href="ControllerServlet?acao=AutoCessaoPrazo&pg=${i}&pi=${pi}&pf=${pf}&prazo=${prazo}$ter=${ter}">
                                        <i class="ace-icon fa fa-angle-double-right"></i></a>
                                </li>
                            </c:if>    
                        </c:forEach>
                        </ul>
                    </div>
                </div>
                
                <div class="col-sm-12 " >
                    <button class="btn btn-yellow right" type="reset" onclick=" location.href='AutoCessao.jsp?ter=${ter}';">
                        <i class="ace-icon fa fa-undo bigger-110"></i>
                        Voltar
                    </button>    
                </div>
        
     
    <jsp:include page = "include/footer.jsp" />
   <!-- /.main-container --> 
    </body>
</html>
