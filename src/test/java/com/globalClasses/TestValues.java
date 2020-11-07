package com.globalClasses;

import com.github.javafaker.Faker;

public class TestValues{
	Faker faker = new Faker();
	public String randomFirstName() {
		String firstName = faker.name().firstName();
		return firstName;
	}
	public String randomLastName() {
		String lastName = faker.name().lastName();
		return lastName;
	}
	public String randomEmail() {
		String email = faker.internet().emailAddress();
		return email;
	}
	public String randomPassword() {
		String pass = faker.internet().password(7, 8, true, false, true);
		return pass;
	}
}