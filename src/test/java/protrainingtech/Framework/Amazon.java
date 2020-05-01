package protrainingtech.Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Amazon {
	WebDriver driver;
	
  @Test(priority = 2)
  public void f() throws InterruptedException {
	  //Go to amazon.com and from home page clicks on the links to verify pages are opening or not
	  Home_page Home= new Home_page(driver);
	  Home.bestlinksclick();
	  Thread.sleep(6000);
	  Home.customerofclick();
	  Thread.sleep(6000);
	  Home.newreleaseclick();
	  
	  
	  //Enter the product name in the search field and click to search
  }
  
  
  
  //we can prioritize the class to run which class first, other wise it runs with alphabetical order of class name
  @Test(priority = 1)
  public void search() throws InterruptedException {
	  Home_page Home= new Home_page(driver);
	  Home.searchfieldsendkeys("computer");
	  Thread.sleep(2000);
	  Home.searctoclick();
	  Home.searchfieldsendkeys("phones");
	  Thread.sleep(2000);
	  Home.searctoclick();
  }
  
  @BeforeClass
  public void beforeClass()
  {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\lala94\\eclipse-workspace\\homedepot\\chromedriver.exe");
	  
	  String url="https://www.amazon.com";
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }
//Create separate class for amazon prime and locate needed elements then call these elements
  //into testng class for scenarios
}
