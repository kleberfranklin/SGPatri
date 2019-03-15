



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
    <jsp:include page = "include/adicionarCampo.jsp" />
    <jsp:include page = "javaScritp/ajaxSelectSubFinalidade.html"/>
    
    

<!--Verificação de acesso  -->
    <c:set var="acessoPerfil" value="${sessionPerfil}" />
    <jsp:directive.include file="include/ControleAcesso.jsp" />
    
    <jsp:useBean id="TpCessao" class= "br.com.Modelo.TipoAutoCessaoDAO" />
    <jsp:useBean id="CatFin" class= "br.com.Modelo.CatFinalidadeDAO" />
    <jsp:useBean id="CatAuto" class= "br.com.Modelo.CatAutoCessaoDAO" />
    <jsp:useBean id="CatContra" class= "br.com.Modelo.CatContrapartidaDAO" />
    <jsp:useBean id="TpDis" class= "br.com.Modelo.TipoDispositivoLegalDAO" />
    <jsp:useBean id="subPref" class= "br.com.Modelo.SubPrefeituraDAO" />
    <jsp:useBean id="Disp" class= "br.com.Modelo.DispositivoLegalDAO"/>
    <jsp:useBean id="Arquivo" class= "br.com.Modelo.ArquivoDAO" />
    <jsp:useBean id="NvAdm" class= "br.com.Modelo.NivelAdministracaoDAO" />    

    <c:set var="selTpCessao" value="${TpCessao.detalheTpCessao(auto.fkTipoCessaoStage)}" />
    <c:set var="selCatAuto" value="${CatAuto.detalheCatAuto(auto.fkCatAutoStage)}" />
    <c:set var="selCatFin" value="${CatFin.detalheCatFinalidade(auto.fkCatFinalidadeStage)}" />

    
    <c:set var="ter" value="${param.ter}" />
    <c:set var="qProcesso" value="${param.qProcesso}" />
    <c:set var="qAC" value="${param.qAC}" />
    <c:set var="qVigor" value="${param.qVigor}" />
    <c:set var="pg" value="${param.pg}" />
    <c:set var="pf" value="${param.pf}" />
    <c:set var="pi" value="${param.pi}" />

  
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li><i class="ace-icon fa fa-list"></i> Validação do Auto de Cessão </li>
        </ul>
    </div>    
    <div class="page-content" >
    <div id="" class="specific-block"></div>    
    <div class="row">
    <div class="col-xs-12">
        
 
    <div class="col-sm-offset-1 col-sm-10">
        <h2>Validação do Auto de Cessão</h2>
        <div class="space-14"></div>
        <div class="form-horizontal">
            <div class="tabbable">
                <ul class="nav nav-tabs padding-0">
                    <li class="active">
                        <a data-toggle="tab" href="#auto-cessao" aria-expanded="true">
                            Validação do Auto Cessão 
                        </a>
                    </li>
                    <li class="Dispositivos Legais">
                        <a data-toggle="tab" href="#disp-legal" aria-expanded="true">
                           Dispositivos Legais
                        </a>
                    </li>
                    <li class="Dispositivos Legais">
                        <a data-toggle="tab" href="#anexar-doc" aria-expanded="true">
                           Anexar documentos
                        </a>
                    </li>
                    <li class="Valiação">
                        <a data-toggle="tab" href="#validacao" aria-expanded="true">
                            Validação
                        </a>
                    </li>
                </ul>

                <div class="tab-content profile-edit-tab-content">
                    <div id="auto-cessao" class="tab-pane  in active">
                            <form action="" method="POST" >
                                <div class="space-4"></div>
                                <div class="space-2"></div>
                                <input type="hidden" name="pkAutoStage" value="${auto.pkAutoStage}" />
                                
                                <div class="form-group">
                                    <div class="inline col-md-2 col-xs-12">
                                            <span class="lbl"><strong>Nº AC:</strong></span>
                                    </div>
                                    <label class="inline col-md-3 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrprocesso" value="${auto.nmCodAc}" placeholder="nº do AC"  >
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                            <span class="lbl">
                                                <strong>Categoria</strong>
                                            </span>
                                    </label>
                                    <label class="inline col-md-4 col-xs-12">
                                        <select class="col-md-12 col-xs-12" name="pkCatAutoCessao" required="required">
                                            <option>${selCatAuto.nmCatAutoCessao}</option>
                                            <option></option>
                                            <c:forEach var="CatAuto" items="${CatAuto.listSelectCatAutoCessao()}">
                                                <c:if test="${CatAuto.nmCatAutoCessao != 'Informação não cadastrada'}" >
                                                    <option value="${CatAuto.pkCatAutoCessao}" title="${CatAuto.nmCatAutoCessao}">${CatAuto.nmCatAutoCessao}</option>  
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                    </label>
                                </div>
                                <div class="form-group">
                                    <div class="inline col-md-2 col-xs-12">
                                            <span class="lbl"><strong>Data Lavratura:</strong></span>
                                    </div>
                                    <label class="inline col-md-3 col-xs-12 ">
                                        <div class="input-group">
                                            <input class="form-control date-picker" id="id-date-picker-1" name="dtlavratura" value="${auto.dtLavratura}" type="text" placeholder="dd/mm/aaaa" data-date-format="dd/mm/yyyy">
                                            <span class="input-group-addon">
                                                <i class="fa fa-calendar bigger-110"></i>
                                            </span>
                                        </div>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                            <span class="lbl"><strong>Nº Processo:</strong></span>
                                    </label>
                                    <label class="inline col-md-4 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrprocesso" value="${auto.nmProcesso}" placeholder="nº do processo"  >
                                    </label>
                                </div>

                                <div class="space-1"></div>    

                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Tipo de Cessão:</strong></span>
                                    </label>
                                    <label class="inline col-md-4 col-xs-12">
                                        <select class="col-md-12 col-xs-12" name="pkTpcessao">
                                            <option value="${selTpCessao.pkTipoAutoCessao}">${selTpCessao.nmTipoAutoCessao} </option>
                                            <option value=""></option>    
                                            <c:forEach var="cat" items="${TpCessao.listSelectTpCessao()}">
                                                <option value="${cat.pkTipoAutoCessao}" title="${cat.nmTipoAutoCessao}">${cat.nmTipoAutoCessao}</option>  
                                            </c:forEach>
                                        </select>    
                                    </label>
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Nível Adminstração:</strong></span>
                                    </label>
                                    <label class="inline col-md-3 col-xs-12">
                                        <select class="col-md-12 col-xs-12" name="pkNiveladm">
                                            <option value=""></option>    
                                            <c:forEach var="nv" items="${NvAdm.listNivelAdm()}">
                                                <option value="nv.pkAdm" title="">${nv.nmAdm}</option>  
                                            </c:forEach>
                                        </select>    
                                    </label>
                                </div>  

                                <div class="space-1"></div>
                                    
                                <div class="form-group">
                                    
                                </div>    

                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl">
                                            <strong>Cessionário/Cedente:</strong>
                                        </span>
                                    </label>
                                    <label class="inline col-md-9 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcessionario" value="${auto.nmCessionario}" placeholder="nome do cessionário"  >
                                    </label>
                                </div>

                                <div class="space-2"></div>                                

                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Categoria da finalidade:</strong></span>
                                    </label>
                                    <label class="inline col-md-3 col-xs-12">
                                        <select class="col-md-12 col-xs-12" name="pkCatFinalidade" id="pkCatFinalidade" onChange="pkCatFin(this)">
                                            <option value="${selCatFin.pkCatFinalidade}">${selCatFin.nmCatFinalidade}</option>
                                            <option></option>    
                                            <c:forEach var="catFin" items="${CatFin.listSelectCatFinalidade()}">
                                                <c:if test="${catFin.nmCatFinalidade != 'Informação não cadastrada'}" >
                                                    <option value="${catFin.pkCatFinalidade}" title="${catFin.nmCatFinalidade}">${catFin.nmCatFinalidade}</option>  
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Finalidade:</strong></span>
                                    </label>
                                    <label class="inline col-md-4 col-xs-12">
                                        <select class="col-md-12 col-xs-12" name="pkSubCatFinalidade" id="selectSubFinalidade" required="required" ></select>
                                    </label>
                                    
                                </div>

                                <div class="space-1"></div>                           
                                
                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl">
                                                <strong>Detalhamento da Finalidade</strong>
                                            </span>
                                    </label>
                                    <label class="inline col-md-8 col-xs-12">
                                        <textarea class="form-control" id="form-field-8" name="dsFinalidade" placeholder="Descreve a finalidade ex: Instalação do 75º Distrito Policial-PM" style="margin: 0px 102.656px 0px 0px; width: 600px; height: 50px;"></textarea>
                                    </label>
                                </div>
                                
                                <div class="space-1"></div>
                                

                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Planta:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmplanta" value="${auto.nmPlanta}" placeholder="nº da planta" >
                                    </label>

                                    <label class="inline col-md-1 col-xs-12" >
                                            <span class="lbl"><strong>Croqui:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcroqui" value="${auto.nmCroqui}" placeholder="nº croqui" >
                                    </label>

                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Área do croqui:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmarea" value="${auto.nrArea}" placeholder="" >
                                    </label>
                                </div>

                                <div class="space-1"></div>

                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Setor:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nrSetor" value="${auto.nrSetor}" placeholder="nº do setor²"  >
                                    </label>

                                     <label class="inline col-md-1 col-xs-12" >
                                            <span class="lbl"><strong>Quadra:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nrquadra" value="${auto.nrQuadra}" placeholder="nº da quadra">
                                    </label>
                                    <label class="inline col-md-1 col-xs-12" >
                                            <span class="lbl"><strong>Lote:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nrLote" value="${auto.nrLote}" placeholder="nº do lote">
                                    </label>
                                </div>
                                <div class="space-1"></div>
                                
                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>CAP:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="nmcap" placeholder="nº do cap">
                                    </label>
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Metragem oficial:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">developer 
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12"  name="" placeholder="Área m²">
                                    </label>
                                    
                                </div>
                                
                                <div class="space-1"></div>
                                
                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Subprefituras: </strong></span>
                                    </label>
                                    <label class="inline col-md-4 col-xs-12" >
                                        <select class="col-md-12 col-xs-12" name="subPrefeitura" id="">
                                            <option></option>    
                                            <c:forEach var="subPref" items="${subPref.listSelectSubPref()}">
                                                <option value="${subPref.pkSubPrefeitura}" title="${subPref.nmSubPrefeitura}">${subPref.nmSubPrefeitura}</option>  
                                            </c:forEach>
                                        </select>
                                    </label>
                                    
                                    <!--<label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>CEP:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12" >
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" placeholder="00000-000" name="" >
                                    </label>-->
                                </div>
                                
                                <div class="space-1"></div>

                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Tipo endereço:</strong></span>
                                    </label>
                                    <label class="inline col-md-3 col-xs-12">
                                        <select class="col-md-12 col-xs-12" name="tipoEndereco" title="Rua / Avenida / Praça / etc">
                                            <option></option>
                                            <option value="AC">ACESSO</option>
                                            <option value="AL">ALAMEDA</option>
                                            <option value="AVJ">AV. PROJETADA</option>
                                            <option value="AV">AVENIDA</option>
                                            <option value="BLR">BALAO RETORNO</option>
                                            <option value="BC">BECO</option>
                                            <option value="CM">CAMINHO</option>
                                            <option value="CMP">CAMINHO PART</option>
                                            <option value="CP">CAMINHO PEDEST</option>
                                            <option value="CV">COMPLEXO VIARIO</option>
                                            <option value="DV">DESVIO</option>
                                            <option value="DIV">DIV</option>
                                            <option value="ENT">ENT</option>
                                            <option value="ESJ">ES. PROJETADA</option>
                                            <option value="ESC">ESC</option>
                                            <option value="EL">ESPACO LIVRE</option>
                                            <option value="EPL">ESPLANADA</option>
                                            <option value="ER">EST. DE RODAGEM</option>
                                            <option value="EST">ESTACIONAMENTO</option>
                                            <option value="EF">ESTR. DE FERRO</option>
                                            <option value="ES">ESTRADA</option>
                                            <option value="ESP">ESTRADA PART</option>
                                            <option value="GL">GALERIA</option>
                                            <option value="JD">JARDIM</option>
                                            <option value="LD">LADEIRA</option>
                                            <option value="LG">LARGO</option>
                                            <option value="PQ">PARQUE</option>
                                            <option value="PS">PASSAGEM</option>
                                            <option value="PSP">PASSAGEM PART</option>
                                            <option value="PA">PASSARELA</option>
                                            <option value="PT">PATIO</option>
                                            <option value="PTE">PONTE</option>
                                            <option value="PTL">PONTILHAO</option>
                                            <option value="PQE">PQE</option>
                                            <option value="PQL">PQL</option>
                                            <option value="PQM">PQM</option>
                                            <option value="PC">PRACA</option>
                                            <option value="PCM">PRACA MANOBRA</option>
                                            <option value="PCJ">PRACA PROJETADA</option>
                                            <option value="PCR">PRACA RETORNO</option>
                                            <option value="PRO">PRO</option>
                                            <option value="PSJ">PS PROJETADA</option>
                                            <option value="PP">PS. DE PEDESTRE</option>
                                            <option value="PSS">PS. SUBTERRANEA</option>
                                            <option value="RV">RODOVIA</option>
                                            <option value="R">RUA</option>
                                            <option value="RP">RUA PART</option>
                                            <option value="RPJ">RUA PROJETADA</option>
                                            <option value="SV">SERVIDAO</option>
                                            <option value="TV">TRAVESSA</option>
                                            <option value="TVP">TRAVESSA PART</option>
                                            <option value="TN">TUNEL</option>
                                            <option value="TPJ">TV PROJETADA</option>
                                            <option value="VER">VEREDA</option>
                                            <option value="VIA">VIA</option>
                                            <option value="VCP">VIA CIRC PEDEST</option>
                                            <option value="VP">VIA DE PEDESTRE</option>
                                            <option value="VEL">VIA ELEVADA</option>
                                            <option value="VD">VIADUTO</option>
                                            <option value="VE">VIELA</option>
                                            <option value="VEP">VIELA PART</option>
                                            <option value="VEJ">VIELA PROJETADA</option>
                                            <option value="VES">VIELA SANITARIA</option>
                                            <option value="VL">VILA</option>
                                            <option value="VLP">VLP</option>
                                        </select>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Título do endereço:</strong></span>
                                    </label>
                                    <label class="inline col-md-4 col-xs-12" >
                                        <select class="col-md-12 col-xs-12" name="tituloEndereco" title="Capitão / Doutor / Dom / etc">
                                            <option></option>
                                            <option value="ABADE">ABADE</option>
                                            <option value="ACD">ACADEMICO</option>
                                            <option value="ADV">ADVOGADO</option>
                                            <option value="AGTE">AGENTE</option>
                                            <option value="AGRIC">AGRIC</option>
                                            <option value="AGRIM">AGRIMENSOR</option>
                                            <option value="AJUD">AJUDANTE</option>
                                            <option value="ALF">ALFERES</option>
                                            <option value="ALM">ALMIRANTE</option>
                                            <option value="APOST">APOSTOLO</option>
                                            <option value="ARC">ARCEBISPO</option>
                                            <option value="ARCIP">ARCIP</option>
                                            <option value="ARCJO">ARCJO</option>
                                            <option value="ARQA">ARQUITETA</option>
                                            <option value="ARQ">ARQUITETO</option>
                                            <option value="ARQPR">ARQUITETO PROFESSOR</option>
                                            <option value="ASP">ASPIRANTE</option>
                                            <option value="AV">AVENIDA</option>
                                            <option value="AVI">AVIADOR</option>
                                            <option value="AVIA">AVIADORA</option>
                                            <option value="BEL">BACHAREL</option>
                                            <option value="BAND">BANDEIRANTE</option>
                                            <option value="BANQ">BANQUEIRO</option>
                                            <option value="BR">BARAO</option>
                                            <option value="BRA">BARONESA</option>
                                            <option value="BEPDE">BEATO PADRE</option>
                                            <option value="BEMAV">BEM AVENTURADO</option>
                                            <option value="BNTO">BENEMERITO</option>
                                            <option value="BISP">BISPO</option>
                                            <option value="BRIG">BRIGADEIRO</option>
                                            <option value="CABO">CABO</option>
                                            <option value="CABPM">CABO PM</option>
                                            <option value="CAD">CADETE</option>
                                            <option value="CAMP">CAMPEADOR</option>
                                            <option value="CAP">CAPITAO</option>
                                            <option value="CPALM">CAPITAO ALMIRANTE</option>
                                            <option value="CAPFR">CAPITAO DE FRAGATA</option>
                                            <option value="CAPMG">CAPITAO DE MAR E GUERRA</option>
                                            <option value="CAPG">CAPITAO GENERAL</option>
                                            <option value="CAPM">CAPITAO MOR</option>
                                            <option value="CAPPM">CAPITAO PM</option>
                                            <option value="CAPT">CAPITAO TENENTE</option>
                                            <option value="CAR">CAR</option>
                                            <option value="CARD">CARDEAL</option>
                                            <option value="CAT">CATEQUISTA</option>
                                            <option value="CAV">CAVALEIRO</option>
                                            <option value="CAVLH">CAVALHEIRO</option>
                                            <option value="CIN">CINEASTA</option>
                                            <option value="COMTE">COMANDANTE</option>
                                            <option value="COMED">COMEDIANTE</option>
                                            <option value="COMEN">COMENDADOR</option>
                                            <option value="COMIA">COMISSARIA</option>
                                            <option value="COMIS">COMISSARIO</option>
                                            <option value="COMP">COMPOSITOR</option>
                                            <option value="CD">CONDE</option>
                                            <option value="CDSSA">CONDESSA</option>
                                            <option value="CON">CONEGO</option>
                                            <option value="CONF">CONFRADE</option>
                                            <option value="CONS">CONSELHEIRO</option>
                                            <option value="CONSU">CONSUL</option>
                                            <option value="CEL">CORONEL</option>
                                            <option value="CELPM">CORONEL PM</option>
                                            <option value="CRG">CORREGEDOR</option>
                                            <option value="DEL">DELEGADO</option>
                                            <option value="DENT">DENTISTA</option>
                                            <option value="DEPA">DEPUTADA</option>
                                            <option value="DEP">DEPUTADO</option>
                                            <option value="DEPDR">DEPUTADO DOUTOR</option>
                                            <option value="DESEM">DESEMBARGADOR</option>
                                            <option value="DIACO">DIACO</option>
                                            <option value="DOM">DOM</option>
                                            <option value="DONA">DONA</option>
                                            <option value="DR">DOUTOR</option>
                                            <option value="DRA">DOUTORA</option>
                                            <option value="DUQ">DUQUE</option>
                                            <option value="DUQSA">DUQUESA</option>
                                            <option value="EDIT">EDITOR</option>
                                            <option value="EDUC">EDUCADOR</option>
                                            <option value="EDUCA">EDUCADORA</option>
                                            <option value="EMB">EMBAIXADOR</option>
                                            <option value="EMBA">EMBAIXADORA</option>
                                            <option value="EMP">EMP</option>
                                            <option value="ENGA">ENGENHEIRA</option>
                                            <option value="ENG">ENGENHEIRO</option>
                                            <option value="ESCOT">ESCOTEIRO</option>
                                            <option value="ESC">ESCRAVO</option>
                                            <option value="ESCR">ESCRITOR</option>
                                            <option value="EXP">EXPEDICIONARIO</option>
                                            <option value="FIS">FISICO</option>
                                            <option value="FREI">FREI</option>
                                            <option value="GAL">GENERAL</option>
                                            <option value="GOV">GOVERNADOR</option>
                                            <option value="GRUM">GRUMETE</option>
                                            <option value="GCM">GUARDA CIVIL METROPOLITANO</option>
                                            <option value="IMAC">IMACULADA</option>
                                            <option value="IMPD">IMPERADOR</option>
                                            <option value="IMP">IMPERATRIZ</option>
                                            <option value="INF">INFANTE</option>
                                            <option value="INSP">INSPETOR</option>
                                            <option value="IRMA">IRMA</option>
                                            <option value="IRMAO">IRMAO</option>
                                            <option value="IRMOS">IRMAOS</option>
                                            <option value="IRMAS">IRMAS</option>
                                            <option value="JORN">JORNALISTA</option>
                                            <option value="LIB">LIBERTADOR</option>
                                            <option value="LIDCO">LIDCO</option>
                                            <option value="LIVR">LIVREIRO</option>
                                            <option value="LORD">LORDE</option>
                                            <option value="MME">MADAME</option>
                                            <option value="MADRE">MADRE</option>
                                            <option value="MAEST">MAESTRO</option>
                                            <option value="MAJ">MAJOR</option>
                                            <option value="MJAVI">MAJOR AVIADOR</option>
                                            <option value="MJBRI">MAJOR BRIGADEIRO</option>
                                            <option value="MAQ">MAQUINISTA</option>
                                            <option value="MAL">MARECHAL</option>
                                            <option value="MALAR">MARECHAL DO AR</option>
                                            <option value="MARQ">MARQUES</option>
                                            <option value="MARQA">MARQUESA</option>
                                            <option value="MERE">MERE</option>
                                            <option value="MTRAS">MESTRAS</option>
                                            <option value="MEST">MESTRE</option>
                                            <option value="MTRES">MESTRES</option>
                                            <option value="MIL">MILITANTE</option>
                                            <option value="MIN">MINISTRO</option>
                                            <option value="MISSA">MISSIONARIA</option>
                                            <option value="MISSO">MISSIONARIO</option>
                                            <option value="MONGE">MONGE</option>
                                            <option value="MONS">MONSENHOR</option>
                                            <option value="MUNIC">MUNIC</option>
                                            <option value="MUS">MUSICO</option>
                                            <option value="NSRA">NOSSA SENHORA</option>
                                            <option value="NS">NOSSO SENHOR</option>
                                            <option value="OUVID">OUVIDOR</option>
                                            <option value="PDE">PADRE</option>
                                            <option value="PDES">PADRES</option>
                                            <option value="PAI">PAI</option>
                                            <option value="PAPA">PAPA</option>
                                            <option value="PAST">PASTOR</option>
                                            <option value="PATR">PATRIARCA</option>
                                            <option value="POETA">POETA</option>
                                            <option value="POTSA">POETISA</option>
                                            <option value="PREF">PREFEITO</option>
                                            <option value="PRES">PRESIDENTE</option>
                                            <option value="PABL">PRESIDENTE DA ACAD.BRAS.LETRAS</option>
                                            <option value="PREVR">PREVR</option>
                                            <option value="PSARG">PRIMEIRO SARGENTO</option>
                                            <option value="PSGPM">PRIMEIRO SARGENTO PM</option>
                                            <option value="PTTE">PRIMEIRO TENENTE</option>
                                            <option value="PTEPM">PRIMEIRO TENENTE PM</option>
                                            <option value="PRSA">PRINCESA</option>
                                            <option value="PRINC">PRINCIPE</option>
                                            <option value="PROC">PROCURADOR</option>
                                            <option value="PROF">PROFESSOR</option>
                                            <option value="PRODR">PROFESSOR DOUTOR</option>
                                            <option value="PROEN">PROFESSOR ENGENHEIRO</option>
                                            <option value="PROFA">PROFESSORA</option>
                                            <option value="PROTA">PROFETA</option>
                                            <option value="PROM">PROMOTOR</option>
                                            <option value="PROV">PROVEDOR</option>
                                            <option value="PRVM">PROVEDOR MOR</option>
                                            <option value="RAB">RABINO</option>
                                            <option value="RADTA">RADIALISTA</option>
                                            <option value="RAINH">RAINHA</option>
                                            <option value="REG">REGENTE</option>
                                            <option value="REI">REI</option>
                                            <option value="REV">REVERENDO</option>
                                            <option value="R">RUA</option>
                                            <option value="SCT">SACERDOTE</option>
                                            <option value="STA">SANTA</option>
                                            <option value="STO">SANTO</option>
                                            <option value="S">SAO</option>
                                            <option value="SARG">SARGENTO</option>
                                            <option value="SARGM">SARGENTO MOR</option>
                                            <option value="SGPM">SARGENTO PM</option>
                                            <option value="SSARG">SEGUNDO SARGENTO</option>
                                            <option value="SSGPM">SEGUNDO SARGENTO PM</option>
                                            <option value="STTE">SEGUNDO TENENTE</option>
                                            <option value="SEN">SENADOR</option>
                                            <option value="SR">SENHOR</option>
                                            <option value="SRA">SENHORA</option>
                                            <option value="SERT">SERTANISTA</option>
                                            <option value="SIN">SINHA</option>
                                            <option value="SIR">SIR</option>
                                            <option value="SOCIO">SOCIOLOGO</option>
                                            <option value="SOLD">SOLDADO</option>
                                            <option value="SDPM">SOLDADO PM</option>
                                            <option value="SOROR">SOROR</option>
                                            <option value="SBTTE">SUB TENENTE</option>
                                            <option value="TTE">TENENTE</option>
                                            <option value="TTAVI">TENENTE AVIADOR</option>
                                            <option value="TTBRI">TENENTE BRIGADEIRO</option>
                                            <option value="TTCEL">TENENTE CORONEL</option>
                                            <option value="TTCPM">TENENTE CORONEL PM</option>
                                            <option value="TEO">TEOLOGO</option>
                                            <option value="TSARG">TERCEIRO SARGENTO</option>
                                            <option value="TSGPM">TERCEIRO SARGENTO PM</option>
                                            <option value="TIA">TIA</option>
                                            <option value="VER">VEREADOR</option>
                                            <option value="VALM">VICE ALMIRANTE</option>
                                            <option value="VREI">VICE REI</option>
                                            <option value="VIG">VIGARIO</option>
                                            <option value="VISC">VISCONDE</option>
                                            <option value="VISCA">VISCONDESSA</option>
                                            <option value="VOL">VOLUNTARIO</option>
                                        </select>

                                    </label>
                                </div>

                                <div class="space-1"></div>

                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Endereço:</strong></span>
                                    </label>
                                    <label class="inline col-md-6 col-xs-12" >
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmendereco" value="${auto.nmEndereco}"  placeholder="nome do endereço">
                                    </label>
                                    <label class="inline col-md-1 col-xs-12" >
                                        <span class="lbl"><strong>número:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12" >
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmendereco" value="${auto.nrEndereco}" placeholder="nº" >
                                    </label>
                                </div>

                                <div class="space-1"></div>

                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Complemento:</strong></span>
                                    </label>
                                    <label class="inline col-md-3 col-xs-12" >
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmcomplemento" value="${auto.nmComplementoEndereco}" placeholder="complemento do endereço" >
                                    </label>
                                    
                                </div>
                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >  
                                        <span class="lbl"><strong>Referência:</strong></span>
                                    </label>
                                    <label class="inline col-md-8 col-xs-12" >
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmfinalidade" value="${auto.nmReferencialEndereco}" placeholder="referencia do endereço" >
                                    </label>
                                </div>
                              
                                <div class="space-1"></div>

                                <div class="form-group">
                                     <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Prazo:</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <input type="number" id="form-field-1" class="col-xs-12 col-md-12" placeholder="" name="nrprazoAno" >
                                    </label>
                                    <label class="inline col-md-1 col-xs-12" >
                                            <span class="lbl"><strong>Ano</strong></span>
                                    </label>
                                    <label class="inline col-md-2 col-xs-12">
                                        <input type="number" id="form-field-1" class="col-xs-12 col-md-12" placeholder="" name="nrprazoMes" >
                                    </label>
                                    <label class="inline col-md-1 col-xs-12" >
                                            <span class="lbl"><strong>Meses</strong></span>
                                    </label>
                                    
                                    <label class="inline col-md-3 col-xs-12">
                                        <input type="text" id="form-field-1" class="col-xs-12 col-md-12" value="${auto.nrPrazo}" >
                                    </label>
                                    
                                </div>    

                                <div class="space-1"></div>
                                
                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Categoria da contrapartida:</strong></span>
                                    </label>
                                    <label class="inline col-md-4 col-xs-12">
                                        <select class="col-md-12 col-xs-12" name="">
                                            <option></option>
                                            <c:forEach var="catContra" items="${CatContra.listSelectCatContra()}">
                                                <option value="${catContra.pkCatContrapartida}" title="${catContra.nmCatContrapartida}">${catContra.nmCatContrapartida}</option>  
                                            </c:forEach>
                                        </select>
                                    </label>
                                </div>
                                <div class="space-1"></div>
                                
                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Contrapartida <font size="-2"> (Descrição Simplificada):</font></strong></span>
                                    </label>
                                    <label class="inline col-md-9 col-xs-12">
                                        <textarea class="form-control" id="form-field-8" name="dsContrapartida" placeholder="" style="margin: 0px 102.656px 0px 0px; width: 600px; height: 50px;">${auto.dsContrapartida}</textarea>
                                    </label>
                                </div>
                                <div class="space-1"></div>

                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl"><strong>Observação:</strong></span>
                                    </label>
                                    <label class="inline col-md-10 col-xs-12">
                                        <textarea class="form-control" id="form-field-8" name="dsObservacao" placeholder="" style="margin: 0px 102.656px 0px 0px; width: 600px; height: 50px;">${auto.dsObservacao}</textarea>
                                    </label>
                                </div>
                                <div class="space-2"></div>
                                
                                <h5 class="header smaller lbl"><strong>Dispositivo Legais</strong></h5>
                                
                                <div class="input_fields_wrap" >
                                    <div class="form-group">
                                        <label class="inline col-md-2 col-xs-12" >
                                            <span class="lbl">
                                                <strong>Tipo de Dispositivo:</strong>
                                            </span>
                                        </label>
                                        <label class="inline col-md-3 col-xs-12">
                                            <select class="col-md-12 col-xs-12" name="tpDispLegal">
                                                <option></option>
                                                <c:forEach var="tpdis" items="${TpDis.listSelectTipoDisp()}">
                                                    <option value="${tpdis.pkTipoDispLegal}" title="${tpdis.nmTipoDispLegal}">${tpdis.nmTipoDispLegal}</option>  
                                                </c:forEach>
                                            </select>
                                        </label>
                                        <label class="inline col-md-1 col-xs-12" >
                                            <span class="lbl"><strong>Número:</strong></span>
                                        </label>
                                        <label class="inline col-md-2 col-xs-12">
                                            <input type="number" id="form-field-1" class="col-xs-12 col-md-12" placeholder="numero" name="subprefeitura" >
                                        </label>

                                        <label class="inline col-md-1 col-xs-12" >
                                            <span class="lbl"><strong>Data:</strong></span>
                                        </label>
                                        <label class="inline col-md-2 col-xs-12">
                                            <div class="input-group">
                                                <input class="form-control date-picker" id="id-date-picker-1" name="dtDispositivo" type="text" placeholder="dd/mm/aaaa" data-date-format="dd/mm/yyyy">
                                                <span class="input-group-addon">
                                                    <i class="fa fa-calendar bigger-110"></i>
                                                </span>
                                            </div>
                                        </label>
                                        <a href="#" class="add_field_button" title="Adicionar dispositivos"><span class="label label-success arrowed"><i class=" fa fa-plus"></i></span></a>
                                    </div>
                                </div>

                                <div class="space-2"></div>
                               
                                <h5 class="header smaller lbl"><strong>Anexar Documentos</strong></h5>
                                <div class="form-group">
                                    <label class="col-md-3 col-xs-12">
                                        <c:set var="idPlanta"  value="${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'planta')}"  />    
                                        <c:choose>
                                            <c:when test="${ idPlanta.pkArquivo != '0'}" >
                                                <a href="#" id="id-btn-dialog1" class="btn btn-yellow"><i class="fa fa-upload"></i> Substituir Planta</a>
                                            </c:when>
                                            <c:otherwise>
                                                <a href="#" id="id-btn-dialog1" class="btn btn-default"><i class="fa fa-upload"></i> Anexar Planta</a>
                                            </c:otherwise>
                                        </c:choose>
                                    </label>        
                                    <label class="col-md-8 col-xs-12">
                                        <c:forEach var="ar" items="${Arquivo.listArquivo(auto.pkAutoStage, 'AutoCessao')}">
                                            <c:if test="${ar.nmTipo == 'planta'}">
                                                <a href="/CGPatri/Arquivo/Planta/${ar.nmNome}" target="_blank"><img src="img/img-planta.png" title="${ar.nmNome}" width="7%" height="7%"/></a>
                                            </c:if>    
                                        </c:forEach>
                                    </label>
                                </div>        
                                <div class="form-group">
                                    <label class="col-md-3 col-xs-12">
                                        <c:set var="idAC"  value="${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'AC')}"  /> 
                                        <c:choose>
                                            <c:when test="${idAC.pkArquivo != '0'}">
                                                <a href="#" id="id-btn-dialog2" class="btn btn-yellow"><i class="fa fa-upload"></i> Substituir Auto de Cessao</a>
                                            </c:when>
                                            <c:otherwise>
                                                <a href="#" id="id-btn-dialog2" class="btn btn-default"><i class="fa fa-upload"></i> Anexar Auto de Cessao</a>
                                            </c:otherwise>
                                        </c:choose>
                                    </label>
                                    <label class="col-md-8 col-xs-12">
                                        <c:forEach var="ar" items="${Arquivo.listArquivo(auto.pkAutoStage, 'AutoCessao')}">
                                            <c:if test="${ar.nmTipo == 'AC'}">
                                                <a href="/CGPatri/Arquivo/AC/${ar.nmNome}" target="_blank"><img src="img/img-arquivo.png" title="${ar.nmNome}" width="7%" height="7%"/></a>
                                            </c:if>
                                        </c:forEach>
                                    </label>        
                                </div>
                         
                                <div class="space-2" ></div>
                                
                                <h5 class="header smaller lbl"><strong>VALIAÇÃO</strong></h5>
                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl">
                                            <strong>Situação:</strong>
                                        </span>
                                    </label>
                                    <label class="inline col-md-10 col-xs-12">
                                        <select class="col-md-3 col-xs-12" name="tpDispLegal">
                                            <option></option>
                                            <option>Pendente</option>
                                            <option>Validado</option>
                                        </select>
                                    </label>
                                </div> 
                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Tipo de Problema:</strong></span>
                                    </label>
                                    <label class="inline col-md-4 col-xs-12">
                                        <select class="col-md-10 col-xs-12" name="tpDispLegal">
                                            <option></option>
                                            <option>Documento do Auto Cessão</option>
                                            <option>Planta</option>
                                            <option>Georreferenciamento</option>
                                            <option>Dificuldade na localização</option>
                                        </select>
                                    </label>

                                    <label class="inline col-md-3 col-xs-12" >
                                        <span class="lbl"><strong>Divisão responsável:</strong></span>
                                    </label>
                                    <label class="inline col-md-3 col-xs-12">
                                        <select class="" name="tpDispLegal">
                                            <option></option>
                                            <option>DDPI</option>
                                            <option>DEAPI</option>
                                            <option>DIPI</option>
                                        </select>
                                    </label>
                                </div>
                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Tarefa p/ solução:</strong></span>
                                    </label>
                                    <label class="inline col-md-4 col-xs-12">
                                        <select class="col-md-10 col-xs-12" name="tpDispLegal">
                                            <option></option>
                                            <option>Refazer polígono</option>
                                            <option>Refazer planta</option>
                                            <option>Chamar processo</option>
                                            <option>Vistória no local</option>
                                        </select>
                                    </label>
                                </div>
                                <div class="form-group">
                                    <label class="inline col-md-2 col-xs-12" >
                                        <span class="lbl"><strong>Notas:</strong></span>
                                    </label>
                                    <label class="inline col-md-10 col-xs-12">
                                        <textarea id="form-field-11" class="autosize-transition form-control" name="Nota" style="height:200px; margin-left: 0px;  width: 650px;"></textarea>
                                    </label> 
                                </div>
                                <div class="space-2"></div>
                                <div class="form-actions center">
                                    <button class="btn btn-yellow other-block preview" type="reset" onclick="location.href='ControllerServlet?acao=AutoCessaoValidacaoLista&pg=${pg}&pi=${pi}&pf=${pf}&qProcesso=${qProcesso}&qAC=${qAC}&qVigor=${qVigor}';">
                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                        Voltar
                                    </button>
                                    <button class="btn btn-success" type="submit">
                                        <i class="ace-icon fa fa-save bigger-110"></i>
                                        Salvar
                                    </button>
                                </div>
                        </form>
                    </div>

