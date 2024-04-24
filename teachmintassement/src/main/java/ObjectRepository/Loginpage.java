package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Basepackage.BasePage;

public class Loginpage extends BasePage {

	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	// Locatingmobilenotextfield

	@FindBy(id = "user-input")
	private WebElement Mobilenotextfield;

	public void entermobilenum(String mobno) {
		Mobilenotextfield.sendKeys(mobno);
	}

	public void LoginwithMobno() {
		Mobilenotextfield.click();
	}

	// locatingnextbutton

	@FindBy(id = "send-otp-btn-id")
	private WebElement NextButton;

	public void clickNext() {
		NextButton.click();
	}

	// locatingotp
	@FindBy(xpath = "//input[@data-group-idx]")
	private WebElement OTPtextfiled;

	public void Otp(String otp) {
		OTPtextfiled.sendKeys(otp);
	}

	// locatingsubmitbutton
	@FindBy(id = "submit-otp-btn-id")
	private WebElement submitOtpButton;

	public void clicksubmit() {
		submitOtpButton.click();
	}
}
