import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test
	public void testmthd()
	{
		PS2 ps2obj = new PS2(3); // parameterized constructor
		System.out.println(ps2obj.decrement());
		System.out.println(ps2obj.increment());
		System.out.println(ps2obj.multiplyBy2());
		System.out.println(ps2obj.multiplyBy3());
		doThis();
	}
}
