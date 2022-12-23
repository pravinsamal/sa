package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class movetoelement {
	
	public static void main (String []args) {
		
		WebDriver driver=openbrowser2.open("https://www.amazon.in/");
		
		WebElement am=driver.findElement(By.xpath("(//span[@class=\"nav-icon nav-arrow\"])[1]"));
		
		Actions act =new Actions(driver);
		act.moveToElement(am);
		act.perform();
	}

}
