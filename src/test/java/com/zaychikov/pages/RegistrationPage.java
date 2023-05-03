package com.zaychikov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            mobileNumberInput = $("#userNumber"),
            genderInput = $("#genterWrapper"),
            subjectInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            userCityInput = $("#currentAddress"),
            stateSelector = $("#state"),
            stateInput = $("#state"),
            citySelector = $("#city"),
            cityOfStateInput = $("#react-select-4-input"),
            closeModalWindowSelector = $("#closeLargeModal");

    public void openPage() {
        open("/automation-practice-form");
    }

    public void typeFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void typeLastName(String value) {
        lastNameInput.setValue(value);
    }

    public void typeUserEmail(String value) {
        emailInput.setValue(value);
    }

    public void typeMobileNumber(String value) {
        mobileNumberInput.setValue(value);
    }

    public void typeGender(String userGender) {
        genderInput.$(byText("Male")).click();
    }

    public void typeSubjects(String value) {
        subjectInput.setValue(value).pressEnter();
    }

    public void typeHobbies(String userHobbies) {
        hobbiesInput.$(byText("Sports")).click();
    }

    public void typeUserCity(String value) {
        userCityInput.setValue(value);
    }

    public void typeState(String userState) {
        stateSelector.scrollTo().click();
        stateInput.$(byText("Haryana")).click();
    }

    public void typeCityOfState(String value) {
        citySelector.click();
        cityOfStateInput.setValue(value).pressEnter().pressEnter();
    }

    public void closeModalWindow() {
        closeModalWindowSelector.click();
    }
}
