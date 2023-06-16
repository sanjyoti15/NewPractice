package pack7jun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commansnavigation {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.navigate().to("https://www.google.com/");
Thread.sleep(5000);
System.out.println("pagetitle::"+ driver.getTitle());
driver.findElement(By.linkText("Gmail")).click();
Thread.sleep(5000);
driver.navigate().back();
System.out.println("pagetitle::"+ driver.getTitle());

driver.navigate().forward();
System.out.println("pagetitle::"+ driver.getTitle());
driver.navigate().refresh();
Thread.sleep(5000);
driver.close();

	}

}
