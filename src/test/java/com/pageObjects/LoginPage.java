package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement emailField;
	
	@FindBy(id="Password")
	private WebElement passwordField;
	
	@FindBy(xpath="//div[@class='message-error validation-summary-errors']")
	private WebElement errormsg;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='content-header']")
	private WebElement dashBoard;
	
	@FindBy(xpath="//div[@class='os-content']//following::ul//li[4][@class='nav-item has-treeview']")
	private WebElement customerTag;
	
	@FindBy(xpath="//div[@class='float-right']//a")
	private WebElement addCustomer;
	
	@FindBy(id="Email-error")
	private WebElement emptyEmailErrorMsg;
	
	public WebElement getEmptyEmailErrorMsg() {
		return emptyEmailErrorMsg;
	}

	public WebElement getErrormsg() {
		return errormsg;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	
	public WebElement getAddCustomer() {
		return addCustomer;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public boolean getDashBoard() {
		return dashBoard.isDisplayed();
	}

	public WebElement getCustomerTag() {
		return customerTag;
	}
	
	//(//ul[@class='nav nav-treeview'])[4]//li[1]//i

}
