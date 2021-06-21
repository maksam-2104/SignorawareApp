package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverwrapper;
import com.cyient.page.HomePage;
import com.cyient.page.SignInPage;
import com.cyient.utilities.DataProviderUtilities;




public class LoginTest extends WebDriverwrapper {
	
			
	@Test(dataProvider = "Sheet1" , dataProviderClass = DataProviderUtilities.class)
	public void navigationTest(String expectedValue) throws InterruptedException{

		
		
		
		HomePage hp=new HomePage(driver);
		
		
		hp.product();
		Thread.sleep(2000);
		hp.flasks();
		Thread.sleep(2000);
		hp.sortBy();
		Thread.sleep(2000);
		hp.bottle();
		Thread.sleep(2000);
		hp.addCart();
		Thread.sleep(2000);
		hp.view();
		Thread.sleep(2000);
		hp.checkout();
		hp.next();
		String value=driver.findElement(By.id("customer-email-error")).getText();
		
		Assert.assertEquals(value, expectedValue);
		
	}
	
	@Test(dataProvider = "validCredentialExcel" , dataProviderClass = DataProviderUtilities.class)
	public void validCredentialTest(String username,String expectedValue) throws InterruptedException{
		SignInPage sip = new SignInPage(driver);		
		 sip.signIn();
		 
		 Thread.sleep(2000);
		sip.sendUsername(username);
		sip.clickOnLogin();
		
		Thread.sleep(2000);
		String actualvalue = sip.getErrorMessage();
		System.out.println(actualvalue);
		Assert.assertEquals(actualvalue, expectedValue);
			
	}
	
	@Test(dataProvider = "validPasswordExcel" , dataProviderClass = DataProviderUtilities.class)
	public void validPasswordTest(String password,String expectedValue) throws InterruptedException{
	
		SignInPage login = new SignInPage(driver);
		
		
		 login.signIn();
		 Thread.sleep(2000);
		 login.create();
		
		login.sendPassword(password);
		driver.findElement(By.id("password-confirmation")).click();
		Thread.sleep(2000);
		String actualvalue = login.getErrorPassword();
		System.out.println(actualvalue);
		Assert.assertEquals(actualvalue,expectedValue);
		
	

	}	
	
}