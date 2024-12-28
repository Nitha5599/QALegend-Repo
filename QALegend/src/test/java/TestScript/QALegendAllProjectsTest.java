package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;
import Utilities.ExcelUtility;


public class QALegendAllProjectsTest extends BaseClass{
	
	
	@Test
	public void addAllProjectsTestcase() throws IOException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageProjectsDropDownButton();
		homepage.clickOnHomePageAllProjectsButton();
		projectpage.clickOnAddProjectButton();
		String projectTitle = ExcelUtility.getStringData(1, 0, "AllProjects");
		projectpage.addProjectTitle(projectTitle);
		String projectClientValue = ExcelUtility.getStringData(1, 1, "AllProjects");
		//projectpage.addClientDropDown(projectClientValue);
		
		String projectDesription = ExcelUtility.getStringData(1, 2, "AllProjects");
		String projectPrice = ExcelUtility.getStringData(1, 2, "AllProjects");
		projectpage.addDesc(projectDesription, projectPrice);
		projectpage.saveButtonClick();
	}

}
