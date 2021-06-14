package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignInPage {
	private By signInLocator = By.xpath("//a[normalize-space()='Sign In']");
	private By usernameLocator = By.name("username");
	private By loginLocator=By.xpath("//button[@type='submit']");
	private By passwordLocator = By.id("login-password");
	private By errorLocator=By.id("customer-email-error");
	private By passError=By.xpath("//div[@role='alert']");
	
	

	private WebDriver driver;
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void signIn() 
	{
		driver.findElement(signInLocator).click();
	}
	public void sendUsername(String username)
	{
		driver.findElement(usernameLocator).sendKeys(username);
		
	}
	public void clickOnLogin()
	{
		
		driver.findElement(loginLocator).click();
	}
	//getErrorMessage()
	public String getErrorMessage()
	{
		return driver.findElement(errorLocator).getText().trim();
		
	}
	
	
	public void sendPassword(String password)
	{
		driver.findElement(passwordLocator).sendKeys(password);
		
	}



	//geterrorpassword()	
		public String getErrorPassword()
		{
			return driver.findElement(passError).getText().trim();
		}
		

		
		

}
