package section2_And_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arre4 = {1,2,3,4,5,6,7,8,9,122};
		for(int i = 0; i<arre4.length;i++)
		{
			if(arre4[i] % 2 == 0)
			{
				System.out.println(arre4[i]);
			break;
			}
			else
				System.out.println(arre4[i]+" no is not divisible by 2");
		}//end of for loop
		ArrayList<String> a = new ArrayList<String>();
		a.add("Java");
		a.add("C");
		a.add("C++");
		a.add("Python");
		a.add("Ruby");
		System.out.println(a);
		a.set(1, "Javascript");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println(a.get(3));
		
		//for(int i = 0; i<a.size(); i++)
			//System.out.println(a.get(i));
		for(String str : a) 
			System.out.println(str);
		System.out.println(a.contains("Pythons"));
		List<int[]> arr5 = Arrays.asList(arre4);//now all the arraylist operations can be performed as arraylist on new arr5

	}//end of main mtd

}//end of class
