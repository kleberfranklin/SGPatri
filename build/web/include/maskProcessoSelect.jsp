<%-- 
    Document   : maskProcessoSelect
    Created on : 06/05/2019, 15:26:24
    Author     : d732229
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script>
    function maskProcessoSelect() {
        var valorComob = document.getElementById("sgTpExpediente").value;
        
        var strValor = document.getElementById("nrprocesso").value; 
        var strTemp;

        strTemp = strValor.replace(/\D+/g, '');
        strValor = strTemp.trim();

    if(valorComob === "PA") {
        if (strValor.length > 12 || 12 > strValor.length){
            document.getElementById("btnExecutarAcao").disabled = true;
            document.getElementById("msgProcesso").style.visibility='visible';
            document.getElementById("msgProcesso").innerHTML = "<span class='badge badge-danger'>PA tem que ter 12 numeros!!</span>";
            document.getElementById("nrprocesso").value = strValor;
            document.getElementById("nrprocesso").focus();
        }else{ 
            document.getElementById("msgProcesso").style.visibility='hidden';
            document.getElementById("btnExecutarAcao").disabled = false;
            if (strValor.length > 11) {
                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3) + '.' + strValor.substr(8, 3) + '-' + strValor.substr(11, 1);
            } else if (strValor.length > 8) {
                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3) + '.' + strValor.substr(8, 3);
            } else if (strValor.length > 5) {
                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3);
            } else if (strValor.length > 4) {
                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1);
            }
            document.getElementById("nrprocesso").value = strValor;
        }    
    }else if(valorComob === "CID") {
        if (strValor.length > 12 || 12 > strValor.length){
            document.getElementById("btnExecutarAcao").disabled = true;
            document.getElementById("msgProcesso").style.visibility='visible';
            document.getElementById("msgProcesso").innerHTML = "<span class='badge badge-danger'>CID tem que ter 12 numeros!</span>";
            document.getElementById("nrprocesso").focus();
        }else{ 
            document.getElementById("msgProcesso").style.visibility='hidden';
            document.getElementById("btnExecutarAcao").disabled = false;
            if (strValor.length > 11) {
                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3) + '.' + strValor.substr(8, 3) + '-' + strValor.substr(11, 1);
            } else if (strValor.length > 8) {
                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3) + '.' + strValor.substr(8, 3);
            } else if (strValor.length > 5) {
                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1) + '.' + strValor.substr(5, 3);
            } else if (strValor.length > 4) {
                strValor = strValor.substr(0, 4) + '-' + strValor.substr(4, 1);
            }
            
        }    
        document.getElementById("nrprocesso").value = strValor;
    }else if(valorComob === "SEI") {
        if (strValor.length > 16 || 16 > strValor.length){
            document.getElementById("btnExecutarAcao").disabled = true;
            document.getElementById("msgProcesso").style.visibility='visible';
            document.getElementById("msgProcesso").innerHTML = "&nbsp;<span class='badge badge-danger'>SEI tem que ter 16 numeros!</span>";
            document.getElementById("nrprocesso").focus();
        }else{ 
            document.getElementById("msgProcesso").style.visibility='hidden';
            document.getElementById("btnExecutarAcao").disabled = false;
            if (strValor.length > 15) {
               strValor = strValor.substr(0, 4) + '.' + strValor.substr(4, 4) + '/' + strValor.substr(8, 7) + '-' + strValor.substr(15, 1);
            }
            else if (strValor.length > 8) {
               strValor = strValor.substr(0, 4) + '.' + strValor.substr(4, 4) + '/' + strValor.substr(8, 7);
            }
            else if (strValor.length > 4) {
               strValor = strValor.substr(0, 4) + '.' + strValor.substr(4, 4);
            }
        }
        document.getElementById("nrprocesso").value = strValor;
    }else if(valorComob === "TID") {
        if (strValor.length < 8){
            document.getElementById("btnExecutarAcao").disabled = true;
            document.getElementById("msgProcesso").style.visibility='visible';
            document.getElementById("msgProcesso").innerHTML = "&nbsp;<span class='badge badge-danger'>TID no minimo 8 numeros!</span>";
            document.getElementById("nrprocesso").focus();
        }else{ 
            document.getElementById("msgProcesso").style.visibility='hidden';
            document.getElementById("btnExecutarAcao").disabled = false;
        }
        document.getElementById("nrprocesso").value = strValor;
    }
   
}

function limpaCampoNrProcesso(){
    document.getElementById("nrprocesso").value ="";
    document.getElementById("nrprocesso").focus();
    document.getElementById("msgProcesso").style.visibility='hidden';
    document.getElementById("btnExecutarAcao").disabled = false;
}
    
    
</script>