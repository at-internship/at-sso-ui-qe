package com.globalClasses;

import org.openqa.selenium.By;

public class GetAllUsers {
    private By getUserByUser = By.id("usersTable");
    private By getPages = By.id("usersTable_next");
    private By entries = By.name("usersTable_length");

    public By getEntries() { return entries;}
    public By getUsers() {return getUserByUser;}
    public By nextPage() {return getPages;}
}