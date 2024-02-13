package BasicJava;

public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[2][3];
		a[0][0] = 00;
		a[0][1] = 01;
		a[0][2] = 03;
		a[1][0] = 10;
		a[1][1] = 11;
		a[1][2] = 12;
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// 1 2 3
		// 4 5 6
		// 7 8 9
		for (int i = 0; i < 2; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]+" ");

			}
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {//for row 0,1
			System.out.println();
			for (int j = 0; j < 3; j++) {//for column 0,1,2
				System.out.print(b[i][j]+" ");

			}
		}

	}

}
