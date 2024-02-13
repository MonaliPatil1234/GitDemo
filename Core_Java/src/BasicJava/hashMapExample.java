package BasicJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {
//hashmap = key - value mapping stored
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0,"Hello");
		hm.put(1,"GudBye");
		hm.put(2,"Morning");
		hm.put(3,"Evening");
		hm.put(4,"Night");
		hm.put(5,"Sunrise");
		System.out.println(hm.get(1));
		System.out.println(hm.get(12));
		hm.remove(1);
		System.out.println(hm.get(1));
		Set st = hm.entrySet();
		Iterator it = st.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.print(me.getKey()+" ");
			System.out.println(me.getValue());
		}
		
		

	}

}
