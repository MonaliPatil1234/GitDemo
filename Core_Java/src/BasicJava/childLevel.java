package BasicJava;

public class childLevel extends childClassDemo {
//function overloading rules
	//1. either no of arguments passed should be different
	//2. or datatype of passed argument/s should be different
	public void getData(int a) {
		System.out.println(a);
	}
	public void getData(float a) {
		System.out.println(a);
	}

	public void getData(String a) {
		System.out.println(a);
	}
	public void getData(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childLevel cl = new childLevel();
		cl.getData(1);
		cl.getData("asd");
		cl.getData(1,2);
	}

}
