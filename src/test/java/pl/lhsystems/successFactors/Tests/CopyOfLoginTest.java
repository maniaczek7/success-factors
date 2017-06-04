package pl.lhsystems.successFactors.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pl.lhsystems.successFactors.Pages.CopyOfLoginPage;
import pl.lhsystems.successFactors.Portlets.AdminCenterPortlet;
import pl.lhsystems.successFactors.Portlets.MyAdminFavouritePortlet;

public class CopyOfLoginTest extends SeleniumTest {
	
	private CopyOfLoginPage loginPage;
	
	private MyAdminFavouritePortlet myAdminFavouritePortlet;
	
	private AdminCenterPortlet AdminCenterPortlet;
	
	@BeforeClass
	public void createPage() throws IOException{
		loginPage = new CopyOfLoginPage(webDriver);
		loginPage.login("LHtraining", "LHSY", "hello11");
		AdminCenterPortlet = new AdminCenterPortlet(webDriver);
		AdminCenterPortlet.clickAdminCenterLink();
		myAdminFavouritePortlet = new MyAdminFavouritePortlet(webDriver);
	}
	
	@Test
	public void verifySuccesfullyLogin(){
		Assert.assertEquals(myAdminFavouritePortlet.checkAddNewEmployeeLinkIsDisplayed(),true);
	}
	
	@AfterClass
	public void clickAddNewEmployee(){
		myAdminFavouritePortlet.clickAddNewEmployeeLink();
//		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, myAdminFavouritePortlet.searchInput, "Add New Employee");
//		myAdminFavouritePortlet.clickAddNewEmployeeLink();
	}
}
