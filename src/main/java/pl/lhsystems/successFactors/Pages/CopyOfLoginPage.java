package pl.lhsystems.successFactors.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pl.lhsystems.successFactors.Utils.WebElementUtils;
import pl.lhsystems.successFactors.Utils.CustomAnnotations.AjaxCustomElementLocatorFactory;

public class CopyOfLoginPage{
	
	private WebDriver webDriver;
	
	@FindBy(how=How.XPATH, using=".//*[@id='${label}']")
	private WebElement companyInput;
	
	@FindBy(how=How.XPATH, using=".//*[@id='${label}']")
	private WebElement submitButton;
	
	@FindBy(how=How.XPATH, using=".//*[@id='${label}']")
	private WebElement userInput;
		
	@FindBy(how=How.XPATH, using=".//*[@id='${label}']")
	private WebElement passwordInput;
	
	@FindBy(how=How.XPATH, using=".//*[@id='${label}']")
	private WebElement loginButton;

	public CopyOfLoginPage(WebDriver webDriver) throws IOException {
		this.webDriver = webDriver;
//	    DataResource resource = new FileSystemResource("src/test/resources/MultilangLabels.xls", LocatorRow.class);
//	    SeLionDataProvider dataProvider = DataProviderFactory.getDataProvider(resource);
//	    Object[][] test = dataProvider.getAllData();
//	    System.out.println(test[0][0].getClass().getSimpleName());
//		for (int i = 0; i < test.length; i++) {
//			substitutions.put(((LocatorRow) test[i][0]).getFieldName(), ((LocatorRow) test[i][0]).getEnglishLabel());
//		}
//		//TODO: wyciagnac to poza te klase.
		//TODO: tabelki jako osobne elemetny
		//TODO: dodac data providera dla całości w XLSie
		//TODO: dodać listenera do raportów ze screenami na FAIL
//		PageFactory.initElements(new AjaxCustomElementLocatorFactory(webDriver, 10, substitutions), this);
 
		PageFactory.initElements(new AjaxCustomElementLocatorFactory(webDriver, 10, this), this);

		
		
	}
     
	public void login(String company, String login, String password){
		WebElementUtils.sendKeys(webDriver, companyInput, company);
		WebElementUtils.click(webDriver, submitButton);
		WebElementUtils.waitForElementToBeClickable(webDriver,userInput,10);
		WebElementUtils.sendKeys(webDriver, userInput, login);
		WebElementUtils.sendKeys(webDriver, passwordInput, password);
		WebElementUtils.click(webDriver, loginButton);
//		companyInput.sendKeys(company);
//		submitButton.click();
//		userInput.sendKeys(login);
//		passwordInput.sendKeys(password);
//		loginButton.click();
	}
}