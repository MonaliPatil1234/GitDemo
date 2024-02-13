package BasicJava;

public class staticVarDemo {

	String name; // Instance Variables different for each obj
	String address;
	static String city; // Class variables, common for all objects
	static int i;
	static {
		city="Nashik";
		i=0;
	}

	staticVarDemo(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);

	}

	public void getAddress() {
		System.out.println("Address is " + address + " " + city);
	}

	public static void getcity() {
		System.out.println(city);// static methods only accept static variables
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVarDemo svd = new staticVarDemo("Monali", "Highway");
		staticVarDemo svd1 = new staticVarDemo("Madhukar", "College Road");
		svd.getAddress();
		svd1.getAddress();
		getcity(); // OR
		staticVarDemo.getcity();
		staticVarDemo.i = 4;// calling with class name is better to avoid confusion bet class var //and
							// local var with same name
		System.out.println(i);
		i = 10;
		System.out.println(i);
		staticVarDemo svd2 = new staticVarDemo("Monali", "Highway");
		svd2.address="Nashik Road";

	}

}
