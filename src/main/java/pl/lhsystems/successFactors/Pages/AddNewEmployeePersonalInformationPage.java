package pl.lhsystems.successFactors.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pl.lhsystems.successFactors.Utils.WebElementUtils;
import pl.lhsystems.successFactors.employeeDAO.EMPLOYEE;

public class AddNewEmployeePersonalInformationPage extends AddNewEmployeeMenubarPage{
	
	private WebDriver webDriver;	    	
	
	//Personal Information
	@FindBy(how=How.XPATH, using=".//label[text()='PK Number']/following-sibling::input[contains(@id,'_write')]")
	private WebElement PKNumberInput;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Person ID']/following-sibling::input[contains(@id,'_write')]")
	private WebElement PersonIDInput;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Local Employee ID']/following-sibling::input[contains(@id,'_write')]")
	private WebElement LocalEmployeeIDInput;
	
	@FindBy(how=How.XPATH, using=".//label[text()='National ID']/following-sibling::input[contains(@id,'_write')]")
	private WebElement NationalIDInput;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Title']/..")
	private WebElement TitleCombobox;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Preferred Name']/following-sibling::input[contains(@id,'_write')]")
	private WebElement PreferredNameInput;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Initials']/following-sibling::input[contains(@id,'_write')]")
	private WebElement InitialsInput;
 
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Gender']/..")
	private WebElement GenderCombobox;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Nationality']/..")
	private WebElement NationalityCombobox;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Second Nationality']/..")
	private WebElement SecondNationalityCombobox;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Third Nationality']/..")
	private WebElement ThirdNationalityCombobox;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Native Preferred Language']/..")
	private WebElement NativePreferredLanguageCombobox;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Marital Status']/..")
	private WebElement MaritalStatusCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Marital Status since']")
	private WebElement MaritalStatusSinceInput;	
	  
	@FindBy(how=How.XPATH, using=".//label[text()='Disability Status']/../following-sibling::td//*[contains(@id,'_fieldborder')]")
	private WebElement DisabilityStatusCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Disability Start Date']")
	private WebElement DisabilityStartDateInput;	
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Disability End Date']")
	private WebElement DisabilityEndDateInput;	

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Country of Birth']/..")
	private WebElement CountryOfBirthCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Date Of Death']")
	private WebElement DateOfDeathInput;		

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Retired']/..")
	private WebElement RetiredCombobox;
		
	@FindBy(how=How.XPATH, using=".//label[text()='Notes']/following-sibling::div/*[contains(@id,'_write')]")
	private WebElement NotesTextArea;		
	 	
	@FindBy(how=How.XPATH, using=".//label[text()='Number']/following-sibling::input[contains(@id,'_write')]")
	private WebElement NumberInput;
	 		
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Start Date']")
	private WebElement StartDateInput;	
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='End Date']")
	private WebElement EndDateInput;

	//Contact Information
	//Email information
	@FindBy(how=How.XPATH, using=".//table[@aria-label='Email Information']//tr[contains(@id,'1_row')]/td[1]//span[contains(@id,'_fieldborder')]")
	private WebElement EmailTypeCombobox;
	
	@FindBy(how=How.XPATH, using=".//table[@aria-label='Email Information']//tr[contains(@id,'1_row')]/td[2]//span[contains(@id,'_fieldborder')]/input")
	private WebElement EmailAddressInput;
	
	@FindBy(how=How.XPATH, using=".//table[@aria-label='Email Information']//tr[contains(@id,'1_row')]/td[3]//span[contains(@id,'_fieldborder')]")
	private WebElement IsPrimaryEmailCombobox;

	//Phone Information
	@FindBy(how=How.XPATH, using=".//table[@aria-label='Phone Information']//tr[contains(@id,'1_row')]/td[1]//span[contains(@id,'_fieldborder')]")
	private WebElement PhoneTypeCombobox;
	
	@FindBy(how=How.XPATH, using=".//table[@aria-label='Phone Information']//tr[contains(@id,'1_row')]/td[2]//span[contains(@id,'_fieldborder')]/input")
	private WebElement CountryCodeInput;
	
	@FindBy(how=How.XPATH, using=".//table[@aria-label='Phone Information']//tr[contains(@id,'1_row')]/td[3]//span[contains(@id,'_fieldborder')]/input")
	private WebElement AreaCodeInput;
	
	@FindBy(how=How.XPATH, using=".//table[@aria-label='Phone Information']//tr[contains(@id,'1_row')]/td[4]//span[contains(@id,'_fieldborder')]/input")
	private WebElement PhoneNumberInput;
	
	@FindBy(how=How.XPATH, using=".//table[@aria-label='Phone Information']//tr[contains(@id,'1_row')]/td[5]//span[contains(@id,'_fieldborder')]/input")
	private WebElement ExtensionInput;
	
	@FindBy(how=How.XPATH, using=".//table[@aria-label='Phone Information']//tr[contains(@id,'1_row')]/td[6]//span[contains(@id,'_fieldborder')]")
	private WebElement IsPrimaryPhoneCombobox;
	
