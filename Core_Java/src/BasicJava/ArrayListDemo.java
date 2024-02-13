package BasicJava;

import java.util.ArrayList;

public class ArrayListDemo {
//can accept duplicate values
	//ArrayList, LinkedList, Vector has implemented List Interface
	//all these can grow or shrink dynamically
	//we can access  & insert/remove any element with index or value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Monali");
		a.add("is an ");
		a.add("Expert");
		a.add("SDET");
		a.add("SDET");//ArrayList accept duplicate values
		a.add(0, "Mrs");
		System.out.println(a);
		//a.remove(0);
		System.out.println(a);
		//a.remove("SDET");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Monali"));
		System.out.println(a.contains("Sonali"));
		System.out.println(a.indexOf("Monali"));
		System.out.println(a.indexOf("Sghjonali"));
		System.out.println(a.size());
		
		

	}

}
