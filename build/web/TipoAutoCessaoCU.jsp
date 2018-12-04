<%-- 
    Document   : TipoAutoCessaoCRU
    Created on : 23/10/2018, 17:33:16
    Author     : d732229
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
    <jsp:include page = "javaScritp/alertSigla.html" />

<!--Verificação de acesso  -->
    <c:set var="acessoPerfil" value="${sessionPerfil}" />
    <jsp:directive.include file="include/ControleAcesso.jsp" />
    
<!-- bean para cria as lista dos select-->        
    <jsp:useBean id="bean" class= "br.com.Modelo.CatAutoCessaoDAO" />        
   
<!--Parametros para paginação e exibir campos do View, Edit, Inserit-->    
    <c:set var="pg" value="${param.pg}" />
    <c:set var="pf" value="${param.pf}" />
    <c:set var="pi" value="${param.pi}" />
    <c:set var="q" value="${param.q}" />
    <c:set var="execucao" value="${param.execucao}" />
    
    
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-folder"></i> Tipo Auto de Cessão</li>
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
                            <c:when test="${execucao=='insert'}" >
                                Cadastro de 
                            </c:when>
                            <c:when test="${execucao=='edit'}">
                                Alterar dados da
                            </c:when>
                            <c:otherwise>
                                Detalhes da 
                            </c:otherwise>    
                                
                        </c:choose>
                        Tipo Auto Cessão</h4>
                </div>

                <div class="widget-body">
                    <div class="widget-main no-padding">
                        <form action="ControllerServlet?acao=TipoAutoCessaoCU" method="POST">
                            <input type="hidden" name="execucao" value="${execucao}" />
                            <input type="hidden" name="pkTipoAutoCessao" value="${tpCessao.pkTipoAutoCessao}" />
                            <fieldset>
                                <div class="form-group">
                                    
                                    <label class="col-sm-4 control-label no-padding-right" for="form-field-1">Categoria Auto Cessão: </label>
                                    <div class="col-sm-4 col-xs-12">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="fkCatAutoCessao" required="required" onfocus="onfocus">
                                                    <option value=""></option>
                                                    <c:forEach var="cat" items="${bean.listSelectCatAutoCessao()}">
                                                        <c:if test="${cat.nmCatAutoCessao != 'Informacao nao cadastrada'}">
                                                        <option value="${cat.pkCatAutoCessao}" title="${cat.nmCatAutoCessao}">${cat.nmCatAutoCessao}</option>  
                                                        </c:if>
                                                    </c:forEach>
                                                </select>
                                            </c:when>
                                            <c:when test="${execucao=='edit'}">
                                                <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="fkCatAutoCessao" required="required" onfocus="onfocus">
                                                    <option value=""></option>
                                                    <c:forEach var="cat" items="${bean.listSelectCatAutoCessao()}">
                                                        <c:if test="${cat.nmCatAutoCessao != 'Informacao nao cadastrada'}">
                                                            <option value="${cat.pkCatAutoCessao}" title="${cat.nmCatAutoCessao}">${cat.nmCatAutoCessao}</option>  
                                                        </c:if>    
                                                    </c:forEach>
                                                </select>
                                            </c:when>
                                            <c:otherwise>
                                                <label class="lead" title="${tpCessao.nmTipoAutoCessao}"><c:out value="${tpCessao.nmTipoAutoCessao}" /></label>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                    <br /><br />
                                    
                                    <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> Nome Auto Cessão: </label>
                                    <div class="col-sm-8 col-xs-12 control-label no-padding-right" for="form-field-1">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <input type="text" id="form-field-1" name="nmTipoAtuoCessao" placeholder="Nome completo do Auto Cessão" class="col-xs-12 col-sm-12" required="required">
                                            </c:when>
                                            <c:when test="${execucao=='edit'}">
                                                <input type="text" id="form-field-1" name="nmTipoAtuoCessao" value="${tpCessao.nmTipoAutoCessao}" class="col-xs-12 col-sm-12" required="required">
                                            </c:when>
                                            <c:otherwise>
                                                <label class="lead"><c:out value="${tpCessao.nmTipoAutoCessao}" /></label >
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                    <br /><br /><br />
                                </div>
                            </fieldset>

                            <div class="form-actions center">
                                <button class="btn btn-yellow" type="reset" onclick=" location.href='ControllerServlet?acao=TipoAutoCessaoLista';">
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
