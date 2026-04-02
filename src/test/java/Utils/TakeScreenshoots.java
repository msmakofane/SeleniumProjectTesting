package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshoots {

    private static final String screenshotDir = System.getProperty("user.dir") + "/Screenshots";

    public void takeSnapShots(WebDriver driver, String screenShotName){


        TakesScreenshot takeScreenshoot = (TakesScreenshot) driver;//Take screenshot

        File scr = takeScreenshoot.getScreenshotAs(OutputType.FILE);//Capture the screen

        File destination = new File(screenshotDir, screenShotName + ".jpeg");//Store on the directory on a folder named screenshotDir

        try{
            FileUtils.copyFile(scr,destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
