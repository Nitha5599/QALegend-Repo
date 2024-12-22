package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;
import Utilities.ExcelUtility;

public class QALegendMessagesTest extends BaseClass{
	
	@Test
	public void sendMessageTestcases() throws IOException, InterruptedException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageMessagesButton();
		messagepage.clickOnComposeButton();
		String to_msg = ExcelUtility.getStringData(1, 0, "Messages");
		String subject = ExcelUtility.getStringData(1, 1, "Messages");
		String message = ExcelUtility.getStringData(1, 2, "Messages");
		messagepage.messageDetails(to_msg, subject, to_msg);
		messagepage.sendButtonClick();
	}

}
