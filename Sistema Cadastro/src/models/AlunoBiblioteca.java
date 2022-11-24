package models;

public class AlunoBiblioteca {
	private String nome;
	private String sobrenome;
	private int matricula;
	
	
	public AlunoBiblioteca() {
		super();
	}
	
	public AlunoBiblioteca(String nome, String sobrenome, int matricula) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
