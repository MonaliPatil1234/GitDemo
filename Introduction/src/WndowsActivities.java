import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowsActivities {

public static void main(String[] args) {

// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Monali\\DriverChrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://google.com");//inbuilt wait mechanism is there, start with get always
driver.navigate().to("https://rahulshettyacademy.com");//no implicit wait
driver.navigate().back();
driver.navigate().forward();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.quit();

}



}

