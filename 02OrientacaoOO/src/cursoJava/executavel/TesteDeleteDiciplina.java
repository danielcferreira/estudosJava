package cursoJava.executavel;

import java.util.Scanner;

import curso.classes.Aluno;
import curso.classes.Diciplina;


public class TesteDeleteDiciplina {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		   /*new Aluno()* é uma instancia (Criação de objeto)*/
		  /*aluno1 é uma referencia para o objeto Aluno */
		   Aluno aluno1 = new Aluno();//aqui sera o joão
	
		   aluno1.setNome("daniel");
		   aluno1.setIdade(33);
		   aluno1.setRg("2247644");
		   aluno1.setNomeEscola("colegio Azul");
		   aluno1.setDataMatricula("23/6/2000");
		   
		 
		   for(int pos = 0;pos <=3 ; pos++) {
			 
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
		      aluno1.dadosAluno();
		
		   for(int i = 0;i <=3 ; i++) {
		    
			 System.out.println(aluno1.getDiciplinas().get(i));
			
		   }
		   System.out.println();
		   System.out.println("***********removendo disciplina***************");
		   
		   //removendo diciplina
		   Scanner ler = new Scanner(System.in);
		   System.out.println("deseja remover alguma diciplina ? ");
		   int escolha = ler.nextInt();
		   
		   if(escolha == 0) {
			   System.out.println("Qual diciplina sera removida ? ");
			   int removeDiciplina = ler.nextInt();
			   aluno1.getDiciplinas().remove(Integer.valueOf(removeDiciplina).intValue() );
		   }
		   
		   //for(int pos = 0;pos <=3 ; pos++) {
			   System.out.println(aluno1.getDiciplinas());
			 
		   //}
		   
		   aluno1.dadosAluno();
       }	
}


