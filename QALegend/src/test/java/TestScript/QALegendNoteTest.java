package TestScript;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;
import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendNoteTest extends BaseClass{
	
	@Test
	public void addNotesTestcases() throws IOException, AWTException, InterruptedException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomepageNotesButton();
		String notesTitle = ExcelUtility.getStringData(1, 0, "Sheet2")+ FakerUtility.randomNumberGenerator();
		String notesDesription = ExcelUtility.getStringData(1, 1, "Sheet2");
		String path = System.getProperty("user.dir")+prop.getProperty("uploadfilepath");
		System.out.println(path);
		notespage.addNotes(notesTitle, notesDesription, path);
		notespage.saveButtonClick();
	}
}
