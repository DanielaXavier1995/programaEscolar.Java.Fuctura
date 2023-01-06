package programaEscolar;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa {
	
       //Atributos:
	   private String matricula;
	   private String turma;
	   private int idade;
	   private ArrayList <Aluno> aluno = new ArrayList <>();
	   
	   //Construtores:
	   
	   public Aluno() {
			
	   }
	   
	   public Aluno(String nome, String matricula, String turma, int idade) {
		    super(nome);
			this.matricula = matricula;
			this.turma = turma;
			this.idade = idade;
		}

	   
	   //Métodos acessores:
	   public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getTurma() {
			return turma;
		}

		public void setTurma(String turma) {
			this.turma = turma;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public ArrayList<Aluno> getAluno() {
			return aluno;
		}

		public void setAluno(ArrayList<Aluno> aluno) {
			this.aluno = aluno;
		}
	   
	   //Métodos especiais:
		
		//Método para cadastro do aluno
		public void adicionarAluno() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("======= CADASTRO ALUNO =======");
			
			System.out.println("Quantos alunos deseja inserir? ");
			System.out.print("->");
			int n = sc.nextInt();
			sc.nextLine();
			System.out.println("");
			for (int i = 0; i < n; i++) {
			System.out.println("======= " + (i+1) + "° ALUNO =======");
			System.out.println("Digite o nome do aluno: ");
			System.out.print("->");
			setNome(sc.nextLine());
			System.out.println("Digite a matrícula do aluno: ");
			System.out.print("->");
			setMatricula(sc.nextLine());
			System.out.println("Digite a turma do aluno: ");
			System.out.print("->");
			setTurma(sc.nextLine());
			System.out.println("Digite a idade do aluno: ");
			System.out.print("->");
			setIdade(sc.nextInt());
			sc.nextLine();
			
			aluno.add(new Aluno(getNome(), getMatricula(), getTurma(), getIdade()));
			}
			System.out.println("Alunos cadastrado com sucesso!!");
		}
		
		//Método para listar alunos:
		public void listarAluno() {
			System.out.println("===== ALUNOS CADASTRADOS =====");
			for (int i = 0; i < aluno.size(); i++) {
				System.out.println("Nome: " + aluno.get(i).getNome());
				System.out.println("Matrícula: " + aluno.get(i).getMatricula());
				System.out.println("Turma: " + aluno.get(i).getTurma());
				System.out.println("Idade: " + aluno.get(i).getIdade());
				System.out.println("============================");
			}
		}
		
		//Método para remover aluno:
		public void removerAluno(String matricula) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a matricula do aluno que deseja remover: ");
			System.out.print("->");
			matricula = sc.nextLine();
			for (int i = 0; i < aluno.size(); i++) {
			if(aluno.get(i).getMatricula().equals(matricula)) {
				aluno.remove(i);	
			}	
			}
			System.out.println("Aluno removido com sucesso!!");
		}
}
