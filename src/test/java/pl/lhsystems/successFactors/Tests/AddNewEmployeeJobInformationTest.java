package pl.lhsystems.successFactors.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pl.lhsystems.successFactors.Pages.AddNewEmployeeJobInformationPage;
import pl.lhsystems.successFactors.Utils.DateUtils;
import pl.lhsystems.successFactors.employeeDAO.EMPLOYEE;

public class AddNewEmployeeJobInformationTest extends SeleniumTest {
	
	private AddNewEmployeeJobInformationPage addNewEmployeeJobInformationPage;
	
	@BeforeClass
	public void createPages(){
		addNewEmployeeJobInformationPage = new AddNewEmployeeJobInformationPage(webDriver);
	}
	
	@Test(priority = 1)
	public void verifyAddNewEmployeeJobInformationTest(){
		Assert.assertEquals(addNewEmployeeJobInformationPage.getLegalEntityComboboxValue(), "LSG North America Solutions (7...");
		Assert.assertEquals(addNewEmployeeJobInformationPage.getHireRehireDateInputValue(), DateUtils.getTodayDate("MM/dd/yyyy"));
		Assert.assertEquals(addNewEmployeeJobInformationPage.getOriginalHireDateInputValue(), DateUtils.getTodayDate("MM/dd/yyyy"));
		Assert.assertEquals(addNewEmployeeJobInformationPage.getTravelPriorityDateInputValue(), DateUtils.getTodayDate("MM/dd/yyyy"));
		Assert.assertEquals(addNewEmployeeJobInformationPage.getAnniversaryDateInputValue(), DateUtils.getTodayDate("MM/dd/yyyy"));
	}
	
	@Test(dataProvider = "jsonDataProvider", priority = 2)
	public void fillJobInformationFields(EMPLOYEE employee){		
		addNewEmployeeJobInformationPage.fillFields(employee);
	}
	
	@AfterClass
	public void clickNextButton(){
		addNewEmployeeJobInformationPage.clickNextButton();
	}
}
