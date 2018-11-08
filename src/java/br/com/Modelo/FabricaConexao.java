package br.com.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author d732229
 */
public class FabricaConexao {
    
//    --- CONEXÃO MYSQL LOCAL -----
//        String drive = "com.mysql.jdbc.Driver";
//        private final String banco ="cgpatri";
//        private final String url ="jdbc:mysql://SMDUGBC267:3306/"+banco;
//        private final String usuario ="root";
//        private final String senha ="root";
  
//        private final String url ="jdbc:mysql://10.69.40.84:3306/"+banco;
//        private final String url ="jdbc:mysql://localhost/"+banco;
//        private final String url ="jdbc:mysql://127.0.0.1:3306/"+banco;
//        private final String url ="jdbc:mysql://localhost/"+banco+"?useSSL=false";

    
//  -- CONEXÃO POSTGRESQL SERVIDOR HOMOLOGAÇÃO CAP --  
        String drive = "org.postgresql.Driver";
        private final String banco = "geoDGPI_restore_20180730_teste"; 
        private final String url = "jdbc:postgresql://10.69.41.91:5433/"+banco; //Antigo banco Homologação
//        private final String url = "jdbc:postgresql://10.69.40.181:5433/"+banco;
        Properties props = new Properties();
    
    public Connection getConnetion(){
        try{
            Class.forName(drive);

//          --- CONEXÃO MYSQL LOCAL -----      
//          return DriverManager.getConnection(url, usuario, senha);



//          -- CONEXÃO POSTGRESQL SERVIDOR HOMOLOGAÇÃO CAP --       
            props.setProperty("currentSchema","sch_cgpatri");
            props.setProperty("user","devhomolog");
            props.setProperty("password","Prodam@2018!");
            props.setProperty("ssl","false");
            return DriverManager.getConnection(url, props);

        }catch(SQLException | ClassNotFoundException erro){
        throw new RuntimeException(erro);
        
        }
    }
    
  
    
    
    
    
    
}
