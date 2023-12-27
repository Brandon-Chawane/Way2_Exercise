package Pages;

import Tests.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {

    WebDriver driver;

    @FindBy(xpath = "//button[@class='btn home'][contains(.,'Home')]")
    WebElement homePagebtn;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void setHomePagebtn(){
        homePagebtn.click();
    }
}
