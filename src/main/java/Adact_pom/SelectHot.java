package Adact_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHot {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement button;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement booknow;
	public WebElement getButton() {
		return button;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public SelectHot(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

}
