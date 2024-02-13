package BasicJava;

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args)
	{
		ChildEmirates c = new ChildEmirates();
		c.bodyColor();
		c.engine();
		c.safetyGuidelines();
	}
	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red Color on the Body");
	}

}
