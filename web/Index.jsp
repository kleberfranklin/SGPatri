
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
            <li><i class="ace-icon fa fa-dashboard"></i> Dashboard</li>
        </ul>
    </div>
        
    <div class="page-content">
    <div class="row">
    <div class="col-xs-12">
     <!--  <div class="col-sm-6">
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
        
         <div class="col-sm-6"  >
            <div class="widget-box">
                <div class="widget-header widget-header-flat widget-header-small">
                    <h5 class="widget-title">
                        <i class="ace-icon fa fa-bar-chart"></i>
                       Gestão
                    </h5>
                </div>
                <div id="divisao" style="height: 300px;"></div>
            </div><!-- /.widget-box -->
        </div>
         <div class="col-sm-6" >
            <div class="widget-box">
                <div class="widget-header widget-header-flat widget-header-small">
                    <h5 class="widget-title">
                        <i class="ace-icon fa fa-bar-chart-o"></i>
                        Gestão 
                    </h5>
                </div>
                
                <div id="autoCessao" style="height: 300px;"></div>
            </div><!-- /.widget-box -->
        </div>

        <jsp:include page = "include/footer.jsp" />
   </div><!-- /.main-container --> 
    </body>
</html>
