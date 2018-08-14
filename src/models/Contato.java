package models;

public class Contato {
	
	private String id;
	private String nome;
	private String profissao;
	private Telefone telefone;
	private Email email;
	private Endereco endereco;
	
	
	public Contato(String id, String nome, String profissao, Telefone telefone, Email email, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.profissao = profissao;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public Telefone getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	 
	public Email getEmail() {
		return this.email;
	}
	
	public void setEmail(Email email) {
		this.email = email;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "--Contato--\n ID: " + id + "\n Nome: " + nome + "\n Profissao: " + profissao + "";
	}
}
