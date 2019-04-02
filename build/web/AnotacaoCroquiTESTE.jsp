<%-- 
    Document   : AnotacaoCroquiTESTE
    Created on : 28/02/2019, 16:53:53
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
                                    <form action="ControllerServlet?acao=AnotacaoCroquiUC" method="POST" >

                                        <div class="tab-content profile-edit-tab-content" >
                                            <!--Inicio da tab-pane Cadastro Croqui-->
                                            <div id="cad-croqui" class="tab-pane in active"  >
                                                <input type="hidden" name="pkAnotacaoExpediente" value="${anotCroqui.pkAnotacaoExpediente}" />
                                                <input type="hidden" name="execucao" value="${execucao}" />
                                                <h4 class="header smaller lbl "><strong>Cadastro de Historico do Croqui</strong></h4>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12"
                                                           <span class="lbl"><strong>Croqui:</strong></span>
                                                    </label>
                                                    <label class="col-sm-4 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                       value="${anotCroqui.cdCroqui}" placeholder="Código Croqui" >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-6 col-xs-12" name="cdCroqui" 
                                                                       placeholder="Código Croqui" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.cdCroqui}  100265</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>

                                                    <label class="col-sm-1 col-xs-12">
                                                        <span class = "lbl"><strong>Área:</strong></span>
                                                    </label>
                                                    <label class="col-sm-3 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-7 col-xs-12" name="cdArea" 
                                                                       value="${anotCroqui.cdArea}" placeholder="Código Área" 
                                                                </c:when>
                                                                <c:when test="${execucao == 'insert'}">
                                                                    <input type="text" id="form-field-1" class="col-sm-7 col-xs-12" name="cdArea" 
                                                                    placeholder="Código Área" >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.cdArea}  8M</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>                                                   
                                                </div>

                                            </div>
                                        </div>

                                        <br/>

                                        <div class="tab-content profile-edit-tab-content" >
                                            <div id="cad-croqui" class="tab-pane in active"  >
                                                <input type="hidden" name="pkAnotacaoExpediente" value="${anotCroqui.pkAnotacaoExpediente}" />
                                                <input type="hidden" name="execucao" value="${execucao}" />

                                                <div class="space-14"></div>


                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Interessado:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="nmInteressado" 
                                                                       value="${anotCroqui.nmInteressado}" placeholder="Nome do Interessado"  >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="nmInteressado" 
                                                                       placeholder="Nome do Interessado"  >
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.nmInteressado} C.M.S.P. - Vereador Toninho Vespoli </span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Assunto:</strong></span>
                                                    </label>
                                                    <label class="col-sm-8 col-xs-12">
                                                        <c:choose>
                                                            <c:when test="${execucao == 'edit'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="dsAssunto" 
                                                                       value="${anotCroqui.dsAssunto}" placeholder="Descrição do assunto"  >
                                                            </c:when>
                                                            <c:when test="${execucao == 'insert'}">
                                                                <input type="text" id="form-field-1" class="col-sm-11 col-xs-12"  name="dsAssunto" 
                                                                       placeholder="Descrição do assunto"  >         
                                                            </c:when>
                                                            <c:otherwise>
                                                                <span class="lbl">${anotCroqui.dsAssunto} Solicita incoorporação de praça à escola</span> 
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Informação DGPI: </strong></span>
                                                    </label>
                                                    <label class="col-sm-4 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-8 col-xs-12" name="nrInformacaoDgpi" 
                                                               value="${anotCroqui.nrInformacaoDgpi}" placeholder="Nº Informação DGPI"   >
                                                    </label>
                                                </div>

                                                <div class="form-group">
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <span class="lbl"><strong>Nº Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-4 col-xs-12">
                                                        <input type="text" class="col-xs-8 col-xs-12" name="nrprocesso" id="nrprocesso" value="${anotCroqui.cdExpediente}" 
                                                               placeholder="Nº do Expediente"    onKeyPress="return somenteNum(event);">
                                                    </label>

                                                    <label class="inline col-md-3 col-xs-12">
                                                        <span class="lbl"><strong>Tipo de Expediente:</strong></span>
                                                    </label>
                                                    <label class="inline col-md-2 col-xs-12">
                                                        <select class="col-md-12 col-xs-12" name="pkCatAutoCessao" >
                                                            <option></option>
                                                            <option>SEI</option>
                                                            <option>TID</option>
                                                            <option>CID</option>
                                                            <option>PA</option>
                                                        </select>
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
                                                               value="${dtAtuPubli}" placeholder="" >
                                                    </label>
                                                </div>

                                                <div class="space-1"></div>

                                                <div class="form-group">
                                                    <label class="inline col-sm-2 col-xs-12">
                                                        <span class="lbl"><strong>Data de Tramitação:</strong></span>
                                                    </label>
                                                    <label class="inline col-sm-4 col-xs-12" >
                                                        <input type="date" id="form-field-1" class="col-sm-8 col-xs-12"  name="cdExpediente" 
                                                               value="${anotCroqui.dtAnotacao}" placeholder="Escrever o despacho"  >
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
                                                               value="${anotCroqui.dtData}" >
                                                    </label>

                                                    <label class="col-sm-1 col-xs-12" >  
                                                        <span class="lbl"><strong>Nome:</strong></span>
                                                    </label> 
                                                    <label class="inline col-sm-5 col-xs-12">
                                                        <input type="text" id="form-field-1" class="col-sm-6 col-xs-12"  name="nmInteressado" 
                                                               value="${anotCroqui.nmAutor}" placeholder="Nome" >

                                                    </label>
                                                </div>

                                                <!-- Botões-->
                                                <div class="form-actions center ">
                                                    <button class="btn btn-yellow" type="reset" onclick=" location.href = 'AnotacaoCroquiTesteLista.jsp';">
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

                                    <br/>

                                    <h4><strong>Historico</strong></h4>
                                    <c:forEach var="histCroqui" items="${hCroqui.listHistCroqui(lcroqui.cdCroqui)}">
                                    </c:forEach>
                                    <div class="tab-content">
                                        <div class="form-group">
                                            <label class="inline col-md-2 col-xs-12">
                                                <span class="lbl" >
                                                    <strong>Interessado:</strong>
                                                </span>
                                            </label>
                                            <label class="inline col-md-10 col-xs-12">
                                                <span class="lbl">${hCroqui.nmInteressado} SubPrefeitura Mboi Mirim</span>
                                            </label>
                                        </div>
                                        <div class="form-group ">
                                            <label class="inline col-md-2 col-xs-12">
                                                <span class="lbl ">
                                                    <strong>Assunto:</strong>
                                                </span>
                                            </label>
                                            <label class="inline col-md-10 col-xs-12">
                                                <span class="lbl">${hCroqui.dsAssunto} Permissão de uso</span>
                                            </label>
                                        </div>

                                        <div class="form-group">
                                            <label class="inline col-md-2 col-xs-12">
                                                <span class="lbl">
                                                    <strong>Nº Expediente:</strong>
                                                </span>
                                            </label>
                                            <label class="inline col-md-5 col-xs-12">
                                                <span class="lbl">${hCroqui.cdExpediente}000.000.000-1</span>
                                            </label>
                                            <label class="inline col-xs-3 col-xs-12">
                                                <span class="lbl">
                                                    <strong>Tipo Expediente:</strong>
                                                </span>
                                            </label>
                                            <label class="inline col-md-1 col-xs-12">
                                                <span class="lbl">${hCroqui.sgExpediente}TID</span>
                                            </label>
                                        </div>
                                        <a href="AnotacaoCroquiDetalhesVTeste.jsp"><span class="glyphicon glyphicon-plus-sign"></span>Detalhes</a>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>    
                </div>    

                <jsp:include page = "include/footer.jsp" />
                <jsp:include page = "javaScritp/carregado.html" />

            </div>
        </div>
    </body>
</html>

