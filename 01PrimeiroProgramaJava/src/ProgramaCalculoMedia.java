import javax.swing.JOptionPane;

public class ProgramaCalculoMedia {

	public static void main(String[] args) {
		
		String nota1 =  JOptionPane.showInputDialog("informa a nota 1");
		String nota2 =  JOptionPane.showInputDialog("informa a nota 2");
		String nota3 =  JOptionPane.showInputDialog("informa a nota 3");
		String nota4 =  JOptionPane.showInputDialog("informa a nota 4");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media =  (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if(media >= 5.0) {
			if(media >=7.0) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado com media de :" + media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em Recuperacao :" + media);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado :" + media);
		}
	
	}
}
