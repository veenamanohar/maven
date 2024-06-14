package Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazeregister {
	WebDriver driver;
	By blazname=By.name("name");
	By blazcompany=By.id("company");
	By blazemail=By.id("email");
	By blazpasswrd=By.id("password");
	By blazconpaswrd=By.id("password-confirm");
	By register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	//LOGIN
	
	By blazemai=By.name("email");
	By blazepaswrd=By.name("password");
	By blazelogi=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");


	public Blazeregister(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String password,String confirmpswrd)
	{
		driver.findElement(blazname).sendKeys(name);
		driver.findElement(blazcompany).sendKeys(company);
		driver.findElement( blazemail).sendKeys(email);
		driver.findElement(blazpasswrd).sendKeys(password);
		driver.findElement(blazconpaswrd).sendKeys(confirmpswrd);
	}
	public void set(String emai,String paswor)
	{
		
		//LOGIN
		driver.findElement( blazemai).sendKeys(emai);
		driver.findElement(blazepaswrd).sendKeys(paswor);
	}
	public void registe()
	{
		driver.findElement(register).click();
		driver.navigate().to("https://blazedemo.com/login");
	}
	public void login()
	{
		driver.findElement(blazelogi).click();

	}
	
	
}