//do adresu	
	//.//span[text()='Address']/../../div[2]//div[@class='baseLayout ECTFormLayout']
	
	
	//Address
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Address Type']/..")
	private WebElement AddressTypeCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Country']/..")
	private WebElement CountryCombobox;
	 	
	@FindBy(how=How.XPATH, using=".//label[text()='Care of/c/o']/following-sibling::input[contains(@id,'_write')]")
	private WebElement CareOfCOInput;
		
	@FindBy(how=How.XPATH, using=".//label[text()='Address Line 1 test']/following-sibling::input[contains(@id,'_write')]")
	private WebElement AddressLine1TestInput;
		
	@FindBy(how=How.XPATH, using=".//label[text()='Address Line 2 test']/following-sibling::input[contains(@id,'_write')]")
	private WebElement 	AddressLine2TestInput;
		
	@FindBy(how=How.XPATH, using=".//label[text()='City']/following-sibling::input[contains(@id,'_write')]")
	private WebElement CityInput;
		
	@FindBy(how=How.XPATH, using=".//label[text()='County']/following-sibling::input[contains(@id,'_write')]")
	private WebElement CountyInput;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='State']/..")
	private WebElement StateCombobox;
	 	
	@FindBy(how=How.XPATH, using=".//label[text()='ZIP']/following-sibling::input[contains(@id,'_write')]")
	private WebElement ZIPInput;
	
	public AddNewEmployeePersonalInformationPage(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(webDriver,15), this);
	}

	public void fillPersonalInformation(EMPLOYEE employee){
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, NationalityCombobox, employee.getNationality());
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, MaritalStatusCombobox, employee.getMartialStatus());
		WebElementUtils.ariaComboboxSelectOptionWithoutAutocompletion(webDriver, RetiredCombobox, employee.getRetired());
	}
	
	public void fillContactInformation(EMPLOYEE employee){
		//Email
		WebElementUtils.ariaComboboxSelectOptionWithoutAutocompletion(webDriver, EmailTypeCombobox, employee.getEmailDetails()[0].geteMailType());
		WebElementUtils.sendKeys(webDriver,EmailAddressInput, employee.getEmailDetails()[0].geteMailAddress());
		WebElementUtils.ariaComboboxSelectOptionWithoutAutocompletion(webDriver, IsPrimaryEmailCombobox, employee.getEmailDetails()[0].getIsPrimaryEmail());
		//Phone
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, PhoneTypeCombobox, employee.getPhoneDetails()[0].getPhoneType());
		WebElementUtils.click(webDriver, CountryCodeInput);
		WebElementUtils.sendKeys(webDriver,CountryCodeInput, employee.getPhoneDetails()[0].getCountryCode());
		WebElementUtils.sendKeys(webDriver,AreaCodeInput, employee.getPhoneDetails()[0].getAreaCode());
		WebElementUtils.sendKeys(webDriver,PhoneNumberInput, employee.getPhoneDetails()[0].getPhoneNumber());
//		new Actions(webDriver).moveToElement(IsPrimaryPhoneCombobox).perform();
//		((JavascriptExecutor) webDriver).executeScript("document.getElementById('newHirePage').getElementsByClassName('fryFloating globalBackground')[0].className = 'hideTopBar'");
		WebElementUtils.sendKeys(webDriver,IsPrimaryPhoneCombobox, Keys.ARROW_RIGHT);
		WebElementUtils.sendKeys(webDriver,IsPrimaryPhoneCombobox, Keys.ARROW_RIGHT);
		WebElementUtils.sendKeys(webDriver,IsPrimaryPhoneCombobox, Keys.ARROW_RIGHT);
		WebElementUtils.sendKeys(webDriver,IsPrimaryPhoneCombobox, Keys.ARROW_RIGHT);
		WebElementUtils.sendKeys(webDriver,IsPrimaryPhoneCombobox, Keys.ARROW_RIGHT);
//		Thread.sleep(1000);
		WebElementUtils.ariaComboboxSelectOptionWithoutAutocompletion(webDriver, IsPrimaryPhoneCombobox, employee.getPhoneDetails()[0].getIsPrimaryPhone());
//		((JavascriptExecutor) webDriver).executeScript("document.getElementById('newHirePage').getElementsByClassName('hideTopBar')[0].className = 'fryFloating globalBackground'");
	}
	
	public void fillAddress(EMPLOYEE employee){
		WebElementUtils.sendKeys(webDriver,AddressLine1TestInput, employee.getAddressDetails()[0].getAddressLine1());
		WebElementUtils.sendKeys(webDriver,CityInput, employee.getAddressDetails()[0].getCity());
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, StateCombobox, employee.getAddressDetails()[0].getState());
		WebElementUtils.sendKeys(webDriver,ZIPInput, employee.getAddressDetails()[0].getZIP());
	}
	
	public String getPKNumberInputValue() {
		return WebElementUtils.getValue(webDriver, PKNumberInput);
	}
	
	public String getGenderComboboxValue() {
		return WebElementUtils.getAriaComboboxValue(webDriver, GenderCombobox);
	}
	
	public String getDisabilityStatusComboboxValue() {
		return WebElementUtils.getAriaComboboxValue(webDriver, DisabilityStatusCombobox);
	}
	
	public String getAddressTypeComboboxValue() {
		return WebElementUtils.getAriaComboboxValue(webDriver, AddressTypeCombobox);
	}
	
	public String getCountryComboboxValue() {
		return WebElementUtils.getAriaComboboxValue(webDriver, CountryCombobox);
	}
	
	public String getStateComboboxValue() {
		return WebElementUtils.getAriaComboboxValue(webDriver, StateCombobox);
	}
}

