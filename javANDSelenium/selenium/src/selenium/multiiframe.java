package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class multiiframe {
	
	public static void main (String []args) {
		
		WebDriver driver=openbrowser2.open("https://demo.automationtesting.in/Frames.html");
	WebElement secondiframe=	driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
	
	secondiframe.click();
	
WebElement first=	driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
driver.switchTo().frame(first);

	WebElement second=driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
	driver.switchTo().frame(second);
WebElement input=	driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));


	input.sendKeys("pravin");
	
	
	driver.switchTo().defaultContent();   
	
WebElement single=	driver.findElement(By.xpath("(//a[@class=\"analystic\"])[1]"));
	
	single.click();
	
	}

}
