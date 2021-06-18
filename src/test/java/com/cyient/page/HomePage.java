package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	//Actions action = new Actions(driver);
	//action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Product Range')]"))).perform();
	private By productLocator= By.xpath("//span[contains(text(),'Product Range')]");
	private By flasksLocator= By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]");
	private By sortByLocator= By.id("sorter");
	private By bottleLocator= By.xpath("//img[@alt='Renew Vacuum Steel Bottle 500 ml.']");
	private By addCartLocator= By.xpath("//span[normalize-space()='Add to Cart']");
	private By viewLocator= By.xpath("//a[normalize-space()='View Cart']");
	private By checkoutLocator= By.xpath("//span[normalize-space()='Proceed to Checkout']");
	private By nextLocator= By.xpath("//span[normalize-space()='Next']");
	
	//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]")).click();
	//driver.findElement(By.id("sorter")).click();
	//Select selectSortby=new Select(driver.findElement(By.xpath(null)));
	//selectSortby.selectByVisibleText("product");
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//img[@alt='Renew Vacuum Steel Bottle 500 ml.']")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
	
	//driver.findElement(By.xpath("//a[normalize-space()='View Cart']")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//span[normalize-space()='Proceed to Checkout']")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void product() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(productLocator)).perform();
	}
	public void flasks() 
	{
		driver.findElement(flasksLocator).click();
	}
	public void sortBy() 
	{
		driver.findElement(sortByLocator).click();
	}
	public void bottle() 
	{
		driver.findElement(bottleLocator).click();
	}
	public void addCart() 
	{
		driver.findElement(addCartLocator).click();
	}
	public void view() 
	{
		driver.findElement(viewLocator).click();
	}
	public void checkout() 
	{
		driver.findElement(checkoutLocator).click();
	}
	public void next() 
	{
		driver.findElement(nextLocator).click();
	}
	
}
