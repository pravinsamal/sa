package seleniumtTRY;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import selenium.openbrowser2;

public class ss {
	
	public static void main(String []args) throws IOException, InterruptedException {
		
		String name="pravin2";
		
		WebDriver driver=openbrowser2.open("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
	File source=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destinantion=new File("D:\\december_practice\\all start_to_end\\javANDSelenium\\ScrrenShot\\"+name+".jpg");
	
	FileHandler.copy(source, destinantion);
	}

}
