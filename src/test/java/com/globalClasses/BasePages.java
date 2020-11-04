package com.globalClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

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

	public String getItem(By elements) throws Exception {
	  try {
		  int counterElements = 0;
		  String allFields = "";
		  WebElement element = driver.findElement(elements);
		  List<WebElement> getUserByUser = element.findElements(By.cssSelector(" tbody >tr > td"));
		  for (WebElement g : getUserByUser) {
			counterElements = counterElements + 1;
			if(counterElements != 6){
			  String getUser = g.getText();
			  allFields = allFields + getUser;
			}else{
			  counterElements = -1;
			}
		  }
		  return allFields;
	  }catch(Exception e){
		throw new Exception("Impossible select Item: "+e);
	  }
	}

	public String clickPagination(By elements, By users) throws Exception {
		try {
			String allUsers = "";
			WebElement nextElement = driver.findElement(elements);
			String lastElement = nextElement.getAttribute("class");
			while (!lastElement.contains("disabled")) {
				nextElement = driver.findElement(elements);
				lastElement = nextElement.getAttribute("class");
        		allUsers = allUsers + getItem(users);
				nextElement.click();
			}
			return allUsers;
		}catch (StaleElementReferenceException e)
		{
			throw new Exception("Impossible select Item: "+e);
		}
	}
}
