package curso.classes;

public class Diretor extends Pessoa {
      private String registroEducaca;
      private int tempoDirecao;
      private String tiulacao;
      
      
      
	public String getRegistroEducaca() {
		return registroEducaca;
	}
	public void setRegistroEducaca(String registroEducaca) {
		this.registroEducaca = registroEducaca;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTiulacao() {
		return tiulacao;
	}
	public void setTiulacao(String tiulacao) {
		this.tiulacao = tiulacao;
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3800;
	}
      
     
}
