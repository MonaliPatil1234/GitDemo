package SelFeaturesLatest.ChromeDevTools;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v114.emulation.Emulation;
import org.openqa.selenium.devtools.v114.emulation.model.DisplayFeature;
import org.openqa.selenium.devtools.v114.emulation.model.ScreenOrientation;
import org.openqa.selenium.devtools.v114.page.model.Viewport;

public class MobileEmulatorTest {
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		//send commands to CDP methods->CDP methods will invoke and get access to chrome dev tools
		devtools.send(Emulation.setDeviceMetricsOverride(700, 1000, 50, true, Optional.<Number> empty(),
	            Optional.<Integer> empty(), Optional.<Integer> empty(), Optional.<Integer> empty(), 
	            Optional.<Integer> empty(), Optional.<Boolean> empty(), Optional.<ScreenOrientation> empty(), 
	            Optional.<Viewport> empty(), Optional.<DisplayFeature> empty()));
		driver.get("https://www.rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();
	}

}
