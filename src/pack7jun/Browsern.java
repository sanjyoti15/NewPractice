package pack7jun;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsern {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","e:/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		//luanch url
		dr.get("http://naukri.com");
		Thread.sleep(5000);
		dr.close();
		



	}

}
