package SelFeaturesLatest.ChromeDevTools;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class setGeoLocation {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		// Madrid Spain longitude, lattitude value are 40, 3
		Map<String, Object> coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 35);
		coordinates.put("longitude", 139);
		coordinates.put("accuracy", 1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.manage().window().maximize();
		driver.get("https://my-location.org/");

		System.out.println(driver.findElement(By.id("address")).getText());
		// driver.get("https://www.facebook.com/");
		// driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		// driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		// String title = driver.findElement(By.xpath("//div/h1")).getText();
		// System.out.println(title);

	}

}
