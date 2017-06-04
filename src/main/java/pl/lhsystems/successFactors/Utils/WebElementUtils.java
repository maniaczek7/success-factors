package pl.lhsystems.successFactors.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {

	public static void sendKeys(WebDriver webDriver, WebElement webElement, String string) {
//		webElement.clear();
		highlightElement(webElement, webDriver);
		webElement.sendKeys(string);
		unHighlightElement(webElement, webDriver);
	}

	public static void sendKeys(WebDriver webDriver, WebElement webElement, Keys keys) {
//		webElement.clear();
		highlightElement(webElement, webDriver);
		webElement.sendKeys(keys);
		unHighlightElement(webElement, webDriver);
	}

	public static void click(WebDriver webDriver, WebElement webElement) {
		highlightElement(webElement, webDriver);
		unHighlightElement(webElement, webDriver);
		webElement.click();
	}

	public static void ariaComboboxSelectOptionWithAutocompletion(WebDriver webDriver, WebElement combobox, String selectOption) { //TODO: dodac stringa do wyszukiwania
		highlightElement(combobox, webDriver);
//		waitForElementToBeClickable(webDriver, combobox, 5);
		AriaCombobox ariaComboboxWithCompletion = new AriaCombobox(webDriver, combobox);
		ariaComboboxWithCompletion.selectOptionWithAutocompletion(selectOption);
//		waitForElementToBeClickable(webDriver, combobox, 5);
		unHighlightElement(combobox, webDriver);
	}
	
	public static void ariaComboboxSelectOptionWithoutAutocompletion(WebDriver webDriver, WebElement combobox, String selectOption) { //TODO: dodac stringa do wyszukiwania
		highlightElement(combobox, webDriver);
//		waitForElementToBeClickable(webDriver, combobox, 5);
		AriaCombobox ariaComboboxWithCompletion = new AriaCombobox(webDriver, combobox);
		ariaComboboxWithCompletion.selectOptionWithoutAutocompletion(selectOption);
//		waitForElementToBeClickable(webDriver, combobox, 5);
		unHighlightElement(combobox, webDriver);
	}

	public static String getValue(WebDriver webDriver, WebElement webElement) {
		highlightElement(webElement, webDriver);
		unHighlightElement(webElement, webDriver);
		return webElement.getAttribute("value");
	}

	public static String getAriaComboboxValue(WebDriver webDriver, WebElement ariaCombobox) {
		highlightElement(ariaCombobox, webDriver);
		unHighlightElement(ariaCombobox, webDriver);
		return new AriaCombobox(webDriver,ariaCombobox).getvalue();
	}

	public static void waitForElementToBeClickable(WebDriver webDriver, WebElement webElement, int TimeInSeconds){
		WebDriverWait webDriverWait = new WebDriverWait(webDriver, TimeInSeconds);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
    public static void highlightElement(WebElement element, WebDriver webDriver) {
    	JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 1px solid red;");
    }
    
    public static void unHighlightElement(WebElement element, WebDriver webDriver) {
    	JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
    	javascriptExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
    }
}
