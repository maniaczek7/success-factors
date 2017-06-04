package pl.lhsystems.successFactors.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pl.lhsystems.successFactors.Utils.WebElementUtils;

public class AddNewEmployeeMenubarPage extends HeaderPage{
	
	private WebDriver webDriver;	    	
	
	@FindBy(how=How.XPATH, using=".//button[@title='Next']")
	private WebElement NextButton;

	@FindBy(how=How.XPATH, using=".//*[@id='46:_previousButton']//button")
	private WebElement PreviousButton;

	@FindBy(how=How.XPATH, using=".//*[@id='46:_wizardTabs']/div[contains(@title,'Identity')]")
	private WebElement IdentityButton;

	@FindBy(how=How.XPATH, using=".//*[@id='46:_wizardTabs']/div[contains(@title,'Personal Information')]")
	private WebElement PersonalInformationButton;

	@FindBy(how=How.XPATH, using=".//*[@id='46:_wizardTabs']/div[contains(@title,'Job Information')]")
	private WebElement JobInformationButton;

	@FindBy(how=How.XPATH, using=".//*[@id='46:_wizardTabs']/div[contains(@title,'Compensation Information')]")
	private WebElement CompensationInformationButton;
	
	public AddNewEmployeeMenubarPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(new AjaxElementLocatorFactory(webDriver,15), this);
		this.webDriver = webDriver;
	}

	public void clickNextButton() {
		WebElementUtils.click(webDriver, NextButton);
	}

}