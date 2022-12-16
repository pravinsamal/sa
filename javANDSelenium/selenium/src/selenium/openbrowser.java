package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
	
	public static void main (String []args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\december_practice\\all start_to_end\\javANDSelenium\\seleniumAndexe's\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
	}

}
