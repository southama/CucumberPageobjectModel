package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},glue= {"steps"},
plugin={"html:target/cucumber-html-report/cucumber.html",
			"json:target/cucumber-reports/cucumber.json",
			"junit:target/cucumber-reports/cucumber.xml",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class RunCuke  extends AbstractTestNGCucumberTests{
	
	

}
