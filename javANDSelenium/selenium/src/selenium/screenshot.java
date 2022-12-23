package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	public static void shot(WebDriver driver) throws IOException {
		
	File source=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination =new File("D:\\december_practice\\all start_to_end\\javANDSelenium\\ScrrenShot\\f1.jpg");
	
	FileHandler.copy(source, destination);
	
	}

}
