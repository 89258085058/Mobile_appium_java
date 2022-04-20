package ru.stqa.pft.gsm.Activity;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class SwipingAndScrolling extends Driver{

    public void HorizontalsWIPE() throws InterruptedException {
        MobileElement activeScreen = (MobileElement) ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View"));

        Dimension dimension = activeScreen.getSize();
        int horizontal = activeScreen.getSize().getHeight()/2;



        Double startSwipe = dimension.getWidth()*0.9;
        int verticalStsrt = startSwipe.intValue();

        Double stopSwipe = dimension.getWidth()*0.1;
        int verticalStpo = stopSwipe.intValue();


        new TouchAction(ad)
                .press(PointOption.point(verticalStsrt,horizontal))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(verticalStpo,horizontal))
                .release().perform();
        Thread.sleep(3000);


    }


    public void verticatSwipe() throws InterruptedException {
        MobileElement activeScreen = (MobileElement) ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View"));

        Dimension dimension = activeScreen.getSize();
        int horizontal = activeScreen.getSize().getWidth()/2;



        Double startSwipe = dimension.getHeight()*0.5;
        int verticalStart = startSwipe.intValue();

        Double stopSwipe = dimension.getHeight()*0.2;
        int verticalStop = stopSwipe.intValue();


        new TouchAction(ad)
                .press(PointOption.point(horizontal,verticalStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(horizontal,verticalStop))
                .release().perform();
        Thread.sleep(3000);

    }

    public void SwipeToElement() throws InterruptedException {

        Dimension dimension = ad.manage().window().getSize();

        while (ad.findElements(By.xpath("//*[@class='android.widget.Button' and @index='9']")).size()==0){
            Double startSwipe = dimension.getHeight()*0.5;
            int verticalStart = startSwipe.intValue();

            Double stopSwipe = dimension.getHeight()*0.2;
            int verticalStop = stopSwipe.intValue();


            new TouchAction(ad)
                    .press(PointOption.point(0,verticalStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0,verticalStop))
                    .release().perform();
        }
        Thread.sleep(3000);
    }

    public void scrollToElement(String text_to_scroll) throws InterruptedException {
        MobileElement mb = (MobileElement)ad.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scroll(true))" +
                        ".scrollIntoView(new UiSelector().text(" + text_to_scroll + "))"));
        mb.click();
        Thread.sleep(3000);

    }
}
