import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrimeiroInsert {

	public static void main(String[] args) throws SQLException{
		
		Connection 	conecta 	= null;
		Statement 	declara 	= null;
		ResultSet	retorna		= null;
		
		String url 		= "jdbc:mysql://localhost:3306/javanoturnojdbc";
		String user 	= "aluno";
		String password	= "aluno";
		
		try {
			conecta = DriverManager.getConnection(url, user, password);
			
			declara = conecta.createStatement();
			
			int insereDado = declara.executeUpdate(
					"INSERT INTO funcionarios" +
					"(sobrenome,nome,email,departamento,salario)" +
					" VALUES " +
					"('Java', 'Aluno', 'aluno.java@teste.com', 'TI', 4000.00)"									
					);
			retorna = declara.executeQuery("SELECT * FROM funcionarios order by nome");
		
			while(retorna.next()) {
				System.out.println(retorna.getString(3) + " " + retorna.getString(2));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}


