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
	@FindBy(xpath = "//span[text()='Tasks']")
	WebElement homepageTasksButton;
	

	public QALegendHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}


	public QALegendHomePage clickOnHomePageEventButton() {
		homepageEventButton.click();
		return this;
	}
	
	public QALegendHomePage clickOnHomepageNotesButton() {
		homepageNotesButton.click();
		return this;
	}
	
	public QALegendHomePage clickOnHomepageClientsButton() {
		homepageClientsButton.click();
		return this;
	}
	
	public QALegendHomePage clickOnHomePageTeamMembersButton() {
		homepageTeamMembersButton.click();
		return this;
	}
	
	public QALegendHomePage clickOnHomePageItemsButton() {
		homepageItemsButton.click();
		return this;
	}
	
	public QALegendHomePage clickOnHomePageMessagesButton() {
		homepageMessagesButton.click();
		return this;
	}
	
	public QALegendHomePage clickOnHomePageProjectsDropDownButton() {
		homepageProjectsDropDownButton.click();
		return this;
	}
	
	public QALegendHomePage clickOnHomePageAllProjectsButton() {
		homepageAllProjectsButton.click();
		return this;
	}
	
	public QALegendHomePage clickOnHomePageTasksButton() {
		homepageTasksButton.click();
		return this;
	}

}
