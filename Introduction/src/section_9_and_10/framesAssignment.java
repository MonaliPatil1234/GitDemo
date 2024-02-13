package section_9_and_10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Monali\\\\DriverChrome\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_top']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle']")));
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
		

	}

}
