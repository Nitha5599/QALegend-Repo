package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendMessagesTest extends BaseClass{
	
	@Test
	public void sendMessageTestcases() throws IOException, InterruptedException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageMessagesButton();
		
		String Tomailid =ExcelUtility.getStringData(1, 0, "Messages");
		String subject=ExcelUtility.getStringData(1, 1, "Messages")+FakerUtility.randomNumberGenerator();
		String message=ExcelUtility.getStringData(1, 2, "Messages");
		messagepage.addMessage(Tomailid, subject, message);
		messagepage.getMessageOnSentItems(subject);
		String msg=messagepage.getMessageAdded();
		Assert.assertEquals(msg, message);
		
	}

}
