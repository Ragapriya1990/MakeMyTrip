package Adact_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement iteratory;
	@FindBy(xpath="//input[@name='logout']")
	private WebElement logout;
	public WebElement getIteratory() {
		return iteratory;
	}
	public WebElement getLogout() {
		return logout;
	}
	public Confirmation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}

}
