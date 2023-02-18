package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsHomepageActions;
import pages.actions.SearchCarspageActions;
import utils.SeleniumDriver;

public class SeachCarsSteps {
	
	
	CarsHomepageActions carsHomepageActions = new CarsHomepageActions();
	SearchCarspageActions searchCarspageActions = new SearchCarspageActions();
	
	@Given("I am on the Home Page {string} of CarsGuide Website")
	public void i_am_on_the_home_page_of_cars_guide_website(String websiteURL) {
	    SeleniumDriver.openpage(websiteURL);
	}

	@When("I move to CarsGuide Menu")
	public void i_move_to_cars_guide_menu(List<String> list) {
	    String menu =list.get(1);
	    System.out.println("Move to "+menu);
	    carsHomepageActions.moveToBuySellMenu();
	
	}

	@And("Click on \"Search Cars\"link")
	public void click_on_search_cars_link() {
		carsHomepageActions.clickonSearchCarsMenu();
	}

	@And("Select Carbrand as {string} from AnyMake dropdown")
	public void select_carbrand_as_from_any_make_dropdown(String carBrand) {
		searchCarspageActions.selectcarmaker(carBrand);
	}

	@And("Select CarModel as {string} from AnyModel dropdown")
	public void select_car_model_as_from_any_model_dropdown(String carModel) {
		searchCarspageActions.selectcarModel(carModel);

	}

	@And("Select location as {string} from AnyLocation dropdown")
	public void select_location_as_from_any_location_dropdown(String location) {
		searchCarspageActions.selectLocation(location);
	}

	@And("Select price as {string} from price dropdown")
	public void select_price_as_from_price_dropdown(String price) {
		searchCarspageActions.selectcarPrice(price);
	}

	@And("Click on Find_My_Next_Car button")
	public void click_on_find_my_next_car_button() {
		searchCarspageActions.clickOnFindMyNextCarButton();
	}

	@Then("Searched cars should be displayed")
	public void searched_cars_should_be_displayed() {
	    System.out.println("List of cars should displaye");
	}

	@And("the page title should be {string}")
	public void the_page_title_should_be(String expectedtitle) {
		
		String  Actualtitle =SeleniumDriver.getDriver().getTitle();
		System.out.println("Actual title "+Actualtitle);
		Assert.assertEquals(expectedtitle, Actualtitle);
	    
	}

}
