package com.globalClasses;

import org.openqa.selenium.By;

public class UserAdmonPage{
	private By usersAdmonTitleLocator = By.xpath("//h4[contains(string(),'Users Administration')]");
	private By addUserButtonLocator = By.linkText("» Add New User");
	private By successLocator = By.xpath("//div/div[contains(string(),'Successfully')]");
	private By scearchingBarLocator = By.xpath("//input");
	private By emailInTableLocator;
	private String a = "//td[contains(string(),'", b="')]";
	
	public By getUsersAdmonTitleLocator() {
		return usersAdmonTitleLocator;
	}
	public By getAddUserButtonLocator() {
		return addUserButtonLocator;
	}
	public By getSuccessLocator() {
		return successLocator;
	}
	public By getScearchingBarLocator() {
		return scearchingBarLocator;
	}
	public By getEmailInTableLocator(String email) {
		emailInTableLocator = By.xpath(a+email+b);
		return emailInTableLocator;
	}	
}
