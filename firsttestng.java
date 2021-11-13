package mypackage;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.remote.ProtocolHandshake;

public class firsttestng 
{
	WebDriver driver;
	
  @Test
  public void f() 
  {
	  
	  driver.get("https://www.youtube.com");
	  //driver.findElement(By.name("search_query")).clear();
		driver.findElement(By.id("search")).sendKeys("salman khan song");
		//driver.findElement(By.name("search_query")).clear();
		//driver.findElement(By.name("search_query")).click(); // Keep this click statement even if you are using click before clear.
		//driver.findElement(By.name("search_query")).sendKeys("manish");
		
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	  //driver=new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjli\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","//System.setProperty(\"webdriver.chrome.driver\",\"C:\\\\Users\\\\Anjli\\\\Downloads\\\\chromedriver_win32 (6)\\\\chromedriver.exe\")");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Anjli\\Downloads\\geckodriver-v0.29.1-win64.zip\\geckodriver.exe");
		 //driver=new ChromeDriver();
	  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		//WebDriver driver= new FirefoxDriver();
		 Thread.sleep(3000);

	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
