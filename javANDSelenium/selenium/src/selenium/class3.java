package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3 {

public static void main (String []args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\december_practice\\all start_to_end\\javANDSelenium\\seleniumAndexe's\\chromedriver.exe");
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	
		
		Dimension d =new Dimension(200,200);
		driver.manage().window().setSize(d);
		
		Point p=new Point(500,500);
		driver.manage().window().setPosition(p);
		
	}
}
