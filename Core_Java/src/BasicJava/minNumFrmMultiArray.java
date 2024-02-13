package BasicJava;

public class minNumFrmMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = { { 11, 2, 3 }, { 4, -5, 6 }, { 7, 111, 99 } };
		// 11 2  3
		// 4 -5  6
		// 7  111  99
		int minNo = b[0][0];
		int maxNo = b[0][0];
		int minNoCol = 0;
		
		for (int i = 0; i < 3; i++) {// for row 0,1
			// System.out.println();

			for (int j = 0; j < 3; j++) {// for column 0,1,2
				if (b[i][j] < minNo) {
					minNo = b[i][j];
					minNoCol = j;
					System.out.println("value of column " +j);

				}
				if (b[i][j] > maxNo)
					maxNo = b[i][j];
			}

		}
		System.out.println(minNo);
		System.out.println(maxNo);
		int k = 0;
		int maxcolno = b[k][minNoCol];
		while (k < 3) {
			if (b[k][minNoCol] > maxcolno) {
				maxcolno = b[k][minNoCol];
				System.out.println("value of maxcolno " +maxcolno);

				

			}
			k++;
		}
		System.out.println(maxcolno);

	}

}