package pl.lhsystems.successFactors.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AriaCombobox {
	
	private WebDriver webDriver;
	
	@FindBy(how = How.XPATH, using=".//input[contains(@id,'_write')]")
	private WebElement input;
	
	@FindBy(how = How.XPATH, using=".//span[contains(@id,'_write_toggle')]")
	private WebElement button;
	
	public AriaCombobox(WebDriver webDriver, WebElement combobox) {
		PageFactory.initElements(new AjaxElementLocatorFactory(combobox, 5), this);
        this.webDriver = webDriver;
    }

	public void selectOptionWithAutocompletion(String option){
		input.clear();
		input.sendKeys(option);
		new AriaComboboxSelectionList(webDriver).selectOptionFromList(option);
	}	
	
	public void selectOptionWithoutAutocompletion(String option){
		input.clear();
		button.click();
		new AriaComboboxSelectionList(webDriver).selectOptionFromList(option);
	}

	public String getvalue() {
		return input.getAttribute("value");
	}
}


class AriaComboboxSelectionList{
	
	private WebDriver webDriver;
	
	private final String COMBOBOX_CONTAINER_XPATH = ".//*[@id='sfOverlayMgr']";

	@FindBy(how = How.XPATH, using=".//ul[contains(@id,'_listSelect')]")
	private WebElement selectionList;

	public AriaComboboxSelectionList(WebDriver webDriver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(webDriver.findElement(By.xpath(COMBOBOX_CONTAINER_XPATH)), 10), this);
        this.webDriver = webDriver;
    }

	public void selectOptionFromList(String option){
		selectionList.findElement(By.xpath(".//a[contains(@title,'" + option + "')]")).click();
	}	
}


