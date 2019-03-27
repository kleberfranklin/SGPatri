<%-- 
    Document   : AdicionarCampoObs
    Created on : 25/03/2019, 15:30:14
    Author     : x369482
--%>

<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<script>
    $(document).ready(function () {
        var max_fields = 10; //maximum input boxes allowed
        var wrapper = $(".input_fields_wrap"); //Fields wrapper
        var add_button = $(".add_field_button"); //Add button ID

        var x = 0; //initlal text box count
        $(add_button).click(function (e) { //on add input button click
            e.preventDefault();
            if (x < max_fields) { //max input box allowed
                x++; //text box increment
                $(wrapper).append('<div class="input_fields_wrap"><div class="form-group"><label class="inline col-xs-1 col-xs-12"><span class="lbl"><strong>Obs:</strong></span></label><label class ="col-xs-8 col-xs-12"><input type="text" id="form-field-1" class="col-sm-12 col-xs-12" name="dsObservação" value="${anotCroqui.dsObservação}" placeholder="Observação" required="required"></label><a href="#" class="red remove_field" title="remover campos"><span class="label label-danger arrowed-right"><i class=" glyphicon glyphicon-minus-sign"></i></span></a></div></div>'); // add input box    
            }
        });

        $(wrapper).on("click", ".remove_field", function (e) { //user click on remove text
            e.preventDefault();
            $(this).parent('div').remove();
        });
    });
</script>
