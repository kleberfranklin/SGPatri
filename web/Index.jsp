
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
    
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
	google.load('visualization', '1', {packages: ['corechart', 'bar']});
	google.setOnLoadCallback(drawAnnotations);
      
      function drawAnnotations() {
      
      var data = google.visualization.arrayToDataTable([
        ['Auto de Cessao', '', {type: 'string', role: 'annotation'}],
        <c:forEach var="auto" items="${lisQtdTipoAutoCessao}">
            [ '${auto.tipoAutoCessao.nmTipoAutoCessao}', ${auto.fkValidacao}, '${auto.fkValidacao}'],
        </c:forEach>
        ]);
	var options = {
        title: 'Auto de Cessão por quantidade, os quinze primeiros',
        chartArea:{left:'40%',top:'10%',width:'55%',height:'80%'},
        annotations: {alwaysOutside: true,
          textStyle: {fontSize: 10 , auraColor: 'none', color:'#555'},
          boxStyle: { stroke: '#ccc', strokeWidth: 1, 
		  gradient: { color1: '#f3e5f5', color2: '#f3e5f5', x1: '0%', y1: '0%', x2: '100%', y2: '100%' } } },
        hAxis: {title: '', minValue: 0,textStyle:{fontSize:12} },
        vAxis: { title: '' },
		fontSize: 10
		
		};
      var chart = new google.visualization.BarChart(document.getElementById('qtdAutoCessao'));
      chart.draw(data, options);
    }
    </script>

    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-dashboard"></i> Dashboard 
            </li>
        </ul>
    </div>
        
    <div class="page-content">
    <div class="row">
    <div class="col-xs-12">
     <div class="col-sm-6">
            <div class="widget-box">
                <div class="widget-header widget-header-flat widget-header-small">
                    <h5 class="widget-title">
                        <i class="ace-icon fa fa-bar-chart-o"></i>
                        Auto de Cessão
                    </h5>
                </div>
                <!--<div id="qtdAutoCessao" style="width:90%; height:150%; position: relative;"></div>-->
                <a href="#"><div id="qtdAutoCessao" style="height: 250px;"></div></a>
            </div>
        </div>
        
         <div class="col-sm-6"  >
            <div class="widget-box">
                <div class="widget-header widget-header-flat widget-header-small">
                    <h5 class="widget-title">
                        <i class="ace-icon fa fa-bar-chart"></i>
                       Gestão
                    </h5>
                </div>
                <div id="divisao" style="height: 250px;"></div>
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
                
                <div id="autoCessao" style="height: 250px;"></div>
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
                
                <div id="autoCessao" style="height: 250px;"></div>
            </div><!-- /.widget-box -->
        </div>

        <jsp:include page = "include/footer.jsp" />
   </div><!-- /.main-container --> 
    </body>
</html>
