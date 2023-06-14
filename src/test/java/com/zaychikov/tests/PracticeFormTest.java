package com.zaychikov.tests;

import com.zaychikov.pages.Calendar;
import com.zaychikov.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.zaychikov.tests.TestData.*;

public class PracticeFormTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationPage closeModalWindowButton = new RegistrationPage();
    Calendar calendar = new Calendar();

    @Test
    void practiceFormTest() {
        registrationPage.openPage();

        registrationPage.typeFirstName(firstName);
        registrationPage.typeLastName(lastName);
        registrationPage.typeUserEmail(userEmail);
        registrationPage.typeMobileNumber(userNumber);
        registrationPage.typeGender(userGender);
        calendar.selectDateOfBirth();
        registrationPage.typeSubjects(userSubjects);
        registrationPage.typeHobbies(userHobbies);
        registrationPage.typeUserCity(userCity);
        registrationPage.typeState(userState);
        registrationPage.typeCityOfState(userCityOfState);

        //Проверяем правильность заполнения
        $(".table-responsive").shouldHave(
                text(firstName + " " + lastName),
                text(userEmail),
                text(userGender),
                text(userNumber),
                text("07 October,1991"),
                text(userSubjects),
                text(userHobbies),
                text(userCity),
                text(userState + " " + userCityOfState));

        //Закрываем модальное окно с результатами заполнения после сверки
        closeModalWindowButton.closeModalWindow();
    }
}
