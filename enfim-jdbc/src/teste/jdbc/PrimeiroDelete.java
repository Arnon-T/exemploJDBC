import java.sql.*;

public class PrimeiroDelete {

	public static void main(String[] args) throws SQLException {
		/*
		 * Antes de executar este código, execute novamente o código contido na Classe "PrimeiroInsert" 
		 * gerando, assim, um novo registro com nome "Aluno". 
		*/			
		
		Connection 	conecta		= null;
		Statement	declara		= null;
		ResultSet	retorna		= null;
		
		String url 		= "jdbc:mysql://localhost:3306/javanoturnojdbc?useSLL=false";
		String user 	= "aluno";
		String password	= "aluno";				
				
		try {
			conecta = DriverManager.getConnection(url, user, password);
			
			declara = conecta.createStatement();
									
			int linhasDeletadas = declara.executeUpdate(
					
					"DELETE FROM funcionarios " +
					"WHERE nome = 'Aluno'; "				
					
					);			
			
			retorna = declara.executeQuery("SELECT * FROM funcionarios");
			
			while(retorna.next()) {
				System.out.println(retorna.getString("nome") + " " + retorna.getString("sobrenome"));
			}
			
		}
		
		catch (Exception e) {
		
		}		
	}
}
