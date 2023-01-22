package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{

	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

public CreateLeadPage enterCompanyname(String cname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	return this;
	}

public CreateLeadPage enterFirstname(String fname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
return this;
}

public CreateLeadPage enterLastname(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
return this;
}

public CreateLeadPage enterPhoneNumber(String phno) {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
 return this;
}

public ViewLeadPage clickCreatelead() {
	driver.findElement(By.name("submitButton")).click();
 return new ViewLeadPage(driver);
}


	
	
}
