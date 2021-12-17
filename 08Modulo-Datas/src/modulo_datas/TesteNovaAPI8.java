package modulo_datas;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TesteNovaAPI8 {
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		
	         Instant inicio = Instant.now();
	         
	         Thread.sleep(2000);/*pode um processo com tempo qualquer que n�o conhecemos*/
	         
	         Instant ifinal = Instant.now();
	         
	         Duration duracao = Duration.between(inicio, ifinal);
	         
	         System.out.println("Dura�ao em nano segundos : " + duracao.toNanos());
	         
	         System.out.println("Dura�ao em minutos  : " + duracao.toMinutes());
	         
	         System.out.println("Dura�ao em em horas : " + duracao.toHours());
	         
	         System.out.println("Dura�ao em milisegundos : " + duracao.toMillis());
	         
	         System.out.println("Dura�ao em dias : " + duracao.toDays());
	         
	         
	}


	}


