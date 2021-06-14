package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverwrapper;

import com.cyient.page.SignInPage;




public class LoginTest extends WebDriverwrapper {
	
			
	@Test
	public void navigationTest() throws InterruptedException{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Product Range')]"))).perform();
	
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@alt='Renew Vacuum Steel Bottle 500 ml.']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='View Cart']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to Checkout']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		
		
	}
	
	@Test
	public void validCredentialTest(String username,String expectedValue) throws InterruptedException{
		Thread.sleep(1000);
		SignInPage login = new SignInPage(driver);
	
		
		 login.signIn();
		 Thread.sleep(2000);
		login.sendUsername(username);
		login.clickOnLogin();
		String actualvalue = login.getErrorMessage();
		System.out.println(actualvalue);
		Assert.assertEquals(actualvalue, "Please enter a valid email address (Ex: johndoe@domain.com).");
		
		
	}
	
	@Test
	public void validPasswordTest(String username,String password,String expectedValue) throws InterruptedException{
	
		SignInPage login = new SignInPage(driver);
		
		
		 login.signIn();
		 Thread.sleep(2000);
		login.sendUsername("john.com");
		
		login.sendPassword("123");
		login.clickOnLogin();
		String actualvalue = login.getErrorPassword();
		System.out.println(actualvalue);
		Assert.assertEquals(actualvalue, "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
		
	

	}	
	
}