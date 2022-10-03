package com.adactin.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.runner.Runner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Auto {
	public static WebDriver driver=RunnerClass.driver;
	

	@Given("^User Launch the Automaation Application$")
	public void user_Launch_the_Automaation_Application() throws Throwable {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
	}

	@When("^Enter the username in the Email Field$")
	public void enter_the_username_in_the_Email_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mmaconstruction@gmail.com");
	}

	@When("^Enter the password in the password Field$")
	public void enter_the_password_in_the_password_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("MdThalha123");
	 
	}

	@Then("^Click the Login Button and it will navigate to Automation app$")
	public void click_the_Login_Button_and_it_will_navigate_to_Automation_app() throws Throwable {
		driver.findElement(By.xpath("//i[@Class='icon-lock left']")).click();
	}

	@When("^Click the Tshirt Option$")
	public void click_the_Tshirt_Option() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
	}

	@When("^User Select the Faded Short Sleve$")
	public void user_Select_the_Faded_Short_Sleve() throws Throwable {
		WebElement tshirt = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		Actions act=new Actions(driver);
		act.moveToElement(tshirt).build().perform();
	}

	@When("^User go to the add cart$")
	public void user_go_to_the_add_cart() throws Throwable {
		
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	}

	@When("^User click the Proceed$")
	public void user_click_the_Proceed() throws Throwable {
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
	  	}

	@When("^User Click the Proceed to Check to out$")
	public void user_Click_the_Proceed_to_Check_to_out() throws Throwable {
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
	}

	@Then("^User Click Purchased$")
	public void user_Click_Purchased() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	}



}
