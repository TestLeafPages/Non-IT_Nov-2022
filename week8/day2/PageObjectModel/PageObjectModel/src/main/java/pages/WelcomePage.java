package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {

	public WelcomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public HomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	//	HomePage hp =new HomePage();
		return new HomePage(driver);
	}
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
          
		//LoginPage lp=new LoginPage();
		return new LoginPage(driver);
	}
	
	
}
