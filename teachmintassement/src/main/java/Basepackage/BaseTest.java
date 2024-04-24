package Basepackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import teachmintGeneric.GenericReusableMethods;

public class BaseTest extends GenericReusableMethods
{
	public static WebDriver driver;
	@BeforeMethod
	public void browserSetup(Method method) throws IOException
	{
			
			if(getPropertyValue("browser").equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(getPropertyValue("browser").equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Implicit_timeout));
		driver.get(getPropertyValue("url"));
		initObjects(driver);
		
		
		
	}

		@AfterMethod
	public void browserTearDown()
	{
		driver.quit();
		softAssert.assertAll();
	}
}
