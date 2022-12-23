package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XL {
	
	
	
	public static String  test() throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("D:\\december_practice\\all start_to_end\\javANDSelenium\\testdata.xlsx");
		
	String val=	WorkbookFactory.create(file).getSheet("data").getRow(0).getCell(1).getStringCellValue();
	return val;	 
		
	}

	
	public static void main (String [] args) throws EncryptedDocumentException, IOException {
		
	WebDriver driver=	openbrowser2.open("https://www.facebook.com/");
	
	WebElement user=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	
	
	String q=	XL.test();

	System.out.println(q);
	user.sendKeys(q);
	
	}
}
