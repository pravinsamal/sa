package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframe2 {

	
	public static void main (String []args) {
		WebDriver driver =openbrowser2.open("https://demo.automationtesting.in/Frames.html");
		
//		driver.switchTo().frame(0);
		
//		driver.switchTo().frame("singleframe");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		driver.switchTo().frame(iframe);
		
		
		
		WebElement input=driver.findElement(By.xpath("//input[@type=\"text\"]"));
	
		input.sendKeys("pravin");
		
	
	
	}
}
