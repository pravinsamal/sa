package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import selenium.openbrowser2;

public class test1 {
	
	
	public void loginwithcred() throws EncryptedDocumentException, IOException {
	WebDriver driver=	openbrowser2.open("https://www.facebook.com/");
		
		login1 o1=new login1(driver);
//		String name=forxl1.xl(0, 1);
		o1.username("pravin");
		o1.password("1234569877");
		
	}
	public static void main (String []args) throws EncryptedDocumentException, IOException {
		
		test1 obj=new test1();
		obj.loginwithcred();
	}

}
