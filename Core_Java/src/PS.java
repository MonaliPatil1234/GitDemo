import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	public void doThis() {
		System.out.println("I am defined in parent class PS");
	}

	@BeforeMethod
	public void runFirst() {
		System.out.println("Run this First");
	}
	@AfterMethod
	public void runLast() {
		System.out.println("Run this Last");
	}
}
