package section2_And_3;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name  = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		String name1  = d1.getUserData();
		System.out.println(name1);
		getData1();
	}
	public String getData()
	{
		System.out.println("Inside a method/function called from main method");
		return "Monali Patil";
	}
	public static String getData1()
	{
		System.out.println("Inside a static method/function called from main method without creating object");
		return "Monali Patil";
	}

}
