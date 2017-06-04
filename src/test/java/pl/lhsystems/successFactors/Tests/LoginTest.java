package pl.lhsystems.successFactors.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pl.lhsystems.successFactors.Pages.LoginPage;
import pl.lhsystems.successFactors.Portlets.AdminCenterPortlet;
import pl.lhsystems.successFactors.Portlets.MyAdminFavouritePortlet;

public class LoginTest extends SeleniumTest {
	
	private LoginPage loginPage;
	
	private MyAdminFavouritePortlet myAdminFavouritePortlet;
	
	private AdminCenterPortlet AdminCenterPortlet;
	
	@BeforeClass
	public void createPage(){
		loginPage = new LoginPage(webDriver);
		loginPage.login("LHtraining", "LHSY", "hello11");
		myAdminFavouritePortlet = new MyAdminFavouritePortlet(webDriver);
		AdminCenterPortlet = new AdminCenterPortlet(webDriver);
		AdminCenterPortlet.clickAdminCenterLink();
		myAdminFavouritePortlet = new MyAdminFavouritePortlet(webDriver);
	}
	
	@Test
	public void shouldSuccesfullyLogin(){
		Assert.assertEquals(myAdminFavouritePortlet.checkAddNewEmployeeLinkIsDisplayed(),true);
	}
	
	@AfterClass
	public void clickAddNewEmployee(){
		myAdminFavouritePortlet.clickAddNewEmployeeLink();
	}
}
