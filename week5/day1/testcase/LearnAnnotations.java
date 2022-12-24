package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations {
  @Test
  public void trailTest() {
	  System.out.println("Understand the hirerchy of annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Run before all the methods");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Run after all the methods");

  }
  
  @Test
  public void trailTest1() {
	  System.out.println("Understand the hirerchy of annotation of test2");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Run before all the classes");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Run after all the classes");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Run before all the tests");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Run after all the tests");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Run before  the suite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Run after the suite");

  }

}
