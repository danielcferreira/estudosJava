package cursoJava.executavel;

import curso.classes.Aluno;
import curso.classes.Diretor;
import curso.classes.Secretario;

public class TestandoClassesFilhas {

	//objeto das subclasses aula 10.4
	public static void main(String[] args) {
		   Aluno aluno = new Aluno();
		   aluno.setNome("Daniel Chapa");
		   aluno.setIdade(22);
		   
		  Diretor diretor = new Diretor();
		   diretor.setRegistroEducaca("789644-66");
		  diretor.setNome("macola");
		   diretor.setIdade(50);
		   
		   Secretario secretario = new Secretario();
		   secretario.setExperiencia("Adm");
		   secretario.setIdade(36);
		   
		  //Alisa se o aluno pode ir sozinho para a casa -- dentro da classe aluno fazendo uso do @Override
		   System.out.println( aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
          aluno.podeIrSozinho();
         // System.out.println(secretario.pessoaMaiorIdade());
		   
		  
		   
		  
		  
		   
		   
		   

	}

}
