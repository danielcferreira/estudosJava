package model;

import java.io.Serializable;

/*nessa classe devemos sempre implementar o Serializable*/
public class ModelLogin  implements Serializable{
	
	/*serve para compilação das classes para uso do banco de dados  */
	private static final long serialVersionUID = 1L;
	
	private String login;
	private String senha;
	
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public String getLogin() {
		return login;
	}
	
public void setLogin(String login) {
	this.login = login;
}
	
	
	

}
