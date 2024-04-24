package com.teachment.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Basepackage.BaseTest;
import ObjectRepository.Accountpage;
import ObjectRepository.Loginpage;

public class AccountTest extends BaseTest {
	@Test
	public void TC_002() {

		Loginpage loginpage = new Loginpage(driver);
		loginpage.entermobilenum("0000020232");
		loginpage.LoginwithMobno();
		loginpage.clickNext();
		loginpage.Otp("120992");
		loginpage.clicksubmit();
		Accountpage accountpage = new Accountpage(driver);
		accountpage.clickautomationaccount();

	}
}
