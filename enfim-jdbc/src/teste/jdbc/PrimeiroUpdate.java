import java.sql.*;

public class PrimeiroUpdate {

	public static void main(String[] args) throws SQLException{
		try {
			Connection 	conecta 	= null;
			Statement	declara 	= null;
			ResultSet	retorna		= null;
			
			String url 		= "jdbc:mysql://localhost:3306/javanoturnojdbc"; 
			// Para remover a mensagem de aviso no momento de conexão com o BD você pode adicionar ' ?useSLL=false ' ao final de sua URL.
			String user 	= "aluno";
			String password	= "aluno";
			
			conecta = DriverManager.getConnection(url, user, password);
			
			declara = conecta.createStatement();
			
			
			int linhasAlteradas = declara.executeUpdate(
			// Armazena número de linhas alteradas pelo Update.
					
					"UPDATE funcionarios " +
					"SET nome = 'Programador' " +
					"WHERE nome = 'Aluno' " +
					"AND id = 13;"
					);								
			
			retorna = declara.executeQuery("SELECT * FROM funcionarios");
			// Executa SELECT no BD e armazena o retorno para processamento de dados futuro.			
			
			while(retorna.next()) {
			// Processa dados retornados pelo SELECT
				System.out.println(retorna.getString("nome") + " " + retorna.getString("sobrenome"));
			}		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}