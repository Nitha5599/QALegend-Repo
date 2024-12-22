package TestScript;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendEditNoteTest extends BaseClass{
	
	@Test
	public void editNoteTestcases() throws IOException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomepageNotesButton();
		String searchTitle = ExcelUtility.getStringData(1, 0, "Sheet3");
		String editTitle = ExcelUtility.getStringData(1, 1, "Sheet3")+ FakerUtility.randomNumberGenerator();
		String editDesription = ExcelUtility.getStringData(1, 2, "Sheet3");
		editnotepage.searchNote(searchTitle);
		editnotepage.editNoteClick();
		editnotepage.editNote(editTitle, editDesription);
		
		
	}

}
