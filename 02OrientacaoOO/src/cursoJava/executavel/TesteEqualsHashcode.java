package cursoJava.executavel;

import curso.classes.Aluno;

public class TesteEqualsHashcode {

	public static void main(String[] args) {
		
		   /*new Aluno()* � uma instancia (Cria��o de objeto)*/
		  /*aluno1 � uma referencia para o objeto Aluno */
		 Aluno aluno1 = new Aluno();
		aluno1.setNome("Daniel"); 
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Daniel"); 
	   //chamando o metodo equals para compara objetos 
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos s�o iguas ");
		}else {
			System.out.println("os dois n�o s�o iguais ");
		}
		
		
		
		
		   
	}
	
		

	}


