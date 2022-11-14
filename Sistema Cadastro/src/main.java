import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Aluno;
import models.Livros;
import servico.AlunoServico;

public class main {
	/*Usuar static para acessar a var sem instancia-la*/
	static List<Livros> livros = new ArrayList<>();
	static List<Aluno> alunos = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);
	//----------------------------------------------
	
	public static void main(String[] args) {
		operacao();

	}
	
	//-------------------------------
	
	private static void operacao() {
		
		System.out.print("--------Biblioteca Universitária------- \n \n");
		
		System.out.println("Escolha uma opção");
		System.out.println("1 - Entrar como aluno");
		System.out.println("2 - Entrar como bibliotecario(a)");
		System.out.println("3 - Realizar cadastro");
		System.out.println("Digite aqui:");
		int opcao = sc.nextInt();
		
		switch(opcao) {
			case 1:
				AlunoServico.alunoLogin();
		}
	}
	
	

}
