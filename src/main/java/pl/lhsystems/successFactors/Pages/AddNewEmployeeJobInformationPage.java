package pl.lhsystems.successFactors.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pl.lhsystems.successFactors.Utils.WebElementUtils;
import pl.lhsystems.successFactors.employeeDAO.EMPLOYEE;

public class AddNewEmployeeJobInformationPage extends AddNewEmployeeMenubarPage{
	
	private WebDriver webDriver;	    	
	
	@FindBy(how=How.XPATH, using=".//label[text()='First Name']/following-sibling::input[contains(@id,'_write')]")
	private WebElement FirstNameInput;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Date Of Birth']")
	private WebElement DateOfBirthInput;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Event Reason']/..")
	private WebElement EventReasonCombobox;
//
	
	//Target Position
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Incumbent of Parent Position']/..")
	private WebElement IncumbentofParentPositionCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Position']/..")
	private WebElement PositionCombobox;
	
	//Job Information
	//Organization Information
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Group Company']/..")
	private WebElement GroupCompanyCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Level 1']/..")
	private WebElement Level1Combobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Level 2']/..")
	private WebElement Level2Combobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Legal Entity']/..")
	private WebElement LegalEntityCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Business Unit']/..")
	private WebElement BusinessUnitCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Division']/..")
	private WebElement DivisionCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Departament']/..")
	private WebElement DepartamentCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Team']/..")
	private WebElement TeamCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Cost Center']/..")
	private WebElement CostCenterCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Location']/..")
	private WebElement LocationCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Geozone']/..")
	private WebElement GeozoneCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Location Group']/..")
	private WebElement LocationGroupCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Timezone']/..")
	private WebElement TimezoneCombobox;
	
	//Job Information
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Supervisor']/..")
	private WebElement SupervisorCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Job Code']/..")
	private WebElement JobCodeCombobox;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Job Title']/following-sibling::input[contains(@id,'_write')]")
	private WebElement JobTitleInput;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Local Job Title']/following-sibling::input[contains(@id,'_write')]")
	private WebElement LocalJobTitleInput;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Regular/Temporary']/..")
	private WebElement RegularTemporaryCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Part-Time']/..")
	private WebElement PartTimeCombobox;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Standard Hours Per Week']/following-sibling::input[contains(@id,'_write')]")
	private WebElement StandardHoursPerWeekInput;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Working Days per Week']/following-sibling::input[contains(@id,'_write')]")
	private WebElement WorkingDaysPerWeekInput;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Contract End Date']")
	private WebElement ContractEndDateInput;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Pay Grade']/..")
	private WebElement PayGradeCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Flight Benefits']/..")
	private WebElement FlightBenefitsCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Extension Until']/..")
	private WebElement ExtensionUntilCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Employee Type']/..")
	private WebElement EmployeeTypeCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Employee Class']/..")
	private WebElement EmployeeClassCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Supervisor Level']/..")
	private WebElement SupervisorLevelCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Cross Border Worker']/..")
	private WebElement CrossBorderWorkerCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Competition Clause']/..")
	private WebElement CompetitionClauseCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Sideline Job Allowed']/..")
	private WebElement SidelineJobAllowedCombobox;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Notice Period']/following-sibling::input[contains(@id,'_write')]")
	private WebElement NoticePeriodCombobox;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Notes']/following-sibling::div/*[contains(@id,'_write')]") //Do poprawki w konkretnym Portlecie!
	private WebElement JobInformationArea;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Holiday Calendar']/..")
	private WebElement HolidayCalendarCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Work Schedule']/..")
	private WebElement WorkScheduleCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Time Profile']/..")
	private WebElement TimeProfileCombobox;

	
	//Time Off Information
	
	
	
	
	
	
	//Employement Date Details
	@FindBy(how=How.XPATH, using=".//*[@aria-label='Hire/Rehire Date']")
	private WebElement HireRehireDateInput;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Original Hire Date']")
	private WebElement OriginalHireDateInput;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Travel Priority Date']")
	private WebElement TravelPriorityDateInput;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Group Start Date']")
	private WebElement GroupStartDateInput;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Anniversary Date']")
	private WebElement AnniversaryDateInput;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Holiday Calculation Date']")
	private WebElement HolidayCalculationDateInput;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Probation End Date']")
	private WebElement ProbationEndDateInput;

	@FindBy(how=How.XPATH, using=".//*[@aria-label='Date of Commencement of Work']")
	private WebElement DateOfCommencementOfWorkInput;
	
	@FindBy(how=How.XPATH, using=".//label[text()='Notes']/following-sibling::div/*[contains(@id,'_write')]")
	private WebElement DateNotesTextArea;
	
	
	
	
	
	//Additional Job Relationships
	
	
	
	
	
	
	//Work Permit Information 
	
	
	
	
	
	
	
	
	
	
	
	public AddNewEmployeeJobInformationPage(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(webDriver,15), this);
	}

	public void fillFields(EMPLOYEE employee) {
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, PositionCombobox, employee.getPosition());
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, CostCenterCombobox, employee.getCostCenter());
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, JobCodeCombobox, employee.getJobCode());
		WebElementUtils.ariaComboboxSelectOptionWithoutAutocompletion(webDriver, RegularTemporaryCombobox, employee.getRegularTemporary());
		WebElementUtils.sendKeys(webDriver,StandardHoursPerWeekInput, Keys.chord(Keys.CONTROL,"a") + employee.getStandardHoursPerWeek());
		WebElementUtils.sendKeys(webDriver,WorkingDaysPerWeekInput, Keys.chord(Keys.CONTROL,"a") + employee.getWorkingDaysPerWeek());
		WebElementUtils.sendKeys(webDriver,ContractEndDateInput, employee.getContractEndDate());
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, EmployeeTypeCombobox, employee.getEmployeeType());
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, EmployeeClassCombobox, employee.getEmployeeClass());
		WebElementUtils.sendKeys(webDriver,DateOfCommencementOfWorkInput, employee.getDateOfCommencementOfWorkInput());
	}

	public String getLegalEntityComboboxValue() {
		return WebElementUtils.getAriaComboboxValue(webDriver, LegalEntityCombobox);
	}

	public String getHireRehireDateInputValue() {
		return WebElementUtils.getValue(webDriver, HireRehireDateInput);
	}

	public String getOriginalHireDateInputValue() {
		return WebElementUtils.getValue(webDriver, OriginalHireDateInput);
	}

	public String getTravelPriorityDateInputValue() {
		return WebElementUtils.getValue(webDriver, TravelPriorityDateInput);
	}

	public String getAnniversaryDateInputValue() {
		return WebElementUtils.getValue(webDriver, AnniversaryDateInput);
	}
}