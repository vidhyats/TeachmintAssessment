package com.teachment.testscripts;
import org.testng.annotations.Test;
import Basepackage.BaseTest;
import ObjectRepository.Loginpage;

public class LoginTest extends BaseTest
{
@Test
public void TC_Login_001() throws InterruptedException
{
	
    Loginpage loginpage=new Loginpage(driver);
     loginpage.entermobilenum("0000020232");
    //loginpage.entermobilenum(mobno);generic not working
     loginpage.LoginwithMobno();
     
     loginpage.clickNext();
     
     loginpage.Otp("120992");
     loginpage.clicksubmit();
     

}

}
