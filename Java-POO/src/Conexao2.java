import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao2 {
    
     public static Connection getConexao(){
         Connection conn =  null;
         try{
             conn = DriverManager.getConnection("jdbcmysql://localhost:3306/licitacoes_contratos", "root", "password");
             System.out.println("Connected with success");
         }
         catch(SQLException e){
             System.err.println("Connection failed");
         }
         return conn;

     }
     public static void main(String[] args) {
         Conexao2.getConexao();
     }

}