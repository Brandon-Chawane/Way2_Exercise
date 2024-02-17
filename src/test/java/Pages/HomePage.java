package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static Utils.BrowserFactory.fluentWait;


public class HomePage {

    WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[4]/div/form/div/input")
    WebElement amountField;
    @FindBy(xpath = "//button[@class='btn home'][contains(.,'Home')]")
    public WebElement homeBtn;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg'][contains(.,'Customer Login')]")
    public WebElement customerLoginbtn;

    @FindBy(xpath = "//select[contains(@id,'userSelect')]")
    public WebElement userSelectMenu;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement loginBtn;

    @FindBy(xpath = "//button[@ng-class='btnClass2'][contains(.,'Deposit')]")
    public WebElement depositBtn;

    @FindBy(xpath = "//input[contains(@class,'form-control ng-pristine ng-untouched ng-invalid ng-invalid-required')]")
    public WebElement txtdeposit;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[4]/div/form/button")
    public WebElement cashDepositbtn;

    @FindBy(xpath = "//span[@class='error ng-binding'][contains(.,'Deposit Successful')]")
    public WebElement depositSuccessful;


    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    public WebElement logOutBtn;

    @FindBy(id = "accountSelect")
    WebElement accountSelect;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void setHomeBtn() {
        try {
            fluentWait(driver, homeBtn);
            homeBtn.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
        try {
            fluentWait(driver, loginBtn);
            loginBtn.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void setDepositBtn() {
        try {
            fluentWait(driver, depositBtn);
            depositBtn.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void setTxtdeposit() {
        try {
            fluentWait(driver, txtdeposit);
            txtdeposit.sendKeys("1500");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void setClearDeposit() {

    }

    public void setDepositLargerAmount() {
        fluentWait(driver, txtdeposit);
        txtdeposit.sendKeys("31459");
    }

    public void setWithDrawLargerAmount() {
        try {
            fluentWait(driver, txtdeposit);
            txtdeposit.sendKeys("-31459");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public void clickCashDepositBtn() {
        try {
            fluentWait(driver, cashDepositbtn);
            cashDepositbtn.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public void setDepositSuccessful() {
        try {
            depositSuccessful.isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void setLogOutBtn() {
        try {
            fluentWait(driver, logOutBtn);
            logOutBtn.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void setAccountSelectMenu() {
        try {
            fluentWait(driver, accountSelect);
            Select userSelect = new Select(accountSelect);
            userSelect.selectByVisibleText("1002");
        } catch (Exception e) {
            throw new RuntimeException(e + "Not found");

        }

    }

    public void setAccountSelectMenu1() {
        try {
            fluentWait(driver, accountSelect);
            Select userSelect = new Select(accountSelect);
            userSelect.selectByVisibleText("1003");
        } catch (Exception e) {
            throw new RuntimeException(e + "Not found");

        }

    }



    public void amountSet() {
        try {
            fluentWait(driver,amountField);
            amountField.clear();
            amountField.sendKeys("1500");
        }catch (Exception e){
            throw  new RuntimeException(e);
        }

    }
}
