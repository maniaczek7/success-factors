package pl.lhsystems.successFactors.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	private WebDriver webDriver;
	
	@FindBy(how=How.XPATH, using="id(\"company\")")
	private WebElement companyInput;
	
	
	@FindBy(how=How.XPATH, using="id(\"username\")")
	private WebElement userInput;
	
	
	@FindBy(how=How.XPATH, using="id(\"passwordHints\")")
	private WebElement passwordInput;
	
	
	@FindBy(how=How.XPATH, using="id(\"loginSubmitBtn\")")
	private WebElement loginButton;
	
	
	public LoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
     
	public void login(String company, String login, String password){
		companyInput.sendKeys(company);
		userInput.sendKeys(login);
		passwordInput.sendKeys(password);
		loginButton.click();
	}
}