package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouse_actions {
	
	public static void main (String []args) {
		
		WebDriver driver=openbrowser2.open("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement right=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
	
	Actions act =new Actions(driver);
	
//	act.contextClick(right);
//	act.perform();
	
	WebElement double1=driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
	
	act.doubleClick(double1);
	act.perform();
	
	
	Alert a=driver.switchTo().alert();
	a.accept();
	
	}

}
