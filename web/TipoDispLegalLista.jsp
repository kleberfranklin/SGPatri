<%-- 
    Document   : TipoDispLegalLista
    Created on : 04/10/2018, 10:49:23
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
            <c:set var="totalRes" value="${param.totalRes}" />

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li> Tipo Dispositivo Legal</li>
                </ul><!-- /.breadcrumb -->
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-sm-12" >

                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th class="hidden-480">Sigla</th>
                                    <th>Nome</th>
                                    <th class="col-md-3">
                                        <form class="form-search" action="ControllerServlet?acao=TipoDispLegalLista" method="POST">
                                            <div class="input-group">
                                                <input type="text" name="q" class="form-control search-query" placeholder="Sigla ou Nome ">
                                                <span class="input-group-btn">
                                                    <button type="submit" class="btn btn-inverse btn-white">
                                                        <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                                                        Pesquisa
                                                    </button>
                                                </span>
                                            </div>
                                        </form>
                                    </th>
                                </tr>
                            </thead>
                            <c:forEach var="tipDisp" items="${listTpDisp}">
                                <tbody>
                                    <tr>
                                        <td class="hidden-480">${tipDisp.sgTipoDispLegal}</td>
                                        <td title=" ${tipDisp.nmTipoDispLegal}">${tipDisp.nmTipoDispLegal}</td>
                                        <td>
                                            <div class="hidden-sm hidden-xs btn-group">
                                                <button class="btn btn-xs btn-info" onclick="location.href='ControllerServlet?acao=TipoDispLegalDetalhe&pkTipoDispLegal=${tipDisp.pkTipoDispLegal}&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&execucao=edit'">
                                                    <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                    <a href="#" class="btn-info">Editar</a>
                                                </button>
                                            </div>
                                            <div class="hidden-md hidden-lg">
                                                <div class="inline pos-rel">
                                                    <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                        <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                                    </button>
                                                    <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                        <li>
                                                            <a href="ControllerServlet?acao=TipoDispLegalDetalhe&pkTipoDispLegal=${tipDisp.pkTipoDispLegal}&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&execucao=edit" class="tooltip-success" data-rel="tooltip" title="" data-original-title="Edit">
                                                                <span class="green">
                                                                    <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                                                </span>
                                                            </a>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </td>
                                    </tr>
                                </tbody>
                            </c:forEach>

                        </table>

                        <!--  Botão-->
        
                        <button class="btn btn-yellow" type="reset" onclick=" location.href='PainelAdm.jsp';">
                            <i class="ace-icon fa fa-undo bigger-110"></i>
                            Voltar
                        </button>            

                        <button class="btn btn-success" type="button" onclick="location.href='TipoDispLegalCRU.jsp?execucao=insert'">
                            <i class="ace-icon fa fa-plus bigger-110"></i>
                            Tipo Dispositivo Legal
                        </button>
                        <hr> <!--linha de separação -->
                        <!--Paginação -->
                        <div class="col-xs-6">
                            <div class="dataTables_info" id="dynamic-table_info" role="status" aria-live="polite">
                                <label class="lead">  <strong><c:out value="${totalRes}"></c:out> </strong> Tipo Dispositovo(s) Legal
                                    <c:if test="${ q != null && q != '' && totalRes > 0 }">
                                        encontrato(s) como o nome: <strong><c:out value="${q}"></c:out></strong>
                                    </c:if>
                                </label>    
                            </div>
                        </div>
                        <div class="col-xs-6">
                            <div class="dataTables_paginate paging_simple_numbers" id="dynamic-table_paginate">
                                <ul class="pagination">
                                    <c:forEach var="i" begin="${pi}" end="${pf}">
                                        <c:if test="${pi != 0 && pi == i}">
                                            <li>
                                                <a href="ControllerServlet?acao=TipoDispLegalLista&pg=${i}&pi=${pi}&pf=${pf}&q=${q}">
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
                                                        <a href="ControllerServlet?acao=TipoDispLegalLista&pg=${i}&pi=${pi}&pf=${pf}&q=${q}">${i}</a>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                        <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                            <li>
                                                <a href="ControllerServlet?acao=TipoDispLegalLista&pg=${i}&pi=${pi}&pf=${pf}&q=${q}">
                                                    <i class="ace-icon fa fa-angle-double-right"></i></a>
                                            </li>
                                        </c:if>    
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>




    <jsp:include page = "include/footer.jsp" />
</div><!-- /.main-container --> 
</body>
</html>