package Testcases;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.baseClass;
import Pages.searchItem;
import Pages.selectPhone;


public class TestRun extends baseClass{
	
	public static WebDriver driver;
	public static Logger log=LogManager.getLogger(TestRun.class.getName());	
	
	@BeforeTest
	public void test() throws IOException, InterruptedException {
		driver = browsers();
		//driver.get(prop.getProperty("url"));
	}
	@Test(priority = 1)
	public void searchitem() {
		searchItem si = new searchItem(driver);
		si.search().sendKeys("Apple phone");
		si.searchbutton().sendKeys(Keys.ENTER);
			
		}
	@Test(priority = 2)
	public void selectphonefromlist() {
		selectPhone pname = new selectPhone(driver);
		List<WebElement> list = pname.list();
		String ph = pname.phone().getText();		
		log.info("Iphone chosen by first one : " + ph);
		log.info("Search count "+ list.size());
		Assert.assertEquals(ph,pname.phone().getText());
		pname.clickb().click();
	}

}
