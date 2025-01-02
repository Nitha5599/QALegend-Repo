package PageClasses;

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
	WebElement clientBox;
	@FindBy(xpath = "(//input[@class='select2-input'])[4]")
	WebElement clientSearchBox;
	@FindBy(xpath = "(//div[@class='select2-result-label'])[8]")
	WebElement selectValueDropDown;	
	@FindBy(id = "description")
	WebElement descTextBox;
	@FindBy(id = "start_date")
	WebElement startDateBox;
	@FindBy(id = "deadline")
	WebElement endDateBox;
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
	public void addProjectClient(String client) {
		pageutilities.clickOnElement(clientBox);
		pageutilities.enterText(clientSearchBox, client);
		pageutilities.pressEnterKeyUsingActions();
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
		
	public void addDesc(String description, String price, String startdate, String enddate) {
		WaitUtility.waitForClickingElement(driver, descTextBox);
		pageutilities.enterText(descTextBox, description);
		pageutilities.clickOnElement(startDateBox);
		pageutilities.enterText(startDateBox, startdate);
		pageutilities.pressEnterKeyUsingActions();
		pageutilities.clickOnElement(endDateBox);
		pageutilities.enterText(endDateBox, enddate);
		pageutilities.pressEnterKeyUsingActions();
		pageutilities.enterText(priceTextBox, price);
	}
	public boolean addProjectsSaveButtonStatusChecker() {
		return(pageutilities.isElementEnabled(saveButton));
		  
	}
	public void saveButtonClick() {
		saveButton.click();
	}


}
