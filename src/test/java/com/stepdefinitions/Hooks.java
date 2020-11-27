package com.stepdefinitions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private static ChromeDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty( "webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1360, 768));
	}
	public static ChromeDriver getDriver() {
		return driver;
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}