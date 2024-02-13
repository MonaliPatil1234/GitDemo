package BasicJava;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = { 1, 7, 4, 5, 67, 34 };
		int a[] = new int[5];

		a[0] = 2;
		a[1] = 4;
		a[2] = 7;
		a[3] = 12;
		a[4] = 78;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	

}
