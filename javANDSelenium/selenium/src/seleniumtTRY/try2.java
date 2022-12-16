package seleniumtTRY;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class try2 {
	
	public static void main(String []a) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\december_practice\\\\all start_to_end\\\\javANDSelenium\\\\seleniumAndexe's\\\\chromedriver.exe");;
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
//		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		/* Dimension d=new Dimension(400,500);
		driver.manage().window().setSize(d);
		
		Point p=new Point(600,900);
		
		driver.manage().window().setPosition(p);*/
		
		
		
		
	}

}
