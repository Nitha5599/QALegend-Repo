package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendNotesPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement addNoteButton;
	@FindBy(id = "title")
	WebElement titleTextBox;
	@FindBy(id = "description")
	WebElement descTextBox;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	
	
		
		
	public QALegendNotesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}




	public void addNotes(String title, String desc) {
		pageutilities.clickOnElement(addNoteButton);
		pageutilities.enterText(titleTextBox, title);
		pageutilities.enterText(descTextBox, desc);
		saveButton.click();
	}

}
