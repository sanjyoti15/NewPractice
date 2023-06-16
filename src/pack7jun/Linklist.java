package pack7jun;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linklist {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.navigate().to("http://primusbank.qedgetech.com/");
 List<WebElement>alllinks= driver.findElements(By.tagName("a"));
 System.out.println("no.of links are::"+alllinks.size());
 Thread.sleep(5000);
 for (WebElement each : alllinks) {
	 Thread.sleep(5000);
	 System.out.println(each.getText());
 }
 Thread.sleep(5000);
 driver.close();
	
}
 
	}


