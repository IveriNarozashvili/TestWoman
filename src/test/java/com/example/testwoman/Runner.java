package com.example.testwoman;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.*;

public class Runner {
    @BeforeAll
    public static void start() {
        Configuration.browser = "chrome";
        open("http://automationpractice.com");
    }
}
