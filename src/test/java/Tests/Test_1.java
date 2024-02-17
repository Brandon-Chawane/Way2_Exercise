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

    @Test(dependsOnMethods = "logOutBtn")
    public void clickHomeBtn(){
        homePage.setHomeBtn();
    }

    //-------------------------------------------------------------------------------
    @Test(dependsOnMethods = "clickHomeBtn")
    public void clickCustomerLoginBtn2() {
        homePage.setCustomerLoginbtn();
    }

    @Test(dependsOnMethods = "clickCustomerLoginBtn2")
    public void selectCustomer(){
        homePage.setUserSelectMenu();
    }

    @Test(dependsOnMethods = "selectCustomer")
    public void clickLoginButton(){
        homePage.setLoginBtn();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void clickDepositBtn2(){

        homePage.setDepositBtn();

    }
    @Test(dependsOnMethods = "clickDepositBtn2")
    public void depositCash(){
        homePage.setTxtdeposit();
    }

    @Test(dependsOnMethods = "depositCash")
    public void clickDepositCashBtn(){
        homePage.clickCashDepositBtn();
    }

    @Test(dependsOnMethods = "clickDepositCashBtn")
    public void accountSelect1002(){
        homePage.setAccountSelectMenu();
    }

    @Test(dependsOnMethods = "accountSelect1002")
    public void clickDepositBttn(){
        homePage.setDepositBtn();
    }

  @Test(dependsOnMethods = "clickDepositBttn")
  public void enterAnotherAmount(){
        homePage.amountSet();
  }
    @Test(dependsOnMethods = "enterAnotherAmount")
    public void click(){

        homePage.clickCashDepositBtn();

    }

    @Test(dependsOnMethods = "click")
    public void selectThirdAccount(){
        homePage.setAccountSelectMenu1();
    }

    @Test(dependsOnMethods = "selectThirdAccount")
    public void enterLastAmount(){
        homePage.amountSet();
    }


    @Test(dependsOnMethods = "enterLastAmount")
    public void clickDepositBtn4(){
        homePage.clickCashDepositBtn();
    }

    @Test(dependsOnMethods = "clickDepositBtn4")
    public void validateSuccessfulTansaction(){
        homePage.depositSuccessful.isDisplayed();
    }

    @Test(dependsOnMethods = "validateSuccessfulTansaction")
    public  void logOut(){
        homePage.setLogOutBtn();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
