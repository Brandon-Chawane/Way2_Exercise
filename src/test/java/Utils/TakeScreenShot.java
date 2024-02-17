package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;



public class  TakeScreenShot {

    public static String screenShotdir = System.getProperty("user.dir") + "/Screenshots";

    public void takeSnapShot(WebDriver driver, String screenShotName){
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenShotdir, screenShotName+".png");

        try {
            FileUtils.copyFile(src, destination);
        }catch(IOException e){
            e.printStackTrace();
        }
    }


}
