package section_15;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement NameInputTextBox = driver
				.findElement(By.cssSelector("input[name='name'"));
		WebElement icecreamLabel = driver
				.findElement(By.xpath("//label[@for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(icecreamLabel)).click();
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(NameInputTextBox)).getText());
		WebElement FirstRadioBtn = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(FirstRadioBtn)).getText());
		WebElement Label_DOB = driver
				.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(Label_DOB)).click();

	}

}
