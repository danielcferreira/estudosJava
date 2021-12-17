package cursoJava.interfacess;


//esse sera nosso contrato com de autenticação
public interface PermitirAcesso {
	
     // public boolean autentica();//na interface fica apenas a declaração do metodo  da aula 10.10
      public boolean autentica(String login, String senha );
      public boolean autentica();
    	  
      }
