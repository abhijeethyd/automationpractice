package com.automationpractice.stepdefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;
import com.automationpractice.pages.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class LetsGoShopping {
	
	WebDriver driver = Hooks.driver;
	private YourLogoHomePage yourLogoHomePage ;
	private YourLogoLoginPage yourLogoLoginPage;
	private YourLogoMyAccount yourLogoMyAccount;
	private YourLogoSearchPage  yourLogoSearchPage;
	private YourLogoProductPage fadedShortSleveTshirt;
	
	@Given("^user is logged on to 'Your Logo' website$")
	public void user_is_logged_on_to_Your_Logo_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   	driver.get("http://automationpractice.com/index.php");	
	   	yourLogoHomePage = new YourLogoHomePage(driver);
	   	yourLogoLoginPage = yourLogoHomePage.navigateToLoginInPage();
	   	yourLogoMyAccount = yourLogoLoginPage.logInWithValidUserIntoMyAccount();
		assertThat(  yourLogoMyAccount.getTitle() , is(equalTo("My account - My Store")));	
		
	}
	
	
	@When("^the user searches for '(.*)'$")
	public void the_user_searches_for_a_product(String searchProduct) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		yourLogoSearchPage = yourLogoMyAccount.searchProduct(searchProduct);
		
				
	}
	
	@When("^selects '(.*)'$")
	public void selects_a_Product_Based_On_Description(String productDescription) throws Throwable {
	    
		fadedShortSleveTshirt = yourLogoSearchPage.selectProduct(productDescription);
		
		
	}
	

	@When("^completes the payment process$")
	public void completes_the_payment_process() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		YourLogoProductPage.addToCart.click();
		Thread.sleep(2000L);
		YourLogoProductPage.proceedToCheckOut.click();
		
	}
	
	

}
