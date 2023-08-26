package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import testNG.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage(RemoteWebDriver driver, ExtentTest node ) {
		this.driver=driver;
		this.node=node;
	}
	
	
	public LoginPage companyName(String data) {
		WebElement ele=locateElement("xpath","//input[@placeholder='Company id']");
		ele.sendKeys(data);
		return this;
	}
	public LoginPage userName(String data) {
		WebElement ele=locateElement("xpath","//input[@placeholder='User name']");
		ele.sendKeys(data);
		return this;
	}
	public LoginPage password(String data) {
		WebElement ele=locateElement("xpath","(//input[@placeholder='Password'])");
		ele.sendKeys(data);
		return this;
		
	}
	public HomePage clickLogin() {
		click(locateElement("xpath","//ion-button[text()=' Login ']"));
		return new HomePage(driver,node);
	}

}
