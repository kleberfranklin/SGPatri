<%-- 
    Document   : newjsp
    Created on : 07/03/2019, 13:19:43
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
    
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script>
     google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Status', 'Quantidade'],
        <c:forEach var="auto" items="${listGrafico}" >
            ['<c:choose><c:when test="${auto.nmStatus=='NaoVerificado'}">Não Verificado</c:when><c:when test="${auto.nmStatus=='EmConferencia'}">Em Conferência</c:when><c:when test="${auto.nmStatus=='Corrigir'}">Fazer correção</c:when><c:otherwise>Validado</c:otherwise></c:choose>',${auto.fkValidacao}],
        </c:forEach>  
        ]);

        var options = {
          title: 'Auto Cessão Validação',
          chartArea:{left:'5%',top:'10%',width:'95%',height:'85%'},
          pieSliceText: 'value',
          //legend: { position: "left"},
          height:300,
          
        };
        var chart = new google.visualization.PieChart(document.getElementById('validacao'));
        chart.draw(data, options);
      }
    </script>
    
    
    <script type="text/javascript">
	google.load('visualization', '1', {packages: ['corechart', 'bar']});
	google.setOnLoadCallback(drawAnnotations);
      
      function drawAnnotations() {
      
      var data = google.visualization.arrayToDataTable([
        ['Auto de Cessao Validação', '', {type: 'string', role: 'annotation'}],
            <c:forEach var="auto" items="${listGrafico}" >
            [ '<c:choose><c:when test="${auto.nmStatus=='NaoVerificado'}">Não Verificado</c:when><c:when test="${auto.nmStatus=='EmConferencia'}">Em Conferência</c:when><c:when test="${auto.nmStatus=='Corrigir'}">Fazer correção</c:when><c:otherwise>Validado</c:otherwise></c:choose>',${auto.fkValidacao}, '${auto.fkValidacao}'],
            </c:forEach> 
        ]);
	var options = {
        title: 'Auto de Cessão',
        chartArea:{left:'18%',top:'10%',width:'80%',height:'80%'},
        annotations: {alwaysOutside: true,
          textStyle: {fontSize: 10 , auraColor: 'none', color:'#555'},
          boxStyle: { stroke: '#ccc', strokeWidth: 1, 
		  gradient: { color1: '#f3e5f5', color2: '#f3e5f5', x1: '0%', y1: '0%', x2: '100%', y2: '100%' } } },
        hAxis: {title: '', minValue: 0,textStyle:{fontSize:12} },
        vAxis: { title: '' },
		fontSize: 10
		
		};
      var chart = new google.visualization.BarChart(document.getElementById('autoCessao'));
      chart.draw(data, options);

    }
    </script>
    

    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-bar-chart"></i> Gráfico
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
                        Auto de Cessão Valicacao
                    </h5>
                </div>
                <div id="validacao" style="width:90%; height:150%; position: relative;"></div>
            </div>
        </div><!-- /.widget-box -->
        
        <div class="col-sm-6"  >
            <div class="widget-box">
                <div class="widget-header widget-header-flat widget-header-small">
                    <h5 class="widget-title">
                        <i class="ace-icon fa fa-bar-chart"></i>
                       Auto de Cessão Valicacao
                    </h5>
                </div>
                <div id="autoCessao" style="height: 300px;"></div>
            </div>
        </div>
         <!--<div class="col-sm-6" >
            <div class="widget-box">
                <div class="widget-header widget-header-flat widget-header-small">
                    <h5 class="widget-title">
                        <i class="ace-icon fa fa-bar-chart-o"></i>
                        Gestão 
                    </h5>
                </div>
                
                <div id="autoCessao" style="height: 300px;"></div>
            </div>
        </div>-->
     
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

