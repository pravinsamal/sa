package seleniumtTRY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class try5 {
	
	
		
		public static void main (String []args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\\\december_practice\\\\all start_to_end\\\\javANDSelenium\\\\seleniumAndexe's\\\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
//			driver.get("https://facebook.com");

			driver.navigate().to("https://facebook.com");
			
			WebElement username=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
	
			username.sendKeys("pravin");
		
		}

}
