package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 {
	
	@FindBy (xpath = "//input[@id=\"email\"]")private WebElement user;
	@FindBy(xpath = "//input[@name=\"pass\"]")private WebElement pass;
	public login1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void username(String name) {
		user.sendKeys(name);
	}
	
	public void password(String pass1) {
pass.sendKeys(pass1);
}
}