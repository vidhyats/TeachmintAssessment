package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Basepackage.BasePage;

public class Accountpage extends BasePage {

	public Accountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[text()='Automation']")
	private WebElement Automationaccount;

	public WebElement getAutomationaccount() {
		return Automationaccount;
	}

	public void setAutomationaccount(WebElement automationaccount) {
		Automationaccount = automationaccount;
	}

	public void clickautomationaccount() {
		Automationaccount.click();
	}

}
