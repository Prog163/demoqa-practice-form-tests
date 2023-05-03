package com.zaychikov.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        //Тесты падают из-за долгой загрузки страницы, пришлось выставить увеличенный Таймаут
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @AfterAll
    static void afterAll() {
        //Оставляю браузер открытым для проверки введённых значений, т.к. он закрывается автоматически
        Configuration.holdBrowserOpen = true;
//        Пришлось добавить, в фоновом режиме Chrome продолжал работать, CPU на 100% загружается
//        Selenide.closeWebDriver();
    }
}
