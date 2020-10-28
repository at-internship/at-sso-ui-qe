package com.globalClasses;

import org.openqa.selenium.WebDriver;
import com.stepdefinitions.Hooks;

public class TestBase {
	protected WebDriver driver = Hooks.getDriver();
	protected UserAdmonPage userAP = new UserAdmonPage();
	protected AddNewUserPage addNUP = new AddNewUserPage();
	protected BasePages base = new BasePages(driver);
	protected TestValues values = new TestValues();
}