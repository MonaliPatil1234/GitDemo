package section_11_and_12;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. give the count of total no of links present on the entire web page
		System.setProperty("webdriver.chrome.driver", "D:\\\\Monali\\\\DriverChrome\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2. give the count of total no of links in footer section

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));//limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3. give the count of links in 1st column of footer section

		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4. click on links and check if they are working, pages are opened on click
		for(int i = 1; i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String ClickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER); 
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinkTab);
			Thread.sleep(5000L);
			
		}//opens all links
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		


	}

}
