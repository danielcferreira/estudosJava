
public class TesteOperadoresLogicos {

	public static void main(String[] args) {
		double nota1 = 90;
		double nota2 = 2;
		double nota3 = 10;
         //ctr + shif + f organiza o codigo 
		double soma = nota1 + nota2 + nota3;
		boolean reprovado = soma >= 70;

		if (reprovado) {
			System.out.println("Reprovado sim ");
		} else {
			System.out.println("passou legal");
		}

		//operadores ternarios  s�o para micro valida��es
		String alunoAprovado;
		
		// soma � maior ou igual a 70 se sim Aprovado sen�o Reprovado 
		alunoAprovado = soma >= 70 ? "Aluno aprovado" : "Aluno reprovado";
		System.out.println(alunoAprovado);
	}
	
	

}
