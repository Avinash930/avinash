package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("Test1");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test1");
  }

}
