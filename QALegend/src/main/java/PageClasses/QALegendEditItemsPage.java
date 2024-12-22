package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendEditItemsPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchItemTextbox;
	@FindBy(xpath = "//a[@class='edit']")
	WebElement editButton;
	@FindBy(id = "title")
	WebElement editTitleTextbox;
	@FindBy(id = "description")
	WebElement editDescTextbox;
	@FindBy(id = "unit_type")
	WebElement editUnitTypeTextbox;
	@FindBy(id = "item_rate")
	WebElement editRateTextbox;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement editSaveButton;
	
	
	
	
	
	
	public QALegendEditItemsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void searchItem(String searchItemTitle) {
		pageutilities.enterText(searchItemTextbox, searchItemTitle);
	}
	
	public void editItemClick() {
		pageutilities.clickOnElement(editButton);
	}
	public void editItem(String edit_title, String edit_desc, String edit_unittype, String edit_rate) {
		pageutilities.clearTextBox(editTitleTextbox);
		pageutilities.enterText(editTitleTextbox, edit_title);
		pageutilities.clearTextBox(editDescTextbox);
		pageutilities.enterText(editDescTextbox, edit_desc);
		pageutilities.clearTextBox(editUnitTypeTextbox);
		pageutilities.enterText(editUnitTypeTextbox, edit_unittype);
		pageutilities.clearTextBox(editRateTextbox);
		pageutilities.enterText(editRateTextbox, edit_rate);
	}
	public void editsaveButtonClick() {
		pageutilities.clickOnElement(editSaveButton);
	}

}
