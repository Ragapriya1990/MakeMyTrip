package Adact_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHot {
	public static WebDriver driver;
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room;

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement type;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement datepick;
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement dateout;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement book;

	public WebElement getType() {
		return type;
	}

	public WebElement getDatepick() {
		return datepick;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getBook() {
		return book;
	}
	public SearchHot(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}

}
