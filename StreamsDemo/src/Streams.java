import java.util.ArrayList;
import org.testng.annotations.Test;


public class Streams {
	/*@Test
	public void regular()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adarsh");
		names.add("Aditi");
		names.add("Bheem");
		names.add("Aman");
		names.add("Yudhishthir");
		names.add("Rajat");
		int count =0;
		for(String name:names)
		{
			if(name.startsWith("A"))
			{
				count++;
				System.out.println(name);
			}
		}
			System.out.println(count);
	}*/
		//same program with streams
			@Test
			public void streamFilter()
		{
			ArrayList<String> names = new ArrayList<String>();
				names.add("Adarsh");
				names.add("Aditi");
				names.add("Bheem");
				names.add("Aman");
				names.add("Yudhishthir");
				names.add("Rajat");
				Long c = names.stream().filter(s->s.startsWith("A")).count();
				System.out.println(c);
						
				
			}
	
		

}
