<%-- 
    Document   : PesquisaSGD
    Created on : 07/01/2019, 14:47:00
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


            <jsp:useBean id="cadSgd" class= "br.com.Modelo.CadastroSgdDAO"/>

            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="qtdPg" value="${param.qtdPg}" />
            <c:set var="totalRes" value="${param.totalRes}" />

            <c:set var="cdProcesso" value="${param.cdProcesso}" />
            <c:set var="nmInteressado" value="${param.nmInteressado}" />
            <c:set var="nmAssunto" value="${param.nmAssunto}" />
            <c:set var="cdCroqui" value="${param.cdCroqui}" />




            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Informações SGD </li>
                </ul>
            </div>

            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12 col-md-12">


                        <div class="form-actions col-lg-12 col-lg-12">

                            <h4 class="widget-title "><strong>Filtros</strong></h4>

                            <form class="form-search " action="ControllerServlet?acao=PesquisaSgdListaPagFiltro" method="POST">

                                <label class="col-xs-2 col-lg-1 "> Processo:</label>
                                <div class="col-xs-4 col-12">
                                    <input type="text" name="cdProcesso" placeholder="<c:out value="${cdProcesso}" />" class="col-md-12 col-xs-12" />
                                </div>

                                <label class="col-xs-12 col-xs-1" > Interessado:</label>
                                <div class="col-xs-3 col-xs-12">
                                    <input type="text" name="nmInteressado" placeholder="<c:out value="${nmInteressado}"/>" class="col-xs-10 col-sm-12" />
                                </div>

                                <br/><br/>

                                <label class="col-sm-1 col-xs-12" >Assunto:</label>
                                <div class="col-sm-4 col-xs-12">
                                    <input type="text" name="nmAssunto" placeholder="<c:out value="${nmAssunto}" />" class="col-lg-12 col-lg-12" />
                                </div>

                                <br/><br/>
                                <!--
                                <label class="col-sm-1 col-xs-12"> Local </label>
                                <div class="col-sm-4 col-xs-12">
                                    <input type="text" name="qEndereco" placeholder="<c:out value="${nmEndereco}" />" class="col-lg-12 col-lg-12" />
                                </div>    

                                <br/><br/>
                                -->
                                <label class="col-xs-2 col-xs-1 "> Croqui:</label>
                                <div class="col-sm-4 col-xs-12">
                                    <input type="text" name="cdCroqui" placeholder="<c:out value="${cdCroqui}" />"  class="col-xs-10 col-sm-12" />
                                </div>

                                <!--Botoes-->
                                <span class="input-group-btn col-sm-6 col-sm-offset-6">
                                    <button type="submit" class="btn btn-inverse btn-white" title="Pesquisar">
                                        <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                                        Pesquisa
                                    </button>

                                    <div class="space-2"></div>

                                    <button class="btn" type="reset" title="Limpa os Campos Preenchidos">
                                        <span class="ace-icon fa fa-eraser bigger-110" ></span>
                                        Limpar
                                    </button>
                                </span>
                            </form>


                        </div>

                        <div class="space-10" ></div>    

                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th class="detail-col hidden-480">Detalhes </th>
                                    <th>Processo </th>
                                    <th class="hidden-480">Interessado </th>
                                    <th class="hidden-480">Assunto </th>
                                    <th class="hidden-480">Local </th>
                                    <th class="hidden-480">Croqui </th>
                                </tr>
                            </thead>

                            <c:forEach var="listSgd" items="${listSgd}">
                                <c:set var="selTpAuto" value="${tpAuto.detalheTpCessao(sgdlist.fkTipoCessaoStage)}" />

                                <tbody>
                                    <tr>
                                        <td class="center hidden-480">
                                            <div class="action-buttons ">
                                                <a href="ControllerServlet?acao=PesquisaSgdListaPagFiltro&pkCadastroSgd=${autolist.pkCadastroSgd}&pg=${pg}&pi=${pi}&pf=${pf}&cdProcesso=${cdProcesso}&nmInteressado=${nmInteressado}&nmAssunto=${nmAssunto}&cdCroqui=${cdCroqui}&execucao=view"><i class="ace-icon fa fa-search-plus"></i></a>
                                            </div>
                                        </td>

                                        <td title="${sgdLista.cdProcesso}">
                                            <c:choose >
                                                <c:when test="${sgdLista.cdProcesso.length() > 17 }">
                                                    ${sgdLista.cdProcesso.substring(0,16)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${sgdLista.cdProcesso}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>         

                                        <td class="hidden-480" title="${sgdLista.nmInteressado}">
                                            <c:choose >
                                                <c:when test="${sgdLista.nmInteressado.length() > 10 }">
                                                    ${sgdLista.nmInteressado.substring(0,10)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${sgdLista.nmInteressado}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <td class="hidden-480" title="${sgdLista.nmAssunto}">
                                            <c:choose >
                                                <c:when test="${sgdLista.nmAssunto.length() > 10 }">
                                                    ${sgdLista.nmAssunto.substring(0,10)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${sgdLista.nmAssunto}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>                

                                        <td class="hidden-480" title="${sgdLista.cdCroqui}">
                                            <c:choose >
                                                <c:when test="${sgdLista.cdCroqui.length() > 10 }">
                                                    ${sgdLista.cdCroqui.substring(0,10)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${sgdLista.cdCroqui}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <td>

                                            <div class="hidden-md hidden-lg">
                                                <div class="inline pos-rel">
                                                    <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                        <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                                    </button>

                                                    <c:if test="${sessionSgDivisao == 'DIPI'}" >
                                                        <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">

                                                            <li>
                                                                <a href="ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage=${autolist.pkAutoStage}&pg=${pg}&pi=${pi}&pf=${pf}&qAC=${qAC}&qTpcessao=${qTpcessao}&qProcesso=${qProcesso}&qCessionario=${qCessionario}&qEndereco=${qEndereco}&qCroqui=${qCroqui}&qVigor=${qVigor}&execucao=edit" class="tooltip-success" data-rel="tooltip" title="" data-original-title="Edit">
                                                                    <span class="green">
                                                                        <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                                                    </span>
                                                                </a>
                                                            </li>

                                                            <li>
                                                                <a href="#" class="tooltip-info" data-rel="tooltip" title="" data-original-title="View">
                                                                    <span class="blue">
                                                                        <i class="ace-icon fa fa-search-plus bigger-120"></i>
                                                                    </span>
                                                                </a>
                                                            </li>

                                                            <li>
                                                                <a href="#" class="tooltip-error" data-rel="tooltip" title="" data-original-title="Delete">
                                                                    <span class="red">
                                                                        <i class="ace-icon fa fa-trash-o bigger-120"></i>
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
                                        <c:set var="qCessionario" value="${qCessionario}" />
                                        <c:if test="${pi != 0 && pi == i}">
                                            <li>
                                                <a href="ControllerServlet?acao=PesquisaSgdListaPagFiltro&pg=${i}&pi=${pi}&pf=${pf}&cdProcesso=${cdProcesso}&nmInteressado=${nmInteressado}&nmAssunto=${nmAssunto}&cdCroqui=${cdCroqui}&ter=${ter}">
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
                                                        <a href="ControllerServlet?acao=PesquisaSgdListaPagFiltro&pg=${i}&pi=${pi}&pf=${pf}&cdProcesso=${cdProcesso}&nmInteressado=${nmInteressado}&nmAssunto=${nmAssunto}&cdCroqui=${cdCroqui}&ter=${ter}"/>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>

                                        <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                            <li>
                                                <a href="ControllerServlet?acao=PesquisaSgdListaPagFiltro&pg=${i}&pi=${pi}&pf=${pf}&cdProcesso=${cdProcesso}&nmInteressado=${nmInteressado}&nmAssunto=${nmAssunto}&cdCroqui=${cdCroqui}&ter=${ter}"/>
                                                <i class="ace-icon fa fa-angle-double-right"></i></a>
                                            </li>
                                        </c:if>    
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>

                        <div class="col-sm-12 " >
                            <button class="btn btn-yellow right" type="reset" onclick=" location.href = 'Index.jsp?ter=${ter}';">
                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                Voltar
                            </button>    
                        </div>
                    </div>
                </div>
            </div>
        </div>




        <jsp:include page = "include/footer.jsp" />
        <!-- /.main-container --> 
    </body>
</html>
