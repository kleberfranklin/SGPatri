package teste.conexao;



import br.com.Modelo.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Properties;
/**
 *
 * @author d732229
 */
public class FabricaConexao {
    public static void main(String args[]) {
    
//      Conexão para banco MySQL logal
//    String drive = "com.mysql.jdbc.Driver";
//    String banco ="cgpatri";
////    String url ="jdbc:mysql://localhost/"+banco+"?useSSL=false";
////    String url ="jdbc:mysql://127.0.0.1/"+banco+"?useSSL=false";
////    String url ="jdbc:mysql://localhost/"+banco;
//    String usuario ="app";
//    String senha ="AppCGPatri#";


//      Conexão para banco Postgres CAP (Felipe)
        String banco = "geoDGPI_restore_20180730_teste";
        String url = "jdbc:postgresql://10.69.41.91:5433/"+banco;
//        String url = "jdbc:postgresql://10.69.41.91:5433/geoDGPI_restore_20180730"; //Antigo banco Homologação
//        String url = "jdbc:postgresql://10.69.40.181:5433/"+banco;
//        String url = "jdbc:postgresql://10.69.40.252:5433/"+banco;

        Properties props = new Properties();
       
        props.setProperty("currentSchema","sch_cgpatri");
        props.setProperty("user","devhomolog");
        props.setProperty("password","Prodam@2018!");
        props.setProperty("ssl","false");
//        
            
        String sql = "SELECT nm_nome FROM tbl_usuario WHERE id_usuario=7";
        String nome ="";


        try{
//          Conexão para banco MySQL logal            
//          Class.forName(drive);
//          DriverManager.getConnection(url, usuario, senha);

//          Conexão para banco Postgres CAP (Felipe)
            Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(); 
            
            if(rs.next()){
                nome = rs.getString("nm_nome");
            }else{
                nome = "não encontrado para o parametro solicitado!";
            }
            
            
            
            System.out.println("Sucessona conexão");
            System.out.println("Nome: "+nome);
            

//      Conexão para banco MySQL logal         
//      }catch(SQLException | ClassNotFoundException erro){

//      Conexão para banco Postgres CAP (Felipe)
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        
        }
        
          
    
    }
  
    
    
    
    
    
}
