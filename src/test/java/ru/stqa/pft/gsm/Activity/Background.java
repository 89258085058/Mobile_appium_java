package ru.stqa.pft.gsm.Activity;

import java.time.Duration;

public class Background extends Driver{
    public void goToBackgroundApp(int seconds){
        ad.runAppInBackground(Duration.ofSeconds(seconds));
        ad.launchApp();
    }
}
