<%-- 
    Document   : PesquisaSic
    Created on : 23/01/2019, 15:17:29
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
            <jsp:useBean id="expe" class= "br.com.Modelo.AnotacaoExpedienteDAO"/>
            
            
            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="qtdPg" value="${param.qtdPg}" />
            <c:set var="totalRes" value="${param.totalRes}" />

            
            
            <c:set var="qCroqui" value="${param.qCroqui}" />
            <c:set var="qArea" value="${param.qArea}" />
            <c:set var="qNome" value="${param.qNome}" />
            <c:set var="qEndereco" value="${param.qEndereco}" />
            <c:set var="qAssunto" value="${param.qAssunto}" />
            <c:set var="dtIni" value="${param.dtIni}" />
            <c:set var="dtFim" value="${param.dtFim}" />
            
            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Informações Anotação Expediente</li>
                </ul>
            </div>

            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12 col-md-12">


                        <div class="form-actions col-sm-12 col-xs-12">
                            <h4 class="widget-title "><strong>Filtros</strong></h4>
                            <form class="form-search" action="ControllerServlet?acao=AnotacaoExpedienteLista" method="POST">
                                
                                <label class="col-sm-2 col-xs-1 "> Croqui:</label>
                                <div class="input-group col-sm-2 col-xs-12">
                                    <input type="text" name="qCroqui" placeholder="${qCroqui}" class="col-sm-7 col-xs-12" />
                                </div>
                                
                                <label class="col-sm-1 col-xs-1 "> Área:</label>
                                <div class="input-group col-sm-2 col-xs-12">
                                    <input type="text" name="qArea" placeholder="${qArea}" class="col-sm-7 col-xs-12" />
                                </div>
                               
                                <label class="col-sm-1 col-xs-12"> Autor:</label>
                                <div class="input-group col-sm-4 col-xs-12">
                                    <select name="qNome" placeholder="" class="col-sm-5 col-xs-12" >
                                        <option></option>
                                        <c:forEach var="lis" items="${expe.listNome()}">
                                            <c:if test="${lis.nmNome != ''}">
                                                <option>${lis.nmNome}</option>
                                            </c:if>
                                        </c:forEach>
                                    </select>
                                </div>
                                
                                <br /> <br />
                                <label class="col-sm-2 col-xs-1 "> Endereço:</label>
                                <div class="input-group col-sm-4 col-xs-12">
                                    <input type="text" name="qEndereco" placeholder="${qEndereco}" class="col-sm-12 col-xs-12" />
                                </div>
                                
                                <label class="col-sm-1 col-xs-12" >Assunto:</label>
                                <div class="input-group col-sm-3 col-xs-12">
                                    <input type="text" name="qAssunto" placeholder="${qAssunto}" class="col-sm-12 col-xs-12 " />
                                </div>
                                <br /> <br />
                                
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
                                
                                 
                                
                               
                               
                                
                            </form>    
                        </div>
                
                        <div class="space-10" ></div>    

                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th class="detail-col">Detalhes</th>
                                    <th class="hidden-480">Data</th>
                                    <th>Croqui</th>
                                    <th>Área </th>
                                    <th>Endereço </th>
                                    <th>Processo</th>
                                    <th class="hidden-480">Assunto </th>
                                    <th class="hidden-480">Autor </th>
                                </tr>
                            </thead>

                            <c:forEach var="listExp" items="${listExpediente}">
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class="action-buttons ">
                                                <a href="ControllerServlet?acao=AnotacaoExpedienteCRU&=${listExp.pkAnotacaoExpediente}&pg=${pg}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&qNome=${qNome}&qEndereco=${qEndereco}&qAssunto=${qAssunto}&dtIni=${dtIni}&dtFim=${dtFim}&execucao=view"><i class="ace-icon fa fa-search-plus"></i></a>
                                            </div>
                                        </td>
                                        <td>
                                            <c:set var = "dt" value = "${listExp.dtData}" />
                                            <fmt:parseDate value = "${dt}" var = "converteDT" pattern="yyyy-MM-dd" />
                                            <fmt:formatDate type= "date" value="${converteDT}" var="dtAtu"/>
                                            <c:out value="${dtAtu}"/>
                                        </td>         
                                        <td title="${listExp.cdCroqui}">
                                            <c:choose >
                                                <c:when test="${listExp.cdCroqui.length() > 8 }">
                                                    ${listExp.cdCroqui.substring(0,7)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${listExp.cdCroqui}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td title="${listExp.cdArea}">
                                            <c:choose >
                                                <c:when test="${listExp.cdArea.length() > 10 }">
                                                    ${listExp.cdArea.substring(0,10)}...
                                                </c:when>
                                                <c:otherwise>
                                                    ${listExp.cdArea}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td title="${listExp.dsLocal}">
                                            <c:choose >
                                                <c:when test="${listExp.dsLocal.length() > 30 }">
                                                    ${listExp.dsLocal.substring(0,30)}...
                                                </c:when>
                                                <c:otherwise>
                                                    ${listExp.dsLocal}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td>
                                            <c:choose >
                                                <c:when test="${listExp.cdProcesso.length() > 10 }">
                                                    ${listExp.cdProcesso.substring(0,10)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${listExp.cdProcesso}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td class="hidden-480" title="${listExp.dsAssunto}">
                                            <c:choose >
                                                <c:when test="${listExp.dsAssunto.length() > 20 }">
                                                    ${listExp.dsAssunto.substring(0,20)}...
                                                </c:when>
                                                <c:otherwise>
                                                    ${listExp.dsAssunto}
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td class="hidden-480" title="${listExp.nmNome}">
                                            <c:choose >
                                                <c:when test="${listExp.nmNome.length() > 10 }">
                                                    ${listExp.nmNome.substring(0,10)}...
                                                </c:when>

                                                <c:otherwise>
                                                    ${listExp.nmNome}
                                                </c:otherwise>
                                            </c:choose>
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
                                    <a href="ControllerServlet?acao=AnotacaoExpedienteLista&pg=${i}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&qNome=${qNome}&qEndereco=${qEndereco}&qAssunto=${qAssunto}&dtIni=${dtIni}&dtFim=${dtFim}">
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
                                            <a href="ControllerServlet?acao=AnotacaoExpedienteLista&pg=${i}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&qNome=${qNome}&qEndereco=${qEndereco}&qAssunto=${qAssunto}&dtIni=${dtIni}&dtFim=${dtFim}">${i}</a>
                                        </li>
                                    </c:otherwise>
                                </c:choose>
                            </c:if>
                            <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                <li>
                                    <a href="ControllerServlet?acao=AnotacaoExpedienteLista&pg=${i}&pi=${pi}&pf=${pf}&qCroqui=${qCroqui}&qArea=${qArea}&qNome=${qNome}&qEndereco=${qEndereco}&qAssunto=${qAssunto}&dtIni=${dtIni}&dtFim=${dtFim}">
                                        <i class="ace-icon fa fa-angle-double-right"></i></a>
                                </li>
                            </c:if>    
                        </c:forEach>
                        </ul>
                    </div>
                </div>
                
                <div class="col-sm-12 " >
                    <button class="btn btn-yellow right" type="reset" onclick=" location.href='AnotacaoExpediente.jsp';">
                        <i class="ace-icon fa fa-undo bigger-110"></i>
                        Voltar
                    </button>    
                </div>




        <jsp:include page = "include/footer.jsp" />
        <!-- /.main-container --> 
    </body>
</html>
