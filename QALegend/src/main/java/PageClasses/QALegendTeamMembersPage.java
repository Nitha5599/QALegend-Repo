package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import Utilities.WaitUtility;

public class QALegendTeamMembersPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	public WaitUtility waitUtility;
	@FindBy(xpath = "(//a[@class='btn btn-default'])[2]")
	WebElement addmemberButton;
	@FindBy(id = "first_name")
	WebElement firstnameTextbox;
	@FindBy(id = "last_name")
	WebElement lastnameTextbox;
	@FindBy(id = "address")
	WebElement mailingAddressTextbox;
	@FindBy(id = "phone")
	WebElement phoneTextbox;
	@FindBy(id = "gender_female")
	WebElement genderfemaleRadioButton;
	@FindBy(id = "form-next")
	WebElement nextButton;
	@FindBy(id = "job_title")
	WebElement jobTitleTextbox;
	@FindBy(id = "date_of_hire")
	WebElement dateOfhireBox;
	@FindBy(id = "form-next")
	WebElement nextButton2;
	@FindBy(id = "email")
	WebElement emailTextbox;
	@FindBy(id = "password")
	WebElement passwordTextbox;
	@FindBy(id = "select2-chosen-10")
	WebElement roleDropDown;
	@FindBy(id = "form-submit")
	WebElement formSubmitButton;
	
	
	
	
	
	
	
	
	public QALegendTeamMembersPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddMemberButton() {
		pageutilities.clickOnElement(addmemberButton);
	}
	
	public void addMemberdetails_GeneralInfo(String firstname, String lastname, String mail_address, String phone) {
		pageutilities.enterText(firstnameTextbox,firstname);
		pageutilities.enterText(lastnameTextbox, lastname);
		pageutilities.enterText(mailingAddressTextbox, mail_address);
		pageutilities.enterText(phoneTextbox, phone);
		pageutilities.selectRadioButton(genderfemaleRadioButton);
		nextButton.click();
	}
	
	public void addMemberdetails_JobInfo(String jobTitle) {
		pageutilities.enterText(jobTitleTextbox, jobTitle);
		dateOfhireBox.sendKeys("2024-12-27");
		nextButton2.click();
	}
	
	public void addMemberdetails_AccountSettings(String email, String password) throws InterruptedException {
		pageutilities.clickUsingJavaScriptMethod(emailTextbox);
		
		pageutilities.enterText(emailTextbox, email);
		pageutilities.enterText(passwordTextbox, password);
		pageutilities.selectByIndex(roleDropDown, 2);
	}
	
	public void clickOnsubmitButton() {
		formSubmitButton.click();
	}
	
	

}
