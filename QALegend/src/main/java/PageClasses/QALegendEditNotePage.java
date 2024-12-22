package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendEditNotePage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchTextBox;
	@FindBy(xpath = "(//a[@title='Edit note'])[2]")
	WebElement editButton;
	@FindBy(id = "title")
	WebElement editTitleTextBox;
	@FindBy(id = "description")
	WebElement editDescTextBox;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveButton;
	
	
	
	
	
	
	
	
	public QALegendEditNotePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void searchNote(String search_title) {
		pageutilities.enterText(searchTextBox, search_title);
	}
	
	public void editNoteClick() {
		pageutilities.clickOnElement(editButton);
	}
	
	public void editNote(String title, String desc) {
		editTitleTextBox.clear();
		pageutilities.enterText(editTitleTextBox, title);
		editDescTextBox.clear();
		pageutilities.enterText(editDescTextBox, desc);
		saveButton.click();
	}

}
