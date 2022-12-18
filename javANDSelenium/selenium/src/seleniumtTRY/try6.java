package seleniumtTRY;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class try6 {
	
	public static void main(String []args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\december_practice\\all start_to_end\\javANDSelenium\\seleniumAndexe's\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://facebook.com");
		
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		Dimension d=new Dimension(400,500);
		driver.manage().window().setSize(d);
		
		Point p=new Point(500,500);
		
		driver.manage().window().setPosition(p);
		
		driver.manage().window().maximize();
		
		WebElement user=driver.findElement(By.xpath("//form//div//input"));
		user.sendKeys("pravinsamal");
		
		
		
		
		
	}

}
