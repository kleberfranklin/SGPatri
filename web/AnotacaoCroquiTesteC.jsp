<%-- 
    Document   : AnotacaoCroquiTesteC
    Created on : 11/03/2019, 12:37:31
    Author     : x369482
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
            <jsp:include page = "javaScritp/ajaxEndereco.html" />
            <jsp:include page = "javaScritp/maskProcesso.html" />
            <jsp:include page = "include/AdicionarHistorico.jsp" />


            <!--Verificação de acesso  -->
            <c:set var="acessoPerfil" value="${sessionPerfil}" />
            <jsp:directive.include file="include/ControleAcesso.jsp" />

            <!-- Beans -->        
            <jsp:useBean id="subPref" class= "br.com.Modelo.SubPrefeituraDAO" />

            <!--Pegando os paremetros -->
            <c:set var="pg" value="${param.pg}" />
            <c:set var="pf" value="${param.pf}" />
            <c:set var="pi" value="${param.pi}" />
            <c:set var="execucao" value="${param.execucao}" />

            <c:set var="qCroqui" value="${param.qCroqui}" />
            <c:set var="qArea" value="${param.qArea}" />
            <c:set var="qNome" value="${param.qNome}" />
            <c:set var="qEndereco" value="${param.qEndereco}" />
            <c:set var="qAssunto" value="${param.qAssunto}" />
            <c:set var="dtIni" value="${param.dtIni}" />
            <c:set var="dtFim" value="${param.dtFim}" />


            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="ace-icon fa fa-list"></i> Anotação Croqui</li>
                </ul>
            </div>    
            <div class="page-content" >
                <div id="" class="specific-block"></div>    
                <div class="row">
                    <div class="col-xs-12">
                        <div class="col-sm-offset-1 col-sm-10">
                            <h2>Anotação Croqui</h2>
                            <div class="space-14"></div>
                            <div class="form-horizontal">
                                <div class="tabbable">

                                    <ul class="nav nav-tabs padding-0">
                                        <li class="active">
                                            <a data-toggle="tab" href="#cad-croqui" aria-expanded="true">
                                                Anotação Croqui
                                            </a>
                                        </li>
                                    </ul>

                                    <form id="PesquisaExp" action="ControllerServlet?acao=AnotacaoCroquiUC" method="POST" >

                                        <div class="tab-content profile-edit-tab-content" >
                                            <!--Inicio da tab-pane Cadastro Croqui-->
                                            <div id="cad-croqui" class="tab-pane in active">
                                                <input type="hidden" name="pkAnotacaoExpediente" value="${anotCroqui.pkAnotacaoExpediente}" />
                                                <input type="hidden" name="execucao" value="${execucao}" />
                                                <h4 class="header smaller lbl "><strong>Cadastro de Historico do Documento</strong></h4>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Nº Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <input type="text" class="col-xs-8 col-xs-12" name="nrprocesso" id="nrprocesso" value="${anotCroqui.cdExpediente}" 
                                                               placeholder="Nº do Expediente"    onKeyPress="return somenteNum(event);" required="required">
                                                    </label>

                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Tipo de Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <select class="col-md-12 col-xs-12" name="pkTipoExpediente" required="required">
                                                            <option></option>
                                                            <option>SEI</option>
                                                            <option>TID</option>
                                                            <option>CID</option>
                                                            <option>PA</option>
                                                        </select>
                                                    </label>
                                                </div>

                                                <span class="input-group-btn">
                                                    <button type="submit" class="btn btn-inverse btn-white" >
                                                        <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                                                        Pesquisa
                                                    </button>
                                                </span>

                                            </div>
                                        </div>
                                    </form>

                                    <br/>
                                    <form action="ControllerServlet?acao=AnotacaoCroquiUC" method="POST" >


                                        <!-- testar se o obj da pesquisa esta empty--><c:if test=""></c:if>
                                        <c:if test=""></c:if>
                                            <div class="tab-content profile-edit-tab-content" >
                                                <div id="cad-croqui" class="tab-pane in active"  >
                                                    <input type="hidden" name="pkAnotacaoExpediente" value="${anotCroqui.pkAnotacaoExpediente}" />
                                                <input type="hidden" name="execucao" value="${execucao}" />

                                                <div class="space-14"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Informação DGPI: </strong></span>
                                                    </label>
                                                    <label class="col-sm-4 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nrInformacaoDgpi" 
                                                               value="${anotCroqui.nrInformacaoDgpi}" placeholder="Nº Informação DGPI" required="required" readonly="">
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12" >
                                                        <span class="lbl"><strong>Nº Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <input type="text" class="col-xs-8 col-xs-12" name="nrprocesso" id="nrprocesso" value="${anotCroqui.cdExpediente}" 
                                                               placeholder="Nº do Expediente"    onKeyPress="return somenteNum(event);" required="required">
                                                    </label>

                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Tipo de Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <select class="col-md-12 col-xs-12" name="pkTipoExpediente" required="required">
                                                            <option></option>
                                                            <option>SEI</option>
                                                            <option>TID</option>
                                                            <option>CID</option>
                                                            <option>PA</option>
                                                        </select>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12"
                                                           <span class="lbl"><strong>Croqui:</strong></span>
                                                    </label>
                                                    <label class="col-sm-4 col-xs-12">

                                                        <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                               placeholder="Código Croqui" required="required">
                                                    </label>

                                                    <label class="col-sm-1 col-xs-12">
                                                        <span class = "lbl"><strong>Área:</strong></span>
                                                    </label>
                                                    <label class="col-sm-3 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-7 col-xs-12" name="cdArea" 
                                                               placeholder="Código Área" required="required">
                                                    </label>                                                   
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Interessado:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="nmInteressado" 
                                                               placeholder="Nome do Interessado" required="required">
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Assunto:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="dsAssunto" 
                                                               placeholder="Descrição do assunto" required="required">         
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Local:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12" >
                                                        <input type="text" id="form-field-1" class="col-sm-11 col-xs-12" name="nmEndereco" 
                                                               value="${anotCroqui.nmReferenciaEndereco}"  placeholder="Descrição do local" >
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Anotação:</strong></span>
                                                    </label>
                                                    <label class="col-sm-2 col-xs-12" >
                                                        <input id="id-button-borders"  type="checkbox" id="" name="nrvigor" value="true" class="ace ace-switch ace-switch-5"  >
                                                        <span class="lbl middle"></span>
                                                    </label>

                                                    <label class="col-sm-2 col-xs-12" >  
                                                        <span class="lbl"><strong>Informação:</strong></span>
                                                    </label>           
                                                    <label class="col-sm-3 col-xs-12" >                                                  
                                                        <input id="id-button-borders"  type="checkbox" id="" name="nrvigor" value="true" class="ace ace-switch ace-switch-5"  >
                                                        <span class="lbl middle"></span>
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Despacho:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-8 col-xs-12" >
                                                        <input type="text" id="form-field-1" class="col-sm-10 col-xs-12"  name="cdExpediente" 
                                                               value="${anotCroqui.dsDespacho}" placeholder="Escrever o despacho"  >
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Publicado no DOM:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-4 col-xs-12" >
                                                        <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="" 
                                                               value="${dtAtuPubli}" title="Selecione a data">
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data de Tramitação:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-4 col-xs-12" >
                                                        <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="cdExpediente" 
                                                               value="${anotCroqui.dtAnotacao}" title="Selecione a data">
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Observação:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-9 col-xs-12" >
                                                        <textarea class="form-control col-xs-12" id="form-field-8" name="dsObservacao" placeholder="Observação" 
                                                                  style="margin: 0px 102.656px 0px 0px; width: 700px; height: 90px;">${anotCroqui.dsObservacao}</textarea>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-4 col-xs-12" >
                                                        <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="dtData" 
                                                               value="${anotCroqui.dtData}" required="required" title="Selecione a data">
                                                    </label>

                                                    <label class="col-sm-1 col-xs-12" >  
                                                        <span class="lbl"><strong>Nome:</strong></span>
                                                    </label> 
                                                    <label class="inline col-sm-5 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-6 col-xs-12"  name="nmAutor" 
                                                               value="${anotCroqui.nmAutor}" placeholder="Nome" required="required">

                                                    </label>
                                                </div>

                                                <!-- Botões-->
                                                <div class="form-actions center ">
                                                    <button class="btn btn-yellow" type="reset" onclick=" location.href = 'AnotacaoCroqui.jsp';">
                                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                                        Voltar
                                                    </button>

                                                    <c:if test="${execucao != 'view'}" >
                                                        <button class="btn btn-success" type="submit" id="salvar">
                                                            <i class="ace-icon fa fa-save bigger-110"></i>
                                                            Salvar
                                                        </button>

                                                        <button class="btn" type="reset">
                                                            <i class="ace-icon fa fa-eraser bigger-110"></i>
                                                            Limpar
                                                        </button>
                                                    </c:if>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <jsp:include page = "include/footer.jsp" />
                        <jsp:include page = "javaScritp/carregado.html" />
                    </div>    
                </div> 
            </div>
        </div>
    </body>
</html>

