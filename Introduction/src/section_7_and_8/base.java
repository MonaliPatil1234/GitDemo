package section_7_and_8;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Monali\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		String[] productsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String productName = name[0].trim();

			// convert the array to array list so that we can use contains method and
			// convert in the loop dynamically so that we can save memory
			List<String> productsNeededList = Arrays.asList(productsNeeded);
			System.out.println(productsNeededList.size());

			// check whether the name is present in the products needed list
			if (productsNeededList.contains(productName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if (j == productsNeededList.size()) {
					break;
				}

			}
		}

	}

}
