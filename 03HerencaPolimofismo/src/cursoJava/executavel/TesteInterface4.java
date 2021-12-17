package cursoJava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import cursoJava.constantes.*;


import javax.swing.JOptionPane;

import classesAuxiliares.FuncaoAutenticacao;
import curso.classes.Aluno;
import curso.classes.Disciplina;
import curso.classes.Secretario;

public class TesteInterface4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login ");
		String senha = JOptionPane.showInputDialog("Informe o senha ");
		
		
		
		
		//teste intergace
		//assim posso ser mais especifico 
	    //so quem tem o contrato legitimo
		
		
		if(new FuncaoAutenticacao(new Secretario(login, senha)).autenticarCursoJava()) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
         
		//é uma lista com uma chave que identifica valores
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		

		for (int qtd = 0; qtd <= 2; qtd++) {
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
				Disciplina diciplina1 = new Disciplina();
				System.out.println("nome da diciplina " + pos);
				String diciplina = ler.nextLine();
				System.out.println("nota da diciplina " + pos);
				int nota = ler.nextInt();

				diciplina1.setDisciplina(diciplina);
				diciplina1.setNota(nota);

				aluno1.getDisciplinas().add(diciplina1);
			}

			System.out.println();

			int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma diciplina");

			if (escolha == 0) {// remove uma diciplina da lista
				System.out.println("***********removendo disciplina***************");
				int continuarRemover = 0;

				while (continuarRemover == 0) {
					// int posicao = 1;
					String diciplinaRemover = JOptionPane.showInputDialog("Qual diciplina sera removida ? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(diciplinaRemover).intValue());
					// posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "continuar removendo");
				}

			}
			alunos.add(aluno1);// adiciona o aluno
		}
		
		//iniciando o valor padrão
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
          //Dividindo alunos em ap, rep, rec
		for (Aluno aluno : alunos) {

			if (aluno.getResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else
				if (aluno.getResultado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else if  (aluno.getResultado().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		System.out.println("--------------------Lista dos aprovados----------------------------");
		for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println(aluno.getNome());
			System.out.println("Resultado = " + aluno.getResultado() + "Media = " + aluno.getMedia());
		
		}
		System.out.println("--------------------Lista dos Reprovados----------------------------");
		for(Aluno aluno :maps.get(StatusAluno.REPROVADO)) {
			System.out.println(aluno.getNome());
			System.out.println("Resultado = " + aluno.getResultado() + "Media = " + aluno.getMedia());
			
		}
		System.out.println("--------------------Lista dos recuperacao----------------------------");
		
		for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(aluno.getNome());
			System.out.println("Resultado = " + aluno.getResultado() + "Media = " + aluno.getMedia());
			
		}
		}else {
			JOptionPane.showConfirmDialog(null, "Acesso zuado irmão tenta outro");
		}
	}

}
