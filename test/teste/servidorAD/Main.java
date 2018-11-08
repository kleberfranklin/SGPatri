/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.servidorAD;

import teste.servidorAD.Auth;
import ninja.javahacker.simpleldap.IncorrectPasswordException;
import ninja.javahacker.simpleldap.LdapConnectionException;
import ninja.javahacker.simpleldap.UserNotFoundException;


/**
 *
 * @author d732229
 */
public class Main {
    public static void main(String[] args) throws LdapConnectionException, UserNotFoundException, IncorrectPasswordException {
        Auth.authenticate("d732229", "jesUs029");
        System.out.println("Logado com sucesso!");
    }

}
