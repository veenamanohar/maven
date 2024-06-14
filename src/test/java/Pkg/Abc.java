package Pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Abc {
ChromeDriver driver;
@Test
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
}
