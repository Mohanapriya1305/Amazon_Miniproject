package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchItem {

	public WebDriver driver;
	
	public searchItem(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
		
	
	public WebElement search() {
		return search;		
	}
	
	public WebElement searchbutton() {
		return searchbutton;		
	}
	
	}
	

