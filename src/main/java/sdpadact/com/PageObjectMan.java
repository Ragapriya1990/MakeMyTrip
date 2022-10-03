package sdpadact.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Adact_pom.BookHotel;
import Adact_pom.Confirmation;
import Adact_pom.Home;
import Adact_pom.SearchHot;
import Adact_pom.SelectHot;

public class PageObjectMan {
	private Home h;
	private SearchHot sh;
	private SelectHot h1;
	private BookHotel bh;
	Confirmation ch;
	private WebDriver driver;
public Home getinstance() {
h=new Home(driver);
return h;
}
public SearchHot Hotel() {
	sh=new SearchHot(driver);
	return sh;
}
public SelectHot Hot() {
	h1=new SelectHot(driver);
	return h1;
}
public BookHotel booking() {
	bh=new BookHotel(driver);
	return bh;
}
public Confirmation confirm() {
	 ch=new Confirmation(driver);
	 return ch;

}
public PageObjectMan(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
