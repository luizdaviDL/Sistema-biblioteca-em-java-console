package models;

public class Aluno {
	private int id;
	private String nome;
	private String sobreNome;
	private String email;
	private String senha;
	private boolean status;
	
	int contador=0;
	public Aluno(String nome, String sobreNome, String email, String senha, boolean status) {
		super();
		this.id = contador;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
		this.senha = senha;
		this.status = status;
		contador++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	

}
