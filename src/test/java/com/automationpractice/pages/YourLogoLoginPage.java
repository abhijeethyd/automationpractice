package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YourLogoLoginPage extends BasePage {

	public YourLogoLoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.ID, using="email")
	public static WebElement email;
	
	@FindBy(how=How.ID, using="passwd")
	public static WebElement password;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	public static WebElement signin_button;

	public YourLogoMyAccount logInWithValidUserIntoMyAccount() {
		// TODO Auto-generated method stub
		
		
		email.sendKeys("trainee@lps.co.nz");
		password.sendKeys("password01");
		signin_button.click();
		return new YourLogoMyAccount(driver);
		
		
	}


}
