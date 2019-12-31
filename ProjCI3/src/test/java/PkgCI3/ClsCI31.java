package PkgCI3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClsCI31 {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("msg1");
	     driver.navigate().to("http://www.google.com/");
	     driver.navigate().to("https://weather.com/");
	     
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("msg2");
	  System.setProperty("webdriver.chrome.driver", "C:/vimmi/Downloads/chrome79/chromedriver.exe");	 
	     driver = new ChromeDriver();

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("msg3l");
	driver.quit();
  }

}
