package Tests;

import Pages.HomePageTest1;
import Utils.BrowserFactory;


import Utils.TakeScreenShot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BaseClass {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.way2automation.com/angularjs-protractor/banking/#/login");
    HomePageTest1 homePage = PageFactory.initElements(driver, HomePageTest1.class);

    TakeScreenShot takeScreenShot = new TakeScreenShot();


}

