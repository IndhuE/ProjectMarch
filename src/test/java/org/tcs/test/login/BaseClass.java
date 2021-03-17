package org.tcs.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick().perform();
	}
	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
	}
	public void getText(WebElement element) {
		element.getText();
	}
	public void getAttribute(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}
	public void closeWindow() {
		((WebDriver)driver).close();
	}
	public void quitWindow() {
		((WebDriver)driver).quit();
	}
	public void enterText(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	public void dragAndDrop(WebElement source,WebElement dest) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest).perform();
	}
	public void moveToElement(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
	}
	public void dropDown(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public void dropDownIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void dropDownValue(WebElement element,String argu) {
		Select select=new Select(element);
		select.selectByValue(argu);
	}

	
	
	
	
	
	
	
}
