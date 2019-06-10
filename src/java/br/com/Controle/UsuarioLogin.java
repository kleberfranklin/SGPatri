/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;




import br.com.Modelo.Auth;
import br.com.Modelo.Logica;
import br.com.Modelo.Perfil;
import br.com.Modelo.PerfilDAO;
import br.com.Modelo.Usuario;
import br.com.Modelo.UsuarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class UsuarioLogin implements Logica {
@Override    
    public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {   
    
        HttpSession session = req.getSession();
        UsuarioDAO usDAO = new UsuarioDAO();
 /*
 * Atributo
 * login = login é o mesmo utilizado na rede do servidor AD     
 * senha = senha é a mesma utilizada na rede do servidor AD
 * nome =  nome do usuário     
 * pagina = pagina de retornor
 * msg, msg = mensagem a ser exibido no retorno da logica de autenticação do usuário       
 */
        String login, nome, senha, pagina, msg="", msg2="";
        Boolean autenticacao;
        
        login = req.getParameter("Login").toLowerCase();
        senha = req.getParameter("senha");

//Autenticação no servido AD     
        autenticacao = Auth.tryAuthenticate(login, senha);

//Lógica de autenticação do usuário para o acesso        
        if (autenticacao){
         Usuario us = usDAO.verificarLogin(login);
         Perfil per = new PerfilDAO().detalhePerfil(us.getPkPerfil());
            if (!us.getNmLogin().isEmpty()) {
                nome = us.getNmNome();
                String[] partes = nome.split(" ");
                session.setAttribute("sessionPkUs", us.getPkUsuario());
                session.setAttribute("sessionLogin", us.getNmLogin());
                session.setAttribute("sessionNome", partes[0]);
//                session.setAttribute("sNome", partes[partes.length - 1]); //pega o ultimo nome.
                session.setAttribute("sessionPkDivisao", us.getPkDivisao());
                session.setAttribute("sessionSgDivisao", us.getSgDivisao());
                session.setAttribute("sessionNmDivisao", us.getNmDivisao());
                session.setAttribute("sessionPkSetor",us.getPkSetor());
                session.setAttribute("sessionSgSetor",us.getSgSetor());
                session.setAttribute("sessionNmSetor",us.getNmSetor());
                session.setAttribute("sessionPerfil", us.getNmPerfil());
                session.setAttribute("sessionCargo", us.getNmCargo());
                session.setAttribute("sessionFoto", us.getNmFoto());
                session.setAttribute("sessionStatus", us.getNrAtivo());
                session.setAttribute("sessionLer", per.getNrLer());
                session.setAttribute("sessionInserir", per.getNrInserir());
                session.setAttribute("sessionEditar", per.getNrEditar());
                session.setAttribute("sessionExcluir", per.getNrExcluir());
                session.setAttribute("sessionPainel", per.getNrGerenciar());
                session.setAttribute("sessionDesPerfil", per.getDsPerfil());
                session.setAttribute("sessionId", session.getId());
                
                    if (us.getNrAtivo() == 0){
                        pagina = "AcessoNegado.jsp";
                        msg = "Seu acesso esta destivado momentaneamente!";
                        msg2= "Contetade o Diretor da sua divisão para regualizar.";
                    }else{
                        pagina = "ControllerServlet?acao=Dashborad";
                    }
            }else{
                pagina = "AcessoNegado.jsp";
                msg = "Você não tem acesso ao SISGI!";
                msg2= "Click no botão Solicitar acesso na tela de Login.";
            }
        
        }else{
            pagina = "Login.jsp";
            msg = "Login do usuário ou senha inválidos!\n"
                 + "obs.: login e a senha são os mesmo utilizados na rede da Prefeitura.";
        }
        
        req.setAttribute("msg", msg);
        req.setAttribute("msg2", msg2);
        return pagina;
    }
    
}
