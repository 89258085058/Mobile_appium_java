package ru.stqa.pft.gsm.Activity;

import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;

public class RotationApp  extends Driver{
    public void landscapeMode(){
        ad.rotate(ScreenOrientation.LANDSCAPE);
        ScreenOrientation orientation = ad.getOrientation();
        Assert.assertEquals(orientation.value(), "LANDSCAPE");
    }
}
