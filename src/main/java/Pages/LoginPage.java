package Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class LoginPage extends ProjectSpecificWrappers {
	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Login - PHPTRAVELS")){
			reportStep("This is not Login Page", "Fail");
		}
	}
	public LoginPage enterUserName(){
		enterById("inputEmail", username);
		//clickByXpath("//input[@type='email']");
		return this;
	}
	public LoginPage enterPassword() throws InterruptedException{
		enterById("inputPassword", password);
		Thread.sleep(3000);
		return this;	
	}
	public LoginPage clickIamnotRobot(){
		clickByXpath ("//div[@class='recaptcha-checkbox-border']");
		return this;
	}
	public ClientAreaPage clickLogin(){
		clickById("login");
		return new ClientAreaPage(driver, test);
	}
}
