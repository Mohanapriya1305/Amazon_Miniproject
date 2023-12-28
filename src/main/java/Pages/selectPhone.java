package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectPhone {

public WebDriver driver;
	
	public selectPhone(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']")
	List<WebElement> list;
	@FindBy(xpath="(//*[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style'])[1]")
	WebElement phone;
	@FindBy(xpath="(//*[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"])[1]")
	WebElement clickb;
	/*
	 * @FindBy(xpath="(//*[@class='puisg-col-inner'])[2]") WebElement clickb;
	 */
	
	
	public List<WebElement> list(){
		return list;		
	}
	public WebElement phone() {
		return phone;		
	}
	public WebElement clickb() {
		return clickb;
	}
}
