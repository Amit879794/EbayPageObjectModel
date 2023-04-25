package pages;

import org.openqa.selenium.By;

public class HomePage {
	
	public static String url = "http://www.ebay.com/";
	
	public static By searchBox = By.id("gh-ac");
	public static By searchCategory = By.id("gh-cat");
	public static String searchText = "MacBook";
	public static String computerTabNetworking = "Computers/Tablets & Networking";
	public static By searchButton = By.id("gh-btn");
	
	public static By shopByCategory = By.id("gh-shop-a");
	public static By cellphoneAccessories = By.xpath("//*[contains(text(),'Cell phones & accessories')]");
	

}
