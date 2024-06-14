package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Pkg.Blazeregister;

public class Blazeregistertest {
WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urll()
	{
		driver.get("https://blazedemo.com/register");
		
	}
	@Test
	public void testlogin()
	{
		Blazeregister ob=new Blazeregister(driver);
		ob.setvalues("abc", "eeee", "abc@gmail.com", "qwertyu", "qwerty");
		ob.registe();
		ob.set("abc@gmail.com", "qwerty");
		ob.login();		
	}
}
