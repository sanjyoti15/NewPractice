package pack7jun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","e:/chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http://primusbank.qedgetech.com/");
Thread.sleep(5000);
driver.findElement(By.name("txtuId")).sendKeys("Admin");
driver.findElement(By.id("txtPword")).sendKeys("Admin");
driver.findElement(By.id("login")).click();
Thread.sleep(5000);
driver.close();


	}

}
