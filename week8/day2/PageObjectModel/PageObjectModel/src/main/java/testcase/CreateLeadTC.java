package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import pages.LoginPage;


public class CreateLeadTC extends ProjectSpecificMethod {

	
	@BeforeTest
	public void setfile() {
		filename="CreateLead";
	}
	
	
	@Test(dataProvider="fetchData")
	public void runCreate(String uname,String pwd,String cname, String fname, String lname,String phno) {
		
		//LoginPage lp=new LoginPage();
		new LoginPage(driver)
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.verifyHomePage()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyname(cname)
		.enterFirstname(fname)
		.enterLastname(lname)
		.enterPhoneNumber(phno)
		.clickCreatelead()
		.verifyViewLead();
		
	
		
	}
	
}
