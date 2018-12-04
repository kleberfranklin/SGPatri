<%-- 
    Document   : AcessoNegado
    Created on : 21/08/2018, 16:37:38
    Author     :d732229
--%>
<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="msg"  value="${requestScope.msg}" />
<c:set var="msg2" value="${requestScope.msg2}" />
<c:set var="msg3" value="${resquestScope.msg3}" />

<!DOCTYPE html>
<html>
    <jsp:include page = "include/head.jsp" />
    <body class="login-layout light-login">
        <div class="main-container">
            <div class="main-content">
                <div class="row">
                    <div class="col-sm-12 ">
                        <div class="login-container">
                            <div class="space-24"></div>
                            <div class="position-relative">
                                <div id="login-box" class="login-box visible widget-box no-border">
                                    <div class="widget-body col-dm-12">
                                        <div class="widget-main center">
                                            <h1>
                                                <span class="text text-danger">Acesso Negado</span>
                                            </h1>
                                            <img src="img/stop.png" width="90%" tle="Acesso Negado">
                                            <div class="space-1"></div>
                                            <form action="" method="">
                                                <fieldset>
                                                    <span id="id-text2">
                                                        <c:choose>
                                                            <c:when test="${not empty msg || msg != null}">
                                                                <c:out value = "${msg}" /><br />
                                                                <c:out value = "${msg2}" />
                                                            </c:when>
                                                            <c:when test="${not empty msg3 || msg3 != null}">
                                                                Você não tem acesso a este conteúdo! <br />
                                                                Por favor, contate o Diretor(a) ou Administrado do sistema, caso necessite de acessar este conteúdo!
                                                            </c:when>    
                                                            <c:otherwise>
                                                                O seu acesso expirou !
                                                            </c:otherwise>
                                                        </c:choose>       
                                                    </span>
                                                    <div class="space-20"></div>
                                                    <div class="clearfix">
                                                        <c:choose>
                                                            <c:when test="${not empty msg3 || msg3 != null}">
                                                                <button class="btn btn-yellow" type="reset" onclick="location.href='javascript:history.back();'">
                                                                    <i class="ace-icon fa fa-undo bigger-110"></i>
                                                                    <span class="bigger-110">Voltar</span>
                                                                </button>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <button class=" width-65 btn btn-sm btn-primary" type="reset" onclick="location.href='Login.jsp'">
                                                                    <span class="bigger-110">Logar novamente</span>
                                                                </button>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </div>
                                                    <div class="space-20"></div>
                                                </fieldset>
                                            </form>
                                        </div><!-- /.widget-main -->
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


                <!-- inline scripts related to this page -->


            </div>
    </body>

</html>
