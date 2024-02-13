package section2_And_3;
public class CoreJavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int muNum = 5;
		char c = 'a';
		double d = 5.99;
		String s = "Monali";
		System.out.println(muNum + " is the value of int no in myNum");
		System.out.println(c+" is the char");
		System.out.println("value of double/float is : "+d);
		System.out.println("String is "+s);
		int[] arrey = new int[5];
		arrey[0] = 57;
		arrey[1] = 28;
		arrey[2] = 65;
		arrey[3] = 34;
		arrey[4] = 45;
		int[] arr2 = {23,65,67,98,12,87,67,54,34};
		//for(int i = 0; i<arrey.length;i++)
			//System.out.println(arrey[i]);
		for(int i : arrey)
			System.out.println(i);
		
		//for(int i = 0; i<arr2.length;i++)
		for(int i : arr2)
			System.out.println(i);
			//System.out.println(arr2[i]);
		
		String[] arr3 = {"asd", "qwe", "ewr", "jhk"};
		//for(int i = 0; i<arr3.length;i++)
			//System.out.println(arr3[i]);
		for(String j : arr3)
			System.out.println(j);
		
		
	}

}
