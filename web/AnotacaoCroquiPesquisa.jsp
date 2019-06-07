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
            <jsp:include page = "include/maskProcessoSelect.jsp" />
            
            
            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Anotação Croqui </li>
                </ul>
            </div>

            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12 col-md-12">
                        <div class="form-actions col-sm-12 col-xs-12">
                            <h4 class="widget-title ">Anotação Croqui</h4>
                            <form action="ControllerServlet?acao=AnotacaoCroquiPesquisa" method="POST">
                                <input type="hidden" name="primeiro" value="false" />
                                <div class="form-group col-md-offset-1">
                                    <label class="inline col-md-2 col-xs-12">
                                        <span class="lbl">Tipo de Expediente:</span>
                                    </label>
                                    <label class="input-group col-md-2 col-xs-12">
                                        <select name="sgTpExpediente" id="sgTpExpediente" placeholder="" class="col-md-10 col-xs-12" 
                                                onchange="limpaCampoNrProcesso(this)" required="required">
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
                                        <input type="text" class="col-md-7 col-xs-12" name="cdExpediente" id="nrprocesso" value="${anotCroqui.cdExpediente}" 
                                               placeholder="Nº do Expediente" required="required" onblur="maskProcessoSelect(this);"> 
                                        &nbsp;<span id="msgProcesso"></span>
                                    </label>
                                </div>
                                <div class="form-group col-md-offset-8">
                                    <button type="submit" id="btnExecutarAcao" class="btn btn-inverse btn-white" onclick="maskProcessoSelect(this);">
                                        <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                                        Pesquisa
                                    </button>
                                </div>    
                            </form>     
                        </div>


                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th class="center detail-col">Detalhes</th>
                                    <th>Expediente</th>
                                    <th>Croqui </th>
                                    <th>Área </th>
                                    <th>Interessado</th>
                                    <th class="hidden-480">Endereço </th>
                                    <th></th>
                                </tr>
                            </thead>
                            <c:forEach var="croqui" items="${listAnotCroqui}">
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class=" center action-buttons">
                                                <a href="ControllerServlet?acao=AnotacaoCroquiDetalhe&pkAnotacaoExpediente=${croqui.pkAnotacaoExpediente}&execucao=view"><i class="ace-icon fa fa-search-plus"></i></a>
                                            </div>
                                        </td>
                                        <td title="${croqui.tpExpediente.sgTipoExpediente}">
                                            ${croqui.tpExpediente.sgTipoExpediente}: ${croqui.cdExpediente}
                                        </td>
                                        <td title="${croqui.cdCroqui}">
                                             ${croqui.cdCroqui}
                                        </td>
                                        <td title="${croqui.cdArea}">
                                            ${croqui.cdArea}
                                        </td>
                                        <td title="${croqui.nmInteressado}">
                                            ${croqui.nmInteressado}
                                        </td>
                                        <td class="hidden-480" title="${croqui.endereco.tipo} ${croqui.endereco.titulo} ${croqui.endereco.endereco}, ${croqui.endereco.numero}">
                                            ${croqui.endereco.tipo} ${croqui.endereco.titulo} ${croqui.endereco.endereco}, ${croqui.endereco.numero} 
                                        </td>
                                        <td>
                                            <c:if test="${sessionSgDivisao == 'DDPI' &&  sessionSgSetor == 'SCL' || sessionPerfil == 'Administrador'}">
                                                <div class="hidden-sm hidden-xs btn-group">
                                                    <button class="btn btn-xs btn-success"  onclick="location.href = 'ControllerServlet?acao=AnotacaoCroquiDetalhe&pkAnotacaoExpediente=${croqui.pkAnotacaoExpediente}&execucao=duplicate'">
                                                        <i class="ace-icon fa fa-plus bigger-120"></i>
                                                        Novo
                                                    </button>                                                                                                                                
                                                </div>
                                            </c:if> 
                                        </td>
                                    </tr>
                                </tbody>
                            </c:forEach>
                        </table>
                          
                        <form action="ControllerServlet?acao=AnotacaoCroquiPesquisa" method="POST">
                            <input type="hidden" name="execucao" value="insert" />
                            <input type="hidden" name="sgTpExpediente" value="${sgTpExpediente}" />
                            <input type="hidden" name="cdExpediente" value="${cdExpediente}" />
                            <div class="col-md-offset-2 col-md-8 alert alert-block alert-warning " style="visibility:${alert}" >
                                <p>
                                    <strong>
                                        <i class="ace-icon fa fa-warning"></i>
                                        Não encontrado!
                                    </strong>
                                    A pesquisa não encontro nenhum expediente para o <strong><c:out value="${sgTpExpediente}"/>: <c:out value="${cdExpediente}"/></strong>
                                </p>
                                <p>
                                    <button class="btn btn-sm btn-success" type="submit" >
                                        Inserir um novo
                                    </button>

                                </p>
                            </div>
                        </form>
                        <c:forEach var="a" items="${lisPkAnotCroqui}" >
                            <h1>${a.pkAnotacaoExpediente}</h1>
                        </c:forEach>   
                         
                                
                        <div class="space-20"></div>        
                        <hr class="col-md-11"> <!--linha de separação -->
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
                                                <a href="ControllerServlet?acao=AnotacaoCroquiPesquisa&pg=${i}&pi=${pi}&pf=${pf}&sgTpExpediente=${sgTpExpediente}&cdExpediente=${cdExpediente}">
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
                                                        <a href="ControllerServlet?acao=AnotacaoCroquiPesquisa&pg=${i}&pi=${pi}&pf=${pf}&sgTpExpediente=${sgTpExpediente}&cdExpediente=${cdExpediente}">${i}</a>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                        <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                            <li>
                                                <a href="ControllerServlet?acao=AnotacaoCroquiPesquisa&pg=${i}&pi=${pi}&pf=${pf}&sgTpExpediente=${sgTpExpediente}&cdExpediente=${cdExpediente}">
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
