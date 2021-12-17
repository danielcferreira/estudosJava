package modulo_datas;

import java.util.Date;

public class TesteDatasEmJava01 {

	public static void main(String[] args) {
		   Date date = new Date();
		   
		   System.out.println(" data em mile segundos " + date.getTime());

		   System.out.println(" dia do mes " + date.getDate());
		   
		   System.out.println(" ano = " + (date.getYear()+1900));
		   
	}

}
