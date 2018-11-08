/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.servidorAD;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;

/**
 *
 * @author d732229
 */
public class LoginAD2 {
    
    public static boolean authenticateJndi(String username, String password) throws Exception{
    Properties props = new Properties();
    props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
    props.put(Context.PROVIDER_URL, "ldap://c68v43i:389");
    props.put(Context.SECURITY_PRINCIPAL, "usr_sj2408_ldap");//adminuser - User with special priviledge, dn user
    props.put(Context.SECURITY_CREDENTIALS, "Atc37$bdKyj");//dn user password


    InitialDirContext context = new InitialDirContext(props);

    SearchControls ctrls = new SearchControls();
    ctrls.setReturningAttributes(new String[] { "givenName", "sn","memberOf" });
    ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

    NamingEnumeration<javax.naming.directory.SearchResult> answers = context.search("o=xx.com", "(uid=" + username + ")", ctrls);
    javax.naming.directory.SearchResult result = answers.nextElement();

    String user = result.getNameInNamespace();

    try {
        props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://c68v43i:389");
        props.put(Context.SECURITY_PRINCIPAL, user);
        props.put(Context.SECURITY_CREDENTIALS, password);

   context = new InitialDirContext(props);
    } catch (Exception e) {
        return false;
    }
    return true;
}
    
    
}
