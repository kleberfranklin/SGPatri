<%-- 
    Document   : AnotacaoCroquiRelatorioLista
    Created on : 28/03/2019, 14:00:46
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

            <c:set var="qCroqui" value="${param.qCroqui}" />
            <c:set var="qArea" value="${param.qArea}" />
            <c:set var="qNome" value="${param.qNome}" />
            <c:set var="qInteressado" value="${param.qInteressado}" />
            <c:set var="qEndereco" value="${param.qEndereco}" />
            <c:set var="qAssunto" value="${param.qAssunto}" />
            <c:set var="dtIni" value="${param.dtIni}" />
            <c:set var="dtFim" value="${param.dtFim}" />

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Pesquisa de Relatórios</li>
                </ul>
            </div>

            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12 col-md-12">


                        <div class="form-actions col-sm-12 col-xs-12">
                            <h4 class="widget-title "><strong>Filtros</strong></h4>
                            <form class="form-search" action="ControllerServlet?acao=AnotacaoCroquiLista" method="POST">

                                <label class="col-sm-2 col-xs-12 "> Croqui:</label>
                                <div class="input-group col-sm-4 col-xs-12">
                                    <input type="text" name="qCroqui" placeholder="${qCroqui}" class="col-sm-3 col-xs-12" />
                                </div>

                                <label class="col-sm-1 col-xs-12 "> Área:</label>
                                <div class="input-group col-sm-2 col-xs-12">
                                    <input type="text" name="qArea" placeholder="${qArea}" class="col-sm-7 col-xs-12" />
                                </div>

                                <br /> <br />

                                <label class="col-sm-2 col-xs-12" >Número Relatório</label>
                                <div class="input-group col-sm-1 col-xs-12">
                                    <input type="text" name="idRelatorio" placeholder="${qAssunto}" class="col-sm-12 col-xs-12 " />
                                </div>

                                <br /> <br />

                                <label class="col-sm-2 col-xs-12 "> Interessado:</label>
                                <div class="input-group col-sm-6 col-xs-12">
                                    <input type="text" name="qInteressado" placeholder="${qInteressado}" class="col-sm-8 col-xs-12" />
                                </div>

                                <br/><br/>

                                <label class="col-sm-2 col-xs-12 ">Período:</label>
                                <div class="input-group col-sm-1 col-xs-12">
                                    <input class="form-control" name="dtIni" placeholder="${dtIni}" type="date" data-date-format="dd/mm/yyyy" >
                                    <span class="input-group-addon">
                                        <i class="fa fa-calendar bigger-110"></i>
                                    </span>
                                </div>

                                <div class="col-sm-1"></div>

                                <div class="input-group col-sm-1 col-xs-12">
                                    <input class="form-control" name="dtFim" placeholder="${dtFim}" type="date" data-date-format="dd/mm/yyyy" >
                                    <span class="input-group-addon">
                                        <i class="fa fa-calendar bigger-110"></i>
                                    </span>
                                </div>

                                <div class="col-xs-2 col-xs-12"></div>
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

                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th class="center detail-col">Detalhes</th>
                                    <th>Número do Relatório</th>
                                    <th>Croqui</th>
                                    <th>Área </th>
                                    <th>Expediente</th>
                                    <th class="hidden-480">Assunto </th>
                                    <th class="hidden-480">Interessado </th>
                                    <th>Relatório</th>
                                </tr>
                            </thead>

                            <c:forEach var="lcroqui" items="${listCroqui}">
                            </c:forEach>

                            <tbody>
                                <tr>
                                    <td>
                                        <div class=" center action-buttons">
                                            <!-- pagina apenas com os historicos-->  
                                            <a href="AnotacaoCroquiDetalhes.jsp"><i class="ace-icon fa fa-search-plus"></i></a>
                                        </div>
                                    </td>

                                    <td title="${lcroqui.cdCroqui}">
                                        <c:choose >
                                            <c:when test="${lcroqui.cdCroqui.length() > 8 }">
                                                ${lcroqui.cdCroqui.substring(0,7)}...
                                            </c:when>

                                            <c:otherwise>
                                                ${lcroqui.cdCroqui} 100265
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td title="${lcroqui.cdArea}">
                                        <c:choose >
                                            <c:when test="${lcroqui.cdArea.length() > 10 }">
                                                ${lcroqui.cdArea.substring(0,10)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${lcroqui.cdArea} 8M
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td title="${lcroqui.nmReferenciaEndereco}">
                                        <c:choose >
                                            <c:when test="${lcroqui.nmReferenciaEndereco.length() > 30 }">
                                                ${lcroqui.nmReferenciaEndereco.substring(0,30)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${lcroqui.nmReferenciaEndereco} R. Faustino Paganini nº 647 
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td>
                                        <c:choose >
                                            <c:when test="${lcroqui.cdProcesso.length() > 10 }">
                                                ${lcroqui.cdProcesso.substring(0,10)}...
                                            </c:when>

                                            <c:otherwise>
                                                ${lcroqui.cdProcesso} Ofício 49 GV nº 311/2017
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td class="hidden-480" title="${lcroqui.dsAssunto}">
                                        <c:choose >
                                            <c:when test="${lcroqui.dsAssunto.length() > 20 }">
                                                ${lcroqui.dsAssunto.substring(0,20)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${lcroqui.dsAssunto} Solicita incoorporação de praça à escola
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td class="hidden-480" title="${lcroqui.nmInteressado}">
                                        <c:choose>
                                            <c:when test="${lcroqui.nmInteressado.length() > 20}">
                                                ${lcroqui.nmInteressado.substring(0,20)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${lcroqui.nmInteressado} C.M.S.P. - Vereador Toninho Vespoli
                                            </c:otherwise>
                                        </c:choose>
                                    </td>

                                    <td>
                                        <div class="hidden-sm hidden-xs btn-group">
                                            <!-- pagina com a parte de inserir um historico para o croqui/area selecionado-->
                                            <label class="col-sm-2 col-xs-12" >
                                                <input id="id-button-borders" type="checkbox" id="relatorio" name="relatorio" value="${anotCroqui.pkAnotacaoCroqui}" class="ace ace-switch ace-switch-5">
                                                <span class="lbl middle"></span>
                                            </label>                                                                                                                               
                                        </div>
                                    </td>  
                                </tr>
                                <tr>
                                    <td>
                                        <div class=" center action-buttons">
                                            <!-- pagina apenas com os historicos-->  
                                            <a href="AnotacaoCroquiDetalhes.jsp"><i class="ace-icon fa fa-search-plus"></i></a>
                                        </div>
                                    </td>

                                    <td title="${lcroqui.cdCroqui}">
                                        <c:choose >
                                            <c:when test="${lcroqui.cdCroqui.length() > 8 }">
                                                ${lcroqui.cdCroqui.substring(0,7)}...
                                            </c:when>

                                            <c:otherwise>
                                                ${lcroqui.cdCroqui} 100265
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td title="${lcroqui.cdArea}">
                                        <c:choose >
                                            <c:when test="${lcroqui.cdArea.length() > 10 }">
                                                ${lcroqui.cdArea.substring(0,10)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${lcroqui.cdArea} 8M
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td title="${lcroqui.nmReferenciaEndereco}">
                                        <c:choose >
                                            <c:when test="${lcroqui.nmReferenciaEndereco.length() > 30 }">
                                                ${lcroqui.nmReferenciaEndereco.substring(0,30)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${lcroqui.nmReferenciaEndereco} R. Faustino Paganini nº 647 
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td>
                                        <c:choose >
                                            <c:when test="${lcroqui.cdProcesso.length() > 10 }">
                                                ${lcroqui.cdProcesso.substring(0,10)}...
                                            </c:when>

                                            <c:otherwise>
                                                ${lcroqui.cdProcesso} Ofício 49 GV nº 311/2017
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td class="hidden-480" title="${lcroqui.dsAssunto}">
                                        <c:choose >
                                            <c:when test="${lcroqui.dsAssunto.length() > 20 }">
                                                ${lcroqui.dsAssunto.substring(0,20)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${lcroqui.dsAssunto} Solicita incoorporação de praça à escola
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td class="hidden-480" title="${lcroqui.nmInteressado}">
                                        <c:choose>
                                            <c:when test="${lcroqui.nmInteressado.length() > 20}">
                                                ${lcroqui.nmInteressado.substring(0,20)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${lcroqui.nmInteressado} C.M.S.P. - Vereador Toninho Vespoli
                                            </c:otherwise>
                                        </c:choose>
                                    </td>

                                    <td>
                                        <div class="hidden-sm hidden-xs btn-group">
                                            <!-- botao para inserir um ou mais expediente a pagina de relatorio-->
                                            <label class="col-sm-2 col-xs-12" >
                                                <input id="id-button-borders"  type="checkbox" id="relatorio" name="relatorio" value="enviar" class="ace ace-switch ace-switch-5">
                                                <span class="lbl middle"></span>
                                            </label>                                                                                                                               
                                        </div>
                                    </td>  
                                </tr>
                            </tbody>
                        </table>

                        <button class="btn btn-white" type="reset" onclick=" location.href = 'AnotacaoCroquiRelatorio.jsp';">
                            <i class="glyphicon glyphicon-list-alt bigger-110"></i>
                            Gerar relatorio
                        </button> 

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
                                                <a href="ControllerServlet?acao=AnotacaoCroquiLista&pg=${i}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&qInteressado=${qInteressado}&qNome=${qNome}&qEndereco=${qEndereco}&qAssunto=${qAssunto}&dtIni=${dtIni}&dtFim=${dtFim}">
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
                                                        <a href="ControllerServlet?acao=AnotacaoCroquiLista&pg=${i}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&qInteressado=${qInteressado}&qNome=${qNome}&qEndereco=${qEndereco}&qAssunto=${qAssunto}&dtIni=${dtIni}&dtFim=${dtFim}">${i}</a>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                        <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                            <li>
                                                <a href="ControllerServlet?acao=AnotacaoCroquiLista&pg=${i}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&qInteressado=${qInteressado}&qNome=${qNome}&qEndereco=${qEndereco}&qAssunto=${qAssunto}&dtIni=${dtIni}&dtFim=${dtFim}">
                                                    <i class="ace-icon fa fa-angle-double-right"></i></a>
                                            </li>
                                        </c:if>    
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>

                        <div class="col-sm-12 " >
                            <button class="btn btn-yellow right" type="reset" onclick=" location.href = 'AnotacaoCroqui.jsp';">
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
