package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class keuboard {
	public static void main (String []args){ 
		
		WebDriver driver=openbrowser2.open("https://demoqa.com/text-box");
		
		WebElement username=driver.findElement(By.xpath("//input[@id=\"userName\"]"));
		username.sendKeys("pravin");
		
		Actions act =new Actions(driver);
		
		act.sendKeys(Keys.TAB);
		act.perform();
		act.sendKeys("asdad");
		act.perform();

		act.sendKeys(Keys.TAB);
		act.sendKeys("solapur");
		act.build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.build().perform();
		
		act.keyUp(Keys.CONTROL);
		
		act.sendKeys(Keys.TAB);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);

		act.build().perform();
		
		
		
		
		
	}

}
