package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {

	public LoginPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public LoginPage enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		//LoginPage lp=new LoginPage();		
		//return new LoginPage();
		return this;
	}

	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		//LoginPage lp=new LoginPage();		
	//	return new LoginPage();
		return this;
	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	//	WelcomePage wp=new WelcomePage();
		return new WelcomePage(driver);
	}

}
