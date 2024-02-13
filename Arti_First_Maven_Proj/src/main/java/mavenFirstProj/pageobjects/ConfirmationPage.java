package mavenFirstProj.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenFirstProj.AbstractComponents.AbstractComponent;

public class ConfirmationPage extends AbstractComponent{

	WebDriver driver;
	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	
	}
	@FindBy(css=".hero-primary")
	private WebElement ConfirmationMsg;
	
	public String getConfirmationMsg()
	{
		return ConfirmationMsg.getText();
	}

}
