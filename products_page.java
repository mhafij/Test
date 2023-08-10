package Tasks2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.base;

public class products_page extends base {
	public static void main(String[] args) throws InterruptedException{
		//1.********************************Launch browser**********************************************
		setUp();
		//2.****************************Navigate to url 'http://automationexercise.com'***************************************
		driver.get("http://automationexercise.com");
		
		
		//3.****************************************Verify that home page is visible successfully***********************************
		Thread.sleep(3000);
		WebElement homePage= driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h2"));
		String homeContent = homePage.getText();
		//System.out.println("Home Page are exist? " + homeContent);
		if(homeContent.equals("Full-Fledged practice website for Automation Engineers")) {
			System.out.println("Are they displayed successfully on the home page? YES ");
		}else {
			System.out.println("Home Page are exist? No ");
		}
		
		//4.******************************************Click 'View Product' for any product on home page*******************************
		WebElement ViewDetail = driver.findElement(By.xpath("//div[2]/div[1]/div[3]/div/div[2]/ul/li/a"));
		ViewDetail.click();
		
		//5.*****************************************Verify product detail is opened**************************************************
		Thread.sleep(3000);
		 Boolean VisibleSearchedProduct = driver.findElement(By.xpath("//div/div[2]/div[2]/div[2]/div/h2")).isDisplayed();
		 System.out.println("The product details is opened? " + VisibleSearchedProduct);
		 
		 //6.***************************************Increase quantity to 4************************************************************
		 Thread.sleep(3000);
		 driver.findElement(By.name("quantity")).clear();
		 driver.findElement(By.name("quantity")).sendKeys("4");
		 
		 //7.*************************************Click 'Add to cart' button**********************************************************
		 Thread.sleep(3000);
		 WebElement AddToCart = driver.findElement(By.xpath("//button[@type='button']"));
		 AddToCart.click();
		 
		 //8.*************************************Click 'View Cart' button************************************************************
		Thread.sleep(3000);
		 WebElement ViewCart = driver.findElement(By.xpath("//a//u[text()='View Cart']"));
		 ViewCart.click();
		 
		 //9.*********************************Verify that product is displayed in cart page with exact quantity***********************
		 String qty = driver.findElement(By.xpath("//td[@class='cart_quantity']")).getText();
		 if(qty.equals("5")) {
				System.out.println("The exact amount 4 is showing at the view cart page " + qty);
			}else {
				System.out.println("The exact amount isn't showing at the view cart page " + qty);
			}
		 
	}

}


