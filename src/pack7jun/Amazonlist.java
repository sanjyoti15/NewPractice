package pack7jun;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazonlist {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Select element = new Select(driver.findElement(By.id("searchDropdownBox")));
		//verify listbox is single or multiple
		boolean value= element.isMultiple();
		System.out.println(value);
		List<WebElement> all_items= element.getOptions();
		for (WebElement each : all_items) {
			Thread.sleep(5000);
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.close();		}
		
		
		
		

	}


