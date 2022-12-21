package seleniumtTRY;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class j {
	
	public static void main (String []args) {
		
		System.setProperty("web.chrome.driver", "D:\\\\december_practice\\\\all start_to_end\\\\javANDSelenium\\\\seleniumAndexe's\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement user=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		user.sendKeys("pravin");
		
//		driver.navigate().back();
//		driver.navigate().forward();
//		
//		Dimension d=new Dimension(400,500);
//		driver.manage().window().setSize(d);
//		
//		Point p=new Point(400,500);
//		
//		driver.manage().window().setPosition(p);
		
		
		
	}

}
