package org.locators;



import org.maven.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginContext extends BaseClass {

	public LoginContext() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtusername;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement logbtn;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}

}
