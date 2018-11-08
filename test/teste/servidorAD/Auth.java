/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.servidorAD;

import ninja.javahacker.simpleldap.IncorrectPasswordException;
import ninja.javahacker.simpleldap.LdapAuthenticator;
import ninja.javahacker.simpleldap.LdapConnectionException;
import ninja.javahacker.simpleldap.UserNotFoundException;

/**
 *
 * @author d732229
 */
public class Auth {
    
         private static final String LDAP_SERVER = "10.10.68.43";
     private static final int LDAP_PORT = 3268;
     private static final String ROOT_DN = "usr_sj2408_ldap";
     private static final String ROOT_PW = "Atc37$bdKyj";
     private static final String DN = "dc=REDE,dc=sp";

     private static final LdapAuthenticator AUTH = createAuthenticator();

     private static LdapAuthenticator createAuthenticator() {
         try {
             return new LdapAuthenticator(LDAP_SERVER, LDAP_PORT, ROOT_DN, ROOT_PW, DN);
         } catch (LdapConnectionException x) { // Bad LDAP configuration parameters!
             throw new ExceptionInInitializerError(x);
         }
     }

     private Auth() {}

     public static void authenticate(String login, String password) throws LdapConnectionException, UserNotFoundException, IncorrectPasswordException {
         AUTH.authenticate(login, password);
     }

     public static boolean tryAuthenticate(String login, String password) throws LdapConnectionException {
         return AUTH.tryAuthenticate(login, password);
     }

     public static String findUserDn(String login) throws LdapConnectionException, UserNotFoundException {
         return AUTH.findDn(login);
     }

    
}
