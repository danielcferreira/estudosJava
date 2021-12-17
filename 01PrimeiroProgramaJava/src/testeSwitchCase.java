
public class testeSwitchCase {

	public static void main(String[] args) {
//		int nota1 = 58;
//		int nota2 = 2;
//		int nota3 = 10;
//		ctr + shif + f organiza o codigo
//		int soma = nota1 + nota2 + nota3;
//	   boolean reprovado = soma >= 70;

		// switch case
		int dia = 7;
		switch (dia)  {
		case 1: {
			System.out.println("segunda feira");
			break;
		}
		case 2: {
			System.out.println("terca feira");
			break;
		}
		case 3: {
			System.out.println("quarta feira");
			break;
		}
		case 4: {
			System.out.println("quinta feira");
			break;
		}
		case 5: {
			System.out.println("sexta feira");
			break;
		}
		default: System.out.println("Dia não valido");
			break;
		}

	}
}
