package pl.lhsystems.successFactors.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pl.lhsystems.successFactors.TableRows.NationalIDDetailsTableRow;
import pl.lhsystems.successFactors.Utils.DateUtils;
import pl.lhsystems.successFactors.Utils.WebElementUtils;
import pl.lhsystems.successFactors.employeeDAO.EMPLOYEE;

public class AddNewEmployeeIdentityPage extends AddNewEmployeeMenubarPage{
	
	private WebDriver webDriver;	    	
	
	@FindBy(how=How.XPATH, using=".//*[@id='sfOverlayMgr']")
	private WebElement DropdownContainer;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Hire/Rehire Date']")
	private WebElement HireRehireDateInput;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Legal Entity']/..")
	private WebElement LegalEntityCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Event Reason']/..")
	private WebElement EventReasonCombobox;
	
	@FindBy(how=How.XPATH, using=".//label[text()='First Name']/following-sibling::input[contains(@id,'_write')]")
	private WebElement FirstNameInput;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Last Name']/following-sibling::input[contains(@id,'_write')]")
	private WebElement LastNameInput;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Middle Name']/following-sibling::input[contains(@id,'_write')]")
	private WebElement MiddleNameInput;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Salutation']/..")
	private WebElement SalutationCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Suffix']/..")
	private WebElement SuffixCombobox;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Birth Name']/following-sibling::input[contains(@id,'_write')]")
	private WebElement BirthNameInput;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Display Name']/following-sibling::input[contains(@id,'_write')]")
	private WebElement DisplayNameInput;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Date Of Birth']")
	private WebElement DateOfBirthInput;
	
	@FindBy(how=How.XPATH, using=".//tr[contains(@id,'1_row')]/td[1]/div/span/span/span[contains(@id,'_fieldborder')]")
	private WebElement CountryCombobox;
	
	@FindBy(how=How.XPATH, using=".//tr[contains(@id,'1_row')]/td[2]/div/span/span/span[contains(@id,'_fieldborder')]")
	private WebElement NationalIDCardTypeCombobox;
	
	@FindBy(how=How.XPATH, using=".//tr[contains(@id,'1_row')]/td[3]/div/span/span/span[contains(@id,'_fieldborder')]/input")
	private WebElement NationalIDInput;
	
	@FindBy(how=How.XPATH, using=".//tr[contains(@id,'1_row')]/td[4]/div/span/span/span[contains(@id,'_fieldborder')]")
	private WebElement IsPrimaryCombobox;

	@FindBy(how=How.XPATH, using=".//tr[contains(@id,'1_row')]/th/ul/li[1]/a")
	private WebElement DeleteRowButton;
	
	@FindBy(how=How.XPATH, using=".//table[@aria-label='National ID Details']//tr")
	private List<WebElement> NationalIDDetailsTableRowsList;
	
	public AddNewEmployeeIdentityPage(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(webDriver,15), this);
	}

	public void fillFields(EMPLOYEE employee) {
	 	WebElementUtils.sendKeys(webDriver,HireRehireDateInput, DateUtils.getTodayDate(employee.getHireDate()));
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, LegalEntityCombobox, employee.getLegalEntity());
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, EventReasonCombobox, employee.getEventReason());
		WebElementUtils.sendKeys(webDriver,FirstNameInput, employee.getFirstName()); //tutaj jest parametr z metody
		WebElementUtils.sendKeys(webDriver,LastNameInput, employee.getLastName());
		WebElementUtils.sendKeys(webDriver,MiddleNameInput, employee.getMiddleName());
		WebElementUtils.ariaComboboxSelectOptionWithoutAutocompletion(webDriver, SalutationCombobox, employee.getSalutation());
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, SuffixCombobox, employee.getSuffix());
		WebElementUtils.sendKeys(webDriver,DateOfBirthInput, employee.getDoB());
		
//		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, CountryCombobox, "United States");
//		WebElementUtils.ariaComboboxSelectOptionWithoutAutocompletion(webDriver, NationalIDCardTypeCombobox, "Social Security Number");
//		WebElementUtils.waitForElementToBeClickable(webDriver, NationalIDInput, 5);
//		WebElementUtils.sendKeys(webDriver,NationalIDInput, "123211234");
//		WebElementUtils.ariaComboboxSelectOptionWithoutAutocompletion(webDriver, IsPrimaryCombobox, "Yes");

//		List<WebElement> comboboxRows = webDriver.findElements(By.xpath("//table[@aria-label='National ID Details']//tr"));
		
//		WebElement combobox1 = NationalIDDetailsTableRows.get(1).findElement(By.xpath(".//td[1]//*[contains(@id,'_fieldborder')]"));
//		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, combobox1, "United States");
//		
//		System.out.println("size: " +  NationalIDDetailsTableRows.size());
		
		for (int i = 1; i < NationalIDDetailsTableRowsList.size() - 1 ; i++) {
			int j = 0;
			new NationalIDDetailsTableRow(webDriver, NationalIDDetailsTableRowsList.get(i))
			.fillRow(employee.getNationalIDDetails()[j].getCountry(),
					employee.getNationalIDDetails()[j].getIDCardType(),
					employee.getNationalIDDetails()[j].getIDNumber(),
					employee.getNationalIDDetails()[j].getIsPrimary());
			j++;
		}
	}
}