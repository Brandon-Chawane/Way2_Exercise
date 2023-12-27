package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = BrowserFactory.startBrowser("edge", "https://www.way2automation.com/angularjs-protractor/banking/#/login");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    TakesScreenshot takesScreenshot = new TakesScreenshot() {
        @Override
        public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
            return null;
        }
    };
}
