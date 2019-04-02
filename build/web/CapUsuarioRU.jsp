<%-- 
    Document   : CapUsuarioRU
    Created on : 27/02/2019, 13:00:28
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
            <jsp:include page = "javaScritp/ajaxSelectSetorAlterar.html"/>

            <!--Verificação de acesso  -->    
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />

            <!-- bean para cria as lista dos select-->    
            <jsp:useBean id="beanDivisao" class= "br.com.Modelo.DivisaoDAO" />
            <jsp:useBean id="beanPerfil" class= "br.com.Modelo.PerfilDAO" />
            <jsp:useBean id="beanCargo" class= "br.com.Modelo.CargoDAO" />
            <jsp:useBean id="beanSetor" class= "br.com.Modelo.SetorDAO" />

            <!-- parametro para paginação e pesquisa -->    
            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="q" value="${param.q}" />
            <c:set var="sgDivisao" value="${param.sgDivisao}"/>
            <c:set var="alt" value="${param.alt}" />
            <c:set var="idDivisaoCombo" value="${param.idDivisaoCombo}" />

            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-user"></i> Usuário</li>
                </ul>
            </div>    
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">


                        <div class="col-sm-offset-1 col-sm-10">
                            <div id="user-profile-2" class="user-profile">
                                <div class="tabbable">
                                    <ul class="nav nav-tabs padding-18">
                                        <li class="active">
                                            <a data-toggle="tab" href="#home" aria-expanded="true">
                                                <i class=" ace-icon fa fa-user bigger-120"></i>
                                                Perfil
                                            </a>
                                        </li>

                                    </ul>

                                    <div class="tab-content no-border padding-24">
                                        <div id="home" class="tab-pane active">
                                            <div class="row">
                                                <div class="col-xs-12 col-sm-2 center">
                                                    <span class="profile-picture">
                                                        <img class="editable img-responsive" title="" alt="" id="avatar1" src="img/foto/user.jpg">
                                                    </span>

                                                    <div class="space space-4"></div>

                                                    <a href="#" class="btn btn-sm btn-block btn-success">
                                                        <i class="ace-icon fa fa-refresh"></i>
                                                        <span class="bigger-110"></span> Atualizar foto
                                                    </a>

                                                </div><!-- /.col -->
                                                <form action="ControllerServlet?acao=CapUsuarioAlterar" method="POST" >
                                                    <input type="hidden" value="${capUs.pkUsuarioCap}" name="pkUsuarioCap" />
                                                    <input type="hidden" value="${pg}" name="pg" />
                                                    <input type="hidden" value="${pf}" name="pf" />
                                                    <input type="hidden" value="${pi}" name="pi"/>
                                                    <input type="hidden" value="${q}" name="q"/>

                                                    <div class="col-xs-12 col-sm-9">
                                                        <h4 class="blue">
                                                            <c:choose>
                                                                <c:when test="${alt == 'alt'}">
                                                                    <input type="text" id="form-field-1" value="${capUs.nmNome}" name="nome" placeholder="Nome completo" class="col-xs-12 col-sm-12" required="required">
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="middle"><c:out value="${capUs.nmNome}" /></span>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </h4>

                                                        <div class="profile-user-info">
                                                            <div class="profile-info-row">
                                                                <div class="profile-info-name"> Login</div>

                                                                <div class="profile-info-value">
                                                                    <c:choose>
                                                                        <c:when test="${alt == 'alt'}">
                                                                            <input type="text" id="form-field-1" value="${capUs.nmLogin}" name="login" placeholder="d000000 ou x000000" class="col-xs-10 col-sm-12" required="required">
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <span><c:out value="${capUs.nmLogin}" /></span>
                                                                        </c:otherwise>    
                                                                    </c:choose>
                                                                </div>
                                                            </div>
                                                            <div class="profile-info-row">
                                                                <div class="profile-info-name"> R.F.</div>

                                                                <div class="profile-info-value">
                                                                    <c:choose>
                                                                        <c:when test="${alt == 'alt'}">
                                                                            <input type="text" id="form-field-1" value="${capUs.nmRf}" name="rf" placeholder="000.000.0" class="col-xs-10 col-sm-12" required="required">
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <span><c:out value="${capUs.nmRf}" /></span>
                                                                        </c:otherwise>
                                                                    </c:choose>
                                                                </div>
                                                            </div>
                                                            <div class="profile-info-row">
                                                                <div class="profile-info-name"> E-mail</div>

                                                                <div class="profile-info-value">
                                                                    <c:choose>
                                                                        <c:when test="${alt == 'alt'}">
                                                                            <input type="email" id="form-field-1" value="${capUs.nmEmail}" name="email" placeholder="e-mail" class="col-xs-12 col-sm-12" required="required">
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <span><c:out value="${capUs.nmEmail}" /></span>
                                                                        </c:otherwise>
                                                                    </c:choose>        
                                                                </div>
                                                            </div>  

                                                            <div class="profile-info-row">
                                                                <div class="profile-info-name"> Divisão</div>

                                                                <div class="profile-info-value">
                                                                    <c:choose>
                                                                        <c:when test="${alt == 'alt' && sessionPerfil == 'Administrador'}">
                                                                            <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="divisao" onChange="pkDivisao(this)"  required="required">
                                                                                <option value="${capUs.pkDivisao}" title="${capUs.nmDivisao}" selected="selected">${capUs.sgDivisao} - ${capUs.nmDivisao}</option>
                                                                                <option></option>
                                                                                <c:forEach var="d" items="${beanDivisao.selectLisDivisao()}">
                                                                                    <option value="${d.pkDivisao}" title="${d.nmDivisao}">${d.sgDivisao} - ${d.nmDivisao}</option>  
                                                                                </c:forEach>
                                                                            </select>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <input type="hidden" name="divisao" value="${capUs.pkDivisao}" />
                                                                            <span><c:out value="${capUs.sgDivisao}" /></span>
                                                                            <span> <c:out value="${capUs.nmDivisao}" /></span>
                                                                        </c:otherwise>
                                                                    </c:choose>
                                                                </div>
                                                            </div>
                                                            <div class="profile-info-row" >
                                                                <div class="profile-info-name"> Núcleo</div>
                                                                <div class="profile-info-value">
                                                                    <c:choose>
                                                                        <c:when test="${alt == 'alt'}">
                                                                            <div  id="selectSetor" >
                                                                                <select class="form-control col-xs-12 col-sm-12" name="setor" required="required">
                                                                                    <option value="${capUs.pkSetor}" title="${capUs.nmSetor}" selected="selected">${capUs.sgSetor} - ${capUs.nmSetor}</option>
                                                                                    <c:forEach var="s" items="${beanSetor.selecSetor(capUs.pkDivisao)}">
                                                                                        <option value="${s.pkSetor}" title="${s.nmSetor}">${s.sgSetor} - ${s.nmSetor}</option>  
                                                                                    </c:forEach>
                                                                                </select>
                                                                            </div>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <span>
                                                                                <c:if test="${not empty capUs.nmSetor}">
                                                                                    <c:out value="${capUs.sgSetor}" /> - <c:out value="${capUs.nmSetor}" />
                                                                                </c:if>
                                                                            </span>
                                                                        </c:otherwise>
                                                                    </c:choose>       
                                                                </div>
                                                            </div> 
                                                            <div class="profile-info-row">
                                                                <div class="profile-info-name"> Cargo</div>

                                                                <div class="profile-info-value">
                                                                    <c:choose>
                                                                        <c:when test="${alt == 'alt'}">
                                                                            <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="cargo" required="required">
                                                                                <option value="${capUs.pkCargo}">${capUs.nmCargo}</option>
                                                                                <option></option>
                                                                                <c:forEach var="c" items="${beanCargo.listCargo()}">
                                                                                    <option value="${c.pkCargo}" title="${c.dsCargo}">${c.nmCargo}</option>  
                                                                                </c:forEach>
                                                                            </select>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <span><c:out value="${capUs.nmCargo}" /></span>
                                                                        </c:otherwise>
                                                                    </c:choose>
                                                                </div>
                                                            </div>

                                                            <div class="profile-info-row">
                                                                <div class="profile-info-name"> Perfil</div>

                                                                <div class="profile-info-value">
                                                                    <c:choose>
                                                                        <c:when test="${alt == 'alt'}">
                                                                            <select class="form-control col-xs-12 col-sm-12" id="form-field-select-1" name="perfil" required="required">
                                                                                <option value="${capUs.pkPerfil}">${capUs.nmPerfil}</option>
                                                                                <option></option>
                                                                                <c:forEach var="p" items="${beanPerfil.listSelectPerfil()}">
                                                                                    <option value="${p.pkPerfil}" title="${p.dsPerfil}">${p.nmPerfil}</option>  
                                                                                </c:forEach>
                                                                            </select>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <span><c:out value="${capUs.nmPerfil}" /></span>
                                                                        </c:otherwise>
                                                                    </c:choose>        
                                                                </div>
                                                            </div>
                                                            <div class="profile-info-row">
                                                                <div class="profile-info-name"> Status</div>

                                                                <div class="profile-info-value">
                                                                    <c:choose>
                                                                        <c:when test="${alt == 'alt'}">

                                                                            <c:choose>
                                                                                <c:when test="${'0' == capUs.nrAtivo}">
                                                                                    <label class="pull-left inline">
                                                                                        <input id="id-button-borders"  type="checkbox" id="" name="ativo" value="1" class="ace ace-switch ace-switch-5"  >
                                                                                        <span class="lbl middle"></span>
                                                                                    </label> 
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                    <label class="pull-left inline">
                                                                                        <small class="muted smaller-90">Ativar:</small>
                                                                                        <input id="id-button-borders" checked="checked" type="checkbox" class="ace ace-switch ace-switch-5" id="" name="ativo" value="1" >
                                                                                        <span class="lbl middle"></span>
                                                                                    </label> 
                                                                                </c:otherwise>
                                                                            </c:choose>

                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <c:choose>
                                                                                <c:when test="${'1' == capUs.nrAtivo}">
                                                                                    <span class="label label-sm label-success">Ativo</span>
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                    <span class="label label-sm label-danger">Desativado</span>
                                                                                </c:otherwise>
                                                                            </c:choose>
                                                                        </c:otherwise>
                                                                    </c:choose>


                                                                </div>
                                                            </div>

                                                            <div class="profile-info-row">
                                                                <div class="profile-info-name"> Atualização</div>

                                                                <div class="profile-info-value">
                                                                    <span>
                                                                        <c:set var = "dt" value = "${capUs.dthrAtualizacao}" />
                                                                        <fmt:parseDate value = "${dt}" var = "converteDT" pattern="yyyy-MM-dd HH:mm" />
                                                                        <fmt:formatDate type= "both" value="${converteDT}" var="dtAtu"/>
                                                                        <c:out value="${dtAtu}"/>

                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <br />
                                                        <button class="btn btn-yellow" type="reset" onclick=" location.href = 'ControllerServlet?acao=CapUsuarioListaPaginada&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}';">
                                                            <i class="ace-icon fa fa-undo bigger-110"></i>
                                                            Voltar
                                                        </button>
                                                        <c:if test="${alt == 'alt'}">
                                                            <button class="btn btn-success" type="submit">
                                                                <i class="ace-icon fa fa-save bigger-110"></i>
                                                                Salvar
                                                            </button>
                                                            <button class="btn" type="reset">
                                                                <i class="ace-icon fa fa-eraser bigger-110"></i>
                                                                Limpar
                                                            </button>
                                                        </c:if>

                                                        <div class="col-sm-12 col-xs-12" id="msg">
                                                            <div  class="alert alert-success" id="ok">
                                                                <strong>Sucesso!</strong> A(s) alteração(ôes) foi(ram) realizada(as). 
                                                            </div>
                                                        </div>
                                                    </div><!-- /.col -->
                                                </form>
                                            </div><!-- /.row -->
                                            <div class="space-20"></div>
                                        </div><!-- /#home -->

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Botão coloca aqui todos a tab visualização -->
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



            <jsp:include page = "include/footer.jsp" />
        </div><!-- /.main-container --> 
    </body>
</html>
