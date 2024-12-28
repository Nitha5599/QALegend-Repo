package PageClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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
	@FindBy(xpath = "//button[contains(@class,'upload-file')]")
	WebElement uploadButton;
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
	
	public void editNote(String title, String desc, String path) throws AWTException, InterruptedException {
		editTitleTextBox.clear();
		pageutilities.enterText(editTitleTextBox, title);
		editDescTextBox.clear();
		pageutilities.enterText(editDescTextBox, desc);
		pageutilities.clickOnElement(uploadButton);
		fileUpload(path);
		Thread.sleep(4000);
		saveButton.click();
	}
	public void fileUpload(String path) throws AWTException, InterruptedException {
		StringSelection stringselection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		Robot robot = new Robot();
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