<!--Inicio da tab-pane Dispositvo Legal-->              
                    <div id="disp-legal" class="tab-pane">
                         
                    </div>

<!--Inicico da tab-pane Anexer Documento -->
                    <div id="anexar-doc" class="tab-pane">
                        
                    </div>
                             
<!-- Inicio do formulario Validação -->                             
                    <div id="validacao" class="tab-pane">
                       
                    </div>
                </div>
            </div>
        </div>    
    </div>        
      
      
    <jsp:include page = "include/footer.jsp" />
    <jsp:include page = "javaScritp/carregado.html" />
    
    </div><!-- /.main-container -->
    <div id="dialog-planta"style="display:none;">
        <form action="ControllerServlet?acao=ArquivoUpload" enctype="multipart/form-data" method="POST" >
            <input type="hidden" name="pkAutoStage" value="${auto.pkAutoStage}" />
            <input type="hidden" name="tipoArquivo" value="planta" />
            <input type="hidden" name="Origem" value="AutoCessao" />
            <c:set var="arPlanta"  value="${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'planta')}"  />
            <input type="hidden" name="pkArquivo" value="<c:out value="${arPlanta.pkArquivo}" />" />   
            
            <div class="form-group">
               <label class="inline col-md-3 col-xs-12"><strong>Nome da Planta:</strong></label>
               <label class="inline col-md-3">
                   <input type="text" id="form-field-1" class="col-xs-12 col-md-12" name="nmPlantaAnexa" placeholder="Nome da Planta" required="required" >
               </label>
               <label class="inline col-md-4 col-xs-12">
                   <input type="file" id="id-input-file-2" name="UploadPlanta" required="required"><span class="ace-file-container" data-title="Choose"><span class="ace-file-name" data-title="No File ..."></span></span>
               </label>
            </div>
            <div class="form-group">
                <label class="inline col-md-offset-4 col-md-2 col-xs-12">
                    <button class="btn btn-success" type="submit">
                        <i class="ace-icon fa fa-save bigger-110"></i>
                        Salvar
                    </button>
                </label>    
           </div>
       </form>
    </div>
    
    <div id="dialog-auto-cessao"style="display:none;">
        <form action="ControllerServlet?acao=ArquivoUpload" method="POST"  enctype="multipart/form-data">
            <input type="hidden" name="pkAutoStage" value="${auto.pkAutoStage}" />
            <input type="hidden" name="tipoArquivo" value="AC" />
            <input type="hidden" name="Origem" value="AutoCessao" />
            <c:set var="arAC"  value="${Arquivo.pkArquivo(auto.pkAutoStage,'AutoCessao', 'AC')}"  />
            <input type="hidden" name="pkArquivo" value="<c:out value="${arAC.pkArquivo}" />" /> 
            <div class="form-group">
               <label class="inline col-md-8 col-xs-12">
                   <input type="file" id="id-input-file-2" name="UploadAC" required="required" ><span class="ace-file-container" data-title="Choose"><span class="ace-file-name" data-title="No File ..."></span></span>
               </label>
                <label class="inline col-md-2 col-xs-12">
                    <button class="btn btn-success"  type="submit">
                        <i class="ace-icon fa fa-save bigger-110"></i>
                        Salvar
                    </button>
                </label>   
            </div>
       </form>
    </div>
    
    
    </body>
</html>

