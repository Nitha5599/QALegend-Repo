package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendItemsTest extends BaseClass{
	
	@Test(retryAnalyzer = TestScript.RetryAnalyser.class)
	public void addEventTestcases() throws IOException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageItemsButton();
		itempage.clickOnAddItemButton();
		String itemTitle = ExcelUtility.getStringData(1, 0, "Items")+ FakerUtility.randomNumberGenerator();
		String itemDesription = ExcelUtility.getStringData(1, 1, "Items");
		String itemUnitType = ExcelUtility.getStringData(1, 2, "Items");
		String itemRate = ExcelUtility.getNumericData(1, 3, "Items");
		itempage.addItem(itemTitle, itemDesription, itemUnitType, itemRate);
		Assert.assertEquals(itempage.addItemSaveButtonStatusChecker(), true);
		itempage.saveButtonClick();
	}

}
