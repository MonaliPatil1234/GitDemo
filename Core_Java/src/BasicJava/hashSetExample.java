package BasicJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	//HashSet, TreeSet, LinkedHAshSet implement set interface
	//Sets don't accept duplicate values
	//there is no guarantee that elements are stored
	//elements are stored in random order
	//in sequential order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Mrs");
		hs.add("Mrs");//HashSet does not accept duplicate values
		hs.add("Monali");
		hs.add("is an");
		hs.add("Expert");
		hs.add("SDET");		
		System.out.println(hs);
		hs.remove("is an");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());}
		
	}

}
