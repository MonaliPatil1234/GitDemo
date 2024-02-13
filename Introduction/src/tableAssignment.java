import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Monali\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,500)");
		List<WebElement> rows=driver.findElements(By.cssSelector("table[name='courses'] tr"));
		int numOfRows = rows.size();
		System.out.println("Total Number of Rows in Table are " + numOfRows);
		System.out.println(rows.get(2).getText());
		
		List<WebElement> columns=driver.findElements(By.cssSelector("table[name = 'courses'] th"));
		System.out.println("No of Columns in the table are "+columns.size());		

	}

}