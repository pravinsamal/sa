package seleniumtTRY;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class try5 {
	
	
		
		public static void main (String []args) throws InterruptedException, IOException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\\\december_practice\\\\all start_to_end\\\\javANDSelenium\\\\seleniumAndexe's\\\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
//			driver.get("https://facebook.com");

			driver.navigate().to("https://facebook.com");
			
			FileInputStream file =new  FileInputStream("D:\\december_practice\\all start_to_end\\javANDSelenium\\testdata.xlsx");
			
		String usernameval=	WorkbookFactory.create(file).getSheet("data").getRow(0).getCell(1).getStringCellValue();
			
			WebElement username=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
			WebElement p1=driver.findElement(By.xpath("//input[@name=\"pass\"]"));
			username.sendKeys(usernameval);
			
			String pass=WorkbookFactory.create(file).getSheet("data").getRow(0).getCell(1).getStringCellValue();
	
			p1.sendKeys(pass);
			
//		File source=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File destination=new File("C:\\Users\\pravi\\OneDrive\\Desktop\\keys\\p1.jpg");
//		
//
//		
//		FileHandler.copy(source, destination);
//		
		
		}

}
