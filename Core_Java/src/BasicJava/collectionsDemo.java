package BasicJava;

import java.util.ArrayList;

public class collectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 1, 2, 2, 2, 3, 3, 9, 4, 4, 5, 5, 5, 6, 6, 7 };
		// print unique no from the list - Amazon interview question
		// 1-2 times, 2-3 times, and so on
		ArrayList<Integer> at = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			//step 1 - create a counter for no of occurrences
			int k = 0;
			//step 2 - check whether arraylist contains the no
			if (!at.contains(a[i])) {
//if not then add the no to arraylist, if yes, take next element of a
				at.add(a[i]);
				//step 3 - increase the counter 
				k++;// for 1st occurrences
//step 4 - check for occurences of same no in rest of the array
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.print(a[i] + " Occurences- " + k);
				System.out.println();
				if(k==1)
					System.out.println(a[i]+" is a unique no" );
			}
		}

	}

}
