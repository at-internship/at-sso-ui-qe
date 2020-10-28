package com.globalClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePages {
	private WebDriver driver;
	
	public BasePages(WebDriver driver){
		this.driver = driver;
	}
	public void click(By element) throws Exception {
		try {
		driver.findElement(element).click();
		}catch(Exception e){
			throw new Exception("Cannot did click at "+element);
		}
	}
	public boolean isDisplayed(By element) throws Exception {
		try {
		return driver.findElement(element).isDisplayed();
		}catch(Exception e){
			throw new Exception("The element "+element+" is not displayed");
		}
	}
	public void sendKeys(By element, String key) throws Exception {
		try {
			driver.findElement(element).sendKeys(key);
		}catch(Exception e){
			throw new Exception("Impossible sed keys to "+element);
		}
	}
	public void selectItem(By element) throws Exception {
		try {
			Select item = new Select(driver.findElement(element));
			item.selectByIndex(((int) (Math.random()*(3-1)+1)));
		}catch(Exception e){
			throw new Exception("Impossible select Item: "+element);
		}
	}
}
