package servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Aluno;

public  class AlunoServico {
	static Scanner sc = new Scanner(System.in);
	static List<Aluno> alunos = new ArrayList<>();
	
	public static void alunoLogin() {
		//System.out.println("");
		
		System.out.println("-----Ola entre com seu e-mail e senha-----");
		
		System.out.println("Digite seu e-mail:");
		String email = sc.next();
		System.out.println("Agora sua senha:");
		String senha = sc.next();
		
		for(Aluno achar: alunos) {
			if(achar.length > 0) {
				if(achar.getClass().equals(email) && achar.getSenha().equals(senha)) {
					alunoMenu();
				}
				else {
					System.out.println("Aluno não cadastrado no sistema");
				}
			}else {
				System.out.println("O banco de dados esta vazio, cadastre novos alunos");
			}
			
		}
		
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