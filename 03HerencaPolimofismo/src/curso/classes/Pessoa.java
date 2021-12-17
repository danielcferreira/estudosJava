package curso.classes;

public  abstract  class Pessoa {
	//private sá a classe pode ver, protegido a classe filha também pode ver 
	protected String nome;
	protected  int idade;
	protected String dataDeNascimento;
	protected String rg;
	protected String nomeMae;
	protected String nomePai;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	//retorna true se idade for mairo que 18;
	 public boolean pessoaMaiorIdade() {
		return idade >= 18;
	 } 
		 
	 public void podeIrSozinho() {
		 if(pessoaMaiorIdade() == false) {
			 System.out.println("Não pode ir sozinho tem que espera alguém");
		 }else {
			 System.out.println("pode ir sozinho sim");
		 }
	 }
	 
	   //chamando metodo abstrato
		 public abstract double salario() ;
		
	
}
