package cursoJava.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.classes.Aluno;
import curso.classes.Diciplina;


public class TesteForProcurandoRemoveAluno {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		for(int qtd = 0;  qtd <= 1 ;qtd++) {
		   /*new Aluno()* � uma instancia (Cria��o de objeto)*/
		  /*aluno1 � uma referencia para o objeto Aluno */
		 
	

         
           Aluno aluno1 = new Aluno();//aqui sera o jo�o
           String nome = JOptionPane.showInputDialog("qual o nome do aluno ");
           aluno1.setNome(nome);
//		   aluno1.setIdade(33);
//		   aluno1.setRg("2247644");
//		   aluno1.setNomeEscola("colegio Azul");
//		   aluno1.setDataMatricula("23/6/2000");
		   
		 
		   for(int pos = 0;pos <= 1 ; pos++) {
			 
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
 
		   int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma diciplina");
		   
		   if(escolha == 0) {//remove uma diciplina da lista
			   System.out.println("***********removendo disciplina***************");
			   int continuarRemover = 0;
			   int posicao = 1;
			   
			   while(continuarRemover == 0) {
			  String diciplinaRemover = JOptionPane.showInputDialog("Qual diciplina sera removida ? ");
			   aluno1.getDiciplinas().remove(Integer.valueOf(diciplinaRemover).intValue() - posicao);
			   posicao++;
			  continuarRemover = JOptionPane.showConfirmDialog(null, "continuar removendo");
		     }
			  
		}
		   alunos.add(aluno1);//adiciona o aluno
 }
		//bloco que remove  o aluno 
		for (Aluno aluno : alunos) {
			if(aluno.getNome().equalsIgnoreCase("daniel")) {
				alunos.remove(aluno);
		
			break;//quando ele achar ele para
		}   else {
			aluno.dadosAluno();
			aluno.getMedia();
			System.out.println("---------------------------************---------------------");
		 }
			
	}
		//percorrendo uma lista 
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraramna lista");
			System.out.println(aluno.getNome());
			System.out.println("suas materias s�o");
			for(Diciplina diciplina : aluno.getDiciplinas()) {
				System.out.println(diciplina.getDisciplina());
			}
		}
	}
}



