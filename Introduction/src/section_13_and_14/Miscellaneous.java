package section_13_and_14;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Monali\\\\DriverChrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//to delete all cookies before hiting the url
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
	//	driver.manage().deleteCookieNamed("sessionKey");
		//this will delete sessionkey which will result in logout/expired session
		//you can then click on any link and check if it had redirected to login page
		//TakesScreenshot src = ((TakesScreenshot)driver);
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 //Move image file to new destination

        File DestFile=new File("D:\\Monali\\Screenshots\\firstScreenshotviaSelenium.png");

        //Copy file at destination

        FileUtils.copyFile(srcfile, DestFile);
		

	}

}
