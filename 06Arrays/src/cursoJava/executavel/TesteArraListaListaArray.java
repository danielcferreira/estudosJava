package cursoJava.executavel;

public class TesteArraListaListaArray {

	public static void main(String[] args) {
	    String texto = "daniel, curso java, 80, 40, 99";
	   String[] valoresArray = texto.split(",");
	   
	   System.out.println("nome: "  +  valoresArray[0]);
	   System.out.println("curso"  +  valoresArray[1]);
	   System.out.println("nota 1:"  +  valoresArray[2]);
	   System.out.println("nota 2:"  +  valoresArray[3]);
	   System.out.println("nota 3:"  +  valoresArray[4]);

	}

}
