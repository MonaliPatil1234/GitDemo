package BasicJava;

public class childClassDemo extends parentClassDemo {
	
	public childClassDemo() {
		//super();
		System.out.println("I am child class constructor");
	}
	String color = "Yellow";
	public void str()
	{
		System.out.println(color);
		System.out.println(super.color); //accessing data from parent class with same name using //super keyword
	}

	public void Music(int a)
	{
		super.Music();//calling a method from parent class using super keyword
		System.out.println("Child class Music Code implemented");
	}
	public void engine() {
		System.out.println("New Engine");
	}

	public void color() {
		System.out.println(color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childClassDemo cd = new childClassDemo();
		cd.color();
		cd.engine();
		cd.Music(1);
		cd.str();
		
	}

}
