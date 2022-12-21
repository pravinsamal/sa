package seleniumtTRY;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.openbrowser2;

public class alert2 {
	
	public static void main (String []args) {
		
		WebDriver driver=openbrowser2.open("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement a=driver.findElement(By.xpath("//button[text()=\"Alert Box\"]"));
		
		a.click();
		
		Alert act=driver.switchTo().alert();
		
		act.accept();
	}

}
