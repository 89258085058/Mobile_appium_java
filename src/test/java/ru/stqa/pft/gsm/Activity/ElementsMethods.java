package ru.stqa.pft.gsm.Activity;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ru.stqa.pft.gsm.Activity.BaseSetup.ad;

public class ElementsMethods {

    public AndroidElement xpath(String xpath, String name) {
        WebDriverWait wait = new WebDriverWait(ad, 5);
        wait.withMessage("\n" + "Ошибка " + name + "!!!" + "\n" + "Локатор: '" + xpath + "' Не найден" + "\n");
        By by = By.xpath(xpath);
        return (AndroidElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

    public AndroidElement id(String id, String name) {
        WebDriverWait wait = new WebDriverWait(ad, 5);
        wait.withMessage("\n" + "Ошибка "  + name + "!!!" + "\n" + "Локатор: '" + id + "' Не найден" + "\n");
        By by = By.id(id);
        return (AndroidElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

    public AndroidElement title(String title) {
        String xpath = "//android.view.View[@content-desc=" + "\"" + title + "\"" + "]";
        WebDriverWait wait = new WebDriverWait(ad, 5);
        wait.withMessage("\n" + "Ошибка поиска заголовка " + title + "!!!" + "\n");
        By by = By.xpath(xpath);
        return (AndroidElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

}
