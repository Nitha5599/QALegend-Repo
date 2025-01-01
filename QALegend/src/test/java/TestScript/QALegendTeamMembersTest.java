package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.ExcelUtility;
import Utilities.FakerUtility;
import Utilities.WaitUtility;

public class QALegendTeamMembersTest extends BaseClass{
	
	@Test
	public void addTeamMemberTestcases() throws IOException, InterruptedException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageTeamMembersButton();
		teammemberpage.clickOnAddMemberButton();
		String team_member_firstname = ExcelUtility.getStringData(1, 0, "Sheet5");
		String team_member_lastname = ExcelUtility.getStringData(1, 1, "Sheet5");
		String team_member_mailing_address = ExcelUtility.getStringData(1, 2, "Sheet5");
		String team_member_phone = ExcelUtility.getNumericData(1, 3, "Sheet5");
		teammemberpage.addMemberdetails_GeneralInfo(team_member_firstname, team_member_lastname, team_member_mailing_address, team_member_phone);
		String team_member_jobInfo = ExcelUtility.getStringData(1, 4, "Sheet5");
		teammemberpage.addMemberdetails_JobInfo(team_member_jobInfo);
		String team_member_email = ExcelUtility.getStringData(1, 5, "Sheet5");
		String team_member_password = ExcelUtility.getStringData(1, 6, "Sheet5");
		teammemberpage.addMemberdetails_AccountSettings(team_member_email, team_member_password);
		Assert.assertEquals(teammemberpage.addTeamMemberSaveButtonStatusChecker(), true);
		teammemberpage.clickOnsubmitButton();
	}

}
