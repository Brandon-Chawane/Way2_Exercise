package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver startBrowser(String browserChoice, String url){

        WebDriver driver;

        if("chrome".equalsIgnoreCase(browserChoice)){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if("edge".equalsIgnoreCase(browserChoice)){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else{
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
