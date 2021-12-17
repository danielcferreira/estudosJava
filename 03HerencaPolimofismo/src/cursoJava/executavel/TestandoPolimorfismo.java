package cursoJava.executavel;

import curso.classes.Aluno;
import curso.classes.Diretor;
import curso.classes.Pessoa;
import curso.classes.Secretario;

public class TestandoPolimorfismo {

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
		   secretario.setNome("pescador parrudo");
		   
		  //Alisa se o aluno pode ir sozinho para a casa -- dentro da classe aluno fazendo uso do @Override
		   System.out.println( aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
          aluno.podeIrSozinho();
         // System.out.println(secretario.pessoaMaiorIdade());
		   
		  
		   System.out.println("salario aluno " + aluno.salario());
		   System.out.println("salario diretor " + diretor.salario());
		   System.out.println("salario secretario " + secretario.salario());
		  
		  
		 // Pessoa pessoa = new Aluno();
		   
		   //pessoa = secretario;
		   
		   //teste(pessoa);
		   teste(aluno);
		   teste(secretario);
		   teste(diretor);
		   
		   
		   

	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("essa pessoa é demais = " + pessoa.getNome()  );
		System.out.println(" e o salario é de =  " +  pessoa.salario());
	}

}
