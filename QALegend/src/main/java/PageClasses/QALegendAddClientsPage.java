package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendAddClientsPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement addClientButton;
	@FindBy(name = "company_name")
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
	
	
	
	
	
	
	
	public QALegendAddClientsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void addClientClick() {
		pageutilities.clickOnElement(addClientButton);
	}
	
	public void addClientDetails(String cmpy_name, String addrs, String city, String state, String zip) throws InterruptedException {
		//Thread.sleep(2000);
		//companyNameTextBox.sendKeys(cmpy_name);
		//pageutilities.enterText(companyNameTextBox, cmpy_name);
		pageutilities.enterText(addressTextBox, addrs);
		pageutilities.enterText(cityTextBox, city);
		pageutilities.enterText(stateTextBox, state);
		pageutilities.enterText(zipTextBox, zip);
	}
	
	public void addClientSaveButton() {
		saveButton.click();
	}

}
