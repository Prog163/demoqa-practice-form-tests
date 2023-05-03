package com.zaychikov.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

    public static Faker faker = new Faker(new Locale("en"));

    protected static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            userDayOfBirthday = "07",
            userMonthOfBirthday = "October",
            userYearOfBirthday = "1991",
            userGender = "Male",
            userSubjects = "Computer Science",
            userHobbies = "Sports",
            userCity = faker.address().streetAddress(),
            userState = "Haryana",
            userCityOfState = "Panipat";
}
