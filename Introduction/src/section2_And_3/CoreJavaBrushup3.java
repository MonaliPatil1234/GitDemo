package section2_And_3;

public class CoreJavaBrushup3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Monali R Patil";
		String s3 = "Monali R Patil";//reference to s is created and assigned to s3, no new string is created
		String s1 = new String("Welcome");
		String s2 = new String("Welcome");// 2 new strings are created with same value
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		String[] splittedString1 = s.split("R");
		System.out.println(splittedString1[0].trim());//trim mtd to trim all white spaces of beginning and ending
		System.out.println(splittedString1[1].trim());
		for(int i = 0; i<s.length();i++)
			System.out.println(s.charAt(i));
		for(int i = s.length()-1;i>=0;i--)//to print the string in reverse sequence
			System.out.print(s.charAt(i));
		
	}

}
