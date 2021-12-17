package curso.classes;

import java.util.ArrayList;
import java.util.List;

import cursoJava.constantes.StatusAluno;

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
		
		//lista de diciplinas
		private List<Diciplina>  diciplinas  = new ArrayList<Diciplina>();
		
		public List<Diciplina> getDiciplinas() {
			return diciplinas;
		}
		
		public void setDiciplinas(List<Diciplina> diciplinas) {
			this.diciplinas = diciplinas;
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
		
		//calculando a media 
		public double getMedia() {
			double somaNotas = 0;
			
			for (Diciplina diciplina : diciplinas) {
				somaNotas += diciplina.getNota();
			}	
			return  	somaNotas /diciplinas.size();
		}
		
		//resultado da media
		public String getResultado() {
			double media = this.getMedia();
			if(media>=5) {
				if(media>= 7) {
					
					return StatusAluno.APROVADO;
				}else {
					
					return StatusAluno.RECUPERACAO;
				}
				}else {
				
				return StatusAluno.REPROVADO;
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
		System.out.println("A media do aluno " + getMedia());
	     
		System.out.println("*****=========*****");
		getResultado();
	}
		
	
		
		
}
		
		
		
