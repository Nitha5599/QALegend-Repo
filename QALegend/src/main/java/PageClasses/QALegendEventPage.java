package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendEventPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "(//a[@title='Add event'])[2]")
	WebElement addEventButton;
	@FindBy(id = "title")
	WebElement titleTextBox;
	@FindBy(id = "description")
	WebElement descriptionBox;
	@FindBy(id = "start_date")
	WebElement startDateBox;
	@FindBy(id = "start_time")
	WebElement startTimeBox;
	@FindBy(id = "end_date")
	WebElement endDateBox;
	@FindBy(id = "end_time")
	WebElement endTimeBox;
	@FindBy(id = "location")
	WebElement locationBox;
	@FindBy(id = "s2id_event_labels")
	WebElement labelBox;
	@FindBy(id = "select2-chosen-1")
	WebElement clientBox;
	@FindBy(id = "only_me")
	WebElement radioButtonOnlyme;
	@FindBy(id = "event_recurring")
	WebElement repeatChkBox;
	@FindBy(id = "repeat_every")
	WebElement repeatEvery;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	@FindBy(xpath = "(//button[@class='close'])[1]")
	WebElement closeButton;
	
	
	
	
	
	
	
	
	
	
	
	
	public QALegendEventPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}











	public void clickOnAddEventButton() {
		pageutilities.clickOnElement(addEventButton);
		
	}
	
	public void addEvent(String title, String description) {
		titleTextBox.sendKeys(title);
		pageutilities.enterText(descriptionBox, description);
		startDateBox.sendKeys("2024-12-30");
		endDateBox.sendKeys("2025-01-28");		
	}
	
	public boolean eventPageSaveButtonStatusChecker() {
		return (pageutilities.isElementEnabled(saveButton));
		
	}
	public void closeButtonClick() {
		closeButton.click();
	}

}
