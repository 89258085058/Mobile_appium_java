package ru.stqa.pft.gsm.Pages;

import ru.stqa.pft.gsm.Activity.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public class PathPage extends Driver {
    public PathPage() {
        PageFactory.initElements(new AppiumFieldDecorator(ad), this);
    }


}
