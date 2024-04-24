package Basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import teachmintGeneric.GenericReusableMethods;

public class BasePage 
{
	public BasePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
}
