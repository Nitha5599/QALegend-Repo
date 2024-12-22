package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendHomePage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//span[text()='Events']")
	WebElement homepageEventButton;
	@FindBy(xpath = "//span[text()='Notes']")
	WebElement homepageNotesButton;
	@FindBy(xpath = "//span[text()='Clients']")
	WebElement homepageClientsButton;
	@FindBy(xpath = "//span[text()='Team members']")
	WebElement homepageTeamMembersButton;
	@FindBy(xpath = "//span[text()='Items']")
	WebElement homepageItemsButton;
	@FindBy(xpath = "//span[text()='Messages']")
	WebElement homepageMessagesButton;
	@FindBy(xpath = "//span[text()='Projects']")
	WebElement homepageProjectsDropDownButton;
	@FindBy(xpath = "//span[text()='All Projects']")
	WebElement homepageAllProjectsButton;
	
	
	
	
	
	
	public QALegendHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}






	public void clickOnHomePageEventButton() {
		homepageEventButton.click();
	}
	
	public void clickOnHomepageNotesButton() {
		homepageNotesButton.click();
	}
	
	public void clickOnHomepageClientsButton() {
		homepageClientsButton.click();
	}
	
	public void clickOnHomePageTeamMembersButton() {
		homepageTeamMembersButton.click();
	}
	
	public void clickOnHomePageItemsButton() {
		homepageItemsButton.click();
	}
	
	public void clickOnHomePageMessagesButton() {
		homepageMessagesButton.click();
	}
	
	public void clickOnHomePageProjectsDropDownButton() {
		homepageProjectsDropDownButton.click();
	}
	
	public void clickOnHomePageAllProjectsButton() {
		homepageAllProjectsButton.click();
	}

}
