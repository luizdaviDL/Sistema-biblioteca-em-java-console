package models;

public class Livros implements Comparable<Livros> {
	private int id;
	private String nome;
	private String descricao;
	private String autor;
	
	int contador =0;
	public Livros(String nome, String descricao, String autor) {
		super();
		this.id = contador;
		this.nome = nome;
		this.descricao = descricao;
		this.autor = autor;
		contador++;
	}
	
	
	public Livros() {
		super();
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livros [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", autor=" + autor + "]";
	}


	@Override
	public int compareTo(Livros o) {
		
		return this.getNome().compareToIgnoreCase(getNome());
	}

}
