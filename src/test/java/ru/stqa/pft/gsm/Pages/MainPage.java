package ru.stqa.pft.gsm.Pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ru.stqa.pft.gsm.Activity.Driver;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPage extends Driver {
    public MainPage() {
        PageFactory.initElements(new AppiumFieldDecorator(ad), this);

    }

    //Кнопки меню
    private String MenuButton = "//android.widget.Button[@content-desc='Open navigation menu']";
    private String MainPageButton = "//android.widget.Button[@content-desc=\"Главная\"]";
    private String ExitButton = "//*[@class='android.widget.Button' and @index='2']";
    private String PathButton = "//android.widget.Button[@content-desc='Разделы']";
    private String SensorsButton = "//android.widget.Button[@content-desc=\"Датчики\"]";
    private String JournalButton = "//android.widget.Button[@content-desc=\"Журнал\"]";
    private String DeviceButton = "//android.widget.Button[@content-desc=\"Устройства\"]";
    private String SettingsButton = "//android.widget.Button[@content-desc=\"Настройки\"]";

    @Step("Выход из приложения")
    public void exitApp() throws InterruptedException {
        xpath(MenuButton, "Меню").click();
        xpath(MainPageButton, "Главная").click();
        xpath(ExitButton, "Выход").click();
    }

    @Step("Переход на страницу Главная")
    public void goToMainPage() throws InterruptedException {
        xpath(MenuButton, "Кнопка Меню").click();
        xpath(MainPageButton, "Кнопка Главная").click();
        String title = title("Гланвая").getAttribute("content-desc");
        Assert.assertEquals(title, "Гланвая",
                "Ошибка! Ожидаемое значение заголовка: Главная. Фактичсекое значение: " + title);
    }

    @Step("Переход на страницу Разделы")
    public void goToPathPage() throws InterruptedException {
        xpath(MenuButton, "Кнопка Меню").click();
        xpath(PathButton, "Кнопка Разделы").click();
        String title = title("Разделы").getAttribute("content-desc");
        Assert.assertEquals(title, "Разделы",
                "Ошибка! Ожидаемое значение заголовка: Разделы. Фактичсекое значение: " + title);
    }

    @Step("Переход на страницу Датчики")
    public void goToSensorsPage() throws InterruptedException {
        xpath(MenuButton, "Кнопка Меню").click();
        xpath(SensorsButton, "Кнопка Датчики").click();
        String title = title("Датчики").getAttribute("content-desc");
        Assert.assertEquals(title, "Датчики",
                "Ошибка! Ожидаемое значение заголовка: Датчики. Фактичсекое значение: " + title);
    }

    @Step("Переход на страницу Журнал")
    public void goToJournalPage() throws InterruptedException {
        xpath(MenuButton, "Кнопка Меню").click();
        xpath(JournalButton, "Кнопка Журнал").click();
        String title = title("Журнал").getAttribute("content-desc");
        Assert.assertEquals(title, "Журнал",
                "Ошибка! Ожидаемое значение заголовка: Журнал. Фактичсекое значение: " + title);
    }

    @Step("Переход на страницу Устройства")
    public void goToDevicePage() throws InterruptedException {
        xpath(MenuButton, "Кнопка Меню").click();
        xpath(DeviceButton, "Кнопка Устройства").click();
        String title = title("Устройства").getAttribute("content-desc");
        Assert.assertEquals(title, "Устройства",
                "Ошибка! Ожидаемое значение заголовка: Устройства. Фактичсекое значение: " + title);
    }

    @Step("Переход на страницу Настройки")
    public void goToSettingsPage() throws InterruptedException {
        xpath(MenuButton, "Кнопка Меню").click();
        xpath(SettingsButton, "Кнопка Настройки").click();
        String title = title("Настройки").getAttribute("content-desc");
        Assert.assertEquals(title, "Настройки",
                "Ошибка! Ожидаемое значение заголовка: Настройки. Фактичсекое значение: " + title);
    }


}
