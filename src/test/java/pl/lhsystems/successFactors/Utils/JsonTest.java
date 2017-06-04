package pl.lhsystems.successFactors.Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pl.lhsystems.successFactors.employeeDAO.EMPLOYEE;

import com.paypal.selion.platform.dataprovider.DataProviderFactory;
import com.paypal.selion.platform.dataprovider.DataResource;
import com.paypal.selion.platform.dataprovider.SeLionDataProvider;
import com.paypal.selion.platform.dataprovider.impl.InputStreamResource;

public class JsonTest {
	
	@Test(dataProvider = "jsonDataProvider")
	public void testMethod(EMPLOYEE employee) {
		System.out.println(employee.getHireDate());
		System.out.println(employee.getLegalEntity());
		System.out.println(employee.getEventReason());
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getMiddleName());
		System.out.println(employee.getSalutation());
		System.out.println(employee.getSuffix());
		System.out.println(employee.getDoB());
		System.out.println(employee.getNationalIDDetails()[0].getCountry());
		System.out.println(employee.getNationalIDDetails()[0].getIDCardType());
		System.out.println(employee.getNationalIDDetails()[0].getIDNumber());
		System.out.println(employee.getNationalIDDetails()[0].getIsPrimary());
		System.out.println(employee.getNationality());
		System.out.println(employee.getMartialStatus());
		System.out.println(employee.getRetired());
		System.out.println(employee.getEmailDetails()[0].geteMailType());
		System.out.println(employee.getEmailDetails()[0].geteMailAddress());
		System.out.println(employee.getEmailDetails()[0].getIsPrimaryEmail());
		System.out.println(employee.getPhoneDetails()[0].getPhoneType());
		System.out.println(employee.getPhoneDetails()[0].getCountryCode());
		System.out.println(employee.getPhoneDetails()[0].getAreaCode());
		System.out.println(employee.getPhoneDetails()[0].getPhoneNumber());
		System.out.println(employee.getPhoneDetails()[0].getIsPrimaryPhone());
		System.out.println(employee.getAddressDetails()[0].getAddressLine1());
		System.out.println(employee.getAddressDetails()[0].getCity());
		System.out.println(employee.getAddressDetails()[0].getState());
		System.out.println(employee.getAddressDetails()[0].getZIP());
		System.out.println(employee.getPosition());
		System.out.println(employee.getCostCenter());
		System.out.println(employee.getJobCode());
		System.out.println(employee.getRegularTemporary());
		System.out.println(employee.getStandardHoursPerWeek());
		System.out.println(employee.getWorkingDaysPerWeek());
		System.out.println(employee.getContractEndDate());
		System.out.println(employee.getEmployeeType());
		System.out.println(employee.getEmployeeClass());
		System.out.println(employee.getDateOfCommencementOfWorkInput());

	}
	
	@DataProvider
	public Object[][] jsonDataProvider(ITestContext context) throws IOException{
//		String testParam = context.getCurrentXmlTest().getParameter("test_param");
		DataResource resource = new InputStreamResource(new FileInputStream("src/test/resources/employee.json"), EMPLOYEE.class, "json");
		SeLionDataProvider dataProvider =  DataProviderFactory.getDataProvider(resource);
		Object[][] data = dataProvider.getAllData();
//		Object[][] data = dataProvider.getDataByIndex(new int[] {1}); //ustawic ten test_param
		return data;
	}
}
