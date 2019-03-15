<%-- 
    Document   : PerfilLista
    Created on : 26/09/2018, 17:24:15
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
                    <li><i class="ace-icon fa fa-folder"></i> Perfil</li>
                </ul><!-- /.breadcrumb -->
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-sm-12" >
                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th class="detail-col hidden-480">Tipo de Perfil</th>
                                    <th class="hidden-480">Descrição</th>
                                    <th>Permissão Leitura</th>
                                    <th>Permissão Gravar</th>
                                    <th>Permissão Alterar</th>
                                    <th>Permissão Excluir</th>
                                    <th>Permissão Editar campos Formulários</th>
                                    <th>Permissão Painel Administrativo</th>
                                    <th class="col-md-3">
                                        <form class="form-search" action="ControllerServlet?acao=PerfilLista" method="POST">
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
                            <c:forEach var="perf" items="${lisPerfil}">
                                <tbody>
                                    <tr>
                                        <td>${perf.nmPerfil}</td>
                                        <td>${perf.dsPerfil}</td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${'1' == perf.nrLer}">
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
                                                <c:when test="${'1' == perf.nrInserir}">
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
                                                <c:when test="${'1' == perf.nrEditar}">
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
                                                <c:when test="${'1' == perf.nrExcluir}">
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
                                                <c:when test="${'1' == perf.nrGerenciar}">
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
                                                <c:when test="${'1' == perf.nrGerenciar}">
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
                                            
                                            <div class="hidden-sm hidden-xs btn-group">
                                                <c:if test="${perf.nmPerfil != 'Administrador'}">
                                                <button class="btn btn-xs btn-info" onclick="location.href='ControllerServlet?acao=PerfilDetalhe&pkPerfil=${perf.pkPerfil}&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&execucao=edit'">
                                                    <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                    <a href="#" class="btn-info">Editar</a>
                                                </button>
                                                </c:if>
                                            </div>

                                            <div class="hidden-md hidden-lg">
                                                <div class="inline pos-rel">
                                                    <c:if test="${perf.nmPerfil != 'Administrador'}">
                                                    <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                        <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                                    </button>
                                                    <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                        <li>
                                                            <a href="ControllerServlet?acao=PerfilDetalhe&pkPerfil=${perf.pkPerfil}&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&execucao=edit" class="tooltip-success" data-rel="tooltip" title="" data-original-title="Edit">
                                                                <span class="green">
                                                                    <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                                                </span>
                                                            </a>
                                                        </li>
                                                    </ul>
                                                    </c:if>            
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

                        <button class="btn btn-success" type="button" onclick="location.href='PerfilCRU.jsp?execucao=insert'">
                            <i class="ace-icon fa fa-folder bigger-110"></i>
                            Perfil
                        </button>
                        <hr> <!--linha de separação -->
                        <!--Paginação -->
                        
                        <div class="col-xs-6">
                            <div class="dataTables_info" id="dynamic-table_info" role="status" aria-live="polite">
                                <label class="lead">  <strong><c:out value="${totalRes}"></c:out> </strong> Perfil(s) 
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
                                                <a href="ControllerServlet?acao=PerfilLista&pg=${i}&pi=${pi}&pf=${pf}&q=${q}">
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
                                                        <a href="ControllerServlet?acao=PerfilLista&pg=${i}&pi=${pi}&pf=${pf}&q=${q}">${i}</a>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                        <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                            <li>
                                                <a href="ControllerServlet?acao=PerfilLista&pg=${i}&pi=${pi}&pf=${pf}&q=${q}">
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
