package ru.stqa.pft.gsm.Activity;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseSetup extends ElementsMethods {
    private DesiredCapabilities cd = new DesiredCapabilities();
    static AndroidDriver ad=null;

    private String port = "4723";
    private String server="0.0.0.0";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        initDriver();
    }

    public AndroidDriver getDriver(){
        return ad;
    }

    private void initDriver() throws MalformedURLException {
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        ds.setCapability("platformName", "android");
        ds.setCapability("app", "C:\\Users\\gorelov\\Desktop\\APK\\gsm.apk");
        ds.setCapability("noReset", true);
        String url = "http://" + server + ":" + port + "/wd/hub";
        try{
            System.out.println("Initialised driver eith url: " + url);
            ad = new AndroidDriver(new URL(url), ds);
        }
        catch (NullPointerException|MalformedURLException ex) {
            throw new RuntimeException("Appium Драйвер не может быть проинстализирован");
        } System.out.println("Could not iniy driver: " + ad);


//        ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown() {
        ad.quit();
    }

}
