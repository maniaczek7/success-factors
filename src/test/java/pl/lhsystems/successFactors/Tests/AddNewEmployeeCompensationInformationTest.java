package pl.lhsystems.successFactors.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pl.lhsystems.successFactors.Pages.AddNewEmployeeCompensationInformationPage;
import pl.lhsystems.successFactors.employeeDAO.EMPLOYEE;

public class AddNewEmployeeCompensationInformationTest extends SeleniumTest {
	
	private AddNewEmployeeCompensationInformationPage addNewEmployeeCompensationInformationPage;
	
	@BeforeClass
	public void createPages(){
		addNewEmployeeCompensationInformationPage = new AddNewEmployeeCompensationInformationPage(webDriver);
	}
	
	@Test(dataProvider = "jsonDataProvider")
	public void fillCompensationFields(EMPLOYEE employee){
		addNewEmployeeCompensationInformationPage.fillFields(employee);
	}
		
	@AfterClass
	public void clickNextButton(){
		//save button
	}
}
