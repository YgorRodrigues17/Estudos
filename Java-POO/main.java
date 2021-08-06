import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    public static void main(String[] args){
    // pega a conexão e o Statement
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "password");
PreparedStatement stmt = con.prepareStatement(" select cod_Depart, count(*)id_contrato, sum(valor_contrato), mat_gerente from contrato as c inner join departamento as d on c.cod_Depart = d.cod_depart inner join gerente as g on d.cod_depart = g.cod_depart group by cod_Depart");

// executa um select
ResultSet rs = stmt.executeQuery("");{

// itera no ResultSet
while (rs.next()) {
  String nome = rs.getString("cod_Depart");
  String email = rs.getString("desc_depart");

  System.out.println(cod_depart + " :: " + desc_depart);
}

stmt.close();
con.close();
    
}
}
}
