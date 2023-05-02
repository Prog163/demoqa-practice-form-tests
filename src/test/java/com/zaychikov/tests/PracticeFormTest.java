package com.zaychikov.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest extends TestBase {

    @Test
    void practiceFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Aleksandr");
        $("#lastName").setValue("Zaychikov");
        $("#userEmail").setValue("Email@useremail.com");
        $("#userNumber").setValue("8999222335");
        $(by("class", "custom-control-label")).click();
        $("#dateOfBirthInput").click();
        $(by("class", "react-datepicker__month-select")).click();
        $(by("value", "9")).click();
        $(by("class", "react-datepicker__year-select")).click();
        $(by("value", "1991")).click();
        $(by("aria-label", "Choose Monday, October 7th, 1991")).click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $(by("class", "custom-control custom-checkbox custom-control-inline")).click();
        $("#currentAddress").setValue("Russia, Samara city");
        $(byText("State and City")).scrollTo();
        $(by("class", " css-tlfecz-indicatorContainer")).click();
        $("#react-select-3-input").setValue("Haryana").pressEnter();
        $(by("class", " css-2b097c-container")).click();
        $("#react-select-4-input").setValue("Panipat").pressEnter().pressEnter();

        //Проверяем совпадения
        $(".table-responsive").shouldHave(
                text("Aleksandr Zaychikov"),
                text("Email@useremail.com"),
                text("Male"),
                text("8999222335"),
                text("07 October,1991"),
                text("Computer Science"),
                text("Sports"),
                text("Russia, Samara city"),
                text("Haryana Panipat"));
    }
}
