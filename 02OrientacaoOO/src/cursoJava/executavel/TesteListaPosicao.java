package cursoJava.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.classes.Aluno;
import curso.classes.Diciplina;

public class TesteListaPosicao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		for (int qtd = 0; qtd <= 1; qtd++) {
			/* new Aluno()* é uma instancia (Criação de objeto) */
			/* aluno1 é uma referencia para o objeto Aluno */

			Aluno aluno1 = new Aluno();// aqui sera o joão
			String nome = JOptionPane.showInputDialog("qual o nome do aluno ");
			aluno1.setNome(nome);
//		   aluno1.setIdade(33);
//		   aluno1.setRg("2247644");
//		   aluno1.setNomeEscola("colegio Azul");
//		   aluno1.setDataMatricula("23/6/2000");

			for (int pos = 0; pos <= 0; pos++) {

				Scanner ler = new Scanner(System.in);
				Diciplina diciplina1 = new Diciplina();
				System.out.println("nome da diciplina " + pos);
				String diciplina = ler.nextLine();
				System.out.println("nota da diciplina " + pos);
				int nota = ler.nextInt();

				diciplina1.setDisciplina(diciplina);
				diciplina1.setNota(nota);

				aluno1.getDiciplinas().add(diciplina1);
			}
		
			System.out.println();

			int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma diciplina");

			if (escolha == 0) {// remove uma diciplina da lista
				System.out.println("***********removendo disciplina***************");
				int continuarRemover = 0;
				

				while (continuarRemover == 0) {
					//int posicao = 1;
					String diciplinaRemover = JOptionPane.showInputDialog("Qual diciplina sera removida ? ");
					aluno1.getDiciplinas().remove(Integer.valueOf(diciplinaRemover).intValue()  );
					//posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "continuar removendo");
				}

			}
			alunos.add(aluno1);// adiciona o aluno
		}
		//mostrando poisiçao 
		for (int pos = 0; pos<alunos.size();pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			System.out.println("aluno = " + aluno.getNome());
			  System.out.println(aluno.getMedia());
			 aluno.getResultado();
			System.out.println("----------------------------Materia do aluno---------------------------------------");
			
			for (Diciplina dic : aluno.getDiciplinas()) {
				System.out.println("Materia  = " + dic.getDisciplina() +  "  nota: = " + dic.getNota() ) ;
				System.out.println("-------------------------------------------------------------------");
			}
		}
			
				
		
	}
}
