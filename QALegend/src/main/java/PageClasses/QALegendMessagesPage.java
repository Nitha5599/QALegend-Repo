package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendMessagesPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "(//a[@class='list-group-item'])[1]")
	WebElement composeButton;
	@FindBy(xpath = "//div[@class='select2-container select2 validate-hidden']")
	WebElement to_dropdown;
	@FindBy(xpath = "(//input[@class='select2-input'])[3]")
	WebElement select_name;
	@FindBy(id = "subject")
	WebElement subjectTextbox;
	@FindBy(id = "message")
	WebElement messageTextbox;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement sendButton;
	
	
	
	
	
	
	public QALegendMessagesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnComposeButton() {
		pageutilities.clickOnElement(composeButton);
		
	}
	
	public void messageDetails(String to, String sub, String msg) throws InterruptedException {
		//Thread.sleep(2000);
		//pageutilities.selectByVisibleText(to_dropdown, to);
		pageutilities.clickOnElement(to_dropdown);
		//pageutilities.selectByValue(select_ancy, to);
		//pageutilities.enterText(select_name, to);
		select_name.sendKeys(to);
		//pageutilities.clickOnElement(select_name);
		pageutilities.enterText(subjectTextbox, sub);
		pageutilities.enterText(messageTextbox, msg);
	}
	
	public void sendButtonClick() {
		sendButton.click();
	}

}
