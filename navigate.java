package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.base;

public class navigate extends base {
	public static void main(String[] args) throws InterruptedException{
		//1.**************************************Launch browser****************************************************
		setUp();
		
		//2.************************************Navigate to url 'http://automationexercise.com'*********************************************
		driver.get("http://automationexercise.com");
		
		//3***********************************Verify that home page is visible successfully***********************************************
		WebElement homePage= driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h2"));
		String homeContent = homePage.getText();
		//System.out.println("Home Page are exist? " + homeContent);
		if(homeContent.equals("Full-Fledged practice website for Automation Engineers")) {
			System.out.println("Are they displayed successfully on the home page? YES ");
		}else {
			System.out.println("Home Page are exist? No ");
		}
		
		//4****************************************Click on 'Products' button***********************************************************
		Thread.sleep(2000);
		driver.navigate().to("https://automationexercise.com/products");
		
		//*********************************************Verify user is navigated to ALL PRODUCTS page successfully*****************************
		Boolean allProducts = driver.findElement(By.xpath("//div[2]/div/h2")).isDisplayed();
		System.out.println("The 'ALL PRODUCTS' page is successfully visible " + allProducts);
		
		
		//6.**************************************Enter product name in search input and click search button********************************
		 WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"search_product\"]"));
		 searchInput.sendKeys("Blue Top");
		 WebElement clickButton = driver.findElement(By.id("submit_search"));
		 clickButton.click();
		 
		 //7.******************************************Verify 'SEARCHED PRODUCTS' is visible*************************************************
		 Boolean VisibleSearchedProduct = driver.findElement(By.xpath("//div[2]/div/div[1]/div[1]/p")).isDisplayed();
		 System.out.println("The searched product is visible? " + VisibleSearchedProduct);
		 
		 
		 
		
	}
}
