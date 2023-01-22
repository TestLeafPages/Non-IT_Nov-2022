package baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcelData;



public class ProjectSpecificMethod {
	public RemoteWebDriver driver;
	public String filename;
	@Parameters({"url"})
	@BeforeMethod
	public void preConditions(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
	  @DataProvider(name="fetchData")
	  public String[][] sendData() throws IOException {
	  
	    	  return ReadExcelData.readData(filename);
	  
	  }
	 

}
