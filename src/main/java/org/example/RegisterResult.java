package org.example;

import org.openqa.selenium.By;

public class RegisterResult extends Utils
{  //RegisterResult class extends Utils class by concept of inheritance
    private By _registerResult=By.className("result");
    //Making a private variable and storing the command of selenium to get locator "by classname"
    public void getTextFromRegisterResultPage()
    {//Making void method to get text form result page
        getTextFromElement(_registerResult);
        //function to get text from website
    }
}
