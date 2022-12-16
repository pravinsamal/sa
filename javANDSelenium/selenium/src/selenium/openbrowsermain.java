package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowsermain {
	
	public static WebDriver browser(String url) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\december_practice\\all start_to_end\\javANDSelenium\\seleniumAndexe's\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();

		return driver;
	}

}
