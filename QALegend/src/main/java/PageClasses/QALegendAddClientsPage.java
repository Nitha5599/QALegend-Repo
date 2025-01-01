package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import Utilities.WaitUtility;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class QALegendAddClientsPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement addClientButton;
	@FindBy(id = "company_name")
	WebElement companyNameTextBox;
	@FindBy(id = "address")
	WebElement addressTextBox;
	@FindBy(id = "city")
	WebElement cityTextBox;
	@FindBy(id = "state")
	WebElement stateTextBox;
	@FindBy(id = "zip")
	WebElement zipTextBox;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	@FindBy(id = "//input[@type='search']")
	WebElement searchBox;
		
	public QALegendAddClientsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void addClientClick() {
		pageutilities.clickOnElement(addClientButton);
	}
	
	public QALegendAddClientsPage addClientDetails(String cmpy_name, String addrs, String city, String state, String zip) throws InterruptedException {
		companyNameTextBox.sendKeys(cmpy_name);
		pageutilities.enterText(companyNameTextBox, cmpy_name);
		pageutilities.enterText(addressTextBox, addrs);
		pageutilities.enterText(cityTextBox, city);
		pageutilities.enterText(stateTextBox, state);
		pageutilities.enterText(zipTextBox, zip);
		return this;
		
	}
	public boolean addClientSaveButtonStatusChecker() {
		return(pageutilities.isElementEnabled(saveButton));	  
	}
	
	public QALegendAddClientsPage addClientSaveButton() {
		saveButton.click();
		return this;
	}
}
