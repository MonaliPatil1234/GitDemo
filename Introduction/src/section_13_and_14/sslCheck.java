package section_13_and_14;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Monali\\\\DriverChrome\\\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//for firefox, there is FireFoxOptions class, and so on
		options.setAcceptInsecureCerts(true);
		//pass options object as an argument to chromedriver
		WebDriver driver = new ChromeDriver(options);
		//to set proxy in automation script, use proxy class, and set proxy through proxy & options methods
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		//to change the downloads directory's path/folder, use maps & options
		Map<String,Object> prefs= new HashMap<String, Object>(); 
		prefs.put("/default_directory/downloads", "NewDirectory/NewPathForDownloads");
		options.setExperimentalOption("prefs", prefs);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		

	}

}
