package pl.lhsystems.successFactors.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HeaderPage{
	
	private WebDriver webDriver;	    	

	@FindBy(how=How.XPATH, using=".//*[@id='5:_homeLinkContainer']//a")
	private WebElement HomeButton;

	@FindBy(how=How.XPATH, using=".//*[@id='5:_moduleLinksDropDown']//a")
	private WebElement MyEmployeeFileCombobox;
	
	@FindBy(how=How.XPATH, using=".//*[@id='inputSearchIcon']")
	public WebElement inputSearchIcon;
	
	@FindBy(how=How.XPATH, using=".//*[@id='universalActionSearchContainer']//input")
	public WebElement searchInput;

	@FindBy(how=How.XPATH, using=".//*[@id='6:_multiLineLabel']//a")
	private WebElement companyCombobox;

	@FindBy(how=How.XPATH, using=".//*[@id='5:_globalLogoPosition']/div/div")
	private  WebElement Logo;
	
	public HeaderPage(WebDriver webDriver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(webDriver,15), this);
		this.webDriver = webDriver;
	}
}