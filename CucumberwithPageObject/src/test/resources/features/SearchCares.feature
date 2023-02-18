@Search-Cars
Feature: Validate the Search Cars page is working.
					In Order to validate the Search cars page is working performing Acceptace Testing.
					
					
Scenario: Validate the Search Cars Page
Given I am on the Home Page "https://www.carsguide.com.au/" of CarsGuide Website
When I move to CarsGuide Menu
	|Menu      | 
	|buy + sell|
	|reviews   |
And Click on "Search Cars"link
And Select Carbrand as "BMW" from AnyMake dropdown
And Select CarModel as "1 Series" from AnyModel dropdown
And Select location as "NSW - Central Coast" from AnyLocation dropdown
And Select price as "$1,000" from price dropdown
And Click on Find_My_Next_Car button
Then Searched cars should be displayed
And the page title should be "Bmw 1 Series Under 1000 for Sale Central Coast NSW | carsguide"


