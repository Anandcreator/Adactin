package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver getUrl(String Url) {
		driver.get(Url);
		return driver;
	}
	public static void dropDown(String type ,WebElement element, String Value) {
	     Select s = new Select(element);
	     
	     if (type.equalsIgnoreCase("Value")) {
	    	 s.selectByValue(Value);
		}
	     else if (type.equalsIgnoreCase("index")) {
			int data = Integer.parseInt(Value);
			s.selectByIndex(data);
		}
	     else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(Value);
		}
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void Close() {
		driver.close();
	}
	
	public static void NavigateTo(String element) {
		driver.navigate().to(element);
	}
	public static void NavigateBack() {
		driver.navigate().back();
	}
	public static void NavigateForward() {
		driver.navigate().forward();
	}
	public static void NavigateRefresh() {
		driver.navigate().refresh();
	}
	private void Alert() {
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
