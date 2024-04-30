package com.adactin.stepdifinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver driver = RunnerClass.driver;

	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anand\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
  
	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jivita04");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_page() throws Throwable {
		driver.findElement(By.xpath("//input[@class='login_button']")).click();
	}

	@When("^user Select the location indropdown menu$")
	public void user_Select_the_location_indropdown_menu() throws Throwable {
		WebElement sel = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(sel);
		s.selectByIndex(3);
	}

	@When("^user Select the hotel in Hotels dropdown menu$")
	public void user_Select_the_hotel_in_Hotels_dropdown_menu() throws Throwable {
		WebElement sel1 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(sel1);
		s1.selectByVisibleText("Hotel Sunshine");
	}

	@When("^user Select the Room Type in Room Type Menu$")
	public void user_Select_the_Room_Type_in_Room_Type_Menu() throws Throwable {

		WebElement sel2 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(sel2);
		s2.selectByIndex(2);
	}

	@When("^user Select the Number of rooms in number of rooms menu$")
	public void user_Select_the_Number_of_rooms_in_number_of_rooms_menu() throws Throwable {
		WebElement sel3 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(sel3);
		s3.selectByIndex(4);
	}

	@When("^user Enter the Check in Date in check in date menu$")
	public void user_Enter_the_Check_in_Date_in_check_in_date_menu() throws Throwable {
		driver.findElement(By.xpath("//input[@class='date_pick']")).sendKeys("15/04/2024");
	}

	@When("^user Enter the checkout date in check out date menu$")
	public void user_Enter_the_checkout_date_in_check_out_date_menu() throws Throwable {
		driver.findElement(By.xpath("(//input[@class='date_pick'])[2]")).sendKeys("17/04/2024");
	}

	@When("^user Select how many adults in  Adults per room Drop down menu$")
	public void user_Select_how_many_adults_in_Adults_per_room_Drop_down_menu() throws Throwable {
		WebElement sel4 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(sel4);
		s4.selectByIndex(2);
	}

	@When("^user Select how many Children in Children per room Drop down menu$")

	public void user_Select_how_many_Children_in_Children_per_room_Drop_down_menu() throws Throwable {
		WebElement sel5 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(sel5);
		s5.selectByIndex(2);
	}

	@Then("^user Click the search button and it navigates to select hotel page$")
	public void user_Click_the_search_button_and_it_navigates_to_select_hotel_page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@When("^user Select the Radiobutton HotelSunshine from the list of Hotels$")
	public void user_Select_the_Radiobutton_HotelSunshine_from_the_list_of_Hotels() throws Throwable {

		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Given("^user Click the Continue Button and it navigates to Book A Hotel Page$")
	public void user_Click_the_Continue_Button_and_it_navigates_to_Book_A_Hotel_Page() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)"); // SCROLL DOWN
	}

	@When("^user Enter a Name in a First Name Tab$")
	public void user_Enter_a_Name_in_a_First_Name_Tab() throws Throwable {
		driver.findElement(By.xpath("//INPUT[@name='first_name']")).sendKeys("Jivita");
	}

	@When("^user Enter a Last Name in a Last Name Tab$")
	public void user_Enter_a_Last_Name_in_a_Last_Name_Tab() throws Throwable {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("J");
	}

	@When("^user Enter a Address in a Billing address Tab$")
	public void user_Enter_a_Address_in_a_Billing_address_Tab() throws Throwable {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("NO.88 Dubai Cross Street Dubai-4327");
	}

	@When("^user Enter a Card Number in a Card Number Tab$")
	public void user_Enter_a_Card_Number_in_a_Card_Number_Tab() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("6754327654379432");
	}

	@When("^User Select the Card Type in the Credit Card Type Dropdown$")
	public void user_Select_the_Card_Type_in_the_Credit_Card_Type_Dropdown() throws Throwable {
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select cc = new Select(cctype);
		cc.selectByIndex(2);
	}

	@When("^User Select the Month in a Select Down DRop Down in Expiry Date Tab$")
	public void user_Select_the_Month_in_a_Select_Down_DRop_Down_in_Expiry_Date_Tab() throws Throwable {
		WebElement ccye = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select ccy = new Select(ccye);
		ccy.selectByIndex(8);
	}

	@When("^user Select the Year in a Select Year Drop Down Menu in Expiry Date Tab$")
	public void user_Select_the_Year_in_a_Select_Year_Drop_Down_Menu_in_Expiry_Date_Tab() throws Throwable {
		WebElement ccmo = driver.findElement(By.xpath("//select[@class='select_combobox2']"));
		Select ccm = new Select(ccmo);
		ccm.selectByIndex(12);
	}

	@When("^user Enter the CVV Number in a CVV number Dropdown$")
	public void user_Enter_the_CVV_Number_in_a_CVV_number_Dropdown() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("456");
	}

	@When("^user click in the Book now Button it Navigates to Booking Confirmation Page$")
	public void user_click_in_the_Book_now_Button_it_Navigates_to_Booking_Confirmation_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(8000);
	}

	@When("^User Click the LogOut Button and it navigates to Home Page$")
	public void user_Click_the_LogOut_Button_and_it_navigates_to_Home_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='logout']")).click();
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
	}

}
