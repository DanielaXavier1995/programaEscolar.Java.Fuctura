package programaEscolar;

import java.util.Scanner;

public class Pessoa {
	//Atributos:
	private String nome;
	
	//Construtores:
	public Pessoa() {
		
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	//Métodos acessores:
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Método para escolher pessoa ou aluno:
	
	public void menu() {
		int op;
		int opcao;
		Scanner sc = new Scanner (System.in);
		Aluno a = new Aluno();
		Professor p = new Professor();
		
		System.out.println("==================================");
		System.out.println("Escolha uma opçao para cadastro: ");
		System.out.println("1 - Aluno");
		System.out.println("2 - Professor");
		System.out.println("0 - Finalizar programa");
		System.out.print("->");
		op = sc.nextInt();
		
		do {
		switch (op) {
		
		case 1:
			
			do {
			
			System.out.println("======== MENU ALUNO ========");
			System.out.println("Escolha opçao do Menu: ");
			System.out.println("1 - Cadastrar alunos");
			System.out.println("2 - Listar");
			System.out.println("3 - Remover");
			System.out.println("0 - sair");
			System.out.print("->");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			
			case 1:
				a.adicionarAluno();
				break;
			
			case 2:
				a.listarAluno();
				break;
			
			case 3:
				a.removerAluno(null);
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
			} while (opcao != 0);
			break;
			
		case 2:
			
			do {
			
			System.out.println("======== MENU PROFESSOR ========");
			System.out.println("Escolha opçao do Menu: ");
			System.out.println("1 - Cadastrar professores");
			System.out.println("2 - Listar");
			System.out.println("3 - Remover");
			System.out.println("0 - sair");
			System.out.print("->");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			
			case 1:
				p.adicionarProf();
				break;
			
			case 2:
				p.listarProf();
				break;
			
			case 3:
				p.removerProf(null);
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
			} while (opcao != 0);
			break;
			
		default:
			System.out.println("Opção inválida!! Tente novamente!");
			break;
		}
		
		System.out.println("=================================");
		System.out.println("Escolha uma opçao para cadastro: ");
		System.out.println("1 - Aluno");
		System.out.println("2 - Professor");
		System.out.println("0 - Finalizar programa");
		System.out.print("->");
		op = sc.nextInt();
		
	} while (op != 0);
  }
}
