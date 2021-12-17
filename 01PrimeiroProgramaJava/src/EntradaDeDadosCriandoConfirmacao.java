import javax.swing.JOptionPane;


public class EntradaDeDadosCriandoConfirmacao {

	public static void main(String[] args) {
		
		String carros =  JOptionPane.showInputDialog("informe a quantidade de carros");
		String pessoas =  JOptionPane.showInputDialog("informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);//converte string para double
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao =  (int)(carroNumero /pessoasNumero  );
		double resto = carroNumero % pessoasNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "deseja ver o resultado da divisão");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoa deu " + divisao);
		}
		
	       resposta = JOptionPane.showConfirmDialog(null, "deseja ver o Resto da divisão");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "resto " + resto);
		}
		
		
		
	 
	
	}
}
