package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pkg.Janasyapage;

public class janasyatest {
WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urll()
	{
		driver.get("https://janasya.com/");
		driver.manage().window().maximize();

	}
	@Test
	public void test1() 
	{
		
		Janasyapage ob=new Janasyapage(driver);
	    ob.set();
	    ob.logopresent();
	    ob.itempage();
	    ob.category();
	    ob.alllinks();
	    ob.menus();
	    ob.wish();
	    ob.adcart();
	    ob.vwcart();
	    ob.cshopping();
	    ob.ethnics();
	}
	}

