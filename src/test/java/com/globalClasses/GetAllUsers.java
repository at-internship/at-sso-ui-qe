package com.globalClasses;

import org.openqa.selenium.By;

public class GetAllUsers {
    private By getUserByUser = By.id("usersTable");
    private By getPages = By.id("usersTable_next");

    public By getUsers() {return getUserByUser;}
    public By nextPage() {return getPages;}
}