package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import testNG.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage(RemoteWebDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	
	public Alert alertBellIcon() {
		click(locateElement("xpath","(//ion-img[@class='md hydrated'])[3]"));
		return new Alert(driver,node);
	}
	public HomePage currentVehicle() {
		WebElement ele=locateElement("xpath","highcharts-point highcharts-color-3");
		Actions hover=new Actions(driver);
		hover.moveToElement(ele);
		return this;
	}
	public HomePage alertAccSum() {
		click(locateElement("xpath","//ion-radio[@id='Yesterday']"));
		click(locateElement("id","Last 7 Days"));
		click(locateElement("id","Current"));
		return this;
	}
	public HomePage unusedVehicleSum() {
		click(locateElement("xpath","(//ion-radio[contains(@id,'Last ')])[2]"));
		click(locateElement("xpath","(//ion-radio[contains(@id,'Yesterday')])[2]"));
		return this;
	}
	public HomePage odometerSum() {
		click(locateElement("xpath","(//ion-radio[@id='Last 7 Days'])[3]"));
		click(locateElement("xpath","(//ion-radio[@id='Yesterday'])[3]"));
		return this;
	}
	public HomePage distributionSum() {
		click(locateElement("xpath","(//ion-radio[@id='Last 7 Days'])[4]"));
		click(locateElement("xpath","(//ion-radio[@id='Yesterday'])[5]"));
		return this;
	}
	public HomePage topfOverspeedVehicle() {
		click(locateElement("xpath","(//ion-radio[@id='Last 7 Days' or @style='Last 7 Days'])[5]"));
		return this;
	}
	public GridView gridMenu() {
		click(locateElement("xpath","//ion-label[contains(text(),'Grid view')]"));
		return new GridView(driver,node);
	}
	
}
