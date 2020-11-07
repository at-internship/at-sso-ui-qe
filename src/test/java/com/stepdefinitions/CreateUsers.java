package com.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import com.globalClasses.TestBase;

public class CreateUsers extends TestBase{
	String email = "";

	@Given("I am in the Users Administration page")
	public void i_am_in_the_Users_Administration_page() throws Throwable{
		driver.get("https://at-sso-ui.herokuapp.com/admin/user");
		base.waitElement(userAP.getUsersAdmonTitleLocator());
	}
	@When("I do click in the AddNewUser button")
	public void i_do_click_in_the_AddNewUser_button() throws Throwable{
		base.click(userAP.getAddUserButtonLocator());
	}
	@Then("The AddNewUser form should be displayed")
	public void the_AddNewUser_page_should_be_displayed() throws Throwable{
		base.waitElement(addNUP.getAddUserTitleLocator());
	}
	@Then("I put a valid name")
	public void i_put_a_valid_name() throws Throwable{
		base.sendKeys(addNUP.getNameLocator(), values.randomFirstName());
	}
	@Given("I put a valid firstname")
	public void i_put_a_valid_firstname() throws Throwable{
		base.sendKeys(addNUP.getFirstNameLocator(), values.randomFirstName());
	}
	@Given("I put a valid lastname")
	public void i_put_a_valid_lastname() throws Throwable{
		base.sendKeys(addNUP.getLastNameLocator(), values.randomLastName());
	}
	@Given("I put a valid email")
	public void i_put_a_valid_email() throws Throwable{
		email=values.randomEmail();
		base.sendKeys(addNUP.getEmailLocator(), email);
	}
	@Given("I put a valid password")
	public void i_put_a_valid_password() throws Throwable{
		base.sendKeys(addNUP.getPasswordLocator(), values.randomPassword());
	}
	@Given("I select a status")
	public void i_select_a_status() throws Throwable{
		base.selectItem(addNUP.getStatusLocator());
	}
	@When("I do click in the Save button")
	public void i_do_click_in_the_Save_button() throws Throwable{
		base.click(addNUP.getSubmitLocator());
	}
	@Then("I should see an alert of successful user creation")
	public void i_should_see_an_alert_of_successful_user_creation() throws Throwable{
		base.waitElement(userAP.getSuccessLocator());
	}
	@Then("The user should be found by the search function of the page")
	public void the_user_should_be_found_by_the_search_function_of_the_page() throws Throwable{
		base.sendKeys(userAP.getScearchingBarLocator(), email);
		base.isDisplayed(userAP.getEmailInTableLocator(email));
	}
}