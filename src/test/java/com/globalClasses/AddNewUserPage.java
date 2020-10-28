package com.globalClasses;

import org.openqa.selenium.By;

public class AddNewUserPage{
	private By addUserTitleLocator = By.xpath("//h3[contains(string(),'Add New User')]");
	private By nameLocator = By.id("user_name");
	private By firstNameLocator = By.id("user_firstName");
	private By lastNameLocator = By.id("user_lastName");
	private By emailLocator = By.id("user_email");
	private By passwordLocator = By.id("user_password");
	private By statusLocator = By.id("user_status");
	private By submitLocator = By.xpath("//button[contains(string(),'Save')]");
	
	public By getAddUserTitleLocator() {
		return addUserTitleLocator;
	}
	public By getNameLocator() {
		return nameLocator;
	}
	public By getFirstNameLocator() {
		return firstNameLocator;
	}
	public By getLastNameLocator() {
		return lastNameLocator;
	}
	public By getEmailLocator() {
		return emailLocator;
	}
	public By getPasswordLocator() {
		return passwordLocator;
	}
	public By getStatusLocator() {
		return statusLocator;
	}
	public By getSubmitLocator() {
		return submitLocator;
	}
}
