package pages;


import org.openqa.selenium.remote.RemoteWebDriver;
import com.aventstack.extentreports.ExtentTest;
import testNG.ProjectSpecificMethods;

public class GridView extends ProjectSpecificMethods{
	public GridView(RemoteWebDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public GridView alertWindow() {
		click(locateElement("xpath","//ion-icon[@aria-label='close circle outline']"));
	    return this;
	}
	public GridView iconDropdown() {
		click(locateElement("name","md-funnel"));
		click(locateElement("xpath","//ion-button[contains(@class,'filter-btn')]"));
		click(locateElement("xpath","(//ion-button[contains(@class,'ion-activatable')])[3]"));
		click(locateElement("xpath","(//ion-button[contains(@class,'ion-activatable')])[4]"));
		click(locateElement("xpath","(//ion-button[contains(@class,'ion-focusable')])[5]"));
		click(locateElement("xpath","(//ion-icon[contains(@class,'notSelecedFabIcon')])[2]"));
		return this;
	}
	public GridView colorIcons() {
		click(locateElement("classname","status-head md hydrated"));
		click(locateElement("classname","md unbounded hydrated"));
		click(locateElement("xpath","(//ion-row[contains(@class,'ion-activatable')])[7]"));
		return this;
	}
	 public MapView mapMenu() {
	    	click(locateElement("xpath","//ion-label[contains(text(),'Map')]"));
	    	return new MapView(driver,node);
	    }
	
}
