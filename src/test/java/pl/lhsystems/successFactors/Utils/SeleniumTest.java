package pl.lhsystems.successFactors.Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.log4testng.Logger;

import pl.lhsystems.successFactors.employeeDAO.EMPLOYEE;

import com.paypal.selion.platform.dataprovider.DataProviderFactory;
import com.paypal.selion.platform.dataprovider.DataResource;
import com.paypal.selion.platform.dataprovider.SeLionDataProvider;
import com.paypal.selion.platform.dataprovider.impl.InputStreamResource;


public class SeleniumTest {
	
	protected static WebDriver webDriver;
	
	protected static final Logger LOGGER = Logger.getLogger(SeleniumTest.class);
	
	private static final String URL = "https://hcm12preview.sapsf.eu/";
	
	@BeforeTest
	public void setupBrowserAndLogIntoApplication(ITestContext context){
		webDriver = new FirefoxDriver();
		webDriver.manage().window().maximize();
		webDriver.get(URL);
		context.setAttribute("webDriver", webDriver);
	}

	@AfterTest
	public void exitBrowser(){
		webDriver.quit();
		LOGGER.info("Browser closed");
	}
	
	public static WebDriver getWebDriver(){
		return webDriver;
	}
	
	@DataProvider
	public Object[][] jsonDataProvider(ITestContext context) throws IOException{
		System.out.println(System.getProperty("jsonSelect"));
//		String testParam = context.getCurrentXmlTest().getParameter("test_param");
		DataResource resource = new InputStreamResource(new FileInputStream("src/test/resources/employee.json"), EMPLOYEE.class, "json");
		SeLionDataProvider dataProvider =  DataProviderFactory.getDataProvider(resource);
		Object[][] data = dataProvider.getAllData();
//		Object[][] data = dataProvider.getDataByIndex(new int[] {1}); //ustawic ten test_param
		return data;
	}
}
