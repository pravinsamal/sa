package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectdropDown {
	
	public static  void main (String []args) throws InterruptedException { 
		
		
		WebDriver driver=openbrowser2.open("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement d1=driver.findElement(By.xpath("(//select[@class=\"col-lg-3\"])[1]"));
		
		
		
		
		Select s1=new Select(d1);
		
		s1.selectByIndex(2);
		Thread.sleep(2000);
		
		s1.selectByValue("Google");
		s1.selectByVisibleText("Yahoo");
	}

}
