package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BrowserFactory {

    @BeforeTest
    public static WebDriver startBrowser(String browserChoice, String url) {

        WebDriver driver;

        if ("chrome".equalsIgnoreCase(browserChoice)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if ("edge".equalsIgnoreCase(browserChoice)) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }




    public static void fluentWait(WebDriver driver, WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver).
                withTimeout(Duration.
                        ofSeconds(10)).
                pollingEvery(Duration.
                        ofSeconds(3)).
                ignoring(WebDriverException.class);
        wait.until(ExpectedConditions.visibilityOf(element));


    }
}
