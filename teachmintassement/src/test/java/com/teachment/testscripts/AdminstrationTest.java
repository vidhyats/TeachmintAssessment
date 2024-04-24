package com.teachment.testscripts;

import org.testng.annotations.Test;

import Basepackage.BaseTest;
import ObjectRepository.Accountpage;
import ObjectRepository.AdministrationPage;
import ObjectRepository.Loginpage;

public class AdminstrationTest extends BaseTest {
	@Test

	public void Tc_003() throws InterruptedException {
		Loginpage loginpage = new Loginpage(driver);
		loginpage.entermobilenum("0000020232");
		loginpage.LoginwithMobno();
		loginpage.clickNext();
		loginpage.Otp("120992");
		loginpage.clicksubmit();
		Accountpage accountpage = new Accountpage(driver);
		accountpage.clickautomationaccount();
		Thread.sleep(3500);
		AdministrationPage adminpage = new AdministrationPage(driver);
		adminpage.handleShadowRoot();
		adminpage.clickadmimistration();
		adminpage.clickcertificates();
		adminpage.clickschoolcertificate();

		adminpage.clickongenerateschoolcertificate();

		adminpage.clicksearchname();

		adminpage.clickoncheckbox();

		adminpage.ClickonGenerateTab();

		adminpage.clickonremarks();

	}
}
