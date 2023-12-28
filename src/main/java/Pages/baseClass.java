package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver browsers() throws IOException, InterruptedException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream("E:\\eclipsework\\Amazon_Miniproject\\Configuration\\config.properties");
		prop.load(fis);		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\eclipsework\\Amazon_Miniproject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if(browserName.equals("FireFox")) {
			System.getProperty("webdriver.gecko.driver","E:\\eclipsework\\Amazon_Miniproject\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		else if(browserName.equals("IE")) {
			System.getProperty("webdriver.edge.driver","E:\\eclipsework\\Amazon_Miniproject\\Driver\\InternetExplorer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();		
		}
		
		Thread.sleep(2000);
		
		driver.get(prop.getProperty("url"));
		return driver;
		
	}
	
	
	
}
