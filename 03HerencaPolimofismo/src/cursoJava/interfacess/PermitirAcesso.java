package cursoJava.interfacess;


//esse sera nosso contrato com de autentica��o
public interface PermitirAcesso {
	
     // public boolean autentica();//na interface fica apenas a declara��o do metodo  da aula 10.10
      public boolean autentica(String login, String senha );
      public boolean autentica();
    	  
      }
