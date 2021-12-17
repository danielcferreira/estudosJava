package cursoJava.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cursoJava.constantes.*;

import javax.swing.JOptionPane;

import curso.classes.Aluno;
import curso.classes.Diciplina;

public class TesteAprovadoReprovadoRecuperacao932 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();

		for (int qtd = 0; qtd <= 2; qtd++) {
			/* new Aluno()* � uma instancia (Cria��o de objeto) */
			/* aluno1 � uma referencia para o objeto Aluno */

			Aluno aluno1 = new Aluno();// aqui sera o jo�o
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
					// int posicao = 1;
					String diciplinaRemover = JOptionPane.showInputDialog("Qual diciplina sera removida ? ");
					aluno1.getDiciplinas().remove(Integer.valueOf(diciplinaRemover).intValue());
					// posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "continuar removendo");
				}

			}
			alunos.add(aluno1);// adiciona o aluno
		}
          //Dividindo alunos em ap, rep, rec
		for (Aluno aluno : alunos) {

			if (aluno.getResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else
				if (aluno.getResultado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                alunosRecuperacao.add(aluno);
			} else if  (aluno.getResultado().equalsIgnoreCase(StatusAluno.REPROVADO)){
				alunosReprovados.add(aluno);
			}
		}
		System.out.println("--------------------Lista dos aprovados----------------------------");
		for(Aluno aluno : alunosAprovados) {
			System.out.println(aluno.getNome());
			System.out.println("Resultado = " + aluno.getResultado() + "Media = " + aluno.getMedia());
		
		}
		System.out.println("--------------------Lista dos Reprovados----------------------------");
		for(Aluno aluno : alunosReprovados) {
			System.out.println(aluno.getNome());
			System.out.println("Resultado = " + aluno.getResultado() + "Media = " + aluno.getMedia());
			
		}
		System.out.println("--------------------Lista dos recuperacao----------------------------");
		
		for(Aluno aluno : alunosRecuperacao) {
			System.out.println(aluno.getNome());
			System.out.println("Resultado = " + aluno.getResultado() + "Media = " + aluno.getMedia());
			
		}
	}

}
