package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPojo extends BaseClass {
	
	public FacebookLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginBtn;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}

