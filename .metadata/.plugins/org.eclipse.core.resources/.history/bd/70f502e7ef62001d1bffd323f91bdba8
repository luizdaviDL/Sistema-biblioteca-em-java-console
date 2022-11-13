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
		// TODO Auto-generated method stub

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
		
		for(Aluno achar: alunos) {
			if(achar.getClass().equals(email) && achar.getSenha().equals(senha)) {
				alunoMenu();
			}
			else {
				System.out.println("Aluno não cadastrado no sistema");
			}
		}
		
		
		

		
	}
	
	//------------------------------------------------

	private static void alunoMenu() {
		// TODO Auto-generated method stub
		
	}

}
