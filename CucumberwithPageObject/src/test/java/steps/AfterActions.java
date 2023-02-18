package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterActions {
	
	@After
	public static void tearDown(Scenario scenario) {
		
		WebDriver driver = SeleniumDriver.getDriver();
		if(scenario.isFailed()) {
			byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "FailedScreen");
		}
		SeleniumDriver.tearDown();
		
	}

}
