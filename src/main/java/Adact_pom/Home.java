package Adact_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public static WebDriver driver;
	@FindBy(xpath="//input[@type='text']")
	private WebElement user;

	public Home(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser() {
		return user;
	}
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	

}
