package models;

public class Endereco {

	private String cidade;
	private String estado;
	private String bairro;
	private String rua;
	
	public Endereco (String cidade, String estado, String bairro, String rua) {
		this.cidade = cidade;
		this.estado = estado;
		this.bairro = bairro; 
		this.rua = rua;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
		
	}
}