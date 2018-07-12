package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YourLogoSearchPage extends BasePage {

	public YourLogoSearchPage(WebDriver driver) {
		super(driver);			
	}


	@FindBy(how=How.ID, using="search_query_top")
	public static  WebElement searchBox;

	@FindBy(how=How.XPATH, using="//button[@class='btn btn-default button-search']")
	public static  WebElement searchButton;

	@FindBy(how=How.XPATH, using="//h5[@itemprop='name']//a[@class='product-name'][contains(text(),'Faded Short Sleeve T-shirts')]")
	public static  WebElement fadedShortSleveTShirt;

	
	

	public void searchProduct(String searchProduct) {
		searchBox.sendKeys(searchProduct);
		searchButton.click();
	}



	public YourLogoProductPage selectProduct(String productDescription) {

		switch (productDescription) {

		case "Faded Short Sleeve T-shirts":

			fadedShortSleveTShirt.click();
			break;

		default:
			break;
		}
		
		return new YourLogoProductPage(driver);



	}

}
