package BasicJava;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptionDemo e1 = new exceptionDemo();
		int a = 7;
		int b = 0;
		int[] arr = { 12, 43, 34, 4356, 90 };
		try {// try block must be immediately followed by catch block,
				// no other code should be there in between try and catch blocks
				// int k = a / b;
			// System.out.println("Value of k is " + k);
			System.out.println(arr[5]);
		} catch (ArithmeticException e) {
			System.out.println("I catched Arithmetic exception " + e.getLocalizedMessage());

			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("I catched Array index out of bounds exception " + e.getLocalizedMessage());

			System.out.println(e.getMessage());
		}

		catch (Exception e) {// there can be multiple catch blocks
			// Exception is a main class applicable to all types of exceptions
			System.out.println("I catched error/exception " + e.getLocalizedMessage());

			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			e.printStackTrace();

		} finally {//you can use finally only when you have used try
			System.out.println("Delete Cookies");
			System.out.println("Close All Browsers");
			// this block contains the code which has to be executed
			// finally block gets executed compulsory even if there is any
			// exception/no exception
			//eg code to close all browsers after successful/unsuccessful execution of the script
			//code to delete all cookies after execution of the script 
			
		}

		System.out.println("Rest is getting executed");

	}

}
