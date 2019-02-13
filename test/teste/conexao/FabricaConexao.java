package teste.conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/**
 *
 * @author d732229
 */
public class FabricaConexao {
   
    
////---------------CONEXÃO PARA SGDB MySQL logal   
//    String drive = "com.mysql.jdbc.Driver";
//    String banco ="cgpatri";
////    String url ="jdbc:mysql://localhost/"+banco+"?useSSL=false";
////    String url ="jdbc:mysql://127.0.0.1/"+banco+"?useSSL=false";
////    String url ="jdbc:mysql://localhost/"+banco;
//    String usuario ="app";
//    String senha ="AppCGPatri#";


        String drive = "org.postgresql.Driver";
///////-----------CONEXÃAO SGDB PostgresSQL - HOMOLOGA/TEST
//        String banco = "SG_Patri_Homolog";
        String banco = "SG_Patri_Test";
        String url = "jdbc:postgresql://10.69.41.91:5433/"+banco;

//////-----------CONEXÃO SGDB PostgresSQL - CAP        
//        String banco = "geoDGPI";
//        String url = "jdbc:postgresql://10.69.40.70:5433/"+banco;


        Properties props = new Properties();
       
        public Connection getConnetion(){
        props.setProperty("currentSchema","sch_cgpatri");
//        props.setProperty("currentSchema","sch_cap");
        props.setProperty("user","devhomolog");
        props.setProperty("password","Prodam@2018!");
        props.setProperty("ssl","false");
        
        try{
          Class.forName(drive);
////---------------CONEXÃO PARA SGDB MySQL logal            
//        return DriverManager.getConnection(url, usuario, senha);

///----------------CONEXÃAO PARA SGDB PostgresSQL
        return  DriverManager.getConnection(url, props);
        
        }catch(SQLException | ClassNotFoundException erro){
        throw new RuntimeException(erro);
        
        }
    }      
    
    
}