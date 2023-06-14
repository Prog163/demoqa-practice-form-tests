package com.zaychikov.pages;

import com.codeborne.selenide.SelenideElement;
import com.zaychikov.tests.TestData;

import static com.codeborne.selenide.Selenide.$;

public class Calendar extends TestData {

    private SelenideElement
            dateOfBirthInputSelector = $("#dateOfBirthInput"),
            dateOfBirthMonthSelector = $(".react-datepicker__month-select"),
            dateOfBirthYearSelector = $(".react-datepicker__year-select"),
            dateOfBirthDaySelector = $(".react-datepicker__day--0" + userDayOfBirthday + ":not(.react-datepicker__day--outside-month)");

    public void selectDateOfBirth() {
        dateOfBirthInputSelector.click();
        dateOfBirthMonthSelector.selectOption(userMonthOfBirthday);
        dateOfBirthYearSelector.selectOption(userYearOfBirthday);
        dateOfBirthDaySelector.click();
    }
}
