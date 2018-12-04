<%-- 
    Document   : grafico
    Created on : 12/07/2018, 11:35:09
    Author     : d732229
--%>
<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:set var="ter" value="${param.ter}" />

    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawVisualization);

      function drawVisualization() {
        // Some raw data (not necessarily accurate)
        var data = google.visualization.arrayToDataTable([
                  ['Month', 'Mar/18', 'Abr/2018', 'Mai/2018', 'Jun/2018'],
                  ['Total', 21, 21, 31, 32],
                  ['Herança', 6, 0, 0, 0],
                  ['Nesgas', 1, 0, 0, 0],
                  ['Locação', 4, 11, 4, 3],
                  ['Outros', 10, 10, 27, 29]
              ]);

              var options = {
                  title: 'Avaliação (DEAPI - Guilherme)',
                  chartArea: {width:'60%'},
                  vAxis: {title: '', minValue: 0,textStyle:{fontSize:10}},
                  hAxis: {title: ''},
                  seriesType: 'bars',
                  series: {5: {type: 'line'},},
                  legend: { position: ""},
                  height:300,
                  
              };

              var chart = new google.visualization.ComboChart(document.getElementById('avaliaca'));
              chart.draw(data, options);
          }
    </script>
    
    <script>
     google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Quantidade de processo por Divisão', 'Quantidade'],
          ['DDPI',  20],
          ['DIPI',  41],
          ['DEAPI',  44],
          ['AVALICAO', 10],
          ['GABINETE', 15]
        ]);

        var options = {
          title: 'Auto Cessão',
          chartArea:{left:'5%',top:'13%',width:'95%',height:'80%'},
          pieSliceText: 'value',
          //legend: { position: "left"},
          height:300,
          
        };

        var chart = new google.visualization.PieChart(document.getElementById('divisao'));
        chart.draw(data, options);
      }
    </script>
    
    <script type="text/javascript">
	google.load('visualization', '1', {packages: ['corechart', 'bar']});
	google.setOnLoadCallback(drawAnnotations);
      
      function drawAnnotations() {
      
      var data = google.visualization.arrayToDataTable([
        ['Auto de Cessao', '', {type: 'string', role: 'annotation'}],
            ['Transferência de Administração', 1243,'1243'],
            ['Permissão de Uso', 475,'475'],
            ['Áreas Recebidas em Cessão', 63,'63'],
            ['Concessão Administração de Uso', 62,'62'],
            ['Permissão de Uso a Título Percário e Oneroso', 33,'33']
        ]);
	var options = {
        title: 'Auto de Cessão',
        chartArea:{left:'25%',top:'10%',width:'80%',height:'80%'},
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

