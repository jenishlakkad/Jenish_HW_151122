package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    //TestSuit class extends BaseTest class by concept of inheritance
    HomePage homePage=new HomePage();
    //making homepage method to use function of homepage class

    RegisterPage registerPage=new RegisterPage();
    //making registerpage method to use function of RegisterPage class

    RegisterResult registerResult=new RegisterResult();
    //making registerresult method to use function of RegisterResult class

    @Test public void userShouldBeAbleRegister()
{

    homePage.clickOnRegisterButton();
    //calling method clickOnRegisterButton

    registerPage.registerdetails();
    //calling method registerdetails

    registerResult.getTextFromRegisterResultPage();
    //calling method getTextFromRegisterResultPage

}
}
