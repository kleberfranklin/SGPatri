

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
    <jsp:include page = "javaScritp/alertSigla.html" />

<!--Verificação de acesso  -->
    <c:set var="acessoPerfil" value="${sessionPerfil}" />
    <jsp:directive.include file="include/ControleAcesso.jsp" />
    
<!-- bean para cria as lista dos select-->        
    <jsp:useBean id="beanDivisao" class= "br.com.Modelo.DivisaoDAO" />    
   
<!--Parametros para paginação e exibir campos do View, Edit, Inserit-->    
    <c:set var="pg" value="${param.pg}" />
    <c:set var="pf" value="${param.pf}" />
    <c:set var="pi" value="${param.pi}" />
    <c:set var="q" value="${param.q}" />
    <c:set var="execucao" value="${param.execucao}" />
    
    
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-folder"></i> Núcleo</li>
        </ul>
    </div>    
    <div class="page-content">
    <div class="row">
    <div class="col-xs-12">
        
        
        <div class="col-sm-6 col-sm-offset-2">
            <div class="widget-box">
                <div class="widget-header">
                    <h4 class="widget-title"><span class="fa fa-folder-o"></span> 
                        <c:choose>
                            <c:when test="${execucao=='insert'}">
                                Cadastro de
                            </c:when>
                            <c:when test="${execucao=='edit'}">
                                Alterar dados do
                            </c:when>
                            <c:otherwise>
                                Detalhes do
                            </c:otherwise>
                        </c:choose>
                         Núcleo</h4>
                </div>

                <div class="widget-body">
                    <div class="widget-main no-padding">
                        <form action="ControllerServlet?acao=SetorCU" method="POST">
                            <input type="hidden" name="execucao" value="${execucao}" />
                            <input type="hidden" name="pkSetor" value="${st.pkSetor}" />
                            <fieldset>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-1">Divisões: </label>
                                    <div class="col-sm-4 col-xs-12">
                                        
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="fkDivisao" required="required">
                                                    <option value=""></option>
                                                    <c:forEach var="d" items="${beanDivisao.selectLisDivisao()}">
                                                        <option value="${d.pkDivisao}" title="${d.nmDivisao}">${d.sgDivisao}</option>  
                                                    </c:forEach>
                                                </select>
                                            </c:when>
                                            <c:when test="${execucao=='edit'}">
                                                <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="fkDivisao" required="required">
                                                    <option value="${st.fkDivisao}">${st.sgDivisao}</option>
                                                    <option value=""></option>
                                                    <c:forEach var="d" items="${beanDivisao.selectLisDivisao()}">
                                                        <option value="${d.pkDivisao}" title="${d.nmDivisao}">${d.sgDivisao}</option>  
                                                    </c:forEach>
                                                </select>
                                            </c:when>
                                            <c:otherwise>
                                                <label class="lead" title="${st.nmDivisao}"><c:out value="${st.sgDivisao}" /></label>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                    <br /><br />
                                    <div class="space-10"></div>
                                    <label class="col-sm-3 col-xs-12 control-label no-padding-right" for="form-field-1"> Sigla </label>
                                    <div class="col-sm-9 col-xs-12">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <input type="text" name="sigla" placeholder="Sigla do Núcleo" id="sigla" onblur="alertSigla(this)" onfocus="alertSiglaClear()" class="col-sm-7 col-sm-12" required="required" maxlength="26">
                                                &nbsp;<span id="alertSigla"></span>
                                            </c:when>
                                            <c:when test="${execucao=='edit'}">
                                                <input type="text" name="sigla" value="${st.sgSetor}" id="sigla" onblur="alertSigla(this)" onfocus="alertSiglaClear()" class="col-sm-7 col-sm-12" required="required" maxlength="26" >
                                                &nbsp;<span id="alertSigla"></span>
                                            </c:when>
                                            <c:otherwise>                                                
                                                <label class="lead"><c:out value="${st.sgSetor}" /></label>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                    <br /><br /><br />
                                    
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Núcleo: </label>
                                    <div class="col-sm-9 col-xs-12 control-label no-padding-right" for="form-field-1">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <input type="text" id="form-field-1" name="setor" placeholder="Nome completo do Núcleo" class="col-xs-12 col-sm-12" required="required">
                                            </c:when>
                                            <c:when test="${execucao=='edit'}">
                                                <input type="text" id="form-field-1" name="setor" value="${st.nmSetor}" class="col-xs-12 col-sm-12" required="required">
                                            </c:when>
                                            <c:otherwise>
                                                <label class="lead"><c:out value="${st.nmSetor}" /></label >
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                    <br /><br /><br />
                                    
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Nº SIMPROC: </label>
                                    <div class="col-sm-9 col-xs-12">
                                        
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <input type="text" id="form-field-1" name="nrSimproc" placeholder="Número do SIMPROC" class="col-xs-12 col-sm-12" >
                                            </c:when>
                                            <c:when test="${execucao=='edit'}">
                                                <input type="text" id="form-field-1"  value="${st.nmNrSimprocSetor}" name="nrSimproc" class="col-xs-12 col-sm-12" >
                                            </c:when>
                                            <c:otherwise>
                                                <label class="lead"><c:out value="${st.nmNrSimprocSetor}" /></label>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                    <br /><br /><br />
                                    
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Nº SEI: </label>
                                    <div class="col-sm-9 col-xs-12">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <input type="text" id="form-field-1" name="nrSei" placeholder="Número do SEI" class="col-xs-12 col-sm-12">
                                            </c:when>
                                            <c:when test="${execucao=='edit'}">
                                                <input type="text" id="form-field-1" name="nrSei" value="${st.nmNrSei}" class="col-xs-12 col-sm-12">
                                            </c:when>
                                            <c:otherwise>
                                               <label class="lead"><c:out value="${st.nmNrSei}" /></label>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                    <br /><br /><br />
                                   
                                   
                                </div>
                            </fieldset>

                            <div class="form-actions center">
                                <button class="btn btn-yellow" type="reset" onclick=" location.href='ControllerServlet?acao=SetorLista';">
                                    <i class="ace-icon fa fa-undo bigger-110"></i>
                                    Voltar
                                </button>
                            <c:if test="${execucao=='edit' || execucao =='insert'}">
                                <button class="btn btn-success" type="submit" id="salvar">
                                    <i class="ace-icon fa fa-save bigger-110"></i>
                                    Salvar
                                </button>
                              
                                <button class="btn" type="reset">
                                    <i class="ace-icon fa fa-eraser bigger-110"></i>
                                    Limpar
                                </button>
                            </c:if>
                            </div>
                        </form>
                        <div id="msg">
                            <div class="alert alert-block alert-success" id="up">
                                <strong><i class="ace-icon fa fa-check"></i>Sucesso!</strong>
                                    A(s) alteração(ões) foi(ram) realizada(s)
                            </div>
                            <div  class=" alert alert-success" id="ok">
                                <strong><i class="ace-icon fa fa-check"></i>Sucesso!</strong> 
                                Cadastro realizado.</div> 
                            </div>
                        </div>
                    </div>
                    <% if (request.getAttribute("msg") == "gravou") { %>
                        <style>
                            #msg{visibility: visible;}
                            #ok{visibility: visible;}    
                            #up{visibility: hidden;}
                        </style>
                    <%}else if (request.getAttribute("msg") == "alterou"){%>
                        <style>
                            #msg{visibility: visible;}
                            #ok{visibility: hidden;}    
                            #up{visibility: visible;}
                        </style>
                    <%} else {%>
                        <style>
                            #msg{visibility: hidden;}
                        </style>
                    <%}%>
              </div>
            </div>
        </div>
<jsp:include page = "include/footer.jsp" />
   </div><!-- /.main-container --> 
    </body>
</html>
