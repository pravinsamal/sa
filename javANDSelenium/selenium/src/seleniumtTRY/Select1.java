package seleniumtTRY;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import selenium.openbrowser2;

public class Select1 {
	public static void main (String []args) throws IOException {
		
		WebDriver driver=openbrowser2.open("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement s1=driver.findElement(By.xpath("(//select[@class=\"col-lg-3\"])[1]"));
		
	String name="withname";
	
//		
//		Select a=new Select(s1);
//		
//		a.selectByIndex(1);
//		a.selectByVisibleText("Bing");
//		a.selectByValue("Google");
		
	File source=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination=new File("D:\\december_practice\\all start_to_end\\javANDSelenium\\ScrrenShot\\"+name+".jpg");
	
	FileHandler.copy(source, destination);
	
	
	
	}

}
