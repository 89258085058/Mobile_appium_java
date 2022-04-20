package ru.stqa.pft.gsm.Activity;

import org.openqa.selenium.Dimension;

public class ScreenResolution extends Driver{
    public void getResolution(){
        Dimension dimension = ad.manage().window().getSize();
        int screenWidth = dimension.getWidth();
        int screenHeight = dimension.getHeight();
        System.out.println("Wight = "+screenWidth);
        System.out.println("Height = "+screenHeight);
    }
}
