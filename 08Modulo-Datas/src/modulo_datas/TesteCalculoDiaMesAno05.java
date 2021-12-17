package modulo_datas;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TesteCalculoDiaMesAno05 {
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();//pega a data atual 
		
		/*simular data que vem do banco de dados */
		
         calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("9/09/2021"));
         
         calendar.add(Calendar.DAY_OF_MONTH, 9);//soma aos dias da semana 
         
         System.out.println("somando dias : " +new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
	 
         calendar.add(Calendar.MONTH, 7);//somando o mês 
         
         System.out.println("Somando o mes: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
         calendar.add(Calendar.YEAR, 7);//somando o ano 
         
         System.out.println("Somando o ano: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
	}


	}


