<%-- 
    Document   : AdicionarHistorico
    Created on : 08/03/2019, 12:20:40
    Author     : x369482
--%>

<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<script>
    $(document).ready(function() {
    var max_fields = 10; //maximum input boxes allowed
            var wrapper = $(".input_fields_wrap"); //Fields wrapper
            var add_button = $(".add_field_button"); //Add button ID

            var x = 0; //initlal text box count
            $(add_button).click(function(e){ //on add input button click
    e.preventDefault();
            if (x < max_fields){ //max input box allowed
    x++; //text box increment
            $(wrapper).append('<br/><div class="input_fields_wrap"><div class="tab-content profile-edit-tab-content"><div id="cad-croqui" class="tab-pane in active"><input type="hidden" name="pkAnotacaoExpediente" value="${anotCroqui.pkAnotacaoExpediente}"/><input type="hidden" name="execucao" value="${execucao}" /><div class="space-14"></div><div class="form-group"><label class="inline col-sm-2 col-xs-12"><span class="lbl"><strong>Nº Informação DGPI: </strong></span></label><label class="col-sm-4 col-xs-12"><input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nrInformacaoDgpi" value="${anotCroqui.nrInformacaoDgpi}" placeholder="Nº Informação DGPI"></label></div><div class="form-group"><label class="inline col-md-2 col-xs-12"><span class="lbl"><strong>Nº Expediente:</strong></span></label><label class="inline col-md-4 col-xs-12"><input type="text" class="col-xs-8 col-xs-12" name="nrprocesso" id="nrprocesso" value="${anotCroqui.cdExpediente}" placeholder="Nº do Expediente" onKeyPress="return somenteNum(event);"></label><label class="inline col-md-2 col-xs-12"><span class="lbl"><strong>Tipo de Expediente:</strong></span></label><label class="inline col-md-2 col-xs-12"><select class="col-md-12 col-xs-12" name="pkCatAutoCessao"><option></option><option>TID</option><option>CID</option><option>PA</option></select></label></div><div class="form-group"><label class="inline col-sm-2 col-xs-12"><span class="lbl"><strong>Local:</strong></span></label><label class="col-sm-8 col-xs-12"><input type="text" id="form-field-1" class="col-sm-12 col-xs-12" name="nmEndereco" value="${anotCroqui.nmReferenciaEndereco}" placeholder="Descrição do local"></label></div><div class="space-1"></div><div class="form-group"><label class="inline col-sm-2 col-xs-12"><span class="lbl"><strong>Anotação:</strong></span></label><label class="col-sm-2 col-xs-12"><input id="id-button-borders" type="checkbox" id="" name="nrvigor" value="true" class="ace ace-switch ace-switch-5"><span class="lbl middle"></span></label><label class="col-sm-2 col-xs-12"><span class="lbl"><strong>Informação:</strong></span></label><label class="col-sm-3 col-xs-12"><input id="id-button-borders" type="checkbox" id="" name="nrvigor" value="true" class="ace ace-switch ace-switch-5"><span class="lbl middle"></span></label></div><div class="space-1"></div><div class="form-group"><label class="inline col-sm-2 col-xs-12"><span class="lbl"><strong>Despacho:</strong></span></label><label class="inline col-sm-8 col-xs-12"><input type="text" id="form-field-1" class="col-sm-10 col-xs-12" name="cdExpediente" value="${anotCroqui.dsDespacho}" placeholder="Escrever o despacho"></label></div><div class="space-1"></div><div class="form-group"><label class="inline col-sm-2 col-xs-12"><span class="lbl"><strong>Publicado no DOM:</strong></span></label><label class="inline col-sm-3 col-xs-12"><input type="date" id="form-field-1" class="col-sm-8 col-xs-12" value="${dtAtuPubli}"></label></div><div class="space-1"></div><div class="form-group"><label class="inline col-sm-2 col-xs-12"><span class="lbl"><strong>Data de Tramitação:</strong></span></label><label class="inline col-sm-3 col-xs-12"><input type="date" id="form-field-1" class="col-sm-8 col-xs-12" name="cdExpediente" value="${anotCroqui.dtAnotacao}" placeholder="Escrever o despacho"></label></div><div class="space-1"></div><div class="form-group"><label class="inline col-sm-2 col-xs-12"><span class="lbl"><strong>Observação:</strong></span></label><label class="inline col-sm-9 col-xs-12"><textarea class="form-control col-xs-12" id="form-field-8" name="dsObservacao" placeholder="Observação" style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;">${anotCroqui.dsObservacao}</textarea><label></div><div class="form-group"><label class="inline col-sm-2 col-xs-12"><span class="lbl"><strong>Data:</strong></span></label><label class="inline col-sm-3 col-xs-12"><input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtData" value="${anotCroqui.dtData}"></label><label class="col-sm-1 col-xs-12"><span class="lbl"><strong>Nome:</strong></span></label><label class="inline col-sm-4 col-xs-12"><input type="text" id="form-field-1" class="col-sm-6 col-xs-12"  name="nmInteressado" value="${anotCroqui.nmAutor}" placeholder="Nome"></label></div></div></div></div>'); //add input box
    }
    });
    
    $(wrapper).on("click",".remove_field", function(e){ //user click on remove text
            e.preventDefault(); $(this).parent('div').remove();
            });
            });
</script>
