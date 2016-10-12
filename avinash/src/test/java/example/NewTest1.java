package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test
  public void f() {
	  System.out.println("f1");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("f2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("f3");
  }

}
