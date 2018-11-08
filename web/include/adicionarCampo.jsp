<%-- 
    Document   : adicionarCampo
    Created on : 25/10/2018, 18:52:28
    Author     : d732229
--%>
<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="TpDis" class= "br.com.Modelo.TipoDispositivoLegalDAO" />
<script>
$(document).ready(function() {
	var max_fields      = 3; //maximum input boxes allowed
	var wrapper   		= $(".input_fields_wrap"); //Fields wrapper
	var add_button      = $(".add_field_button"); //Add button ID
	
	var x = 1; //initlal text box count
	$(add_button).click(function(e){ //on add input button click
		e.preventDefault();
		if(x < max_fields){ //max input box allowed
			x++; //text box increment
			$(wrapper).append('<div class="space-1"></div><div class="form-group input_fields_wrap"><label class="inline col-md-2 col-xs-12" ><span class="lbl"><strong>Tipo de Dispositivo:</strong></span></label><label class="inline col-md-3 col-xs-12"><select class="col-md-12 col-xs-12" name="tpDispLegal"><option></option><c:forEach var="tpdis" items="${TpDis.listSelectTipoDisp()}"><option value="${tpdis.pkTipoDispLegal}" title="${tpdis.nmTipoDispLegal}">${tpdis.nmTipoDispLegal}</option></c:forEach></select></label><label class="inline col-md-1 col-xs-12" ><span class="lbl"><strong>N&#250;mero:</strong></span></label><label class="inline col-md-2 col-xs-12"><input type="number" id="form-field-1" class="col-xs-12 col-md-12" placeholder="numero" name="subprefeitura" ></label><label class="inline col-md-1 col-xs-12" ><span class="lbl"><strong>Data:</strong></span></label><label class="inline col-md-2 col-xs-12"><div class="input-group"><input class="form-control date-picker" id="id-date-picker-1" name="dtDispositivo" type="text" placeholder="dd/mm/aaaa" data-date-format="dd/mm/yyyy"><span class="input-group-addon"><i class="fa fa-calendar bigger-110"></i></span></div></label><a href="#" class="red remove_field"><i class="ace-icon fa fa-trash-o bigger-130"></i></a></div>'); //add input box
		}
	});
	
	$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
		e.preventDefault(); $(this).parent('div').remove(); x--;
	})
});
</script>
