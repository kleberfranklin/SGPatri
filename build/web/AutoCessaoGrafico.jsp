<%-- 
    Document   : AutoCessaoGrafico
    Created on : 17/08/2018, 12:58:44
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

<!--Verificação de acesso  -->
    <c:set var="acessoPerfil" value="${sessionPerfil}" />
    <jsp:directive.include file="include/ControleAcesso.jsp" />
        
        
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-list"></i> Auto Cessão</li>
        </ul>
    </div>
        
    <div class="page-content">
    <div class="row">
    <div class="col-xs-12">
        <!-- <div class="col-sm-6">
            <div class="widget-box">
                <div class="widget-header widget-header-flat widget-header-small">
                    <h5 class="widget-title">
                        <i class="ace-icon fa fa-signal"></i>
                        Auto de Cessão
                    </h5>
                </div>
                <div id="avaliaca" style="width:90%; height:150%; position: relative;"></div>
            </div>
        </div><!-- /.widget-box -->
        
         <div class="col-sm-5"  >
            <div class="widget-box">
                <div class="widget-header widget-header-flat widget-header-small">
                    <h5 class="widget-title">
                        <i class="ace-icon fa fa-signal"></i>
                       Auto de Cessão
                    </h5>
                </div>
                <div id="divisao" style="height: 300px;"></div>
            </div><!-- /.widget-box -->
        </div>
         <div class="col-sm-7" >
            <div class="widget-box">
                <div class="widget-header widget-header-flat widget-header-small">
                    <h5 class="widget-title">
                        <i class="ace-icon fa fa-signal"></i>
                       Auto de Cessão 
                    </h5>
                </div>
                
                <div id="autoCessao" style="width:95% ; height: 300px; position: relative;"></div>
            </div><!-- /.widget-box -->
        </div>
        <br /><br /><br /><br />
        
        <div class="col-sm-12 " >
            <button class="btn btn-yellow right" type="reset" onclick=" location.href='AutoCessao.jsp';">
                <i class="ace-icon fa fa-undo bigger-110"></i>
                Voltar
            </button>    
        </div>
        <jsp:include page = "include/footer.jsp" />
   </div><!-- /.main-container --> 
    </body>
</html>

