package modulo_datas;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteComparandoDatas04 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws ParseException {
		   Date date = new Date();
		   
		  Calendar calendar =  Calendar.getInstance();//aula 03
		   
		   System.out.println(" data em mile segundos " + date.getTime());
		   System.out.println("Calendar em miliSegundo: " + calendar.getTimeInMillis());//03
		   

		   
		   System.out.println("Calendar dia do mes: " +  calendar.get(Calendar.DAY_OF_MONTH));
		   
		   
		   System.out.println(" ano = " + (date.getYear()+1900));
		   
		   System.out.println("Calendar dia da semana: " +  (calendar.get(Calendar.DAY_OF_WEEK) -  1 ));
		   System.out.println("hora do dia " +  date.getHours());
		   
		   System.out.println("Calendar hora do dia: " +  calendar.get(Calendar.HOUR_OF_DAY ));
		   System.out.println("minuto da hora: " +  calendar.get(Calendar.MINUTE ));
		   
		   /*--------------Simple date Format-------------------*/
		   
		   
		   SimpleDateFormat simpleDateFotmat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		   
		   System.out.println("calendar em formato Padrão: " +  
		   simpleDateFotmat.format(calendar.getTime()));
		   
		   
		   
		   System.out.println("data em formato padrão : " + simpleDateFotmat.format(date));
		   
		  //simpleDateFotmat = new SimpleDateFormat("yyyy/MM/dd HH:mm.ss");
		  
		//  System.out.println("data em outro formato  " + simpleDateFotmat.format(date));
		   
		 
			System.out.println( "objeto date  " +  simpleDateFotmat.parse("25/09/1987 20:10.2"));
		
		
		  
		 
		 
	}

}
