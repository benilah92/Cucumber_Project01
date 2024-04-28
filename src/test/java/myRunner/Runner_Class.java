package myRunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


 @RunWith(Cucumber.class)
 @CucumberOptions(
 
		features="src\\test\\java\\feature\\loginNopcommerce.feature",
		glue="com.demonopcommerce.stepdef",
		//monochrome=true,
		publish=true,
		
		plugin= {"html:HTML_Reports/nopCommerceDemoReport.html",
				"json:JSONReports/nopCommerceDemoJASONReport.json",
				"pretty",
		  	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						
				}
	
		)


public class Runner_Class {
	 
	
		
	
}
