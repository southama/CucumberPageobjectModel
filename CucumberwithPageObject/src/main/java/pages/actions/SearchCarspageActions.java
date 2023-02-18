package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.SearchCarsPagelocators;
import utils.SeleniumDriver;

public class SearchCarspageActions {

	SearchCarsPagelocators searchCarsPagelocators = null;

	public SearchCarspageActions() {

		this.searchCarsPagelocators = new SearchCarsPagelocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchCarsPagelocators);

	}

	public void selectcarmaker(String carBrand) {
		Select select = new Select(searchCarsPagelocators.AnyMakedropdown);
		select.selectByVisibleText(carBrand);
	}

	public void selectcarModel(String carModel) {
		Select select = new Select(searchCarsPagelocators.AnyModeldropdown);
		select.selectByVisibleText(carModel);
	}

	public void selectLocation(String location) {
		Select select = new Select(searchCarsPagelocators.Anylocationdropdown);
		select.selectByVisibleText(location);
	}

	public void selectcarPrice(String price) {
		Select select = new Select(searchCarsPagelocators.pricedropdown);
		select.selectByVisibleText(price);
	}

	public void clickOnFindMyNextCarButton() {
		searchCarsPagelocators.FinMyNextCarButton.click();
	}

}
