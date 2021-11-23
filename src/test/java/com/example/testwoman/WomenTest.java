package com.example.testwoman;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Selenide.*;

public class WomenTest extends Runner{

    @Test
    public void checkIfIOnWomenPage() {
        $(By.linkText("WOMEN")).click();
        $x("//h2[@class='title_block']").shouldHave(text("WOMEN"));
        $(By.linkText("DRESSES")).click();
        $x("//h2[@class='title_block']").shouldHave(text("DRESSES"));
        $(By.linkText("T-SHIRTS")).click();
        $x("//span[contains(text(),'T-shirts')]").shouldHave(text("T-SHIRTS"));

    }
}
