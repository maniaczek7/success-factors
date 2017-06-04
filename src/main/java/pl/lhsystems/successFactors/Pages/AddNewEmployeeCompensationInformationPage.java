package pl.lhsystems.successFactors.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pl.lhsystems.successFactors.employeeDAO.EMPLOYEE;

public class AddNewEmployeeCompensationInformationPage extends
		AddNewEmployeeMenubarPage {

	private WebDriver webDriver;
	// Compensation Information
	@FindBy(how = How.XPATH, using = ".//*[@aria-label='Job Level']/..")
	private WebElement JobLevelCombobox;

	@FindBy(how = How.XPATH, using = ".//*[@aria-label='Pay Type']/..")
	private WebElement PayTypeCombobox;

	@FindBy(how = How.XPATH, using = ".//*[@aria-label='Pay Group']/..")
	private WebElement PayGroupCombobox;

	@FindBy(how = How.XPATH, using = ".//label[text()='Notes']/following-sibling::div/*[contains(@id,'_write')]")
	private WebElement NotesTextArea;

	// Compensation

	// Pay targets
	
	// Bonus payments

	public AddNewEmployeeCompensationInformationPage(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
	}

	public void fillFields(EMPLOYEE employee) {

	}
}