package curso.classes;

import cursoJava.interfacess.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{
	
    private String registro;
    private String nivelCargo;
    private String experiencia;
    
   
    private String login;
    private String senha;
    
    public Secretario(String login, String senha) {
    	this.login = login;
    	this.senha = senha;
    }
    
    public Secretario() {
    	
    }
    
    

	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800 * 0.9;
	}
	
	
	
	//esse é o metodo de contrato de auticação 
	@Override
	public boolean autentica(String login, String senha) {
		this.login = login;
    	this.senha = senha;
		return login.equals(senha) && senha.equals(senha);
	}
	@Override
	public boolean autentica() {
		// TODO Auto-generated method stub
		return login.equals("admin") && senha.equals("admin");
	}
    
    
}
