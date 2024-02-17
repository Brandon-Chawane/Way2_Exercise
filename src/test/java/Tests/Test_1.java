package Tests;


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
    public void clickloginButton()  {
        homePage.setLoginBtn();

    }

    @Test(dependsOnMethods ="clickloginButton")
    public void clickDepositButton(){
        homePage.setDepositBtn();
    }
    @Test(dependsOnMethods = "clickDepositButton")
    public void enterDepositAmount() {
        homePage.setTxtdeposit();
    }

      @Test(dependsOnMethods = "enterDepositAmount")
    public void clickDepositBtn() {
        homePage.setDepositBtn();
    }

      @Test(dependsOnMethods = "clickDepositBtn")
    public void clickCashDepositBtn() {
        homePage.clickCashDepositBtn();
    }

      @Test(dependsOnMethods = "clickCashDepositBtn")
    public void validateSuccessfulDeposit() {
        homePage.setDepositSuccessful();
         takeScreenShot.takeSnapShot(driver, "successful deposit");
    }

       @Test(dependsOnMethods = "validateSuccessfulDeposit")
    public void logOutBtn() {
        homePage.setLogOutBtn();
    }

      @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
