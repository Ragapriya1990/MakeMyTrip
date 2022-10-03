package com.adactin.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.RunnerClass;

import BaseClass.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sdpadact.com.PageObjectMan;

public class Stepdef extends Base {
	public static WebDriver driver=RunnerClass.driver;
	public static PageObjectMan po=new PageObjectMan(driver);
	@Given("^user Launch the adactin Application$")
	public void user_Launch_the_adactin_Application() throws Throwable {
		driver=url("https://adactinhotelapp.com/");
  
	}
	@When("^user Enter the \"([^\"]*)\" in Username Field$")
	public void user_Enter_the_in_Username_Field(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sendkeyelement(po.getinstance().getUser(), username);
	}

	@When("^user Enter the \"([^\"]*)\" in Password Field$")
	public void user_Enter_the_in_Password_Field(String password) throws Throwable {
		Sendkeyelement(po.getinstance().getPass(),password );
	}
	    
//	@When("^user Enter the Username in Username Field$")
//	public void user_Enter_the_Username_in_Username_Field() throws Throwable {
//	 //  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mohamedthalha");
//		Sendkeyelement(po.getinstance().getUser(), "mohamedthalha");
//	}
//
//	@When("^user Enter the Password in Password Field$")
//	public void user_Enter_the_Password_in_Password_Field() throws Throwable {
//	//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1497H6");
//		Sendkeyelement(po.getinstance().getPass(),"1497H6" );
//	}

	@Then("^user click The Login Button And Navigate to Search Hotel Page$")
	public void user_click_The_Login_Button_And_Navigate_to_Search_Hotel_Page() throws Throwable {
	  //  driver.findElement(By.xpath("//input[@type='Submit']")).click();
		ClickElement(po.getinstance().getSubmit());
	}

	@When("^user search the Location For Hotel$")
	public void user_search_the_Location_For_Hotel() throws Throwable {
	  //driver.findElement(By.xpath("//select[@name='location']")).sendKeys("London");
		Sendkeyelement(po.Hotel().getLocation(), "London");
	}

	@When("^user Select the Hotel$")
	public void user_Select_the_Hotel() throws Throwable {
		//driver.findElement(By.xpath("//select[@name='hotels']")).sendKeys("Hotel Sunshine");
		Sendkeyelement(po.Hotel().getHotel(), "Hotel Sunshine");
	}

	@When("^user Select the Room Type$")
	public void user_Select_the_Room_Type() throws Throwable {
		//driver.findElement(By.xpath("//select[@name='room_type']")).sendKeys("Double");
		Sendkeyelement(po.Hotel().getRoom(), "Double");
	}

	@When("^user Select the total no of rooms$")
	public void user_Select_the_total_no_of_rooms() throws Throwable {
		//driver.findElement(By.xpath("//select[@name='room_nos']")).sendKeys("1 -One");
		Sendkeyelement(po.Hotel().getType(), "1 -One");
	}

	@When("^user Select the Check-in Date in Hotel$")
	public void user_Select_the_Check_in_Date_in_Hotel() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("17/09/2022");
		Sendkeyelement(po.Hotel().getDatepick(), "10/11/2022");
	}

	@When("^user Select the Check-out Date in Hotel$")
	public void user_Select_the_Check_out_Date_in_Hotel() throws Throwable {
	//	driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("18/09/2022");
		Sendkeyelement(po.Hotel().getDateout(), "11/11/2022");
	}

	@When("^user Enter the Adult Person in per room$")
	public void user_Enter_the_Adult_Person_in_per_room() throws Throwable {
		//driver.findElement(By.xpath("//select[@name='adult_room']")).sendKeys("1 -One");
		Sendkeyelement(po.Hotel().getAdult(), "1 -One");
	}

	@When("^user Enter the Child in per room$")
	public void user_Enter_the_Child_in_per_room() throws Throwable {
	//	driver.findElement(By.xpath("//select[@name='child_room']")).sendKeys("1 -One");
		Sendkeyelement(po.Hotel().getChild(), "1 -One");
	}

	@Then("^user Click the Search Button And it Navigate to Hotels Pages$")
	public void user_Click_the_Search_Button_And_it_Navigate_to_Hotels_Pages() throws Throwable {
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		ClickElement(po.Hotel().getBook());
	}

	@When("^user select the Hotel$")
	public void user_select_the_Hotel() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		ClickElement(po.Hot().getButton());

	}

	@Then("^user Click the Continue Button And Navigate to Payment Page$")
	public void user_Click_the_Continue_Button_And_Navigate_to_Payment_Page() throws Throwable {
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		ClickElement(po.Hot().getBooknow());
	}

	@When("^user Enter the First name in Firstname Field$")
	public void user_Enter_the_First_name_in_Firstname_Field() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("mohamed");
		Sendkeyelement(po.booking().getFirst(), "mohamed");
	}

	@When("^user Enter The Lastname in Lastname Field$")
	public void user_Enter_The_Lastname_in_Lastname_Field() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("thal");
		Sendkeyelement(po.booking().getLast(), "thal");

	}

	@When("^user Enter the Billing Address in Billing Address Field$")
	public void user_Enter_the_Billing_Address_in_Billing_Address_Field() throws Throwable {
		//driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("123");	 
		Sendkeyelement(po.booking().getAddress(), "123");
	}

	@When("^user Enter the Credit Cardno in Credit Cardno Field$")
	public void user_Enter_the_Credit_Cardno_in_Credit_Cardno_Field() throws Throwable {
	//	driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1245678901234678");
		Sendkeyelement(po.booking().getCcnum(), "1245678901234678");
	}

	@When("^user Enter the Credit cardType in Credit CardType Field$")
	public void user_Enter_the_Credit_cardType_in_Credit_CardType_Field() throws Throwable {
		//driver.findElement(By.xpath("//select[@name='cc_type']")).sendKeys("VISA");
		Sendkeyelement(po.booking().getVisa(), "VISA");
	}

	@When("^user Enter the Expirydate of Card in Expiry Date Field$")
	public void user_Enter_the_Expirydate_of_Card_in_Expiry_Date_Field() throws Throwable {
	//	driver.findElement(By.xpath("//select[@name='cc_exp_month']")).sendKeys("April");
	//	driver.findElement(By.xpath("//select[@name='cc_exp_year']")).sendKeys("2014");
		Sendkeyelement(po.booking().getExp(), "April");
		Sendkeyelement(po.booking().getYear(), "2014");
	}

	@When("^User Enter the Cvvno in the Cvv Field$")
	public void user_Enter_the_Cvvno_in_the_Cvv_Field() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("1267");
		Sendkeyelement(po.booking().getCvv(), "1267");
	
	}

	@Then("^user Click the BookNow Button and it navigate to Booking Confirmation Page$")
	public void user_Click_the_BookNow_Button_and_it_navigate_to_Booking_Confirmation_Page() throws Throwable {
	//	driver.findElement(By.xpath("//input[@name='book_now']")).click();
		ClickElement(po.booking().getBook_now());
	}

	@Then("^user Click the Logout Button in the Adactin Website$")
	public void user_Click_the_Logout_Button_in_the_Adactin_Website() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='logout']")).click();
		impwait(5);
		ClickElement(po.confirm().getLogout());
	}



}
