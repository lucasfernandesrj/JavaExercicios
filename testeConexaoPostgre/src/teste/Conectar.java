package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Conectar {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			 String url = "jdbc:postgresql://localhost:5432/lucas";
			 String user = "postgres";
			 String password = "vagagre";
			 Class.forName("org.postgresql.Driver");
			 //DriverManager.registerDriver(new org.postgresql.Driver());
			 con = DriverManager.getConnection(url, user, password);
		}catch(SQLException e) {
			System.out.print(e.getMessage());
		}
		
		try {
			PreparedStatement pstmtSelect = con.prepareStatement("SELECT * FROM CLIENTE");
			ResultSet rsSelect = pstmtSelect.executeQuery();
			ResultSetMetaData rsmdSelect = rsSelect.getMetaData();
			while(rsSelect.next()) {
				for(int i=1;i<=rsmdSelect.getColumnCount();i++) {
					System.out.print(rsmdSelect.getColumnName(i).toUpperCase() +" = "+rsSelect.getString(i)+" ");
				}
				System.out.print("\n");
			}
			pstmtSelect.close();
		}catch(SQLException e2) {
			System.out.print(e2.getMessage());
		}catch(Exception e3) {
			System.out.print(e3.getMessage());
		}

		
		/*try {
			PreparedStatement pstmtDelete = con.prepareStatement("DELETE FROM CLIENTE WHERE NUMERO = ?");
			
			System.out.print("Informe qual linha deve ser apagada: ");
			Scanner scan = new Scanner(System.in);
			int resp = scan.nextInt();
			
			pstmtDelete.setInt(1, resp);
			int del = pstmtDelete.executeUpdate();
			if(del == 1) {
				System.out.println("Linha "+resp+" apagada com sucesso!");
			}else {
				System.out.println("Erro na exclusão!");
			}
			pstmtDelete.close();
		}catch(SQLException e) {
			System.out.print(e.getMessage());
		}
		*/
		
		/*
		int valor = 0;
		System.out.println("Informe a Coluna que deseja alterar (NOME ou SALARIO): ");
		String coluna = scan.nextLine().toUpperCase();
		
		if(coluna.equals("NOME")) {
			try {
				PreparedStatement pstmtUpdate = con.prepareStatement("UPDATE CLIENTE SET NOME = ? WHERE NUMERO = ?;");
				System.out.println("Informe o NUMERO que deseja alterar: ");
				int numNome = Integer.parseInt(scan.nextLine());
				
				System.out.println("Informe o novo NOME: ");
				String novoNome = scan.nextLine().toUpperCase();
				
				pstmtUpdate.setString(1, novoNome);
				pstmtUpdate.setInt(2, numNome);
				
				System.out.println(pstmtUpdate);
				valor = pstmtUpdate.executeUpdate();
				pstmtUpdate.close();
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}else if(coluna.equals("SALARIO")) {
			try {
				PreparedStatement pstmtUpdate = con.prepareStatement("UPDATE CLIENTE SET SALARIO = ? WHERE NUMERO = ?");
				System.out.println("Informe o NUMERO que deseja alterar: ");
				int numSal = scan.nextInt();
				
				System.out.print("Informe o novo SALARIO: ");
				double novoSalario = scan.nextDouble();
				
				pstmtUpdate.setDouble(1, novoSalario);
				pstmtUpdate.setInt(2, numSal);
				
				System.out.println(pstmtUpdate);
				valor = pstmtUpdate.executeUpdate();
				pstmtUpdate.close();
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("Nome de Coluna inválida!");
			valor = 0;
		}
		if(valor == 1) {
			System.out.println("Update realizado!");
		}else {
			System.out.print("Update não realizado!");
		}
		scan.close();
		*/
		/*int insertResultado = 0;
		try {
			PreparedStatement pstmtInsert = 
					con.prepareStatement("INSERT INTO CLIENTE(NUMERO, NOME, SALARIO) VALUES (NEXTVAL('CLIENTE_SEQ'), ?, ?)");
			System.out.println("Informe o NOME a inserir: ");
			String insertNome = scan.nextLine();
			System.out.println("Informe o SALARIO a inserir: ");
			double insertSalario = Double.parseDouble(scan.nextLine());
			pstmtInsert.setString(1, insertNome);
			pstmtInsert.setDouble(2, insertSalario);
			insertResultado = pstmtInsert.executeUpdate();
			if(insertResultado == 1) {
				System.out.println("Inserido com sucesso!");
			}else {
				System.out.println("Falha na inserção!");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}*/
		int insertResultado = 0;
		System.out.println("Deseja inserir um novo CLIENTE? (SIM ou NAO): ");
		String insertCliente = scan.nextLine().toUpperCase();
		while(insertCliente.equals("SIM")) {
			try {
				PreparedStatement pstmtInsert = 
						con.prepareStatement("INSERT INTO CLIENTE(NUMERO, NOME, SALARIO) VALUES (NEXTVAL('CLIENTE_SEQ'), ?, ?)");
				System.out.println("Informe o NOME a inserir: ");
				String insertNome = scan.nextLine().toUpperCase();
				System.out.println("Informe o SALARIO a inserir: ");
				double insertSalario = Double.parseDouble(scan.nextLine());
				pstmtInsert.setString(1, insertNome);
				pstmtInsert.setDouble(2, insertSalario);
				insertResultado = pstmtInsert.executeUpdate();
				pstmtInsert.close();
				if(insertResultado == 1) {
					System.out.println("Inserido com sucesso!");
				}else {
					System.out.println("Falha na inserção!");
				}
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Deseja inserir um novo CLIENTE? (SIM ou NAO): ");
			insertCliente = scan.nextLine().toUpperCase();
		}
	}

}
