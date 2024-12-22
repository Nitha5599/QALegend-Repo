package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;

public class QALegendEditItemsTest extends BaseClass{
	
	@Test
	public void editItemTestcases() throws IOException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageItemsButton();
		
		String searchTitle = ExcelUtility.getStringData(1, 0, "Edit_Item");
		edititempage.searchItem(searchTitle);
		String editTitle = ExcelUtility.getStringData(1, 1, "Edit_Item");
		String editDesription = ExcelUtility.getStringData(1, 2, "Edit_Item");
		String editUnitType = ExcelUtility.getStringData(1, 3, "Edit_Item");
		String editRate = ExcelUtility.getNumericData(1, 4, "Edit_Item");
		
		edititempage.editItemClick();
		edititempage.editItem(editTitle, editDesription, editUnitType, editRate);
		edititempage.editsaveButtonClick();
		
	}
	

}
