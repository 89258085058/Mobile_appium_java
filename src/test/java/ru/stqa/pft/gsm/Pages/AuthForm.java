package ru.stqa.pft.gsm.Pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import ru.stqa.pft.gsm.Activity.Driver;


public class AuthForm extends Driver {
    public AuthForm() {
        PageFactory.initElements(new AppiumFieldDecorator(ad), this);
    }

    private String Login = "//*[@class='android.widget.EditText' and @index='3']";
    private String Password = "//*[@class='android.widget.EditText' and @index='5']";
    private String EntryButton = "//*[@class='android.widget.Button' and @index='6']";


    public void inputlogin(String log) {
        xpath(Login, "Поле Логин").click();
        xpath(Login, "Поле Логин").clear();
        xpath(Login, "Поле Логин").sendKeys(log);
    }

    public void inputpassword(String password) {
        xpath(Password, "Поле Пароль").click();
        xpath(Password, "Поле Пароль").clear();
        xpath(Password, "Поле Пароль").sendKeys(password);
    }

    public void ClickEntryButton() {
        xpath(EntryButton, "Кнопка войти").click();
    }

    public void authorization(String login, String password) throws InterruptedException {
        inputlogin(login);
        inputpassword(password);
        ClickEntryButton();
    }

    public void login() throws InterruptedException {
        authorization("test@test.ru", "AeistSUqm3AvLuY");
    }

}
