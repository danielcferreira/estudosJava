package modulo_datas;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteCalendar03 {

	public static void main(String[] args) throws ParseException {
		   Date date = new Date();
		   
		   System.out.println(" data em mile segundos " + date.getTime());

		   System.out.println(" dia do mes " + date.getDate());
		   
		   System.out.println(" ano = " + (date.getYear()+1900));
		   
		   /*--------------Simple date Format-------------------*/
		   
		   
		   SimpleDateFormat simpleDateFotmat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		   
		   System.out.println("data em formato padrão : " + simpleDateFotmat.format(date));
		   
		  //simpleDateFotmat = new SimpleDateFormat("yyyy/MM/dd HH:mm.ss");
		  
		//  System.out.println("data em outro formato  " + simpleDateFotmat.format(date));
		   
		 
			System.out.println( "objeto date  " +  simpleDateFotmat.parse("25/09/1987 20:10.2"));
		
		
		  
		 
		 
	}

}
