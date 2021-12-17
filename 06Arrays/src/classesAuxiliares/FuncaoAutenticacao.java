package classesAuxiliares;

import cursoJava.interfacess.PermitirAcesso;

//receber só quem tiver o contrato da inteface de permitir acesso 
public class FuncaoAutenticacao {
	
	
	private PermitirAcesso permitirAcesso;
    
	public boolean autenticarCursoJava() {
		return permitirAcesso.autentica();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
    }
	
	}
   
