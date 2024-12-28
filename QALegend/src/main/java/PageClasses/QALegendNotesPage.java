package PageClasses;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import Utilities.WaitUtility;

public class QALegendNotesPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement addNoteButton;
	@FindBy(id = "title")
	WebElement titleTextBox;
	@FindBy(id = "description")
	WebElement descTextBox;
	@FindBy(xpath = "//button[contains(@class,'upload-file')]")
	WebElement uploadButton;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	
	
		
		
	public QALegendNotesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}




	public void addNotes(String title, String desc, String path) throws AWTException, InterruptedException {
		pageutilities.clickOnElement(addNoteButton);
		pageutilities.enterText(titleTextBox, title);
		pageutilities.enterText(descTextBox, desc);
		pageutilities.clickOnElement(uploadButton);
		fileUpload(path);
		
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
	public void saveButtonClick() throws InterruptedException {
		Thread.sleep(4000);
		//WaitUtility.waitForClickingElement(driver, saveButton);
		pageutilities.clickOnElement(saveButton);
	}
}
