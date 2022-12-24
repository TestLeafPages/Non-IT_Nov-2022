package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
  @Test
  public void f() {
	  System.out.println("Running from second class");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before the f method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After the f method");
  }

}
