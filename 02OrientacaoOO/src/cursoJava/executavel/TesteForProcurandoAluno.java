package cursoJava.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.classes.Aluno;
import curso.classes.Diciplina;


public class TesteForProcurandoAluno {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		for(int qtd = 0;  qtd <= 2 ;qtd++) {
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
		      //aluno1.dadosAluno();//mostra dados do aluno cadastrado
		
//		   for(int i = 0;i <=1 ; i++) {
//		    
//			 System.out.println(aluno1.getDiciplinas().get(i));
//			
//		   }
		   System.out.println();
		  
		   
		 
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
		   
		  // alunos.add(aluno1);//adiciona o aluno
		   //for(int pos = 0;pos <=3 ; pos++) {
			   //System.out.println(aluno1.getDiciplinas());
			 
		   //}
			  
		}
		   alunos.add(aluno1);//adiciona o aluno
 }
		//encontrando um 
		System.out.println("***************Aluno encontrador ***************");
		System.out.println("*************** *******************************");
		for (Aluno aluno : alunos) {
			
			//Procurando Aluno
			if(aluno.getNome().equalsIgnoreCase("daniel")) {
			aluno.dadosAluno();
			aluno.getMedia();
			System.out.println("---------------------------************---------------------");
			System.out.println("Aluno encontrado");
			break;//quando ele achar ele para
		}   
		 }
	}
}



