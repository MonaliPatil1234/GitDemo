package section_13_and_14;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Monali\\DriverChrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Practice")).click();
		driver.findElement(By.id("name")).sendKeys("Monali");
		driver.findElement(By.id("email")).sendKeys("pmonali62@gmail.com");
		driver.findElement(By.id("form-submit")).click();
		
		driver.findElement(By.cssSelector("a[href = 'https://rahulshettyacademy.com/seleniumPractise/#/']")).click();
		
		driver.findElement(By.linkText("Top Deals")).click();
		//get the window handles as top deals page opens in a new tab
		Set<String> windows = driver.getWindowHandles();
		
		Iterator <String> it = windows.iterator();
		
		 it.next();//go to parent window id
		String childID = it.next();//go and store child id window
		driver.switchTo().window(childID);
		driver.findElement(By.id("search-field")).sendKeys("apple");
		
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList = elementsList.stream()
				.map(s->s.getText())
				.collect(Collectors.toList());
		originalList.stream().forEach(s->System.out.println(s));
		List<WebElement> FilteredList = elementsList.stream()
				.filter(s->s.getText().toLowerCase().contains("apple"))
				.collect(Collectors.toList());
		try{
		    Assert.assertEquals(elementsList, FilteredList);
		    System.out.println("Equal lists");
		}catch(Throwable e){
		    System.err.println("Lists are not equal. "+e.getMessage());
		}




	}

}
