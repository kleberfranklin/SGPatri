



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
    
  
    <jsp:useBean id="beanDispLegal" class= "br.com.Modelo.DispositivoLegalDAO" />
            
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
        <c:set var="prazo" value="${param.prazo}" />
        <c:set var="vencida" value="${param.vencida}" />
        
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-list"></i> Auto de cessão detalhes</li>
        </ul>
    </div>    
    <div class="page-content">
    <div class="row">
    <div class="col-xs-12">
        
 
        <div class="col-sm-offset-1 col-sm-10">
            <h2>Detalhes do Auto de Cessão</h2>
            <div class="space-14"></div>
            <form class="form-horizontal">
                <div class="tabbable">
                    <ul class="nav nav-tabs padding-0">
                        <li class="active">
                            <a data-toggle="tab" href="#info-gerais" aria-expanded="true">
                                <i class="fa fa-info-circle"></i>
                                Informações Gerais
                            </a>
                        </li>
                     <!--   <li class="">
                            <a data-toggle="tab" href="#Oneroso-Pecunio" aria-expanded="false">
                                <i class="fa fa-info-circle"></i>
                                Historico do Oneroso / Pecunio
                            </a>
                        </li>
                        <li class="">
                            <a data-toggle="tab" href="#heranca-vacante" aria-expanded="false">
                                <i class="fa fa-info-circle"></i>
                                Herança Vacante
                            </a>
                        </li> -->
                    </ul>

                    <div class="tab-content profile-edit-tab-content">
                        <div id="info-gerais" class="tab-pane  in active">
                            
                            <div class="space-4"></div>
                            
                            <div class="form-group">
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Data Lavratura:</strong></span>
                                </label>
                                <label class="inline col-md-10 col-xs-12">
                                    <span class="lbl">
                                        <c:set var = "dt" value = "${auto.dtLavraturadate}" />
                                        <fmt:parseDate value = "${dt}" var = "converteData" pattern = "yyyy-MM-dd" />
                                        <fmt:formatDate type= "date" value="${converteData}" var="dataLabratuda"/>
                                        <c:out value = "${dataLabratuda}" />
                                    </span>
                                </label>
                            </div>
                            
                            <div class="space-2"></div>
                                 
                            <div class="form-group">
                                <label class="inline col-md-2 col-xs-12">
                                        <span class="lbl"><strong>A/C nº:</strong></span>
                                </label>
                                <label class="inline col-md-3 col-xs-12 ">
                                        <span class="lbl"> <c:out value="${auto.nmAc}"></c:out> </span>
                                </label>
                                <label class="inline col-md-2 col-xs-12">
                                        <span class="lbl"><strong>Nº Processo:</strong></span>
                                </label>
                                <label class="inline col-md-3 col-xs-12">
                                        <span class="lbl"> <c:out value="${auto.nmProcesso}"></c:out></span>
                                </label>
                            </div>
                                   
                            <div class="space-1"></div>    
                                
                            <div class="form-group">
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Tipo de Cessão:</strong></span>
                                </label>
                                <label class="inline col-md-5 col-xs-12">
                                        <span class="lbl"> <c:out value="${auto.nmCessao}"></c:out></span>
                                </label>
                                
                                <label class="inline col-md-2 col-xs-12">
                                        <span class="lbl"><strong>Nivel Aministração:</strong></span>
                                </label>
                                <label class="inline col-md-3 col-xs-12">
                                        <span class="lbl"> <c:out value="${auto.nmAdministracao}"></c:out></span>
                                </label>
                            </div>  
                        
                            <div class="space-1"></div>

                            <div class="form-group">
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Cessionário:</strong></span>
                                </label>
                                <label class="inline col-md-10 col-xs-12">
                                    <span class="lbl"><c:out value="${auto.nmCessionario}"></c:out></span>
                                </label>
                            </div>
                            
                            <div class="space-2"></div>                                
                            
                            <div class="form-group">
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Finalidade:</strong></span>
                                </label>
                                <label class="inline col-md-10 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.nmFinalidade}"></c:out></span>
                                </label>
                            </div>
  
                            <div class="space-1"></div>                           
                                   
                            <div class="form-group">
                                
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Planta:</strong></span>
                                </label>
                                <label class="inline col-md-2 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.nmPanta}"></c:out></span>
                                </label>
                               
                                <label class="inline col-md-1 col-xs-12" >
                                        <span class="lbl"><strong>Croqui:</strong></span>
                                </label>
                                <label class="inline col-md-3 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.nmCroqui}"></c:out></span>
                                </label>
                                
                                <label class="inline col-md-1 col-xs-12" >
                                        <span class="lbl"><strong>Área:</strong></span>
                                </label>
                                <label class="inline col-md-3 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.nmArea}"></c:out></span>
                                </label>
                            </div>
                            
                            <div class="space-1"></div>
                        
                            <div class="form-group">
                                
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Setor:</strong></span>
                                </label>
                                <label class="inline col-md-2 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.nmSetor}"></c:out></span>
                                </label>
                                
                                 <label class="inline col-md-1 col-xs-12" >
                                        <span class="lbl"><strong>Quadra:</strong></span>
                                </label>
                                <label class="inline col-md-3 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.nmQuadra}"></c:out></span>
                                </label>
                                
                                <label class="inline col-md-1 col-xs-12" >
                                        <span class="lbl"><strong>Municipal:</strong></span>
                                </label>
                                <label class="inline col-md-3 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.nmMunicipal}"></c:out></span>
                                </label>
                            </div>

                            <div class="space-1"></div>
                                
                            <div class="form-group">
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Local:</strong></span>
                                </label>
                                <label class="inline col-md-10 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.nmEndereco}"></c:out></span>
                                </label>
                            </div>

                            <div class="space-1"></div>                                
                                
                            <div class="form-group">
                                 <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Prazo:</strong></span>
                                </label>
                                <label class="inline col-md-2 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.nmPrazo}"></c:out></span>
                                </label>

                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Data Vencimento:</strong></span>
                                </label>
                                <label class="inline col-md-2 col-xs-12">
                                    <span class="lbl"> 
                                        <c:set var = "dtVec" value = "${auto.dtVencimento}" />
                                        <c:set var = "hoje" value = '<%= new java.util.Date()%>' />
                                        <fmt:parseDate value = "${dtVec}" var = "convertedtVec" pattern="yyyy-MM-dd" />
                                        <fmt:formatDate type= "date" value="${convertedtVec}" var="dtVencimento"/>
                                        <c:out value="${dtVencimento}"/><br/>
                                        </span>
                                </label>
                            </div>                                
                            <div class="form-group">
                                        
                                <label class="inline col-md-11 col-xs-12" >
                                    <c:if test="${convertedtVec < hoje && ((auto.nrVigor == 1 && auto.nrEncerrado == 0) || (auto.nrVigor == 0 && auto.nrEncerrado == 0)) }">
                                        <fmt:parseNumber value="${ hoje.time - convertedtVec.time }" integerOnly="true" var="diferencaMilisegundos" scope="page"/>
                                        <c:set value="${diferencaMilisegundos / 1000}" var="diferencaSegungos"/>
                                        <c:set value="${diferencaSegungos / 60}" var="diferencaMinutos"/>
                                        <c:set value="${diferencaMinutos / 60}" var="diferencaHoras" />
                                        <c:set value="${diferencaHoras / 24}" var="diferencaDias" />
                                        <c:set value="${(diferencaDias/365)*12 }" var="diferencaMes" />
                                        <c:set value="${diferencaMes / 12}" var="diferencaAno" />
                                        <div class="alert alert-danger">
                                            <strong>
                                                <i class="ace-icon fa fa-warning"></i>
                                                Vencido!  
                                            </strong>
                                            <fmt:formatNumber  maxFractionDigits="0" value="${diferencaAno}" /> ano(s), 
                                            <fmt:formatNumber  maxFractionDigits="0" value="${diferencaMes}" />  mês(es)
                                            e <fmt:formatNumber  maxFractionDigits="0" value="${diferencaDias}" /> dia(s).
                                        </div>
                                    </c:if>
                            </label>
                            </div>

                            <div class="space-1"></div>                           
                                
                            <div class="form-group">
                                 <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Secretaria:</strong></span>
                                </label>
                                <label class="inline col-md-4 col-xs-12">
                                    <span class="lbl"><c:out value="${auto.sgSecretaria}" /> - <c:out value="${auto.nmSecretaria}" /></span>
                                </label>
                                
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Prefeitura Regional:</strong></span>
                                </label>
                                <label class="inline col-md-4 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.sgPrefeituraRegional}" /> - <c:out value="${auto.nmPrefeituraRegional}" /></span>
                                </label>
                            </div>                                

                            <div class="space-2"></div>
                                
                            <div class="form-group">
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Pendência:</strong></span>
                                </label>
                                <label class="inline col-md-2 col-xs-12">
                                    <span class="lbl"> 
                                    <c:choose>
                                        <c:when test="${'1' == auto.nrPendencia}">
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
                                    </span>
                                </label>

                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Em vigor:</strong></span>
                                </label>
                                <label class="inline col-md-2 col-xs-12">
                                    <span class="lbl"> 
                                    <c:choose>
                                        <c:when test="${'1' == auto.nrVigor}">
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
                                    </span>
                                </label>

                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Encerrado:</strong></span>
                                </label>
                                <label class="inline col-md-2 col-xs-12">
                                    <span class="lbl"> 
                                    <c:choose>
                                        <c:when test="${'1' == auto.nrEncerrado}">
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
                                    </span>
                                </label>
                            </div>                                
                            
                            <div class="space-1"></div>        
                                
                            <h5 class="header smaller lbl"><strong>Dispositivos Legais</strong></h5>
                              <div class="form-group">
                              <c:forEach var="dis" items="${beanDispLegal.listDispositivoLegal(auto.pkCessao)}">
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Tipo de Dispositivo:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <span class="lbl"> <c:out value="${dis.nmDispLegal}"></c:out></span>
                                    </label>

                                     <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Nº do Dispositivo:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <span class="lbl"> <c:out value="${dis.nmNumeroDispositivo}"></c:out></span>
                                    </label>

                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Data do Dispositivo:</strong></span>
                                    </label>
                                    <label class="inline col-md-1 col-xs-12">
                                        <span class="lbl"> 
                                            <c:set var = "dtDis" value = "${dis.dtDispositivo}" />
                                            <fmt:parseDate value = "${dtDis}" var = "converteDataDis" pattern = "yyyy-MM-dd" />
                                            <fmt:formatDate type= "date" value="${converteDataDis}" var="dtDispositivo"/>
                                            <c:out value = "${dtDispositivo}" />
                                        </span>
                                    </label>
                                </c:forEach>
                            </div>   
                                
                            <div class="space-1"></div>
                                
                            <div class="form-group">
                                <label class="inline col-md-2 col-xs-12" >
                                    <span class="lbl"><strong>Contrapartida <font size="-2"> (Descrição Simplificada):</font></strong></span>
                                </label>
                                <label class="inline col-md-9 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.dsContrapartidaSimplificada}"></c:out></span>
                                </label>
                            </div>
                            
                            <div class="space-1"></div>
                                
                            <div class="form-group">
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Contrapartida :</strong></span>
                                </label>
                                <label class="inline col-md-10 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.dsContrapartida}"></c:out></span>
                                </label>
                            </div>
                                
                            <div class="space-1"></div>
                                
                            <div class="form-group">
                                <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Observação:</strong></span>
                                </label>
                                <label class="inline col-md-10 col-xs-12">
                                    <span class="lbl"> <c:out value="${auto.dsObservacao}"></c:out></span>
                                </label>
                            </div>                                
                        </div>
                        

                        <div id="Oneroso-Pecunio" class="tab-pane">
                            <div class="space-10"></div>

                            <div class="form-group">
                                
                            </div>

                            <div class="space-4"></div>

                            <div class="form-group">
                                
                            </div>
                        </div>
                          
                        <div id="heranca-vacante" class="tab-pane">
                            <div class="space-10"></div>

                            <div class="form-group">
                                
                            </div>

                            <div class="space-4"></div>

                            <div class="form-group">
                                
                            </div>
                        </div>
              
                                
                    </div>
                </div>

                 <div class="form-actions center">
                 <c:choose>
                    <c:when test="${prazo == null && vencida == null}">
                        <button class="btn btn-yellow" type="reset" onclick=" location.href='ControllerServlet?acao=AutoCessaoListaPagFiltro&pg=${pg}&pi=${pi}&pf=${pf}&qTpcessao=${qTpcessao}&qProcesso=${qProcesso}&qCessionario=${qCessionario}&qEndereco=${qEndereco}&qCroqui=${qCroqui}&qVigor=${qVigor}';">
                            <i class="ace-icon fa fa-undo bigger-110"></i>
                            Voltar
                        </button>
                    </c:when>        
                    <c:when test="${vencida == '1'}">
                        <button class="btn btn-yellow" type="reset" onclick=" location.href='ControllerServlet?acao=AutoCessaoVencida&pg=${pg}&pi=${pi}&pf=${pf}&vencida=${vencida}';">
                            <i class="ace-icon fa fa-undo bigger-110"></i>
                            Voltar
                        </button>
                    </c:when>        
                    <c:otherwise>
                        <button class="btn btn-yellow" type="reset" onclick=" location.href='ControllerServlet?acao=AutoCessaoPrazo&pg=${pg}&pi=${pi}&pf=${pf}&prazo=${prazo}';">
                            <i class="ace-icon fa fa-undo bigger-110"></i>
                            Voltar
                        </button>
                    </c:otherwise>
                </c:choose>   
                
                </div>
            </form>
        </div>
        
        
        
        
    
    
        
        
        
    <jsp:include page = "include/footer.jsp" />
    </div><!-- /.main-container --> 
    </body>
</html>

