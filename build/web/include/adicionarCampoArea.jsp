<%-- 
    Document   : adicionarCampoArea
    Created on : 13/05/2019, 15:34:11
    Author     : d732229
--%>

<%@page contentType="text/html charset=UTF-8;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<script>
$(document).ready(function() {
	var max_fields      = 10; //maximum input boxes allowed
	var wrapper   		= $(".input_fields_wrap"); //Fields wrapper
	var add_button      = $(".add_field_button"); //Add button ID
	
	var x = 0; //initlal text box count
	$(add_button).click(function(e){ //on add input button click
            e.preventDefault();
            if(max_fields > x){ //max input box allowed
                x++; //text box increment
                //$(wrapper).append('<div class="form-group input_fields_wrap"><label class="inline col-md-offset-5 col-md-1 col-xs-12"><span class="lbl"><strong>Área:</strong></span></label><label class="col-md-2 col-xs-12"><input type="text" class="col-md-12 col-xs-12" name="cdArea" onKeyPress="return somenteNum(event);" maxlength="4" placeholder="Código Área"></label><a href="#" class="red remove_field" title="remover campos"><span class="label label-danger arrowed-right"><i class=" glyphicon glyphicon-minus-sign"></i></span></a></div>'); //add input box
                $(wrapper).append('<div class="form-group tab-content">\n\
                                        <div class="form-group">\n\
                                            <label class="inline col-md-2 col-xs-12">\n\
                                                   <span class="lbl"><strong>Croqui:</strong></span>\n\
                                            </label>\n\
                                            <label class="col-md-3 col-xs-12">\n\
                                                <input type="text" id="form-field-1" class="col-md-6 col-xs-12" name="cdCroqui"  onKeyPress="return somenteNum(event);" \n\
                                                placeholder="Código Croqui" maxlength="6" required="required">\n\
                                            </label>\n\
                                            <label class="col-md-2 col-xs-12">\n\
                                                <span class = "lbl"><strong>Área:</strong></span>\n\
                                            </label>\n\
                                            <label class="col-md-5 col-xs-12">\n\
                                                <input type="text" class="col-md-4 col-xs-12" name="cdArea"  onKeyPress="return somenteNum(event);" \n\
                                                    maxlength="4" placeholder="Código Área inserir" required="required"> \n\
                                            </label>\n\
                                        </div>\n\
                                        <div class="space-1"></div>\n\
                                        <div class="form-group">\n\
                                            <label class="inline col-md-2 col-xs-12" >\n\
                                                <span class="lbl"><strong>Tipo endereço:</strong></span>\n\
                                            </label>\n\
                                            <label class="inline col-md-3 col-xs-12">\n\
                                                <select class="col-md-12 col-xs-12" name="tipoEndereco" title="Rua / Avenida / Praça / etc" required="required">\n\
                                                    <option></option>\n\
                                                    <option>ACESSO</option>\n\
                                                    <option>ALAMEDA</option>\n\
                                                    <option>AV. PROJETADA</option>\n\
                                                    <option>AVENIDA</option>\n\
                                                    <option>BALAO RETORNO</option>\n\
                                                    <option>BECO</option>\n\
                                                    <option>CAMINHO</option>\n\
                                                    <option>CAMINHO PART</option>\n\
                                                    <option>CAMINHO PEDEST</option>\n\
                                                    <option>COMPLEXO VIARIO</option>\n\
                                                    <option>DESVIO</option>\n\
                                                    <option>DIV</option>\n\
                                                    <option>ENT</option>\n\
                                                    <option>ES. PROJETADA</option>\n\
                                                    <option>ESC</option>\n\
                                                    <option>ESPACO LIVRE</option>\n\
                                                    <option>ESPLANADA</option>\n\
                                                    <option>EST. DE RODAGEM</option>\n\
                                                    <option>ESTACIONAMENTO</option>\n\
                                                    <option>ESTR. DE FERRO</option>\n\
                                                    <option>ESTRADA</option>\n\
                                                    <option>ESTRADA PART</option>\n\
                                                    <option>GALERIA</option>\n\
                                                    <option>JARDIM</option>\n\
                                                    <option>LADEIRA</option>\n\
                                                    <option>LARGO</option>\n\
                                                    <option>PARQUE</option>\n\
                                                    <option>PASSAGEM</option>\n\
                                                    <option>PASSAGEM PART</option>\n\
                                                    <option>PASSARELA</option>\n\
                                                    <option>PATIO</option>\n\
                                                    <option>PONTE</option>\n\
                                                    <option>PONTILHAO</option>\n\
                                                    <option>PQE</option>\n\
                                                    <option>PQL</option>\n\
                                                    <option>PQM</option>\n\
                                                    <option>PRACA</option>\n\
                                                    <option>PRACA MANOBRA</option>\n\
                                                    <option>PRACA PROJETADA</option>\n\
                                                    <option>PRACA RETORNO</option>\n\
                                                    <option>PRO</option>\n\
                                                    <option>PS PROJETADA</option>\n\
                                                    <option>PS. DE PEDESTRE</option>\n\
                                                    <option>PS. SUBTERRANEA</option>\n\
                                                    <option>RODOVIA</option>\n\
                                                    <option>RUA</option>\n\
                                                    <option>RUA PART</option>\n\
                                                    <option>RUA PROJETADA</option>\n\
                                                    <option>SERVIDAO</option>\n\
                                                    <option>TRAVESSA</option>\n\
                                                    <option>TRAVESSA PART</option>\n\
                                                    <option>TUNEL</option>\n\
                                                    <option>TV PROJETADA</option>\n\
                                                    <option>VEREDA</option>\n\
                                                    <option>VIA</option>\n\
                                                    <option>VIA CIRC PEDEST</option>\n\
                                                    <option>VIA DE PEDESTRE</option>\n\
                                                    <option>VIA ELEVADA</option>\n\
                                                    <option>VIADUTO</option>\n\
                                                    <option>VIELA</option>\n\
                                                    <option>VIELA PART</option>\n\
                                                    <option>VIELA PROJETADA</option>\n\
                                                    <option>VIELA SANITARIA</option>\n\
                                                    <option>VILA</option>\n\
                                                    <option>VLP</option>\n\
                                                </select>\n\
                                            </label>\n\
                                            <label class="inline col-md-2 col-xs-12" >\n\
                                                <span class="lbl"><strong>Título do endereço:</strong></span>\n\
                                            </label>\n\
                                            <label class="inline col-md-3 col-xs-12" >\n\
                                                <select class="col-md-12 col-xs-12" name="tituloEndereco" title="Capitão / Doutor / Dom / etc">\n\
                                                    <option></option>\n\
                                                    <option>ABADE</option>\n\
                                                    <option>ACADEMICO</option>\n\
                                                    <option>ADVOGADO</option>\n\
                                                    <option>AGENTE</option>\n\
                                                    <option>AGRIC</option>\n\
                                                    <option>AGRIMENSOR</option>\n\
                                                    <option>AJUDANTE</option>\n\
                                                    <option>ALFERES</option>\n\
                                                    <option>ALMIRANTE</option>\n\
                                                    <option>APOSTOLO</option>\n\
                                                    <option>ARCEBISPO</option>\n\
                                                    <option>ARCIP</option>\n\
                                                    <option>ARCJO</option>\n\
                                                    <option>ARQUITETA</option>\n\
                                                    <option>ARQUITETO</option>\n\
                                                    <option>ARQUITETO PROFESSOR</option>\n\
                                                    <option>ASPIRANTE</option>\n\
                                                    <option>AVENIDA</option>\n\
                                                    <option>AVIADOR</option>\n\
                                                    <option>AVIADORA</option>\n\
                                                    <option>BACHAREL</option>\n\
                                                    <option>BANDEIRANTE</option>\n\
                                                    <option>BANQUEIRO</option>\n\
                                                    <option>BARAO</option>\n\
                                                    <option>BARONESA</option>\n\
                                                    <option>BEATO PADRE</option>\n\
                                                    <option>BEM AVENTURADO</option>\n\
                                                    <option>BENEMERITO</option>\n\
                                                    <option>BISPO</option>\n\
                                                    <option>BRIGADEIRO</option>\n\
                                                    <option>CABO</option>\n\
                                                    <option>CABO PM</option>\n\
                                                    <option>CADETE</option>\n\
                                                    <option>CAMPEADOR</option>\n\
                                                    <option>CAPITAO</option>\n\
                                                    <option>CAPITAO ALMIRANTE</option>\n\
                                                    <option>CAPITAO DE FRAGATA</option>\n\
                                                    <option>CAPITAO DE MAR E GUERRA</option>\n\
                                                    <option>CAPITAO GENERAL</option>\n\
                                                    <option>CAPITAO MOR</option>\n\
                                                    <option>CAPITAO PM</option>\n\
                                                    <option>CAPITAO TENENTE</option>\n\
                                                    <option>CAR</option>\n\
                                                    <option>CARDEAL</option>\n\
                                                    <option>CATEQUISTA</option>\n\
                                                    <option>CAVALEIRO</option>\n\
                                                    <option>CAVALHEIRO</option>\n\
                                                    <option>CINEASTA</option>\n\
                                                    <option>COMANDANTE</option>\n\
                                                    <option>COMEDIANTE</option>\n\
                                                    <option>COMENDADOR</option>\n\
                                                    <option>COMISSARIA</option>\n\
                                                    <option>COMISSARIO</option>\n\
                                                    <option>COMPOSITOR</option>\n\
                                                    <option>CONDE</option>\n\
                                                    <option>CONDESSA</option>\n\
                                                    <option>CONEGO</option>\n\
                                                    <option>CONFRADE</option>\n\
                                                    <option>CONSELHEIRO</option>\n\
                                                    <option>CONSUL</option>\n\
                                                    <option>CORONEL</option>\n\
                                                    <option>CORONEL PM</option>\n\
                                                    <option>CORREGEDOR</option>\n\
                                                    <option>DEPUTADA</option>\n\
                                                    <option>DELEGADO</option>\n\
                                                    <option>DENTISTA</option>\n\
                                                    <option>DEPUTADO</option>\n\
                                                    <option>DEPUTADO DOUTOR</option>\n\
                                                    <option>DESEMBARGADOR</option>\n\
                                                    <option>DIACO</option>\n\
                                                    <option>DOM</option>\n\
                                                    <option>DONA</option>\n\
                                                    <option>DOUTOR</option>\n\
                                                    <option>DOUTORA</option>\n\
                                                    <option>DUQUE</option>\n\
                                                    <option>DUQUESA</option>\n\
                                                    <option>EDITOR</option>\n\
                                                    <option>EDUCADOR</option>\n\
                                                    <option>EDUCADORA</option>\n\
                                                    <option>EMBAIXADOR</option>\n\
                                                    <option>EMBAIXADORA</option>\n\
                                                    <option>EMP</option>\n\
                                                    <option>ENGENHEIRA</option>\n\
                                                    <option>ENGENHEIRO</option>\n\
                                                    <option>ESCOTEIRO</option>\n\
                                                    <option>ESCRAVO</option>\n\
                                                    <option>ESCRITOR</option>\n\
                                                    <option>EXPEDICIONARIO</option>\n\
                                                    <option>FISICO</option>\n\
                                                    <option>FREI</option>\n\
                                                    <option>GENERAL</option>\n\
                                                    <option>GOVERNADOR</option>\n\
                                                    <option>GRUMETE</option>\n\
                                                    <option>GUARDA CIVIL METROPOLITANO</option>\n\
                                                    <option>IMACULADA</option>\n\
                                                    <option>IMPERADOR</option>\n\
                                                    <option>IMPERATRIZ</option>\n\
                                                    <option>INFANTE</option>\n\
                                                    <option>INSPETOR</option>\n\
                                                    <option>IRMA</option>\n\
                                                    <option>IRMAO</option>\n\
                                                    <option>IRMAOS</option>\n\
                                                    <option>IRMAS</option>\n\
                                                    <option>JORNALISTA</option>\n\
                                                    <option>LIBERTADOR</option>\n\
                                                    <option>LIDCO</option>\n\
                                                    <option>LIVREIRO</option>\n\
                                                    <option>LORDE</option>\n\
                                                    <option>MADAME</option>\n\
                                                    <option>MADRE</option>\n\
                                                    <option>MAESTRO</option>\n\
                                                    <option>MAJOR</option>\n\
                                                    <option>MAJOR AVIADOR</option>\n\
                                                    <option>MAJOR BRIGADEIRO</option>\n\
                                                    <option>MAQUINISTA</option>\n\
                                                    <option>MARECHAL</option>\n\
                                                    <option>MARECHAL DO AR</option>\n\
                                                    <option>MARQUES</option>\n\
                                                    <option>MARQUESA</option>\n\
                                                    <option>MERE</option>\n\
                                                    <option>MESTRAS</option>\n\
                                                    <option>MESTRE</option>\n\
                                                    <option>MESTRES</option>\n\
                                                    <option>MILITANTE</option>\n\
                                                    <option>MINISTRO</option>\n\
                                                    <option>MISSIONARIA</option>\n\
                                                    <option>MISSIONARIO</option>\n\
                                                    <option>MONGE</option>\n\
                                                    <option>MONSENHOR</option>\n\
                                                    <option>MUNIC</option>\n\
                                                    <option>MUSICO</option>\n\
                                                    <option>NOSSA SENHORA</option>\n\
                                                    <option>NOSSO SENHOR</option>\n\
                                                    <option>OUVIDOR</option>\n\
                                                    <option>PADRE</option>\n\
                                                    <option>PADRES</option>\n\
                                                    <option>PAI</option>\n\
                                                    <option>PAPA</option>\n\
                                                    <option>PASTOR</option>\n\
                                                    <option>PATRIARCA</option>\n\
                                                    <option>POETA</option>\n\
                                                    <option>POETISA</option>\n\
                                                    <option>PREFEITO</option>\n\
                                                    <option>PRESIDENTE</option>\n\
                                                    <option>PRESIDENTE DA ACAD.BRAS.LETRAS</option>\n\
                                                    <option>PREVR</option>\n\
                                                    <option>PRIMEIRO SARGENTO</option>\n\
                                                    <option>PRIMEIRO SARGENTO PM</option>\n\
                                                    <option>PRIMEIRO TENENTE</option>\n\
                                                    <option>PRIMEIRO TENENTE PM</option>\n\
                                                    <option>PRINCESA</option>\n\
                                                    <option>PRINCIPE</option>\n\
                                                    <option>PROCURADOR</option>\n\
                                                    <option>PROFESSOR</option>\n\
                                                    <option>PROFESSOR DOUTOR</option>\n\
                                                    <option>PROFESSOR ENGENHEIRO</option>\n\
                                                    <option>PROFESSORA</option>\n\
                                                    <option>PROFETA</option>\n\\n\
                                                    <option>PROMOTOR</option>\n\
                                                    <option>PROVEDOR</option>\n\
                                                    <option>PROVEDOR MOR</option>\n\
                                                    <option>RABINO</option>\n\
                                                    <option>RADIALISTA</option>\n\
                                                    <option>RAINHA</option>\n\
                                                    <option>REGENTE</option>\n\
                                                    <option>REI</option>\n\
                                                    <option>REVERENDO</option>\n\
                                                    <option>RUA</option>\n\
                                                    <option>SACERDOTE</option>\n\
                                                    <option>SANTA</option>\n\
                                                    <option>SANTO</option>\n\
                                                    <option>SAO</option>\n\
                                                    <option>SARGENTO</option>\n\
                                                    <option>SARGENTO MOR</option>\n\
                                                    <option>SARGENTO PM</option>\n\
                                                    <option>SEGUNDO SARGENTO</option>\n\
                                                    <option>SEGUNDO SARGENTO PM</option>\n\
                                                    <option>SEGUNDO TENENTE</option>\n\
                                                    <option>SENADOR</option>\n\
                                                    <option>SENHOR</option>\n\
                                                    <option>SENHORA</option>\n\
                                                    <option>SERTANISTA</option>\n\
                                                    <option>SINHA</option>\n\
                                                    <option>SIR</option>\n\
                                                    <option>SOCIOLOGO</option>\n\
                                                    <option>SOLDADO</option>\n\
                                                    <option>SOLDADO PM</option>\n\
                                                    <option>SOROR</option>\n\
                                                    <option>SUB TENENTE</option>\n\
                                                    <option>TENENTE</option>\n\
                                                    <option>TENENTE AVIADOR</option>\n\
                                                    <option>TENENTE BRIGADEIRO</option>\n\
                                                    <option>TENENTE CORONEL</option>\n\
                                                    <option>TENENTE CORONEL PM</option>\n\
                                                    <option>TEOLOGO</option>\n\
                                                    <option>TERCEIRO SARGENTO</option>\n\
                                                    <option>TERCEIRO SARGENTO PM</option>\n\
                                                    <option>TIA</option>\n\
                                                    <option>VEREADOR</option>\n\
                                                    <option>VICE ALMIRANTE</option>\n\
                                                    <option>VICE REI</option>\n\
                                                    <option>VIGARIO</option>\n\
                                                    <option>VISCONDE</option>\n\
                                                    <option>VISCONDESSA</option>\n\
                                                    <option>VOLUNTARIO</option>\n\
                                            </select>\n\
                                        </label>\n\
                                    </div>\n\
                                    <div class="space-1"></div>\n\
                                    <div class="form-group">\n\
                                        <label class="inline col-md-2 col-xs-12" >\n\
                                            <span class="lbl"><strong>Endereço:</strong></span>\n\
                                        </label>\n\
                                        <label class="inline col-md-6 col-xs-12" >\n\
                                            <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmendereco" placeholder="nome do endereço" required="required">\n\
                                        </label>\n\
                                            <label class="inline col-md-1 col-xs-12" >\n\
                                                <span class="lbl"><strong>número:</strong></span>\n\
                                            </label>\n\
                                        <label class="inline col-md-2 col-xs-12" >\n\
                                            <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrnumeroend" placeholder="nº">\n\
                                        </label>\n\
                                    </div>\n\
                                    <div class="space-1"></div>\n\
                                    <div class="form-group">\n\
                                        <label class="inline col-md-2 col-xs-12" >\n\
                                            <span class="lbl"><strong>Complemento:</strong></span>\n\
                                        </label>\n\
                                        <label class="inline col-md-3 col-xs-12" >\n\
                                            <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcomplementoend" placeholder="complemento do endereço" >\n\
                                        </label>\n\
                                    </div>\n\
                                    <div class="space-1"></div>\n\
                                    <div class="form-group">\n\
                                        <label class="inline col-md-2 col-xs-12" >\n\
                                            <span class="lbl"><strong>Referência:</strong></span>\n\
                                        </label>\n\
                                        <label class="inline col-md-8 col-xs-12" >\n\
                                            <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmreferenciaend" placeholder="referencia do endereço" >\n\
                                        </label>\n\
                                    </div>\n\
                                    <a href="#" class="red remove_field" title="remover campos">\n\
                                        <span class="label label-xlg label-danger">\n\
                                            <i class=" glyphicon glyphicon-minus"></i>\n\
                                            Remover\n\
                                        </span>\n\
                                    </a>\n\
                            </div>'); //add input box
            }
	});
	$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
            e.preventDefault(); $(this).parent('div').remove();
            x--;
	})
});
</script>