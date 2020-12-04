package com.stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import com.globalClasses.TestBase;
import com.globalClasses.MongoDBUtils;

public class GetUsers extends TestBase {
    String allUsers = "";
    @When("I compare mongo with users displayed")
    public void i_compare_mongo_with_users_displayed() throws Throwable{
        base.changeEntries(usersAP.getEntries());
        allUsers = base.clickPagination(usersAP.nextPage(), usersAP.getUsers());
    }

    @Then("I validate the mongodb data and the users")
    public void i_validate_the_mongodb_data_and_the_users() {
      assert true == MongoDBUtils.compareAllJsonString("TEST", "at-sso-db", "users", allUsers);
    }
}
