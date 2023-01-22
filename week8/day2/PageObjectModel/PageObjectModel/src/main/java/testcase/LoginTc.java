package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import pages.LoginPage;


public class LoginTc extends ProjectSpecificMethod {

	@BeforeTest
	public void setfile() {
		filename="Logindata";
	}
	//BeforeTest, BeforeClass
	
	
	@Test(dataProvider="fetchData")
	public void runLogin(String uname, String pwd) {
		
		//LoginPage lp=new LoginPage();
		new LoginPage(driver)
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.verifyHomePage();
		
		/*
		 * lp.enterPassword(); lp.clickLogin();
		 * 
		 * WelcomePage wp =new WelcomePage(); wp.clickCrmsfa();
	 */
		
	}
	
}
