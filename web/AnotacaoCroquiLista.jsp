<%-- 
    Document   : AnotacaoCroquiLista
    Created on : 11/03/2019, 11:59:54
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
            <jsp:include page = "include/maskProcessoSelect.jsp" />

            
            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="qtdPg" value="${param.qtdPg}" />
            <c:set var="totalRes" value="${param.totalRes}" />

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Pesquisa de Relatórios</li>
                </ul>
            </div>

            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12 col-md-12">


                        <div class="form-actions col-md-12 col-xs-12">
                            <h4 class="widget-title "><strong>Filtros</strong></h4>
                            <form class="form-search" action="ControllerServlet?acao=AnotacaoCroquiLista" method="POST">

                                <label class="col-md-2 col-xs-12 "> Croqui:</label>
                                <div class="input-group col-md-3 col-xs-12">
                                    <input type="text" name="qCroqui" placeholder="${qCroqui}" class="col-md-3 col-xs-12" 
                                           maxlength="6"/>
                                </div>

                                <label class="col-md-2 col-xs-12 "> Área:</label>
                                <div class="input-group col-md-5 col-xs-12">
                                    <input type="text" name="qArea" placeholder="${qArea}" class="col-md-2 col-xs-12" 
                                           maxlength="4"/>
                                </div>

                                <br /> <br />
                                <label class="inline col-md-2 col-xs-12">
                                    <span class="lbl">Tipo de Expediente:</span>
                                </label>
                                <label class="input-group col-md-3 col-xs-12">
                                    <select name="sgTpExpediente" id="sgTpExpediente" class="col-md-10 col-xs-12" 
                                            onchange="limpaCampoNrProcesso(this)">
                                        <option></option>
                                        <c:forEach var="lis" items="${listaTpExp}">
                                            <c:if test="${lis.sgTipoExpediente != ''}">
                                                <option>${lis.sgTipoExpediente}</option>
                                            </c:if>
                                        </c:forEach>
                                    </select>
                                </label>

                                <label class="input-group col-md-2 col-xs-12" >
                                    <span class="lbl">Nº Expediente:</span>
                                </label>
                                <label class="input-group col-md-5 col-xs-12">
                                    <input type="text" class="col-md-5 col-xs-12" name="cdExpediente" id="nrprocesso" value="${anotCroqui.cdExpediente}" 
                                           placeholder="${cdExpediente}"  onblur="maskProcessoSelect(this);"> 
                                    &nbsp;<span id="msgProcesso"></span>
                                </label>
                                
                                <br /> <br />

                                <label class="col-md-2 col-xs-12" >Assunto:</label>
                                <div class="input-group col-md-3 col-xs-12">
                                    <select name="qAssunto" id="assunto" placeholder="" class="col-md-10 col-xs-12" >
                                        <option></option>
                                        <c:forEach var="lis" items="${listTpAssunto}">
                                            <c:if test="${lis.nmTipoAssunto != ''}">
                                                <option title="${lis.nmTipoAssunto}">${lis.nmTipoAssunto}</option>
                                            </c:if>
                                        </c:forEach>
                                    </select>
                                </div>
                                
                                <label class="col-md-2 col-xs-12 "> Interessado:</label>
                                <div class="input-group col-md-5 col-xs-12">
                                    <input type="text" name="qInteressado" placeholder="${qInteressado}" class="col-md-8 col-xs-12" />
                                </div>
                                <br /> <br />

                                <label class="col-md-2 col-xs-12 "> Endereço:</label>
                                <div class="input-group col-md-10 col-xs-12">
                                    <input type="text" name="qLocal" placeholder="${qLocal}" class="col-md-5 col-xs-12" />
                                </div>
                                <br/><br/>
                                <!--Botoes-->
                                <div class="input-group-btn col-md-4 col-md-offset-7 col-xs-12">
                                    <button type="submit" class="btn btn-inverse btn-white" id="btnExecutarAcao">
                                        <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                                        Pesquisa
                                    </button>
                                </div>     
                                
                            </form>    
                        </div>

                        <div class="space-10" ></div>    

                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th class="center detail-col">Detalhes</th>
                                    <th>Croqui</th>
                                    <th>Área </th>
                                    <th>Expediente </th>
                                    <th>Assunto </th>
                                    <th class="hidden-480">Interessado </th>
                                    <th class="hidden-480">Endereço</th>
                                    <th></th>
                                </tr>
                            </thead>

                            <c:forEach var="a" items="${listAntCroqui}">
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class=" center action-buttons">
                                                <a href="ControllerServlet?acao=AnotacaoCroquiDetalhe&pkAnotacaoExpediente=${a.pkAnotacaoExpediente}&execucao=view"><i class="ace-icon fa fa-search-plus"></i></a>
                                            </div>
                                        </td>

                                        <td title="${a.cdCroqui}">
                                            ${a.cdCroqui}
                                        </td>
                                        <td title="${a.cdArea}">
                                            ${a.cdArea}
                                        </td>
                                        <td title="${a.tpExpediente.sgTipoExpediente} ${a.cdExpediente}">
                                             <c:choose >
                                                <c:when test="${a.cdExpediente.length() > 13 }">
                                                    ${a.tpExpediente.sgTipoExpediente} ${a.cdExpediente.substring(0,13)}...
                                                </c:when>
                                                <c:otherwise>
                                                   ${a.tpExpediente.sgTipoExpediente} ${a.cdExpediente}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td title="${a.tpAssunto.nmTipoAssunto}">
                                            <c:choose >
                                                <c:when test="${a.tpAssunto.nmTipoAssunto.length() > 18 }">
                                                     ${a.tpAssunto.nmTipoAssunto.substring(0,18)}...
                                                </c:when>
                                                <c:otherwise>
                                                    ${a.tpAssunto.nmTipoAssunto}
                                                </c:otherwise>
                                            </c:choose>
                                            
                                        </td>
                                        <td class="hidden-480" title=" ${a.nmInteressado}">
                                            <c:choose >
                                                <c:when test="${a.nmInteressado.length() > 18 }">
                                                    ${a.nmInteressado.substring(0,18)}...
                                                </c:when>
                                                <c:otherwise>
                                                     ${a.nmInteressado}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td class="hidden-480" title="${a.dsLocal}">
                                            <c:choose >
                                                <c:when test="${a.dsLocal.length() > 25 }">
                                                    ${a.dsLocal.substring(0,25)}...
                                                </c:when>
                                                <c:otherwise>
                                                    ${a.dsLocal}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td>
                                            <c:if test="${sessionSgDivisao == 'DDPI' &&  sessionSgSetor == 'SCL' || sessionPerfil == 'Administrador'}">
                                                <div class="hidden-sm hidden-xs btn-group">
                                                    <button class="btn btn-xs btn-info"  onclick="location.href = 'ControllerServlet?acao=AnotacaoCroquiDetalhe&pkAnotacaoExpediente=${a.pkAnotacaoExpediente}&execucao=edit'">
                                                        <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                        Editar
                                                    </button>                                                                                                                                
                                                </div>
                                            </c:if>
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
                                                <a href="ControllerServlet?acao=AnotacaoCroquiLista&pg=${i}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&sgTpExpediente=${sgTpExpediente}&cdExpediente=${cdExpediente}&qAssunto=${qAssunto}&qInteressado=${qInteressado}&qLocal=${qLocal}">
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
                                                        <a href="ControllerServlet?acao=AnotacaoCroquiLista&pg=${i}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&sgTpExpediente=${sgTpExpediente}&cdExpediente=${cdExpediente}&qAssunto=${qAssunto}&qInteressado=${qLocal}&dtIni=${qLocal}">${i}</a>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                        <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                            <li>
                                                <a href="ControllerServlet?acao=AnotacaoCroquiLista&pg=${i}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&sgTpExpediente=${sgTpExpediente}&cdExpediente=${cdExpediente}&qAssunto=${qAssunto}&qInteressado=${qInteressado}&qLocal=${qLocal}">
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
