package com.automationpractice.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	
	WebDriver driver;	
	
	public  BasePage(WebDriver driver){		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public  BasePage(WebDriver driver, String url ){
		this.driver = driver;
		this.driver.get(url);
		PageFactory.initElements(driver, this);
	}

}
