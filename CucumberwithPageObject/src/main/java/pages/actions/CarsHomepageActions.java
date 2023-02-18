package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsHomepageLocators;
import utils.SeleniumDriver;

public class CarsHomepageActions {

	CarsHomepageLocators carsHomepageLocators = null;

	public CarsHomepageActions() {
		this.carsHomepageLocators = new CarsHomepageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsHomepageLocators);

	}

	public void moveToBuySellMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsHomepageLocators.buysellmenu).perform();
	}

	public void clickonSearchCarsMenu() {

		carsHomepageLocators.Searchcarslink.click();
	}

	public void clickonUsedCarsMenu() {

		carsHomepageLocators.Usedcarslink.click();
	}

	public void moveToreviewsMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsHomepageLocators.reviewsmenu).perform();
	}

}
