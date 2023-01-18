package Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class ClientAreaPage extends ProjectSpecificWrappers  {

	public ClientAreaPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Client Area - PHPTRAVELS")){
			reportStep("This is not Client Area - PHPTRAVELS", "Fail");}
		}
	
	public ClientAreaPage clickServices() {
		clickByXpath("//ul[@class='dropdown-menu show']");
		return this;
		}
	public InstallationPage clickOrderNewServices() {
		clickByXpath("//a[contains(text(), 'Order New Services')]");
		return new InstallationPage( driver, test);
		}
		
	}


















