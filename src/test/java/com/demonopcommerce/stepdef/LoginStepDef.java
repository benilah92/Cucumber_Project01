package com.demonopcommerce.stepdef;

import org.testng.Assert;

import com.pomanager.PageObjectManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nopcommerce.baseClass.BaseClass;

public class LoginStepDef extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Before
	public void beforeHooks() {
		getDriver("chrome");
	}

	@Given("User enters the {string}")
	public void user_enters_the(String url) {
		launchUrl(driver, url);
	}

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Your store. Login");

	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String email, String pass) {
		deleteInput(driver, pom.getLoginPage().getEmailField());
		passInput(driver, pom.getLoginPage().getEmailField(), email);
		deleteInput(driver, pom.getLoginPage().getPasswordField());
		passInput(driver, pom.getLoginPage().getPasswordField(), pass);
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {

		clickOnElement(driver, pom.getLoginPage().getLoginBtn());

	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {

		String title = driver.getTitle();
		Assert.assertEquals(title, "Dashboard / nopCommerce administration");
	}
	
	@Given("User enters invalid {string} and {string}")
	public void user_enters_invalid_and(String email, String password) {
		deleteInput(driver, pom.getLoginPage().getEmailField());
		passInput(driver, pom.getLoginPage().getEmailField(), email);
		deleteInput(driver, pom.getLoginPage().getPasswordField());
		passInput(driver, pom.getLoginPage().getPasswordField(), password);
		
		
	}
	@Then("User should see an error message {string}")
	public void user_should_see_an_error_message(String string) {
//		String str = pom.getLoginPage().getErrormsg().getText();
//		System.out.println(str);
		
	   Assert.assertTrue(pom.getLoginPage().getErrormsg().isDisplayed());
	}
	
	@Then("User should also see an error messegafoe empty feilds")
	public void user_should_also_see_an_error_messegafoe_empty_feilds() {
	    Assert.assertTrue(pom.getLoginPage().getEmptyEmailErrorMsg().isDisplayed());
	}


	@After
	public void afterHooks() {
		screenShot(driver, "login");
		//driver.close();

	}

}
