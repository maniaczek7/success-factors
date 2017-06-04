package pl.lhsystems.successFactors.Portlets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pl.lhsystems.successFactors.Pages.HeaderPage;
import pl.lhsystems.successFactors.Utils.WebElementUtils;
import pl.lhsystems.successFactors.Utils.CustomAnnotations.AjaxCustomElementLocatorFactory;

public class MyAdminFavouritePortlet extends HeaderPage {

	private WebDriver webDriver;

	// @FindBy(how = How.XPATH, using =
	// ".//div[@class='favorite']/a[text()='${label}']")
	@FindBy(how = How.XPATH, using = ".//*[@title='${label}']")
	private WebElement AddNewEmployeeLink;

	@FindBy(how = How.XPATH, using = ".//div[@class='favorite']/a[text()='${label}']")
	private WebElement ManageWorkflowRequestsLink;

	@FindBy(how = How.XPATH, using = ".//div[@class='favorite']/a[text()='${label}']")
	private WebElement ManageDataLink;

	public MyAdminFavouritePortlet(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
		PageFactory.initElements(new AjaxCustomElementLocatorFactory(webDriver, 10, this), this);
		// PageFactory.initElements(webDriver, this);
	}

	public void clickAddNewEmployeeLink() {
		WebElementUtils.click(webDriver, AddNewEmployeeLink);
	}

	public boolean checkAddNewEmployeeLinkIsDisplayed() {
		return AddNewEmployeeLink.isDisplayed();
	}

}