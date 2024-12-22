package TestScript;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendNoteTest extends BaseClass{
	
	@Test
	public void addNotesTestcases() throws IOException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomepageNotesButton();
		String notesTitle = ExcelUtility.getStringData(1, 0, "Sheet2")+ FakerUtility.randomNumberGenerator();
		String notesDesription = ExcelUtility.getStringData(1, 1, "Sheet2");
		notespage.addNotes(notesTitle, notesDesription);
		
	}
	

}
