package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YourLogoMyAccount extends BasePage {

	public YourLogoMyAccount(WebDriver driver) {
		super(driver);			
	}

	
	@FindBy(how=How.ID, using="search_query_top")
	public static  WebElement searchBox;

	@FindBy(how=How.XPATH, using="//button[@class='btn btn-default button-search']")
	public static  WebElement searchButton;

	
	public YourLogoSearchPage searchProduct(String searchProduct) {
		searchBox.sendKeys(searchProduct);
		searchButton.click();
		return new YourLogoSearchPage(driver);
	}


	public String getTitle() {
			
		return driver.getTitle();
		
	}
}
