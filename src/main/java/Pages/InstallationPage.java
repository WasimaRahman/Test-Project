package Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class InstallationPage extends ProjectSpecificWrappers  {

	public InstallationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Shopping Cart - PHPTRAVELS")){
			reportStep("This is not Shopping Cart - PHPTRAVELS", "Fail");}
	}
	
	public InstallationPage MobileApplications() {
		clickByXpath("//a[@id='product1-order-button']");
		return this;
	}
	
	public InstallationPage OrderNow () {
		clickByXpath("//a[@id='product1-order-button']");
		return this;	
	}
	public InstallationPage AddToCart() {
		clickByXpath("//div[@class='panel-add']");
		return this;	
	}
	public InstallationPage Continue() {
		clickByXpath("//button[@type='submit']");
		return this;
	}
	public InstallationPage ReviewCheckout () {
		clickByXpath("//span[contains(text(), 'Mobile')]");
		return this;
	}
    public InstallationPage Checkout () {
    	clickByXpath ("//a[@id='checkout']");
		return this;
    }
    public InstallationPage CompleteOrder () {
    	clickByXpath("//i[@class='fas fa-arrow-circle-right']");
		return this;
    }
    public InstallationPage CloseBrowser() {
    	driver.close();
    return this;
    }
}