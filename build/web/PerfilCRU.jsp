

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
                         Perfil</h4>
                </div>

                <div class="widget-body">
                    <div class="widget-main no-padding">
                        <form action="ControllerServlet?acao=PerfilCU" method="POST">
                            <input type="hidden" name="execucao" value="${execucao}" />
                            <input type="hidden" name="pkPerfil" value="${per.pkPerfil}" />
                            <fieldset>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Tipo de Perfil </label>
                                    <div class="col-sm-9 col-xs-12 control-label no-padding-right" for="form-field-1">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <input type="text" name="perfil" placeholder="Nome do perfil" id="sigla" onblur="alertSigla(this)" onfocus="alertSiglaClear()" class="col-sm-7 col-sm-12" required="required" maxlength="51">
                                                &nbsp;<span id="alertSigla"></span>
                                            </c:when>
                                            <c:when test="${execucao=='edit'}">
                                                <input type="text" name="perfil" value="${per.nmPerfil}" id="sigla" onblur="alertSigla(this)" onfocus="alertSiglaClear()" class="col-sm-7 col-sm-12" required="required" maxlength="51">
                                                &nbsp;<span id="alertSigla"></span>
                                            </c:when>
                                            <c:otherwise>
                                                <label class="lead"><c:out value="${per.nmPerfil}" /></label >
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                </div>
                                <br/><br/>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Descrição </label>
                                    <div class="col-sm-9 col-xs-12 control-label no-padding-right" for="form-field-1">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <textarea class="form-control" id="form-field-8" name="descricao" placeholder="Resumo do perfil" required="required"></textarea>
                                            </c:when>
                                            <c:when test="${execucao=='edit'}">
                                                <textarea class="form-control" id="form-field-8" name="descricao" placeholder="Resumo do perfil" required="required">${per.dsPerfil}</textarea>
                                            </c:when>
                                            <c:otherwise>
                                                <textarea class="form-control" id="form-field-8" name="descricao" placeholder="Resumo do perfil" readonly="readonly">${per.dsPerfil}</textarea>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                </div>
                                
                                <br/><br/><br/>
                                <div class="form-group">    
                                    <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> Permissão Leitura: </label>
                                    <div class="col-sm-2 col-xs-12">
                                       <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <label class="pull-left inline">
                                                    <input id="id-button-borders"  type="checkbox" id="" name="ler" value="1" class="ace ace-switch ace-switch-5"  >
                                                    <span class="lbl middle"></span>
                                                </label> 
                                            </c:when>
                                            <c:otherwise>    
                                                    <c:choose>
                                                        <c:when test="${per.nrLer != 1}">
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders"  type="checkbox" id="" name="ler" value="1" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label> 
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders" checked="checked" id="" name="ler" value="1" type="checkbox" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label> 
                                                        </c:otherwise>
                                                    </c:choose>
                                           </c:otherwise>
                                        </c:choose>         
                                    </div>
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Permissão Gravar: </label>
                                    <div class="col-sm-3 col-xs-12">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <label class="pull-left inline">
                                                    <input id="id-button-borders"  type="checkbox" id="" name="inserir" value="1" class="ace ace-switch ace-switch-5"  >
                                                    <span class="lbl middle"></span>
                                                </label> 
                                            </c:when>
                                            <c:otherwise>    
                                                    <c:choose>
                                                        <c:when test="${per.nrInserir != 1}">
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders"  type="checkbox" id="" name="inserir" value="1" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label> 
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders" checked="checked" id="" name="inserir" value="1" type="checkbox" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label> 
                                                        </c:otherwise>
                                                    </c:choose>
                                           </c:otherwise>
                                        </c:choose> 
                                    </div>
                                </div>
                                <br /><br />
                                <div class="form-group">  
                                   <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> Permissão Alterar: </label>
                                    <div class="col-sm-2 col-xs-12">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <label class="pull-left inline">
                                                    <input id="id-button-borders"  type="checkbox" id="" name="editar" value="1" class="ace ace-switch ace-switch-5"  >
                                                    <span class="lbl middle"></span>
                                                </label> 
                                            </c:when>
                                            <c:otherwise>    
                                                    <c:choose>
                                                        <c:when test="${per.nrEditar != 1}">
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders"  type="checkbox" id="" name="editar" value="1" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label> 
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders" checked="checked" id="" name="editar" value="1" type="checkbox" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label> 
                                                        </c:otherwise>
                                                    </c:choose>
                                           </c:otherwise>
                                        </c:choose> 
                                    </div>
                                    
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Permissão Excluir: </label>
                                    <div class="col-sm-3 col-xs-12">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <label class="pull-left inline">
                                                    <input id="id-button-borders"  type="checkbox" id="" name="excluir" value="1" class="ace ace-switch ace-switch-5"  >
                                                    <span class="lbl middle"></span>
                                                </label> 
                                            </c:when>
                                            <c:otherwise>    
                                                    <c:choose>
                                                        <c:when test="${per.nrExcluir != 1}">
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders"  type="checkbox" id="" name="excluir" value="1" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label> 
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders" checked="checked" id="" name="excluir" value="1" type="checkbox" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label> 
                                                        </c:otherwise>
                                                    </c:choose>
                                           </c:otherwise>
                                        </c:choose> 
                                    </div>
                                </div> 
                                <div class="form-group">  
                                <br /><br />
                                    
                                    <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> Permissão Gerenciar: </label>
                                    <div class="col-sm-2 col-xs-12">
                                        <c:choose>
                                            <c:when test="${execucao=='insert'}" >
                                                <label class="pull-left inline">
                                                    <input id="id-button-borders"  type="checkbox" id="" name="gerenciar" value="1" class="ace ace-switch ace-switch-5"  >
                                                    <span class="lbl middle"></span>
                                                </label> 
                                            </c:when>
                                            <c:otherwise>    
                                                    <c:choose>
                                                        <c:when test="${per.nrGerenciar != 1}">
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders"  type="checkbox" id="" name="gerenciar" value="1" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label> 
                                                        </c:when>
                                                        <c:otherwise>
                                                            <label class="pull-left inline">
                                                                <input id="id-button-borders" checked="checked" id="" name="gerenciar" value="1" type="checkbox" class="ace ace-switch ace-switch-5"  >
                                                                <span class="lbl middle"></span>
                                                            </label> 
                                                        </c:otherwise>
                                                    </c:choose>
                                           </c:otherwise>
                                        </c:choose> 
                                    </div>
                                </div>
                            </fieldset>

                            <div class="form-actions center">
                                <button class="btn btn-yellow" type="reset" onclick=" location.href='ControllerServlet?acao=PerfilLista';">
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
