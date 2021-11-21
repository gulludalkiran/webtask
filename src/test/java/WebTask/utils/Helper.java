package WebTask.utils;

import org.openqa.selenium.By;

public class Helper {

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clinkWithLinkText(String linkText){
        Driver.get().findElement(By.linkText(linkText)).click();
    }
    public static void clinkWithCss(String css){
        Driver.get().findElement(By.cssSelector(css)).click();
    }
}
