package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframe {
	public static void main (String []args) {
		
		WebDriver driver=openbrowser2.open("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		//driver.switchTo().frame(0);
		WebElement a=driver.findElement(By.xpath("//iframe[@name=\"SingleFrame\"]"));
		driver.switchTo().frame(a);
		WebElement input=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		
		input.sendKeys("pravin");
	}

}
