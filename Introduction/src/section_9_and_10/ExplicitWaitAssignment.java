package section_9_and_10;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\Monali\\\\DriverChrome\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		String UserNamePassword = driver.findElement(By.cssSelector("p.text-center.text-white")).getText();
		System.out.println(UserNamePassword);
		String[] rawUsrname = UserNamePassword.split("and");

		String[] rawUsername = rawUsrname[0].split("is");
		String Username = rawUsername[1].trim();
		System.out.println(Username);

		String[] RawPassword = rawUsrname[1].split("is");
		String Password1 = RawPassword[1].replaceAll("[)]", "");
		String Password = Password1.trim();
		System.out.println(Password);
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(options);

		dropdown.selectByValue("consult");

		driver.findElement(By.id("signInBtn")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for (int i = 0; i < products.size(); i++)

		{

			products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();
	}

}