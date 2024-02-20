package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_1 extends BaseClass {

    @Test
    public void clickCustomerLoginBtn() {
        homePage.setCustomerLoginbtn();
    }

    @Test(dependsOnMethods = "clickCustomerLoginBtn")
    public void selectUser() {
        homePage.setUserSelectMenu();
    }

    @Test(dependsOnMethods = "selectUser")
    public void clickloginButton() {
        homePage.setLoginBtn();

    }

    @Test(dependsOnMethods = "clickloginButton")
    public void clickDepositButton() {
        homePage.setDepositBtn();
    }

    @Test(dependsOnMethods = "clickDepositButton")
    public void depositCashAcc1() {
        homePage.setTxtdeposit();
    }

    @Test(dependsOnMethods = "depositCashAcc1")
    public void clickCashDepositBtn() {
        homePage.clickCashDepositBtn();
        takeScreenShot.takeSnapShot(driver, "01 deposit");
    }

    @Test(dependsOnMethods = "clickCashDepositBtn")
    public void validateSuccessfulDeposit() {
        homePage.setDepositSuccessful();

    }

    @Test(dependsOnMethods = "validateSuccessfulDeposit")
    public void logOutBtn() {
        homePage.setLogOutBtn();
    }


    //-----------------------Test 2------------------------------------


    @Test(dependsOnMethods = "logOutBtn")
    public void selectCustomer() {
        homePage.setUserSelectMenu();
    }

    @Test(dependsOnMethods = "selectCustomer")
    public void clickLoginButton() {
        homePage.setLoginBtn();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void clickDepositBtn2() {

        homePage.setDepositBtn();

    }

    @Test(dependsOnMethods = "clickDepositBtn2")
    public void selectAcc2() {
        homePage.setAccountSelectMenu1002();
    }


    @Test(dependsOnMethods = "selectAcc2")
    public void depositCashAcc2() {
        homePage.setTxtdeposit();

    }

    @Test(dependsOnMethods = "depositCashAcc2")
    public void clickDepositCashBtn() {
        homePage.clickCashDepositBtn();

    }

    @Test(dependsOnMethods = "clickDepositCashBtn")
    public void accountSelect1003() {
        homePage.setAccountSelectMenu1003();

    }

    @Test(dependsOnMethods = "accountSelect1003")
    public void clickDepositAcc3() {
        homePage.setDepositBtn();
    }

    @Test(dependsOnMethods = "clickDepositAcc3")
    public void depositCashAcc3() {
        homePage.setThirdAccAmountField();
    }

    @Test(dependsOnMethods = "depositCashAcc3")
    public void clickDepositCashBtn1003() {
        homePage.clickCashDepositBtn();
        takeScreenShot.takeSnapShot(driver, "03 deposit TEST 2");
    }

    @Test(dependsOnMethods = "clickDepositCashBtn1003")
    public void logOutAcc3() {
        homePage.logOutBtn.click();
    }



//----------------------------------------------------Test 3---------------------------


    @Test(dependsOnMethods = "logOutAcc3")
    public void selectAccTest3() {
        homePage.setUserSelectMenu();
    }

    @Test(dependsOnMethods = "selectAccTest3")
    public void clickLoginTest3() {
        homePage.customerLoginBtn2.click();
    }


    @Test(dependsOnMethods = "clickLoginTest3")
    public void clickDepositBtnTest3() {
        homePage.setDepositBtn();
    }


    @Test(dependsOnMethods = "clickDepositBtnTest3")
    public void enterAnotherAmount() {
        homePage.setDepositLargerAmount();
    }

    @Test(dependsOnMethods = "enterAnotherAmount")
    public void click() {
        homePage.clickCashDepositBtn();
        takeScreenShot.takeSnapShot(driver, "02 deposit TEST 2");
    }


    @Test(dependsOnMethods = "click")
    public void validateSuccessfulDeposit1() {
        homePage.validateLargeDepositSuccessful();
    }

    @Test(dependsOnMethods = "validateSuccessfulDeposit1")
    public void clickWithDrawalButton() {
        homePage.setWithDrawalButton();
    }

    @Test(dependsOnMethods = "clickWithDrawalButton")
    public void withDrawLargeAmount() {
        homePage.setWithDrawLargerAmount();
    }

    @Test(dependsOnMethods = "withDrawLargeAmount")
    public void clickWithDrawButton(){
        homePage.setWithDrawCashButton();
    }


    @Test(dependsOnMethods = "clickWithDrawalButton")
    public void stopTime() {
        takeScreenShot.takeSnapShot(driver, "Wait");

    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
