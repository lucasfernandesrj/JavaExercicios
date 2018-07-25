package av2correcao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import corejava.Console;

public class ListarConteudo {

	public static void main(String[] args) {
		Connection con = null;
		String cidade;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/filomena", "java", "java");
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM VENDEDOR WHERE CIDADE = ?");
			cidade = Console.readLine("Informe a cidade");
			pstmt.setString(1, cidade);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5) + rs.getString(6) + rs.getString(7)+ rs.getString(8));
			}
			pstmt.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
