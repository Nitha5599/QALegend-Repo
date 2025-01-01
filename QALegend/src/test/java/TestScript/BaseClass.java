package TestScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Constants.ConstantValues;
import PageClasses.QALegendAddClientsPage;
import PageClasses.QALegendAllProjectsPage;
import PageClasses.QALegendEditItemsPage;
import PageClasses.QALegendEditNotePage;
import PageClasses.QALegendEventPage;
import PageClasses.QALegendHomePage;
import PageClasses.QALegendItemsPage;
import PageClasses.QALegendLoginPage;
import PageClasses.QALegendMessagesPage;
import PageClasses.QALegendNotesPage;
import PageClasses.QALegendTasksPage;
import PageClasses.QALegendTeamMembersPage;
import Utilities.ScreenshotUtility;

public class BaseClass {
	public WebDriver driver;
	QALegendLoginPage loginpage;
	QALegendHomePage homepage;
	QALegendEventPage eventpage;
	QALegendNotesPage notespage;
	QALegendEditNotePage editnotepage;
	QALegendAddClientsPage clientpage;
	QALegendTeamMembersPage teammemberpage;
	QALegendItemsPage itempage;
	QALegendEditItemsPage edititempage;
	QALegendMessagesPage messagepage;
	QALegendAllProjectsPage projectpage;
	QALegendTasksPage taskspage;
	public Properties prop;
	public FileInputStream fis;
	
	@BeforeMethod(alwaysRun = true, groups = {"smoke","Sanity","Regression"})
	@Parameters({"browser"})
	public void browserInitialization(@Optional("chrome") String browserName) throws Exception {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("Invalid name Exception");
		}
		prop = new Properties();
		fis = new FileInputStream(ConstantValues.USERDATAFILE);
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage = new QALegendLoginPage(driver);
		homepage = new QALegendHomePage(driver);
		eventpage = new QALegendEventPage(driver);
		notespage = new QALegendNotesPage(driver);
		editnotepage = new QALegendEditNotePage(driver);
		clientpage = new QALegendAddClientsPage(driver);
		teammemberpage = new QALegendTeamMembersPage(driver);
		itempage = new QALegendItemsPage(driver);
		edititempage = new QALegendEditItemsPage(driver);
		messagepage = new QALegendMessagesPage(driver);
		projectpage = new QALegendAllProjectsPage(driver);
		taskspage = new QALegendTasksPage(driver);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult itResult) throws IOException {
		if(itResult.getStatus()==ITestResult.FAILURE) {
			ScreenshotUtility sc = new ScreenshotUtility();
			sc.captureFailureScreenshot(driver, itResult.getName());
		}
		if(driver!=null) {
			//driver.quit();
		}
	}

}
