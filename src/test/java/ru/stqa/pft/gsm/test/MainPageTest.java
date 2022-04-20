// -*- coding: utf-8 -*-

package ru.stqa.pft.gsm.test;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Title;
import ru.stqa.pft.gsm.Activity.Driver;
import ru.stqa.pft.gsm.Pages.AuthForm;
import ru.stqa.pft.gsm.Pages.MainPage;
import org.testng.annotations.Test;


public class MainPageTest extends Driver {

    @Features("Главная страница")
    @Title("Проверка переключения между вкладками")
    @Test
    public void pageNavigationTest() throws InterruptedException {
        MainPage menu = new MainPage();
        AuthForm auth = new AuthForm();
        auth.login();
        menu.goToMainPage(); //Баг
        menu.goToPathPage();
        menu.goToSensorsPage();
        menu.goToJournalPage();
        menu.goToDevicePage();
        menu.goToSettingsPage();
        menu.exitApp();
    }
}
