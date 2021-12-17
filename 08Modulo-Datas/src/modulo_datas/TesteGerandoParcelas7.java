package modulo_datas;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteGerandoParcelas7 {
	//Mosntrando os meses de parcelas 
	public static void main(String[] args) throws ParseException {
		
		Date dateInicial  = new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2021");
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(dateInicial);
		
		for(int parcela = 1 ;parcela<=24;parcela++) {
			calendar.add(Calendar.MONTH, 1);//o numero 1 representa o mês 
			
			System.out.println("parcelas numero " + parcela + " vencimento é em " 
			+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			
		}
		
	}


	}


