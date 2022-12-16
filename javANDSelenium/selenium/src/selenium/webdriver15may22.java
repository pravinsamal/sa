package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver15may22 {
	
	public static void main (String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\december_practice\\all start_to_end\\javANDSelenium\\seleniumAndexe's\\chromedriver.exe");

	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		driver.navigate().to("https://facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
