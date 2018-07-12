package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YourLogoHomePage extends BasePage{

	public YourLogoHomePage(WebDriver driver) {
		super(driver);
		
		
	}
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	public static WebElement sign_in;	
	
	public YourLogoLoginPage navigateToLoginInPage() {
		sign_in.click();
		return new YourLogoLoginPage(driver) ;
		
	}

}
