package selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookPOM {
	
	
	
	public void username(WebDriver driver ,String name) {
		WebElement user=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		user.sendKeys(name);
	}
	
	public void password(WebDriver driver) {
		WebElement pass=driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		pass.sendKeys("pravin");
	}
	
	public void login(WebDriver driver) {
		WebElement log=driver.findElement(By.xpath("//button[@name=\"login\"]"));

	log.click();
	}
	
	
	public static void main (String []args) throws EncryptedDocumentException, IOException {
		WebDriver driver=openbrowser2.open("https://www.facebook.com/");
		facebookPOM obj=new facebookPOM();
		String u1=forxl.xl(0, 1);
		obj.username(driver, u1);
	}

}
