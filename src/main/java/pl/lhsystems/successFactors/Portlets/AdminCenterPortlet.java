package pl.lhsystems.successFactors.Portlets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pl.lhsystems.successFactors.Pages.HeaderPage;

public class AdminCenterPortlet extends HeaderPage {

	private WebDriver webDriver;

	@FindBy(how = How.XPATH, using = ".//*[text()='Admin Center']/../..")
	private WebElement AdminCenterLink;
	
	public AdminCenterPortlet(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 10), this);
//		PageFactory.initElements(webDriver, this);
	}

	public void clickAdminCenterLink() {
		AdminCenterLink.click();
	}
	
	public boolean checkAdminCenterLinkIdDisplayed(){
		return AdminCenterLink.isDisplayed();
	}

}