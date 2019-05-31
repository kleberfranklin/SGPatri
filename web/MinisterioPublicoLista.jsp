<%-- 
    Document   : MinisterioPublicoLista
    Created on : 12/03/2019, 16:56:33
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

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Informações </li>
                </ul>
            </div>

            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12 col-sm-12">

                        <div class="form-actions col-sm-12 col-xs-12">
                            <h4 class="widget-title "><strong>Filtros</strong></h4>
                            <form class="form-search" action="ControllerServlet?acao=MinisterioPublicoLista" method="POST">

                                <label class="col-sm-3 col-xs-12">Origem:</label>
                                <div class="input-group col-sm-6 col-xs-12">
                                    <input type="text" name="nmOrigem" placeholder="<c:out value="${nmOrigem}" />" class="col-sm-8 col-xs-12"/>
                                </div>

                                <br/> <br/>

                                <label class="col-sm-3 col-xs-12 ">Endereço:</label>
                                <div class="input-group col-sm-6 col-xs-12">
                                    <input type="text" name="dsEndereco" placeholder="<c:out value="${dsEndereco}" />" class="col-sm-8 col-xs-12" />
                                </div>

                                <br/><br/>

                                <label class="col-sm-3 col-xs-12" >Assunto:</label>
                                <div class="input-group col-sm-6 col-xs-12">
                                    <input type="text" name="dsAssunto" placeholder="<c:out value="${dsAssunto}" />" class="col-sm-8 col-xs-12 " />
                                </div>

                                <br /> <br />

                                <label class="col-sm-3 col-xs-12 ">Interessado:</label>
                                <div class="input-group col-sm-9 col-xs-12">
                                    <input type="text" name="nmSolicitado" placeholder="<c:out value="${nmSolicitado}" />" class="col-sm-4 col-xs-12" />
                                </div>

                                <br/><br/>

                                <label class="col-sm-3 col-xs-12 ">Procedimento/Autos/I.C.:</label>
                                <div class="input-group col-sm-6 col-xs-12">
                                    <input type="text" name="nrProcedimento" placeholder="<c:out value="${nrProcedimento}" />" class="col-sm-4 col-xs-12" />
                                </div>

                                <br/><br/>

                                <label class="col-sm-3 col-xs-12 ">Período da resposta:</label>
                                <div class="input-group col-sm-1 col-xs-12 ">
                                    <input class="form-control" name="dtIni" placeholder="<c:out value="${dtIni}"/>" type="date" data-date-format="dd/mm/yyyy" />
                                    <span class="input-group-addon">
                                        <i class="fa fa-calendar bigger-110"></i>
                                    </span>
                                </div>

                                <div class="col-sm-1"></div>
                                <div class="input-group col-sm-1 col-xs-12">
                                    <input class="form-control" name="dtFim" placeholder="<c:out value="${dtFim}"/>" type="date" data-date-format="dd/mm/yyyy" />
                                    <span class="input-group-addon">
                                        <i class="fa fa-calendar bigger-110"></i>
                                    </span>
                                </div>
                                <div class="space-2"></div>

                                <br/><br/>

                                <label class="col-sm-3 col-xs-12 ">Nº Oficio de Resposta:</label>
                                <div class="input-group col-sm-5 col-xs-12">
                                    <input type="text" name="cdOficioResposta" placeholder="<c:out value="${cdOficioResposta}" />" class="col-sm-4 col-xs-12" />
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

                        <table id="simple-table" class="table table-bordered table-hover ">
                            <thead>
                                <tr>
                                    <th class="center detail-col">Detalhes</th>
                                    <th>Origem</th>
                                    <th class="hidden-480">Endereço</th>
                                    <th class="hidden-480">Assunto</th>
                                    <th >Nº Procedimento/ Autos/ I.C.</th>
                                    <th>Interessado</th>
                                    <th>Data Resposta</th>
                                    <th>Nº Oficio</th>
                                        <c:if test="${sessionSgDivisao == 'GAB' || sessionPerfil == 'Administrador'}">
                                        <th></th>
                                        </c:if>
                                </tr>
                            </thead>

                            <c:forEach var="listMp" items="${listMinistPublico}">
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class=" center action-buttons">
                                                <a href="ControllerServlet?acao=MinisterioPublicoDetalhe&pkMinisterioPublico=${listMp.pkMinisterioPublico}&execucao=view"><i class="ace-icon fa fa-search-plus"></i></a>
                                            </div>
                                        </td>

                                        <td title="${listMp.nmOrigem}">
                                            <c:choose>
                                                <c:when test="${listMp.nmOrigem.length() > 10 }">
                                                    ${listMp.nmOrigem.substring(0,10)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${listMp.nmOrigem}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <td class="hidden-480" title="${listMp.dsEndereco}">
                                            <c:choose >
                                                <c:when test="${listMp.dsEndereco.length() > 10 }">
                                                    ${listMp.dsEndereco.substring(0,10)}...
                                                </c:when>
                                                <c:otherwise>
                                                    ${listMp.dsEndereco}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <td class="hidden-480" title="${listMp.dsAssunto}">
                                            <c:choose >
                                                <c:when test="${listMp.dsAssunto.length() > 10 }">
                                                    ${listMp.dsAssunto.substring(0,10)}...
                                                </c:when>
                                                <c:otherwise>
                                                    ${listMp.dsAssunto}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <td title="${listMp.nrProcedimento}">
                                            <c:choose>
                                                <c:when test="${listMp.nrProcedimento.length() > 10}">
                                                    ${listMp.nrProcedimento.substring(0,10)}...
                                                </c:when>
                                                <c:otherwise>
                                                    ${listMp.nrProcedimento}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <td title="${listMp.nmSolicitado}">
                                            <c:choose >
                                                <c:when test="${listMp.nmSolicitado.length() > 30 }">
                                                    ${listMp.nmSolicitado.substring(0,30)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${listMp.nmSolicitado}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <td title="${listMp.dtResposta}">
                                            ${listMp.dtResposta}
                                        </td>

                                        <td title="${listMp.cdOficioResposta}">
                                            <c:choose>
                                                <c:when test="${listMp.cdOficioResposta.length() > 15}">
                                                    ${listMp.cdOficioResposta.substring(0,15)}...
                                                </c:when>
                                                <c:otherwise>
                                                    ${listMp.cdOficioResposta}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>

                                        <c:if test="${sessionSgDivisao == 'GAB' || sessionPerfil == 'Administrador'}">
                                            <td>
                                                <button class="btn btn-xs btn-info" onclick="location.href = 'ControllerServlet?acao=MinisterioPublicoDetalhe&pkMinisterioPublico=${listMp.pkMinisterioPublico}&execucao=edit'">
                                                    <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                    editar
                                                </button>                                                                                                                                
                                                </div>
                                            </td>  
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
                                                <a href="ControllerServlet?acao=MinisterioPublicoLista&pg=${i}&pi=${pi}&pf=${pf}&nmOrigem=${nmOrigem}&dsEndereco=${dsEndereco}&cdProcesso=${cdProcesso}&dsAssunto=${dsAssunto}&nrProcedimento=${nrProcedimento}">
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
                                                        <a href="ControllerServlet?acao=MinisterioPublicoLista&pg=${i}&pi=${pi}&pf=${pf}&nmOrigem=${nmOrigem}&dsEndereco=${dsEndereco}&cdProcesso=${cdProcesso}&dsAssunto=${dsAssunto}&nrProcedimento=${nrProcedimento}">${i}</a>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                        <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                            <li>
                                                <a href="ControllerServlet?acao=MinisterioPublicoLista&pg=${i}&pi=${pi}&pf=${pf}&nmOrigem=${nmOrigem}&dsEndereco=${dsEndereco}&cdProcesso=${cdProcesso}&dsAssunto=${dsAssunto}&nrProcedimento=${nrProcedimento}">
                                                    <i class="ace-icon fa fa-angle-double-right"></i></a>
                                            </li>
                                        </c:if>    
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>

                        <div class="col-sm-12 " >
                            <button class="btn btn-yellow right" type="reset" onclick=" location.href = 'MinisterioPublico.jsp';">
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
