package curso.classes;

/*esta é a nossa classe que representa um aluno */
public class Aluno {
	/*esses são os atributos do aluno eles por padrão estão privados
	 * quando modificado para public que podem ser acessados pos outras classes */
		private String nome;
		private int idade;
		private String dataDeNascimento;
		private String rg;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeEscola;
		private  String serieMatriculado;
		private Diciplina diciplina;
		
	//private Diciplina diciplina = new Diciplina();
		
		public void setDiciplina(Diciplina diciplina) {
			this.diciplina = diciplina;
		}
		
		public Diciplina getDiciplina() {
			return diciplina;
		}
		
		
		public Aluno() {/*Cria os dados na memoria do java, sendo padrão do java*/
			
		}
		public Aluno(String nomePadrao) {
			nome = nomePadrao;
		}
		public Aluno(String nomePadrao,int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
		}
		/*os metodos set e get servem para recerber e enviar os dados para que 
		 * não sejam enviados diretamente */
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
		public String getDataMatricula() {
			return dataMatricula;
		}
		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}
		public String getNomeEscola() {
			return nomeEscola;
		}
		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}
		public String getSerieMatriculado() {
			return serieMatriculado;
		}
		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}
		
		public double getMedia() {
			return  (diciplina.getNota1()+ diciplina.getNota2()+ diciplina.getNota3()+diciplina.getNota4()) / 4;
		}
		
		
		public boolean getResultado() {
			double media = this.getMedia();
			if(media>=5) {
				if(media>= 7) {
					System.out.println("aluno esta Aprovado");
					return true;
				}else {
					System.out.println("aluno esta em recuperacao");
					return false;
				}
				}else {
				System.out.println("aluno esta reprovado");
				return false;
				}
			}
		
		
		//comparando objetos fazendo uso do equal e jashCode
		//usando um atributo para diferencis os objetos 
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}

	public void dadosAluno() {
		System.out.println("nome do aluno: " +getNome() );
		System.out.println("idade do aluno: " +getIdade() );
		System.out.println("Rg do aluno: " +getRg() );
		System.out.println("nome da escola do aluno: " +getNomeEscola());
		System.out.println("data de maricula do aluno: " +getDataMatricula());
		System.out.println("Diciplina 1 " +  getDiciplina().getDisciplina1());
		System.out.println("nota 1: " + getDiciplina().getNota1());
		System.out.println("Diciplina 2 " +  getDiciplina().getDisciplina2());
		System.out.println("nota 2: " + getDiciplina().getNota2());
		System.out.println("Diciplina 3 " +  getDiciplina().getDisciplina3());
		System.out.println("nota 3: " + getDiciplina().getNota3());
		System.out.println("Diciplina 4 " +  getDiciplina().getDisciplina4());
		System.out.println("nota 4: " + getDiciplina().getNota4());
		System.out.println("*****=========*****");
		
		
		
		getResultado();
	}
		}
		
		
		
