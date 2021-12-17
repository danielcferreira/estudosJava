import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		String carros =  JOptionPane.showInputDialog("informe a quantidade de carros");
		String pessoas =  JOptionPane.showInputDialog("informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);//converte string para double
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao =  (int)(carroNumero /pessoasNumero  );
		double resto = carroNumero % pessoasNumero;
		
		
		JOptionPane.showMessageDialog(null, "Divisão para pessoas deu "+divisao+ " carros e sobrou  "+resto);
	 
	
	}
}
