package com.adactin.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class AddRunner extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) {

		driver = browserLaunch("chrome");
		//driver.get("https://adactinhotelapp.com/");

		getUrl("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		inputValueElement(username, "jivita04");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		inputValueElement(password, "123456");

		WebElement login = driver.findElement(By.xpath("//input[@class='login_button']"));
		clickOnElement(login);
		
	
		WebElement sel = driver.findElement(By.xpath("//select[@name='location']"));
		dropDown("index", sel, "3");
		
		WebElement sel1 = driver.findElement(By.xpath("//select[@name='hotels']"));
		dropDown("text", sel1, "Hotel Sunshine");
		
		
		
		//NavigateTo("https://www.facebook.com/");
		//NavigateBack();
		//NavigateForward();
		//NavigateRefresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
