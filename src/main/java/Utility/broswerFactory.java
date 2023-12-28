package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class broswerFactory {
	
	public static WebDriver createBrowser() {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		return new ChromeDriver();
		
	}

}
