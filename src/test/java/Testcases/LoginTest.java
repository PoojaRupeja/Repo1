package Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends Driver
{
	@Test
	
	public void login()
	{
	driver.findElement(By.id("email")).sendKeys("admin");
	
	driver.findElement(By.id("pass")).sendKeys("admin");
	driver.findElement(By.id("loginbutton")).click();
	}
}
	
//	@Test
//	
//	public void Count_Images()
//	{
//		ArrayList<Webelement> al= new Arraylist<>
//	
//	}
