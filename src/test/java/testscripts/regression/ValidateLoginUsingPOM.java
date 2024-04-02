package testscripts.regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class ValidateLoginUsingPOM extends BaseTest {
	
	@Test
	public void validateLoginTest()
	{
		
		//LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		
		LoginPage lp=new LoginPage();
		
		lp.username_textbox("reyaz0806");
		
		lp.password_textbox("reyaz123");
		
		lp.login_button();
		
		lp.verifyTitle("Adactin.com - Search Hotel");
		
	}

}
