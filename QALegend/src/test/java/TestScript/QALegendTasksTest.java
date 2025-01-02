package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.ExcelUtility;

public class QALegendTasksTest extends BaseClass{
	
	@Test(groups = {"Sanity"},retryAnalyzer = TestScript.RetryAnalyser.class)
	public void addTasksTestcase() throws IOException, InterruptedException {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageProjectsDropDownButton();
		homepage.clickOnHomePageTasksButton();
		taskspage.clickOnAddTaskButton();
		String taskTitle = ExcelUtility.getStringData(1, 0, "Tasks");
		String taskDesc = ExcelUtility.getStringData(1, 1, "Tasks");
		String taskProject = ExcelUtility.getStringData(1, 2, "Tasks");
		taskspage.addTask(taskTitle, taskDesc, taskProject);
		Assert.assertEquals(taskspage.addTaskSaveButtonStatusChecker(), true);
		taskspage.saveClick();
		
	}
		

}
