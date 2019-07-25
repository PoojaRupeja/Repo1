package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {
	public static WebDriver driver;
	String path;
	
	@BeforeSuite
	public void init()
	{
		path=System.getProperty("user.dir") +"\\src\\test\\resources\\Driver\\chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
	}
	@AfterSuite
	public void CloseBrowser() 
	{
		System.out.println("After Suite");
		driver.quit();
	}
	
	
	

}
