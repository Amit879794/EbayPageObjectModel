package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.MacBookComputerTabNetwork;
import utility.CommonRepository;
import utility.ExtentReport;

import org.testng.annotations.BeforeSuite;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;

public class Scenario2 {

	WebDriver driver;

	@BeforeSuite
	public void beforeMethod() {
		driver = CommonRepository.initialization();
	}

	@Test(priority = 1)
	public void launchApplication() {
		driver.get(HomePage.url);
		ExtentReport.generateReport(driver, "application launched", "URL working", "PASS");
	}

	@Test(priority = 2)
	public void typeSearchString() {
		driver.findElement(HomePage.searchBox).sendKeys(HomePage.searchText);
		ExtentReport.generateReport(driver, HomePage.searchText, "Text typed inside search box", "PASS");
	}

	@Test(priority = 3)
	public void searchCategoryAndSearch() {
		// change category to computer/tablet & networking
		Select objSelect = new Select(driver.findElement(HomePage.searchCategory));
		objSelect.selectByVisibleText(HomePage.computerTabNetworking);
		driver.findElement(HomePage.searchButton).click();
		ExtentReport.generateReport(driver, HomePage.computerTabNetworking, "Category selected in search", "PASS");
	}
	
	@Test(priority = 4)
	public void verifyPageLoadAndSearchString() {
		String macbookTextVerify = driver.findElements(MacBookComputerTabNetwork.macbookItemVerify).get(1).getText();
		assertTrue(macbookTextVerify.contains(HomePage.searchText));
		ExtentReport.generateReport(driver, "Search successfull", HomePage.searchText, "PASS");
	}
	

	@AfterSuite
	public void afterSuite() {
		driver.close();
	}

}
