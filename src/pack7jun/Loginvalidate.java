package pack7jun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginvalidate {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.get("http://orangehrm.qedgetech.com/");
 Thread.sleep(5000);
 WebElement element  = driver.findElement(By.name("txtUsername"));
 element.clear();
 element.sendKeys("Admin");
 WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
 password.clear();
 password.sendKeys("Qedge123!@#");
 driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
 Thread.sleep(5000);
 String expected = "dashboard";
 String actual = driver.getCurrentUrl();
 if((actual).contains(expected)) 
 {
	 System.out.println("Login suceess:"+expected+"  "+actual);
 }
	 else
	 {
		 String errormsg = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		 System.out.println(errormsg+"   " +expected+ "  " +actual);
	 }
	 driver.close();
		 
	 
	 
	 
 }
 
 
 
	}

