package mypackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class switchto 
{
WebDriver driver;

  @Test
  public void f() throws Exception 
  {
	  driver.get("https://nichethyself.com/tourism/customised.html");
	  //Thread.sleep(2000);
	  driver.findElement(By.className("link")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/span")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	 driver=new ChromeDriver();
	 
  }

  @AfterMethod
  public void afterMethod() 
  {
	  //driver.quit();
  }

}
