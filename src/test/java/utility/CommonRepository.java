package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonRepository {

	public static WebDriver initialization() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = null;

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ExtentReport.generateReport(driver, "intialization", "Chrome browser launched", "PASS");

		return driver;
	}

}
