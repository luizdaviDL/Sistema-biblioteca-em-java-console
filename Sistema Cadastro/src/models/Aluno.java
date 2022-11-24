package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public  class Aluno {
	private int id;
	private int numeroMatricula;
	private String nome;
	private String sobreNome;
	private String email;
	private String senha;
	private boolean status;
	public static List<?> emprestimos = new ArrayList<>();
	
	Random ra = new Random();
	int aleatorio = ra.nextInt(500);
	int contador=0;
	public int length;

	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String sobreNome, String email, String senha) {
		super();
		this.id = contador;
		this.numeroMatricula =  aleatorio;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
		this.senha = senha;
		this.status = true;
		contador++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
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

	public static List<?> getEmprestimos() {
		return emprestimos;
	}

	public static void setEmprestimos(List<?> emprestimos) {
		Aluno.emprestimos = emprestimos;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", email=" + email + ", senha="
				+ senha + ", status=" + status + "]";
	}

	
	
}
