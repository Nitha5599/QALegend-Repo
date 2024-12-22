package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendItemsPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement addItemButton;
	@FindBy(id = "title")
	WebElement addTitleTextbox;
	@FindBy(id = "description")
	WebElement addDescTextbox;
	@FindBy(id = "unit_type")
	WebElement unitTypeTextbox;
	@FindBy(id = "item_rate")
	WebElement rateTextbox;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	
	
	
	
	
	
	
	
	public QALegendItemsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickOnAddItemButton() {
		pageutilities.clickOnElement(addItemButton);
	}
	public void addItem(String title, String desc, String unittype, String rate) {
		pageutilities.enterText(addTitleTextbox, title);
		pageutilities.enterText(addDescTextbox, desc);
		pageutilities.enterText(unitTypeTextbox, unittype);
		pageutilities.enterText(rateTextbox, rate);
	}
	public void saveButtonClick() {
		pageutilities.clickOnElement(saveButton);
	}
	

}
