package selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xl2 {
	public static void main(String []args) throws EncryptedDocumentException, IOException {
		
		
		WebDriver driver=openbrowser2.open("https://www.browserstack.com/users/sign_in");

	WebElement user=driver.findElement(By.xpath("//input[@id=\"user_email_login\"]"));
	String pr=forxl.xl(0, 1);
	user.sendKeys(pr);
	
	WebElement pass=driver.findElement(By.xpath("//input[@id=\"user_password\"]"));
	String pr1=forxl.xl(1, 1);
	
	pass.sendKeys(pr1);
	}
	
	

}
