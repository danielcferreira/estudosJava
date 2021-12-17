
public class testeWhile {

	public static void main(String[] args) {
      //estrutura de repetição
		int contador = 0;//não esquecer de inicia  a variavel
		
     while ( contador <= 10) {
    	
    	
    		 if(contador == 8) {
        		 System.out.print( contador++ +" o dia que cai de bike  ");
        		 break;
        	 }
    		 contador++;
    	
    	 
    	 System.out.println(contador );
    	
	}
     
     int contador2 = 0;
     do {//primeiro executa depois verifica
    
      	
    	 if(contador2 == 8) {
    		 System.out.print("o dia que cai de bike  ");
    	 }
    	 System.out.println(contador2 );
    	 contador2++;
    	  }while(contador2<=10);
  	 
}
	}

