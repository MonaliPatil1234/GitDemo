package section_11_and_12;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Monali\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		// select a date 23 April from calender
		// input[id='form-field-travel_comp_date']
		WebElement DateField = driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", DateField);
		Thread.sleep(3000);
		DateField.click();
		// Actions actions = new Actions(driver);
		// actions.moveToElement(DateField).click().build().perform();
		String Month = driver.findElement(By.cssSelector("span[class='cur-month']")).getText();
		System.out.println(Month);
		// if the month is not April, keep on clicking on next month button/link
		while (!(driver.findElement(By.cssSelector("span[class='cur-month']")).getText().contains("April"))) {
			driver.findElement(By.cssSelector("span[class='flatpickr-next-month']")).click();
			Thread.sleep(2000);
		}
		// once April is found, search for date 23
List<WebElement> Dates = driver.findElements(By.cssSelector("span[class='flatpickr-day ']"));
		int count = Dates.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++)
		{
String text = 
driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).getText();
System.out.println(text);
			if (text.contains("23")) 
			{
				driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).click();
				break;
			}
		}
	}

}
