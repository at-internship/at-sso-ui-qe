package com.globalClasses;

import org.openqa.selenium.By;

public class UserAdmonPage{
	private By usersAdmonTitleLocator = By.xpath("//h4[contains(string(),'Users Administration')]");
	private By addUserButtonLocator = By.linkText("» Add New User");
	private By successLocator = By.xpath("//div/div[contains(string(),'Successfully')]");
	private By scearchingBarLocator = By.xpath("//input");
	private By dataInTableLocator;
	private String a = "//tr[contains(string(),'", b="')]";
	
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
	public By getDataInTableLocator(String data) {
		dataInTableLocator = By.xpath(a+data+b);
		return dataInTableLocator;
	}	
}
