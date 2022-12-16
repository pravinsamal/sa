package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver16may22 {
	
	
	public static void main (String []a) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\december_practice\\\\all start_to_end\\\\javANDSelenium\\\\seleniumAndexe's\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://facebook.com");

		driver.navigate().to("https://facebook.com");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
	System.out.println(	driver.getCurrentUrl());
	
	String q=driver.getTitle();
	
	System.out.println(q);
	
	String actualTitle="Facebook � log in or sign up";
	String currentTitle=driver.getTitle();
	if (actualTitle.equals(actualTitle)) {
		System.out.println("maching");
	}
	
		
	}

}
