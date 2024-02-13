package section_9_and_10;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Monali\\\\DriverChrome\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		 it.next();//move to parent window id in the set of window handles
		
		String childID = it.next();//move to and store child window id 
		String childID1 = it.next();
		driver.switchTo().window(childID1);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(childID);
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		

	}

}
