package Utilities;

import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities {
	private WebDriver driver;
	public PageUtilities(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}
	public void clearTextBox(WebElement textbox) {
		textbox.clear();
	}
	public String readAttribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public void selectByIndex(WebElement dropdown, int index) {
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
	public void selectByVisibleText(WebElement dropdown, String text) {
		Select select = new Select(dropdown);
		select.selectByVisibleText(text);
	}
	public void selectByValue(WebElement dropdown, String value) {
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
	
	public void dragAndDrop(WebElement source, WebElement destination) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
	}
	
	public void mouseHover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void keyPress() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.build().perform();
	}
	
	public void rightClick() {
		Actions action = new Actions(driver);
		action.contextClick().build().perform();
	}
	public void rightClickOnElement(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
	}
	
	public void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void clickUsingJavaScriptMethod(WebElement element) {
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].click();",element);
	}
	public void scroll() {
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,1000)");

	}
	public void scrollToElement(WebElement element) {
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	public boolean isElementEnabled(WebElement element) {
		try {
            return element.isEnabled();
        } catch (NoSuchElementException e) {
            return false;
        }
	}
	public boolean isElementDisplayed(WebElement element) {
		try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
	}
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	public void selectRadioButton(WebElement radioButton) {
		radioButton.click();
	}
	public void selectCheckbox(WebElement checkbox) {
		checkbox.click();
	}
	public void navigateToPage(String page) {
		driver.navigate().to(page);
	}
	public void refreshPage() {
		driver.navigate().refresh();
	}
	public void backPage() {
		driver.navigate().back();
	}
	public void forwardPage() {
		driver.navigate().forward();
	}
	

}
