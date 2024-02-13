package MavenProjectReportsDemo.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	ExtentReports extent = new ExtentReports();
	
	
	@BeforeTest
	public void config()
	{
		//ExtentReports, ExtentSparkReporte
		 String path = System.getProperty("user.dir")+"\\reports\\index.html"; 
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); 
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Monali Patil");
		
	}

	@Test
	public void initialDemo()
	{
		ExtentTest test = extent.createTest("InitialDemo");
		//System.setProperty("webdriver.chrome.driver", "D:\\Monali\\DriverChrome\\chdr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		test.fail("Results do not match");
		extent.flush();
		
		driver.close();
		driver.quit();
	}
	
}
