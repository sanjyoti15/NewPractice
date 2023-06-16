package pack7jun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","e:/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.get("http://google.com");
  Thread.sleep(5000);
  String expectedtitle= "google";
  String actualtitle= driver.getTitle();
  if(expectedtitle.equalsIgnoreCase(actualtitle))
  {
	  System.out.println("title is matching: " +expectedtitle +"  "+actualtitle);
	  		
  }
  else
  {
	 
  System.out.println("title not matching");
		
  }
  
  driver.quit();
	}
  
}
