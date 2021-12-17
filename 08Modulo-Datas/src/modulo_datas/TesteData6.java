package modulo_datas;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class TesteData6 {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException {
		
		
	 //total de dias que se passaram entre as datas	
	 long dias =  ChronoUnit.DAYS.between(LocalDate.parse("2021-09-01"), LocalDate.now());
	 
	 System.out.println("possui " + dias + " dias entre a faixa de data ");
		
	}


	}


