package section_13_and_14;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Monali\\\\DriverChrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// Step 1 - get all the urls using getattribute(href) tied up with all links on
		// web page
		// call java methods to hit the request and get the response status code
		// if status code is >400, link is broken/not working
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The Broken link is " + link.getText() + " and the response status code is " + respCode );
				

			}
		a.assertAll();

		}
		// check brokenlink response code
		// String url1 =
		// driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		// conn = (HttpURLConnection)new URL(url1).openConnection();
		// conn.setRequestMethod("HEAD");
		// conn.connect();
		// respCode = conn.getResponseCode();
		// System.out.println(respCode);

	}


