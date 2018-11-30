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
        

    <jsp:useBean id="tpAuto" class= "br.com.Modelo.TipoAutoCessaoDAO" />
    
    
    
    <c:set var="ter" value="${param.ter}" />
    <c:set var="pg" value="${param.pg}" />
    <c:set var="pf" value="${param.pf}" />
    <c:set var="pi" value="${param.pi}" />
    <c:set var="qtdPg" value="${param.qtdPg}" />
    <c:set var="totalRes" value="${param.totalRes}" />
    <c:set var="qTpcessao" value="${param.qTpcessao}" />
    <c:set var="qProcesso" value="${param.qProcesso}" />
    <c:set var="qCessionario" value="${param.qCessionario}" />
    <c:set var="qEndereco" value="${param.qEndereco}" />
    <c:set var="qVigor" value="${param.qVigor}" />
    <c:set var="qCroqui" value="${param.qCroqui}" />
    
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-list"></i> Auto de Cessão <c:if test="${not empty ter}">Terceiros</c:if></li>
        </ul>
    </div>
        
        
    <div class="page-content">
        <div class="row">
        <div class="col-xs-12 col-md-12">
            
        
            <div class="form-actions col-md-12 col-xs-12">
                <h4 class="widget-title">Filtros</h4>
                <form class="form-search" action="ControllerServlet?acao=AutoCessaoListaPagFiltro" method="POST">
                <c:if test="${not empty ter}"><input type="hidden" value="${ter}" name="ter" /></c:if>
                    
                    <label class="col-sm-2 col-xs-12">Tipo de Cessão </label>
                    <div class="col-sm-3">
                        <select class=" col-xs-12 col-sm-12" name="qTpcessao">
                            <option value=""></option>
                            <c:forEach var="tp" items="${tpAuto.listSelectTpCessao()}">
                                <c:choose >
                                    <c:when test="${to.nmCatAutoCessao.length() > 40 }">
                                        <option value="${tp.pkTipoAutoCessao}" title="${tp.nmTipoAutoCessao}">${tp.nmTipoAutoCessao.substring(0,40)}</option>
                                    </c:when>
                                    <c:otherwise>
                                        <option value="${tp.pkTipoAutoCessao}" title="${tp.nmTipoAutoCessao}">${tp.nmTipoAutoCessao}</option>
                                    </c:otherwise>
                                </c:choose>
                            </option>  
                            </c:forEach>
                        </select>
                    </div>
                
                <label class="col-sm-1 col-xs-12 "> A/C nº: </label>
                <div class="col-sm-2 col-xs-12">
                    <input type="text" name="qAC" placeholder="nº do A/C" class="col-xs-10 col-sm-12" />
                </div>     
                
                <label class="col-sm-1 col-xs-12 "> Processo: </label>
                <div class="col-sm-2 col-xs-12">
                    <input type="text" name="qProcesso" placeholder="nº do processo" class="col-xs-10 col-sm-12" />
                </div>
               
                
                <br /><br />
                <c:choose>
                    <c:when test="${empty ter}">
                        <label class="col-sm-2 col-xs-12" > Cessionário:</label>
                        <div class="col-sm-3 col-xs-12">
                            <input type="text" name="qCessionario" placeholder="nome do cessionário" class="col-xs-10 col-sm-12" />
                        </div>
                    </c:when>
                    <c:otherwise>
                        <label class="col-sm-2 col-xs-12" > Cedente:</label>
                        <div class="col-sm-3 col-xs-12">
                            <input type="text" name="qCessionario" placeholder="nome do cessionário" class="col-xs-10 col-sm-12" />
                        </div>
                    </c:otherwise>
                </c:choose>
                <label class="col-sm-1 col-xs-12 la"> Local </label>
                <div class="col-sm-5 col-xs-12">
                    <input type="text" name="qEndereco" placeholder="endereço" class="col-xs-10 col-sm-12" />
                </div>    
                <br /><br />
                <label class="col-sm-2 col-xs-12 la"> Croqui </label>
                <div class="col-sm-3 col-xs-12">
                    <input type="text" name="qCroqui" placeholder="nº do croqui" class="col-xs-10 col-sm-12" />
                </div>
                <label class="col-sm-1 col-xs-12"> Em Vigor </label>
                <div class="col-sm-3 col-xs-12">
                    <select class="col-sm-4 col-xs-12" name="qVigor">
                        <option value=""> </option>
                        <option value="true">Sim</option>
                        <option value="false">Não</option>
                    </select>
                    <span class="input-group-btn col-sm-6 col-sm-offset-6">
                        <button type="submit" class="btn btn-inverse btn-white" title="duplo clik limpa pesquisa">
                            <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                            Pesquisa
                        </button>
                    </span>
                </div>
            </form>
            <div class="space-10" ></div>    
            </div>
            
            
                <table id="simple-table" class="table  table-bordered table-hover">
                    <thead>
                        <tr>
                            <th class="detail-col hidden-480">Detalhes</th>
                            <th class="hidden-480">AC</th>
                            <th>Processo</th>
                            <th>Tipo de Cessão</th>
                            <th class="hidden-480">Cessionário  </th>
                            <th class="hidden-480">Local </th>
                            <th class="hidden-480">Vigor </th>
                            <th class="hidden-480">Croqui </th>
                            <th></th>
                        </tr>
                    </thead>
                      <c:forEach var="autolist" items="${listAuto}">
                    <c:set var="selTpAuto" value="${tpAuto.detalheTpCessao(autolist.fkTipoCessaoStage)}" />
                    <tbody>
                        <tr>
                            <td class="center hidden-480">
                            <div class="action-buttons ">
                                <a href="ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage=${autolist.pkAutoStage}&pg=${pg}&pi=${pi}&pf=${pf}&qAC=${qAC}&qTpcessao=${qTpcessao}&qProcesso=${qProcesso}&qCessionario=${qCessionario}&qEndereco=${qEndereco}&qCroqui=${qCroqui}&qVigor=${qVigor}"><i class="ace-icon fa fa-search-plus"></i></a>
                            </div>
                            </td>
                            <td class="hidden-480">${autolist.nmCodAc}</td>
                            <td title="${autolist.nmProcesso}">
                                <c:choose >
                                    <c:when test="${autolist.nmProcesso.length() > 17 }">
                                        ${autolist.nmProcesso.substring(0,16)}...
                                    </c:when>
                                    <c:otherwise>
                                        ${autolist.nmProcesso}
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td title="${selTpAuto.nmTipoAutoCessao}">
                                <c:choose >
                                    <c:when test="${selTpAuto.nmTipoAutoCessao.length() > 20 }">
                                        ${selTpAuto.nmTipoAutoCessao.substring(0,20)}...
                                    </c:when>
                                    <c:otherwise>
                                        ${selTpAuto.nmTipoAutoCessao}
                                    </c:otherwise>
                                </c:choose>
                                </td>
                                <td class="hidden-480" title="${autolist.nmCessionario}">
                                <c:choose >
                                    <c:when test="${autolist.nmCessionario.length() > 20 }">
                                        ${autolist.nmCessionario.substring(0,20)}...
                                    </c:when>
                                    <c:otherwise>
                                        ${autolist.nmCessionario}
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td class="hidden-480" title="${autolist.nmEndereco}">
                                <c:choose >
                                    <c:when test="${autolist.nmEndereco.length() > 25 }">
                                        ${autolist.nmEndereco.substring(0,25)}...
                                    </c:when>
                                    <c:otherwise>
                                        ${autolist.nmEndereco}
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td class="hidden-480">
                                <c:choose>
                                    <c:when test="${'true' == autolist.nrVigor}">
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
                            <td class="hidden-480" title="${autolist.nmCroqui}">
                                <c:choose >
                                    <c:when test="${autolist.nmCroqui.length() > 10 }">
                                        ${autolist.nmCroqui.substring(0,10)}...
                                    </c:when>
                                    <c:otherwise>
                                         ${autolist.nmCroqui}
                                    </c:otherwise>
                                </c:choose>
                               </td>
                            <td>
                            <c:choose>
                                <c:when test="${sessionSgDivisao == 'DDPI'}">
                                <div class="hidden-sm hidden-xs btn-group">
                                    <button class="btn btn-xs btn-info">
                                        <i class="ace-icon fa fa-pencil bigger-120"></i>
                                        <a href="ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage=${autolist.pkAutoStage}&pg=${pg}&pi=${pi}&pf=${pf}&qAC=${qAC}&qTpcessao=${qTpcessao}&qProcesso=${qProcesso}&qCessionario=${qCessionario}&qEndereco=${qEndereco}&qCroqui=${qCroqui}&qVigor=${qVigor}&execucao=edit" class="btn-info">Editar</a>
                                    </button>                                                                                                                                
                                </div>
                                </c:when>    
                                <c:otherwise>
                                    <c:choose>
                                        <c:when test="${autolist.nmStatus == 'EmConferencia'}">
                                            <span class="label label-white label-white" title="Em conferência">
                                                Em conferência
                                            </span>
                                        </c:when>
                                        <c:when test="${autolist.nmStatus == 'Corrigir'}">
                                            <span class="label label-danger label-white" title="Em correção">
                                                Em correção
                                            </span>
                                        </c:when>
                                        <c:when test="${autolist.nmStatus == 'Validado'}">
                                            <span class="label label-success label-white" title="Validado">
                                                Validado 
                                            </span>
                                        </c:when>
                                        <c:otherwise>
                                            <span class="label label-warning label-white" title="Pendente Conferência">
                                                Pendente Conferência
                                            </span>
                                        </c:otherwise>
                                    </c:choose>
                                </c:otherwise>
                            </c:choose>    
                                <div class="hidden-md hidden-lg">
                                    <div class="inline pos-rel">
                                        <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                            <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                        </button>
                                        <c:if test="${sessionSgDivisao == 'DDPI'}" >
                                        <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                              
                                            <li>
                                                <a href="ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage=${autolist.pkAutoStage}&pg=${pg}&pi=${pi}&pf=${pf}&qAC=${qAC}&qTpcessao=${qTpcessao}&qProcesso=${qProcesso}&qCessionario=${qCessionario}&qEndereco=${qEndereco}&qCroqui=${qCroqui}&qVigor=${qVigor}&execucao=edit" class="tooltip-success" data-rel="tooltip" title="" data-original-title="Edit">
                                                    <span class="green">
                                                        <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                                    </span>
                                                </a>
                                            </li>
                                          
                                            <!--<li>
                                                <a href="#" class="tooltip-info" data-rel="tooltip" title="" data-original-title="View">
                                                    <span class="blue">
                                                        <i class="ace-icon fa fa-search-plus bigger-120"></i>
                                                    </span>
                                                </a>
                                            </li>-->
                                          
                                            <!--<li>
                                                <a href="#" class="tooltip-error" data-rel="tooltip" title="" data-original-title="Delete">
                                                    <span class="red">
                                                        <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                                    </span>
                                                </a>
                                            </li>-->
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
                    <label class="lead">Total <strong><c:out value="${totalRes}"></c:out></strong></label>
               </div>
            </div>
                <div class="col-xs-6">
                    <div class="dataTables_paginate paging_simple_numbers" id="dynamic-table_paginate">
                        <ul class="pagination">
                        <c:forEach var="i" begin="${pi}" end="${pf}">
                            <c:if test="${pi != 0 && pi == i}">
                                <li>
                                    <a href="ControllerServlet?acao=AutoCessaoListaPagFiltro&pg=${i}&pi=${pi}&pf=${pf}&qAC=${qAC}&qTpcessao=${qTpcessao}&qProcesso=${qProcesso}&qCessionario=${qCessionario}&qEndereco=${qEndereco}&qCroqui=${qCroqui}&qVigor=${qVigor}&ter=${ter}">
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
                                            <a href="ControllerServlet?acao=AutoCessaoListaPagFiltro&pg=${i}&pi=${pi}&pf=${pf}&qAC=${qAC}&qTpcessao=${qTpcessao}&qProcesso=${qProcesso}&qCessionario=${qCessionario}&qEndereco=${qEndereco}&qCroqui=${qCroqui}&qVigor=${qVigor}&ter=${ter}">${i}</a>
                                        </li>
                                    </c:otherwise>
                                </c:choose>
                            </c:if>
                            <c:if test="${i == pf && pf != qtdPg && i <= qtdPg  }">
                                <li>
                                    <a href="ControllerServlet?acao=AutoCessaoListaPagFiltro&pg=${i}&pi=${pi}&pf=${pf}&qAC=${qAC}&qTpcessao=${qTpcessao}&qProcesso=${qProcesso}&qCessionario=${qCessionario}&qEndereco=${qEndereco}&qCroqui=${qCroqui}&qVigor=${qVigor}&ter=${ter}">
                                        <i class="ace-icon fa fa-angle-double-right"></i></a>
                                </li>
                            </c:if>    
                        </c:forEach>
                        </ul>
                    </div>
                </div>
                
                <div class="col-sm-12 " >
                    <button class="btn btn-yellow right" type="reset" onclick=" location.href='AutoCessao.jsp?ter=${ter}';">
                        <i class="ace-icon fa fa-undo bigger-110"></i>
                        Voltar
                    </button>    
                </div>
        
        
            
        
     
    <jsp:include page = "include/footer.jsp" />
   <!-- /.main-container --> 
    </body>
</html>
