package section_11_and_12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class section11Assignment {

	//private static final String SelectedCheckboxLabel = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Monali\\\\DriverChrome\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		int NoOfCheckboxes = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		for(int i = 0; i<NoOfCheckboxes;i++)
		{
			
				if(driver.findElements(By.cssSelector("input[type='checkbox']")).get(i).isSelected())
				{
				    String  SelectedCheckboxLabel = driver.findElements(By.cssSelector("input[type='checkbox']")).get(i).getAttribute("value");
					System.out.println(SelectedCheckboxLabel);
					WebElement L1 = driver.findElement(By.id("dropdown-class-example"));
					Select dropdown = new Select(L1);
					dropdown.selectByValue(SelectedCheckboxLabel);
					driver.findElement(By.id("name")).sendKeys(SelectedCheckboxLabel);
					driver.findElement(By.id("alertbtn")).click();
					String msg = driver.switchTo().alert().getText();
					driver.switchTo().alert().dismiss();
					if(msg.contains(SelectedCheckboxLabel))
					{
						System.out.println(SelectedCheckboxLabel+" is displayed on alert");
					}
					else
					{System.out.println(SelectedCheckboxLabel+" is Not displayed");}
					}
			
			}
				

			}
			
		}