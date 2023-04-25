package testcases;

import org.testng.annotations.Test;

import pages.CellPhoneAcessories;
import pages.CellphoneSmartphone;
import pages.HomePage;
import utility.*;

import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;

public class Scenario1 {

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
	public void navigateToCellPhoneAndAccesories() {
		// click on category
		driver.findElement(HomePage.shopByCategory).click();
		ExtentReport.generateReport(driver, "Shop by category", "Shop by category selected", "PASS");

		// click cell phone and accessories
		driver.findElement(HomePage.cellphoneAccessories).click();
		ExtentReport.generateReport(driver, "Cell phone and accesories", "Cell phone and accessories selected", "PASS");
	}

	@Test(priority = 3)
	public void clickonCellPhoneAndSmartPhone() {
		// click Cell Phones & Smartphones
		driver.findElement(CellPhoneAcessories.cellphoneSmartphone).click();
		ExtentReport.generateReport(driver, "Cell phone and smartphone", "Cell phone and smartphone selected", "PASS");
	}

	@Test(priority = 4)
	public void clickSeeAllUnderShopByBrand() {

		// click on see All
		driver.findElement(CellphoneSmartphone.seeAllShopByCategory).click();
		ExtentReport.generateReport(driver, "see all option", "See All under shop by category selected", "PASS");

	}

	@Test(priority = 5)
	public void apply3Filter() {
		// screen size
		WebElement screenSize = driver.findElement(CellphoneSmartphone.screenSizeFilter);
		Utility.moveToAnElement(driver, screenSize);
		screenSize.click();
		driver.findElement(CellphoneSmartphone.screenSize5inch).click();
		ExtentReport.generateReport(driver, "Screen filter", "Screen size selected", "PASS");

		// price
		WebElement price = driver.findElement(CellphoneSmartphone.priceFilter);
		Utility.moveToAnElement(driver, price);
		price.click();
		driver.findElement(CellphoneSmartphone.minValuePrice).sendKeys(CellphoneSmartphone.minAmount);
		driver.findElement(CellphoneSmartphone.maxValuePrice).sendKeys(CellphoneSmartphone.maxAmount);
		ExtentReport.generateReport(driver, "Price range selected", "Minimum and Maximum value added", "PASS");

		// item location
		WebElement itemLocation = driver.findElement(CellphoneSmartphone.itemLocationFilter);
		Utility.moveToAnElement(driver, itemLocation);
		itemLocation.click();
		driver.findElement(CellphoneSmartphone.itemLocationUS).click();
		ExtentReport.generateReport(driver, "Item Location", "Item location selected", "PASS");

		// CLick Apply
		driver.findElement(CellphoneSmartphone.applyButtonFilter).click();
		ExtentReport.generateReport(driver, "Apply button clicked", "Applu button working", "PASS");
	}

	@Test(priority = 6)
	public void verifyFilterTagsApplied() throws InterruptedException {
		Thread.sleep(5000);
		String label = driver.findElement(CellphoneSmartphone.appliedFilterText).getText();
		assertTrue(label.contains("Inch"));
		assertTrue(label.contains("US"));
		assertTrue(label.contains("$"));

		ExtentReport.generateReport(driver, "Filters applied", "The 3 filters are applied", "PASS");
	}

	@AfterSuite
	public void afterMethod() {
		driver.close();
	}

}
