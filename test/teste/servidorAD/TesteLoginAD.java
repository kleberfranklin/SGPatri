/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package teste.servidorAD;
import teste.servidorAD.LoginAD;
/**
 *
 * @author d732229
 */
public class TesteLoginAD {
     public static void main(String args[]) {
        String login = "d732229";
        String pass = "";
         
        
    Boolean autenticado = LoginAD.getInstance().authentication(login, pass);
    //Boolean autenticado = LoginAD2.authenticateJndi(login, pass);

        if (autenticado) {
            System.out.println("Autenticado "+autenticado);
        } else {
            System.out.println("Não Autenticado! "+autenticado);
        }
 
    
    }
    
}
