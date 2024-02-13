package BasicJava;

public class constructorDemo {
	public constructorDemo()
	{
		System.out.println("I am in Constructor");
	}
	//parameterized constructor
	public constructorDemo(int a,int b)
	{
		System.out.println("I am in  parameterised Constructor");
		System.out.println("Values of passed parameters are "+a+ " And "+b);
		System.out.println("Addition is "+ (a+b));
	}
	public constructorDemo(String str)
	{
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorDemo cd = new constructorDemo();
		constructorDemo cd1 = new constructorDemo(4,7);
		constructorDemo cd2 = new constructorDemo("Hello");
	}

}
