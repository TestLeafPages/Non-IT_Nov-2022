package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod{
	
	public LeadsPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	

}
