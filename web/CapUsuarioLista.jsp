<%-- 
    Document   : CapUsuarioLista
    Created on : 01/02/2019, 09:54:06
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
            <c:set var="q" value="${param.q}" />
            <c:set var="sgDivisao" value="${param.sgDivisao}" />


            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-users"></i> Usuários</li>
                </ul>
            </div>  


            <div class="page-content">
                <div class="row">
                    <div class="col-sm-12 col-md-12">

                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th class="detail-col hidden-480">Detalhes</th>
                                    <th class="hidden-480">Login</th>
                                    <th>Nome</th>
                                    <th class="hidden-480">Divisao  </th>
                                    <th class="hidden-480">Cargo  </th>
                                    <th class="hidden-480">Perfil  </th>
                                    <th class="hidden-480">Status  </th>
                                    <th class="col-md-3">
                                        <form class="form-search" action="ControllerServlet?acao=CapUsuarioListaPaginada" method="POST">
                                            <div class="input-group">
                                                <input type="text" name="q" class="form-control search-query" placeholder="Nome ">
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
                            <c:forEach var="capUslist" items="${lisCapUsuario}">
                                <tbody>
                                    <tr>
                                        <td class="center hidden-480">
                                            <div class="action-buttons ">
                                                <a href="ControllerServlet?acao=CapUsuarioDetalhe&pkUsuarioCap=${capUslist.pkUsuarioCap}&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}"><i class="ace-icon fa fa-search-plus"></i></a>
                                            </div>
                                        </td>
                                        <td class="hidden-480">${capUslist.nmLogin}</td>
                                        <td title=" ${capUslist.nmNome}">
                                            <c:choose >
                                                <c:when test="${capUslist.nmNome.length() > 30 }">
                                                    ${capUslist.nmNome.substring(0,30)}...
                                                </c:when>
                                                <c:otherwise>
                                                    ${capUslist.nmNome}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td title="${capUslist.nmDivisao}">${capUslist.sgDivisao}</td>
                                        <td title="${capUslist.nmCargo}">${capUslist.nmCargo}</td>
                                        <td class="hidden-480" title="">${capUslist.nmPerfil}</td>
                                        <td class="hidden-480"> 
                                            <c:choose>
                                                <c:when test="${'1' == capUslist.nrAtivo}">
                                                    <span class="label label-sm label-success">Ativo</span>
                                                </c:when>
                                                <c:otherwise>
                                                    <span class="label label-sm label-danger">Desativado</span>
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <td> 
                                            <div class="hidden-sm hidden-xs btn-group">
                                                <button class="btn btn-xs btn-info" type="reset" onclick="location.href = 'ControllerServlet?acao=CapUsuarioDetalhe&pkUsuarioCap=${capUslist.pkUsuarioCap}&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}&alt=alt'">
                                                    <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                    <a href="#" class="btn-info">Editar</a>
                                                </button>

                                                <c:choose>
                                                    <c:when test="${'0' == capUslist.nrAtivo}">
                                                        <label class="pull-left inline">
                                                            <input id="id-button-borders" type="checkbox" class="ace ace-switch ace-switch-5" id="" name="" value="1" onclick="location.href = 'ControllerServlet?acao=CapUsuarioAlterarStatus&pkUsCap=${capUslist.pkUsuarioCap}&status=1&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}';" >
                                                            <span class="lbl middle"></span>
                                                        </label> 

                                                    </c:when>
                                                    <c:otherwise>
                                                        <label class="pull-left inline">
                                                            <input id="id-button-borders" checked="checked"  type="checkbox" class="ace ace-switch ace-switch-5" id="" name="" value="0" onclick="location.href = 'ControllerServlet?acao=CapUsuarioAlterarStatus&pkUsCap=${capUslist.pkUsuarioCap}&status=0&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}';" >
                                                            <span class="lbl middle"><a href="Index.jsp"></a></span>
                                                        </label> 
                                                    </c:otherwise>
                                                </c:choose>
                                            </div>

                                            <div class="hidden-md hidden-lg">
                                                <div class="inline pos-rel">
                                                    <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                        <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                                    </button>

                                                    <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                        <li>
                                                            <a href="ControllerServlet?acao=CapUsuarioDetalhe&pkUsuarioCap=${capUslist.pkUsuarioCap}&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}&alt=alt" class="tooltip-success" data-rel="tooltip" title="" data-original-title="Edit">
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

                        <button class="btn btn-yellow" type="reset" onclick=" location.href = 'Cap.jsp';">
                            <i class="ace-icon fa fa-undo bigger-110"></i>
                            Voltar
                        </button>            

                        <button class="btn btn-success" type="button" onclick=" location.href = 'CapUsuarioC.jsp?pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}';">
                            <i class="ace-icon fa fa-user-plus bigger-110"></i>
                            Usuário
                        </button>
                        <hr> <!--linha de separação -->
                        <!--Paginação -->
                        <div class="col-xs-6">
                            <div class="dataTables_info" id="dynamic-table_info" role="status" aria-live="polite">
                                <label class="lead">  <strong><c:out value="${totalRes}"></c:out> </strong> usuário(s) 
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
                                                <a href="ControllerServlet?acao=CapUsuarioListaPaginada&pg=${i}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}">
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
                                                        <a href="ControllerServlet?acao=CapUsuarioListaPaginada&pg=${i}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}">${i}</a>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                        <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                            <li>
                                                <a href="ControllerServlet?acao=CapUsuarioListaPaginada&pg=${i}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}">
                                                    <i class="ace-icon fa fa-angle-double-right"></i></a>
                                            </li>
                                        </c:if>    
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <jsp:include page = "include/footer.jsp" />
        </div> <!-- /.main-container --> 
    </body>
</html>
