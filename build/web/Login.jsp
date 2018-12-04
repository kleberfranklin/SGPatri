<%-- 
    Document   : Login
    Created on : 07/08/2018, 15:22:29
    Author     : d732229
--%>

<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<c:set var="msg" value="${requestScope.msg}" />
<!DOCTYPE html>
<html>
    <jsp:include page = "include/head.jsp" />
    <body class="login-layout light-login">
        <div class="main-container">
            <div class="main-content">
                <div class="row">
                    <div class="col-sm-10 col-sm-offset-1">
                        <div class="login-container">
                            <div class="center">
                                <h1>
                                    <img src="img/logo_c.png" height="35%" width="35%" title="CGPatri - Gerador de Indicadores">
                                </h1>
                                
                            </div>

                            <div class="space-6"></div>

                            <div class="position-relative">
                                <div id="login-box" class="login-box visible widget-box no-border  ">
                                    <div class="widget-body ">
                                        <div class="widget-main ">
                                            <h4 class="header blue lighter bigger">
                                                <span class="red">SG-PATRI</span><br />
                                                <span class="grey">Sistema de Gestão das Áreas Públicas</span>
                                            </h4>

                                            <div class="space-6"></div>

                                            <form action="ControllerServlet?acao=UsuarioLogin" method="POST">
                                                <fieldset>
                                                    <label class="block clearfix col-sm-8 col-sm-offset-2">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="text" name="Login" class="form-control" placeholder="Login" title="Informar o mesmo login de rede ex.: (d000000 ou x000000)" required="required">
                                                            <i class="ace-icon fa fa-user"></i>
                                                        </span>
                                                    </label>

                                                    <label class="block clearfix col-sm-8 col-sm-offset-2">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="password" name="senha" class="form-control" placeholder="Senha" title="Utilizar a mesma senha de rede" required="required">
                                                            <i class="ace-icon fa fa-lock"></i>
                                                        </span>
                                                    </label>

                                                    <div class="space"></div>

                                                    <div class="clearfix center">
                                                        <button type="submit" class="width-35 btn btn-sm btn-primary">
                                                            <i class="ace-icon fa fa-key"></i>
                                                            <span class="bigger-110">Login</span>
                                                        </button>
                                                    </div>

                                                    <div class="space-4"></div>
                                                </fieldset>
                                            </form>

                                            <div class="social-or-login center">
                                                <span class="bigger-110">-</span>
                                            </div>
                                            <c:if test="${not empty msg || msg != null}">
                                            <div class="alert alert-danger">
                                                <span class="text-danger" >
                                                    <c:out value = "${msg}" />
                                                </span>
                                            </div>
                                            </c:if>
                                            <div class="space-6"></div>
                                        </div><!-- /.widget-main -->

                                        <div class="toolbar clearfix">
                                            <div>
                                            <!-- <a href="#" data-target="#forgot-box" class="forgot-password-link">
                                                    <i class="ace-icon fa fa-arrow-left"></i>
                                                    Esqueceu a senha.
                                                </a> -->
                                            <div class="space-8"></div>
                                            </div>
                                            <div>
                                               <!-- <a href="#" data-target="#signup-box" class="user-signup-link">
                                                    Solicitar acesso
                                                    <i class="ace-icon fa fa-arrow-right"></i>
                                                </a>-->
                                            <div class="space-8"></div>
                                            </div>
                                        </div>
                                    </div><!-- /.widget-body -->
                                </div><!-- /.login-box -->
                            
                            
                            
                            <!-- <div id="forgot-box" class="forgot-box widget-box no-border">
                                    <div class="widget-body">
                                        <div class="widget-main">
                                            <h4 class="header red lighter bigger">
                                                <i class="ace-icon fa fa-key"></i>
                                                Esqueceu sua senha?
                                            </h4>

                                            <div class="space-6"></div>
                                            <p>
                                               Por favor, insira seu endereço de e-mail. Um e-mail será enviado a você, para que possa escolher uma nova senha.
                                            </p>

                                            <form>
                                                <fieldset>
                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="email" class="form-control" placeholder="Email">
                                                            <i class="ace-icon fa fa-envelope"></i>
                                                        </span>
                                                    </label>

                                                    <div class="clearfix">
                                                        <button type="button" class="width-35 pull-right btn btn-sm btn-danger">
                                                            <i class="ace-icon fa fa-lightbulb-o"></i>
                                                            <span class="bigger-110">Enviar</span>
                                                        </button>
                                                    </div>
                                                </fieldset>
                                            </form>
                                        </div><!-- /.widget-main -->
                            
                                       <!-- <div class="toolbar center">
                                            <a href="#" data-target="#login-box" class="back-to-login-link">
                                                Back to login
                                                <i class="ace-icon fa fa-arrow-right"></i>
                                            </a>
                                        </div>
                                    </div>
                            
                                </div> -->
                                <!-- /.widget-body -->
                        <!-- /.forgot-box -->

                                <div id="signup-box" class="signup-box widget-box no-border">
                                    <div class="widget-body">
                                        <div class="widget-main">
                                           <h4 class="header blue lighter bigger">
                                                <span class="red">SISGI</span><br />
                                                <span class="grey" id="id-text2">Cadastro de solicitação de acesso</span>
                                            </h4>

                                            <div class="space-6"></div>
                                            <p> Preenchar o formulário: </p>

                                            <form action="#" method="POST">
                                                <fieldset>
                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="text" class="form-control" placeholder="Login: d00000">
                                                            <i class="ace-icon fa fa-info-circle"></i>
                                                        </span>
                                                    </label>

                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="text" class="form-control" placeholder="Nome completo">
                                                            <i class="ace-icon fa fa-user"></i>
                                                        </span>
                                                    </label>

                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="email" class="form-control" placeholder="Email">
                                                            <i class="ace-icon fa fa-envelope"></i>
                                                        </span>
                                                    </label> 
                                                    
                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="text" class="form-control" placeholder="Secretária/Prefitura Reginal">
                                                            <i class="ace-icon glyphicon glyphicon-home"></i>
                                                        </span>
                                                    </label> 
                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="email" class="form-control" placeholder="Divisão/Setor/Local">
                                                            <i class="ace-icon glyphicon glyphicon-home"></i>
                                                        </span>
                                                    </label> 
                                                    

                                                    <label class="block">
                                                        <input type="checkbox" class="ace">
                                                        <span class="lbl">
                                                            Eu aceito a
                                                            <a href="#">condições de uso.</a>
                                                        </span>
                                                    </label>

                                                    <div class="space-24"></div>

                                                    <div class="clearfix">
                                                        <button type="reset" class="width-30 pull-left btn btn-sm">
                                                            <i class="ace-icon fa fa-refresh"></i>
                                                            <span class="bigger-110">Limpar</span>
                                                        </button>

                                                        <button type="submit" class="width-30 col-sm-offset-3 btn btn-sm btn-success">
                                                            <span class="bigger-110">Solicitar</span>

                                                            <i class="ace-icon fa fa-arrow-right icon-on-right"></i>
                                                        </button>
                                                    </div>
                                                </fieldset>
                                            </form>
                                        </div>

                                        <div class="toolbar">
                                            <div>
                                                <a href="#" data-target="#login-box" class="back-to-login-link">
                                                    <i class="ace-icon fa fa-arrow-left"></i>
                                                    voltar tela de Login.
                                                </a>
                                            </div>
                                            
                                        </div>
                                    </div><!-- /.widget-body -->
                                </div><!-- /.signup-box -->
                            </div><!-- /.position-relative -->

                        </div>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.main-content -->
        </div><!-- /.main-container -->

        <!-- basic scripts -->

        <!--[if !IE]> -->
        <script src="assets/js/jquery-2.1.4.min.js"></script>

        <!-- <![endif]-->

        <!--[if IE]>
<script src="assets/js/jquery-1.11.3.min.js"></script>
<![endif]-->
        <script type="text/javascript">
                if('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
        </script>

        <!-- inline scripts related to this page -->
        <script type="text/javascript">
            jQuery(function ($) {
                $(document).on('click', '.toolbar a[data-target]', function (e) {
                    e.preventDefault();
                    var target = $(this).data('target');
                    $('.widget-box.visible').removeClass('visible');//hide others
                    $(target).addClass('visible');//show target
                });
            });
        </script>


    </body>
</html>
