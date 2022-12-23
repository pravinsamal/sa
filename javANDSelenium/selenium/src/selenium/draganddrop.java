package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	
	public static void main  (String []args) {
		
		
		WebDriver driver=openbrowser2.open("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement f1=driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(f1);
		
		WebElement d1=driver.findElement(By.xpath("(//li[contains(@class,\"ui-widget-content \")])[1]"));
		
		WebElement d2=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(d1, d2);
		act.perform();

	}

}
