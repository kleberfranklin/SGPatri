<%-- 
    Document   : LFteste
    Created on : 29/05/2019, 15:37:14
    Author     : x369482
--%>
<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<script>

    var cities = L.layerGroup();

    L.marker([39.61, -105.02]).bindPopup('This is Littleton, CO.').addTo(cities),
            L.marker([39.74, -104.99]).bindPopup('This is Denver, CO.').addTo(cities),
            L.marker([39.73, -104.8]).bindPopup('This is Aurora, CO.').addTo(cities),
            L.marker([39.77, -105.23]).bindPopup('This is Golden, CO.').addTo(cities);

    L.polygon(${cap.geojson}).addTo(cities).bindPopup("CAP: ${cap.cdCap}");
    

    var mbAttr = 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors, ' +
            '<a href="https://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, ' +
            'Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
            mbUrl = 'https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpejY4NXVycTA2emYycXBndHRqcmZ3N3gifQ.rJcFIG214AriISLbB6B5aw';


    var map = L.map('map', {
        center: ${centralizarMapa},
        zoom: 16.2,
        layers: [cities]
    });

    var streets = L.tileLayer(mbUrl, {id: 'mapbox.streets', attribution: mbAttr, maxZoom: 20}).addTo(map);

    var baseLayers = {
        "Streets": streets
    };

    var overlays = {
        "CAP: ${cap.cdCap}": cities
    };

    L.control.layers(baseLayers, overlays).addTo(map);
</script>