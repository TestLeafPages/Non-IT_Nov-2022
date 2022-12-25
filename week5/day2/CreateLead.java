package testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends CommonClass {

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cname, String fname, String lname) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider(name="fetchData")
	public String[][] sendData() {

		String[][] data = new String[3][3];

		data[0][0] = "TL";
		data[0][1] = "vidya";
		data[0][2] = "R";

		data[1][0] = "Wipro";
		data[1][1] = "Mirudula";
		data[1][2] = "Kumar";

		data[2][0] = "TCS";
		data[2][1] = "Gayathiri";
		data[2][2] = "R";

		return data;

	}

}
