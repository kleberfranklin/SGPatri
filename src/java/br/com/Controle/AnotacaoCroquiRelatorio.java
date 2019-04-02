///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.Controle;
//
//import br.com.Modelo.AnotacaoCroquiTesteDAO;
//import br.com.Modelo.AutoCessaoValidacao;
//import br.com.Modelo.Logica;
//import java.util.ArrayList;
//import java.util.List;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
///**
// *
// * @author x369482
// */
//public class AnotacaoCroquiRelatorio implements Logica {
//
//    @Override
//    public String executa(HttpServletRequest req,
//            HttpServletResponse res) throws Exception {
//
//        HttpSession session = req.getSession();
//
//        AnotacaoCroquiTesteDAO anotCroqRelDAO = new AnotacaoCroquiTesteDAO();
//        List<AnotacaoCroquiRelatorio> listRel = new ArrayList<AnotacaoCroquiRelatorio>();
//
//        String[] pkAnotacaoCroquiRelatorio;
//        int cont;
//
//        pkAnotacaoCroquiRelatorio = req.getParameterValues("pkAnotacaoCroquiRelatorio");
//        cont = pkAnotacaoCroquiRelatorio.length;
//
//        for (int i = 0; i < cont; i++) {
//            AnotacaoCroquiRelatorio anotCroqRel = new AnotacaoCroquiRelatorio();
//
//            anotCroqRel = anotCroqRelDAO.relatorioAnotacaoCroqui(Integer.parseInt(pkAnotacaoCroquiRelatorio[i]));
//            listRel.add(anotCroqRel);
//        }
//        return "void";
//    }
//}
