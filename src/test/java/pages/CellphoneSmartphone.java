package pages;

import org.openqa.selenium.By;

public class CellphoneSmartphone {

	public static By seeAllShopByCategory = By
			.xpath("//button[@data-marko='{\"onclick\":\"handleSeeAllBtn s0-27-9-0-1[0]-0-1[0]-0 false\"}']");
	public static By screenSizeFilter = By.xpath("//div[@id='c3-mainPanel-Screen%20Size']");
	public static By priceFilter = By.xpath("//div[@id='c3-mainPanel-price']");
	public static By itemLocationFilter = By.xpath("//div[@id='c3-mainPanel-location']");

	public static By screenSize5inch = By.xpath("//span[contains(text(),'5.5 - 5.9 in')]");
	public static By minValuePrice = By.xpath("//input[@aria-label='Minimum Value, US Dollar']");
	public static By maxValuePrice = By.xpath("//input[@aria-label='Maximum Value, US Dollar']");
	public static String minAmount = "0";
	public static String maxAmount = "1000";

	public static By itemLocationUS = By.xpath("//input[@value='US Only']");
	public static By applyButtonFilter = By.xpath("//button[@aria-label='Apply']");

	public static By appliedFilterText = By.xpath("//h1[@class='b-pageheader']//span[@class='b-pageheader__text']");

}
