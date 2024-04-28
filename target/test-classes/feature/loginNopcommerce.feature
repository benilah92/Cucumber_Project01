Feature: Nopcommerce login feature 

Background: 

	Given User enters the "https://admin-demo.nopcommerce.com" 

@Valid	
Scenario: Successful Login with the valid credentials 

	Given User is on the login page 
	When User enters the "admin@yourstore.com" and "admin" 
	And User clicks login button 
	Then User should be logged in successfully 

@Invalid	
Scenario Outline: Unsuccessful Login with invalid credentials 

	Given User enters invalid "<emailId>" and "<password>" 
	When User clicks login button 
	Then User should see an error message "<error msg>" 
	Then User should also see an error messegafoe empty feilds
	
	Examples: 
	
		|emailId            |password           |error msg|
		|abcefg@gmail.com   |admin              |Login was unsuccessful. Please correct the errors and try again.|
		|admin@yourstore.com|123456             |Login was unsuccessful. Please correct the errors and try again.|
		
		
		
		
