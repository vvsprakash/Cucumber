package org.test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="username")
private WebElement txtUsername;

@FindBy(id="password")
private WebElement txtpassword;

@FindBy(id="login")
private WebElement btnLogin;

public WebElement getTxtUsername() {
	return txtUsername;
}

public WebElement getTxtpassword() {
	return txtpassword;
}

public WebElement getBtnLogin() {
	return btnLogin;
}


public void login (String Username, String password) {
	type(getTxtUsername(), Username);
	type(getTxtpassword(), password);
	click(getBtnLogin());
	
}
}







