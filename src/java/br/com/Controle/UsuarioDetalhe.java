/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;


import br.com.Modelo.Cargo;
import br.com.Modelo.CargoDAO;
import br.com.Modelo.Divisao;
import br.com.Modelo.DivisaoDAO;
import br.com.Modelo.Logica;
import br.com.Modelo.Perfil;
import br.com.Modelo.PerfilDAO;
import br.com.Modelo.Setor;
import br.com.Modelo.SetorDAO;
import br.com.Modelo.Usuario;
import br.com.Modelo.Usuario;
import br.com.Modelo.UsuarioDAO;
import br.com.Modelo.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class UsuarioDetalhe implements Logica{
@Override    
     public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
        
         
        UsuarioDAO usDAO = new UsuarioDAO();
        DivisaoDAO divDAO = new DivisaoDAO();
        SetorDAO stDAO = new SetorDAO();
        CargoDAO cgDAO = new CargoDAO();
        PerfilDAO pfDAO = new PerfilDAO();
        HttpSession session = req.getSession();

//Atributos         
        int pkUsuairo = 0;
        int pkDivisao = (Integer) session.getAttribute("sessionPkDivisao");
        String execucao;
        execucao = req.getParameter("execucao");
        if (!"insert".equals(execucao)){
            pkUsuairo  = Integer.parseInt(req.getParameter("pkUsuario"));
        }

//Consulta no banco e populando o objeto  
        Usuario us = usDAO.detalheUsuario(pkUsuairo);
               
        
        List<Divisao> listDivisao = divDAO.selectLisDivisao();
        List<Cargo> listCargo = cgDAO.listCargo();
        List<Perfil> listPerfil = pfDAO.listSelectPerfil();
        
        List<Setor> listSetor = new ArrayList<Setor>();
        
        if(!"insert".equals(execucao)){
            listSetor = stDAO.selecSetor(us.getPkDivisao());
        }else{
            listSetor =  stDAO.selecSetor(pkDivisao);
            System.out.println("Fk divisao: "+pkDivisao);
        }
       
        

        
        req.setAttribute("listDivisao", listDivisao);
        req.setAttribute("listSetor", listSetor);
        req.setAttribute("listCargo", listCargo);
        req.setAttribute("listPerfil", listPerfil);
        req.setAttribute("us", us);
        
        if("insert".equals(execucao)){
            return "UsuarioC.jsp";
        }
        return "UsuarioRU.jsp";
        
    }    
}
