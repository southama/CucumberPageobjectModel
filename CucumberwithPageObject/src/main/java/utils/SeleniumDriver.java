package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	
	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT =30;
	public final static int PAGE_LOAD_TIMEOUT =50;
	
	
	private SeleniumDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
	}
	
	public static void openpage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setupDriver() {
		if(seleniumDriver==null)
			seleniumDriver =new SeleniumDriver();
	}
	
	public static void tearDown() {
	   if(driver!=null) {
		   driver.close();
		   driver.quit();
	   }
	   seleniumDriver =null;
	}
	
	public static void wairForPagetoLoad() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
