package BasicJava;

public class thisDemo {

	int a = 2;

	public void data() {
		int a = 3;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println((this.a + a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo t = new thisDemo();
		t.data();
//below is example of accessing class method from another class in this 
//class when both classes are in same package
		childClassDemo cd = new childClassDemo();
		cd.engine();

//Access Modifiers
//When no access modifier is used then its 'default' by default
//And methods, variables having default access modifier cannot be accessed outside the package
//they can be accessed in the same package only
//'public' allows access outside the package or across all packages
//also, provided you've imported the packagename.class

//Private: private methods and variables are not accessible outside that class
//in same package as well
//Protected : Same package & only subclasses/classes extending this class in 
		//other package can access those protected methods/variables
	}

}
