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

            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />

            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="qtdPg" value="${param.qtdPg}" />
            <c:set var="totalRes" value="${param.totalRes}" />

            <c:set var="cdProcesso" value="${param.cdProcesso}" />
            <c:set var="nmInteressado" value="${param.nmInteressado}" />
            <c:set var="nmAssunto" value="${param.nmAssunto}" />

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Informações </li>
                </ul>
            </div>

            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12 col-md-12">

                        <div class="form-actions col-sm-12 col-xs-12">
                            <h4 class="widget-title "><strong>Filtros</strong></h4>
                            <form class="form-search" action="ControllerServlet?acao=AnotacaoCroquiLista" method="POST">

                                <label class="col-xs-2 col-xs-12">Origem:</label>
                                <div class="input-group col-xs-6 col-xs-12">
                                    <input type="text" name="Origem" placeholder="${origem}" class="col-xs-8 col-xs-12"/>
                                </div>

                                <br/> <br/>

                                <label class="col-sm-2 col-xs-12 "> Endereço:</label>
                                <div class="input-group col-sm-6 col-xs-12">
                                    <input type="text" name="qEndereco" placeholder="${qEndereco}" class="col-sm-8 col-xs-12" />
                                </div>

                                <br /> <br />


                                <label class="col-sm-2 col-xs-12 "> Processo:</label>
                                <div class="input-group col-sm-5 col-xs-12">
                                    <input type="text" name="qEndereco" placeholder="${qEndereco}" class="col-sm-4 col-xs-12" />
                                </div>

                                <br/> <br/>

                                <label class="col-sm-2 col-xs-12" >Assunto:</label>
                                <div class="input-group col-sm-6 col-xs-12">
                                    <input type="text" name="qAssunto" placeholder="${qAssunto}" class="col-sm-8 col-xs-12 " />
                                </div>
                                <br /> <br />

                                <label class="col-sm-2 col-xs-12 "> Interessado:</label>
                                <div class="input-group col-sm-6 col-xs-12">
                                    <input type="text" name="qInteressado" placeholder="${qInteressado}" class="col-sm-8 col-xs-12" />
                                </div>

                                </
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
                                    <th>Origem</th>
                                    <th>Endereço </th>
                                    <th>Processo</th>
                                    <th class="hidden-480">Assunto </th>
                                    <th class="hidden-480">Interessado </th>
                                    <th></th>
                                </tr>
                            </thead>

                            <c:forEach var="lcroqui" items="${MP}">
                            </c:forEach>

                            <tbody>
                                <tr>
                                    <td>
                                        <div class=" center action-buttons">
                                            <!-- pagina apenas com os historicos-->  
                                            <a href=""><i class="ace-icon fa fa-search-plus"></i></a>
                                        </div>
                                    </td>

                                    <td title="${MP.Origem}">
                                        <c:choose >
                                            <c:when test="${MP.Origem.length() > 8 }">
                                                ${MP.Origem.substring(0,7)}...
                                            </c:when>

                                            <c:otherwise>
                                                ${MP.Origem} Subpreitura
                                            </c:otherwise>
                                        </c:choose>
                                    </td>

                                    <td title="${mp.Endereco}">
                                        <c:choose >
                                            <c:when test="${mp.Endereco.length() > 30 }">
                                                ${mp.Endereco.substring(0,30)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${mp.Endereco} Av 23 de maio
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td>
                                        <c:choose >
                                            <c:when test="${mp.Processo.length() > 10 }">
                                                ${mp.Processo.substring(0,10)}...
                                            </c:when>

                                            <c:otherwise>
                                                ${mp.Processo} 0000.0000.0000-4
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td class="hidden-480" title="${mp.Assunto}">
                                        <c:choose >
                                            <c:when test="${mp.Assunto.length() > 20 }">
                                                ${mp.Assunto}.substring(0,20)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${mp.Assunto} Qualquer um
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td class="hidden-480" title="${mp.Interessado}">
                                        <c:choose>
                                            <c:when test="${mp.Interessado.length() > 20}">
                                                ${mp.Interessado.substring(0,20)}...
                                            </c:when>
                                            <c:otherwise>
                                                ${mp.Interessado}  Prefeito tal
                                            </c:otherwise>
                                        </c:choose>
                                    </td>

                                    <td>
                                        <div class="hidden-sm hidden-xs btn-group">
                                            <!-- pagina com a parte de inserir um historico para o croqui/area selecionado-->
                                            <button class="btn btn-xs btn-info"  onclick="location.href = 'MinisterioPublico.jsp'">
                                                <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                edit
                                            </button>                                                                                                                                
                                        </div>
                                    </td>  

                                </tr>
                            </tbody>


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
