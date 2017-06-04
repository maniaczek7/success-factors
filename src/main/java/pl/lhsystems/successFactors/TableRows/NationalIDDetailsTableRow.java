package pl.lhsystems.successFactors.TableRows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pl.lhsystems.successFactors.Utils.WebElementUtils;

public class NationalIDDetailsTableRow {
	
	private WebDriver webDriver;
	
	@FindBy(how=How.XPATH, using=".//td[1]//*[contains(@id,'_fieldborder')]")
	private WebElement CountryCombobox;
	
	@FindBy(how=How.XPATH, using=".//td[2]//*[contains(@id,'_fieldborder')]")
	private WebElement NationalIDCardTypeCombobox;
	
	@FindBy(how=How.XPATH, using=".//td[3]//*[contains(@id,'_fieldborder')]/input")
	private WebElement NationalIDInput;
	
	@FindBy(how=How.XPATH, using=".//td[4]//*[contains(@id,'_fieldborder')]")
	private WebElement IsPrimaryCombobox;

	public NationalIDDetailsTableRow(WebDriver webDriver, WebElement rowElement) {
		PageFactory.initElements(new AjaxElementLocatorFactory(rowElement, 10), this);
//				AjaxElementLocatorFactory(rowElement, 5), this);
		this.webDriver = webDriver;
	}

	public void fillRow(String country, String IDCardType, String IDNumber, String isPrimary) {
		WebElementUtils.ariaComboboxSelectOptionWithAutocompletion(webDriver, CountryCombobox, country);
		WebElementUtils.ariaComboboxSelectOptionWithoutAutocompletion(webDriver, NationalIDCardTypeCombobox, IDCardType);
		WebElementUtils.waitForElementToBeClickable(webDriver, NationalIDInput, 5);
		WebElementUtils.sendKeys(webDriver, NationalIDInput, IDNumber);
		WebElementUtils.ariaComboboxSelectOptionWithoutAutocompletion(webDriver, IsPrimaryCombobox, isPrimary);
		WebElement element = webDriver.findElement(By.name("test"));
	}

}
