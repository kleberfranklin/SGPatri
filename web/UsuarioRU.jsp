
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
                                Prefil
                            </a>
                        </li>

                        <li class="">
                            <a data-toggle="tab" href="#escolaridade" aria-expanded="false">
                                <i class="ace-icon fa fa-briefcase bigger-120"></i>
                                Escolaridade
                            </a>
                        </li>

                        <li class="">
                            <a data-toggle="tab" href="#friends" aria-expanded="false">
                                <i class="ace-icon fa fa-road bigger-120"></i>
                                Carreira profissional
                            </a>
                        </li>

                    <!--    <li class="">
                            <a data-toggle="tab" href="#pictures" aria-expanded="false">
                                <i class="ace-icon fa fa-road bigger-120"></i>
                                Histórico  
                            </a>
                        </li>
-->
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
                                <form action="ControllerServlet?acao=UsuarioAlterar" method="POST" >
                                    <input type="hidden" value="${us.pkUsuario}" name="pkUsuario" />
                                    <input type="hidden" value="${pg}" name="pg" />
                                    <input type="hidden" value="${pf}" name="pf" />
                                    <input type="hidden" value="${pi}" name="pi"/>
                                    <input type="hidden" value="${q}" name="q"/>
                                    
                                <div class="col-xs-12 col-sm-9">
                                    <h4 class="blue">
                                        <c:choose>
                                            <c:when test="${alt == 'alt'}">
                                                <input type="text" id="form-field-1" value="${us.nmNome}" name="nome" placeholder="Nome completo" class="col-xs-12 col-sm-12" required="required">
                                            </c:when>
                                            <c:otherwise>
                                                <span class="middle"><c:out value="${us.nmNome}" /></span>
                                            </c:otherwise>
                                        </c:choose>
                                    </h4>

                                    <div class="profile-user-info">
                                        <div class="profile-info-row">
                                            <div class="profile-info-name"> Login</div>

                                            <div class="profile-info-value">
                                                <c:choose>
                                                    <c:when test="${alt == 'alt'}">
                                                        <input type="text" id="form-field-1" value="${us.nmLogin}" name="login" placeholder="d00000 ou x00000" class="col-xs-10 col-sm-12" required="required">
                                                    </c:when>
                                                    <c:otherwise>
                                                        <span><c:out value="${us.nmLogin}" /></span>
                                                    </c:otherwise>    
                                                </c:choose>
                                            </div>
                                        </div>
                                        <div class="profile-info-row">
                                            <div class="profile-info-name"> R.F.</div>

                                            <div class="profile-info-value">
                                                 <c:choose>
                                                    <c:when test="${alt == 'alt'}">
                                                        <input type="text" id="form-field-1" value="${us.nmRf}" name="rf" placeholder="000.000.0" class="col-xs-10 col-sm-12" required="required">
                                                    </c:when>
                                                    <c:otherwise>
                                                        <span><c:out value="${us.nmRf}" /></span>
                                                    </c:otherwise>
                                                 </c:choose>
                                            </div>
                                        </div>
                                        <div class="profile-info-row">
                                            <div class="profile-info-name"> E-mail</div>

                                            <div class="profile-info-value">
                                                <c:choose>
                                                    <c:when test="${alt == 'alt'}">
                                                       <input type="email" id="form-field-1" value="${us.nmEmail}" name="email" placeholder="e-mail" class="col-xs-12 col-sm-12" required="required">
                                                    </c:when>
                                                    <c:otherwise>
                                                        <span><c:out value="${us.nmEmail}" /></span>
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
                                                            <option value="${us.pkDivisao}" title="${us.nmDivisao}" selected="selected">${us.sgDivisao} - ${us.nmDivisao}</option>
                                                                <option></option>
                                                                <c:forEach var="d" items="${beanDivisao.selectLisDivisao()}">
                                                                    <option value="${d.pkDivisao}" title="${d.nmDivisao}">${d.sgDivisao} - ${d.nmDivisao}</option>  
                                                                </c:forEach>
                                                        </select>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <input type="hidden" name="divisao" value="${us.pkDivisao}" />
                                                        <span><c:out value="${us.sgDivisao}" /></span>
                                                        <span> <c:out value="${us.nmDivisao}" /></span>
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
                                                                    <option value="${us.pkSetor}" title="${us.nmSetor}" selected="selected">${us.sgSetor} - ${us.nmSetor}</option>
                                                                    <c:forEach var="s" items="${beanSetor.selecSetor(us.pkDivisao)}">
                                                                        <option value="${s.pkSetor}" title="${s.nmSetor}">${s.sgSetor} - ${s.nmSetor}</option>  
                                                                    </c:forEach>
                                                                </select>
                                                            </div>
                                                        </c:when>
                                                        <c:otherwise>
                                                        <span>
                                                            <c:if test="${not empty us.nmSetor}">
                                                                <c:out value="${us.sgSetor}" /> - <c:out value="${us.nmSetor}" />
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
                                                            <option value="${us.pkCargo}">${us.nmCargo}</option>
                                                            <option></option>
                                                            <c:forEach var="c" items="${beanCargo.listCargo()}">
                                                                <option value="${c.pkCargo}" title="${c.dsCargo}">${c.nmCargo}</option>  
                                                            </c:forEach>
                                                        </select>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <span><c:out value="${us.nmCargo}" /></span>
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
                                                            <option value="${us.pkPerfil}">${us.nmPerfil}</option>
                                                            <option></option>
                                                            <c:forEach var="p" items="${beanPerfil.listSelectPerfil()}">
                                                                <option value="${p.pkPerfil}" title="${p.dsPerfil}">${p.nmPerfil}</option>  
                                                            </c:forEach>
                                                        </select>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <span><c:out value="${us.nmPerfil}" /></span>
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
                                                                <c:when test="${'0' == us.nrAtivo}">
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
                                                            <c:when test="${'1' == us.nrAtivo}">
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
                                                    <c:set var = "dt" value = "${us.dthrAtualizacao}" />
                                                        <fmt:parseDate value = "${dt}" var = "converteDT" pattern="yyyy-MM-dd HH:mm" />
                                                        <fmt:formatDate type= "both" value="${converteDT}" var="dtAtu"/>
                                                        <c:out value="${dtAtu}"/>
                                                    
                                                </span>
                                            </div>
                                        </div>
                                    </div>
                                     <br />
                                        <button class="btn btn-yellow" type="reset" onclick=" location.href='ControllerServlet?acao=UsuarioListaPaginada&pg=${pg}&pi=${pi}&pf=${pf}&q=${q}&sgDivisao=${sgDivisao}';">
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

                       <!-- Inicio da Aba Escolaridade--> 
                        <div id="escolaridade" class="tab-pane">
                            <div class="profile-feed row">
                                <div class="col-sm-6">
                                    <div class="profile-activity clearfix">
                                        <div>
                                            <img class="pull-left" alt="Alex Doe's avatar" src="assets/images/avatars/avatar5.png">
                                            <a class="user" href="#"> Alex Doe </a>
                                            changed his profile photo.
                                            <a href="#">Take a look</a>

                                            <div class="time">
                                                <i class="ace-icon fa fa-clock-o bigger-110"></i>
                                                an hour ago
                                            </div>
                                        </div>

                                        <div class="tools action-buttons">
                                            <a href="#" class="blue">
                                                <i class="ace-icon fa fa-pencil bigger-125"></i>
                                            </a>

                                            <a href="#" class="red">
                                                <i class="ace-icon fa fa-times bigger-125"></i>
                                            </a>
                                        </div>
                                    </div>

                                    <div class="profile-activity clearfix">
                                        <div>
                                            <img class="pull-left" alt="Susan Smith's avatar" src="assets/images/avatars/avatar1.png">
                                            <a class="user" href="#"> Susan Smith </a>

                                            is now friends with Alex Doe.
                                            <div class="time">
                                                <i class="ace-icon fa fa-clock-o bigger-110"></i>
                                                2 hours ago
                                            </div>
                                        </div>

                                        <div class="tools action-buttons">
                                            <a href="#" class="blue">
                                                <i class="ace-icon fa fa-pencil bigger-125"></i>
                                            </a>

                                            <a href="#" class="red">
                                                <i class="ace-icon fa fa-times bigger-125"></i>
                                            </a>
                                        </div>
                                    </div>

                                    <div class="profile-activity clearfix">
                                        <div>
                                            <i class="pull-left thumbicon fa fa-check btn-success no-hover"></i>
                                            <a class="user" href="#"> Alex Doe </a>
                                            joined
                                            <a href="#">Country Music</a>

                                            group.
                                            <div class="time">
                                                <i class="ace-icon fa fa-clock-o bigger-110"></i>
                                                5 hours ago
                                            </div>
                                        </div>

                                        <div class="tools action-buttons">
                                            <a href="#" class="blue">
                                                <i class="ace-icon fa fa-pencil bigger-125"></i>
                                            </a>

                                            <a href="#" class="red">
                                                <i class="ace-icon fa fa-times bigger-125"></i>
                                            </a>
                                        </div>
                                    </div>

                                    <div class="profile-activity clearfix">
                                        <div>
                                            <i class="pull-left thumbicon fa fa-picture-o btn-info no-hover"></i>
                                            <a class="user" href="#"> Alex Doe </a>
                                            uploaded a new photo.
                                            <a href="#">Take a look</a>

                                            <div class="time">
                                                <i class="ace-icon fa fa-clock-o bigger-110"></i>
                                                5 hours ago
                                            </div>
                                        </div>

                                        <div class="tools action-buttons">
                                            <a href="#" class="blue">
                                                <i class="ace-icon fa fa-pencil bigger-125"></i>
                                            </a>

                                            <a href="#" class="red">
                                                <i class="ace-icon fa fa-times bigger-125"></i>
                                            </a>
                                        </div>
                                    </div>

                                    <div class="profile-activity clearfix">
                                        <div>
                                            <img class="pull-left" alt="David Palms's avatar" src="assets/images/avatars/avatar4.png">
                                            <a class="user" href="#"> David Palms </a>

                                            left a comment on Alex's wall.
                                            <div class="time">
                                                <i class="ace-icon fa fa-clock-o bigger-110"></i>
                                                8 hours ago
                                            </div>
                                        </div>

                                        <div class="tools action-buttons">
                                            <a href="#" class="blue">
                                                <i class="ace-icon fa fa-pencil bigger-125"></i>
                                            </a>

                                            <a href="#" class="red">
                                                <i class="ace-icon fa fa-times bigger-125"></i>
                                            </a>
                                        </div>
                                    </div>
                                </div><!-- /.col -->

                                <div class="col-sm-6">
                                    <div class="profile-activity clearfix">
                                        <div>
                                            <i class="pull-left thumbicon fa fa-pencil-square-o btn-pink no-hover"></i>
                                            <a class="user" href="#"> Alex Doe </a>
                                            published a new blog post.
                                            <a href="#">Read now</a>

                                            <div class="time">
                                                <i class="ace-icon fa fa-clock-o bigger-110"></i>
                                                11 hours ago
                                            </div>
                                        </div>

                                        <div class="tools action-buttons">
                                            <a href="#" class="blue">
                                                <i class="ace-icon fa fa-pencil bigger-125"></i>
                                            </a>

                                            <a href="#" class="red">
                                                <i class="ace-icon fa fa-times bigger-125"></i>
                                            </a>
                                        </div>
                                    </div>

                                    <div class="profile-activity clearfix">
                                        <div>
                                            <img class="pull-left" alt="Alex Doe's avatar" src="assets/images/avatars/avatar5.png">
                                            <a class="user" href="#"> Alex Doe </a>

                                            upgraded his skills.
                                            <div class="time">
                                                <i class="ace-icon fa fa-clock-o bigger-110"></i>
                                                12 hours ago
                                            </div>
                                        </div>

                                        <div class="tools action-buttons">
                                            <a href="#" class="blue">
                                                <i class="ace-icon fa fa-pencil bigger-125"></i>
                                            </a>

                                            <a href="#" class="red">
                                                <i class="ace-icon fa fa-times bigger-125"></i>
                                            </a>
                                        </div>
                                    </div>

                                    <div class="profile-activity clearfix">
                                        <div>
                                            <i class="pull-left thumbicon fa fa-key btn-info no-hover"></i>
                                            <a class="user" href="#"> Alex Doe </a>

                                            logged in.
                                            <div class="time">
                                                <i class="ace-icon fa fa-clock-o bigger-110"></i>
                                                12 hours ago
                                            </div>
                                        </div>

                                        <div class="tools action-buttons">
                                            <a href="#" class="blue">
                                                <i class="ace-icon fa fa-pencil bigger-125"></i>
                                            </a>

                                            <a href="#" class="red">
                                                <i class="ace-icon fa fa-times bigger-125"></i>
                                            </a>
                                        </div>
                                    </div>

                                    <div class="profile-activity clearfix">
                                        <div>
                                            <i class="pull-left thumbicon fa fa-power-off btn-inverse no-hover"></i>
                                            <a class="user" href="#"> Alex Doe </a>

                                            logged out.
                                            <div class="time">
                                                <i class="ace-icon fa fa-clock-o bigger-110"></i>
                                                16 hours ago
                                            </div>
                                        </div>

                                        <div class="tools action-buttons">
                                            <a href="#" class="blue">
                                                <i class="ace-icon fa fa-pencil bigger-125"></i>
                                            </a>

                                            <a href="#" class="red">
                                                <i class="ace-icon fa fa-times bigger-125"></i>
                                            </a>
                                        </div>
                                    </div>

                                    <div class="profile-activity clearfix">
                                        <div>
                                            <i class="pull-left thumbicon fa fa-key btn-info no-hover"></i>
                                            <a class="user" href="#"> Alex Doe </a>

                                            logged in.
                                            <div class="time">
                                                <i class="ace-icon fa fa-clock-o bigger-110"></i>
                                                16 hours ago
                                            </div>
                                        </div>

                                        <div class="tools action-buttons">
                                            <a href="#" class="blue">
                                                <i class="ace-icon fa fa-pencil bigger-125"></i>
                                            </a>

                                            <a href="#" class="red">
                                                <i class="ace-icon fa fa-times bigger-125"></i>
                                            </a>
                                        </div>
                                    </div>
                                </div><!-- /.col -->
                            </div><!-- /.row -->

                            <div class="space-12"></div>

                            <div class="center">
                                <button type="button" class="btn btn-sm btn-primary btn-white btn-round">
                                    <i class="ace-icon fa fa-rss bigger-150 middle orange2"></i>
                                    <span class="bigger-110">View more activities</span>

                                    <i class="icon-on-right ace-icon fa fa-arrow-right"></i>
                                </button>
                            </div>
                        </div><!-- /#feed -->

                        <div id="friends" class="tab-pane">
                            <div class="profile-users clearfix">
                                <div class="itemdiv memberdiv">
                                    <div class="inline pos-rel">
                                        <div class="user">
                                            <a href="#">
                                                <img src="assets/images/avatars/avatar4.png" alt="Bob Doe's avatar">
                                            </a>
                                        </div>

                                        <div class="body">
                                            <div class="name">
                                                <a href="#">
                                                    <span class="user-status status-online"></span>
                                                    Bob Doe
                                                </a>
                                            </div>
                                        </div>

                                        <div class="popover">
                                            <div class="arrow"></div>

                                            <div class="popover-content">
                                                <div class="bolder">Content Editor</div>

                                                <div class="time">
                                                    <i class="ace-icon fa fa-clock-o middle bigger-120 orange"></i>
                                                    <span class="green"> 20 mins ago </span>
                                                </div>

                                                <div class="hr dotted hr-8"></div>

                                                <div class="tools action-buttons">
                                                    <a href="#">
                                                        <i class="ace-icon fa fa-facebook-square blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-google-plus-square red bigger-150"></i>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="itemdiv memberdiv">
                                    <div class="inline pos-rel">
                                        <div class="user">
                                            <a href="#">
                                                <img src="assets/images/avatars/avatar1.png" alt="Rose Doe's avatar">
                                            </a>
                                        </div>

                                        <div class="body">
                                            <div class="name">
                                                <a href="#">
                                                    <span class="user-status status-offline"></span>
                                                    Rose Doe
                                                </a>
                                            </div>
                                        </div>

                                        <div class="popover">
                                            <div class="arrow"></div>

                                            <div class="popover-content">
                                                <div class="bolder">Graphic Designer</div>

                                                <div class="time">
                                                    <i class="ace-icon fa fa-clock-o middle bigger-120 grey"></i>
                                                    <span class="grey"> 30 min ago </span>
                                                </div>

                                                <div class="hr dotted hr-8"></div>

                                                <div class="tools action-buttons">
                                                    <a href="#">
                                                        <i class="ace-icon fa fa-facebook-square blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-google-plus-square red bigger-150"></i>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="itemdiv memberdiv">
                                    <div class="inline pos-rel">
                                        <div class="user">
                                            <a href="#">
                                                <img src="assets/images/avatars/avatar.png" alt="Jim Doe's avatar">
                                            </a>
                                        </div>

                                        <div class="body">
                                            <div class="name">
                                                <a href="#">
                                                    <span class="user-status status-busy"></span>
                                                    Jim Doe
                                                </a>
                                            </div>
                                        </div>

                                        <div class="popover">
                                            <div class="arrow"></div>

                                            <div class="popover-content">
                                                <div class="bolder">SEO &amp; Advertising</div>

                                                <div class="time">
                                                    <i class="ace-icon fa fa-clock-o middle bigger-120 red"></i>
                                                    <span class="grey"> 1 hour ago </span>
                                                </div>

                                                <div class="hr dotted hr-8"></div>

                                                <div class="tools action-buttons">
                                                    <a href="#">
                                                        <i class="ace-icon fa fa-facebook-square blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-google-plus-square red bigger-150"></i>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="itemdiv memberdiv">
                                    <div class="inline pos-rel">
                                        <div class="user">
                                            <a href="#">
                                                <img src="assets/images/avatars/avatar5.png" alt="Alex Doe's avatar">
                                            </a>
                                        </div>

                                        <div class="body">
                                            <div class="name">
                                                <a href="#">
                                                    <span class="user-status status-idle"></span>
                                                    Alex Doe
                                                </a>
                                            </div>
                                        </div>

                                        <div class="popover">
                                            <div class="arrow"></div>

                                            <div class="popover-content">
                                                <div class="bolder">Marketing</div>

                                                <div class="time">
                                                    <i class="ace-icon fa fa-clock-o middle bigger-120 orange"></i>
                                                    <span class=""> 40 minutes idle </span>
                                                </div>

                                                <div class="hr dotted hr-8"></div>

                                                <div class="tools action-buttons">
                                                    <a href="#">
                                                        <i class="ace-icon fa fa-facebook-square blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-google-plus-square red bigger-150"></i>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="itemdiv memberdiv">
                                    <div class="inline pos-rel">
                                        <div class="user">
                                            <a href="#">
                                                <img src="assets/images/avatars/avatar2.png" alt="Phil Doe's avatar">
                                            </a>
                                        </div>

                                        <div class="body">
                                            <div class="name">
                                                <a href="#">
                                                    <span class="user-status status-online"></span>
                                                    Phil Doe
                                                </a>
                                            </div>
                                        </div>

                                        <div class="popover">
                                            <div class="arrow"></div>

                                            <div class="popover-content">
                                                <div class="bolder">Public Relations</div>

                                                <div class="time">
                                                    <i class="ace-icon fa fa-clock-o middle bigger-120 orange"></i>
                                                    <span class="green"> 2 hours ago </span>
                                                </div>

                                                <div class="hr dotted hr-8"></div>

                                                <div class="tools action-buttons">
                                                    <a href="#">
                                                        <i class="ace-icon fa fa-facebook-square blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-google-plus-square red bigger-150"></i>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="itemdiv memberdiv">
                                    <div class="inline pos-rel">
                                        <div class="user">
                                            <a href="#">
                                                <img src="assets/images/avatars/avatar3.png" alt="Susan Doe's avatar">
                                            </a>
                                        </div>

                                        <div class="body">
                                            <div class="name">
                                                <a href="#">
                                                    <span class="user-status status-online"></span>
                                                    Susan Doe
                                                </a>
                                            </div>
                                        </div>

                                        <div class="popover">
                                            <div class="arrow"></div>

                                            <div class="popover-content">
                                                <div class="bolder">HR Management</div>

                                                <div class="time">
                                                    <i class="ace-icon fa fa-clock-o middle bigger-120 orange"></i>
                                                    <span class="green"> 20 mins ago </span>
                                                </div>

                                                <div class="hr dotted hr-8"></div>

                                                <div class="tools action-buttons">
                                                    <a href="#">
                                                        <i class="ace-icon fa fa-facebook-square blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-google-plus-square red bigger-150"></i>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="itemdiv memberdiv">
                                    <div class="inline pos-rel">
                                        <div class="user">
                                            <a href="#">
                                                <img src="assets/images/avatars/avatar1.png" alt="Jennifer Doe's avatar">
                                            </a>
                                        </div>

                                        <div class="body">
                                            <div class="name">
                                                <a href="#">
                                                    <span class="user-status status-offline"></span>
                                                    Jennifer Doe
                                                </a>
                                            </div>
                                        </div>

                                        <div class="popover">
                                            <div class="arrow"></div>

                                            <div class="popover-content">
                                                <div class="bolder">Graphic Designer</div>

                                                <div class="time">
                                                    <i class="ace-icon fa fa-clock-o middle bigger-120 grey"></i>
                                                    <span class="grey"> 2 hours ago </span>
                                                </div>

                                                <div class="hr dotted hr-8"></div>

                                                <div class="tools action-buttons">
                                                    <a href="#">
                                                        <i class="ace-icon fa fa-facebook-square blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-google-plus-square red bigger-150"></i>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="itemdiv memberdiv">
                                    <div class="inline pos-rel">
                                        <div class="user">
                                            <a href="#">
                                                <img src="assets/images/avatars/avatar3.png" alt="Alexa Doe's avatar">
                                            </a>
                                        </div>

                                        <div class="body">
                                            <div class="name">
                                                <a href="#">
                                                    <span class="user-status status-offline"></span>
                                                    Alexa Doe
                                                </a>
                                            </div>
                                        </div>

                                        <div class="popover">
                                            <div class="arrow"></div>

                                            <div class="popover-content">
                                                <div class="bolder">Accounting</div>

                                                <div class="time">
                                                    <i class="ace-icon fa fa-clock-o middle bigger-120 grey"></i>
                                                    <span class="grey"> 4 hours ago </span>
                                                </div>

                                                <div class="hr dotted hr-8"></div>

                                                <div class="tools action-buttons">
                                                    <a href="#">
                                                        <i class="ace-icon fa fa-facebook-square blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                                                    </a>

                                                    <a href="#">
                                                        <i class="ace-icon fa fa-google-plus-square red bigger-150"></i>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="hr hr10 hr-double"></div>

                            <ul class="pager pull-right">
                                <li class="previous disabled">
                                    <a href="#">? Prev</a>
                                </li>

                                <li class="next">
                                    <a href="#">Next ?</a>
                                </li>
                            </ul>
                        </div><!-- /#friends -->

                        <div id="pictures" class="tab-pane">
                            <ul class="ace-thumbnails">
                                <li>
                                    <a href="#" data-rel="colorbox">
                                        <img alt="150x150" src="assets/images/gallery/thumb-1.jpg">
                                        <div class="text">
                                            <div class="inner">Sample Caption on Hover</div>
                                        </div>
                                    </a>

                                    <div class="tools tools-bottom">
                                        <a href="#">
                                            <i class="ace-icon fa fa-link"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-paperclip"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-pencil"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-times red"></i>
                                        </a>
                                    </div>
                                </li>

                                <li>
                                    <a href="#" data-rel="colorbox">
                                        <img alt="150x150" src="assets/images/gallery/thumb-2.jpg">
                                        <div class="text">
                                            <div class="inner">Sample Caption on Hover</div>
                                        </div>
                                    </a>

                                    <div class="tools tools-bottom">
                                        <a href="#">
                                            <i class="ace-icon fa fa-link"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-paperclip"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-pencil"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-times red"></i>
                                        </a>
                                    </div>
                                </li>

                                <li>
                                    <a href="#" data-rel="colorbox">
                                        <img alt="150x150" src="assets/images/gallery/thumb-3.jpg">
                                        <div class="text">
                                            <div class="inner">Sample Caption on Hover</div>
                                        </div>
                                    </a>

                                    <div class="tools tools-bottom">
                                        <a href="#">
                                            <i class="ace-icon fa fa-link"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-paperclip"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-pencil"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-times red"></i>
                                        </a>
                                    </div>
                                </li>

                                <li>
                                    <a href="#" data-rel="colorbox">
                                        <img alt="150x150" src="assets/images/gallery/thumb-4.jpg">
                                        <div class="text">
                                            <div class="inner">Sample Caption on Hover</div>
                                        </div>
                                    </a>

                                    <div class="tools tools-bottom">
                                        <a href="#">
                                            <i class="ace-icon fa fa-link"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-paperclip"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-pencil"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-times red"></i>
                                        </a>
                                    </div>
                                </li>

                                <li>
                                    <a href="#" data-rel="colorbox">
                                        <img alt="150x150" src="assets/images/gallery/thumb-5.jpg">
                                        <div class="text">
                                            <div class="inner">Sample Caption on Hover</div>
                                        </div>
                                    </a>

                                    <div class="tools tools-bottom">
                                        <a href="#">
                                            <i class="ace-icon fa fa-link"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-paperclip"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-pencil"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-times red"></i>
                                        </a>
                                    </div>
                                </li>

                                <li>
                                    <a href="#" data-rel="colorbox">
                                        <img alt="150x150" src="assets/images/gallery/thumb-6.jpg">
                                        <div class="text">
                                            <div class="inner">Sample Caption on Hover</div>
                                        </div>
                                    </a>

                                    <div class="tools tools-bottom">
                                        <a href="#">
                                            <i class="ace-icon fa fa-link"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-paperclip"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-pencil"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-times red"></i>
                                        </a>
                                    </div>
                                </li>

                                <li>
                                    <a href="#" data-rel="colorbox">
                                        <img alt="150x150" src="assets/images/gallery/thumb-1.jpg">
                                        <div class="text">
                                            <div class="inner">Sample Caption on Hover</div>
                                        </div>
                                    </a>

                                    <div class="tools tools-bottom">
                                        <a href="#">
                                            <i class="ace-icon fa fa-link"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-paperclip"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-pencil"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-times red"></i>
                                        </a>
                                    </div>
                                </li>

                                <li>
                                    <a href="#" data-rel="colorbox">
                                        <img alt="150x150" src="assets/images/gallery/thumb-2.jpg">
                                        <div class="text">
                                            <div class="inner">Sample Caption on Hover</div>
                                        </div>
                                    </a>

                                    <div class="tools tools-bottom">
                                        <a href="#">
                                            <i class="ace-icon fa fa-link"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-paperclip"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-pencil"></i>
                                        </a>

                                        <a href="#">
                                            <i class="ace-icon fa fa-times red"></i>
                                        </a>
                                    </div>
                                </li>
                            </ul>
                        </div><!-- /#pictures -->
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

