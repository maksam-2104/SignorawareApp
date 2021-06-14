package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverwrapper;

import com.cyient.page.SignInPage;
import com.cyient.utilities.DataProviderUtilities;




public class LoginTest extends WebDriverwrapper {
	
			
	@Test
	public void navigationTest() throws InterruptedException{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Product Range')]"))).perform();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]")).click();
		driver.findElement(By.id("sorter")).click();
		//Select selectSortby=new Select(driver.findElement(By.xpath(null)));
		//selectSortby.selectByVisibleText("product");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Renew Vacuum Steel Bottle 500 ml.']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='View Cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to Checkout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		
		
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