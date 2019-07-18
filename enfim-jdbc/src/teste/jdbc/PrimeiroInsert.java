import java.sql.*;
// Você pode utilizar o * como argumento genérico para importar todas as bibliotecas necessárias para esta classe.

public class PrimeiroInsert {

	public static void main(String[] args) throws SQLException{
		
		Connection 	conecta 	= null;
		Statement 	declara 	= null;
		ResultSet	retorna		= null;
		
		String url 		= "jdbc:mysql://localhost:3306/javanoturnojdbc";
		String user 	= "aluno"; //Insira aqui o seu usuário criado no BD.
		String password	= "aluno"; //Insira aqui o sua senha criado no BD.
		
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
			
			/* 
			 * O método executeQuery : Usado para enviar comandos SELECT. Retorna um conjunto de valores do Banco de Dados;
			 * O método executeUpdate: Usado para enviar comandos INSERT, UPDATE, DELETE. Retorna um valor int que corresponde ao
			 * número de linhas afetadas pelo comando enviado.  
			 * Fonte: https://www.javapedia.net/JDBC/1793 executeQuery vs. executeUpdate . 
			*/
			
			while(retorna.next()) {
				System.out.println(retorna.getString(3) + " " + retorna.getString(2));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}


