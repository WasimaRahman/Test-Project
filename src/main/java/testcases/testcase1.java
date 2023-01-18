package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.ClientAreaPage;
import Pages.InstallationPage;
import Pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class testcase1 extends ProjectSpecificWrappers {
	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="Shopping Mobile";
		browserName="chrome";
		dataSheetName="TC001";
		category="Sanity";
		authors="Wasima";
	}
	
	@Test
	public void testcase() throws InterruptedException{
		new LoginPage(driver,test)
		.enterUserName()
		.enterPassword()
		.clickIamnotRobot()
		.clickLogin();
		new ClientAreaPage (driver,test)
		.clickServices()
		.clickOrderNewServices();
		new InstallationPage (driver,test)
		.MobileApplications()
		.OrderNow ()
		.AddToCart()
		.Continue()
		.ReviewCheckout ()
		.Checkout ()
		.CompleteOrder ();
	//	.CloseBrowser();
	}

}
