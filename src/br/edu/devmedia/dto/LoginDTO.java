package br.edu.devmedia.dto;

public class LoginDTO {
	
	private Integer idLogin;
	private String nome, senha;
	
	public LoginDTO() {}
	
	public LoginDTO(Integer idLogin, String nome, String senha) {
		this.idLogin = idLogin;
		this.nome = nome;
		this.senha = senha;
	}
	
	public LoginDTO(String nome, String senha) {
		this(null ,nome, senha);
	}
	
	public Integer getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(Integer idLogin) {
		this.idLogin = idLogin;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}