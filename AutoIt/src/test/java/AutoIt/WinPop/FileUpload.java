package AutoIt.WinPop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String downloadFilepath = System.getProperty("user.dir");
		System.out.println(downloadFilepath);
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/jpg-to-pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//CLICK ON CHOOSE FILE BUTTON
		
		driver.findElement(By.cssSelector("button[class*='l3tlg0-0']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\madhu\\Documents\\AutoItScripts\\FileUpload.exe");
		Thread.sleep(5000);
		//WAIT TILL THE CONVERT BUTTON IS DISPLAYED
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); 
       
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button//div//span[text()='Convert']")));
		
		//CLICK ON CONVERT BUTTON
		
		driver.findElement(By.xpath("//button//div//span[text()='Convert']")).click();
		System.out.println(driver.getTitle());
		//wait for download button to be displayed
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Download']")));
		
		//CLICK ON DOWNLOAD BUTTON
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		Thread.sleep(5000);
		
		File f = new File(downloadFilepath+"/Tulips.pdf");
		Assert.assertTrue(f.exists());
		if(f.delete())
			System.out.println("File deleted!");
		
	}

}
/*import java.io.File;

import java.io.IOException;

import java.util.HashMap;



import org.testng.Assert;

import org.testng.annotations.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class FileUpload {



public static void main(String[] args) throws InterruptedException, IOException {

// TODO Auto-generated method stub

String downloadPath=System.getProperty("user.dir");



HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

chromePrefs.put("profile.default_content_settings.popups", 0);

chromePrefs.put("download.default_directory", downloadPath);

ChromeOptions options=new ChromeOptions();

options.setExperimentalOption("prefs", chromePrefs);

WebDriver driver=new ChromeDriver(options);

driver.get("https://altoconvertpdftojpg.com/");

driver.findElement(By.cssSelector("[class*='btn--choose']")).click();

Thread.sleep(3000);

Runtime.getRuntime().exec("C:\\Users\\madhu\\Documents\\AutoItScripts\\FileUpload.exe");

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));

driver.findElement(By.cssSelector("button[class*='medium']")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

driver.findElement(By.linkText("Download Now")).click();

Thread.sleep(5000);

File f=new File(downloadPath+"/converted.zip");

if(f.exists())

{

Assert.assertTrue(f.exists());

if(f.delete())

System.out.println("file deleted");

}

}



}*/




