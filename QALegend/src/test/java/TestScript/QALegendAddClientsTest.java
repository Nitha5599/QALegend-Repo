package TestScript;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendAddClientsTest extends BaseClass {
	
	@Test
	public void addClientsTestcases() throws IOException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomepageClientsButton();
		clientpage.addClientClick();
		String add_cmpyName = ExcelUtility.getStringData(1, 0, "Sheet4");
		String add_address = ExcelUtility.getStringData(1, 1, "Sheet4");
		String add_city = ExcelUtility.getStringData(1, 2, "Sheet4");
		String add_state = ExcelUtility.getStringData(1, 3, "Sheet4");
		String add_zip = ExcelUtility.getStringData(1, 4, "Sheet4");
		clientpage.addClientSaveButton();
	}

}
