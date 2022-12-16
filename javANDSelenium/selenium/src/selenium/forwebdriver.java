package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forwebdriver {
	
	public static void main(String []args) {
		
		
		WebDriver driver=  openbrowsermain.browser("https://www.facebook.com");
		
//		WebElement login=driver.findElement(By.tagName("button"));
//		login.click();	
		
//	WebElement username=	driver.findElement(By.id("email"));
//		username.sendKeys("pravin");
//		
//	WebElement pass=	driver.findElement(By.name("pass"));
//	pass.sendKeys("123546");

	
//	WebElement a=driver.findElement(By.className("_6ltg"));
//		
//		a.click();
	
	
		
//	WebElement login =	driver.findElement(By.cssSelector("input[type=\"text\"]"));
//	login.sendKeys("pravinsamal");

//	WebElement q=	driver.findElement(By.linkText("Forgotten password?"));
//	q.click();
		
		WebElement w=driver.findElement(By.partialLinkText("Forgotten"));
		w.click();
	
	
	}
		

}
  