import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Aluno;
import models.Livros;

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
				alunoLogin();
		}
	}
	
	//---------------------------------------------

	private static void alunoLogin() {
		//System.out.println("");
		
		System.out.println("-----Ola entre com seu e-mail e senha-----");
		
		System.out.println("Digite seu e-mail:");
		String email = sc.next();
		System.out.println("Agora sua senha:");
		String senha = sc.next();
		
		for(int i=0; ((CharSequence) alunos).length() >i;) {
			for(Aluno achar: alunos) {
				if(achar.getClass().equals(email) && achar.getSenha().equals(senha)) {
					alunoMenu();
				}
				else {
					System.out.println("Aluno não cadastrado no sistema");
				}
			}
		}
		
	/*	for(Aluno achar: alunos) {
			if(achar.getClass().equals(email) && achar.getSenha().equals(senha)) {
				alunoMenu();
			}
			else {
				System.out.println("Aluno não cadastrado no sistema");
			}
		}*/
		
		
		

		
	}
	
	//------------------------------------------------

	private static void alunoMenu() {
		System.out.println("seja bem vindo(a) a biblioteca da sua universidade escolha uma das opções abaixo");
		System.out.println("1 - Emprestar livro");
		System.out.println("2 - Devolver livro");
		System.out.println("Digite aqui:");
		int opcao = sc.nextInt();
	
		switch(opcao) {
			case 1:
				emprestimo();
				
			case 2:				
				devolucao();
		}
	}
	
	
	//-----------------------------------------------

	private static void emprestimo() {
		// TODO Auto-generated method stub
		
	}
	
	//--------------------------------------
	
	private static void devolucao() {
		// TODO Auto-generated method stub
		
	}


}
