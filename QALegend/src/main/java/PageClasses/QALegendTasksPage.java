package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import Utilities.WaitUtility;

public class QALegendTasksPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "(//a[@class='btn btn-default'])[2]")
	WebElement addTaskButton;
	@FindBy(id = "title")
	WebElement titleTextBox;
	@FindBy(id = "description")
	WebElement descTextBox;
	@FindBy(id = "select2-chosen-14")
	WebElement projectTextBox;
	@FindBy(id = "s2id_autogen14_search")
	WebElement projectDropDown;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchItemTextbox;
	@FindBy(xpath = "//*[@id=\"task-table\"]/tbody/tr/td[2]/a")
	WebElement searchResults;
	

	
	public QALegendTasksPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddTaskButton() {
		pageutilities.clickOnElement(addTaskButton);
		
	}
	
	public void addTask(String title, String desc, String project) throws InterruptedException {
		pageutilities.enterText(titleTextBox, title);
		pageutilities.enterText(descTextBox, desc);
		pageutilities.clickOnElement(projectTextBox);
		pageutilities.enterText(projectDropDown, project);
		WaitUtility.waitForClickingElement(driver, projectDropDown);
		pageutilities.pressEnterKeyUsingActions();
		
	}
		
	public boolean addTaskSaveButtonStatusChecker() {
		return(pageutilities.isElementEnabled(saveButton));
	  
	}
	public void saveClick() {
		pageutilities.clickOnElement(saveButton);
	}
	 
	 
	 

}
