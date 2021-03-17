package org.cts.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tcs.test.login.BaseClass;

public class ContinuePage extends BaseClass{
	public ContinuePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement btnContinue;
	
	@FindBy(id="continue")
	private WebElement btnNext;
	
	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
