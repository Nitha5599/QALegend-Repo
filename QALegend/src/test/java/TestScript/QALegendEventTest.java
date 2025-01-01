package TestScript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendEventTest extends BaseClass{
	
	@Test(groups = {"smoke"})
	public void addEventTestcase() throws IOException {
		
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageEventButton();
		eventpage.clickOnAddEventButton();
		String eventTitle = ExcelUtility.getStringData(1, 0, "Sheet1")+ FakerUtility.randomNumberGenerator();
		String eventDesription = ExcelUtility.getStringData(1, 1, "Sheet1");
		
		eventpage.addEvent(eventTitle, eventDesription);
		Assert.assertEquals(eventpage.eventPageSaveButtonStatusChecker(), true);
		
	}

}
