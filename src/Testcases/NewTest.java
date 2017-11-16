package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test(invocationCount=50,threadPoolSize=50)
  public void f() {
	 
	  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
     WebDriver  driver = new ChromeDriver();
      driver.get("http://www.google.com");
  }
}
