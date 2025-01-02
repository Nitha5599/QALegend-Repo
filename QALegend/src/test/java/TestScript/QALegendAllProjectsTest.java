package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.ExcelUtility;
import Utilities.FakerUtility;


public class QALegendAllProjectsTest extends BaseClass{
	
	
	@Test(retryAnalyzer = TestScript.RetryAnalyser.class)
	public void addAllProjectsTestcase() throws IOException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageProjectsDropDownButton();
		homepage.clickOnHomePageAllProjectsButton();
		projectpage.clickOnAddProjectButton();
		String projectTitle = ExcelUtility.getStringData(1, 0, "AllProjects")+ FakerUtility.randomNumberGenerator();
		projectpage.addProjectTitle(projectTitle);
		/*
		 * String projectClient = ExcelUtility.getStringData(1, 1, "AllProjects");
		 * projectpage.addProjectClient(projectClient);
		 */
		String projectDesription = ExcelUtility.getStringData(1, 2, "AllProjects");
		String projectStartDate = prop.getProperty("projectStartDate");
		String projectEndDate = prop.getProperty("projectEndDate");
		String projectPrice = ExcelUtility.getNumericData(1, 3, "AllProjects");
		projectpage.addDesc(projectDesription, projectPrice, projectStartDate, projectEndDate);
		Assert.assertEquals(projectpage.addProjectsSaveButtonStatusChecker(), true);
		projectpage.saveButtonClick();
	}

}
