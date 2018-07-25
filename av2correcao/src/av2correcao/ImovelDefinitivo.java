package av2correcao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImovelDefinitivo implements Imovel {
	
	private int numero = 0;
	private String bairro, cidade, estado, endereco;
	private double areaUtil, areaTotal,valor;
	private String dataLancamento;
	
	public void lancarDados(int num) throws Exception {
		Connection con = null;
		try {
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:3452/filomena","postgres","vagagre");
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM IMOVEL WHERE NUMERO = ?");
		pstmt.setInt(1,num);
		ResultSet rs = pstmt.executeQuery();
		this.numero = num;
		this.bairro = rs.getString(2);
		this.cidade = rs.getString(3);
		this.estado = rs.getString(4);
		this.endereco = rs.getString(5);
		if(rs.getDouble(6) > rs.getDouble(7)) {
			throw new Exception("A areaUtil não pode ser superior a areaTotal");
		}else{
			this.areaUtil = rs.getDouble(6);
			this.areaTotal = rs.getDouble(7);
		}
		this.valor = rs.getDouble(8);
		this.dataLancamento = rs.getString(9);
		pstmt.close();
		}catch(SQLException e) {
			e.getMessage();
		}
	}
	
	

	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public double getAreaUtil() {
		return areaUtil;
	}



	public void setAreaUtil(double areaUtil) {
		this.areaUtil = areaUtil;
	}



	public double getAreaTotal() {
		return areaTotal;
	}



	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public String getDataLancamento() {
		return dataLancamento;
	}



	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}



	@Override
	public String toString() {
		return "ImovelDefinitivo [numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado
				+ ", endereco=" + endereco + ", areaUtil=" + areaUtil + ", areaTotal=" + areaTotal + ", valor=" + valor
				+ ", dataLancamento=" + dataLancamento + "]";
	}
}
