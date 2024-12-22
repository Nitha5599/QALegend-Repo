package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendLoginPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(id = "email")
	WebElement usernamefield;
	@FindBy(id = "password")
	WebElement passwordfield;
	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement signInButton;
	
	
	
	
	
	public QALegendLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
		
	}
	





	public void login(String userName, String password) {
		pageutilities.enterText(usernamefield, userName);
		pageutilities.enterText(passwordfield, password);
		pageutilities.clickOnElement(signInButton);
	}

}
