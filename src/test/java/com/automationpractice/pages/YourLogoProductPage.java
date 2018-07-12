package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YourLogoProductPage extends BasePage {

	public YourLogoProductPage(WebDriver driver) {
		super(driver);	
		
	}
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Add to cart')]")
	public static WebElement addToCart;
	
	@FindBy(how=How.XPATH, using=".//a[contains(@title,'Proceed to checkout')]")
	public static WebElement proceedToCheckOut;
	
	
	
	
	//a[@class='btn btn-default button button-medium']//span

}
