<%-- 
    Document   : CapPublicacao
    Created on : 19/02/2019, 10:33:58
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
            <jsp:useBean id="capPubli" class= "br.com.Modelo.CapPublicacaoDAO"/>

            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="qtdPg" value="${param.qtdPg}" />
            <c:set var="totalRes" value="${param.totalRes}" />

            <c:set var="qCodCap" value="${param.qCodCap}" />
            <c:set var="dtIni" value="${param.dtIni}" />
            <c:set var="dtFim" value="${param.dtFim}" />

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Publicação de CAP</li>
                </ul>
            </div>

            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12 col-md-12">

                        <div class="form-actions col-sm-12 col-xs-12">
                            <h4 class="widget-title "><strong>CAP para Publicar</strong></h4>
                            <form class="form-search" action="ControllerServlet?acao=CapPublicacaoLista" method="POST">

                                <br/>
                                <div class="form-group">
                                    <label class="col-sm-2 col-xs-12 "> Codigo do CAP:</label>
                                    <div class="input-group col-sm-3 col-xs-12">
                                        <input type="text" name="qCodCap" placeholder="${qCodCap}" class="col-sm-7 col-xs-12" />
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
                                    <div class="input-group col-sm-2 col-xs-12">
                                        <input class="form-control" name="dtFim" placeholder="${dtFim}" type="date" data-date-format="dd/mm/yyyy" >
                                        <span class="input-group-addon">
                                            <i class="fa fa-calendar bigger-110"></i>
                                        </span>
                                    </div>

                                    <!--Botoes-->
                                    <div class="input-group-btn col-sm-4 col-sm-offset-1 col-xs-12">
                                        <button type="submit" class="btn btn-inverse btn-white">
                                            <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                                            Pesquisa
                                        </button>
                                    </div>     
                                    <br/><br/>
                                </div>
                            </form>    

                            <div class="space-10" ></div>    

                            <table id="simple-table" class="table  table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th class="center detail-col">Detalhes</th>
                                        <th class="hidden-480">Data</th>
                                        <th>CAP</th>
                                        <th>Publicar CAP</th>

                                    </tr>
                                </thead>

                                <c:forEach var="listPubli" items="${listPublicacao}">

                                    <tbody>
                                        <tr>
                                            <td>
                                                <div class=" center action-buttons">
                                                    <a href="ControllerServlet?acao=CapPublicacaoListaDetalhe&pkAnotacaoExpediente=${listPubli.pkAnotacaoExpediente}&pg=${pg}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&qInteressado=${qInteressado}&qNome=${qNome}&qEndereco=${qEndereco}&qAssunto=${qAssunto}&dtIni=${dtIni}&dtFim=${dtFim}&execucao=view"><i class="ace-icon fa fa-search-plus"></i></a>
                                                </div>

                                            </td>
                                            <td>
                                                <a>Data do CAP</a>

                                                <c:set var = "dt" value = "${listPubli.dataCri}" />
                                                <fmt:parseDate value = "${dt}" var="converteDT" pattern="yyyy-MM-dd" />
                                                <fmt:formatDate type= "date" value="${converteDT}" var="dtAtu"/>
                                                <c:out value="${dtAtu}"/>
                                            </td>     

                                            <td title=""> 
                                                <a>Código do CAP</a>
                                            </td>

                                            <td class="hidden-480" title="${listPubli.qCodCap}">                                             
                                                <label class="pull-left inline">
                                                    <input id="id-button-borders"  type="checkbox" id="" name="nomeTec" value="true" class="ace ace-switch ace-switch-5"  >
                                                    <span class="lbl middle"></span>
                                                </label>                                         
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
                                            <c:if test="${pi != 0 && pi == i}">
                                                <li>
                                                    <a href="ControllerServlet?acao=CapPublicacaoLista&pg=${i}&pi=${pi}&pf=${pf}&qCodCap=${qCodCap}&dtIni=${dtIni}&dtFim=${dtFim}">
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
                                                            <a href="ControllerServlet?acao=CapPublicacaoLista&pg=${i}&pi=${pi}&pf=${pf}&qCodCap=${qCodCap}&dtIni=${dtIni}&dtFim=${dtFim}">${i}</a>
                                                        </li>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:if>
                                            <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                                <li>
                                                    <a href="ControllerServlet?acao=CapPublicacaoLista&pg=${i}&pi=${pi}&pf=${pf}&qCodCap=${qCodCap}&dtIni=${dtIni}&dtFim=${dtFim}">
                                                        <i class="ace-icon fa fa-angle-double-right"></i></a>
                                                </li>
                                            </c:if>    
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div>
                            <div class="form-actions col-xs-12">
                                <button class="btn btn-yellow right" type="reset" onclick=" location.href = 'Cap.jsp';">
                                    <i class="ace-icon fa fa-undo bigger-110"></i>
                                    Voltar
                                </button>    

                                <button class="btn btn-inverse right" type="" onclick=" location.href = 'CapPublicacao.jsp';">
                                    <i class="glyphicon glyphicon-cloud-upload"></i>
                                    Publicar
                                </button>
                            </div>

                        </div>
                    </div>
                    <jsp:include page = "include/footer.jsp" />
                </div>
            </div>
        </div><!-- /.main-container --> 
    </body>
</html>
