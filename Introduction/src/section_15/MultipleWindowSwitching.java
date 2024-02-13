package section_15;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowSwitching {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Monali\\\\DriverChrome\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Practice")).click();
		driver.findElement(By.id("name")).sendKeys("Monali");
		driver.findElement(By.id("email")).sendKeys("pmonali62@gmail.com");
		driver.findElement(By.id("form-submit")).click();

		driver.findElement(By.cssSelector("a[href = 'https://rahulshettyacademy.com/angularpractice/']")).click();
		//switch to a new window
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow).get("https://www.rahulshettyacademy.com");
		String FirstCourse = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();
		driver.switchTo().window(parentWindow);
		WebElement name = driver.findElement(By.xpath("//form//div/input[@name='name']"));
				name.sendKeys(FirstCourse);
				//get a screenshot of the name element only
				File file = name.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(file, new File("D:\\namescr.png"));
		//get the dimensions of web element
				System.out.println(name.getRect().getDimension().getHeight());
				System.out.println(name.getRect().getDimension().getWidth());

	}

}
