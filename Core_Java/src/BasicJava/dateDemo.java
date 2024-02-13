package BasicJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = sdf.format(d);
		System.out.println(strDate);
		System.out.println(d.toString());
		Date d1 = sdf.parse("21/5/2014");
		System.out.println(d1.toString());
		

	}

}
