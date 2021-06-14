package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignInPage  {
	private By signInLocator = By.xpath("//a[normalize-space()='Sign In']");
	private By usernameLocator = By.id("email");
	private By loginLocator=By.id("send2");
	private By passwordLocator = By.id("password");
	private By errorLocator=By.id("email-error");
	private By passError=By.id("password-error");
	private By createLocator=By.xpath("//span[contains(text(),'Create an Account')]");
	

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
		return driver.findElement(errorLocator).getText();
		
	}
	public void create( )
	{
		driver.findElement(createLocator).click();
		
	}
	
	public void sendPassword(String password)
	{
		driver.findElement(passwordLocator).sendKeys(password);
		
	}



	//geterrorpassword()	
		public String getErrorPassword()
		{
			return driver.findElement(passError).getText();
		}
		

		
		

}
