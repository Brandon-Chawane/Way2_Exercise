package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static Utils.BrowserFactory.fluentWait;

public class HomePageTest1 {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/button")
    WebElement customerLoginbtn;

    @FindBy(id = "userSelect")
    WebElement userSelectMenu;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginBtn;

    @FindBy(xpath = "//button[@ng-class='btnClass2'][contains(.,'Deposit')]")
    WebElement depositBtn;

    @FindBy(xpath = "//input[contains(@class,'form-control ng-pristine ng-untouched ng-invalid ng-invalid-required')]")
    WebElement txtdeposit;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[4]/div/form/button")
    WebElement cashDepositbtn;

    @FindBy(xpath = "//span[@class='error ng-binding'][contains(.,'Deposit Successful')]")
    WebElement depositSuccessful;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOutBtn;



    public HomePageTest1(WebDriver driver) {
        this.driver = driver;
    }

    public void setCustomerLoginbtn() {
        try {
            fluentWait(driver, customerLoginbtn);
            customerLoginbtn.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void setUserSelectMenu() {
        try {
            fluentWait(driver, userSelectMenu);
            Select userSelect = new Select(userSelectMenu);
            userSelect.selectByVisibleText("Hermoine Granger");
        } catch (Exception e) {
            throw new RuntimeException(e + "Not found");

        }

    }

    public void setLoginBtn() {
        try{
            fluentWait(driver, loginBtn);
            loginBtn.click();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void setDepositBtn(){
        try{
            fluentWait(driver, depositBtn);
            depositBtn.click();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public void setTxtdeposit(){
        try{
            fluentWait(driver, txtdeposit);
            txtdeposit.sendKeys("1500");
        }catch(Exception e){
            throw  new RuntimeException(e);
        }

    }

    public void clickCashDepositBtn(){
        try {
            fluentWait(driver, cashDepositbtn);
            cashDepositbtn.click();
        }catch (Exception e){
            throw  new RuntimeException(e);
        }


    }

    public void setDepositSuccessful(){
        try{
            depositSuccessful.isDisplayed();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    public void setLogOutBtn(){
        try {
            fluentWait(driver,logOutBtn);
            logOutBtn.click();
        }catch(Exception e){
            throw  new RuntimeException(e);
        }
    }
}
