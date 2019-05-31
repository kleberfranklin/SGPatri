<%-- 
    Document   : CapLista
    Created on : 20/05/2019, 16:24:50
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

            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="qtdPg" value="${param.qtdPg}" />
            <c:set var="totalRes" value="${param.totalRes}" />
            <c:set var="q" value="${param.q}"/>

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Informações do CAP</li>
                </ul>
            </div>

            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12 col-md-12">

                        <div class="form-actions col-sm-12 col-xs-12">
                            <h4 class="widget-title "><strong>Filtros</strong></h4>
                            <form class="form-search" action="ControllerServlet?acao=CadastroAreaPublicaLista" method="POST">

                                <label class="col-xs-2 col-xs-12">Nº CAP:</label>
                                <div class="input-group col-xs-4 col-xs-12">
                                    <input type="text" name="cdCap" placeholder="<c:out value="${cdCap}" />" class="col-xs-5 col-xs-12"/>
                                </div>

                                <!--Botoes-->
                                <div class="input-group-btn col-sm-4 col-sm-offset-1 col-xs-12">
                                    <button type="submit" class="btn btn-inverse btn-white">
                                        <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                                        Pesquisa
                                    </button>
                                </div>     
                                <br/><br/>
                            </form>    
                        </div>

                        <div class="space-10" ></div>    

                        <table id="simple-table" class="table table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th class="center detail-col">Detalhes</th>
                                    <th>Nº CAP</th>
                                    <th>Origem</th>
                                    <th>Status</th>
                                        <c:if test="${sessionSgDivisao == 'SCA' || sessionPerfil == 'Administrador'}">
                                        <!--<th></th>-->
                                    </c:if>
                                </tr>
                            </thead>

                            <c:forEach var="listCap" items="${listCap}">
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class=" center action-buttons">
                                                <a href="ControllerServlet?acao=CadastroAreaPublicaDetalhe&pkCap=${listCap.pkCap}&execucao=view"><i class="ace-icon fa fa-search-plus"></i></a>
                                            </div>
                                        </td>

                                        <td title="${listCap.cdCap}">
                                            ${listCap.cdCap}
                                        </td>

                                        <td title="${listCap.nmOrigem}">
                                            <c:choose>
                                                <c:when test="${listCap.nmOrigem.length() > 30 }">
                                                    ${listCap.nmOrigem.substring(0,30)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${listCap.nmOrigem}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <td title="${listCap.stCap}">
                                            <c:choose>
                                                <c:when test="${listCap.stCap.length() > 10 }">
                                                    ${listCap.stCap.substring(0,10)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${listCap.stCap}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <c:if test="${sessionSgDivisao == 'SCA' || sessionPerfil == 'Administrador'}">
                                            <!-- <td>
                                                <button class="btn btn-xs btn-info" onclick="location.href = 'ControllerServlet?acao=CapDetalhe&pkCap=${listCap.pkCap}&execucao=edit'">
                                                    <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                    editar
                                                </button>                                                                                                                                
                                            </td> -->  
                                        </c:if>
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
                                                <a href="ControllerServlet?acao=CadastroAreaPublicaLista&pg=${i}&pi=${pi}&pf=${pf}&nmOrigem=${nmOrigem}&cdCap=${cdCap}&stCap=${stCap}">
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
                                                        <a href="ControllerServlet?acao=CadastroAreaPublicaLista&pg=${i}&pi=${pi}&pf=${pf}&nmOrigem=${nmOrigem}&cdCap=${cdCap}&stCap=${stCap}">${i}</a>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                        <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                            <li>
                                                <a href="ControllerServlet?acao=CadastroAreaPublicaLista&pg=${i}&pi=${pi}&pf=${pf}&nmOrigem=${nmOrigem}&cdCap=${cdCap}&stCap=${stCap}">
                                                    <i class="ace-icon fa fa-angle-double-right"></i></a>
                                            </li>
                                        </c:if>    
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>

                        <div class="col-sm-12 " >
                            <button class="btn btn-yellow right" type="reset" onclick=" location.href = 'CadastroAreaPublica.jsp';">
                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                Voltar
                            </button>    
                        </div>
                        <jsp:include page = "include/footer.jsp" />
                    </div>
                </div>
            </div>
        </div><!-- /.main-container --> 
    </body>
</html>
