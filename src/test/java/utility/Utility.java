package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility {
	
	public static void moveToAnElement(WebDriver driver, WebElement el) {
		Actions actions = new Actions(driver);
		actions.moveToElement(el);
		actions.release().perform();
	}

}
