package Adact_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement first;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement last;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ccnum;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement visa;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement exp;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement year;
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement book_now;
	public WebElement getFirst() {
		return first;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getVisa() {
		return visa;
	}
	public WebElement getExp() {
		return exp;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook_now() {
		return book_now;
	}
	public BookHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	

}
