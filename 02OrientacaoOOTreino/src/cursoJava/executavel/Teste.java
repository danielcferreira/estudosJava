package cursoJava.executavel;

import curso.classes.Aluno;
import curso.classes.Diciplina;


public class Teste {

	public static void main(String[] args) {
		
		   /*new Aluno()* é uma instancia (Criação de objeto)*/
		  /*aluno1 é uma referencia para o objeto Aluno */
		   Aluno aluno1 = new Aluno();//aqui sera o joão
		   aluno1.setNome("daniel");
		   aluno1.setIdade(33);
		   aluno1.setRg("2247644");
		   aluno1.setNomeEscola("colegio Azul");
		   aluno1.setDataMatricula("23/6/2000");
		   
		   Diciplina disDaniel = new Diciplina();
		   disDaniel.setNota1(5);
		   disDaniel.setNota2(6);
		   disDaniel.setNota3(7);
		   disDaniel.setNota4(6);
		   
		   disDaniel.setDisciplina1("portugues");
		   disDaniel.setDisciplina2("matematica");
		   disDaniel.setDisciplina3("sociologia");
		   disDaniel.setDisciplina4("filosofia");
		   
		   System.out.println(disDaniel.getDisciplina1());
		   
//     	   aluno1.getDiciplina().setNota2(4);
//		   aluno1.getDiciplina().setNota3(6);
//		   aluno1.getDiciplina().setNota4(7);
		   
//		   aluno1.getDiciplina().setDisciplina1("portugues");
//		   aluno1.getDiciplina().setDisciplina2("Matematica");
//		   aluno1.getDiciplina().setDisciplina3("sociologia");
//		   aluno1.getDiciplina().setDisciplina4("Filosofia");
		   
		
         
		  // aluno1.dadosAluno();
		   
		   
		  
		}	

	}


