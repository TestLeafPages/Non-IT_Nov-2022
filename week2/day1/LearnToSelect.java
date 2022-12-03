package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnToSelect {

	public static void main(String[] args) throws InterruptedException {

		//launched the browser
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		//load the url
		driver.get("http://leaftaps.com/opentaps");
		//maximized the browser
		driver.manage().window().maximize();
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click the login 
		driver.findElement(By.className("decorativeSubmit")).click();
		//click the crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click Leads
		driver.findElement(By.linkText("Leads")).click();
		//click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		//enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
				
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd=new Select(source);
		dd.selectByIndex(2);
		
		Thread.sleep(2000);
		dd.selectByValue("LEAD_EXISTCUST");//value of the value attribute
		
		Thread.sleep(2000);
		dd.selectByVisibleText("Self Generated");
		
		//Click create lead
		driver.findElement(By.className("smallSubmit")).click();		
		
		//to verify the page
		// to know the return type of the method-->ctrl 2 l/ ctrl  1 -->assign to local variable
		String title = driver.getTitle();
		System.out.println(title);		
		
		driver.close();
		
		
		
	}

}
