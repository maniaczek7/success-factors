package pl.lhsystems.successFactors.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pl.lhsystems.successFactors.Pages.AddNewEmployeePersonalInformationPage;
import pl.lhsystems.successFactors.employeeDAO.EMPLOYEE;

public class AddNewEmployeePersonalInformationTest extends SeleniumTest {
	
	private AddNewEmployeePersonalInformationPage addNewEmployeePersonalInformationPage;
	
	@BeforeClass
	public void createPages(){
		addNewEmployeePersonalInformationPage = new AddNewEmployeePersonalInformationPage(webDriver);
	}
	
	@Test
	public void verifyAddNewEmployeePersonalInformationTest(){
		Assert.assertEquals(addNewEmployeePersonalInformationPage.getPKNumberInputValue(), "NoValue");
		Assert.assertEquals(addNewEmployeePersonalInformationPage.getGenderComboboxValue(), "Male");
		Assert.assertEquals(addNewEmployeePersonalInformationPage.getDisabilityStatusComboboxValue(), "No");
		Assert.assertEquals(addNewEmployeePersonalInformationPage.getAddressTypeComboboxValue(), "Home");
		Assert.assertEquals(addNewEmployeePersonalInformationPage.getCountryComboboxValue(), "United States");
	}
	
	@Test(dataProvider = "jsonDataProvider", priority = 2)
	public void fillPersonalInformationFields(EMPLOYEE employee){
			addNewEmployeePersonalInformationPage.fillPersonalInformation(employee);
	}
	
	@Test(dataProvider = "jsonDataProvider", priority = 1)
	public void fillContactInformationFields(EMPLOYEE employee){
			addNewEmployeePersonalInformationPage.fillContactInformation(employee);
	}
	
	@Test(dataProvider = "jsonDataProvider", priority = 2)
	public void fillAddressFields(EMPLOYEE employee){
			addNewEmployeePersonalInformationPage.fillAddress(employee);
	}
	
	@AfterClass
	public void clickNextButton(){
		addNewEmployeePersonalInformationPage.clickNextButton();
	}
}
