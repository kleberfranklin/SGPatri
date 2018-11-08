/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.servidorAD;
import teste.servidorAD.Auth;
import ninja.javahacker.simpleldap.LdapConnectionException;
import ninja.javahacker.simpleldap.UserNotFoundException;
/**
 *
 * @author d732229
 */
public class Main2 {
    public static void main(String[] args) throws LdapConnectionException, UserNotFoundException  {
        String login= "d732229";
        String pass= "jesUs029";
        String teste ="";

        System.out.println("Logado: " + Auth.tryAuthenticate(login, pass));
        System.out.print(teste = Auth.findUserDn(login));
        
        
        
    }

}
