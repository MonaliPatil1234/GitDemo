import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentNo2UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Monali\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("John Robert");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("asdf@asdf.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Asdf@123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Female");		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("04/03/1990");		
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("[class*='success alert']")).getText());

	}

}
