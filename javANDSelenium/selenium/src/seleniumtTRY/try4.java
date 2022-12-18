package seleniumtTRY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class try4 {

	
	public static void main(String []args) {
		
		WebDriver driver=try3.openbrowser("https://www.facebook.com/");
	
	WebElement user=	driver.findElement(By.xpath("//input[@id=\"email\"]"));
	
	user.sendKeys("pravinsamal");
	
	
	}
}
