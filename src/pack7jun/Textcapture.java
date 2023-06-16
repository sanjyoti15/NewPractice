package pack7jun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textcapture {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.get("http://google.com");
 Thread.sleep(5000);
 String variable1 = driver.findElement(By.linkText("Gmail")).getText();
 System.out.println(variable1);
 String variable2 = driver.findElement(By.linkText("Gmail")).getAttribute("href");
 System.out.println(variable2);
 driver.close();
	}

}
