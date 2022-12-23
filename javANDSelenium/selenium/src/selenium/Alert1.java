package selenium;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alert1 {
	public static void main (String []args) throws InterruptedException, IOException {
		
		WebDriver driver=openbrowser2.open("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement a1=driver.findElement(By.xpath("//button[@name=\"alertbox\"]"));
		
		a1.click();
		
		Thread.sleep(2000);

	Alert b=driver.switchTo().alert();
	
	b.accept();
	Thread.sleep(2000);

//	WebElement b1=driver.findElement(By.xpath("//button[@name=\"confirmalertbox\"]"));
//		b1.click();
	
	screenshot.shot(driver);
	b.dismiss()
;	}

}
