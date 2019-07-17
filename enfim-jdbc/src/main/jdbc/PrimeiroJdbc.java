import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrimeiroJdbc {
	public static void main(String[] args) throws SQLException {
		Connection	mConexao 	= null;
		Statement 	mDeclaracao	= null;
		ResultSet	mConjuntoResultado	= null;
					
		try {
			// 1. Aqui estamos realizando a conex�o ao banco.
			mConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/javanoturnojdbc", "admin","senha");
			// Optamos por inserir diretamento os dados no momento da conex�o, 
			// como alternativa poder�amos utilizar vari�veis ou fun��es.
			
			// 2. Aqui estamos criando uma declara��o a ser enviada.
			mDeclaracao = mConexao.createStatement();
			// Uma declara��o � qualquer texto que o banco de dados reconhece como um comando v�lido. Pode ser uma query.
			// Fonte: https://stackoverflow.com/questions/4735856/difference-between-a-statement-and-a-query-in-sql

			System.out.println("Conex�o com banco de dados realizada.\n");
			
			// 3. Executando uma query.
			mConjuntoResultado = mDeclaracao.executeQuery("select * from funcionarios");
			// Optamos por inserir diretamente a query, 
			// como alternativa poder�amos utilizar vari�veis ou fun��es. 
			
			// 4. Processando um conjunto de resultados.
			while (mConjuntoResultado.next()) { // Varrendo linhas, retornando valor boolean. Enquanto positivo segue o while. 
				// No exemplo .getString() podemos informar o nome da coluna a ser retornada ou o seu �ndice.
				System.out.println(mConjuntoResultado.getString("sobrenome") + ", " + mConjuntoResultado.getString("nome"));
			}
		}		
		
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
