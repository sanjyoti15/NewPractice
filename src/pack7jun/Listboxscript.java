package pack7jun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxscript {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.navigate().to("https://www.amazon.in/");
 Thread.sleep(5000);
 Select element = new Select(driver.findElement(By.id("searchDropdownBox")));
 //is listbox multiple
 boolean value = element.isMultiple();
 System.out.println(value);
 element.selectByVisibleText("Books");
 Thread.sleep(5000);
 element.selectByIndex(15);
 Thread.sleep(5000);
 System.out.println(element.getFirstSelectedOption().getText());
 Thread.sleep(5000);
 driver.close();
 
	}

}
