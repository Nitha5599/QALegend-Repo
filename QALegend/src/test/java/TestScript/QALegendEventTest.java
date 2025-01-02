package TestScript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendEventTest extends BaseClass{
	
	@Test(groups = {"smoke"},retryAnalyzer = TestScript.RetryAnalyser.class)
	public void addEventTestcase() throws IOException {
		
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageEventButton();
		eventpage.clickOnAddEventButton();
		String eventTitle = ExcelUtility.getStringData(1, 0, "Sheet1")+ FakerUtility.randomNumberGenerator();
		String eventDesription = ExcelUtility.getStringData(1, 1, "Sheet1");
		String eventStartDate = "2024-12-30";
		String eventEndDate = "2025-01-28";
		eventpage.addEvent(eventTitle, eventDesription, eventStartDate, eventEndDate);
		Assert.assertEquals(eventpage.eventPageSaveButtonStatusChecker(), true);
		eventpage.saveButtonClick();
	}

}
