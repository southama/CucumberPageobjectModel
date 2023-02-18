package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchCarsPagelocators {
	
	@FindBy(id="makes")
	public WebElement AnyMakedropdown;
	
	@FindBy(id="models")
	public WebElement AnyModeldropdown;
	
	@FindBy(id="locations")
	public WebElement Anylocationdropdown;
	
	@FindBy(id="priceTo")
	public WebElement pricedropdown;
	
	@FindBy(id="search-submit")
	public WebElement FinMyNextCarButton;

}
