package sdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoPostgre
{	public static void main (String[] args)
	{		
		Connection conn = null;
		try
		{
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lucas","postgres","vagagre");
			System.out.println ("ok");
	    }
		catch(ClassNotFoundException ex){
			System.out.println ('\n' + "Classe não encontrada");
			//System.err.print(ex.getMessage());
		}
		catch (SQLException e)
		{	System.out.println ("Erro na conexão com o banco.");
			//e.printStackTrace(); 	// mostra o tipo de erro
			//System.exit(1); // encerra o programa com erro
		}
	}
}