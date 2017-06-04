package pl.lhsystems.successFactors.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pl.lhsystems.successFactors.Pages.AddNewEmployeeIdentityPage;
import pl.lhsystems.successFactors.employeeDAO.EMPLOYEE;

public class AddNewEmployeeIdentityTest extends SeleniumTest {
	
	private AddNewEmployeeIdentityPage addNewEmployeeIdentityPage;
	
	@BeforeClass
	public void createPages(){
		addNewEmployeeIdentityPage = new AddNewEmployeeIdentityPage(webDriver);
	}
	
	@Test(dataProvider = "jsonDataProvider")
	public void fillIdentityFieldsTest(EMPLOYEE employee){
		addNewEmployeeIdentityPage.fillFields(employee);
	}
	
	@AfterClass
	public void clickNextButton(){
		addNewEmployeeIdentityPage.clickNextButton();
	}
}
