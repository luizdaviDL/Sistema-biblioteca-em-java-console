
import java.util.Scanner;

import models.Aluno;
import servico.AlunoServico;

public class main {
	 /*Service*/
	static AlunoServico service = new AlunoServico();
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//---------instancia de aluno
		
		Aluno aluno = new Aluno() {
			{
				new Aluno("Luiz","Amorim","luiz.com", "1234");
				new Aluno("Maria","Fernandes","maria.com", "2002");
				new Aluno("Fabio","Arouxa","fabio.com", "4747");
			}
		};
		
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
				service.alunoLogin();
				
			case 3:
				System.out.println("1 - Cadastro de aluno");
				System.out.println("2 - Cadastro de Bibliotecario");
				int cadastro = sc.nextInt();
				
				if(cadastro == 1) {
					service.cadastro();
				}else {
					operacao();
				}
				
		}
	}
}
