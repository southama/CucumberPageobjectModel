package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsHomepageLocators {
	
	@FindBy(linkText="buy + sell")
	public WebElement buysellmenu;
	
	@FindBy(linkText="reviews")
	public WebElement reviewsmenu;
	
	@FindBy(linkText="Search Cars")
	public WebElement Searchcarslink;
	
	@FindBy(linkText="Used")
	public WebElement Usedcarslink;
	
	@FindBy(linkText="news")
	public WebElement newsmenu;
	

}
