<%-- 
    Document   : CapUsuarioC
    Created on : 01/02/2019, 09:30:53
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
            <jsp:include page = "javaScritp/ajaxSelectSetorInserir.html" />

            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />

            <!-- bean para cria as lista dos select-->        
            <jsp:useBean id="beanDivisao" class= "br.com.Modelo.DivisaoDAO" />
            <jsp:useBean id="beanPerfil" class= "br.com.Modelo.PerfilDAO" />
            <jsp:useBean id="beanCargo" class= "br.com.Modelo.CargoDAO" />
            <jsp:useBean id="beanSetor" class= "br.com.Modelo.SetorDAO" />

            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="q" value="${param.q}" />
            <c:set var="sgDivisao" value="${param.sgDivisao}"/>
            <c:set var="sgSetor" value="${param.sgSetor}"/>

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-users"></i> Usuários CAP</li>
                </ul>
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">


                        <div class="col-sm-6 col-sm-offset-2">
                            <div class="widget-box">
                                <div class="widget-header">
                                    <h4 class="widget-title"><span class="fa fa-user-plus"></span> Cadastro de Usuários do CAP</h4>
                                </div>

                                <div class="widget-body">
                                    <div class="widget-main no-padding">
                                        <form action="ControllerServlet?acao=CapUsuarioInsert" method="POST">
                                            <fieldset>
                                                <div class="form-group">
                                                    <label class="col-sm-2 col-xs-12 control-label no-padding-right" for="form-field-1"> Login </label>
                                                    <div class="col-sm-4 col-xs-12">
                                                        <input type="text" id="form-field-1" name="login" placeholder="d000000 ou x000000" class="col-xs-10 col-sm-12" required="required">
                                                    </div>

                                                    <label class="col-sm-1 control-label no-padding-right" for="form-field-1"> R.F. </label>
                                                    <div class="col-sm-5">
                                                        <input type="text" id="form-field-1" name="rf" placeholder="000.000.0" class="col-xs-10 col-sm-12" required="required">
                                                    </div>

                                                    <br /><br /><br />

                                                    <label class="col-sm-2 control-label no-padding-right" for="form-field-1"> Nome </label>
                                                    <div class="col-sm-10">
                                                        <input type="text" id="form-field-1" name="nome" placeholder="Nome completo" class="col-xs-12 col-sm-12" required="required">
                                                    </div>

                                                    <br /><br /><br />

                                                    <label class="col-sm-2 control-label no-padding-right" for="form-field-1"> e-mail </label>
                                                    <div class="col-sm-10">
                                                        <input type="email" id="form-field-1" name="email" placeholder="e-mail" class="col-xs-12 col-sm-12" required="required">
                                                    </div>

                                                    <br /><br /><br />

                                                    <!-- FIXAR A DIVISAO COMO 'DIPI' -->
                                                    <label class="col-sm-2 control-label no-padding-right" for="form-field-1">Divisões: </label>
                                                    <div class="col-sm-10">
                                                        <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="divisao" value="${sgDivisao}" onChange="pkDivisao(this)"  required="required">

                                                            <c:choose>
                                                                <c:when test="${sessionPkDivisao == '1'}">
                                                                    <option value=""></option>
                                                                    <c:forEach var="d" items="${beanDivisao.selectLisDivisao()}">
                                                                        <option value="${d.pkDivisao}" title="${d.nmDivisao}">${d.sgDivisao} - ${d.nmDivisao}</option>  
                                                                    </c:forEach>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <option value="${sessionPkDivisao}" title="">${sessionSgDivisao}</option>
                                                                </c:otherwise>    
                                                            </c:choose>

                                                        </select>
                                                    </div>

                                                    <br /><br /><br />

                                                    <label class="col-sm-2 control-label no-padding-right" for="form-field-1">Núcleo: </label>
                                                    <div class="col-sm-10">
                                                        <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="setor" value="${sgSetor}" onChange="pkSetor(this)"  required="required">
                                                            <c:choose>
                                                                <c:when test="${sessionPkDivisao == '1'}">
                                                                    <option value=""></option>
                                                                    <c:forEach var="s" items="${beanSetor.selectLisSetor()}">
                                                                        <option value="${s.pkSetor}" title="${s.nmSetor}">${s.sgSetor} - ${s.nmSetor}</option>  
                                                                    </c:forEach>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <option value="${sessionPkSetor}" title="">${sessionSgSetor}</option>
                                                                </c:otherwise>    
                                                            </c:choose>
                                                        </select>
                                                    </div>


                                                    <br /><br /><br />
                                                    <label class="col-sm-2 control-label no-padding-right" for="form-field-1">Cargo: </label>
                                                    <div class="col-sm-4">
                                                        <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="cargo" required="required">
                                                            <option value=""></option>
                                                            <c:forEach var="c" items="${beanCargo.listCargo()}">
                                                                <option value="${c.pkCargo}" title="${c.dsCargo}">${c.nmCargo}</option>  
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                    <label class="col-sm-1 control-label no-padding-right" for="form-field-1">Perfil: </label>
                                                    <div class="col-sm-5">
                                                        <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="perfil" required="required">
                                                            <option value=""></option>
                                                            <c:forEach var="p" items="${beanPerfil.listSelectPerfil()}">
                                                                <option value="${p.pkPerfil}" title="${p.dsPerfil}">${p.nmPerfil}</option>  
                                                            </c:forEach>
                                                        </select>
                                                    </div>

                                                    <br /><br /><br />

                                                    <div class="col-sm-5">
                                                        <label class="pull-left inline">
                                                            <small class="muted smaller-90">Ativar:</small>
                                                            <input id="id-button-borders" type="checkbox" class="ace ace-switch ace-switch-5" id="" name="ativo" value="1" >
                                                            <span class="lbl middle"></span>
                                                        </label>     

                                                    </div>

                                                    <br /><br /><br />

                                                </div>
                                            </fieldset>

                                            <!-- BOTOES-->
                                            <div class="form-actions center">
                                                <button class="btn btn-yellow" type="reset" onclick=" location.href = 'ControllerServlet?acao=CapUsuarioListaPaginada'">
                                                    <i class="ace-icon fa fa-undo bigger-110"></i>
                                                    Voltar
                                                </button>

                                                <button class="btn btn-success" type="submit">
                                                    <i class="ace-icon fa fa-save bigger-110"></i>
                                                    Salvar
                                                </button>

                                                <button class="btn" type="reset">
                                                    <i class="ace-icon fa fa-eraser bigger-110"></i>
                                                    Limpar
                                                </button>
                                            </div>
                                        </form>
                                    </div>

                                    <div class="" id="msg">
                                        <div  class=" col-md-13 col-xs-12 alert alert-success" id="ok">
                                            <strong>Sucesso!</strong> Cadastro do usuário foi realizado. 
                                        </div>
                                    </div>

                                    <% if (request.getAttribute("msg") == "gravou") { %>
                                    <style>
                                        #msg{visibility: visible;}
                                        #ok{visibility: visible;}    
                                        #erro{visibility: hidden;}
                                    </style>
                                    <%} else {%>
                                    <style>
                                        #msg{visibility: hidden;}
                                    </style>
                                    <%}%>



                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <jsp:include page = "include/footer.jsp" />
        </div><!-- /.main-container --> 
    </body>
</html>
