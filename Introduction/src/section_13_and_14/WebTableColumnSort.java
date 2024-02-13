package section_13_and_14;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableColumnSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Monali\\\\DriverChrome\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Practice")).click();
		driver.findElement(By.id("name")).sendKeys("Monali");
		driver.findElement(By.id("email")).sendKeys("pmonali62@gmail.com");
		driver.findElement(By.id("form-submit")).click();
		
		driver.findElement(By.cssSelector("a[href = 'https://rahulshettyacademy.com/seleniumPractise/#/']")).click();
		
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		 it.next();//move to parent window id
		
		String childID = it.next();//move to and store child window id
		driver.switchTo().window(childID);

		
		//click on column heading to sort it
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all webelements into a list 
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of webelements into a list (original list)
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		//apply sort on original list and collect it
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
	//compare original list with sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		//fetch the price of given veggie() >> if found "Beans", >>fetch its price and print
		do
		{
			//to avoid stale element exception, find elements on each page
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			
		 price = rows.stream().filter(s->s.getText().contains("Rice"))
				.map(s->getVeggiePrice(s)).collect(Collectors.toList());
		 if(price.size()<1)
		 {
			 driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		 }
		
		}while(price.size()<1);
		System.out.println(price);
	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
