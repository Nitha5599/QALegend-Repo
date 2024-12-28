package PageClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import Utilities.WaitUtility;

public class QALegendAllProjectsPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement addProjectButton;
	@FindBy(id = "title")
	WebElement titleTextBox;
	@FindBy(xpath = "(//span[@class='select2-chosen'])[3]")
	WebElement clientDropDown;
	@FindBy(xpath = "(//input[@class='select2-input'])[3]")
	WebElement client2DropDown;
	@FindBy(xpath = "(//div[@class='select2-result-label'])[8]")
	WebElement selectValueDropDown;
	
	@FindBy(id = "description")
	WebElement descTextBox;
	@FindBy(id = "start_date")
	WebElement startDateBox;
	@FindBy(id = "deadline")
	WebElement deadlineBox;
	@FindBy(id = "price")
	WebElement priceTextBox;
	@FindBy(xpath = "//input[@class='select2-input select2-default']")
	WebElement labelsDropDown;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	
	
	
	
	
	
	
	
	public QALegendAllProjectsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddProjectButton() {
		pageutilities.clickOnElement(addProjectButton);
		
	}
	
	public void addProjectTitle(String title) {
		pageutilities.enterText(titleTextBox, title);
	}
	/*
	 * public void addClientDropDown(String dropdownValue) {
	 * pageutilities.clickOnElement(clientDropDown);
	 * pageutilities.clickOnElement(selectValueDropDown);
	 * //WaitUtility.waitForVisibilityOfElement(driver, selectValueDropDown); for
	 * (int i = 0; i < 20; i++) { selectValueDropDown.sendKeys(Keys.ARROW_DOWN);
	 * if(pageutilities.readAttribute(selectValueDropDown,dropdownValue).equals(
	 * dropdownValue)) { // if
	 * (selectValueDropDown.getAttribute("AAA").equals(dropdownValue)) {
	 * selectValueDropDown.sendKeys(Keys.ENTER); break; } }
	 * 
	 * }
	 */
		
	public void addDesc(String description, String price) {
		WaitUtility.waitForClickingElement(driver, descTextBox);
		pageutilities.enterText(descTextBox, description);
		startDateBox.sendKeys("2024-12-18");
		deadlineBox.sendKeys("2025-01-03");	
		pageutilities.enterText(priceTextBox, price);
	}
		
	
	
	public void saveButtonClick() {
		saveButton.click();
	}


}
