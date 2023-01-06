package programaEscolar;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa{
	//Atributos
	private String id;
	private String disciplina;
	private ArrayList <Professor> professor = new ArrayList <>();
	
	//Construtores
	public Professor() {
		
	}
	
	public Professor(String nome, String id, String disciplina) {
		super(nome);
		this.id = id;
		this.disciplina = disciplina;
	}

	//Métodos acessores
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public ArrayList<Professor> getProfessor() {
		return professor;
	}

	public void setProfessor(ArrayList<Professor> professor) {
		this.professor = professor;
	}
	
	//Métodos especiais:
	
	//Método para cadastro do professor
			public void adicionarProf() {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("======= CADASTRO PROFESSOR =======");
				
				System.out.println("Quantos professores deseja inserir? ");
				System.out.print("->");
				int n = sc.nextInt();
				sc.nextLine();
				System.out.println("");
				for (int i = 0; i < n; i++) {
				System.out.println("======= " + (i+1) + "° PROFESSOR =======");
				System.out.println("Digite o nome do professor: ");
				System.out.print("->");
				setNome(sc.nextLine());
				System.out.println("Digite o número de identifação do professor: ");
				System.out.print("->");
				setId(sc.nextLine());
				System.out.println("Digite a disciplina do professor: ");
				System.out.print("->");
				setDisciplina(sc.nextLine());
				
				professor.add(new Professor(getNome(), getId(), getDisciplina()));
				}
				System.out.println("Professores cadastrados com sucesso!!");
			}
			
			//Método para listar professores:
			public void listarProf() {
				System.out.println("===== PROFESSORES CADASTRADOS =====");
				for (int i = 0; i < professor.size(); i++) {
					System.out.println("Nome: " + professor.get(i).getNome());
					System.out.println("Identificação: " + professor.get(i).getId());
					System.out.println("Disciplina: " + professor.get(i).getDisciplina());
					System.out.println("============================");
				}
			}
			
			//Método para remover aluno:
			public void removerProf(String id) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Digite o número de identificação do professor" +
				                  " que deseja remover: ");
				System.out.print("->");
				id = sc.nextLine();
				for (int i = 0; i < professor.size(); i++) {
				if(professor.get(i).getId().equals(id)) {
					professor.remove(i);	
				}	
				}
				System.out.println("Professor removido com sucesso!!");
			}
}
