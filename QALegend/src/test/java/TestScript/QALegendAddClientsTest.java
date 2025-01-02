package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendAddClientsTest extends BaseClass {
	
	@Test(groups = {"smoke"},retryAnalyzer = TestScript.RetryAnalyser.class)
	public void addClientsTestcases() throws IOException, InterruptedException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomepageClientsButton();
		clientpage.addClientClick();
		String add_cmpyName = ExcelUtility.getStringData(1, 0, "Clients")+ FakerUtility.randomNumberGenerator();
		String add_address = ExcelUtility.getStringData(1, 1, "Clients");
		String add_city = ExcelUtility.getStringData(1, 2, "Clients");
		String add_state = ExcelUtility.getStringData(1, 3, "Clients");
		String add_zip = ExcelUtility.getNumericData(1, 4, "Clients");
		clientpage.addClientDetails(add_cmpyName, add_address, add_city, add_state, add_zip);
		Assert.assertEquals(clientpage.addClientSaveButtonStatusChecker(), true);
		clientpage.addClientSaveButton();		
	}

}
